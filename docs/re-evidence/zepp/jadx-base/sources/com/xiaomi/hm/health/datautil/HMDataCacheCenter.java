package com.xiaomi.hm.health.datautil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.app.restheartrate.service.api.MaxHeartApi;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.ecg.EcgDataRepo;
import com.huami.message.db.MessageDb;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.sleepassistant.lib.service.SleepServiceKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.health.synctime.HealthDataSyncTime;
import com.xiaomi.hm.health.device.sport.OriginSportData;
import com.xiaomi.hm.health.device.webapi.earbud.DownloadEarbudHealthDataCallback;
import com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi;
import com.xiaomi.hm.health.device.webapi.sport.DownloadSummaryAllSuccessedListner;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import com.xiaomi.hm.health.eventbus.EventBandDataDownloadFinished;
import com.xiaomi.hm.health.eventbus.EventBandSummaryAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventEarbudSummaryAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventHWBandAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventMaxStepsAndRecentReachGoalsAnalysisFinishJob;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventTodaySportAnalysisJobFinished;
import com.xiaomi.hm.health.healthdata.bp.BloodPressureHelper;
import com.xiaomi.hm.health.jobcenter.job.HMCompareModelInjectJob;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HMSportDataPostToServerJob;
import com.xiaomi.hm.health.jobcenter.job.HMSummeryDataInitAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HMThirdPartyDataProcessJob;
import com.xiaomi.hm.health.jobcenter.job.HMTotalDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HmAfppgPostToServerJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudDataAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudSummaryDataInitAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudSummaryDataUpdateAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmMixSummaryAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmMixSummarySwitchJob;
import com.xiaomi.hm.health.jobcenter.job.HmSleepSelectInitJob;
import com.xiaomi.hm.health.keeper.BandSyncedStatusHelper;
import com.xiaomi.hm.health.keeper.EarbudSyncedStatusHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.SyncedStatusHelper;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.model.summery.Steps;
import com.xiaomi.hm.health.privacy.AnonymousManager;
import com.xiaomi.hm.health.sleep.notify.SleepNotificationManager;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.temperature.TempUseCaseUtils;
import com.xiaomi.hm.health.thirdbind.ThirdAuthManager;
import com.xiaomi.hm.health.traininglib.TrainingLib;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.watchfacestore.WatchFaceHelper;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xmlywind.sdk.common.Constants;
import de.greenrobot.event.EventBus;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@SuppressLint({"NewApi"})
public class HMDataCacheCenter {
    private static final int ALGORITHM_TIME_OFFSET = 78;
    private static final String TAG = "HMDataCacheCenter";
    private static final int TIME_INTERNAL = 180000;
    private final BandUnit mBandUint;
    private Context mContext;
    private final EarbudUnit mEarbudUnit;
    private static final CopyOnWriteArrayList<HMSummery> mBandDaySummeryArrayList = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<HMSummery> mEarbudSummeryArrayList = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList = new CopyOnWriteArrayList<>();
    private static HMDataCacheCenter instance = null;
    private static Lazy<MaxHeartApi> maxHeartApi = KoinJavaComponent.inject(MaxHeartApi.class);
    private DaySportData mRecentSleepSportData = null;
    private DaySportData mRecentStepSportData = null;
    private DaySportData mEarbudRecentSleepSportData = null;
    private DaySportData mTodaySportData = new DaySportData(SportDay.getToday());
    private DaySportData mEarbudTodaySportData = new DaySportData(SportDay.getToday());
    private SportDay startDayLoadOriginDatas = null;
    private SportDay earbudStartDayLoadOriginDatas = null;
    private long loadNetDataTime = 0;
    private long checkNetDataTime = 0;

    public class BandUnit implements DownloadSummaryAllSuccessedListner {
        private final ReentrantLock lock = new ReentrantLock();
        private String mWatchRtsDate = null;
        private int mWatchRts = 0;
        private int mWatchRtCal = 0;
        private int mWatchRtDis = 0;
        private SyncedStatusHelper syncedStatusHelper = new BandSyncedStatusHelper();

