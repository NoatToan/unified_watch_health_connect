package com.huawei.hwadpaterhealthmgr;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.routes.AppRoute$$Info$$HuaweiHealth;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.sport.model.AnnualWorkoutRecord;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.MenstrualModule;
import com.huawei.operation.operationactivity.OperationActivityCallback;
import com.huawei.operation.operationactivity.OperationActivityPuller;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.TrackData;
import com.huawei.pluginachievement.manager.service.OnceMovementReceiver;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.ui.openservice.db.model.OpenService;
import com.huawei.ui.openservice.db.model.UserServiceAuth;
import defpackage.ddv;
import defpackage.drw;
import defpackage.etn;
import defpackage.ive;
import defpackage.lky;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nlt;
import defpackage.nsj;
import defpackage.nsk;
import defpackage.ntx;
import defpackage.nty;
import defpackage.oru;
import defpackage.oxi;
import defpackage.paw;
import defpackage.pcd;
import defpackage.pea;
import defpackage.pez;
import defpackage.xjn;
import defpackage.xjo;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HwEncryptUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class PluginAchieveAdapterImpl implements PluginAchieveAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16922c;
    private static int d;
    private static int e;
    private static int f;
    private static int h;
    private static int j;

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public Map<String, String> getInfo(String[] strArr) {
        return xjo.a(strArr);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void startWebActivityForResult(Context context, String str) {
        xjo.c(context, str);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public String generateMessage(MessageObject messageObject) {
        return xjn.e(messageObject);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void deleteMessage(String str) {
        LogUtil.d("PluginAchieveAdapterImpl", "msgId=" + str);
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).deleteMessage(str);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getTotalCalorie(AchieveCallback achieveCallback, Context context) {
        LogUtil.a("PluginAchieveAdapterImpl", "getTotalCalorie enter.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c(countDownLatch);
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "getTotalCalorie.await(): catch a InterruptedException");
        }
        LogUtil.a("PluginAchieveAdapterImpl", "getTotalCalorie toReadCalorieData.");
        xjn.d(achieveCallback);
    }

    private void c(final CountDownLatch countDownLatch) {
        lky.b().e(new IFlushResult() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.3
            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onSuccess(Bundle bundle) {
                LogUtil.a("PluginAchieveAdapterImpl", "openSdkSingletonInit flush data onSuccess.");
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onFailed(Bundle bundle) {
                LogUtil.j("PluginAchieveAdapterImpl", "openSdkSingletonInit flush data from stepMoudle to account studio is failed!");
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onServiceException(Bundle bundle) {
                LogUtil.j("PluginAchieveAdapterImpl", "openSdkSingletonInit flush data onServiceException!");
                countDownLatch.countDown();
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public int getTotalFitDuration(Date date, Date date2) {
        LogUtil.a("PluginAchieveAdapterImpl", "startDate=", date, "endDate=", date2);
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        List<Map<String, Object>> recordsByDateRange = pluginSuggestion != null ? pluginSuggestion.getRecordsByDateRange(date, date2) : null;
        int i = 0;
        if (recordsByDateRange != null) {
            for (Map<String, Object> map : recordsByDateRange) {
                if (map.get("totalduration") != null) {
                    try {
                        i += Integer.parseInt(String.valueOf(map.get("totalduration")));
                    } catch (NumberFormatException unused) {
                        LogUtil.e("PluginAchieveAdapterImpl", "getTotalFitDuration NumberFormatException");
                    }
                }
            }
        }
        return i;
    }

    private void e(final AchieveCallback achieveCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        String[] strArr = {ParsedFieldTag.STEP_SUM};
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setType(new int[]{40002});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setTimeRange(HiDateUtil.p(System.currentTimeMillis()), HiDateUtil.g(System.currentTimeMillis()));
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.11
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (!njy.e(list)) {
                    int unused = PluginAchieveAdapterImpl.f = list.get(0).getInt(ParsedFieldTag.STEP_SUM);
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(i, Integer.valueOf(PluginAchieveAdapterImpl.f));
                        return;
                    }
                    return;
                }
                LogUtil.j("PluginAchieveAdapterImpl", " readAggregateData null");
                AchieveCallback achieveCallback3 = achieveCallback;
                if (achieveCallback3 != null) {
                    achieveCallback3.onResponse(i, 0);
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void toReadAggregateData(final AchieveCallback achieveCallback, Context context, long j2, long j3) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        String[] strArr = {ParsedFieldTag.STEP_SUM, ParsedFieldTag.CALORIES_SUM};
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setType(new int[]{40002, 40003});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setTimeRange(j2, j3);
        HiHealthManager.d(context).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.22
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    achieveCallback.onResponse(100001, null);
                } else {
                    achieveCallback.onResponse(0, list);
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getTrackSumDistanceData(Context context, long j2, long j3, int i, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", " getTrackSumDistanceData ");
        ArrayList arrayList = new ArrayList();
        arrayList.add(xjn.c(j2, j3, i));
        HiHealthManager.d(context).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.23
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i2, int i3) {
                if (sparseArray == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "getTrackSumDistanceData data is null");
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(i2, null);
                        return;
                    }
                    return;
                }
                if (achieveCallback != null) {
                    achieveCallback.onResponse(0, sparseArray.get(0));
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getSumData(Context context, long j2, long j3, int i, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", " getSumData ");
        ArrayList arrayList = new ArrayList();
        arrayList.add(xjn.b(j2, j3, i));
        HiHealthManager.d(context).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.21
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i2, int i3) {
                if (sparseArray == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "getSumData data is null");
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(i2, null);
                        return;
                    }
                    return;
                }
                if (achieveCallback != null) {
                    achieveCallback.onResponse(0, sparseArray.get(0));
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getWeightData(Context context, long j2, long j3, AchieveCallback achieveCallback) {
        xjn.c(context, j2, j3, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getTrackListData(Context context, long j2, long j3, final int i, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", " getTrackListData ");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, j3);
        hiDataReadOption.setType(new int[]{xjn.e(i)});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.24
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "getTrackSumList return data is null.");
                    achieveCallback.onResponse(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "getTrackSumList return map is empty.");
                    achieveCallback.onResponse(-1, null);
                } else {
                    achieveCallback.onResponse(0, sparseArray.get(xjn.e(i)));
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void fetchSequenceDataBySportType(Context context, long j2, long j3, int i, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", " fetchSequenceDataBySportType ");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, j3);
        hiDataReadOption.setType(i != 0 ? xjn.c(i) : null);
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(context).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.28
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (achieveCallback == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "fetchSequenceDataBySportType achieveCallback is null.");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PluginAchieveAdapterImpl", "fetchSequenceDataBySportType return data is error.");
                    achieveCallback.onResponse(i2, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "fetchSequenceDataBySportType return map is empty.");
                    achieveCallback.onResponse(i2, null);
                } else {
                    achieveCallback.onResponse(0, sparseArray.get(i2));
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getSumYearData(Context context, long j2, long j3, int i, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", " getSumYearData ");
        if (i == 22) {
            d(context, j2, HiDateUtil.g(System.currentTimeMillis()), achieveCallback);
        } else if (i == 23) {
            d(context, j2, j3, achieveCallback);
        } else {
            HiHealthManager.d(context).aggregateHiHealthData(xjn.e(j2, j3, i), new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.27
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i2, int i3) {
                    if (achieveCallback != null) {
                        LogUtil.a("PluginAchieveAdapterImpl", "getSumYearData success");
                        AchieveCallback achieveCallback2 = achieveCallback;
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                        achieveCallback2.onResponse(0, list);
                    }
                }
            });
        }
    }

    private void d(Context context, long j2, long j3, final AchieveCallback achieveCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, j3);
        hiDataReadOption.setType(new int[]{40002, 40003, 40004});
        try {
            HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.29
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (achieveCallback != null) {
                        LogUtil.a("PluginAchieveAdapterImpl", "getSumYearData success");
                        AchieveCallback achieveCallback2 = achieveCallback;
                        if (obj == null) {
                            obj = Collections.EMPTY_LIST;
                        }
                        achieveCallback2.onResponse(0, obj);
                    }
                }
            });
        } catch (Exception unused) {
            if (achieveCallback != null) {
                achieveCallback.onResponse(0, Collections.EMPTY_LIST);
            }
            LogUtil.e("PluginAchieveAdapterImpl", "requestTotalDetailData Exception");
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getReportStatistics(Context context, long j2, long j3, int i, final AchieveCallback achieveCallback) {
        HiAggregateOption hiAggregateOptionD;
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            hiAggregateOptionD = d(j2, j3);
        } else {
            if (i != 4) {
                if (achieveCallback != null) {
                    achieveCallback.onResponse(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, null);
                    return;
                }
                return;
            }
            hiAggregateOptionD = e(j2, j3);
        }
        arrayList.add(hiAggregateOptionD);
        HiHealthManager.d(context).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i2, int i3) {
                if (achieveCallback != null) {
                    if (sparseArray == null) {
                        LogUtil.j("PluginAchieveAdapterImpl", "aggregateHiHealthDataEx data is null");
                        achieveCallback.onResponse(i2, null);
                    } else {
                        achieveCallback.onResponse(0, sparseArray.get(0));
                    }
                }
            }
        });
    }

    private HiAggregateOption d(long j2, long j3) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(j3);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setReadType(0);
        int[] iArrA = a();
        hiAggregateOption.setConstantsKey(d());
        hiAggregateOption.setType(iArrA);
        return hiAggregateOption;
    }

    private int[] a() {
        return new int[]{Constants.REBACK_MARKET_ENTRANCE, 40003, 42005, 42008, 40022, 42152, 42154, 40023, 42155, 42156, 42160, 42202, 42204, 42205, 42206, 40024, 40021, 42052, 42054, 42055, 42056};
    }

    private String[] d() {
        return new String[]{"Track_Duration_Sum", "sport_calorie_sum", "Track_Count_Sum", "Track_Abnormal_Count_Sum", "sport_run_calorie_sum", "Track_Ride_Distance_Sum", "Track_Ride_Duration_Sum", "sport_cycle_calorie_sum", "Track_Ride_Count_Sum", "Track_Ride_Abnormal_Count_Sum", "Track_Ride_CreepingWave", "Track_Swim_Distance_Sum", "Track_Swim_Duration_Sum", "Track_Swim_Count_Sum", "Track_Swim_Abnormal_Count_Sum", "sport_climb_calorie_sum", "sport_walk_calorie_sum", "Track_Walk_Distance_Sum", "Track_Walk_Duration_Sum", "Track_Walk_Count_Sum", "Track_Walk_Abnormal_Count_Sum"};
    }

    private HiAggregateOption e(long j2, long j3) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(j3);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(new String[]{"Track_Ride_Longest_Distance", "Track_Swim_Longest_Distance"});
        hiAggregateOption.setType(new int[]{42158, 42208});
        return hiAggregateOption;
    }

    public static void b(int i, int i2, int i3, int i4) {
        if (nty.d()) {
            LogUtil.j("PluginAchieveAdapterImpl", "sendThreeCircleChangeData app is sportOrFitting!");
            return;
        }
        if (i < e || i3 < f16920a) {
            d = 0;
            h = 0;
        }
        if (c(i, i2, i3, i4)) {
            LogUtil.a("PluginAchieveAdapterImpl", "threeCircle cd:", Integer.valueOf(i), " cg:", Integer.valueOf(i2), " wd:", Integer.valueOf(i3), " wg:", Integer.valueOf(i4));
            if (i < i2) {
                d = 0;
            }
            if (i3 < i4) {
                h = 0;
            }
            if (i2 > 0 && i >= i2) {
                b(i, i2);
            }
            if (i4 <= 0 || i3 < i4) {
                return;
            }
            a(i3, i4);
        }
    }

    private static boolean c(int i, int i2, int i3, int i4) {
        boolean z = (i == e && i3 == f16920a && i2 == f16922c && i4 == f16921b) ? false : true;
        if (z) {
            e = i;
            f16920a = i3;
            f16922c = i2;
            f16921b = i4;
        }
        return z;
    }

    public static void b(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = i / i2;
        LogUtil.a("PluginAchieveAdapterImpl", "sendThreeCircleChangeData caloriesData:", Integer.valueOf(i), " caloriesGoal:", Integer.valueOf(i2), " ratio:", Integer.valueOf(i3), " mCalRatio:", Integer.valueOf(d));
        if (i3 != d) {
            d = i3;
            OnceMovementReceiver.c(e("D1", i3, System.currentTimeMillis()));
        }
    }

    public static void a(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = i / i2;
        LogUtil.a("PluginAchieveAdapterImpl", "sendThreeCircleChangeData workoutData:", Integer.valueOf(i), " workoutGoal:", Integer.valueOf(i2), " ratio:", Integer.valueOf(i3), " mWorkoutRatio:", Integer.valueOf(h));
        if (i3 != h) {
            h = i3;
            OnceMovementReceiver.c(e("D2", i3, System.currentTimeMillis()));
        }
    }

    private static Bundle e(String str, int i, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("dataType", str);
        bundle.putInt("dataLevel", i);
        bundle.putLong("timestamp", j2);
        LogUtil.a("PluginAchieveAdapterImpl", "getThreeCircleBundle type:", str, " ratio:", Integer.valueOf(i), " currentTime:", Long.valueOf(j2));
        return bundle;
    }

    public static void d(int i) {
        if (i < j) {
            j = 0;
        }
        if (i - j >= 100) {
            LogUtil.a("PluginAchieveAdapterImpl", "steps =" + i);
            HashMap map = new HashMap();
            map.put("step", Integer.valueOf(i));
            j = i;
            if (i > 500) {
                LogUtil.a("PluginAchieveAdapterImpl", "setCurrentSteps kaka task steps = ", Integer.valueOf(i));
                oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_STEPS_REACH_THREE_THOUSAND), map);
            }
        }
        f = i;
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getTotalSteps(AchieveCallback achieveCallback) {
        e(achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoAllDeviceBinding(Context context) {
        LogUtil.a("PluginAchieveAdapterImpl", "gotoAllDeviceBinding isSwitchPage true");
        etn.a(context, (String) null);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void startMyTargetActivity(Context context) {
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context.getPackageName(), "com.huawei.ui.main.stories.me.activity.MyTargetActivity");
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "startMyTargetActivity: ActivityNotFoundException");
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void startInputWeight(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity");
        context.startActivity(intent);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoBondDevice(Context context, String str) {
        etn.a(context, str);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoMeasureDeivice(Context context, String str) {
        if (getBondResult(str)) {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
            intent.putExtra("kind", str);
            intent.putExtra("view", "MeasureDevice");
            context.startActivity(intent);
            return;
        }
        gotoBondDevice(context, str);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public boolean getBondResult(String str) {
        return drw.e().j(str);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoFitness() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(BaseApplication.getContext());
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoTrainDetailActivity(String str, String str2) {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId(str2);
        workoutRecord.saveWorkoutName(str);
        workoutRecord.savePlanId("");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord);
        pea.b(BaseApplication.getContext(), new pcd(str2), (ArrayList<WorkoutRecord>) arrayList);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoFitnessRecord() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, 10001);
        Context context = BaseApplication.getContext();
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value(), map, 0);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), Constants.SPORT_HISTORY);
        intent.setFlags(268435456);
        intent.putExtra(BleConstants.SPORT_TYPE, 10001);
        context.startActivity(intent);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoShumianService(Context context, final String str) {
        final OpenServiceControl openServiceControl = OpenServiceControl.getInstance(context);
        final OpenService openServiceQueryServiceByID = openServiceControl.queryServiceByID(KakaConstants.DECOMPRESSI0N);
        if (openServiceQueryServiceByID == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "gotoShumianService openService is null");
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.4
            @Override // java.lang.Runnable
            public void run() {
                UserServiceAuth userServiceAuthQueryServiceAuth = openServiceControl.queryServiceAuth(str, openServiceQueryServiceByID.getServiceID());
                if (userServiceAuthQueryServiceAuth == null || userServiceAuthQueryServiceAuth.fetchAuthType() == 0) {
                    PluginAchieveAdapterImpl.this.b(openServiceControl, openServiceQueryServiceByID.getServiceID(), str);
                }
            }
        });
        a(openServiceQueryServiceByID, context);
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoSleepDetailPage(Context context) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=1"));
        intent.setPackage(context.getPackageName());
        lsx.c(intent, context);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoBubuBaoService(Context context, final String str) {
        final OpenServiceControl openServiceControl = OpenServiceControl.getInstance(context);
        final OpenService openServiceQueryServiceByID = openServiceControl.queryServiceByID(KakaConstants.DECOMPRESSI0N_ABBUBUBAO);
        if (openServiceQueryServiceByID == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "gotoShumianService openService is null");
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.5
            @Override // java.lang.Runnable
            public void run() {
                UserServiceAuth userServiceAuthQueryServiceAuth = openServiceControl.queryServiceAuth(str, openServiceQueryServiceByID.getServiceID());
                if (userServiceAuthQueryServiceAuth == null || userServiceAuthQueryServiceAuth.fetchAuthType() == 0) {
                    PluginAchieveAdapterImpl.this.b(openServiceControl, openServiceQueryServiceByID.getServiceID(), str);
                }
            }
        });
        a(openServiceQueryServiceByID, context);
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoSecIBaoService(Context context, final String str) {
        final OpenServiceControl openServiceControl = OpenServiceControl.getInstance(context);
        final OpenService openServiceQueryServiceByID = openServiceControl.queryServiceByID(KakaConstants.DECOMPRESSI0N_DONGBAO);
        if (openServiceQueryServiceByID == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "gotoSecIBaoService openService is null");
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.2
            @Override // java.lang.Runnable
            public void run() {
                UserServiceAuth userServiceAuthQueryServiceAuth = openServiceControl.queryServiceAuth(str, openServiceQueryServiceByID.getServiceID());
                if (userServiceAuthQueryServiceAuth == null || userServiceAuthQueryServiceAuth.fetchAuthType() == 0) {
                    PluginAchieveAdapterImpl.this.b(openServiceControl, openServiceQueryServiceByID.getServiceID(), str);
                }
            }
        });
        a(openServiceQueryServiceByID, context);
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoRunRecord(Context context) {
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context.getPackageName(), Constants.SPORT_HISTORY);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "gotoRunRecord Exception");
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoStepRecord(Context context) {
        try {
            Intent intent = new Intent();
            intent.putExtra("today_current_steps_total", f);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context.getPackageName(), PersonalData.CLASS_NAME_PERSONAL_HISTORY_BEST);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "gotoStepRecord Exception");
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoWeChatActivity(Context context) {
        Intent launchIntentForPackage;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(BaseApplication.getAppPackage())) == null) {
            return;
        }
        launchIntentForPackage.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.thirdpartservice.activity.ThirdPartServiceActivity"));
        launchIntentForPackage.addFlags(268435456);
        context.startActivity(launchIntentForPackage);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public String getEncryptData(String str, Context context) {
        try {
            return HwEncryptUtil.b(context).e(2, str);
        } catch (Exception unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "getEncryptData Exception");
            return "default";
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public String decryptData(String str, Context context) {
        try {
            return HwEncryptUtil.b(context).c(2, str);
        } catch (Exception unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "decryptData Exception");
            return "default";
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoTrackDetailData(Context context, long j2, long j3) {
        if (j3 < j2 || j3 == 1 + j2) {
            c(context, j2, j3);
        } else {
            e(context, j2, j3);
        }
    }

    public void c(final Context context, final long j2, long j3) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, j3);
        hiDataReadOption.setType(new int[]{30002});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.8
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackMetadata data is null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackMetadata map size is 0");
                    return;
                }
                List list = (List) sparseArray.get(30002);
                if (njy.e(list)) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackMetadata list is null");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackMetadata hiHealthData is null");
                    return;
                }
                long endTime = hiHealthData.getEndTime();
                LogUtil.a("PluginAchieveAdapterImpl", "hiHealthData=", hiHealthData.toString(), "endTime is", Long.valueOf(endTime));
                PluginAchieveAdapterImpl.this.e(context, j2, endTime);
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void readBestStepDayOfYear(Context context, long j2, long j3, final AchieveCallback achieveCallback) {
        readStepDataAsDayUnit(context, j2, j3, 3, new AchieveCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.6
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "readBestStepDayOfYear obj is null");
                    achieveCallback.onResponse(-1, null);
                } else {
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(0, obj);
                    }
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void readEveryMonthStepsOfYear(Context context, long j2, long j3, final AchieveCallback achieveCallback) {
        readStepDataAsDayUnit(context, j2, j3, 5, new AchieveCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.9
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "readEveryMonthStepsOfYear obj is null");
                    achieveCallback.onResponse(-1, null);
                } else {
                    AchieveCallback achieveCallback2 = achieveCallback;
                    if (achieveCallback2 != null) {
                        achieveCallback2.onResponse(0, obj);
                    }
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void readStepDataAsDayUnit(Context context, long j2, long j3, final int i, final AchieveCallback achieveCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j2);
        hiAggregateOption.setEndTime(j3);
        hiAggregateOption.setAggregateType(1);
        int i2 = i == 6 ? 5 : i;
        String[] strArrA = xjn.a(40002);
        int[] iArrB = xjn.b(40002);
        hiAggregateOption.setConstantsKey(strArrA);
        hiAggregateOption.setType(iArrB);
        hiAggregateOption.setGroupUnitType(i2);
        hiAggregateOption.setReadType(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        HiHealthManager.d(context).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.7
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i3, int i4) {
                if (sparseArray == null) {
                    achieveCallback.onResponse(-1, null);
                    return;
                }
                if (sparseArray.size() == 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "readStepDataAsDayUnit the data is null");
                    achieveCallback.onResponse(-1, null);
                    return;
                }
                List<HiHealthData> list = sparseArray.get(0);
                a aVar = new a();
                if (i == 3 && !njy.e(list)) {
                    achieveCallback.onResponse(0, xjn.a(list, aVar));
                } else if (i == 5) {
                    achieveCallback.onResponse(0, list);
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "hiGroupUnitType not match");
                }
            }
        });
    }

    public static class a implements Serializable, Comparator<HiHealthData> {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return paw.b(hiHealthData.getFloat("sum"), hiHealthData2.getFloat("sum"));
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getTrackDetailDataByTimestamp(Context context, long j2, long j3, AchieveCallback achieveCallback) {
        if (j3 < j2 || j3 == 1 + j2) {
            xjn.b(context, j2, j3, achieveCallback);
        } else {
            xjn.a(context, j2, j3, achieveCallback);
        }
    }

    public void e(Context context, long j2, long j3) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j2, j3);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.10
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackDetail data is null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackDetail map size is 0");
                    return;
                }
                List list = (List) sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                if (njy.e(list)) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackDetail list is null");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "gotoTrackDetail hiHealthData is null");
                    return;
                }
                MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
                String strC = nlt.c(hiHealthData, motionPathSimplify);
                motionPathSimplify.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
                motionPathSimplify.saveProductId(hiHealthData.getString("device_prodid"));
                motionPathSimplify.saveSubProductId(hiHealthData.getString("device_subprodid"));
                if (strC == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "fileUrl is null");
                    return;
                }
                LogUtil.a("PluginAchieveAdapterImpl", "gotoTrackDetailData is success!");
                ive.c().init(BaseApplication.getContext());
                ive.c().b(strC, motionPathSimplify);
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public String getExchangeUrl(Context context) {
        return xjo.b(context);
    }

    private void a(OpenService openService, Context context) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("url", openService.getServiceUrl());
        intent.putExtra("EXTRA_BI_ID", openService.getServiceID());
        intent.putExtra("EXTRA_BI_NAME", openService.getProductName());
        intent.putExtra("EXTRA_BI_SOURCE", AppRoute$$Info$$HuaweiHealth.M_14);
        intent.putExtra("type", Constants.OPEN_SERVICE_TYPE);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(OpenServiceControl openServiceControl, String str, String str2) {
        UserServiceAuth userServiceAuth = new UserServiceAuth();
        userServiceAuth.configHuid(str2);
        userServiceAuth.configAuthType(1);
        userServiceAuth.configServiceID(str);
        openServiceControl.insertOrUpdateUserAuth(userServiceAuth);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualSleepReport(Context context, long j2, long j3, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", "getAnnualSleepReport with startTime = ", Long.valueOf(j2), "endTime=", Long.valueOf(j3));
        HiAggregateOption hiAggregateOptionC = xjn.c();
        hiAggregateOptionC.setStartTime(j2);
        hiAggregateOptionC.setEndTime(j3);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionC, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.14
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (list == null) {
                    achieveCallback.onResponse(100001, null);
                } else if (list.isEmpty()) {
                    achieveCallback.onResponse(100001, null);
                } else {
                    LogUtil.a("PluginAchieveAdapterImpl", "getAnnualSleepReport success");
                    achieveCallback.onResponse(i, xjn.a(list));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                achieveCallback.onResponse(100001, null);
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getLatestSleepDatas(long j2, long j3, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", "start getLatestSleepDatas() ");
        HiAggregateOption hiAggregateOptionC = xjn.c();
        hiAggregateOptionC.setStartTime(j2);
        hiAggregateOptionC.setEndTime(j3);
        hiAggregateOptionC.setSortOrder(1);
        hiAggregateOptionC.setCount(1);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionC, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.12
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("PluginAchieveAdapterImpl", "getLatestSleepDatas onResultIntent intentType = ", Integer.valueOf(i));
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualFitnessReport(Context context, final long j2, final long j3, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", "getAnnualFitnessReport with startTime =" + j2 + "enTime:" + j3);
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "getAllWorkoutRecord recordApi is null.");
        } else {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).a(), new IBaseResponseCallback() { // from class: lkz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    PluginAchieveAdapterImpl.e(achieveCallback, j2, j3, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void e(AchieveCallback achieveCallback, long j2, long j3, int i, Object obj) {
        if (achieveCallback == null) {
            return;
        }
        if (obj != null) {
            List<WorkoutRecord> arrayList = new ArrayList();
            try {
                arrayList = (List) obj;
            } catch (ClassCastException unused) {
                LogUtil.e("PluginAchieveAdapterImpl", "getAnnualFitnessReport data ClassCastException");
            }
            ArrayList arrayList2 = new ArrayList();
            for (WorkoutRecord workoutRecord : arrayList) {
                if (workoutRecord.acquireExerciseTime() >= j2 && workoutRecord.acquireExerciseTime() <= j3) {
                    AnnualReportFitnessRaw annualReportFitnessRaw = new AnnualReportFitnessRaw();
                    annualReportFitnessRaw.saveWorkoutName(workoutRecord.acquireWorkoutName());
                    annualReportFitnessRaw.saveWorkoutId(workoutRecord.acquireWorkoutId());
                    annualReportFitnessRaw.saveDuring(workoutRecord.getDuration());
                    annualReportFitnessRaw.saveExerciseTime(workoutRecord.acquireExerciseTime());
                    annualReportFitnessRaw.saveWorkoutDate(workoutRecord.acquireWorkoutDate());
                    arrayList2.add(annualReportFitnessRaw);
                }
            }
            achieveCallback.onResponse(0, arrayList2);
            return;
        }
        achieveCallback.onResponse(i, null);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualFitnessRecord(Context context, final long j2, final long j3, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", "getAnnualFitnessReport with startTime =", Long.valueOf(j2), "enTime:", Long.valueOf(j3));
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "getAllAnnualWorkoutRecord recordApi is null.");
        } else {
            recordApi.acquireAnnualExerciseRecordByAll(new ResultCallback() { // from class: llc
                @Override // com.huawei.health.suggestion.ResultCallback
                public final void onResult(int i, Object obj) {
                    PluginAchieveAdapterImpl.d(achieveCallback, j2, j3, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void d(AchieveCallback achieveCallback, long j2, long j3, int i, Object obj) {
        if (achieveCallback == null) {
            LogUtil.j("PluginAchieveAdapterImpl", "getAnnualFitnessRecord achieveCallback is empty");
            return;
        }
        if (!(obj instanceof List)) {
            LogUtil.j("PluginAchieveAdapterImpl", "getAnnualFitnessRecord: !(data instanceof List)");
            achieveCallback.onResponse(i, null);
            return;
        }
        List<AnnualWorkoutRecord> arrayList = new ArrayList();
        try {
            arrayList = (List) obj;
        } catch (ClassCastException unused) {
            LogUtil.e("PluginAchieveAdapterImpl", "getAnnualFitnessReport data ClassCastException");
            achieveCallback.onResponse(i, null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (AnnualWorkoutRecord annualWorkoutRecord : arrayList) {
            if (annualWorkoutRecord.acquireExerciseTime() >= j2 && annualWorkoutRecord.acquireExerciseTime() <= j3) {
                AnnualReportFitnessRaw annualReportFitnessRaw = new AnnualReportFitnessRaw();
                annualReportFitnessRaw.saveWorkoutName(annualWorkoutRecord.acquireWorkoutName());
                annualReportFitnessRaw.saveDuring(annualWorkoutRecord.getDuration());
                annualReportFitnessRaw.saveExerciseTime(annualWorkoutRecord.acquireExerciseTime());
                annualReportFitnessRaw.saveWorkoutDate(annualWorkoutRecord.acquireWorkoutDate());
                annualReportFitnessRaw.setPrimaryClassify(annualWorkoutRecord.getPrimaryClassify());
                annualReportFitnessRaw.setSecondClassify(annualWorkoutRecord.getSecondClassify());
                annualReportFitnessRaw.saveCalorie(annualWorkoutRecord.acquireActualCalorie());
                annualReportFitnessRaw.saveWorkoutId(annualWorkoutRecord.acquireWorkoutId());
                annualReportFitnessRaw.saveVersion(annualWorkoutRecord.acquireVersion());
                arrayList2.add(annualReportFitnessRaw);
            }
        }
        achieveCallback.onResponse(0, arrayList2);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void readSingleTrackData(Context context, long j2, long j3, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        LogUtil.a("PluginAchieveAdapterImpl", "readSingleTrackData 1km!");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{30002});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setTimeInterval(HiDateUtil.p(j2), HiDateUtil.g(j3));
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.13
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("PluginAchieveAdapterImpl", "achieve 1km kaka onResult enter");
                if (i != 0 || obj == null) {
                    LogUtil.j("PluginAchieveAdapterImpl", "achieve 1km kaka fail! errorcode = ", Integer.valueOf(i), "&& anchor is ", Integer.valueOf(i2));
                    iBaseResponseCallback.a(i, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                Object obj2 = sparseArray.get(30002);
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PluginAchieveAdapterImpl", "achieve 1km kaka trackdata from DataStudio is none");
                    iBaseResponseCallback.a(i, null);
                } else {
                    List list = (List) obj2;
                    LogUtil.a("PluginAchieveAdapterImpl", "achieve 1km kaka obtainFrom DataStudio Achieve size is ", Integer.valueOf(list.size()));
                    iBaseResponseCallback.a(i, list);
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void sendTrackData(Context context, ArrayList<TrackData> arrayList) {
        LogUtil.a("PluginAchieveAdapterImpl", "sendTrackData maxSingleTrack.size == ", Integer.valueOf(arrayList.size()));
        OnceMovementReceiver.d(context, arrayList);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getOtherSportSumDatas(int i, AchieveCallback achieveCallback) {
        e(i, 6, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getFitSportSumDatas(int i, AchieveCallback achieveCallback) {
        c(i, 6, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getOtherFitSportSumData(int i, AchieveCallback achieveCallback) {
        d(i, 6, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getFitSportEverydayRecords(int i, AchieveCallback achieveCallback) {
        c(i, 3, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getOtherFitSportEverydayRecords(int i, AchieveCallback achieveCallback) {
        d(i, 3, achieveCallback);
    }

    private void c(int i, int i2, final AchieveCallback achieveCallback) {
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setGroupUnitType(i2);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"duration_sum", "count_sum", "ab_count_sum", "golf_swing_sum"});
        hiSportStatDataAggregateOption.setType(new int[]{4, 5, 6, 23});
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setTimeRange(jA, jA2);
        HiHealthManager.d(BaseApplication.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.15
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i3, list);
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "getNewSportData achieveCallback is empty");
                }
            }
        });
    }

    private void e(int i, int i2, final AchieveCallback achieveCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(oxi.a(i, true));
        hiAggregateOption.setEndTime(oxi.a(i, false));
        hiAggregateOption.setType(new int[]{42055, 42056, 42105, 42106, 42155, 42156, 42205, 42206, 42304, 42311, 42405, 42406, 42413, 42404});
        hiAggregateOption.setConstantsKey(new String[]{"Track_Walk_Count_Sum", "Track_Walk_Abnormal_Count_Sum", "Track_Run_Count_Sum", "Track_Run_Abnormal_Count_Sum", "Track_Ride_Count_Sum", "Track_Ride_Abnormal_Count_Sum", "swim_count_sum", "swim_ab_count_sum", "basketball_count_sum", "basketball_ab_count_sum", "golf_count_sum", "golf_ab_count_sum", "golf_swing_sum", "golf_duration_sum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(i2);
        hiAggregateOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.16
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i3, PluginAchieveAdapterImpl.this.e(list));
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "getOtherSportSumDatas achieveCallback is empty");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(16);
        if (njy.e(list)) {
            return arrayList;
        }
        HiHealthData hiHealthData = list.get(0);
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.putInt("hihealth_type", 262);
        hiHealthData2.putDouble("count_sum", ((Double) hiHealthData.get("swim_count_sum")).doubleValue());
        hiHealthData2.putDouble("ab_count_sum", ((Double) hiHealthData.get("swim_ab_count_sum")).doubleValue());
        arrayList.add(hiHealthData2);
        HiHealthData hiHealthData3 = new HiHealthData();
        hiHealthData3.putInt("hihealth_type", OldToNewMotionPath.SPORT_TYPE_BASKETBALL);
        hiHealthData3.putDouble("count_sum", ((Double) hiHealthData.get("basketball_count_sum")).doubleValue());
        hiHealthData3.putDouble("ab_count_sum", ((Double) hiHealthData.get("basketball_ab_count_sum")).doubleValue());
        arrayList.add(hiHealthData3);
        arrayList.add(b(hiHealthData));
        HiHealthData hiHealthData4 = new HiHealthData();
        hiHealthData4.putInt("hihealth_type", 257);
        hiHealthData4.putDouble("count_sum", ((Double) hiHealthData.get("Track_Walk_Count_Sum")).doubleValue());
        hiHealthData4.putDouble("ab_count_sum", ((Double) hiHealthData.get("Track_Walk_Abnormal_Count_Sum")).doubleValue());
        arrayList.add(hiHealthData4);
        HiHealthData hiHealthData5 = new HiHealthData();
        hiHealthData5.putInt("hihealth_type", 258);
        hiHealthData5.putDouble("count_sum", ((Double) hiHealthData.get("Track_Run_Count_Sum")).doubleValue());
        hiHealthData5.putDouble("ab_count_sum", ((Double) hiHealthData.get("Track_Run_Abnormal_Count_Sum")).doubleValue());
        arrayList.add(hiHealthData5);
        HiHealthData hiHealthData6 = new HiHealthData();
        hiHealthData6.putInt("hihealth_type", 259);
        hiHealthData6.putDouble("count_sum", ((Double) hiHealthData.get("Track_Ride_Count_Sum")).doubleValue());
        hiHealthData6.putDouble("ab_count_sum", ((Double) hiHealthData.get("Track_Ride_Abnormal_Count_Sum")).doubleValue());
        arrayList.add(hiHealthData6);
        return arrayList;
    }

    private HiHealthData b(HiHealthData hiHealthData) {
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.putInt("hihealth_type", HeartRateThresholdConfig.HEART_RATE_LIMIT);
        hiHealthData2.putDouble("count_sum", hiHealthData.getDouble("golf_count_sum"));
        hiHealthData2.putDouble("ab_count_sum", hiHealthData.getDouble("golf_ab_count_sum"));
        hiHealthData2.putDouble("golf_swing_sum", hiHealthData.getDouble("golf_swing_sum"));
        hiHealthData2.putDouble("golf_duration_sum", hiHealthData.getDouble("golf_duration_sum"));
        return hiHealthData2;
    }

    private void d(int i, int i2, final AchieveCallback achieveCallback) {
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jA);
        hiAggregateOption.setEndTime(jA2);
        hiAggregateOption.setType(new int[]{42204, 42205, 42303, 42304, 42354, 42355, 42404, 42405});
        hiAggregateOption.setConstantsKey(new String[]{"swim_duration_sum", "swim_count_sum", "basketball_duration_sum", "basketball_count_sum", "ski_duration_sum", "ski_count_sum", "golf_duration_sum", "golf_count_sum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(i2);
        hiAggregateOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.17
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i3, list);
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "getOldSportData achieveCallback is empty");
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualActivityReport(Context context, int i, final AchieveCallback achieveCallback) {
        nsk nskVar = new nsk(1, null, 4);
        nskVar.d(1);
        OperationActivityPuller.getOperationActivity(nskVar, new OperationActivityCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.20
            @Override // com.huawei.operation.operationactivity.OperationActivityCallback
            public void onResponse(int i2, List<nsj> list) {
                if (i2 == 0 && njy.b(list)) {
                    achieveCallback.onResponse(0, list);
                } else {
                    achieveCallback.onResponse(i2, null);
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualBloodSugarRecordData(int i, final AchieveCallback achieveCallback) {
        nkb.d().b(BaseApplication.getContext(), oxi.a(i, true), oxi.a(i, false), 0, new IBaseResponseCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i2, obj);
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "getAnnualBloodSugarRecordData achieveCallback is empty");
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getAnnualBloodPressureRecordData(int i, final AchieveCallback achieveCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        hiAggregateOption.setStartTime(jA);
        hiAggregateOption.setEndTime(jA2);
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.19
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i2, list);
                } else {
                    LogUtil.j("PluginAchieveAdapterImpl", "getAnnualBloodPressureRecordData achieveCallback is empty");
                }
            }
        });
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getLatestMesureDatas(long j2, long j3, int i, AchieveCallback achieveCallback) {
        xjn.a(j2, j3, i, achieveCallback);
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void gotoFitnessAllCourses() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(BaseApplication.getContext());
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void goToPhysiologicalCycle(Context context) {
        e();
    }

    private void e() {
        pez.d().launchActivity(BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: lld
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f40405b.e(context, intent);
            }
        });
    }

    public /* synthetic */ boolean e(Context context, Intent intent) {
        LogUtil.a("PluginAchieveAdapterImpl", "InstallCallback");
        j();
        return false;
    }

    private void j() {
        StringBuilder sb = new StringBuilder("#/?from=1");
        if (c() == 1) {
            sb.append("&isActived=true");
        } else {
            sb.append("&isActived=false");
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(sb.toString());
        ddv.b().initH5Pro();
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).enableOnPauseCallback().enableOnResumeCallback().setNeedSoftInputAdapter();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("menstrual", MenstrualModule.class);
        ddv.b().loadH5ProApp(BaseApplication.getContext(), "com.huawei.health.h5.cycle-calendar", builder);
    }

    private int c() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("com.huawei.health.mc");
        if (userPreference == null || HiCommonUtil.a(userPreference.getValue())) {
            LogUtil.j("PluginAchieveAdapterImpl", "MENSTRUAL_CONFIG_KEY is null!");
            return 0;
        }
        try {
            return new JSONObject(userPreference.getValue()).getInt("masterSwitch");
        } catch (JSONException unused) {
            ReleaseLogUtil.b("PluginAchieveAdapterImpl", "getMenstrualActiveState JSONException");
            return 0;
        }
    }

    @Override // com.huawei.pluginachievement.PluginAchieveAdapter
    public void getSleepDatas(long j2, long j3, final AchieveCallback achieveCallback) {
        LogUtil.a("PluginAchieveAdapterImpl", "start getSleepDatas() ");
        HiAggregateOption hiAggregateOptionC = xjn.c();
        hiAggregateOptionC.setStartTime(j2);
        hiAggregateOptionC.setEndTime(j3);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionC, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl.25
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                AchieveCallback achieveCallback2 = achieveCallback;
                if (achieveCallback2 != null) {
                    achieveCallback2.onResponse(i, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("PluginAchieveAdapterImpl", "getSleepDatas onResultIntent intentType = ", Integer.valueOf(i));
            }
        });
    }
}
