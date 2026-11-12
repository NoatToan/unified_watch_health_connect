package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes11.dex */
public class nkv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StudentHeartRateZoneMgr f43228c = new StudentHeartRateZoneMgr(15);

    public nkv() {
        e();
    }

    public StudentHeartRateZoneMgr b() {
        return this.f43228c;
    }

    public final void e() {
        String studentHeartData = this.f43228c.getStudentHeartData();
        LogUtil.b("Heart_StudentDataManager", "updateStudentHeartDataFromSp data", studentHeartData);
        if (TextUtils.isEmpty(studentHeartData)) {
            LogUtil.d("Heart_StudentDataManager", "db data is null");
            return;
        }
        HeartRateThresholdConfig heartRateThresholdConfig = (HeartRateThresholdConfig) izn.d(studentHeartData, new TypeToken<HeartRateThresholdConfig>() { // from class: com.huawei.hwhealthdatamgr.StudentDataManager$1
        });
        if (heartRateThresholdConfig == null) {
            LogUtil.d("Heart_StudentDataManager", "fromJson data is null");
            return;
        }
        this.f43228c.setHeartRateConfig(heartRateThresholdConfig.getWarningEnable(), heartRateThresholdConfig.getWarningLimit(), heartRateThresholdConfig.getClassifyMethod(), heartRateThresholdConfig.getMaxThreshold(), heartRateThresholdConfig.getRestHeartRate());
        this.f43228c.setMaxHeartRateThreshold(heartRateThresholdConfig.getAnaerobicThreshold(), heartRateThresholdConfig.getAerobicThreshold(), heartRateThresholdConfig.getFatBurnThreshold(), heartRateThresholdConfig.getWarmUpThreshold(), heartRateThresholdConfig.getFitnessThreshold());
        this.f43228c.setHrrHeartRateZoneThreshold(heartRateThresholdConfig.getAnaerobicAdvanceThreshold(), heartRateThresholdConfig.getAnaerobicBaseThreshold(), heartRateThresholdConfig.getLacticAcidThreshold(), heartRateThresholdConfig.getAerobicAdvanceThreshold(), heartRateThresholdConfig.getAerobicBaseThreshold());
        this.f43228c.getStudentHeartRateThresholdData().setOldMaxThreshold(heartRateThresholdConfig.getOldMaxThreshold());
        this.f43228c.getStudentHeartRateThresholdData().getHeartZoneStateConfig().setIsSetWarningLimit(heartRateThresholdConfig.getHeartZoneStateConfig().getIsSetWarningLimit());
        this.f43228c.getStudentHeartRateThresholdData().getHeartZoneStateConfig().setIsSetMaxHeart(heartRateThresholdConfig.getHeartZoneStateConfig().getIsSetMaxHeart());
        LogUtil.b("Heart_StudentDataManager", "updateStudentHeartDataFromSp mStudentHeartRateZoneMgr", this.f43228c.getStudentHeartRateThresholdData().toString());
    }

    public void d(int i) {
        boolean isSetMaxHeart = this.f43228c.getStudentHeartRateThresholdData().getHeartZoneStateConfig().getIsSetMaxHeart();
        LogUtil.b("Heart_StudentDataManager", "is StudentMaxHeart", Boolean.valueOf(isSetMaxHeart));
        if (isSetMaxHeart) {
            return;
        }
        if (i == 0) {
            LogUtil.e("Heart_StudentDataManager", "StudentMaxHeart age error");
            return;
        }
        int i2 = 220 - i;
        this.f43228c.getStudentHeartRateThresholdData().setOldMaxThreshold(this.f43228c.getStudentHeartRateThresholdData().getMaxThreshold());
        if (!this.f43228c.getStudentWarningLimitStatus()) {
            this.f43228c.getStudentHeartRateThresholdData().setWarningLimit(i2);
        }
        LogUtil.b("Heart_StudentDataManager", "onStudentAgeChanged maxHeart", Integer.valueOf(i2));
        this.f43228c.getStudentHeartRateThresholdData().setMaxThreshold(i2);
        this.f43228c.setStudentHeartDataToSp();
    }

    public void d() {
        if (this.f43228c.getStudentHeartRateThresholdData().getClassifyMethod() == 1) {
            this.f43228c.getStudentHeartRateThresholdData().setRestHeartRate(this.f43228c.getStudentHeartRateThresholdData().getRestHeartRateDefault());
        }
        this.f43228c.getStudentHeartRateThresholdData().resetHeartZoneConf(c());
    }

    public int c() throws Throwable {
        String strB = KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_age_key", new StorageParams(1));
        if (CommonUtil.e(strB, 15) == 0) {
            return 15;
        }
        return CommonUtil.e(strB, 15);
    }

    public void a(int i) {
        if (i == 0) {
            LogUtil.e("Heart_StudentDataManager", "StudentMaxHeart age error");
            i = 15;
        }
        StudentHeartRateZoneMgr studentHeartRateZoneMgr = new StudentHeartRateZoneMgr(i);
        this.f43228c = studentHeartRateZoneMgr;
        LogUtil.b("Heart_StudentDataManager", "resetHeartZoneData mStudentHeartRateZoneMgr=", studentHeartRateZoneMgr.getStudentHeartRateThresholdData().toString());
    }
}