        public BandUnit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void analysisNewDSD(DaySportData dsd, int type) {
            new HMDataAnalisisJob(dsd, type, HMDeviceType.MILI.getValue()).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HMSummery getRecentStepSummary() {
            Steps steps;
            if (HMDataCacheCenter.mBandDaySummeryArrayList.isEmpty()) {
                return null;
            }
            for (int size = HMDataCacheCenter.mBandDaySummeryArrayList.size() - 1; size >= 0; size--) {
                HMSummery hMSummery = (HMSummery) HMDataCacheCenter.mBandDaySummeryArrayList.get(size);
                if (hMSummery != null && (steps = hMSummery.steps) != null && steps.dis > 0) {
                    return hMSummery;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$timeInZeroAndOneClock$0(DaySportData daySportData, int i) {
            return "timeInZeroAndOneClock date = " + daySportData.sportDay.getKey() + ";minuteCur = " + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$timeInZeroAndOneClock$1(SportDay sportDay) {
            return "timeInZeroAndOneClock beforeSynOneDaySd = " + sportDay;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadAllBraceletNetDataNew() {
            if (NetUtil.isNetworkConnected(HMDataCacheCenter.this.mContext)) {
                HMDataCacheCenter.this.startDayLoadOriginDatas = SportDay.fromString(HMDateUtil.getMonthStart(-1));
                HMSportWebAPI.getAllSportDataResult(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadPartialBraceletNetData(final String startDate, final String endDate, final boolean isFirstStart) {
            HMLog.i(HMDataCacheCenter.TAG, "loadPartialBraceletNetData start 分段加载data节点数据", new Object[0]);
            if (NetUtil.isNetworkConnected(HMDataCacheCenter.this.mContext)) {
                HMDataCacheCenter.this.startDayLoadOriginDatas = null;
                HMSportWebAPI.getPartialSportDataResult(startDate, endDate, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.datautil.HMDataCacheCenter.BandUnit.1
                    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                    public void onCancel(int type) {
                    }

                    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                    public void onCompleted() {
                    }

                    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                    public void onError(Throwable throwable) {
                        throwable.printStackTrace();
                        BandUnit bandUnit = BandUnit.this;
                        HMDataCacheCenter.this.startDayLoadOriginDatas = SportDay.fromString(bandUnit.syncedStatusHelper.getOriginDataStartDate());
                        HMLog.i(HMDataCacheCenter.TAG, "onError :" + throwable.getMessage(), new Object[0]);
                    }

                    @Override // com.huami.network.base.handler.IHMHttpResponseHandler
                    public void onItem(HMHttpResponseData item) {
                        boolean zIsLocked;
                        int i;
                        try {
                            JSONObject jSONObject = new JSONObject(new String(item.getResponseBody()));
                            String strOptString = jSONObject.optString("code");
                            if (!"1".equals(strOptString)) {
                                HMLog.i(HMDataCacheCenter.TAG, "device sync invalid code : " + strOptString, new Object[0]);
                                if (zIsLocked) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            BandUnit.this.lock.lock();
                            HMDataCacheCenter.this.startDayLoadOriginDatas = SportDay.fromString(startDate);
                            BandUnit.this.syncedStatusHelper.setOriginDataStartDate(HMDataCacheCenter.this.startDayLoadOriginDatas.getKey());
                            BandUnit.this.syncedStatusHelper.save();
                            JSONArray jSONArray = jSONObject.getJSONArray("data");
                            int length = jSONArray.length();
                            boolean z = true;
                            if (length > 0) {
                                ArrayList arrayList = new ArrayList();
                                int i2 = 0;
                                while (true) {
                                    i = length - 1;
                                    if (i2 >= i) {
                                        break;
                                    }
                                    try {
                                        arrayList.add(BandUnit.this.parseNetDateData(jSONArray.getJSONObject(i2), HMDeviceType.MILI.getValue()));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        HMLog.i(HMDataCacheCenter.TAG, "解析json失败,有无效数据!!!~~~~~~~~~~~", new Object[0]);
                                    }
                                    i2++;
                                }
                                HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(arrayList);
                                if (isFirstStart) {
                                    HMLog.i(HMDataCacheCenter.TAG, "net端最后一天，尝试去merge数据 是否为第一段数据\u3000", new Object[0]);
                                    BandUnit bandUnit = BandUnit.this;
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                                    DateData netDateData = bandUnit.parseNetDateData(jSONObject2, hMDeviceType.getValue());
                                    DaySportData dSDFromData = BandUnit.this.parseDSDFromData(new DaySportData(SportDay.fromString(netDateData.getDate())), netDateData);
                                    DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(netDateData.getDate());
                                    if (specifyDayData == null || specifyDayData.getData() == null) {
                                        HMLog.i(HMDataCacheCenter.TAG, "=================== local db is null ,add now data " + netDateData.getDate(), new Object[0]);
                                        HMDaoManager.getInstance().getDateDataDao().insertOrReplace(netDateData);
                                        z = false;
                                    } else {
                                        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                                        if (originSportDataJsonToSportData == null || originSportDataJsonToSportData.getData() == null || originSportDataJsonToSportData.getData().length <= 0) {
                                            HMLog.i(HMDataCacheCenter.TAG, "local db is  not null ,but byte is not valid " + netDateData.getDate(), new Object[0]);
                                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dSDFromData.getBinaryData(), "", -1));
                                            z = false;
                                        } else {
                                            HMLog.i(HMDataCacheCenter.TAG, "local db is not null,and start merge " + specifyDayData.getDate(), new Object[0]);
                                            dSDFromData.merge(BandUnit.this.parseDSDFromData(new DaySportData(SportDay.fromString(netDateData.getDate())), specifyDayData));
                                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dSDFromData.getBinaryData(), "", -1));
                                            specifyDayData.setSync(0);
                                        }
                                        if (netDateData.getData_hr() != null && netDateData.getData_hr().length > 0) {
                                            HMLog.i(HMDataCacheCenter.TAG, " hr merge ,but db is not null", new Object[0]);
                                            if (specifyDayData.getData_hr() == null || specifyDayData.getData_hr().length <= 0) {
                                                specifyDayData.setData_hr(netDateData.getData_hr());
                                            } else {
                                                specifyDayData.setData_hr(dSDFromData.getBinaryHRData(specifyDayData.getData_hr()));
                                            }
                                        }
                                        if (specifyDayData.getSource() == null || specifyDayData.getSource().intValue() == HMDeviceSource.VDEVICE.getValue()) {
                                            specifyDayData.setSource(netDateData.getSource());
                                        }
                                        HMDaoManager.getInstance().getDateDataDao().insertOrReplace(specifyDayData);
                                    }
                                    BandUnit.this.initSummeryDatas(0, 4);
                                    BandUnit.this.syncedStatusHelper.setDataState(2);
                                    BandUnit.this.syncedStatusHelper.save();
                                    if (z) {
                                        HMLog.i(HMDataCacheCenter.TAG, "网络端有合并数据，需要重新算法分析并上传数据", new Object[0]);
                                        if (dSDFromData.getSportDay().isToday()) {
                                            new HMDataAnalisisJob(dSDFromData, 2, hMDeviceType.getValue()).start();
                                        } else {
                                            BandUnit bandUnit2 = BandUnit.this;
                                            bandUnit2.analysisNewDSD(HMDataCacheCenter.this.mTodaySportData, 0);
                                            new HMDataAnalisisJob(dSDFromData, 2, hMDeviceType.getValue()).start();
                                        }
                                        BandUnit.this.updateSummaryByDay(dSDFromData.getSportDay());
                                    } else {
                                        BandUnit bandUnit3 = BandUnit.this;
                                        bandUnit3.analysisNewDSD(HMDataCacheCenter.this.mTodaySportData, 0);
                                    }
                                    EventBus.getDefault().post(new EventBandDataDownloadFinished());
                                } else {
                                    HMLog.i(HMDataCacheCenter.TAG, "net端最后一天，尝试去merge数据 是否为第一段数据\u3000", new Object[0]);
                                    HMDaoManager.getInstance().getDateDataDao().insertOrReplace(BandUnit.this.parseNetDateData(jSONArray.getJSONObject(i), HMDeviceType.MILI.getValue()));
                                }
                            } else {
                                HMLog.i(HMDataCacheCenter.TAG, "没有下载到数据！！！！！", new Object[0]);
                                if (isFirstStart) {
                                    BandUnit.this.syncedStatusHelper.setDataState(1);
                                    BandUnit.this.syncedStatusHelper.save();
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            HMLog.i(HMDataCacheCenter.TAG, "err : " + e2.getMessage(), new Object[0]);
                        } finally {
                            if (BandUnit.this.lock.isLocked()) {
                                BandUnit.this.lock.unlock();
                            }
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadRecentDataBytesData(final String startDate, final String endDate, final boolean isSleep) {
            HMSportWebAPI.getPartialSportDataResult(startDate, endDate, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.datautil.HMDataCacheCenter.BandUnit.3
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCancel(int type) {
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCompleted() {
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onError(Throwable throwable) {
                    throwable.printStackTrace();
                }

                @Override // com.huami.network.base.handler.IHMHttpResponseHandler
                public void onItem(HMHttpResponseData item) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(item.getResponseBody(), StandardCharsets.UTF_8));
                        String strOptString = jSONObject.optString("code");
                        if (!"1".equals(strOptString)) {
                            HMLog.i(HMDataCacheCenter.TAG, "device sync invalid code : " + strOptString, new Object[0]);
                            return;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        int length = jSONArray.length();
                        if (length > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < length - 1; i++) {
                                try {
                                    arrayList.add(BandUnit.this.parseNetDateData(jSONArray.getJSONObject(i), HMDeviceType.MILI.getValue()));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    HMLog.i(HMDataCacheCenter.TAG, "解析json失败,有无效数据!!!~~~~~~~~~~~", new Object[0]);
                                }
                            }
                            HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(arrayList);
                            HMLog.i(HMDataCacheCenter.TAG, "同步数据成功,下载data节点数据为: " + length, new Object[0]);
                            if (isSleep) {
                                BandUnit bandUnit = BandUnit.this;
                                bandUnit.analysisNewDSD(HMDataCacheCenter.this.mRecentSleepSportData, 3);
                            } else {
                                BandUnit bandUnit2 = BandUnit.this;
                                bandUnit2.analysisNewDSD(HMDataCacheCenter.this.mRecentStepSportData, 3);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        HMLog.i(HMDataCacheCenter.TAG, "err : " + e2.getMessage(), new Object[0]);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DateData parseNetDateData(JSONObject obj, int type) {
            DateData dateData = new DateData();
            dateData.setDate(obj.optString("date_time"));
            dateData.setSummary(new String(Base64.decode(obj.optString("summary"), 2), StandardCharsets.UTF_8));
            dateData.setType(Integer.valueOf(type));
            dateData.setSync(1);
            dateData.setSync_qqhealth(1);
            if (!obj.isNull("source")) {
                String strOptString = obj.optString("source");
                if (!TextUtils.isEmpty(strOptString)) {
                    dateData.setSource(Integer.valueOf(strOptString));
                }
            }
            if (!obj.isNull("data")) {
                dateData.setData(OriginSportData.netSportDataStringToJson(obj.optString("data")));
            }
            if (!obj.isNull("data_hr")) {
                dateData.setData_hr(Base64.decode(obj.optString("data_hr"), 2));
            }
            if (!obj.isNull("summary_hr")) {
                dateData.setSummary_hr(obj.optString("summary_hr"));
            }
            return dateData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void refreshRealTimeSteps(String sum) {
            try {
                JSONObject jSONObject = new JSONObject(sum).getJSONObject(StepsInfo.KEY_STEP_INFO);
                this.mWatchRts = jSONObject.optInt("ttl");
                this.mWatchRtCal = jSONObject.optInt("cal");
                this.mWatchRtDis = jSONObject.optInt("dis");
                this.mWatchRtsDate = SportDay.getToday().getKey();
                EventBus.getDefault().post(new HMDeviceRealtimeStepEvent(HMDeviceType.WATCH, getmWatchRts()));
            } catch (Exception e) {
                HMLog.e(HMDataCacheCenter.TAG, "refreshRealTimeSteps parse error " + e.getMessage(), new Object[0]);
            }
        }

        private String timeInZeroAndOneClock(final DaySportData firstDsd) {
            if (firstDsd.data() != null && !firstDsd.data().isEmpty()) {
                final int timeIndex = firstDsd.data().get(0).getTimeIndex();
                HMLog.info(HMDataCacheCenter.TAG, new Function0() { // from class: xr2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDataCacheCenter.BandUnit.lambda$timeInZeroAndOneClock$0(firstDsd, timeIndex);
                    }
                });
                if (timeIndex >= 0 && timeIndex <= 78) {
                    final SportDay sportDayAddDay = firstDsd.sportDay.addDay(-1);
                    HMLog.info(HMDataCacheCenter.TAG, new Function0() { // from class: yr2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMDataCacheCenter.BandUnit.lambda$timeInZeroAndOneClock$1(sportDayAddDay);
                        }
                    });
                    return sportDayAddDay.getKey();
                }
            }
            return null;
        }

        public synchronized void analysisNewDSDFromBand(List<DaySportData> dsdList, int deviceType, HMDeviceSource deviceSource, String deviceId) {
            HMLog.i(HMDataCacheCenter.TAG, "analysisNewDSDFromBand start", new Object[0]);
            if (dsdList != null && !dsdList.isEmpty()) {
                this.lock.lock();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i = 0; i < dsdList.size(); i++) {
                    DaySportData daySportData = dsdList.get(i);
                    String key = daySportData.getSportDay().getKey();
                    DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(key);
                    if (specifyDayData == null || specifyDayData.getData() == null) {
                        HMLog.i(HMDataCacheCenter.TAG, "************ analysisNewDSDFromBand db is  null ,add now data ************" + key, new Object[0]);
                        DateData dateData = new DateData();
                        dateData.setDate(daySportData.getKey());
                        dateData.setData(OriginSportData.sportDataBytesToJson(daySportData.getBinaryData(), deviceId, deviceSource.getValue()));
                        dateData.setSync(0);
                        if (ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S, deviceSource)) {
                            HMDataCacheCenter.printHrData("before merge memory hr", daySportData.getBinaryHRDataOrigin());
                            byte[] binaryHRData = daySportData.getBinaryHRData(null);
                            HMDataCacheCenter.printHrData("after merge database hr", binaryHRData);
                            dateData.setData_hr(binaryHRData);
                        }
                        arrayList.add(dateData);
                    } else {
                        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                        if (originSportDataJsonToSportData == null || originSportDataJsonToSportData.getData() == null || originSportDataJsonToSportData.getData().length <= 0) {
                            HMLog.i(HMDataCacheCenter.TAG, "analysisNewDSDFromBand db is  not null ,but byte is not valid " + key, new Object[0]);
                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(daySportData.getBinaryData(), deviceId, deviceSource.getValue()));
                            specifyDayData.setSync(0);
                        } else {
                            HMLog.i(HMDataCacheCenter.TAG, " analysisNewDSDFromBand db is not null,and start merge " + key, new Object[0]);
                            DaySportData dSDFromData = parseDSDFromData(new DaySportData(SportDay.fromString(key)), specifyDayData);
                            dSDFromData.merge(daySportData);
                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dSDFromData.getBinaryData(), deviceId, deviceSource.getValue()));
                            specifyDayData.setSync(0);
                        }
                        if (ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S, deviceSource)) {
                            if (specifyDayData.getData_hr() == null || specifyDayData.getData_hr().length <= 0) {
                                HMLog.i(HMDataCacheCenter.TAG, " hr merge ,but db is null " + key, new Object[0]);
                                HMDataCacheCenter.printHrData("before merge memory hr", daySportData.getBinaryHRDataOrigin());
                                byte[] binaryHRData2 = daySportData.getBinaryHRData(null);
                                HMDataCacheCenter.printHrData("after merge database hr", binaryHRData2);
                                specifyDayData.setData_hr(binaryHRData2);
                            } else {
                                HMLog.i(HMDataCacheCenter.TAG, " hr merge ,but db is not null " + key, new Object[0]);
                                HMDataCacheCenter.printHrData("before merge database hr", specifyDayData.getData_hr());
                                HMDataCacheCenter.printHrData("before merge memory hr", daySportData.getBinaryHRDataOrigin());
                                byte[] binaryHRData3 = daySportData.getBinaryHRData(specifyDayData.getData_hr());
                                HMDataCacheCenter.printHrData("after merge database hr", binaryHRData3);
                                specifyDayData.setData_hr(binaryHRData3);
                            }
                        }
                        arrayList.add(specifyDayData);
                    }
                    if (!z && daySportData.getSportDay().offsetDay(HMDataCacheCenter.this.mTodaySportData.getSportDay()) > 0) {
                        HMLog.i(HMDataCacheCenter.TAG, "同步数据有新的天数记录，缓存重新加载\u3000：\u3000old mTodaySportData.getSportDay()  = " + HMDataCacheCenter.this.mTodaySportData.getSportDay().getKey() + ";new today = " + SportDay.getToday().getKey(), new Object[0]);
                        z = true;
                    }
                }
                if (arrayList.isEmpty()) {
                    HMLog.i(HMDataCacheCenter.TAG, "没有需要分析的数据，直接返回", new Object[0]);
                    return;
                }
                HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(arrayList);
                if (this.lock.isLocked()) {
                    this.lock.unlock();
                }
                for (int i2 = 0; i2 < dsdList.size(); i2++) {
                    new HMDataAnalisisJob(new DaySportData(dsdList.get(i2).getSportDay()), 1, deviceType).start();
                }
                String strTimeInZeroAndOneClock = timeInZeroAndOneClock(dsdList.get(0));
                if (strTimeInZeroAndOneClock != null) {
                    new HMDataAnalisisJob(strTimeInZeroAndOneClock, 1, deviceType, 1).start();
                }
                if (z) {
                    HMLog.i(HMDataCacheCenter.TAG, "同步数据有新的天数记录，缓存重新加载", new Object[0]);
                    HMDataCacheCenter.this.mTodaySportData.getSportDay().setKey(SportDay.getToday().getKey());
                    HMDataCacheCenter.this.mTodaySportData.clear();
                    HMDataCacheCenter.this.mRecentSleepSportData = null;
                    HMDataCacheCenter.this.mRecentStepSportData = null;
                    initSummeryDatas(0, 4);
                } else {
                    HMLog.i(HMDataCacheCenter.TAG, "同步数据没有新的天数记录，统计更新即可", new Object[0]);
                    new HmEarbudSummaryDataUpdateAnalysisJob((CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mEarbudSummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mBandDaySummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mDaySummeryArrayList, (CopyOnWriteArrayList<HMWeekSummery>) HMDataCacheCenter.mWeekSummeryArrayList, (CopyOnWriteArrayList<HMMonthSummery>) HMDataCacheCenter.mMonthSummeryArrayList, dsdList).start();
                }
                new HMSportDataPostToServerJob().start();
                return;
            }
            HMLog.i(HMDataCacheCenter.TAG, "empty list return **********************************", new Object[0]);
        }

        public synchronized void checkDateDataDownloadStatus(SportDay day) {
            DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(day.getKey());
            DateData specifyDayData2 = HMBraceletDateDataUtil.getSpecifyDayData(day.getPreDay().getKey());
            if (specifyDayData == null && specifyDayData2 == null) {
                HMLog.v(HMDataCacheCenter.TAG, "band curDateData and preDateData is null , no need sync cloud.", new Object[0]);
                return;
            }
            boolean z = true;
            boolean z2 = specifyDayData == null || !TextUtils.isEmpty(specifyDayData.getData());
            if (specifyDayData2 != null && TextUtils.isEmpty(specifyDayData2.getData())) {
                z = false;
            }
            if (z2 && z) {
                HMLog.v(HMDataCacheCenter.TAG, "band curDateData and preDateData data is not null , no need sync cloud.", new Object[0]);
                return;
            }
            String key = day.getPreDay().getKey();
            String key2 = day.getKey();
            if (z2) {
                key2 = key;
            }
            if (z) {
                key = key2;
            }
            HMLog.v(HMDataCacheCenter.TAG, "load dateData from : " + key + " to " + key2, new Object[0]);
            HMDataCacheCenter.this.mBandUint.loadPartialBraceletNetData(key, key2, false);
        }

        @Override // com.xiaomi.hm.health.device.webapi.sport.DownloadSummaryAllSuccessedListner
        public void downloadAllSummaryOk(boolean isOk, ArrayList<DateData> dateDatas) {
            int i;
            if (!isOk || dateDatas == null) {
                HMLog.i(HMDataCacheCenter.TAG, "downloadAllSummaryOk failed " + isOk, new Object[0]);
                return;
            }
            if (dateDatas.isEmpty()) {
                this.syncedStatusHelper.setDataState(1);
                this.syncedStatusHelper.save();
                return;
            }
            int size = dateDatas.size();
            HMLog.i(HMDataCacheCenter.TAG, "download net date = " + dateDatas.get(0).getDate() + "~~~" + dateDatas.get(size - 1).getDate(), new Object[0]);
            List<DateData> list = HMDaoManager.getInstance().getDateDataDao().queryBuilder().orderDesc(DateDataDao.Properties.Date).list();
            if (list == null || list.isEmpty()) {
                HMLog.i(HMDataCacheCenter.TAG, "本地数据为空，全部插入summary", new Object[0]);
                i = 0;
            } else {
                HMLog.i(HMDataCacheCenter.TAG, "本地数据不空\u3000in db dbDatas = " + list.size(), new Object[0]);
                i = 2;
            }
            HMLog.i(HMDataCacheCenter.TAG, "in HMHttpResponseData  listSize = " + size, new Object[0]);
            if (i > 0) {
                if (size <= i) {
                    dateDatas.clear();
                } else if (list.size() > 1) {
                    DateData dateData = list.get(0);
                    DateData dateData2 = list.get(1);
                    Iterator<DateData> it2 = dateDatas.iterator();
                    while (it2.hasNext()) {
                        DateData next = it2.next();
                        if (next.getDate().equals(dateData.getDate())) {
                            dateData.setSummary(next.getSummary());
                            HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(dateData);
                            it2.remove();
                        }
                        if (next.getDate().equals(dateData2.getDate())) {
                            dateData2.setSummary(next.getSummary());
                            HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(dateData2);
                            it2.remove();
                        }
                    }
                } else if (list.size() == 1) {
                    DateData dateData3 = list.get(0);
                    Iterator<DateData> it3 = dateDatas.iterator();
                    while (it3.hasNext()) {
                        DateData next2 = it3.next();
                        if (next2.getDate().equals(dateData3.getDate())) {
                            dateData3.setSummary(next2.getSummary());
                            HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(dateData3);
                            it3.remove();
                        }
                    }
                }
            }
            if (!dateDatas.isEmpty()) {
                HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(dateDatas);
                ArrayList arrayList = new ArrayList();
                Iterator<DateData> it4 = dateDatas.iterator();
                while (it4.hasNext()) {
                    arrayList.add(it4.next().getSummary());
                }
                ((MaxHeartApi) HMDataCacheCenter.maxHeartApi.getValue()).parseAndSaveMaxHeartFromSummary(arrayList);
            }
            HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
            new HmSleepSelectInitJob(hmEarbudDateDataUtil.getBandSleepInfos(), hmEarbudDateDataUtil.getBandSelectDays(), false).start();
            initSummeryDatas(1, 4);
            SportDataManager.getInstance().init();
        }

        public HMSummery getRecentSleepSummary() {
            Sleep sleep;
            if (HMDataCacheCenter.mBandDaySummeryArrayList.isEmpty()) {
                return null;
            }
            for (int size = HMDataCacheCenter.mBandDaySummeryArrayList.size() - 1; size >= 0; size--) {
                HMSummery hMSummery = (HMSummery) HMDataCacheCenter.mBandDaySummeryArrayList.get(size);
                if (hMSummery != null && (sleep = hMSummery.sleep) != null && sleep.ed > sleep.st) {
                    return hMSummery;
                }
            }
            return null;
        }

        public HMSummery getSpecifyDaySummary(String date) {
            for (HMSummery hMSummery : HMDataCacheCenter.mBandDaySummeryArrayList) {
                if (date.equals(hMSummery.date)) {
                    return hMSummery;
                }
            }
            return null;
        }

        public SyncedStatusHelper getSyncedStatusHelper() {
            return this.syncedStatusHelper;
        }

        public CopyOnWriteArrayList<HMSummery> getmDaySummeryArrayList() {
            return HMDataCacheCenter.mDaySummeryArrayList;
        }

        public CopyOnWriteArrayList<HMMonthSummery> getmMonthSummeryArrayList() {
            return HMDataCacheCenter.mMonthSummeryArrayList;
        }

        public RealtimeStep getmWatchRts() {
            if (TextUtils.isEmpty(this.mWatchRtsDate) || !SportDay.fromString(this.mWatchRtsDate).isToday()) {
                return null;
            }
            RealtimeStep realtimeStep = new RealtimeStep(this.mWatchRts);
            realtimeStep.setIsSupportStepExtra(true);
            realtimeStep.setTotalCal(this.mWatchRtCal);
            realtimeStep.setTotalDis(this.mWatchRtDis);
            return realtimeStep;
        }

        public CopyOnWriteArrayList<HMWeekSummery> getmWeekSummeryArrayList() {
            return HMDataCacheCenter.mWeekSummeryArrayList;
        }

        public void initSummeryDatas(int type, int workType) {
            new HMSummeryDataInitAnalisisJob(HMDataCacheCenter.mBandDaySummeryArrayList, type, workType).start();
        }

        public void loadAmazfitWatchBytesData(final String startDate, final String endDate, final IHMActivityDataCallback callback) {
            HMSportWebAPI.getPartialSportDataResult(startDate, endDate, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.datautil.HMDataCacheCenter.BandUnit.2
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCancel(int type) {
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCompleted() {
                    IHMActivityDataCallback iHMActivityDataCallback = callback;
                    if (iHMActivityDataCallback != null) {
                        iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(0));
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onError(Throwable throwable) {
                    throwable.printStackTrace();
                    IHMActivityDataCallback iHMActivityDataCallback = callback;
                    if (iHMActivityDataCallback != null) {
                        iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
                    }
                }

                @Override // com.huami.network.base.handler.IHMHttpResponseHandler
                public void onItem(HMHttpResponseData item) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(item.getResponseBody(), StandardCharsets.UTF_8));
                        String strOptString = jSONObject.optString("code");
                        int i = 0;
                        if (!"1".equals(strOptString)) {
                            HMLog.i(HMDataCacheCenter.TAG, "device sync invalid code : " + strOptString, new Object[0]);
                            IHMActivityDataCallback iHMActivityDataCallback = callback;
                            if (iHMActivityDataCallback != null) {
                                iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
                                return;
                            }
                            return;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList();
                        if (length > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            Calendar calendar = Calendar.getInstance();
                            int i2 = 0;
                            while (i2 < length) {
                                try {
                                    HMDataCacheCenter.printEncyptedData(jSONArray.getJSONObject(i2).optString("data"));
                                    DateData netDateData = BandUnit.this.parseNetDateData(jSONArray.getJSONObject(i2), HMDeviceType.WATCH.getValue());
                                    DaySportData dSDFromData = BandUnit.this.parseDSDFromData(new DaySportData(SportDay.fromString(netDateData.getDate())), netDateData);
                                    arrayList.add(dSDFromData);
                                    if (i2 == length - 1) {
                                        calendar.setTimeInMillis(dSDFromData.getLastValidDataTime());
                                        HMLog.i(HMDataCacheCenter.TAG, "endTime = " + calendar.getTime(), new Object[i]);
                                    }
                                    DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(netDateData.getDate());
                                    if (specifyDayData == null || specifyDayData.getData() == null) {
                                        arrayList2.add(netDateData);
                                    } else {
                                        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                                        if (originSportDataJsonToSportData == null || originSportDataJsonToSportData.getData() == null || originSportDataJsonToSportData.getData().length <= 0) {
                                            HMLog.i(HMDataCacheCenter.TAG, "local db is  not null ,but byte is not valid " + netDateData.getDate(), new Object[0]);
                                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dSDFromData.getBinaryData(), "", -1));
                                        } else {
                                            HMLog.i(HMDataCacheCenter.TAG, "local db is not null,and start merge " + specifyDayData.getDate(), new Object[i]);
                                            dSDFromData.merge(BandUnit.this.parseDSDFromData(new DaySportData(SportDay.fromString(netDateData.getDate())), specifyDayData));
                                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dSDFromData.getBinaryData(), "", -1));
                                            specifyDayData.setSync(0);
                                        }
                                        if (netDateData.getData_hr() != null && netDateData.getData_hr().length > 0) {
                                            if (specifyDayData.getData_hr() == null || specifyDayData.getData_hr().length <= 0) {
                                                specifyDayData.setData_hr(netDateData.getData_hr());
                                            } else {
                                                specifyDayData.setData_hr(dSDFromData.getBinaryHRData(specifyDayData.getData_hr()));
                                            }
                                        }
                                        specifyDayData.setSummary(netDateData.getSummary());
                                        arrayList2.add(specifyDayData);
                                    }
                                    if (SportDay.fromString(netDateData.getDate()).isToday()) {
                                        BandUnit.this.refreshRealTimeSteps(netDateData.getSummary());
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    HMLog.i(HMDataCacheCenter.TAG, "exception :  " + e.getMessage(), new Object[0]);
                                }
                                i2++;
                                i = 0;
                            }
                            if (arrayList2.isEmpty()) {
                                HMLog.i(HMDataCacheCenter.TAG, "同步数据成功,解析数据发生异常 " + jSONArray.toString(), new Object[0]);
                            } else {
                                HMDeviceManager.getInstance().setBoundDeviceSyncTime(HMDeviceType.WATCH, calendar);
                                HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(arrayList2);
                                HMLog.i(HMDataCacheCenter.TAG, "同步数据成功,下载data节点数据为: " + length, new Object[0]);
                                BandUnit bandUnit = BandUnit.this;
                                bandUnit.analysisNewDSD(HMDataCacheCenter.this.mTodaySportData, 2);
                            }
                        }
                        IHMActivityDataCallback iHMActivityDataCallback2 = callback;
                        if (iHMActivityDataCallback2 != null) {
                            iHMActivityDataCallback2.onSyncFinish(new HMDeviceSyncDataError(0));
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        new HmEarbudSummaryDataUpdateAnalysisJob((CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mEarbudSummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mBandDaySummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mDaySummeryArrayList, (CopyOnWriteArrayList<HMWeekSummery>) HMDataCacheCenter.mWeekSummeryArrayList, (CopyOnWriteArrayList<HMMonthSummery>) HMDataCacheCenter.mMonthSummeryArrayList, arrayList).start();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        IHMActivityDataCallback iHMActivityDataCallback3 = callback;
                        if (iHMActivityDataCallback3 != null) {
                            iHMActivityDataCallback3.onSyncFinish(new HMDeviceSyncDataError(100));
                        }
                    }
                }
            });
        }

        public DaySportData parseDSDFromData(DaySportData daySport, DateData data) {
            if (data == null) {
                daySport.setDataStastus(0);
                return daySport;
            }
            if (daySport == null) {
                HMLog.d(HMDataCacheCenter.TAG, "daySport == null !!! bad happens : " + data.getDate(), new Object[0]);
                return null;
            }
            byte[] data_hr = data.getData_hr();
            byte[] bArrJsonToSportDataByBytes = OriginSportData.jsonToSportDataByBytes(data.getData());
            if (bArrJsonToSportDataByBytes != null) {
                daySport.fromBinaryWithHRData(bArrJsonToSportDataByBytes, data_hr);
            }
            daySport.parseGoalFromSummery(data.getSummary());
            if (bArrJsonToSportDataByBytes == null || bArrJsonToSportDataByBytes.length == 0) {
                HMLog.d(HMDataCacheCenter.TAG, Constants.CONTENT_RANGE_PARAMS + data.getDate(), new Object[0]);
            } else {
                daySport.setDataStastus(1);
            }
            return daySport;
        }

        public void updateSummaryByDay(SportDay dad) {
            new HmEarbudSummaryDataUpdateAnalysisJob((CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mEarbudSummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mBandDaySummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mDaySummeryArrayList, (CopyOnWriteArrayList<HMWeekSummery>) HMDataCacheCenter.mWeekSummeryArrayList, (CopyOnWriteArrayList<HMMonthSummery>) HMDataCacheCenter.mMonthSummeryArrayList, dad).start();
        }

        public void updateSummaryByUsrEditSlp(String date, String sumJson) {
            if (HMDataCacheCenter.mDaySummeryArrayList.isEmpty() || TextUtils.isEmpty(sumJson)) {
                HMLog.d(HMDataCacheCenter.TAG, "empty summary list", new Object[0]);
                return;
            }
            for (HMSummery hMSummery : HMDataCacheCenter.mDaySummeryArrayList) {
                if (hMSummery.date.equals(date)) {
                    HMSummery.updateUsrSlp(hMSummery, sumJson);
                    if (HMDataCacheCenter.this.mRecentSleepSportData == null) {
                        HMDataCacheCenter.this.mRecentSleepSportData = new DaySportData(SportDay.fromString(hMSummery.date));
                        HMKeeper.saveRecentSleepDay(hMSummery.date);
                        HMDataCacheCenter.this.getmBandUint().analysisNewDSD(HMDataCacheCenter.this.mRecentSleepSportData, 3);
                    } else if (SportDay.fromString(hMSummery.date).offsetDay(HMDataCacheCenter.this.mRecentSleepSportData.getSportDay()) > 0) {
                        HMDataCacheCenter.this.mRecentSleepSportData = null;
                        HMDataCacheCenter.this.mRecentSleepSportData = new DaySportData(SportDay.fromString(hMSummery.date));
                        HMKeeper.saveRecentSleepDay(hMSummery.date);
                        HMDataCacheCenter.this.getmBandUint().analysisNewDSD(HMDataCacheCenter.this.mRecentSleepSportData, 3);
                    }
                }
            }
            for (HMWeekSummery hMWeekSummery : HMDataCacheCenter.mWeekSummeryArrayList) {
                if (SportDay.fromString(hMWeekSummery.weekStartDate).offsetDay(SportDay.fromString(date)) <= 0 && SportDay.fromString(hMWeekSummery.weekEndDate).offsetDay(SportDay.fromString(date)) >= 0) {
                    HMWeekSummery.fillWeekSummary(hMWeekSummery);
                }
            }
            for (HMMonthSummery hMMonthSummery : HMDataCacheCenter.mMonthSummeryArrayList) {
                if (SportDay.fromString(hMMonthSummery.monthStartDate).offsetDay(SportDay.fromString(date)) <= 0 && SportDay.fromString(hMMonthSummery.monthEndDate).offsetDay(SportDay.fromString(date)) >= 0) {
                    HMMonthSummery.fillMonth(hMMonthSummery);
                }
            }
        }

        public void updateTodaySummaryGoal(int goal) {
            HMSummery hMSummery;
            if (HMDataCacheCenter.mDaySummeryArrayList.isEmpty() || (hMSummery = (HMSummery) HMDataCacheCenter.mDaySummeryArrayList.get(HMDataCacheCenter.mDaySummeryArrayList.size() - 1)) == null || !SportDay.fromString(hMSummery.date).isToday()) {
                return;
            }
            hMSummery.goal = goal;
        }
    }

    public class EarbudUnit implements DownloadEarbudHealthDataCallback {
        private SyncedStatusHelper syncedStatusHelper = new EarbudSyncedStatusHelper();

        public EarbudUnit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void analysisNewDSD(DaySportData dsd, int type) {
            new HmEarbudDataAnalysisJob(dsd, type, HMDeviceType.EARBUD.getValue()).start();
        }

        private void fromBinaryData(DaySportData daySport, byte[] bytes) {
            byte[] bArr;
            int length = bytes.length;
            if (length == 11520) {
                bArr = new byte[1440];
                daySport.set8Byte(true);
                for (int i = 0; i < length; i += 8) {
                    bArr[i / 8] = bytes[i + 3];
                }
            } else {
                bArr = null;
            }
            daySport.fromBinaryWithHRData(bytes, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadAllNetData$0() {
            HmEarbudWebApi.INSTANCE.getData("2019-11-11", SportDay.getToday().getKey(), false, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadOriginData$1(boolean z, String str, boolean z2, List list) {
            if (!z2 || list == null) {
                HMDataCacheCenter.this.earbudStartDayLoadOriginDatas = SportDay.fromString(this.syncedStatusHelper.getOriginDataStartDate());
                HMLog.i(HMDataCacheCenter.TAG, "downloadAllEarbudOriginDataOk failed " + z2, new Object[0]);
                return;
            }
            boolean z3 = true;
            if (z) {
                this.syncedStatusHelper.setDataState(list.isEmpty() ? 1 : 2);
                this.syncedStatusHelper.save();
            }
            HMDataCacheCenter.this.earbudStartDayLoadOriginDatas = SportDay.fromString(str);
            this.syncedStatusHelper.setOriginDataStartDate(str);
            this.syncedStatusHelper.save();
            if (list.isEmpty()) {
                return;
            }
            if (list.size() > 1) {
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(list.subList(0, list.size() - 1));
            }
            EarbudDateData earbudDateData = (EarbudDateData) list.get(list.size() - 1);
            if (!SportDay.fromString(earbudDateData.getDate()).isToday()) {
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(earbudDateData);
                return;
            }
            DaySportData dsdFromData = parseDsdFromData(new DaySportData(SportDay.fromString(earbudDateData.getDate())), earbudDateData);
            EarbudDateData specifyDayData = HmEarbudDateDataUtil.INSTANCE.getSpecifyDayData(earbudDateData.getDate());
            if (specifyDayData == null || specifyDayData.getData() == null) {
                HMLog.i(HMDataCacheCenter.TAG, "=================== local db is null ,add now data " + earbudDateData.getDate(), new Object[0]);
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(earbudDateData);
                z3 = false;
            } else {
                OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                if (originSportDataJsonToSportData == null || originSportDataJsonToSportData.getData() == null || originSportDataJsonToSportData.getData().length <= 0) {
                    HMLog.i(HMDataCacheCenter.TAG, "local db is  not null ,but byte is not valid " + earbudDateData.getDate(), new Object[0]);
                    specifyDayData.setData(OriginSportData.sportDataBytesToJson(dsdFromData.getBinaryData(), "", -1));
                    z3 = false;
                } else {
                    HMLog.i(HMDataCacheCenter.TAG, "local db is not null,and start merge " + specifyDayData.getDate(), new Object[0]);
                    dsdFromData.merge(parseDsdFromData(new DaySportData(SportDay.fromString(earbudDateData.getDate())), specifyDayData));
                    specifyDayData.setData(OriginSportData.sportDataBytesToJson(dsdFromData.getBinaryData(), "", -1));
                    specifyDayData.setSync(0);
                }
                if (specifyDayData.getSource() == null || specifyDayData.getSource().intValue() == HMDeviceSource.VDEVICE.getValue()) {
                    specifyDayData.setSource(earbudDateData.getSource());
                }
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(specifyDayData);
            }
            initSummeryDatas(0, 4);
            if (!z3) {
                analysisNewDSD(HMDataCacheCenter.this.mEarbudTodaySportData, 0);
                return;
            }
            HMLog.i(HMDataCacheCenter.TAG, "网络端有合并数据，需要重新算法分析并上传数据", new Object[0]);
            new HmEarbudDataAnalysisJob(dsdFromData, 2, HMDeviceType.EARBUD.getValue()).start();
            HMDataCacheCenter.this.getmBandUint().updateSummaryByDay(dsdFromData.getSportDay());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadOriginData$2(final String str, String str2, final boolean z) {
            HMDataCacheCenter.this.mEarbudRecentSleepSportData = null;
            HmEarbudWebApi.INSTANCE.getData(str, str2, true, new DownloadEarbudHealthDataCallback() { // from class: as2
                @Override // com.xiaomi.hm.health.device.webapi.earbud.DownloadEarbudHealthDataCallback
                public final void downloadHealthDataResult(boolean z2, List list) {
                    this.a.lambda$loadOriginData$1(z, str, z2, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadAllNetData() {
            if (NetUtil.isNetworkConnected(HMDataCacheCenter.this.mContext)) {
                HMDataCacheCenter.this.earbudStartDayLoadOriginDatas = SportDay.fromString(SportDay.getToday().addWeek(-7).getKey());
                Rx.io(new Runnable() { // from class: bs2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$loadAllNetData$0();
                    }
                }).safeSubscribe();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadOriginData(final String startDay, final String endDay, final boolean isFirst) {
            if (NetUtil.isNetworkConnected(HMDataCacheCenter.this.mContext)) {
                Rx.io(new Runnable() { // from class: cs2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$loadOriginData$2(startDay, endDay, isFirst);
                    }
                }).safeSubscribe();
            }
        }

        public synchronized void analysisNewDsdFromEarbud(List<DaySportData> dsdList, int deviceType, HMDeviceSource deviceSource, String deviceId) {
            HMLog.i(HMDataCacheCenter.TAG, "analysisNewDsdFromEarbud start", new Object[0]);
            if (dsdList != null && !dsdList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i = 0; i < dsdList.size(); i++) {
                    DaySportData daySportData = dsdList.get(i);
                    String key = daySportData.getSportDay().getKey();
                    EarbudDateData specifyDayData = HmEarbudDateDataUtil.INSTANCE.getSpecifyDayData(key);
                    if (specifyDayData == null || specifyDayData.getData() == null) {
                        HMLog.i(HMDataCacheCenter.TAG, "************ analysisNewDsdFromEarbud db is  null ,add now data ************" + key, new Object[0]);
                        EarbudDateData earbudDateData = new EarbudDateData();
                        earbudDateData.setDate(daySportData.getKey());
                        earbudDateData.setData(OriginSportData.sportDataBytesToJson(daySportData.getBinaryData(), deviceId, deviceSource.getValue()));
                        earbudDateData.setSource(Integer.valueOf(deviceSource.getValue()));
                        earbudDateData.setType(Integer.valueOf(deviceType));
                        earbudDateData.setDeviceId(deviceId);
                        earbudDateData.setSync(0);
                        arrayList.add(earbudDateData);
                    } else {
                        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                        if (originSportDataJsonToSportData == null || originSportDataJsonToSportData.getData() == null || originSportDataJsonToSportData.getData().length <= 0) {
                            HMLog.i(HMDataCacheCenter.TAG, "analysisNewDsdFromEarbud db is  not null ,but byte is not valid " + key, new Object[0]);
                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(daySportData.getBinaryData(), deviceId, deviceSource.getValue()));
                            specifyDayData.setSync(0);
                        } else {
                            HMLog.i(HMDataCacheCenter.TAG, " analysisNewDsdFromEarbud db is not null,and start merge " + key, new Object[0]);
                            DaySportData dsdFromData = parseDsdFromData(new DaySportData(SportDay.fromString(key)), specifyDayData);
                            dsdFromData.merge(daySportData);
                            specifyDayData.setData(OriginSportData.sportDataBytesToJson(dsdFromData.getBinaryData(), deviceId, deviceSource.getValue()));
                            specifyDayData.setSync(0);
                        }
                        arrayList.add(specifyDayData);
                    }
                    if (!z && daySportData.getSportDay().offsetDay(HMDataCacheCenter.this.mEarbudTodaySportData.getSportDay()) > 0) {
                        HMLog.i(HMDataCacheCenter.TAG, "同步数据有新的天数记录，缓存重新加载\u3000：\u3000old mTodaySportData.getSportDay()  = " + HMDataCacheCenter.this.mEarbudTodaySportData.getSportDay().getKey() + ";new today = " + SportDay.getToday().getKey(), new Object[0]);
                        z = true;
                    }
                }
                if (arrayList.isEmpty()) {
                    HMLog.i(HMDataCacheCenter.TAG, "没有需要分析的数据，直接返回", new Object[0]);
                    return;
                }
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(arrayList);
                for (int i2 = 0; i2 < dsdList.size(); i2++) {
                    new HmEarbudDataAnalysisJob(new DaySportData(dsdList.get(i2).getSportDay()), 1, deviceType).start();
                }
                if (z) {
                    HMLog.i(HMDataCacheCenter.TAG, "同步数据有新的天数记录，缓存重新加载", new Object[0]);
                    HMDataCacheCenter.this.mEarbudTodaySportData.getSportDay().setKey(SportDay.getToday().getKey());
                    HMDataCacheCenter.this.mEarbudTodaySportData.clear();
                    HMDataCacheCenter.this.mEarbudRecentSleepSportData = null;
                    initSummeryDatas(0, 4);
                } else {
                    HMLog.i(HMDataCacheCenter.TAG, "同步数据没有新的天数记录，统计更新即可", new Object[0]);
                    new HmEarbudSummaryDataUpdateAnalysisJob((CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mEarbudSummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mBandDaySummeryArrayList, (CopyOnWriteArrayList<HMSummery>) HMDataCacheCenter.mDaySummeryArrayList, (CopyOnWriteArrayList<HMWeekSummery>) HMDataCacheCenter.mWeekSummeryArrayList, (CopyOnWriteArrayList<HMMonthSummery>) HMDataCacheCenter.mMonthSummeryArrayList, dsdList).start();
                }
                new HMSportDataPostToServerJob().start();
                return;
            }
            HMLog.i(HMDataCacheCenter.TAG, "empty list return **********************************", new Object[0]);
        }

        public void checkDayDatas(SportDay day) {
            EarbudDateData earbudSpecifyDayData = HMBraceletDateDataUtil.getEarbudSpecifyDayData(day.getKey());
            EarbudDateData earbudSpecifyDayData2 = HMBraceletDateDataUtil.getEarbudSpecifyDayData(day.getPreDay().getKey());
            if (earbudSpecifyDayData == null && earbudSpecifyDayData2 == null) {
                HMLog.v(HMDataCacheCenter.TAG, "earbud curDateData and preDateData is null , no need sync cloud.", new Object[0]);
                return;
            }
            boolean z = true;
            boolean z2 = earbudSpecifyDayData == null || !TextUtils.isEmpty(earbudSpecifyDayData.getData());
            if (earbudSpecifyDayData2 != null && TextUtils.isEmpty(earbudSpecifyDayData2.getData())) {
                z = false;
            }
            if (z2 && z) {
                HMLog.v(HMDataCacheCenter.TAG, "earbud curDateData and preDateData data is not null , no need sync cloud.", new Object[0]);
                return;
            }
            String key = day.getPreDay().getKey();
            String key2 = day.getKey();
            if (z2) {
                key2 = key;
            }
            if (z) {
                key = key2;
            }
            HMLog.v(HMDataCacheCenter.TAG, "load dateData from : " + key + " to " + key2, new Object[0]);
            HMDataCacheCenter.this.mBandUint.loadPartialBraceletNetData(key, key2, false);
        }

        @Override // com.xiaomi.hm.health.device.webapi.earbud.DownloadEarbudHealthDataCallback
        public void downloadHealthDataResult(boolean isOk, List<EarbudDateData> datas) {
            int i;
            if (!isOk || datas == null) {
                HMLog.i(HMDataCacheCenter.TAG, "downloadAllEarbudSummaryOk failed " + isOk, new Object[0]);
                return;
            }
            if (datas.isEmpty()) {
                this.syncedStatusHelper.setDataState(1);
                this.syncedStatusHelper.save();
                return;
            }
            int size = datas.size();
            HMLog.i(HMDataCacheCenter.TAG, "download net date = " + datas.get(0).getDate() + "~~~" + datas.get(size - 1).getDate(), new Object[0]);
            List<EarbudDateData> list = HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().orderDesc(EarbudDateDataDao.Properties.Date).list();
            if (list == null || list.isEmpty()) {
                HMLog.i(HMDataCacheCenter.TAG, "本地数据为空，全部插入summary", new Object[0]);
                i = 0;
            } else {
                HMLog.i(HMDataCacheCenter.TAG, "本地数据不空\u3000in db dbDatas = " + list.size(), new Object[0]);
                i = 2;
            }
            HMLog.i(HMDataCacheCenter.TAG, "in HMHttpResponseData  listSize = " + size, new Object[0]);
            if (i > 0) {
                if (size <= i) {
                    datas.clear();
                } else if (list.size() > 1) {
                    EarbudDateData earbudDateData = list.get(0);
                    EarbudDateData earbudDateData2 = list.get(1);
                    Iterator<EarbudDateData> it2 = datas.iterator();
                    while (it2.hasNext()) {
                        EarbudDateData next = it2.next();
                        if (next.getDate().equals(earbudDateData.getDate())) {
                            earbudDateData.setSummary(next.getSummary());
                            HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(earbudDateData);
                            it2.remove();
                        }
                        if (next.getDate().equals(earbudDateData2.getDate())) {
                            earbudDateData2.setSummary(next.getSummary());
                            HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(earbudDateData2);
                            it2.remove();
                        }
                    }
                } else if (list.size() == 1) {
                    EarbudDateData earbudDateData3 = list.get(0);
                    Iterator<EarbudDateData> it3 = datas.iterator();
                    while (it3.hasNext()) {
                        EarbudDateData next2 = it3.next();
                        if (next2.getDate().equals(earbudDateData3.getDate())) {
                            earbudDateData3.setSummary(next2.getSummary());
                            HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(earbudDateData3);
                            it3.remove();
                        }
                    }
                }
            }
            if (!datas.isEmpty()) {
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplaceInTx(datas);
            }
            HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
            new HmSleepSelectInitJob(hmEarbudDateDataUtil.getEarbudSleepInfos(), hmEarbudDateDataUtil.getEarbudSelectDays(), true).start();
            initSummeryDatas(1, 4);
            SportDataManager.getInstance().init();
        }

        public HMSummery getRecentSleepSummary() {
            Sleep sleep;
            if (HMDataCacheCenter.mEarbudSummeryArrayList.isEmpty()) {
                return null;
            }
            for (int size = HMDataCacheCenter.mEarbudSummeryArrayList.size() - 1; size >= 0; size--) {
                HMSummery hMSummery = (HMSummery) HMDataCacheCenter.mEarbudSummeryArrayList.get(size);
                if (hMSummery != null && (sleep = hMSummery.sleep) != null && sleep.ed > sleep.st) {
                    return hMSummery;
                }
            }
            return null;
        }

        public HMSummery getSpecifyDaySummary(String date) {
            for (HMSummery hMSummery : HMDataCacheCenter.mEarbudSummeryArrayList) {
                if (date.equals(hMSummery.date)) {
                    return hMSummery;
                }
            }
            return null;
        }

        public SyncedStatusHelper getSyncedStatusHelper() {
            return this.syncedStatusHelper;
        }

        public void initSummeryDatas(int type, int workType) {
            new HmEarbudSummaryDataInitAnalysisJob(HMDataCacheCenter.mEarbudSummeryArrayList, type, workType).start();
        }

        public DaySportData parseDsdFromData(DaySportData daySport, EarbudDateData data) {
            if (data == null) {
                daySport.setDataStastus(0);
                return daySport;
            }
            if (daySport == null) {
                HMLog.d(HMDataCacheCenter.TAG, "daySport == null !!! bad happens : " + data.getDate(), new Object[0]);
                return null;
            }
            byte[] bArrJsonToSportDataByBytes = OriginSportData.jsonToSportDataByBytes(data.getData());
            if (bArrJsonToSportDataByBytes != null && bArrJsonToSportDataByBytes.length != 0) {
                fromBinaryData(daySport, bArrJsonToSportDataByBytes);
            }
            daySport.parseGoalFromSummery(data.getSummary());
            if (bArrJsonToSportDataByBytes == null || bArrJsonToSportDataByBytes.length == 0) {
                HMLog.d(HMDataCacheCenter.TAG, Constants.CONTENT_RANGE_PARAMS + data.getDate(), new Object[0]);
            } else {
                daySport.setDataStastus(1);
            }
            return daySport;
        }
    }

    private HMDataCacheCenter(Context context) {
        this.mContext = context.getApplicationContext();
        EventBus.getDefault().register(this);
        this.mBandUint = new BandUnit();
        this.mEarbudUnit = new EarbudUnit();
    }

    private void checkTodayNewDayInfo() {
        DaySportData daySportData = this.mTodaySportData;
        if (daySportData != null && !daySportData.getSportDay().isToday()) {
            initTodayDsdInfos();
            this.mRecentSleepSportData = null;
            this.mRecentStepSportData = null;
            getmBandUint().initSummeryDatas(0, 4);
        }
        DaySportData daySportData2 = this.mEarbudTodaySportData;
        if (daySportData2 == null || daySportData2.getSportDay().isToday()) {
            return;
        }
        initEarbudTodayDsdInfos();
        this.mEarbudRecentSleepSportData = null;
        getEarbudUnit().initSummeryDatas(0, 4);
    }

    private void cleanData() {
        MessageDb intance = MessageDb.INSTANCE.getIntance();
        if (intance != null) {
            intance.clean();
        }
    }

    private ArrayList<DaySportData> getBandGoogleFitData(String startDay, String stopDay) {
        ArrayList<DaySportData> arrayList = new ArrayList<>();
        List<DateData> regionData = HMBraceletDateDataUtil.getRegionData(startDay, stopDay);
        if (regionData == null || regionData.isEmpty()) {
            HMLog.i(TAG, "未取到数据", new Object[0]);
            return arrayList;
        }
        for (DateData dateData : regionData) {
            if (dateData.getDate().equals(SportDay.getToday().getKey())) {
                HMLog.i(TAG, "今天的数据不需要再走算法分析任务，已经存在", new Object[0]);
                arrayList.add(getInstance().getTodaySportData());
            } else {
                DaySportData daySportData = new DaySportData(SportDay.fromString(dateData.getDate()));
                arrayList.add(daySportData);
                getmBandUint().analysisNewDSD(daySportData, 4);
            }
        }
        return arrayList;
    }

    private ArrayList<DaySportData> getEarbudGoogleFitData(String startDay, String stopDay) {
        ArrayList<DaySportData> arrayList = new ArrayList<>();
        List<EarbudDateData> regionData = HmEarbudDateDataUtil.getRegionData(startDay, stopDay);
        if (regionData == null || regionData.isEmpty()) {
            HMLog.i(TAG, "未取到耳机数据", new Object[0]);
            return arrayList;
        }
        for (EarbudDateData earbudDateData : regionData) {
            DaySportData daySportData = new DaySportData(SportDay.fromString(earbudDateData.getDate()));
            arrayList.add(daySportData);
            if (earbudDateData.getDate().equals(SportDay.getToday().getKey())) {
                arrayList.add(getInstance().getEarbudTodaySportData());
                HMLog.i(TAG, "今天的数据不需要再走算法分析任务，已经存在", new Object[0]);
            } else {
                getEarbudUnit().analysisNewDSD(daySportData, 4);
            }
        }
        return arrayList;
    }

    public static synchronized HMDataCacheCenter getInstance() {
        if (instance == null) {
            instance = new HMDataCacheCenter(BraceletApp.getContext());
        }
        return instance;
    }

    public static synchronized void init(Context context) {
        if (instance == null) {
            instance = new HMDataCacheCenter(context);
        }
    }

    private void initDays() {
        if (!TextUtils.isEmpty(getmBandUint().getSyncedStatusHelper().getOriginDataStartDate())) {
            this.startDayLoadOriginDatas = SportDay.fromString(getmBandUint().getSyncedStatusHelper().getOriginDataStartDate());
        }
        if (!TextUtils.isEmpty(this.mEarbudUnit.getSyncedStatusHelper().getOriginDataStartDate())) {
            this.earbudStartDayLoadOriginDatas = SportDay.fromString(this.mEarbudUnit.getSyncedStatusHelper().getOriginDataStartDate());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startDayLoadOriginDatas ");
        SportDay sportDay = this.startDayLoadOriginDatas;
        sb.append(sportDay == null ? " null " : sportDay.toString());
        HMLog.d(TAG, sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("earbudStartDayLoadOriginDatas ");
        SportDay sportDay2 = this.earbudStartDayLoadOriginDatas;
        sb2.append(sportDay2 != null ? sportDay2.toString() : " null ");
        HMLog.d(TAG, sb2.toString(), new Object[0]);
    }

    private void initEarbudTodayDsdInfos() {
        try {
            this.mEarbudTodaySportData.getSportDay().setKey(SportDay.getToday().getKey());
            this.mEarbudTodaySportData.clear();
            getEarbudUnit().analysisNewDSD(this.mEarbudTodaySportData, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initTodayDsdInfos() {
        try {
            this.mTodaySportData.getSportDay().setKey(SportDay.getToday().getKey());
            this.mTodaySportData.clear();
            getmBandUint().analysisNewDSD(this.mTodaySportData, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printActivityData(String tag, List<ActivityData> activityDatas) {
        if (HMConfig.Log.isLogData()) {
            if (activityDatas == null || activityDatas.size() == 0) {
                HMLog.i(TAG, "printActivityData : no data!!!", new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("============================");
            sb.append(tag);
            sb.append("============================\n");
            Iterator<ActivityData> it2 = activityDatas.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append("\n");
            }
            sb.append("============================");
            sb.append(tag);
            sb.append("============================\n");
            HMLog.i(TAG, tag + sb.toString(), new Object[0]);
        }
    }

    public static void printData(DaySportData data) {
        if (HMConfig.Log.isLogData()) {
            if (data == null || data.getDatas() == null) {
                HMLog.i(TAG, "printData : no data!!!", new Object[0]);
                return;
            }
            ArrayList<SportData> datas = data.getDatas();
            StringBuilder sb = new StringBuilder();
            sb.append("============================[");
            sb.append(data.getKey());
            sb.append("]============================\n");
            Iterator<SportData> it2 = datas.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append("\n");
            }
            sb.append("============================[");
            sb.append(data.getKey());
            sb.append("]============================\n");
            HMLog.i(TAG, sb.toString(), new Object[0]);
        }
    }

    public static void printEncyptedData(String data) {
        if (HMConfig.Log.isLogData()) {
            if (TextUtils.isEmpty(data)) {
                HMLog.i(TAG, "printData : no data!!!", new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("============================[");
            sb.append(data);
            sb.append("]============================\n");
            byte[] bArrDecode = com.loopj.android.http.Base64.decode(data, 2);
            HMLog.i(TAG, "bites = " + bArrDecode.length, new Object[0]);
            for (int i = 0; i < bArrDecode.length; i += 3) {
                try {
                    sb.append(i / 3);
                    sb.append(", ");
                    sb.append(bArrDecode[i] & 255);
                    sb.append(",");
                    sb.append(bArrDecode[i + 1] & 255);
                    sb.append(",");
                    sb.append(bArrDecode[i + 2] & 255);
                    sb.append("\n");
                } catch (Exception e) {
                    e.printStackTrace();
                    HMLog.i(TAG, e.toString(), new Object[0]);
                }
            }
            sb.append("============================[");
            sb.append("]============================\n");
            HMLog.i(TAG, sb.toString(), new Object[0]);
        }
    }

    public static void printHrData(String tag, byte[] datas) {
        if (HMConfig.Log.isLogData()) {
            if (datas == null || datas.length == 0) {
                HMLog.i(TAG, "printHrData : no data!!!", new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("============================");
            sb.append(tag);
            sb.append("============================\n");
            for (int i = 0; i < datas.length; i++) {
                sb.append(i);
                sb.append(":");
                sb.append(datas[i] & 255);
                sb.append("\n");
            }
            sb.append("============================");
            sb.append(tag);
            sb.append("============================\n");
            HMLog.i(TAG, sb.toString(), new Object[0]);
        }
    }

    public void calculateReachGoalDays() {
        String specifyDay;
        String specifyDay2;
        CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList = mDaySummeryArrayList;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        SportDay sportDayAddDay = null;
        int i5 = -1;
        SportDay sportDayAddDay2 = null;
        int i6 = -1;
        for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
            CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList2 = mDaySummeryArrayList;
            HMSummery hMSummery = copyOnWriteArrayList2.get(size);
            Steps steps = hMSummery.steps;
            if (steps != null && steps.ttl >= hMSummery.goal && !z) {
                i++;
            } else if (size < copyOnWriteArrayList2.size() - 1) {
                z = true;
            }
            Steps steps2 = hMSummery.steps;
            if (steps2 != null && steps2.ttl >= hMSummery.goal) {
                i2++;
            } else if (i2 > 0) {
                arrayList.add(Integer.valueOf(i2));
                if (i2 > 1) {
                    i3++;
                }
                if (i3 == 1 && i6 < 0) {
                    sportDayAddDay2 = SportDay.fromString(hMSummery.date).addDay(1);
                    i6 = i2;
                }
                if (i3 != 2 || i5 >= 0) {
                    i2 = i5;
                } else {
                    sportDayAddDay = SportDay.fromString(hMSummery.date).addDay(1);
                }
                i5 = i2;
                i2 = 0;
            }
            Steps steps3 = hMSummery.steps;
            if (steps3 != null) {
                if (i4 == 0) {
                    i4 = steps3.ttl;
                } else {
                    int i7 = steps3.ttl;
                    if (i4 < i7) {
                        i4 = i7;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                if (i8 == 0 || i2 < ((Integer) arrayList.get(i8)).intValue()) {
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    i2 = iIntValue;
                }
                i8++;
            }
        }
        boolean z2 = i > 1 && arrayList.size() == 1;
        if (i >= 1) {
            CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList3 = mDaySummeryArrayList;
            HMSummery hMSummery2 = copyOnWriteArrayList3.get(copyOnWriteArrayList3.size() - 1);
            Steps steps4 = hMSummery2.steps;
            if (steps4 == null || steps4.ttl <= hMSummery2.goal) {
                specifyDay = HMDateUtil.getSpecifyDay(hMSummery2.date, -1);
                specifyDay2 = HMDateUtil.getSpecifyDay(specifyDay, (-i) + 1);
            } else {
                specifyDay = hMSummery2.date;
                specifyDay2 = HMDateUtil.getSpecifyDay(specifyDay, (-i) + 1);
            }
        } else {
            specifyDay = null;
            specifyDay2 = null;
        }
        HMKeeper.setRecentReachGoals(i, specifyDay2, specifyDay, z2);
        HMKeeper.setMaxReachGoals(i2);
        HMKeeper.setMaxSteps(i4);
        if (i > 1 && sportDayAddDay != null) {
            HMKeeper.setBeforeRecentReachGoals(i5, sportDayAddDay.getKey(), sportDayAddDay.addDay(i5 - 1).getKey());
        } else if (sportDayAddDay2 != null) {
            HMKeeper.setBeforeRecentReachGoals(i6, sportDayAddDay2.getKey(), sportDayAddDay2.addDay(i6 - 1).getKey());
        } else if (sportDayAddDay2 == null) {
            HMKeeper.setBeforeRecentReachGoals(0, null, null);
        }
        EventBus.getDefault().post(new EventMaxStepsAndRecentReachGoalsAnalysisFinishJob());
    }

    public void checkNeedSyncData() {
        if (!GlobalConfig.get().isBuildInner() && System.currentTimeMillis() - this.checkNetDataTime < MediaRecorderHelper.MAX_RECORD_TIME) {
            HMLog.d(TAG, "check net data try less than 3 mins ,return " + this.checkNetDataTime, new Object[0]);
            return;
        }
        HMAccountWebExtAPI.updateProfile();
        new HMSportDataPostToServerJob().start();
        HMWeightUtils.syncToServer();
        RunningManager.syncGPSSport();
        TrainingHistoryHelper.getInstance().syncAllUnSyncedTrainingHistoryRecord(null);
        HRDataManager.getInstance().syncToServer();
        TempUseCaseUtils.INSTANCE.syncDataToServer();
        HMSportWebAPI.uploadManualData(false);
        new HmAfppgPostToServerJob().start();
        this.checkNetDataTime = System.currentTimeMillis();
    }

    public void exitApp() {
        this.mTodaySportData.clear();
        this.mEarbudTodaySportData.clear();
        this.mRecentSleepSportData = null;
        this.mRecentStepSportData = null;
        this.mEarbudRecentSleepSportData = null;
        this.loadNetDataTime = 0L;
        mDaySummeryArrayList.clear();
        mWeekSummeryArrayList.clear();
        mMonthSummeryArrayList.clear();
        new HMSportDataPostToServerJob().start();
        resetSyncStatus();
        new EcgDataRepo().clearData();
        SleepServiceKt.getSleepService().logoutSleepService();
        cleanData();
    }

    public String getDownloadDataStartDate() {
        return "2014-06-01";
    }

    public DaySportData getEarbudTodaySportData() {
        DaySportData daySportData = this.mEarbudTodaySportData;
        if (daySportData != null && daySportData.getSportDay().isToday()) {
            return this.mEarbudTodaySportData;
        }
        DaySportData daySportData2 = new DaySportData(SportDay.getToday());
        daySportData2.setDataStastus(0);
        return daySportData2;
    }

    public EarbudUnit getEarbudUnit() {
        return this.mEarbudUnit;
    }

    public DaySportData getLatestSleepData() {
        DaySportData latestSleepData = getLatestSleepData(this.mTodaySportData, this.mEarbudTodaySportData);
        return latestSleepData != null ? latestSleepData : getLatestSleepData(this.mRecentSleepSportData, this.mEarbudTodaySportData);
    }

    public String getShoesDownloadDataStartDate() {
        return "2014-06-01";
    }

    public HMSummery getSpecifyDaySummary(String date) {
        for (HMSummery hMSummery : mDaySummeryArrayList) {
            if (date.equals(hMSummery.date)) {
                return hMSummery;
            }
        }
        return null;
    }

    public DaySportData getTodaySportData() {
        DaySportData daySportData = this.mTodaySportData;
        if (daySportData != null && daySportData.getSportDay().isToday()) {
            return this.mTodaySportData;
        }
        DaySportData daySportData2 = new DaySportData(SportDay.getToday());
        daySportData2.setDataStastus(0);
        return daySportData2;
    }

    public BandUnit getmBandUint() {
        return this.mBandUint;
    }

    public void initNetData() {
        checkTodayNewDayInfo();
        boolean zIsAnonymousLogin = AnonymousManager.isAnonymousLogin();
        if (System.currentTimeMillis() - this.loadNetDataTime < 60000 || zIsAnonymousLogin) {
            return;
        }
        if (getmBandUint().getSyncedStatusHelper().isSynced()) {
            HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
            new HmSleepSelectInitJob(hmEarbudDateDataUtil.getBandSleepInfos(), hmEarbudDateDataUtil.getBandSelectDays(), false).start();
        } else {
            this.mBandUint.loadAllBraceletNetDataNew();
        }
        if (this.mEarbudUnit.getSyncedStatusHelper().isSynced()) {
            HmEarbudDateDataUtil hmEarbudDateDataUtil2 = HmEarbudDateDataUtil.INSTANCE;
            new HmSleepSelectInitJob(hmEarbudDateDataUtil2.getEarbudSleepInfos(), hmEarbudDateDataUtil2.getEarbudSelectDays(), true).start();
        } else {
            this.mEarbudUnit.loadAllNetData();
        }
        HRDataManager.getInstance().deleteFromServer();
        HRDataManager.getInstance().syncFromServer(false);
        HMSportWebAPI.getAllManualData();
        StressUseCaseUtils.INSTANCE.syncDataFromServer();
        TempUseCaseUtils.INSTANCE.fetchDataFromServer();
        BloodPressureHelper.INSTANCE.syncBloodPressureData();
        this.loadNetDataTime = System.currentTimeMillis();
    }

    public boolean isActivDataSynced() {
        return getmBandUint().getSyncedStatusHelper().isSynced();
    }

    public boolean isActivEarbudDataSynced() {
        EarbudUnit earbudUnit = this.mEarbudUnit;
        return earbudUnit != null && earbudUnit.getSyncedStatusHelper().isSynced();
    }

    public void onEvent(EventHWBandAnalysisJobFinished ead) {
        if (!ead.getmDsd().getSportDay().isToday() || ead.getmDsd() == null) {
            return;
        }
        boolean z = ead.getmDeviceType() == HMDeviceType.EARBUD.getValue();
        if (z) {
            this.mEarbudTodaySportData = ead.getmDsd();
        } else {
            this.mTodaySportData = ead.getmDsd();
        }
        EventBus.getDefault().post(new EventTodaySportAnalysisJobFinished(z));
    }

    public void preLoadDatas() {
        TrainingLib.login();
        initNetData();
        getmBandUint().initSummeryDatas(0, 4);
        getEarbudUnit().initSummeryDatas(0, 4);
        initTodayDsdInfos();
        initEarbudTodayDsdInfos();
        WatchFaceHelper.INSTANCE.getSettingAndSave();
        SportDataManager.getInstance().init();
        new HMCompareModelInjectJob().start();
        initDays();
        if (HMAppConfig.getVersionCode() != HMKeeper.getLastFwUpgradeAppVersionCode()) {
            HMLog.d(TAG, "upgrade app " + HMAppConfig.getVersionCode(), new Object[0]);
            if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
                HMFwOnlineUpgradeManager.getInstance().clearFwUpgradeTime();
                HMKeeper.clearFwUpgradeDate();
            } else {
                HMKeeper.clearFwUpgradeDate();
            }
            HMKeeper.keepFwUpgradeAppVersionCode(HMAppConfig.getVersionCode());
        }
        SyncCenter.getCenter(this.mContext).syncCloud();
        ThirdAuthManager.syncAuthUrlSettings(this.mContext);
        HealthDataSyncTime.getInstance().initAFSyncTime();
        SleepNotificationManager.INSTANCE.init();
        HMAccountWebAPI.getSingleAppsettings(HMAccountWebAPI.APPS_SETTINGS_TRACK_SHARE);
    }

    public void reloadOnLoadSuccess() {
        HMLog.d(TAG, "reload start *****************", new Object[0]);
        exitApp();
        HMDaoManager.getInstance().getManualDataDao().deleteAll();
        HMKeeper.setManualDataSyncState(false);
        HMKeeper.setHeartRateDataSyncState(false);
        preLoadDatas();
    }

    public void resetSyncStatus() {
        this.mBandUint.getSyncedStatusHelper().reset();
        this.mEarbudUnit.getSyncedStatusHelper().reset();
        this.mBandUint.getSyncedStatusHelper().save();
        this.mEarbudUnit.getSyncedStatusHelper().save();
    }

    public boolean switchSleepSource(String date, boolean isEarbud) {
        HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
        EarbudDateData specifyDayData = hmEarbudDateDataUtil.getSpecifyDayData(date);
        DateData dateDataLoad = HMDaoManager.getInstance().getDateDataDao().load(date);
        if (specifyDayData == null || TextUtils.isEmpty(specifyDayData.getSummary()) || dateDataLoad == null || TextUtils.isEmpty(dateDataLoad.getSummary())) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(specifyDayData.getSummary());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("slp");
            JSONObject jSONObject2 = new JSONObject(dateDataLoad.getSummary());
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("slp");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
                int iOptInt = jSONObjectOptJSONObject.optInt("selected", 0);
                int iOptInt2 = jSONObjectOptJSONObject2.optInt("selected", 0);
                jSONObjectOptJSONObject.put("selected", isEarbud ? 1 : 0);
                jSONObjectOptJSONObject2.put("selected", isEarbud ? 0 : 1);
                jSONObject.put("slp", jSONObjectOptJSONObject);
                jSONObject2.put("slp", jSONObjectOptJSONObject2);
                specifyDayData.setSummary(jSONObject.toString());
                specifyDayData.setSync(0);
                dateDataLoad.setSummary(jSONObject2.toString());
                dateDataLoad.setSync(0);
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(specifyDayData);
                HMDaoManager.getInstance().getDateDataDao().insertOrReplace(dateDataLoad);
                boolean zUploadDateDatas = HMSportWebAPI.uploadDateDatas(true);
                HMLog.i(TAG, "upload result = " + zUploadDateDatas, new Object[0]);
                if (!zUploadDateDatas) {
                    jSONObjectOptJSONObject2.put("selected", iOptInt2);
                    jSONObject2.put("slp", jSONObjectOptJSONObject2);
                    dateDataLoad.setSummary(jSONObject2.toString());
                    dateDataLoad.setSync(1);
                    HMDaoManager.getInstance().getDateDataDao().insertOrReplace(dateDataLoad);
                    return false;
                }
                boolean zUpdateDateDatas = HmEarbudWebApi.INSTANCE.updateDateDatas(true);
                HMLog.i(TAG, "earbud upload result = " + zUpdateDateDatas, new Object[0]);
                if (zUpdateDateDatas) {
                    hmEarbudDateDataUtil.switchSelect(date, isEarbud);
                    new HmMixSummarySwitchJob(mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList).start();
                    return true;
                }
                jSONObjectOptJSONObject2.put("selected", iOptInt2);
                jSONObject2.put("slp", jSONObjectOptJSONObject2);
                dateDataLoad.setSummary(jSONObject2.toString());
                dateDataLoad.setSync(0);
                HMDaoManager.getInstance().getDateDataDao().insertOrReplace(dateDataLoad);
                jSONObjectOptJSONObject.put("selected", iOptInt);
                jSONObject.put("slp", jSONObjectOptJSONObject2);
                specifyDayData.setSummary(jSONObject2.toString());
                specifyDayData.setSync(1);
                HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(specifyDayData);
                return false;
            }
            return false;
        } catch (Exception e) {
            HMLog.i(TAG, "switch sleep source error" + e.getLocalizedMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized void syncDsdToThirdPartner(String startDay, String stopDay, int type) {
        ArrayList arrayList = new ArrayList();
        if (type == 0) {
            HMLog.i(TAG, "计算google fit数据\u3000startday : " + startDay + ";stopday  = " + stopDay, new Object[0]);
            if (!TextUtils.isEmpty(startDay) && !TextUtils.isEmpty(stopDay)) {
                if (startDay.equals(stopDay)) {
                    HMLog.i(TAG, "开始结束日期相同，取一天数据", new Object[0]);
                    if (stopDay.equals(SportDay.getToday().getKey())) {
                        HMLog.i(TAG, "今天的数据不需要再走算法分析任务，已经存在", new Object[0]);
                        arrayList.add(getInstance().getEarbudTodaySportData());
                        arrayList.add(getInstance().getTodaySportData());
                    } else {
                        DaySportData daySportData = new DaySportData(SportDay.fromString(stopDay));
                        arrayList.add(daySportData);
                        getEarbudUnit().analysisNewDSD(daySportData, 4);
                        DaySportData daySportData2 = new DaySportData(SportDay.fromString(stopDay));
                        arrayList.add(daySportData2);
                        getmBandUint().analysisNewDSD(daySportData2, 4);
                    }
                    new HMThirdPartyDataProcessJob(BraceletApp.getContext(), arrayList, type).start();
                } else {
                    arrayList.addAll(getEarbudGoogleFitData(startDay, stopDay));
                    arrayList.addAll(getBandGoogleFitData(startDay, stopDay));
                    new HMThirdPartyDataProcessJob(BraceletApp.getContext(), arrayList, type).start();
                }
            }
            HMLog.d(TAG, "日期非法，直接返回", new Object[0]);
        }
    }

    private DaySportData getLatestSleepData(DaySportData bandData, DaySportData earbudData) {
        boolean z = (bandData == null || bandData.getSleepInfo() == null || bandData.getSleepInfo().getSleepCount() <= 0) ? false : true;
        boolean z2 = (earbudData == null || earbudData.getSleepInfo() == null || earbudData.getSleepInfo().getSleepCount() <= 0) ? false : true;
        if (z && z2) {
            if (bandData.sportDay.after(earbudData.sportDay)) {
                return bandData;
            }
            if (bandData.sportDay.before(earbudData.sportDay)) {
                return earbudData;
            }
            if (bandData.sportDay.equals(earbudData.sportDay)) {
                return HmEarbudDateDataUtil.INSTANCE.getSelectData(bandData.sportDay.getKey()).getIsEarbud() ? earbudData : bandData;
            }
        }
        if (z) {
            return bandData;
        }
        if (z2) {
            return earbudData;
        }
        return null;
    }

    public void onEvent(HMDeviceBindEvent event) {
        HMDeviceType hMDeviceType;
        HMLog.i(TAG, "收到绑定信息 " + event.getDeviceType() + ";" + event.isBound(), new Object[0]);
        if (event.isBound() && HMDeviceType.SHOES != event.getDeviceType() && (hMDeviceType = HMDeviceType.WATCH) == event.getDeviceType()) {
            HMKeeper.setIsFirstSyncWatchDataAfterBand(true);
            HMDeviceManager.getInstance().startSyncData(hMDeviceType);
        }
    }

    public void onEvent(EventSummeryAnalysisJobFinished event) {
        new HMTotalDataAnalisisJob().start();
    }

    public void onEvent(EventBandSummaryAnalysisJobFinished event) {
        new HmMixSummaryAnalysisJob(mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList, 4).start();
        if (event.getSummaryAnalysisJobType() == 1) {
            HMLog.i(TAG, "第一次下载网络数据完成，则需要下载data节点的数据", new Object[0]);
            String key = this.startDayLoadOriginDatas.getKey();
            HMSummery recentSleepSummary = getmBandUint().getRecentSleepSummary();
            HMSummery recentStepSummary = getmBandUint().getRecentStepSummary();
            SportDay sportDayFromString = recentSleepSummary == null ? null : SportDay.fromString(recentSleepSummary.date);
            SportDay sportDayFromString2 = recentStepSummary != null ? SportDay.fromString(recentStepSummary.date) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("sleepStartDay = ");
            sb.append(sportDayFromString == null ? "null" : sportDayFromString.getKey());
            sb.append(";stepStartDay = ");
            sb.append(sportDayFromString2 != null ? sportDayFromString2.getKey() : "null");
            HMLog.i(TAG, sb.toString(), new Object[0]);
            if (sportDayFromString != null && sportDayFromString.offsetDay(this.startDayLoadOriginDatas) < 0) {
                this.mRecentSleepSportData = new DaySportData(SportDay.fromString(recentSleepSummary.date));
                HMKeeper.saveRecentSleepDay(recentSleepSummary.date);
                HMLog.d(TAG, "" + sportDayFromString.addWeek(-1).toString() + " to " + sportDayFromString.addWeek(1).toString(), new Object[0]);
                this.mBandUint.loadRecentDataBytesData(sportDayFromString.addWeek(-1).toString(), sportDayFromString.addWeek(1).toString(), true);
            }
            if (sportDayFromString2 != null && sportDayFromString2.offsetDay(this.startDayLoadOriginDatas) < 0) {
                this.mRecentStepSportData = new DaySportData(SportDay.fromString(recentStepSummary.date));
                HMKeeper.saveRecentSleepDay(recentStepSummary.date);
                HMLog.d(TAG, "" + sportDayFromString2.addWeek(-1).toString() + " to " + sportDayFromString2.addWeek(1).toString(), new Object[0]);
                this.mBandUint.loadRecentDataBytesData(sportDayFromString2.addWeek(-1).toString(), sportDayFromString2.addWeek(1).toString(), false);
            }
            this.mBandUint.loadPartialBraceletNetData(key, SportDay.getToday().getKey(), true);
            return;
        }
        if (event.getSummaryAnalysisJobType() == 0) {
            HMSummery recentSleepSummary2 = getmBandUint().getRecentSleepSummary();
            HMSummery recentStepSummary2 = getmBandUint().getRecentStepSummary();
            if (recentSleepSummary2 != null) {
                this.mRecentSleepSportData = new DaySportData(SportDay.fromString(recentSleepSummary2.date));
                HMKeeper.saveRecentSleepDay(recentSleepSummary2.date);
                getmBandUint().analysisNewDSD(this.mRecentSleepSportData, 3);
            }
            if (recentStepSummary2 != null) {
                this.mRecentStepSportData = new DaySportData(SportDay.fromString(recentStepSummary2.date));
                HMKeeper.saveRecentSleepDay(recentStepSummary2.date);
                getmBandUint().analysisNewDSD(this.mRecentStepSportData, 3);
            }
        }
    }

    public void onEvent(EventEarbudSummaryAnalysisJobFinished event) {
        HMSummery recentSleepSummary;
        new HmMixSummaryAnalysisJob(mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList, 4).start();
        if (event.getSummaryAnalysisJobType() == 1) {
            String key = this.earbudStartDayLoadOriginDatas.getKey();
            HMSummery recentSleepSummary2 = getEarbudUnit().getRecentSleepSummary();
            SportDay sportDayFromString = recentSleepSummary2 == null ? null : SportDay.fromString(recentSleepSummary2.date);
            StringBuilder sb = new StringBuilder();
            sb.append("earbudSleepStartDay = ");
            sb.append(sportDayFromString == null ? "null" : sportDayFromString.getKey());
            HMLog.i(TAG, sb.toString(), new Object[0]);
            if (sportDayFromString != null && sportDayFromString.offsetDay(this.earbudStartDayLoadOriginDatas) < 0) {
                this.mEarbudRecentSleepSportData = new DaySportData(SportDay.fromString(recentSleepSummary2.date));
                HMLog.d(TAG, "" + sportDayFromString.addWeek(-1).toString() + " to " + sportDayFromString.addWeek(1).toString(), new Object[0]);
                getEarbudUnit().loadOriginData(sportDayFromString.addWeek(-1).toString(), sportDayFromString.addWeek(1).toString(), false);
            }
            getEarbudUnit().loadOriginData(key, SportDay.getToday().getKey(), true);
            return;
        }
        if (event.getSummaryAnalysisJobType() != 0 || (recentSleepSummary = getEarbudUnit().getRecentSleepSummary()) == null) {
            return;
        }
        this.mEarbudRecentSleepSportData = new DaySportData(SportDay.fromString(recentSleepSummary.date));
        getEarbudUnit().analysisNewDSD(this.mEarbudRecentSleepSportData, 3);
    }
}
