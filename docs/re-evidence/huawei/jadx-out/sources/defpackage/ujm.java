package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class ujm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f50251a;
    private static final Object d = new Object();
    private static ujm e;
    private ExecutorService f = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HeartZoneConf f50252b = new HeartZoneConf();
    private IntentFilter j = new IntentFilter();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f50253c = new ArrayList(16);
    private CountDownLatch h = new CountDownLatch(1);
    private boolean i = false;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: ujm.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            LogUtil.a("Common_HWOldHealthDataManager", "receive broadcastReceiver");
            if (intent == null || (action = intent.getAction()) == null || !action.equals("com.huawei.health.heart_zone_conf_migrate_finish")) {
                return;
            }
            LogUtil.a("Common_HWOldHealthDataManager", "receive com.huawei.health.heart_zone_conf_migrate_finish");
            ujm.this.b();
        }
    };
    private BroadcastReceiver o = new BroadcastReceiver() { // from class: ujm.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Common_HWOldHealthDataManager", "receive broadcastReceiver");
            if (intent == null || !"com.huawei.bone.action.FITNESS_USERINFO_UPDATED".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("Common_HWOldHealthDataManager", "userinfo save finished then update heartzonethreshold");
            ujm.this.c();
        }
    };
    private HiSubscribeListener l = new HiSubscribeListener() { // from class: ujm.4
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("Common_HWOldHealthDataManager", "subscribeHiHealthData onResult");
            if (list == null || list.isEmpty()) {
                return;
            }
            LogUtil.a("Common_HWOldHealthDataManager", "subscribeHiHealthData success");
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("Common_HWOldHealthDataManager", "subscribeHiHealthData onChange type = ", Integer.valueOf(i), ",changeType = ", str);
            if (i == 102 && "HiSyncUserData".equals(str)) {
                LogUtil.a("Common_HWOldHealthDataManager", "subscribeHiHealthData receive userinfo update Msg");
                ujm.this.c();
                ujm.this.a();
            }
        }
    };

    private ujm() {
        f50251a = BaseApplication.getContext();
        c();
        LocalBroadcastManager.getInstance().registerReceiver(this.o, new IntentFilter("com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));
        this.j.addAction("com.huawei.health.heart_zone_conf_migrate_finish");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.g, this.j, "com.huawei.health.heartZonePermission", null);
        this.f50253c.clear();
        this.f50253c.add(102);
        HiHealthManager.d(f50251a).subscribeHiHealthData(this.f50253c, this.l);
    }

    public static ujm e() {
        ujm ujmVar;
        synchronized (d) {
            if (e == null) {
                e = new ujm();
            }
            ujmVar = e;
        }
        return ujmVar;
    }

    public void b(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HWOldHealthDataManager", "HWOldHealthDataManager getCoreSleepDetail()");
        ujn.d().e(j, i, i2, i3, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.execute(new Runnable() { // from class: ujm.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Common_HWOldHealthDataManager", "updateHeartRateThroshold enter");
                UserInfomation userInfomationD = ujm.this.d();
                ujm.this.i = userInfomationD.getAgeOrDefaultValue() != 0;
                if (ujm.this.i) {
                    ujm.this.d(userInfomationD);
                    return;
                }
                LogUtil.j("Common_HWOldHealthDataManager", "get user info fail.");
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put("actiontype", Integer.toString(1));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserInfomation userInfomation) {
        HeartZoneConf heartZoneConf = new HeartZoneConf(userInfomation.getAgeOrDefaultValue());
        heartZoneConf.setRestHeartRateDefault(this.f50252b.getRestHeartRateDefault());
        heartZoneConf.resetHeartZoneConf(userInfomation.getAgeOrDefaultValue());
        Context context = BaseApplication.getContext();
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Classify_Method");
        int iJ = userPreference != null ? CommonUtil.j(userPreference.getValue()) : 0;
        heartZoneConf.setClassifyMethod(iJ);
        int restHeartRateDefault = this.f50252b.getRestHeartRateDefault();
        HiUserPreference userPreference2 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_Rest_HeartRate");
        if (userPreference2 != null) {
            restHeartRateDefault = CommonUtil.e(userPreference2.getValue(), 60);
        }
        heartZoneConf.setRestHeartRate(restHeartRateDefault);
        HiUserPreference userPreference3 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Limit_Flag");
        HiUserPreference userPreference4 = HiHealthManager.d(context).getUserPreference("custom.UserPreference_HeartRate_Flag");
        e(heartZoneConf, userPreference3, userPreference4);
        b(heartZoneConf, userPreference3, userPreference4);
        LogUtil.d("Common_HWOldHealthDataManager", "getHeartZoneConf ", heartZoneConf);
        this.f50252b.setClassifyMethod(iJ);
        this.f50252b.setRestHeartRate(restHeartRateDefault);
        this.f50252b.setHeartZoneConf(heartZoneConf);
        this.f50252b.setHRRHeartZoneConf(heartZoneConf);
        nkd.c().a(heartZoneConf, userInfomation);
        this.h.countDown();
    }

    private void e(HeartZoneConf heartZoneConf, HiUserPreference hiUserPreference, HiUserPreference hiUserPreference2) {
        if (heartZoneConf == null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config");
        int warningLimitHR = heartZoneConf.getWarningLimitHR();
        int maxThreshold = heartZoneConf.getMaxThreshold();
        if (userPreference == null || userPreference.getValue() == null) {
            LogUtil.j("Common_HWOldHealthDataManager", "updateMaxHeartRate userPreferenceHeartValue error or getValue error");
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        heartZoneConf.setHRZoneConf(strArrSplit[0]);
        heartZoneConf.setThreshold(strArrSplit[1]);
        if (hiUserPreference != null) {
            int iJ = CommonUtil.j(hiUserPreference.getValue());
            if (iJ == 0) {
                heartZoneConf.setWarningLimitHR(warningLimitHR);
            }
            nkd.c().c(iJ != 0);
        }
        if (hiUserPreference2 != null) {
            int iJ2 = CommonUtil.j(hiUserPreference2.getValue());
            if (iJ2 == 0) {
                heartZoneConf.setMaxThreshold(maxThreshold);
            }
            nkd.c().d(iJ2 != 0);
        }
    }

    private void b(HeartZoneConf heartZoneConf, HiUserPreference hiUserPreference, HiUserPreference hiUserPreference2) {
        if (heartZoneConf == null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HRRHeartZone_Config");
        int warningLimitHRHRR = heartZoneConf.getWarningLimitHRHRR();
        int hrrMaxThreshold = heartZoneConf.getHrrMaxThreshold();
        if (userPreference == null || userPreference.getValue() == null) {
            LogUtil.j("Common_HWOldHealthDataManager", "updateReserveHeartRate userPreferenceValue2 error or getValue error");
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        heartZoneConf.setHRRHRZoneConf(strArrSplit[0]);
        heartZoneConf.setHrrThreshold(strArrSplit[1]);
        if (hiUserPreference != null && CommonUtil.j(hiUserPreference.getValue()) == 0) {
            heartZoneConf.setWarningLimitHRHRR(warningLimitHRHRR);
        }
        if (hiUserPreference2 == null || CommonUtil.j(hiUserPreference2.getValue()) != 0) {
            return;
        }
        heartZoneConf.setHrrMaxThreshold(hrrMaxThreshold);
    }

    public void c(HeartZoneConf heartZoneConf) {
        LogUtil.a("Common_HWOldHealthDataManager", "setHeartRateThrosholdConf enter");
        this.f50252b.setHeartZoneConf(heartZoneConf);
    }

    public void d(HeartZoneConf heartZoneConf) {
        LogUtil.a("Common_HWOldHealthDataManager", "setHRRHeartRateThrosholdConf enter");
        this.f50252b.setHRRHeartZoneConf(heartZoneConf);
    }

    public void c(int i) {
        this.f50252b.setClassifyMethod(i);
    }

    public void b(int i) {
        this.f50252b.setRestHeartRate(i);
    }

    public void a() {
        this.f.execute(new Runnable() { // from class: ujm.10
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.metric_imperial_unit");
                HiUserPreference userPreference2 = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.temperature_unit");
                ujm.this.d(userPreference);
                ujm.this.c(userPreference2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public void d(HiUserPreference hiUserPreference) {
        boolean z;
        if (hiUserPreference != null && d(hiUserPreference.getValue())) {
            z = qrs.a(hiUserPreference.getValue()) == 1;
        }
        UnitUtil.b("Common_HWOldHealthDataManager", z);
    }

    private boolean d(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiUserPreference hiUserPreference) {
        String value;
        if (hiUserPreference == null) {
            value = "";
        } else {
            value = hiUserPreference.getValue();
        }
        UnitUtil.d(!"false".equals(value));
    }

    public UserInfomation d() {
        UserInfomation userInfoFromDbSync = LoginInit.getInstance(f50251a).getUserInfoFromDbSync();
        if (userInfoFromDbSync != null) {
            return userInfoFromDbSync;
        }
        UserInfomation userInfomation = new UserInfomation();
        LogUtil.a("Common_HWOldHealthDataManager", "getLocalUserinfo new userInfomation");
        return userInfomation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f.execute(new Runnable() { // from class: ujm.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Common_HWOldHealthDataManager", "MigrateHeartZoneConf enter");
                HeartZoneConf heartZoneConf = new HeartZoneConf(ujm.this.d().getAgeOrDefaultValue());
                ujm.this.a("custom.UserPreference_HeartRate_Classify_Method");
                ujm.this.a("custom.UserPreference_Rest_HeartRate");
                ujm.this.e(heartZoneConf, "custom.UserPreference_HeartZone_Config");
                ujm.this.e(heartZoneConf, "custom.UserPreference_HRRHeartZone_Config");
                LogUtil.a("Common_HWOldHealthDataManager", "MigrateHeartZoneConf exit");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
        if (userPreference == null) {
            return;
        }
        int iJ = CommonUtil.j(userPreference.getValue());
        if (str.equals("custom.UserPreference_HeartRate_Classify_Method")) {
            c(iJ);
        } else if (str.equals("custom.UserPreference_Rest_HeartRate")) {
            b(iJ);
        } else {
            LogUtil.j("Common_HWOldHealthDataManager", "setHeartRateConf1 flag is wrong");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HeartZoneConf heartZoneConf, String str) {
        LogUtil.d("Common_HWOldHealthDataManager", "getHeartZoneConf ", heartZoneConf);
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
        if (userPreference == null || userPreference.getValue() == null) {
            return;
        }
        String[] strArrSplit = userPreference.getValue().split(",");
        if (strArrSplit.length != 2) {
            return;
        }
        str.hashCode();
        if (str.equals("custom.UserPreference_HeartZone_Config")) {
            this.f50252b.setThreshold(strArrSplit[0]);
            c(this.f50252b);
        } else if (str.equals("custom.UserPreference_HRRHeartZone_Config")) {
            this.f50252b.setHrrThreshold(strArrSplit[0]);
            d(this.f50252b);
        } else {
            LogUtil.j("Common_HWOldHealthDataManager", "setHeartRateConf2 flag is wrong");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{46018, 46020});
        hiAggregateOption.setConstantsKey(new String[]{"HR_REST", "HR_SLEEP_REST"});
        hiAggregateOption.setStartTime(lsl.c(jCurrentTimeMillis, -30));
        hiAggregateOption.setEndTime(jCurrentTimeMillis);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setGroupUnitType(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: ujm.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                if (sparseArray == null || sparseArray.size() == 0) {
                    LogUtil.j("Common_HWOldHealthDataManager", "there is no average rest heart rate!", " and ", " errorCode :", Integer.valueOf(i));
                    ujm.this.f50252b.setRestHeartRateDefault(60);
                    nkd.c().b(60);
                } else {
                    ujm ujmVar = ujm.this;
                    float fB = ujmVar.b((List<HiHealthData>) ujmVar.d(sparseArray)) + 0.0f;
                    if (fB != 0.0f) {
                        ujm.this.f50252b.setRestHeartRateDefault(Math.round(fB));
                    } else {
                        LogUtil.j("Common_HWOldHealthDataManager", "there is average rest heart rate is zero");
                        ujm.this.f50252b.setRestHeartRateDefault(60);
                    }
                    nkd.c().b(fB != 0.0f ? Math.round(fB) : 60);
                }
                ujm.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> d(SparseArray<List<HiHealthData>> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(sparseArray.get(1))) {
            List<HiHealthData> list = sparseArray.get(1);
            LogUtil.a("Common_HWOldHealthDataManager", "average rest heart rate newValue = ", list.toString());
            arrayList.addAll(list);
        }
        if (!njy.e(sparseArray.get(0))) {
            List<HiHealthData> list2 = sparseArray.get(0);
            LogUtil.a("Common_HWOldHealthDataManager", "average rest heart rate oldValue = ", list2.toString());
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(List<HiHealthData> list) {
        float f;
        float f2;
        int i = 0;
        if (njy.e(list)) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getFloat("HR_SLEEP_REST") > 0.0f) {
                    f2 = hiHealthData.getFloat("HR_SLEEP_REST");
                } else {
                    f2 = hiHealthData.getFloat("HR_REST");
                }
                f += f2;
                i++;
            }
        }
        if (i != 0) {
            return f / i;
        }
        LogUtil.j("Common_HWOldHealthDataManager", "count IS  ZERO");
        return 0.0f;
    }
}
