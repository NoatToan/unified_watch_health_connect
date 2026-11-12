package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.app.restheartrate.service.api.RestHeartApi;
import com.app.restheartrate.service.entity.RestHeartRate;
import com.facebook.appevents.UserDataStore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.databases.model.NewCalories;
import com.xiaomi.hm.health.databases.model.NewCaloriesDao;
import com.xiaomi.hm.health.dataprocess.DataProcessor;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ModifySleepData;
import com.xiaomi.hm.health.dataprocess.ProcessData;
import com.xiaomi.hm.health.dataprocess.SleepFluctuationData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.dataprocess.UserInfo;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.sport.OriginSportData;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventHWBandAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventRecentInfoAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.sleep.writeback.WriteSleepBack;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class HMDataAnalisisJob extends ThreadJobObject {
    private static final String k = "HMDataAnalisisJob";
    private static final int l = 30;
    private DaySportData c;
    private final int d;
    private String e;
    private boolean f;
    private final int g;
    private int h;
    private final Lazy<DeviceSnService> i;
    private final RestHeartApi j;

    public HMDataAnalisisJob(String key, int dataType, int deviceType, int pageType) {
        super(4);
        this.f = false;
        this.h = 1;
        this.i = KoinJavaComponent.inject(DeviceSnService.class);
        this.j = (RestHeartApi) KoinJavaComponent.get(RestHeartApi.class);
        this.d = dataType;
        this.g = deviceType;
        this.e = key;
        this.h = pageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(ManualData manualData) {
        return "empty data getUsrSum : " + manualData.getSummary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(int i, int i2) {
        return "start : " + i + "," + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String C(UserInfo userInfo) {
        return "all edit slp setSummary : " + this.c.getSummary(userInfo.goal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D() {
        return "OriginSportData is null or data is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String E() {
        return "merge db data :" + this.c.getSportDay().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F(int i, int i2) {
        return "startTime : " + i + "," + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String G(UserInfo userInfo) {
        return "sleepSummary = " + this.c.getSummary(userInfo.goal);
    }

    private int H(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        return calendar.get(9) == 0 ? (i * 60) + i2 : (i * 60) + i2 + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    private void I() {
        if (this.c.getSleepInfo() == null) {
            DaySportData daySportData = this.c;
            daySportData.setSleepInfo(new SleepInfo(daySportData.sportDay.getTimestamp()));
        }
        if (this.c.getStepsInfo() == null) {
            DaySportData daySportData2 = this.c;
            daySportData2.setStepsInfo(new StepsInfo(daySportData2.sportDay));
        }
        EventBus.getDefault().post(new EventDateDataAnalysisJobFinished(this.c));
    }

    private void J(int score, ManualData data) {
        try {
            JSONObject jSONObject = new JSONObject(data.getSummary());
            if (score != jSONObject.optInt("ss")) {
                jSONObject.put("ss", score);
                data.setSummary(jSONObject.toString());
                data.setSynced(0);
                HMLog.d(k, "save  : " + data.getSummary(), new Object[0]);
                HMDaoManager.getInstance().getManualDataDao().save(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void K(DateData dateData, SportDay sportDay, String summary) {
        if (dateData != null) {
            try {
                if (dateData.getData() == null || this.d != 0 || sportDay.isToday()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(N(summary, dateData.getSummary())).getJSONObject("slp");
                JSONObject jSONObject2 = new JSONObject(dateData.getSummary());
                jSONObject2.put("slp", jSONObject);
                HMLog.d(k, "更新前：：" + dateData.getSummary(), new Object[0]);
                dateData.setSummary(jSONObject2.toString());
                HMLog.d(k, "更新后：：" + dateData.getSummary(), new Object[0]);
                HMDaoManager.getInstance().getDateDataDao().insertOrReplace(dateData);
                HMDataCacheCenter.getInstance().getmBandUint().updateSummaryByDay(sportDay);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void L(ProcessData processData) {
        if (HMDataCacheCenter.getInstance().getmBandUint().getmDaySummeryArrayList().isEmpty()) {
            return;
        }
        SportDay sportDay = this.c.getSportDay();
        ArrayList arrayList = new ArrayList();
        for (int i = 30; i >= 1; i--) {
            HMSummery specifyDaySummary = HMDataCacheCenter.getInstance().getmBandUint().getSpecifyDaySummary(sportDay.addDay(-i).getKey());
            if (specifyDaySummary != null) {
                arrayList.add(specifyDaySummary);
            } else {
                arrayList.add(new HMSummery());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            if (((HMSummery) arrayList.get(i2)).sleep == null || ((HMSummery) arrayList.get(i2)).sleep.sleepMinutes <= 0) {
                iArr[i2] = 0;
                iArr2[i2] = 0;
            } else {
                iArr[i2] = H(((HMSummery) arrayList.get(i2)).sleep.st);
                iArr2[i2] = ((HMSummery) arrayList.get(i2)).sleep.sleepMinutes;
            }
        }
        processData.setSleepFluctuationData(new SleepFluctuationData(iArr, iArr2, size));
    }

    private String M(String summary, DateData dateData) {
        if (dateData != null && !TextUtils.isEmpty(dateData.getSummary()) && !TextUtils.isEmpty(summary)) {
            try {
                JSONObject jSONObject = new JSONObject(dateData.getSummary());
                if (!jSONObject.has("pai")) {
                    return summary;
                }
                JSONObject jSONObject2 = new JSONObject(summary);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pai");
                if (jSONObjectOptJSONObject == null) {
                    return summary;
                }
                jSONObject2.put("pai", jSONObjectOptJSONObject);
                HMLog.i("updatePaiInfo after", "" + jSONObject2.toString(), new Object[0]);
                return jSONObject2.toString();
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.e("updatePaiInfo err", "" + e.toString(), new Object[0]);
            }
        }
        return summary;
    }

    private String N(String summary, String oldSummary) {
        if (oldSummary != null && !TextUtils.isEmpty(oldSummary) && !TextUtils.isEmpty(summary)) {
            try {
                JSONObject jSONObject = new JSONObject(oldSummary);
                if (!jSONObject.has("slp")) {
                    return summary;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("slp");
                if (!jSONObject2.has("selected")) {
                    return summary;
                }
                JSONObject jSONObject3 = new JSONObject(summary);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("slp");
                jSONObject4.put("selected", jSONObject2.optInt("selected", 0));
                jSONObject3.put("slp", jSONObject4);
                return jSONObject3.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return summary;
    }

    private void O(SleepInfo sleepInfo, int offset) {
        if (sleepInfo != null) {
            sleepInfo.setOffset(offset);
        }
    }

    private String q(String summary, String sn) {
        if (!TextUtils.isEmpty(sn) && !TextUtils.isEmpty(summary)) {
            try {
                JSONObject jSONObject = new JSONObject(summary);
                jSONObject.put("sn", sn);
                return jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.e("addDeviceSnInfo err", "" + e.toString(), new Object[0]);
            }
        }
        return summary;
    }

    private void r(String summary, DateData todayData) {
        if (TextUtils.isEmpty(summary)) {
            return;
        }
        todayData.setStageStepsSummary(summary);
        HMDaoManager.getInstance().getDateDataDao().update(todayData);
        HMLog.d(k, "insertStageStepsIfNotExit : " + todayData.getDate(), new Object[0]);
    }

    private boolean s(HMDeviceType type) {
        return type == HMDeviceType.MILI || type == HMDeviceType.SENSORHUB || type == HMDeviceType.WATCH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t() {
        return "算法分析 start ============== " + this.c.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u() {
        return "今天的ＤＳＤ无条件走算法分析" + this.c.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String v(ManualData manualData, UserInfo userInfo) {
        return "getUsrSum : " + this.c.getKey() + ";" + manualData.getSummary() + "," + this.c.getSummary(userInfo.goal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "isManualDataSlpValid is true";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x() {
        return "set edit slp time when there was not a slp " + this.c.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String y() {
        return "sleep write back mDataType = " + this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String z() {
        return "没有数据，无法分析\u3000：\u3000" + this.c.getKey();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
        super.cancel();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        String str;
        HMDeviceSource hMDeviceSourceFromValue;
        String str2;
        String sn;
        Integer source;
        HMSummery specifyDaySummary;
        List<NewCalories> list;
        super.run();
        try {
            if (this.c == null) {
                this.c = new DaySportData(SportDay.fromString(this.e));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            HMLog.info(k, new Function0() { // from class: lr2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.t();
                }
            });
            DaySportData daySportData = new DaySportData(this.c.getSportDay().getPreDay());
            DaySportData daySportData2 = new DaySportData(this.c.getSportDay().getNextDay());
            DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(this.c.getKey());
            DateData specifyDayData2 = HMBraceletDateDataUtil.getSpecifyDayData(daySportData.getKey());
            DateData specifyDayData3 = HMBraceletDateDataUtil.getSpecifyDayData(daySportData2.getKey());
            int sleepTimeZone = Utils.getSleepTimeZone(specifyDayData2);
            final UserInfo algoUserInfo = Utils.getAlgoUserInfo();
            str = "";
            try {
                ProcessData processData = new ProcessData(this.c.sportDay, algoUserInfo, 0, 1);
                HMDataCacheCenter.getInstance().getmBandUint().parseDSDFromData(this.c, specifyDayData);
                processData.setCurData(this.c.getAlgoBinaryData());
                processData.setCurHrData(this.c.getBinaryHRDataOrigin());
                HMDataCacheCenter.getInstance().getmBandUint().parseDSDFromData(daySportData, specifyDayData2);
                processData.setPreData(daySportData.getAlgoBinaryData());
                processData.setPreHrData(daySportData.getBinaryHRDataOrigin());
                HMDataCacheCenter.getInstance().getmBandUint().parseDSDFromData(daySportData2, specifyDayData3);
                processData.setNextData(daySportData2.getAlgoBinaryData());
                if (!this.c.getSportDay().isToday()) {
                    if (specifyDayData != null && specifyDayData.getData() != null) {
                        OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                        if (originSportDataJsonToSportData != null) {
                            if (originSportDataJsonToSportData.getData() != null) {
                                if (originSportDataJsonToSportData.getData().length == 0) {
                                }
                            }
                        }
                        HMLog.info(k, new Function0() { // from class: dr2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HMDataAnalisisJob.D();
                            }
                        });
                        this.c.setDataStastus(3);
                        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.c.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                        if (manualDataUnique == null || TextUtils.isEmpty(manualDataUnique.getSummary()) || !HMDataCacheCenter.getInstance().isActivDataSynced()) {
                            this.c.setSleepInfo(new SleepInfo(this.c.getSportDay().getTimestamp()));
                        } else {
                            JSONObject jSONObject = new JSONObject(manualDataUnique.getSummary());
                            long jOptLong = jSONObject.optLong(UserDataStore.STATE);
                            long jOptLong2 = jSONObject.optLong("ed");
                            int iOptInt = jSONObject.optInt("sf");
                            if (Utils.isManualDataSlpValid(manualDataUnique.getSummary(), specifyDayData.getSummary())) {
                                processData.setModifySleepData(new ModifySleepData(H(jSONObject.optLong(UserDataStore.STATE) * 1000), H(jSONObject.optLong("ed") * 1000)));
                                L(processData);
                                DataProcessor.process(processData);
                                O(processData.getSleepInfo(), sleepTimeZone);
                                this.c.setSleepInfo(processData.getSleepInfo());
                                this.c.setStepsInfo(processData.getStepInfo());
                                if (this.c.getSleepInfo() == null) {
                                    SleepInfo sleepInfo = new SleepInfo(this.c.getSportDay().getTimestamp());
                                    this.c.setSleepInfo(sleepInfo);
                                    sleepInfo.setUserEditIdx(jOptLong * 1000, jOptLong2 * 1000, this.c.getSportDay());
                                    sleepInfo.setSleepFeeling(iOptInt);
                                } else {
                                    this.c.getSleepInfo().setUserEditIdx(jOptLong * 1000, jOptLong2 * 1000, this.c.getSportDay());
                                    this.c.getSleepInfo().setSleepFeeling(iOptInt);
                                }
                                J(this.c.getSleepInfo().getSleepScore(), manualDataUnique);
                            }
                        }
                        I();
                        return;
                    }
                    HMLog.info(k, new Function0() { // from class: jr2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.z();
                        }
                    });
                    this.c.setDataStastus(3);
                    final ManualData manualDataUnique2 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.c.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                    if (manualDataUnique2 == null || TextUtils.isEmpty(manualDataUnique2.getSummary()) || !HMDataCacheCenter.getInstance().isActivDataSynced()) {
                        this.c.setSleepInfo(new SleepInfo(this.c.getSportDay().getTimestamp()));
                    } else {
                        HMLog.info(k, new Function0() { // from class: gr2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HMDataAnalisisJob.A(manualDataUnique2);
                            }
                        });
                        JSONObject jSONObject2 = new JSONObject(manualDataUnique2.getSummary());
                        long jOptLong3 = jSONObject2.optLong(UserDataStore.STATE);
                        long jOptLong4 = jSONObject2.optLong("ed");
                        int iOptInt2 = jSONObject2.optInt("sf");
                        if (Utils.isManualDataSlpValid(manualDataUnique2.getSummary(), null)) {
                            final int iH = H(jSONObject2.optLong(UserDataStore.STATE) * 1000);
                            final int iH2 = H(jSONObject2.optLong("ed") * 1000);
                            HMLog.info(k, new Function0() { // from class: fr2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HMDataAnalisisJob.B(iH, iH2);
                                }
                            });
                            processData.setModifySleepData(new ModifySleepData(iH, iH2));
                            L(processData);
                            DataProcessor.process(processData);
                            O(processData.getSleepInfo(), sleepTimeZone);
                            this.c.setSleepInfo(processData.getSleepInfo());
                            this.c.setStepsInfo(processData.getStepInfo());
                            if (this.c.getSleepInfo() == null) {
                                SleepInfo sleepInfo2 = new SleepInfo(this.c.getSportDay().getTimestamp());
                                this.c.setSleepInfo(sleepInfo2);
                                sleepInfo2.setUserEditIdx(jOptLong3 * 1000, jOptLong4 * 1000, this.c.getSportDay());
                                sleepInfo2.setSleepFeeling(iOptInt2);
                            } else {
                                this.c.getSleepInfo().setUserEditIdx(jOptLong3 * 1000, jOptLong4 * 1000, this.c.getSportDay());
                                this.c.getSleepInfo().setSleepFeeling(iOptInt2);
                            }
                            J(this.c.getSleepInfo().getSleepScore(), manualDataUnique2);
                            HMLog.info(k, new Function0() { // from class: br2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return this.a.C(algoUserInfo);
                                }
                            });
                        }
                    }
                    I();
                    return;
                }
                HMLog.info(k, new Function0() { // from class: mr2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.u();
                    }
                });
                if (2 == this.d) {
                    HMLog.info(k, new Function0() { // from class: ir2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.E();
                        }
                    });
                    this.f = true;
                }
                ManualData manualDataUnique3 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.c.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                if (manualDataUnique3 != null && !TextUtils.isEmpty(manualDataUnique3.getSummary()) && HMDataCacheCenter.getInstance().isActivDataSynced()) {
                    JSONObject jSONObject3 = new JSONObject(manualDataUnique3.getSummary());
                    if (Utils.isManualDataSlpValid(manualDataUnique3.getSummary(), specifyDayData == null ? null : specifyDayData.getSummary())) {
                        final int iH3 = H(jSONObject3.optLong(UserDataStore.STATE) * 1000);
                        final int iH4 = H(jSONObject3.optLong("ed") * 1000);
                        HMLog.info(k, new Function0() { // from class: ar2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HMDataAnalisisJob.F(iH3, iH4);
                            }
                        });
                        processData.setModifySleepData(new ModifySleepData(iH3, iH4));
                    }
                }
                L(processData);
                DataProcessor.process(processData);
                RestHeartRate heartRateByDate = this.j.getHeartRateByDate(this.c.getKey());
                if (heartRateByDate != null && heartRateByDate.getValue() > 0 && processData.getSleepInfo() != null) {
                    processData.getSleepInfo().setRestHeartRate(heartRateByDate.getValue());
                }
                O(processData.getSleepInfo(), sleepTimeZone);
                this.c.setSleepInfo(processData.getSleepInfo());
                this.c.setStepsInfo(processData.getStepInfo());
                this.c.setDataStastus(3);
                if (HMDeviceConfig.isSurpportNewCalories() && this.c.getStepsInfo() != null && (list = HMDaoManager.getInstance().getDaoSession().getNewCaloriesDao().queryBuilder().where(NewCaloriesDao.Properties.Date.eq(this.c.getSportDay().getKey()), new WhereCondition[0]).list()) != null && !list.isEmpty()) {
                    int cal = 0;
                    for (int i = 0; i < list.size(); i++) {
                        cal += list.get(i).getCal();
                    }
                    HMLog.d(k, "total = " + cal, new Object[0]);
                    this.c.getStepsInfo().setMifitNewCalories(cal);
                }
                int i2 = this.d;
                if (1 == i2 || 2 == i2) {
                    DateDataDao dateDataDao = HMDaoManager.getInstance().getDateDataDao();
                    HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
                    HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
                    boolean zS = s(majorDeviceType);
                    String str3 = EcgData.DEFAULT_DIGIT_VALUE;
                    if (zS) {
                        String boundDeviceId = HMDeviceManager.getInstance().getBoundDeviceId(majorDeviceType);
                        sn = this.i.getValue().getSn(majorDeviceType);
                        hMDeviceSourceFromValue = HMDeviceManager.getInstance().getBoundDeviceSource(majorDeviceType);
                        str2 = boundDeviceId;
                    } else {
                        hMDeviceSourceFromValue = hMDeviceSource;
                        str2 = EcgData.DEFAULT_DIGIT_VALUE;
                        sn = str;
                    }
                    if (majorDeviceType != HMDeviceType.VDevice) {
                        str3 = str2;
                    }
                    if (hMDeviceSourceFromValue == hMDeviceSource && (source = HMBraceletDateDataUtil.getSpecifyDayData(this.e).getSource()) != null) {
                        hMDeviceSourceFromValue = HMDeviceSource.fromValue(source.intValue());
                    }
                    HMLog.i(k, "mDeviceType = " + this.g + ";device id " + str3 + ";mDataType " + this.d, new Object[0]);
                    DateData dateData = new DateData();
                    dateData.setDate(this.c.getKey());
                    dateData.setDevice_id(str3);
                    dateData.setType(Integer.valueOf(majorDeviceType.getValue()));
                    dateData.setSource(Integer.valueOf(hMDeviceSourceFromValue.getValue()));
                    dateData.setData(OriginSportData.sportDataBytesToJson(this.c.getBinaryData(), str3, hMDeviceSourceFromValue.getValue()));
                    String summary = specifyDayData == null ? str : specifyDayData.getSummary();
                    dateData.setSummary(q(M(this.c.getSummary(algoUserInfo.goal), specifyDayData), sn));
                    dateData.setSummary(N(dateData.getSummary(), summary));
                    if (this.c.getStepsInfo() != null && !this.c.getStepsInfo().getStageSteps().isEmpty()) {
                        dateData.setStageStepsSummary(this.c.getStepsInfo().getStageStepSummaryJson());
                    }
                    if (ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S, hMDeviceSourceFromValue) && specifyDayData != null && specifyDayData.getData_hr() != null && specifyDayData.getData_hr().length > 0) {
                        dateData.setData_hr(specifyDayData.getData_hr());
                    }
                    dateData.setTime_zone(Integer.valueOf(ProfileUtils.getTimezoneKey(TimeZone.getDefault())));
                    if (this.f || 1 == this.d) {
                        dateData.setSync(0);
                        dateData.setSync_qqhealth(1);
                    } else {
                        dateData.setSync(1);
                    }
                    HMLog.info(k, new Function0() { // from class: cr2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.G(algoUserInfo);
                        }
                    });
                    dateDataDao.insertOrReplace(dateData);
                } else {
                    int i3 = this.h;
                    if (i3 == 5 || i3 == 0) {
                        if (this.c.getStepsInfo() != null && specifyDayData != null) {
                            r(this.c.getStepsInfo().getStageStepSummaryJson(), specifyDayData);
                        }
                    }
                }
                final ManualData manualDataUnique4 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.c.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                if (manualDataUnique4 != null && !TextUtils.isEmpty(manualDataUnique4.getSummary())) {
                    HMLog.info(k, new Function0() { // from class: nr2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.v(manualDataUnique4, algoUserInfo);
                        }
                    });
                    JSONObject jSONObject4 = new JSONObject(manualDataUnique4.getSummary());
                    long jOptLong5 = jSONObject4.optLong(UserDataStore.STATE);
                    long jOptLong6 = jSONObject4.optLong("ed");
                    int iOptInt3 = jSONObject4.optInt("sf");
                    if (this.c.getSleepInfo() != null && HMDataCacheCenter.getInstance().isActivDataSynced()) {
                        if (Utils.isManualDataSlpValid(manualDataUnique4.getSummary(), this.c.getSummary(algoUserInfo.goal))) {
                            HMLog.info(k, new Function0() { // from class: er2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HMDataAnalisisJob.w();
                                }
                            });
                            long j = jOptLong5 * 1000;
                            long j2 = jOptLong6 * 1000;
                            this.c.getSleepInfo().setUserEditIdx(j, j2, this.c.getSportDay());
                            if (this.c.getSleepInfo().getNonRemCount() == 0 && this.c.getSleepInfo().getRemCount() == 0) {
                                HMLog.info(k, new Function0() { // from class: kr2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return this.a.x();
                                    }
                                });
                                this.c.getSleepInfo().setStartDate(new Date(j));
                                this.c.getSleepInfo().setStopDate(new Date(j2));
                            }
                            J(this.c.getSleepInfo().getSleepScore(), manualDataUnique4);
                        }
                        if (iOptInt3 > 0) {
                            this.c.getSleepInfo().setSleepFeeling(iOptInt3);
                        }
                    }
                }
                K(specifyDayData, this.c.getSportDay(), this.c.getSummary(algoUserInfo.goal));
                HMLog.i(k, "setSummary : " + this.c.getSummary(algoUserInfo.goal) + ";mDataType = " + this.d, new Object[0]);
                if (this.c.getSleepInfo() != null) {
                    HMLog.i(k, "sleep rest hr map : " + this.c.getSleepInfo().getNoRestHeartRateMap(), new Object[0]);
                }
                DateData dateDataLoad = HMDaoManager.getInstance().getDateDataDao().load(this.c.getKey());
                if (dateDataLoad != null) {
                    String summary2 = dateDataLoad.getSummary();
                    HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
                    hmEarbudDateDataUtil.replaceDeviceSelectInfo(new DeviceDataSelectInfo(this.c.getKey(), dateDataLoad.getSource() == null ? -1 : dateDataLoad.getSource().intValue(), hmEarbudDateDataUtil.summaryHasSleep(summary2, false), hmEarbudDateDataUtil.summaryIsSelect(summary2)), false);
                }
                if (this.d == 1 || this.c.getSportDay().isToday()) {
                    EventBus.getDefault().post(new EventHWBandAnalysisJobFinished(this.c, this.d, this.g));
                }
                int i4 = this.d;
                if (3 == i4) {
                    EventBus.getDefault().post(new EventRecentInfoAnalysisJobFinished(this.c.getKey()));
                } else if (4 != i4) {
                    I();
                }
                HMLog.d(k, "time used " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                if (this.d == 0 && !this.c.getSportDay().isToday() && this.c.getStepsInfo() != null && this.c.getStepsInfo().getStepsCount() > 0 && (specifyDaySummary = HMDataCacheCenter.getInstance().getmBandUint().getSpecifyDaySummary(this.c.getSportDay().getKey())) != null && specifyDaySummary.steps != null && this.c.getStepsInfo().getStepsCount() > specifyDaySummary.steps.ttl) {
                    HMLog.i(k, "update summary : " + specifyDaySummary.steps.ttl + " to " + this.c.getStepsInfo().getStepsCount(), new Object[0]);
                    specifyDaySummary.steps.ttl = this.c.getStepsInfo().getStepsCount();
                    specifyDaySummary.steps.cal = this.c.getStepsInfo().getCalories();
                    specifyDaySummary.steps.dis = this.c.getStepsInfo().getDistance();
                    specifyDaySummary.steps.runDist = this.c.getStepsInfo().getRunDistance();
                    specifyDaySummary.steps.runCal = this.c.getStepsInfo().getRunCalories();
                    specifyDaySummary.steps.rn = this.c.getStepsInfo().getRunTimeCount();
                    specifyDaySummary.steps.wk = this.c.getStepsInfo().getStepsTimeCount();
                    HMDataCacheCenter.getInstance().calculateReachGoalDays();
                    if (specifyDayData != null) {
                        specifyDayData.setSummary(this.c.getSummary(algoUserInfo.goal));
                        HMDaoManager.getInstance().getDateDataDao().insertOrReplace(specifyDayData);
                    }
                }
                if (this.h == 1 && 1 == this.d) {
                    Spo2Proxy.produceOdi(this.c.getKey());
                }
                if (1 == this.d) {
                    HMLog.info(k, new Function0() { // from class: hr2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.y();
                        }
                    });
                    WriteSleepBack.doWrite();
                }
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                exc.printStackTrace();
                HMLog.i("HMDataAnalisisJob error happen ************************* ", str + exc.getMessage(), new Object[0]);
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
        super.start();
    }

    public HMDataAnalisisJob(DaySportData todayDatas, int dataType, int deviceType) {
        super(4);
        this.f = false;
        this.h = 1;
        this.i = KoinJavaComponent.inject(DeviceSnService.class);
        this.j = (RestHeartApi) KoinJavaComponent.get(RestHeartApi.class);
        this.d = dataType;
        this.g = deviceType;
        this.c = todayDatas;
    }
}
