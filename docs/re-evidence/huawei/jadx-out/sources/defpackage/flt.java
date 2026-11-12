package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class flt {
    private static Context p;
    private UpdateUserLabel r;
    private static final int[] k = {30006, 30005, 30007, 30021, 30023};
    private static final fmd[] g = {new fmd(1.0d, "g_m"), new fmd(0.0d, "g_f"), new fmd(2.0d, "g_x")};
    private static final fmh[] n = {new fmh(0.0d, 35.0d, "weight_0_35"), new fmh(35.0d, 40.0d, "weight_36_40"), new fmh(40.0d, 45.0d, "weight_41_45"), new fmh(45.0d, 50.0d, "weight_46_50"), new fmh(50.0d, 55.0d, "weight_51_55"), new fmh(55.0d, 60.0d, "weight_56_60"), new fmh(60.0d, 65.0d, "weight_61_65"), new fmh(65.0d, 70.0d, "weight_66_70"), new fmh(70.0d, 75.0d, "weight_71_75"), new fmh(75.0d, 80.0d, "weight_76_80"), new fmh(80.0d, 85.0d, "weight_81_85"), new fmh(85.0d, 90.0d, "weight_86_90"), new fmh(90.0d, 2.147483647E9d, "weight_90+")};
    private static final fmh[] i = {new fmh(0.0d, 18.5d, "SportWeight_0"), new fmh(18.5d, 24.0d, "SportWeight_1"), new fmh(24.0d, 28.0d, "SportWeight_2"), new fmh(28.0d, 40.0d, "SportWeight_3"), new fmh(40.0d, 2.147483647E9d, "SportWeight_4")};
    private static final fmh[] e = {new fmh(0.0d, 18.0d, "age_0_18"), new fmh(18.0d, 24.0d, "age_19_24"), new fmh(24.0d, 29.0d, "age_25_29"), new fmh(29.0d, 34.0d, "age_30_34"), new fmh(34.0d, 39.0d, "age_35_39"), new fmh(39.0d, 44.0d, "age_40_44"), new fmh(44.0d, 49.0d, "age_45_49"), new fmh(49.0d, 2.147483647E9d, "age_50+")};
    private static final fmh[] o = {new fmh(0.0d, 5000.0d, "SportStep_1"), new fmh(5000.0d, 10000.0d, "SportStep_2"), new fmh(10000.0d, 13000.0d, "SportStep_3"), new fmh(13000.0d, 2.147483647E9d, "SportStep_4")};
    private static final fmh[] l = {new fmh(0.0d, 2.0d, "SportRun_1"), new fmh(2.0d, 7.0d, "SportRun_2"), new fmh(7.0d, 12.0d, "SportRun_3"), new fmh(12.0d, 2.147483647E9d, "SportRun_4")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fmh[] f34199a = {new fmh(0.0d, 2.0d, "SportBike_1"), new fmh(2.0d, 7.0d, "SportBike_2"), new fmh(7.0d, 12.0d, "SportBike_3"), new fmh(12.0d, 2.147483647E9d, "SportBike_4")};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final fmh[] f34201c = {new fmh(0.0d, 2.0d, "BloodSugar_1"), new fmh(2.0d, 8.0d, "BloodSugar_2"), new fmh(8.0d, 2.147483647E9d, "BloodSugar_3")};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fmh[] f34200b = {new fmh(0.0d, 2.0d, "BloodPressure_1"), new fmh(2.0d, 8.0d, "BloodPressure_2"), new fmh(8.0d, 2.147483647E9d, "BloodPressure_3")};
    private static final fmh[] h = {new fmh(0.0d, 7.0d, "SportLastRide_0"), new fmh(7.0d, 30.0d, "SportLastRide_1"), new fmh(30.0d, 60.0d, "SportLastRide_2"), new fmh(60.0d, 90.0d, "SportLastRide_3"), new fmh(90.0d, 2.147483647E9d, "SportLastRide_4")};
    private static final fmh[] j = {new fmh(0.0d, 7.0d, "SportLastRun_0"), new fmh(7.0d, 30.0d, "SportLastRun_1"), new fmh(30.0d, 60.0d, "SportLastRun_2"), new fmh(60.0d, 90.0d, "SportLastRun_3"), new fmh(90.0d, 2.147483647E9d, "SportLastRun_4")};
    private static final fmh[] d = {new fmh(-1.0E-6d, 0.0d, "SportUserApp_0"), new fmh(0.0d, 1.0d, "SportUserApp_1"), new fmh(1.0d, 2.0d, "SportUserApp_2"), new fmh(2.0d, 3.0d, "SportUserApp_3"), new fmh(3.0d, 8.0d, "SportUserApp_4"), new fmh(8.0d, 2.147483647E9d, "SportUserApp_5")};
    private static final fmh[] f = {new fmh(-1.0E-6d, 0.0d, "LastMaxVo2_none"), new fmh(0.0d, 28.0d, "LastMaxVo2_0_28"), new fmh(28.0d, 32.0d, "LastMaxVo2_28_32"), new fmh(32.0d, 38.0d, "LastMaxVo2_32_38"), new fmh(38.0d, 43.0d, "LastMaxVo2_38_43"), new fmh(43.0d, 48.0d, "LastMaxVo2_43_48"), new fmh(48.0d, 54.0d, "LastMaxVo2_48_54"), new fmh(54.0d, Double.MAX_VALUE, "LastMaxVo2_54+")};
    private static final fmh[] m = {new fmh(-1.0E-6d, 0.0d, "LastStressScore_none"), new fmh(0.0d, 30.0d, "LastStressScore_0_30"), new fmh(30.0d, 60.0d, "LastStressScore_30_60"), new fmh(60.0d, 80.0d, "LastStressScore_60_80"), new fmh(80.0d, 100.0d, "LastStressScore_80_100")};

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final flt f34224b = new flt();
    }

    private double d(double d2, int i2) {
        double d3;
        if (i2 == 5) {
            d3 = 60000.0d;
        } else {
            if (i2 != 13) {
                return d2;
            }
            d3 = 60.0d;
        }
        return d2 / d3;
    }

    private flt() {
    }

    public static flt k() {
        LogUtil.a("BiUserLabelHelper", "BiUserLabelHelper getInstance");
        p = BaseApplication.b();
        return e.f34224b;
    }

    public void n() {
        LogUtil.a("BiUserLabelHelper", "registerCallback");
        this.r = new UpdateUserLabel() { // from class: flx
            @Override // com.huawei.health.userlabelmgr.model.UpdateUserLabel
            public final void onUpdate() {
                this.d.l();
            }
        };
        fmc.a(p).e(this.r);
    }

    /* synthetic */ void l() {
        dxw.e(new Runnable() { // from class: flt.5
            @Override // java.lang.Runnable
            public void run() {
                flt.this.w();
            }
        }, 60000L);
    }

    public void m() {
        LogUtil.a("BiUserLabelHelper", "enter unRegisterCallback");
        if (this.r != null) {
            fmc.a(p).d(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        LogUtil.a("BiUserLabelHelper", "generateLabels");
        al();
        q();
        ai();
        ag();
        ae();
        s();
        y();
        v();
        r();
        o();
        t();
        ac();
        aa();
        ab();
        an();
        x();
        ah();
        ak();
        p();
        z();
        af();
        u();
        am();
        ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ao() {
        return LoginInit.getInstance(p).getAccountInfo(1011);
    }

    private void u() {
        String strAo = ao();
        if (CommonUtil.d(CommonUtil.i(HiHealthManager.d(p).getUserPreference("login_timestamp").getValue()))) {
            fmc.a(p).e("health_sport_is_new_user", "HealthNewUser", strAo);
        } else {
            fmc.a(p).e("health_sport_is_new_user", "HealthOldUser", strAo);
        }
    }

    private void al() {
        HiHealthManager.d(p).fetchUserData(new HiCommonListener() { // from class: flt.14
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i2, Object obj) {
                if (!(obj instanceof List) || i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateUserInfoLabel null");
                    return;
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    LogUtil.j("BiUserLabelHelper", "generateUserInfoLabel userInfos empty");
                    return;
                }
                LogUtil.a("BiUserLabelHelper", "generateUserInfoLabel, userInfos.size() = ", Integer.valueOf(list.size()));
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (hiUserInfo != null) {
                    flt.this.a(hiUserInfo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i2, Object obj) {
                LogUtil.a("BiUserLabelHelper", "enter generateUserInfoLabel onFailure, errCode = ", Integer.valueOf(i2), " errMsg = ", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiUserInfo hiUserInfo) {
        if (hiUserInfo == null) {
            LogUtil.j("BiUserLabelHelper", "generateUserInfoLabel hiUserInfo null");
            return;
        }
        int age = hiUserInfo.getAge();
        int gender = hiUserInfo.getGender();
        float weight = hiUserInfo.getWeight();
        String strAo = ao();
        fmc fmcVarA = fmc.a(p);
        for (fmh fmhVar : e) {
            String matchResult = fmhVar.getMatchResult(age);
            if (matchResult != null) {
                fmcVarA.e("age", matchResult, strAo);
                break;
            }
        }
        for (fmd fmdVar : g) {
            String matchResult2 = fmdVar.getMatchResult(gender);
            if (matchResult2 != null) {
                fmcVarA.e(CommonConstant.KEY_GENDER, matchResult2, strAo);
                break;
            }
        }
        for (fmh fmhVar2 : n) {
            String matchResult3 = fmhVar2.getMatchResult(weight);
            if (matchResult3 != null) {
                fmcVarA.e("weight", matchResult3, strAo);
                break;
            }
        }
        int height = hiUserInfo.getHeight();
        if (height != 0) {
            double d2 = ((double) height) / 100.0d;
            double d3 = ((double) weight) / (d2 * d2);
            fmo.d("BMI", Double.valueOf(d3).floatValue());
            for (fmh fmhVar3 : i) {
                String matchResult4 = fmhVar3.getMatchResult(d3);
                if (matchResult4 != null) {
                    fmcVarA.e("health_sport_weight_size", matchResult4, strAo);
                    return;
                }
            }
        }
    }

    private void q() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jCurrentTimeMillis - 2592000000L);
        hiAggregateOption.setEndTime(jCurrentTimeMillis2);
        hiAggregateOption.setType(new int[]{2006});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: flt.20
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodPressureLabel not success");
                } else if (njy.e(list)) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodPressureLabel null");
                    fmc.a(flt.p).e("health_blood_pressure_group_up", "BloodPressure_0", flt.this.ao());
                } else {
                    fmc.a(flt.p).e("health_blood_pressure_group_up", flt.this.b("BloodPressure_0", flt.f34200b, ((Double) list.get(0).get("BLOOD_PRESSURE_SYSTOLIC")).doubleValue()), flt.this.ao());
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                LogUtil.d("BiUserLabelHelper", "generateBloodPressureLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str, fmh[] fmhVarArr, double d2) {
        for (fmh fmhVar : fmhVarArr) {
            str = fmhVar.getMatchResult(d2);
            if (str != null) {
                return str;
            }
        }
        return str;
    }

    private void ai() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jCurrentTimeMillis - 2592000000L);
        hiAggregateOption.setEndTime(jCurrentTimeMillis2);
        hiAggregateOption.setType(new int[]{40002});
        hiAggregateOption.setConstantsKey(new String[]{"sport_walk_step_sum"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: flt.18
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodPressureLabel not success");
                    return;
                }
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodPressureLabel null");
                    fmc.a(flt.p).e("health_sport_grade_up", "SportStep_0", flt.this.ao());
                } else {
                    fmc.a(flt.p).e("health_sport_grade_up", flt.this.b("SportStep_0", flt.o, list.get(0).getDouble("sport_walk_step_sum") / 30.0d), flt.this.ao());
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                LogUtil.d("BiUserLabelHelper", "generateSportStepLabel onResultIntent");
            }
        });
    }

    private void ag() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(jCurrentTimeMillis - 2592000000L);
        hiAggregateOption.setEndTime(jCurrentTimeMillis2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(new String[]{"Track_Run_Count_Sum"});
        hiAggregateOption.setType(new int[]{42105});
        HiHealthManager.d(p).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: flt.16
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateSportRunLabel not success");
                    return;
                }
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.j("BiUserLabelHelper", "generateSportRunLabel datas null");
                    fmc.a(flt.p).e("health_sport_freq_up", "SportRun_0", flt.this.ao());
                } else {
                    LogUtil.a("BiUserLabelHelper", "generateSportRunLabel onResult ,data.size = ", Integer.valueOf(list.size()));
                    fmc.a(flt.p).e("health_sport_freq_up", flt.this.b("SportRun_0", flt.l, list.get(0).getDouble("Track_Run_Count_Sum")), flt.this.ao());
                }
            }
        });
    }

    private void ae() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(jCurrentTimeMillis - 2592000000L);
        hiAggregateOption.setEndTime(jCurrentTimeMillis2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(new String[]{"Track_Ride_Count_Sum"});
        hiAggregateOption.setType(new int[]{42155});
        HiHealthManager.d(p).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: flt.25
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateSportBikeLabel not success");
                    return;
                }
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.j("BiUserLabelHelper", "generateSportBikeLabel null");
                    fmc.a(flt.p).e("health_sport_bike_up", "SportBike_0", flt.this.ao());
                } else {
                    LogUtil.j("BiUserLabelHelper", "requestSportBikeData onResult ,data.size = ", Integer.valueOf(list.size()));
                    double d2 = list.get(0).getDouble("Track_Ride_Count_Sum");
                    LogUtil.j("BiUserLabelHelper", "requestSportBikeData onResult, sportbiketimes = ", Double.valueOf(d2));
                    fmc.a(flt.p).e("health_sport_bike_up", flt.this.b("SportBike_0", flt.f34199a, d2), flt.this.ao());
                }
            }
        });
    }

    private void s() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis2);
        hiAggregateOption.setType(new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015});
        hiAggregateOption.setConstantsKey(new String[]{"bloodsugar_bf_before", "bloodsugar_bf_after", "bloodsugar_lc_before", "bloodsugar_lc_after", "bloodsugar_dn_before", "bloodsugar_dn_after", "bloodsugar_sl_before", "bloodsugar_before_dawn"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(p).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: flt.21
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodSugarLabel1 not success");
                    return;
                }
                if (njy.e(list)) {
                    LogUtil.j("BiUserLabelHelper", "generateBloodSugarLabel1 null");
                    fmc.a(flt.p).e("health_blood_sugar_group_up", "BloodSugar_0", flt.this.ao());
                } else {
                    int size = list.size();
                    LogUtil.j("BiUserLabelHelper", "generateBloodSugarLabel1 counts = ", Integer.valueOf(size));
                    fmc.a(flt.p).e("health_blood_sugar_group_up", flt.this.b("BloodSugar_0", flt.f34201c, size), flt.this.ao());
                }
            }
        });
    }

    private void y() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ((HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class)).requestTrackSimplifyData(0L, jCurrentTimeMillis, 259, new IBaseResponseCallback() { // from class: flt.24
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    fmc fmcVarA = fmc.a(flt.p);
                    String strAo = flt.this.ao();
                    if (obj == null) {
                        LogUtil.j("BiUserLabelHelper", "generateLastRideLabel objData null");
                        fmcVarA.e("health_sport_last_ride", "", strAo);
                        return;
                    }
                    List list = (List) obj;
                    if (list.isEmpty() || list.get(0) == null) {
                        LogUtil.j("BiUserLabelHelper", "generateLastRideLabel size 0");
                        fmcVarA.e("health_sport_last_ride", "", strAo);
                        return;
                    } else {
                        double endTime = (jCurrentTimeMillis - ((HiHealthData) list.get(0)).getEndTime()) / 8.64E7d;
                        LogUtil.d("BiUserLabelHelper", "generateLastRideLabel days = ", Double.valueOf(endTime));
                        fmcVarA.e("health_sport_last_ride", flt.this.b("", flt.h, endTime), strAo);
                        return;
                    }
                }
                LogUtil.j("BiUserLabelHelper", "generateLastRideLabel not success");
            }
        });
    }

    private void v() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ((HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class)).requestTrackSimplifyData(0L, jCurrentTimeMillis, 258, new IBaseResponseCallback() { // from class: flt.22
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    fmc fmcVarA = fmc.a(flt.p);
                    String strAo = flt.this.ao();
                    if (obj == null) {
                        LogUtil.j("BiUserLabelHelper", "generateLastRideLabel objData null");
                        fmcVarA.e("health_sport_last_run", "", strAo);
                        return;
                    }
                    List list = (List) obj;
                    if (list.isEmpty() || list.get(0) == null) {
                        LogUtil.j("BiUserLabelHelper", "generateLastRideLabel size 0");
                        fmcVarA.e("health_sport_last_run", "", strAo);
                        return;
                    } else {
                        fmcVarA.e("health_sport_last_run", flt.this.b("", flt.j, (jCurrentTimeMillis - ((HiHealthData) list.get(0)).getEndTime()) / 8.64E7d), strAo);
                        return;
                    }
                }
                LogUtil.j("BiUserLabelHelper", "generateLastRideLabel not success");
            }
        });
    }

    private void r() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long j2 = jCurrentTimeMillis - 7776000000L;
        fll.c().a(j2, jCurrentTimeMillis, LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011), new IBaseResponseCallback() { // from class: flt.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0 && (obj instanceof List)) {
                    List list = (List) obj;
                    LogUtil.d("BiUserLabelHelper", "generateCareLabel size = ", Integer.valueOf(list.size()));
                    int[] iArrA = flt.this.a((List<fln>) list);
                    StringBuilder sb = new StringBuilder(16);
                    for (int i3 : iArrA) {
                        sb.append(i3);
                        sb.append(" ");
                    }
                    LogUtil.d("BiUserLabelHelper", "count = ", sb);
                    flt.this.a(j2, jCurrentTimeMillis, iArrA);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] a(List<fln> list) {
        int[] iArr = new int[4];
        for (fln flnVar : list) {
            if (flnVar == null) {
                LogUtil.j("BiUserLabelHelper", "generateCareLabel record == null");
            } else {
                LogUtil.d("BiUserLabelHelper", "generateCareLabel getType = ", Integer.valueOf(flnVar.d()));
                switch (flnVar.d()) {
                    case 2010011:
                        iArr[1] = iArr[1] + 1;
                        break;
                    case 2010023:
                        iArr[0] = iArr[0] + 1;
                        break;
                    case 2010029:
                        iArr[2] = iArr[2] + 1;
                        break;
                    case 2010099:
                        iArr[3] = iArr[3] + 1;
                        break;
                    default:
                        LogUtil.j("BiUserLabelHelper", "generateCareLabel default");
                        break;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2, long j3, int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            LogUtil.j("BiUserLabelHelper", "generateCareLabel cardType null or not 4");
            return;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        fmc fmcVarA = fmc.a(p);
        String strAo = ao();
        if (i2 > 10) {
            fmcVarA.e("health_sport_weight_care", "SportWeight_Care", strAo);
        } else {
            b(j2, j3, 2004);
        }
        if (i3 > 10) {
            fmcVarA.e("health_sport_sleep_care", "SportSleep_Care", strAo);
        } else {
            b(j2, j3, 44004);
        }
        if (i4 > 10) {
            fmcVarA.e("health_sport_heart_rate", "SportHeart_Care_0", strAo);
        } else {
            b(j2, j3, 46016);
        }
        int i5 = iArr[3];
        if (i5 > 10) {
            fmcVarA.e("health_sport_blood_oxygen", "SportBlood_Care_0", strAo);
        } else {
            b(j2, j3, 47201);
        }
        fmo.d(i2, i3, i4, i5);
    }

    private HiAggregateOption aj() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(System.currentTimeMillis() - 7776000000L, System.currentTimeMillis());
        hiAggregateOption.setType(new int[]{44006, 44007, 44004, 44001, 44002, 44003, 44005, 44201, 44202, 44105, 44102, 44103, 44104, 44107});
        hiAggregateOption.setConstantsKey(new String[]{"stat_sleep_start_time", "stat_sleep_end_time", "stat_sleep_duration_sum", "stat_sleep_deep_duration", "stat_sleep_shallow_duration", "stat_sleep_wake_duration", "stat_sleep_wake_count", "stat_out_core_sleep_fall_time", "stat_out_core_sleep_wake_up_time", "stat_core_sleep_duration_sum", "stat_core_sleep_deep_duration", "stat_core_sleep_shallow_duration", "stat_core_sleep_wake_duration", "stat_core_sleep_wake_count"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    private HiAggregateOption e(long j2, long j3, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j2, j3);
        LogUtil.d("BiUserLabelHelper", "getAggregateOption query = ", Integer.valueOf(i2));
        if (i2 == 2004) {
            hiAggregateOption.setType(new int[]{2004});
            hiAggregateOption.setConstantsKey(new String[]{"bodyWeight"});
        } else if (i2 == 44004) {
            hiAggregateOption.setType(new int[]{44004, 44105});
            hiAggregateOption.setConstantsKey(new String[]{"stat_sleep_duration_sum", "stat_sleep_shallow_duration"});
        } else if (i2 == 46016) {
            hiAggregateOption.setType(new int[]{46016});
            hiAggregateOption.setConstantsKey(new String[]{"maxHeartRate"});
        } else if (i2 == 47201) {
            hiAggregateOption.setType(new int[]{47201});
            hiAggregateOption.setConstantsKey(new String[]{"maxBloodOxygenSaturation"});
        } else {
            LogUtil.d("BiUserLabelHelper", "getAggregateOption default");
        }
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    private void b(long j2, long j3, final int i2) {
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(e(j2, j3, i2), new HiAggregateListener() { // from class: flt.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                if (i3 != 0 || njy.e(list)) {
                    LogUtil.j("BiUserLabelHelper", "generateHeartRateCareLabelFromHealth errorCode = ", Integer.valueOf(i3));
                    flt.this.e(i2, false);
                } else {
                    int size = list.size();
                    LogUtil.d("BiUserLabelHelper", "generateHeartRateCareLabelFromHealth count = ", Integer.valueOf(size), "query = ", Integer.valueOf(i2));
                    flt.this.e(i2, size > 10);
                    fmo.e(i2, size);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
                LogUtil.d("BiUserLabelHelper", "generateHeartRateCareLabelFromHealth onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, boolean z) {
        LogUtil.d("BiUserLabelHelper", "generateCareLabelFromHealth query = ", Integer.valueOf(i2), " hasData = ", Boolean.valueOf(z));
        fmc fmcVarA = fmc.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        String strAo = ao();
        if (i2 == 2004) {
            if (z) {
                fmcVarA.e("health_sport_weight_care", "SportWeight_Care", strAo);
                return;
            } else {
                fmcVarA.e("health_sport_weight_care", "", strAo);
                return;
            }
        }
        if (i2 == 44004) {
            if (z) {
                fmcVarA.e("health_sport_sleep_care", "SportSleep_Care", strAo);
                return;
            } else {
                fmcVarA.e("health_sport_sleep_care", "", strAo);
                return;
            }
        }
        if (i2 == 46016) {
            if (z) {
                fmcVarA.e("health_sport_heart_rate", "SportHeart_Care_0", strAo);
                return;
            } else {
                fmcVarA.e("health_sport_heart_rate", "", strAo);
                return;
            }
        }
        if (i2 != 47201) {
            LogUtil.d("BiUserLabelHelper", "generateCareLabelFromHealth default");
        } else if (z) {
            fmcVarA.e("health_sport_blood_oxygen", "SportBlood_Care_0", strAo);
        } else {
            fmcVarA.e("health_sport_blood_oxygen", "", strAo);
        }
    }

    private void o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            fll.c().d(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis, ao(), Integer.parseInt(AnalyticsValue.HOME_1010001.value()), new IBaseResponseCallback() { // from class: flv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.a(i2, obj);
                }
            });
        } catch (NumberFormatException unused) {
            LogUtil.e("BiUserLabelHelper", "generateAppUseFrequencyLabel, Exception.");
        }
    }

    /* synthetic */ void a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof Integer)) {
            LogUtil.d("BiUserLabelHelper", "generateAppUseFrequencyLabel errorCode = ", Integer.valueOf(i2));
            return;
        }
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        LogUtil.d("BiUserLabelHelper", "generateAppUseFrequencyLabel useApp count = ", num);
        String matchResult = null;
        for (fmh fmhVar : d) {
            matchResult = fmhVar.getMatchResult(iIntValue);
            if (matchResult != null) {
                break;
            }
        }
        fmc.a(p).e("health_sport_user_app", matchResult, ao());
    }

    private void t() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 31104000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{30007});
        hiDataReadOption.setSortOrder(1);
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (i2 == 0) {
                    fmc fmcVarA = fmc.a(flt.p);
                    String strAo = flt.this.ao();
                    if (!(obj instanceof SparseArray)) {
                        fmcVarA.e("health_sport_ride_up", "SportRide_4", strAo);
                        return;
                    }
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() <= 0) {
                        fmcVarA.e("health_sport_ride_up", "SportRide_4", strAo);
                        return;
                    }
                    Object obj2 = sparseArray.get(30007);
                    if (!(obj2 instanceof List)) {
                        fmcVarA.e("health_sport_ride_up", "SportRide_4", strAo);
                        return;
                    }
                    List list = (List) obj2;
                    if (njy.e(list)) {
                        fmcVarA.e("health_sport_ride_up", "SportRide_4", strAo);
                        return;
                    } else {
                        fmcVarA.e("health_sport_ride_up", flt.this.b((List<HiHealthData>) list), strAo);
                        return;
                    }
                }
                LogUtil.j("BiUserLabelHelper", "generateBikeIntensiveLabel error = ", Integer.valueOf(i2));
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateBikeIntensiveLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(List<HiHealthData> list) {
        boolean z;
        if (njy.e(list)) {
            LogUtil.j("BiUserLabelHelper", "getBikeIntensiveLabel empty");
            return null;
        }
        int[] iArr = new int[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                if (list.get(i2) != null) {
                    if (i2 == 0) {
                        z = System.currentTimeMillis() - list.get(i2).getEndTime() > 2592000000L;
                    } else {
                        z = z2;
                    }
                    e(list, iArr, i2, 20000, 40000);
                    z2 = z;
                }
                i2++;
            } else {
                LogUtil.d("BiUserLabelHelper", "getBikeIntensiveLabel", Boolean.valueOf(z2), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3]));
                return a(iArr, z2);
            }
        }
    }

    private String a(int[] iArr, boolean z) {
        StringBuilder sb = new StringBuilder(16);
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 != 0) {
                z2 = true;
                break;
            }
        }
        e(iArr, sb);
        if (z && z2) {
            sb.append(",");
            sb.append("SportRide_4");
        } else if (z) {
            sb.append("SportRide_4");
        } else {
            LogUtil.d("BiUserLabelHelper", "getBikeIntensiveLabel else branch");
        }
        return sb.toString();
    }

    private StringBuilder e(int[] iArr, StringBuilder sb) {
        int i2;
        if (iArr[3] > 0) {
            sb.append("SportRide_3");
            return sb;
        }
        int i3 = iArr[2];
        if (i3 > 2) {
            sb.append("SportRide_2");
            return sb;
        }
        if (i3 > 0 || (i2 = iArr[1]) > 3) {
            sb.append("SportRide_1");
            return sb;
        }
        if (i2 <= 0 && iArr[0] <= 0) {
            return sb;
        }
        sb.append("SportRide_0");
        return sb;
    }

    private void ac() {
        HiHealthManager.d(p).aggregateHiHealthData(aj(), new HiAggregateListener() { // from class: flt.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (i2 != 0 || njy.e(list)) {
                    LogUtil.d("BiUserLabelHelper", "generateSleepLabel errorCode = ", Integer.valueOf(i2));
                    fmc.a(flt.p).e("health_sport_sleep_quality", "", flt.this.ao());
                } else {
                    LogUtil.d("BiUserLabelHelper", "generateSleepLabel size = ", Integer.valueOf(list.size()));
                    flt.this.c(list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateSleepLabel onResultIntent");
            }
        });
    }

    private void e(int[] iArr) {
        if (iArr == null || iArr.length != 5) {
            return;
        }
        LogUtil.d("BiUserLabelHelper", "generateSleepLabel counter", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3]), Integer.valueOf(iArr[4]));
        StringBuilder sb = new StringBuilder(16);
        if (iArr[1] > 20) {
            sb.append("SportSleep_0");
        }
        if (iArr[2] > 10) {
            if (TextUtils.isEmpty(sb)) {
                sb.append("SportSleep_1");
            } else {
                sb.append(",");
                sb.append("SportSleep_1");
            }
        }
        if (iArr[3] > 20) {
            if (TextUtils.isEmpty(sb)) {
                sb.append("SportSleep_2");
            } else {
                sb.append(",");
                sb.append("SportSleep_2");
            }
        }
        if (iArr[4] > 20) {
            if (TextUtils.isEmpty(sb)) {
                sb.append("SportSleep_3");
            } else {
                sb.append(",");
                sb.append("SportSleep_3");
            }
        }
        fmc.a(p).e("health_sport_sleep_quality", sb.toString(), ao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        int[] iArr = new int[5];
        for (HiHealthData hiHealthData : list) {
            long j2 = hiHealthData.getLong("stat_out_core_sleep_fall_time");
            long j3 = hiHealthData.getLong("stat_out_core_sleep_wake_up_time");
            int i2 = hiHealthData.getInt("stat_core_sleep_duration_sum");
            int i3 = hiHealthData.getInt("stat_core_sleep_deep_duration");
            int i4 = hiHealthData.getInt("stat_core_sleep_wake_count");
            if (i2 <= 0) {
                i2 = hiHealthData.getInt("stat_sleep_duration_sum") / 60;
                i3 = hiHealthData.getInt("stat_sleep_deep_duration") / 60;
                i4 = hiHealthData.getInt("stat_sleep_wake_count");
            }
            long jC = qrk.c(j2, 0);
            if (j3 - jC > 32400000) {
                iArr[0] = iArr[0] + 1;
            }
            if (j2 > jC) {
                iArr[1] = iArr[1] + 1;
            }
            if (i4 > 2) {
                iArr[2] = iArr[2] + 1;
            }
            if (i2 <= 300) {
                iArr[3] = iArr[3] + 1;
            }
            if (i3 <= 90) {
                iArr[4] = iArr[4] + 1;
            }
        }
        e(iArr);
    }

    private void aa() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 31104000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{30006, 30005});
        hiDataReadOption.setSortOrder(1);
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.9
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                    fmcVarA.e("health_sport_strength_up", "SportStrength_5", strAo);
                    return;
                }
                Object obj2 = sparseArrayA.get(30006);
                Object obj3 = sparseArrayA.get(30005);
                if (!(obj2 instanceof List) && !(obj3 instanceof List)) {
                    fmcVarA.e("health_sport_strength_up", "SportStrength_5", strAo);
                } else {
                    fmcVarA.e("health_sport_strength_up", flt.this.a((List<HiHealthData>) obj2, (List<HiHealthData>) obj3), strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateRunIntensiveLabel onResultIntent");
            }
        });
    }

    private void ab() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{42006});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.7
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() == 0) {
                    LogUtil.j("BiUserLabelHelper", "generateMaxVo2Label map is null or map.size() is zero");
                    fmcVarA.e("health_sport_max_vo2", "LastMaxVo2_none", strAo);
                    return;
                }
                Object obj2 = sparseArrayA.get(42006);
                if (!(obj2 instanceof List)) {
                    LogUtil.j("BiUserLabelHelper", "generateMaxVo2Label maxVo2Object is null or not list");
                    fmcVarA.e("health_sport_max_vo2", "LastMaxVo2_none", strAo);
                    return;
                }
                List list = (List) obj2;
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.j("BiUserLabelHelper", "generateMaxVo2Label maxVo2List size 0");
                    fmcVarA.e("health_sport_max_vo2", "LastMaxVo2_none", strAo);
                } else {
                    fmcVarA.e("health_sport_max_vo2", flt.this.b("LastMaxVo2_none", flt.f, ((HiHealthData) list.get(0)).getValue()), strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateMaxVo2Label onResultIntent");
            }
        });
    }

    private void an() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{44306});
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.8
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() == 0) {
                    LogUtil.j("BiUserLabelHelper", "generateStressLabel map is null or map.size() is zero");
                    fmcVarA.e("health_sport_stress_average", "LastStressScore_none", strAo);
                    return;
                }
                Object obj2 = sparseArrayA.get(44306);
                if (obj2 instanceof List) {
                    fmcVarA.e("health_sport_stress_average", flt.this.b("LastStressScore_none", flt.m, flt.this.d((List<HiHealthData>) obj2)), strAo);
                } else {
                    LogUtil.j("BiUserLabelHelper", "generateStressLabel stressScoreObject is null or not list");
                    fmcVarA.e("health_sport_stress_average", "LastStressScore_none", strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateStressLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double d(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("BiUserLabelHelper", "getAverageData hiHealthDataList is empty or size is zero");
            return 0.0d;
        }
        int i2 = 0;
        double value = 0.0d;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getValue() > 0.0d) {
                value += hiHealthData.getValue();
                i2++;
            }
        }
        if (i2 != 0) {
            return value / ((double) i2);
        }
        LogUtil.j("BiUserLabelHelper", "generateStressLabel count is 0");
        return 0.0d;
    }

    private void x() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{44004, 44105});
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.6
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                    fmcVarA.e("health_sport_sleep_average", "", strAo);
                    return;
                }
                double dE = flt.this.e(sparseArrayA.get(44004), sparseArrayA.get(44105));
                if (dE == 0.0d) {
                    LogUtil.j("BiUserLabelHelper", "generateLastSleepLabel lastSleepAverage is zero");
                    fmcVarA.e("health_sport_sleep_average", "", strAo);
                } else {
                    fmcVarA.e("health_sport_sleep_average", String.valueOf((int) UnitUtil.d(dE, 0)), strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateLastSleepLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e(Object obj, Object obj2) {
        ArrayList<HiHealthData> arrayList = new ArrayList(60);
        if (obj instanceof List) {
            List list = (List) obj;
            if (njy.b(list)) {
                arrayList.addAll(list);
            }
        }
        if (obj2 instanceof List) {
            List list2 = (List) obj2;
            if (njy.b(list2)) {
                arrayList.addAll(list2);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("BiUserLabelHelper", "getSleepAverageData lastSleepList is empty");
            return 0.0d;
        }
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : arrayList) {
            double d2 = d(hiHealthData.getValue(), hiHealthData.getPointUnit());
            if (!map.containsKey(Long.valueOf(hiHealthData.getDay()))) {
                map.put(Long.valueOf(hiHealthData.getDay()), Double.valueOf(d2));
            } else if (((Double) map.get(Long.valueOf(hiHealthData.getDay()))).doubleValue() < d2) {
                map.put(Long.valueOf(hiHealthData.getDay()), Double.valueOf(d2));
            }
        }
        int i2 = 0;
        double dDoubleValue = 0.0d;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && ((Double) entry.getValue()).doubleValue() > 0.0d) {
                dDoubleValue += ((Double) entry.getValue()).doubleValue();
                i2++;
            }
        }
        if (i2 != 0) {
            return dDoubleValue / ((double) i2);
        }
        LogUtil.j("BiUserLabelHelper", "getSleepAverageData count is 0");
        return 0.0d;
    }

    private void ah() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{30006, 30005, 30007, 30021});
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.10
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                    LogUtil.j("BiUserLabelHelper", "generateSportLabel sportMap is null or empty");
                    fmcVarA.e("health_sport_average_pace", "", strAo);
                    fmcVarA.e("health_sport_walk_weekday", "", strAo);
                    fmcVarA.e("health_sport_run_weekday", "", strAo);
                    fmcVarA.e("health_sport_ride_weekday", "", strAo);
                    return;
                }
                fmcVarA.e("health_sport_average_pace", Arrays.toString(new double[]{UnitUtil.d(flt.this.e(sparseArrayA.get(30006)), 2), UnitUtil.d(flt.this.e(sparseArrayA.get(30005)), 2), UnitUtil.d(flt.this.e(sparseArrayA.get(30007)), 2), UnitUtil.d(flt.this.e(sparseArrayA.get(30021)), 2)}), strAo);
                flt.this.a("health_sport_walk_weekday", sparseArrayA.get(30005));
                flt.this.a("health_sport_run_weekday", sparseArrayA.get(30006));
                flt.this.a("health_sport_ride_weekday", sparseArrayA.get(30007));
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateSportLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e(Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.j("BiUserLabelHelper", "parsingObject sportObject is null or not list");
            return 0.0d;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("BiUserLabelHelper", "parsingObject sportList is empty");
            return 0.0d;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        double d2 = 0.0d;
        while (it.hasNext()) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData != null && hiTrackMetaData.getAbnormalTrack() == 0 && hiTrackMetaData.getDuplicated() == 0) {
                double dA = CommonUtil.a(String.valueOf(hiTrackMetaData.getAvgPace()));
                if (dA > 0.0d) {
                    d2 += dA;
                    i2++;
                }
            }
        }
        if (i2 != 0) {
            return (d2 / 60.0d) / ((double) i2);
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Object obj) {
        fmc fmcVarA = fmc.a(p);
        String strAo = ao();
        if (!(obj instanceof List)) {
            LogUtil.j("BiUserLabelHelper", "getSportWeekday sportObject is null or not list");
            fmcVarA.e(str, "", strAo);
            return;
        }
        List<HiHealthData> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("BiUserLabelHelper", "getSportWeekday sportList is empty");
            fmcVarA.e(str, "", strAo);
            return;
        }
        int[] iArr = new int[7];
        for (HiHealthData hiHealthData : list) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData != null && hiTrackMetaData.getAbnormalTrack() == 0 && hiTrackMetaData.getDuplicated() == 0) {
                int iE = e(hiHealthData.getStartTime());
                int iE2 = e(hiHealthData.getEndTime());
                LogUtil.a("BiUserLabelHelper", "getSportWeekday startIndex = ", Integer.valueOf(iE), ", endIndex = ", Integer.valueOf(iE2));
                if (iE == iE2) {
                    iArr[iE] = iArr[iE] + 1;
                } else {
                    b(iE, iE2, iArr);
                }
            }
        }
        fmcVarA.e(str, Arrays.toString(iArr), strAo);
    }

    private int e(long j2) {
        Date date = new Date();
        date.setTime(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(7) - 1;
    }

    private void b(int i2, int i3, int[] iArr) {
        if (i2 < i3) {
            while (i2 <= i3) {
                iArr[i2] = iArr[i2] + 1;
                i2++;
            }
        } else {
            while (i2 <= i3 + 7) {
                int i4 = i2 >= 7 ? i2 - 7 : i2;
                iArr[i4] = iArr[i4] + 1;
                i2++;
            }
        }
    }

    private void ak() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 1123200000, jCurrentTimeMillis2);
        hiDataReadOption.setType(new int[]{40002});
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.15
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                    LogUtil.j("BiUserLabelHelper", "generateStepLabel stepMap is null or empty");
                    fmcVarA.e("health_sport_step_average", "", strAo);
                    return;
                }
                Object obj2 = sparseArrayA.get(40002);
                if (!(obj2 instanceof List)) {
                    LogUtil.j("BiUserLabelHelper", "generateStepLabel stepObject is null or not list");
                    fmcVarA.e("health_sport_step_average", "", strAo);
                } else {
                    fmcVarA.e("health_sport_step_average", String.valueOf((int) UnitUtil.d(flt.this.d((List<HiHealthData>) obj2), 0)), strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateStepLabel onResultIntent");
            }
        });
    }

    private void p() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - Constants.TWO_WEEK, jCurrentTimeMillis2);
        hiDataReadOption.setType(new int[]{47101});
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.12
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                String strAo = flt.this.ao();
                if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                    LogUtil.j("BiUserLabelHelper", "generateExerciseIntensityLabel exerciseIntensityMap is null or empty");
                    fmcVarA.e("health_sport_exercise_intensity_average", "", strAo);
                    return;
                }
                Object obj2 = sparseArrayA.get(47101);
                if (!(obj2 instanceof List)) {
                    LogUtil.j("BiUserLabelHelper", "generateExerciseIntensityLabel exerciseIntensityObject is null or not list");
                    fmcVarA.e("health_sport_exercise_intensity_average", "", strAo);
                } else {
                    fmcVarA.e("health_sport_exercise_intensity_average", String.valueOf(flt.this.d((List<HiHealthData>) obj2, jCurrentTimeMillis2)), strAo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateExerciseIntensityLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double d(List<HiHealthData> list, long j2) {
        int i2;
        double value;
        if (njy.e(list)) {
            LogUtil.j("BiUserLabelHelper", "getWeekAverageData hiHealthDataList is empty or size is zero");
            return 0.0d;
        }
        boolean[] zArr = new boolean[2];
        long j3 = j2 - 604800000;
        Iterator<HiHealthData> it = list.iterator();
        double d2 = 0.0d;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HiHealthData next = it.next();
            long startTime = next.getStartTime();
            if (startTime > j2 || startTime < j3) {
                if (startTime >= j3 || startTime < j2 - Constants.TWO_WEEK) {
                    LogUtil.j("BiUserLabelHelper", "getWeekAverageData hiHealthData.getStartTime() is more than two weeks");
                } else if (next.getValue() > 0.0d) {
                    zArr[1] = true;
                    value = next.getValue();
                    d2 += value;
                }
            } else if (next.getValue() > 0.0d) {
                zArr[0] = true;
                value = next.getValue();
                d2 += value;
            }
        }
        int i3 = 0;
        for (i2 = 0; i2 < 2; i2++) {
            if (zArr[i2]) {
                i3++;
            }
        }
        if (i3 != 0) {
            return d2 / ((double) i3);
        }
        LogUtil.j("BiUserLabelHelper", "getWeekAverageData two weeks don't have data");
        return 0.0d;
    }

    private void ad() {
        boolean zG = EnvironmentInfo.g();
        LogUtil.a("BiUserLabelHelper", "isHarmony4AndLater:", Boolean.valueOf(zG));
        if (!zG) {
            e(fmb.b().d());
        } else {
            fmb.b().d(new BaseResponseCallback() { // from class: fly
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f34226b.c(i2, (HashMap) obj);
                }
            });
        }
    }

    /* synthetic */ void c(int i2, HashMap map) {
        if (CollectionUtils.c(map)) {
            LogUtil.j("BiUserLabelHelper", "data isEmpty ");
        } else {
            e((HashMap<String, String>) map);
            LogUtil.d("BiUserLabelHelper", "newKeyAndValueHashMap:", map.toString());
        }
    }

    private void e(HashMap<String, String> map) {
        fmc fmcVarA = fmc.a(p);
        String strAo = ao();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            fmcVarA.e(entry.getKey(), entry.getValue(), strAo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, Object obj2, int i2) {
        SparseArray<Object> sparseArrayA = a(obj2, i2);
        String[] strArr = new String[6];
        if (sparseArrayA == null || sparseArrayA.size() <= 0) {
            LogUtil.j("BiUserLabelHelper", "getAverageSportTimeLabel sportMap is null or empty");
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
            strArr[4] = "";
            strArr[5] = "";
        } else {
            c(strArr, sparseArrayA);
        }
        if (obj != null && njy.b(obj, WorkoutRecord.class)) {
            List<WorkoutRecord> list = (List) obj;
            if (njy.e(list)) {
                strArr[3] = "";
            } else {
                b(strArr, list);
            }
        } else {
            strArr[3] = "";
        }
        fmc.a(p).e("health_sport_average_time_month", Arrays.toString(strArr), ao());
    }

    private void c(String[] strArr, SparseArray<Object> sparseArray) {
        d(strArr, 30006, sparseArray, 0);
        d(strArr, 30005, sparseArray, 1);
        d(strArr, 30007, sparseArray, 2);
        d(strArr, 30021, sparseArray, 4);
        d(strArr, 30023, sparseArray, 5);
    }

    private void d(String[] strArr, int i2, SparseArray<Object> sparseArray, int i3) {
        Object obj = sparseArray.get(i2);
        if (obj instanceof List) {
            List<HiHealthData> list = (List) obj;
            if (njy.e(list)) {
                strArr[i3] = "";
                return;
            }
            strArr[i3] = String.valueOf(UnitUtil.d(h(list) / ((double) list.size()), 2));
            return;
        }
        strArr[i3] = "";
    }

    private long h(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        long totalTime = 0;
        while (it.hasNext()) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next().getMetaData(), HiTrackMetaData.class);
                if (hiTrackMetaData == null) {
                    LogUtil.j("BiUserLabelHelper", "getMetaData is null");
                } else {
                    int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
                    int duplicated = hiTrackMetaData.getDuplicated();
                    if (abnormalTrack != 0 || duplicated != 0) {
                        LogUtil.j("BiUserLabelHelper", "getTrackMetaData is abnormal or repetition");
                    } else {
                        totalTime += hiTrackMetaData.getTotalTime();
                    }
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("BiUserLabelHelper", "getSportTotalTime trackMetaData is error");
            }
        }
        return totalTime;
    }

    private void b(String[] strArr, List<WorkoutRecord> list) {
        if (njy.e(list)) {
            strArr[3] = "";
            return;
        }
        Iterator<WorkoutRecord> it = list.iterator();
        long duration = 0;
        while (it.hasNext()) {
            duration += (long) it.next().getDuration();
        }
        double size = list.size();
        if (size == 0.0d) {
            strArr[3] = "";
        } else {
            strArr[3] = String.valueOf(UnitUtil.d(duration / size, 2));
        }
    }

    private void z() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 604800000, jCurrentTimeMillis);
        hiDataReadOption.setType(k);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: flt.11
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                SparseArray sparseArrayA = flt.this.a(obj, i2);
                fmc fmcVarA = fmc.a(flt.p);
                if (sparseArrayA != null && sparseArrayA.size() > 0) {
                    flt.this.a(fmcVarA, (SparseArray<Object>) sparseArrayA);
                } else {
                    LogUtil.j("BiUserLabelHelper", "generateLastSportTimeRecoveryLabel sportMap is null or empty");
                    fmcVarA.e("health_seven_day_last_sport_recovery_time", "", flt.this.ao());
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("BiUserLabelHelper", "generateLastSportTimeRecoveryLabel onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(fmc fmcVar, SparseArray<Object> sparseArray) {
        Object obj;
        int i2 = 0;
        while (true) {
            int[] iArr = k;
            if (i2 >= iArr.length) {
                obj = null;
                break;
            } else {
                if (sparseArray.get(iArr[i2]) != null) {
                    obj = sparseArray.get(iArr[i2]);
                    break;
                }
                i2++;
            }
        }
        if (obj instanceof List) {
            List<HiHealthData> list = (List) obj;
            if (njy.b(list)) {
                int iF = f(list);
                if (iF == 0) {
                    fmcVar.e("health_seven_day_last_sport_recovery_time", "", ao());
                    return;
                } else {
                    fmcVar.e("health_seven_day_last_sport_recovery_time", String.valueOf(iF), ao());
                    return;
                }
            }
            fmcVar.e("health_seven_day_last_sport_recovery_time", "", ao());
            return;
        }
        fmcVar.e("health_seven_day_last_sport_recovery_time", "", ao());
    }

    private int f(List<HiHealthData> list) {
        if (njy.e(list)) {
            return 0;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (true) {
            int iIntValue = 0;
            while (it.hasNext()) {
                try {
                    Map<String, Integer> wearSportData = ((HiTrackMetaData) HiJsonUtil.d(it.next().getMetaData(), HiTrackMetaData.class)).getWearSportData();
                    if (wearSportData != null && wearSportData.containsKey("recovery_time")) {
                        if (wearSportData.get("recovery_time") != null) {
                            iIntValue = wearSportData.get("recovery_time").intValue() / 60;
                        }
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.j("BiUserLabelHelper", "getSportRecoverTime trackMetaData is error");
                }
            }
            return iIntValue;
        }
    }

    private void af() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiDataReadOption.setTimeInterval(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis);
        hiDataReadOption.setType(k);
        hiDataReadOption.setSortOrder(1);
        HiHealthManager.d(p).readHiHealthData(hiDataReadOption, new AnonymousClass13());
    }

    /* JADX INFO: renamed from: flt$13, reason: invalid class name */
    class AnonymousClass13 implements HiDataReadResultListener {
        AnonymousClass13() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, final int i, int i2) {
            fmc fmcVarA = fmc.a(flt.p);
            SparseArray sparseArrayA = flt.this.a(obj, i);
            if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                fmcVarA.e("health_sport_run_count", "", flt.this.ao());
                fmcVarA.e("health_sport_walk_count", "", flt.this.ao());
                fmcVarA.e("health_sport_ride_count", "", flt.this.ao());
                fmcVarA.e("health_sport_swim_count", "", flt.this.ao());
                fmcVarA.e("health_sport_basketball_count", "", flt.this.ao());
            } else {
                flt.this.e((SparseArray<Object>) sparseArrayA);
            }
            flt.this.e(new IBaseResponseCallback() { // from class: flw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj2) {
                    this.e.e(obj, i, i3, obj2);
                }
            });
        }

        /* synthetic */ void e(Object obj, int i, int i2, Object obj2) {
            flt.this.d(obj2);
            flt.this.d(obj2, obj, i);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("BiUserLabelHelper", "generateSportCountAndTimeLabel onResultIntent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SparseArray<Object> sparseArray) {
        b(30006, "health_sport_run_count", sparseArray);
        b(30005, "health_sport_walk_count", sparseArray);
        b(30007, "health_sport_ride_count", sparseArray);
        b(30021, "health_sport_swim_count", sparseArray);
        b(30023, "health_sport_basketball_count", sparseArray);
    }

    private void b(int i2, String str, SparseArray<Object> sparseArray) {
        fmc fmcVarA = fmc.a(p);
        Object obj = sparseArray.get(i2);
        if (obj instanceof List) {
            List<HiHealthData> list = (List) obj;
            if (njy.e(list)) {
                fmcVarA.e(str, "", ao());
                return;
            } else {
                fmcVarA.e(str, Arrays.toString(g(list)), ao());
                return;
            }
        }
        fmcVarA.e(str, "", ao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        fmc fmcVarA = fmc.a(p);
        if (obj == null || !njy.b(obj, WorkoutRecord.class)) {
            fmcVarA.e("health_sport_fitness_count", "", ao());
            return;
        }
        List<WorkoutRecord> list = (List) obj;
        if (njy.e(list)) {
            fmcVarA.e("health_sport_fitness_count", "", ao());
            return;
        }
        int[] iArr = new int[12];
        long jAcquireExerciseTime = 0;
        for (WorkoutRecord workoutRecord : list) {
            jAcquireExerciseTime += (workoutRecord.acquireExerciseTime() - workoutRecord.startTime()) / 86400000;
            a(iArr, ltb.d(workoutRecord.startTime()), ltb.d(workoutRecord.acquireExerciseTime()));
        }
        for (int i2 = 0; i2 < 12; i2++) {
            iArr[i2] = (int) (((long) iArr[i2]) + jAcquireExerciseTime);
        }
        fmcVarA.e("health_sport_fitness_count", Arrays.toString(iArr), ao());
    }

    private int[] g(List<HiHealthData> list) {
        int[] iArr = new int[12];
        long endTime = 0;
        for (HiHealthData hiHealthData : list) {
            endTime += (hiHealthData.getEndTime() - hiHealthData.getStartTime()) / 86400000;
            a(iArr, ltb.d(hiHealthData.getStartTime()), ltb.d(hiHealthData.getEndTime()));
        }
        for (int i2 = 0; i2 < 12; i2++) {
            iArr[i2] = (int) (((long) iArr[i2]) + endTime);
        }
        return iArr;
    }

    private void a(int[] iArr, int i2, int i3) {
        if (i3 >= i2) {
            for (int i4 = i2 / 2; i4 <= i3 / 2; i4++) {
                int i5 = iArr[i4] + 1;
                iArr[i4] = i5;
                iArr[i4] = i5;
            }
            return;
        }
        for (int i6 = 0; i6 <= i3; i6 += 2) {
            int i7 = i6 / 2;
            int i8 = iArr[i7] + 1;
            iArr[i7] = i8;
            iArr[i7] = i8;
        }
        while (i2 < 24) {
            int i9 = i2 / 2;
            int i10 = iArr[i9] + 1;
            iArr[i9] = i10;
            iArr[i9] = i10;
            i2 += 2;
        }
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("BiUserLabelHelper", "getFitnessRecord recordApi is null.");
        } else {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(jCurrentTimeMillis - 2592000000L).d(jCurrentTimeMillis).a(), new IBaseResponseCallback() { // from class: flt.17
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (obj == null) {
                        LogUtil.a("BiUserLabelHelper", "fitnessRecords is null");
                    }
                    iBaseResponseCallback.a(i2, obj);
                }
            });
        }
    }

    public void d(int i2, long j2, long j3) {
        d(i2);
        a(j2, j3);
    }

    public void b(long j2) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (jCurrentTimeMillis <= 604800000) {
            str = "SportLastLogin_0";
        } else if (jCurrentTimeMillis > 604800000 && jCurrentTimeMillis < 2592000000L) {
            str = "SportLastLogin_1";
        } else if (jCurrentTimeMillis > 2592000000L && jCurrentTimeMillis <= 5184000000L) {
            str = "SportLastLogin_2";
        } else if (jCurrentTimeMillis > 5184000000L && jCurrentTimeMillis <= 7776000000L) {
            str = "SportLastLogin_3";
        } else {
            str = "SportLastLogin_4";
        }
        fmc fmcVarA = fmc.a(p);
        LogUtil.d("BiUserLabelHelper", "generateLastLoginLabel=", str);
        fmcVarA.e("health_sport_last_login", str, ao());
    }

    private void d(int i2) {
        String str = "SportUserActive_0";
        String[] strArr = {"SportUserActive_0", "SportUserActive_1", "SportUserActive_2", "SportUserActive_3"};
        if (i2 > 0 && i2 < 4) {
            str = strArr[i2];
        } else if (i2 >= 4 && i2 <= 8) {
            str = "SportUserActive_4";
        } else if (i2 > 8 && i2 <= 16) {
            str = "SportUserActive_5";
        } else if (i2 > 16) {
            str = "SportUserActive_6";
        }
        fmc fmcVarA = fmc.a(p);
        LogUtil.d("BiUserLabelHelper", "generateActivityFrequencyLabel=", str);
        fmcVarA.e("health_sport_user_active", str, ao());
    }

    private void a(long j2, long j3) {
        String str;
        fmc fmcVarA = fmc.a(p);
        if (j2 == 0) {
            fmcVarA.e("health_sport_last_active", "", ao());
            return;
        }
        long j4 = j3 - j2;
        if (j4 <= 2592000000L) {
            str = "SportLastActive_0";
        } else if (j4 <= 5184000000L) {
            str = "SportLastActive_1";
        } else if (j4 <= 7776000000L) {
            str = "SportLastActive_2";
        } else if (j4 <= ThirdLoginDataStorageUtil.REFRESH_TOKEN_INTERVAL) {
            str = "SportLastActive_3";
        } else {
            str = "SportLastActive_4";
        }
        LogUtil.d("BiUserLabelHelper", "generateActivityLastLabel=", str);
        fmcVarA.e("health_sport_last_active", str, ao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SparseArray<Object> a(Object obj, int i2) {
        LogUtil.d("BiUserLabelHelper", "result = ", Integer.valueOf(i2));
        if (i2 == 0 && (obj instanceof SparseArray)) {
            return (SparseArray) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(List<HiHealthData> list, List<HiHealthData> list2) {
        boolean z;
        if (njy.e(list)) {
            return e(list2);
        }
        int[] iArr = new int[4];
        boolean z2 = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                if (i2 == 0) {
                    if (System.currentTimeMillis() - list.get(i2).getEndTime() > 2592000000L) {
                        z2 = true;
                        z = z2;
                    } else {
                        z = false;
                    }
                } else {
                    z = z2;
                }
                e(list, iArr, i2, 10000, 20000);
                z2 = z;
            }
        }
        return c(iArr, z2);
    }

    private void e(List<HiHealthData> list, int[] iArr, int i2, int i3, int i4) {
        int totalDistance;
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(list.get(i2).getMetaData(), HiTrackMetaData.class);
        if (hiTrackMetaData != null && (totalDistance = hiTrackMetaData.getTotalDistance()) >= 0) {
            if (totalDistance < 5000) {
                iArr[0] = iArr[0] + 1;
                return;
            }
            if (totalDistance < i3) {
                iArr[1] = iArr[1] + 1;
            } else if (totalDistance < i4) {
                iArr[2] = iArr[2] + 1;
            } else {
                iArr[3] = iArr[3] + 1;
            }
        }
    }

    private String c(int[] iArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 != 0) {
                z2 = true;
            }
        }
        c(sb, iArr);
        if (z && z2) {
            sb.append(",");
            sb.append("SportStrength_5");
        } else if (z) {
            sb.append("SportStrength_5");
        } else {
            LogUtil.d("BiUserLabelHelper", "getRunIntensiveLabel else branch");
        }
        return sb.toString();
    }

    private StringBuilder c(StringBuilder sb, int[] iArr) {
        int i2;
        if (iArr[3] > 0) {
            sb.append("SportStrength_4");
            return sb;
        }
        int i3 = iArr[2];
        if (i3 > 2) {
            sb.append("SportStrength_3");
            return sb;
        }
        if (i3 > 0 || (i2 = iArr[1]) > 2) {
            sb.append("SportStrength_2");
            return sb;
        }
        if (i2 <= 0 && iArr[0] <= 0) {
            return sb;
        }
        sb.append("SportStrength_1");
        return sb;
    }

    private String e(List<HiHealthData> list) {
        return (!njy.e(list) && list.size() > 10) ? "SportStrength_0SportStrength_5" : "SportStrength_5";
    }

    private static HealthDataCloudFactory ar() {
        return new HealthDataCloudFactory(BaseApplication.b());
    }

    private void am() {
        LogUtil.a("BiUserLabelHelper", "enter generateUserLabelByCloudRule");
        flm flmVar = new flm();
        flmVar.e(fmo.a());
        oet.d().c(flmVar.getUrl(), ar().getHeaders(), ofe.c(ar().getBody(flmVar)), flp.class, new ResultCallback<flp>() { // from class: flt.19
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(flp flpVar) {
                LogUtil.a("BiUserLabelHelper", "generateUserLabelByCloudRule code = ", flpVar.getResultCode());
                flt.this.j(flpVar.c());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("BiUserLabelHelper", "generateUserLabelByCloudRule throwable ", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(List<fli> list) {
        if (njy.e(list)) {
            LogUtil.a("BiUserLabelHelper", "labelRules is empty");
            return;
        }
        for (fli fliVar : list) {
            List<flg.b> listC = fliVar.a().c();
            if (njy.e(listC)) {
                LogUtil.a("BiUserLabelHelper", "labelThresholdValue is empty");
                fmc.a(p).e(fliVar.e(), "", ao());
            } else {
                e(fliVar.e(), listC);
            }
        }
    }

    private void e(String str, List<flg.b> list) {
        boolean z = false;
        for (flg.b bVar : list) {
            String strE = bVar.e();
            LogUtil.a("BiUserLabelHelper", "parsingLabelRule rule is ", strE);
            if (fmo.e(strE)) {
                fmc.a(p).e(str, bVar.d(), ao());
                LogUtil.a("BiUserLabelHelper", "insert ", str, " is ", bVar.d());
                z = true;
            }
        }
        if (z) {
            return;
        }
        fmc.a(p).e(str, "", ao());
        LogUtil.a("BiUserLabelHelper", "insert ", str, " is empty label value");
    }
}
