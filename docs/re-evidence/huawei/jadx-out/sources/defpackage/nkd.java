package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class nkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static nkd f43147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43148b = new Object();
    private nkv e = new nkv();
    private HeartRateZoneMgr d = new HeartRateZoneMgr(30);

    private nkd() {
    }

    public static nkd c() {
        nkd nkdVar;
        synchronized (f43148b) {
            if (f43147a == null) {
                f43147a = new nkd();
            }
            nkdVar = f43147a;
        }
        return nkdVar;
    }

    public nkv b() {
        return this.e;
    }

    private HeartRateThresholdConfig i() {
        return this.e.b().getStudentHeartRateThresholdData();
    }

    public HeartRateZoneMgr a() {
        return this.d;
    }

    public void b(boolean z, int i) {
        if (z) {
            b().d();
            return;
        }
        if (this.d.getPostureType(i).getClassifyMethod() == 1) {
            this.d.getPostureType(i).setRestHeartRate(this.d.getPostureType(i).getRestHeartRateDefault());
        }
        this.d.getPostureType(i).resetHeartZoneConf(nkb.d().l().getAgeOrDefaultValue());
        if (i == 1) {
            nkb.d().n();
        }
    }

    public int c(boolean z, int i) {
        if (z) {
            return b().b().getStudentHeartRateThresholdData().getRestHeartRate();
        }
        return this.d.getPostureType(i).getRestHeartRate();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public void a(HeartZoneConf heartZoneConf, UserInfomation userInfomation) {
        HeartRateZoneMgr heartRateZoneMgr;
        boolean zJ;
        LogUtil.b("Heart_HeartRateDataManager", " updateAllPostureData");
        this.d = new HeartRateZoneMgr(userInfomation.getAgeOrDefaultValue());
        d(heartZoneConf);
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("userPreference_HeartRate_all_posture_data");
        if (userPreference != null) {
            try {
                LogUtil.b("Heart_HeartRateDataManager", " allPostureData =  ", userPreference.getValue());
                heartRateZoneMgr = (HeartRateZoneMgr) izn.d(userPreference.getValue(), new TypeToken<HeartRateZoneMgr>() { // from class: com.huawei.hwhealthdatamgr.HeartRateDataManager$1
                });
            } catch (NumberFormatException unused) {
                LogUtil.d("Heart_HeartRateDataManager", " updateAllPostureData parse value fail ");
                heartRateZoneMgr = null;
            }
            if (!a(heartRateZoneMgr) && a(this.d)) {
                LogUtil.b("Heart_HeartRateDataManager", " set heart data");
                c(heartRateZoneMgr, 2, heartZoneConf);
                c(heartRateZoneMgr, 3, heartZoneConf);
                c(heartRateZoneMgr, 4, heartZoneConf);
                return;
            }
            zJ = j();
            LogUtil.b("Heart_HeartRateDataManager", "allPostureData is null and Birthday data is ", Boolean.valueOf(zJ));
            if (zJ) {
                return;
            }
            d(userInfomation.getAgeOrDefaultValue());
        }
        LogUtil.e("Heart_HeartRateDataManager", "userDate is null");
        heartRateZoneMgr = null;
        if (!a(heartRateZoneMgr)) {
        }
        zJ = j();
        LogUtil.b("Heart_HeartRateDataManager", "allPostureData is null and Birthday data is ", Boolean.valueOf(zJ));
        if (zJ) {
            return;
        }
        d(userInfomation.getAgeOrDefaultValue());
    }

    private void d(int i) {
        if (this.d.getPostureType(2) == null) {
            LogUtil.d("Heart_HeartRateDataManager", "RIDING_POSTURE is null ");
            c(2, i);
        }
        if (this.d.getPostureType(3) == null) {
            LogUtil.d("Heart_HeartRateDataManager", "STROKES_POSTURE is null ");
            c(3, i);
        }
        if (this.d.getPostureType(4) == null) {
            LogUtil.d("Heart_HeartRateDataManager", "OTHER_POSTURE is null ");
            c(4, i);
        }
    }

    private void c(int i, int i2) {
        this.d.setHeartRateThreshold(i, new HeartRateThresholdConfig(i, i2));
    }

    private boolean j() {
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1006);
        if (!TextUtils.isEmpty(accountInfo) && !Integer.toString(-100).equals(accountInfo)) {
            return false;
        }
        HeartRateThresholdConfig heartRateThresholdConfig = new HeartRateThresholdConfig(1, 25);
        this.d.setHeartRateThreshold(1, heartRateThresholdConfig);
        this.d.setHeartRateThreshold(2, heartRateThresholdConfig);
        this.d.setHeartRateThreshold(3, heartRateThresholdConfig);
        this.d.setHeartRateThreshold(4, heartRateThresholdConfig);
        return true;
    }

    private boolean a(HeartRateZoneMgr heartRateZoneMgr) {
        if (heartRateZoneMgr == null) {
            LogUtil.e("Heart_HeartRateDataManager", "allPostureData == null");
            return false;
        }
        if (heartRateZoneMgr.getPostureType(2) != null && heartRateZoneMgr.getPostureType(3) != null && heartRateZoneMgr.getPostureType(4) != null) {
            return true;
        }
        LogUtil.e("Heart_HeartRateDataManager", "allPostureData.getPostureType == null");
        return false;
    }

    private void c(HeartRateZoneMgr heartRateZoneMgr, int i, HeartZoneConf heartZoneConf) {
        boolean isSetWarningLimit;
        boolean isSetMaxHeart;
        int warningLimit = heartZoneConf.getHeartRateZoneMgr().getPostureType(i).getWarningLimit();
        HeartRateThresholdConfig.HeartZoneStateConfig heartZoneStateConfig = heartRateZoneMgr.getPostureType(i).getHeartZoneStateConfig();
        if (heartZoneStateConfig != null) {
            isSetWarningLimit = heartZoneStateConfig.getIsSetWarningLimit();
            isSetMaxHeart = heartZoneStateConfig.getIsSetMaxHeart();
        } else {
            isSetWarningLimit = false;
            isSetMaxHeart = false;
        }
        if (isSetWarningLimit) {
            warningLimit = heartRateZoneMgr.getPostureType(i).getWarningLimit();
        }
        int i2 = warningLimit;
        int maxThreshold = heartZoneConf.getHeartRateZoneMgr().getPostureType(i).getMaxThreshold();
        if (isSetMaxHeart) {
            maxThreshold = heartRateZoneMgr.getPostureType(i).getMaxThreshold();
        }
        int i3 = maxThreshold;
        HeartRateThresholdConfig postureType = this.d.getPostureType(i);
        if (postureType != null) {
            postureType.setWarningLimit(i2);
            postureType.setMaxThreshold(i3);
            HeartRateThresholdConfig.HeartZoneStateConfig heartZoneStateConfig2 = postureType.getHeartZoneStateConfig();
            if (heartZoneStateConfig2 != null) {
                heartZoneStateConfig2.setIsSetMaxHeart(isSetMaxHeart);
                heartZoneStateConfig2.setIsSetWarningLimit(isSetWarningLimit);
            }
        }
        this.d.setHeartRateConfig(i, heartRateZoneMgr.getPostureType(i).getWarningEnable(), i2, heartRateZoneMgr.getPostureType(i).getClassifyMethod(), i3, heartRateZoneMgr.getPostureType(i).getRestHeartRate());
        this.d.setMaxHeartRateThreshold(i, heartRateZoneMgr.getPostureType(i).getAnaerobicThreshold(), heartRateZoneMgr.getPostureType(i).getAerobicThreshold(), heartRateZoneMgr.getPostureType(i).getFatBurnThreshold(), heartRateZoneMgr.getPostureType(i).getWarmUpThreshold(), heartRateZoneMgr.getPostureType(i).getFitnessThreshold());
        this.d.setHrrHeartRateZoneThreshold(i, heartRateZoneMgr.getPostureType(i).getAnaerobicAdvanceThreshold(), heartRateZoneMgr.getPostureType(i).getAnaerobicBaseThreshold(), heartRateZoneMgr.getPostureType(i).getLacticAcidThreshold(), heartRateZoneMgr.getPostureType(i).getAerobicAdvanceThreshold(), heartRateZoneMgr.getPostureType(i).getAerobicBaseThreshold());
    }

    public void e(final boolean z, final int i) {
        lsy.a(new Runnable() { // from class: nkd.1
            @Override // java.lang.Runnable
            public void run() {
                if (!z) {
                    nkd.this.d.getPostureType(i).getHeartZoneStateConfig().setIsSetMaxHeart(true);
                    if (i != 1) {
                        return;
                    }
                    nkd.this.f();
                    return;
                }
                nkd.this.e.b().getStudentHeartRateThresholdData().getHeartZoneStateConfig().setIsSetMaxHeart(true);
            }
        });
    }

    public void f() {
        lsy.a(new Runnable() { // from class: nkd.2
            @Override // java.lang.Runnable
            public void run() {
                HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("custom.UserPreference_HeartRate_Flag", "1"), true);
                LogUtil.b("Heart_HeartRateDataManager", "saveHeartRateMaxValueDataToDB finish.");
            }
        });
    }

    public void e(final int i) {
        lsy.a(new Runnable() { // from class: nkd.5
            @Override // java.lang.Runnable
            public void run() {
                nkd.this.d.getPostureType(i).getHeartZoneStateConfig().setIsSetWarningLimit(true);
                if (i != 1) {
                    return;
                }
                nkd.this.e();
            }
        });
    }

    public void e() {
        lsy.a(new Runnable() { // from class: nkd.3
            @Override // java.lang.Runnable
            public void run() {
                HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("custom.UserPreference_HeartRate_Limit_Flag", "1"), true);
                LogUtil.b("Heart_HeartRateDataManager", "saveHeartRateLimitValueDataToDB finish.");
            }
        });
    }

    public void g() {
        lsy.a(new Runnable() { // from class: nkd.4
            @Override // java.lang.Runnable
            public void run() {
                nkd.this.f(1);
                nkd.this.f(2);
                nkd.this.f(3);
                nkd.this.f(4);
                String json = new Gson().toJson(nkd.this.d);
                LogUtil.b("Heart_HeartRateDataManager", "writeAllPostureDataToDataBase", json);
                HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).setUserPreference(new HiUserPreference("userPreference_HeartRate_all_posture_data", json), true);
                nkb.d().a((HeartZoneConf) null);
            }
        });
    }

    public HeartRateZoneMgr d() {
        HiUserPreference userPreference = HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).getUserPreference("userPreference_HeartRate_all_posture_data");
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.e("Heart_HeartRateDataManager", "hiUserPreference null");
            return a();
        }
        try {
            return (HeartRateZoneMgr) new Gson().fromJson(userPreference.getValue(), HeartRateZoneMgr.class);
        } catch (JsonSyntaxException | NumberFormatException unused) {
            LogUtil.d("Heart_HeartRateDataManager", " getHeartRateZoneMgrByCache exception");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        this.d.getPostureType(i).setOldMaxThreshold(this.d.getPostureType(i).getMaxThreshold());
    }

    public void d(int i, int i2) {
        if (i == 1) {
            nkb.d().a(i2);
        }
        this.d.getPostureType(i).setClassifyMethod(i2);
    }

    public void d(boolean z, int i, int i2) {
        if (z) {
            i().setRestHeartRate(i2);
            return;
        }
        if (i == 1) {
            nkb.d().b(i2);
        }
        this.d.getPostureType(i).setRestHeartRate(i2);
    }

    public void a(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LogUtil.b("Heart_HeartRateDataManager", "Enter setHeartRateZoneSettingInfo !", Boolean.valueOf(z));
        if (z) {
            i().setWarningEnable(z2);
            i().setWarningLimit(i2);
            i().setMaxThreshold(i3);
            i().setAnaerobicThreshold(i4);
            i().setAerobicThreshold(i5);
            i().setFatBurnThreshold(i6);
            i().setWarmUpThreshold(i7);
            i().setFitnessThreshold(i8);
            return;
        }
        new HeartZoneConf();
        this.d.getPostureType(i).setWarningEnable(z2);
        this.d.getPostureType(i).setWarningLimit(i2);
        this.d.getPostureType(i).setMaxThreshold(i3);
        this.d.getPostureType(i).setAnaerobicThreshold(i4);
        this.d.getPostureType(i).setAerobicThreshold(i5);
        this.d.getPostureType(i).setFatBurnThreshold(i6);
        this.d.getPostureType(i).setWarmUpThreshold(i7);
        this.d.getPostureType(i).setFitnessThreshold(i8);
        if (i != 1) {
            return;
        }
        c(this.d.getPostureType(i));
        LogUtil.b("Heart_HeartRateDataManager", "Leave setHeartRateZoneSettingInfo !");
    }

    public void c(HeartRateThresholdConfig heartRateThresholdConfig) {
        LogUtil.b("Heart_HeartRateDataManager", "Enter setHeartRateZoneSettingInfo !");
        HeartZoneConf heartZoneConf = new HeartZoneConf();
        if (heartRateThresholdConfig != null) {
            heartZoneConf.setWarningEnble(heartRateThresholdConfig.getWarningEnable());
            heartZoneConf.setWarningLimitHR(heartRateThresholdConfig.getWarningLimit());
            heartZoneConf.setWarningEnbleHRR(heartRateThresholdConfig.getWarningEnable());
            heartZoneConf.setWarningLimitHRHRR(heartRateThresholdConfig.getWarningLimit());
            heartZoneConf.setMaxThreshold(heartRateThresholdConfig.getMaxThreshold());
            heartZoneConf.setAnaerobicThreshold(heartRateThresholdConfig.getAnaerobicThreshold());
            heartZoneConf.setAerobicThreshold(heartRateThresholdConfig.getAerobicThreshold());
            heartZoneConf.setFatBurnThreshold(heartRateThresholdConfig.getFatBurnThreshold());
            heartZoneConf.setWarmUpThreshold(heartRateThresholdConfig.getWarmUpThreshold());
            heartZoneConf.setFitnessThreshold(heartRateThresholdConfig.getFitnessThreshold());
            LogUtil.b("Heart_HeartRateDataManager", "setHeartRateZoneSettingInfo mHeartZoneConfingInfo = ", heartZoneConf.toString());
            nkb.d().d(heartZoneConf);
        }
        LogUtil.b("Heart_HeartRateDataManager", "Leave setHeartRateZoneSettingInfo !");
    }

    public void e(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LogUtil.b("Heart_HeartRateDataManager", "Enter setHeartRateZoneSettingInfo !");
        if (z) {
            i().setWarningEnable(z2);
            i().setWarningLimit(i2);
            i().setMaxThreshold(i3);
            i().setAnaerobicAdvanceThreshold(i4);
            i().setAnaerobicBaseThreshold(i5);
            i().setLacticAcidThreshold(i6);
            i().setAerobicAdvanceThreshold(i7);
            i().setAerobicBaseThreshold(i8);
            return;
        }
        new HeartZoneConf();
        this.d.getPostureType(i).setWarningEnable(z2);
        this.d.getPostureType(i).setWarningLimit(i2);
        this.d.getPostureType(i).setMaxThreshold(i3);
        this.d.getPostureType(i).setAnaerobicAdvanceThreshold(i4);
        this.d.getPostureType(i).setAnaerobicBaseThreshold(i5);
        this.d.getPostureType(i).setLacticAcidThreshold(i6);
        this.d.getPostureType(i).setAerobicAdvanceThreshold(i7);
        this.d.getPostureType(i).setAerobicBaseThreshold(i8);
        if (i != 1) {
            return;
        }
        e(this.d.getPostureType(i));
        LogUtil.b("Heart_HeartRateDataManager", "Leave setHeartRateZoneSettingInfo !");
    }

    private void e(HeartRateThresholdConfig heartRateThresholdConfig) {
        LogUtil.b("Heart_HeartRateDataManager", "Enter setHeartRateZoneSettingInfo !");
        HeartZoneConf heartZoneConf = new HeartZoneConf();
        if (heartRateThresholdConfig != null) {
            heartZoneConf.setWarningEnbleHRR(heartRateThresholdConfig.getWarningEnable());
            heartZoneConf.setWarningLimitHRHRR(heartRateThresholdConfig.getWarningLimit());
            heartZoneConf.setWarningEnble(heartRateThresholdConfig.getWarningEnable());
            heartZoneConf.setWarningLimitHR(heartRateThresholdConfig.getWarningLimit());
            heartZoneConf.setHrrMaxThreshold(heartRateThresholdConfig.getMaxThreshold());
            heartZoneConf.setAnaerobicAdvanceThreshold(heartRateThresholdConfig.getAnaerobicAdvanceThreshold());
            heartZoneConf.setAnaerobicBaseThreshold(heartRateThresholdConfig.getAnaerobicBaseThreshold());
            heartZoneConf.setLacticAcidThreshold(heartRateThresholdConfig.getLacticAcidThreshold());
            heartZoneConf.setAerobicAdvanceThreshold(heartRateThresholdConfig.getAerobicAdvanceThreshold());
            heartZoneConf.setAerobicBaseThreshold(heartRateThresholdConfig.getAerobicBaseThreshold());
            LogUtil.b("Heart_HeartRateDataManager", "setHeartRateZoneSettingInfo mHeartZoneConfingInfo = ", heartZoneConf.toString());
            nkb.d().c(heartZoneConf);
        }
        LogUtil.b("Heart_HeartRateDataManager", "Leave setHeartRateZoneSettingInfo !");
    }

    public int a(int i) {
        if (i != 1) {
            return c(i);
        }
        return nkb.d().f();
    }

    public void b(int i) {
        this.d.getPostureType(1).setRestHeartRateDefault(i);
        this.d.getPostureType(2).setRestHeartRateDefault(i);
        this.d.getPostureType(3).setRestHeartRateDefault(i);
        this.d.getPostureType(4).setRestHeartRateDefault(i);
    }

    private void d(HeartZoneConf heartZoneConf) {
        this.d.setHeartRateConfig(1, heartZoneConf.isWarningEnble(), heartZoneConf.getWarningLimitHR(), heartZoneConf.getClassifyMethod(), heartZoneConf.getMaxThreshold(), heartZoneConf.getRestHeartRate());
        this.d.setMaxHeartRateThreshold(1, heartZoneConf.getAnaerobicThreshold(), heartZoneConf.getAerobicThreshold(), heartZoneConf.getFatBurnThreshold(), heartZoneConf.getWarmUpThreshold(), heartZoneConf.getFitnessThreshold());
        this.d.setHrrHeartRateZoneThreshold(1, heartZoneConf.getAnaerobicAdvanceThreshold(), heartZoneConf.getAnaerobicBaseThreshold(), heartZoneConf.getLacticAcidThreshold(), heartZoneConf.getAerobicAdvanceThreshold(), heartZoneConf.getAerobicBaseThreshold());
    }

    public void c(boolean z) {
        this.d.getPostureType(1).getHeartZoneStateConfig().setIsSetWarningLimit(z);
    }

    public void d(boolean z) {
        this.d.getPostureType(1).getHeartZoneStateConfig().setIsSetMaxHeart(z);
    }

    public int c(int i) {
        HeartRateZoneMgr heartRateZoneMgr;
        int maxThreshold = new HeartRateThresholdConfig(i, nkb.d().l().getAgeOrDefaultValue()).getMaxThreshold();
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("userPreference_HeartRate_all_posture_data");
        if (userPreference != null) {
            try {
                heartRateZoneMgr = (HeartRateZoneMgr) izn.d(userPreference.getValue(), new TypeToken<HeartRateZoneMgr>() { // from class: com.huawei.hwhealthdatamgr.HeartRateDataManager$7
                });
            } catch (NumberFormatException unused) {
                LogUtil.d("Heart_HeartRateDataManager", "getMaxHeartRateValue updateAllPostureData parse value fail ");
                heartRateZoneMgr = null;
            }
        } else {
            heartRateZoneMgr = null;
        }
        if (heartRateZoneMgr == null) {
            return maxThreshold;
        }
        int maxThreshold2 = heartRateZoneMgr.getPostureType(i).getMaxThreshold();
        LogUtil.b("Heart_HeartRateDataManager", "getMaxHeartRateValue maxHeart ", Integer.valueOf(maxThreshold2));
        return maxThreshold2;
    }
}
