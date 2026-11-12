package com.huami.device.feature.health.user;

import com.huami.widget.share.ShareAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b;\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bJ\u0010KJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u001c\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001f\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010(\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010+\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001c\u0010.\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001c\u00101\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001c\u00104\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001c\u00107\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\u001c\u0010:\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000fR\u001c\u0010=\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001c\u0010@\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001c\u0010C\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR\u001c\u0010F\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR\u001c\u0010I\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010\r\"\u0004\bH\u0010\u000f¨\u0006L"}, d2 = {"Lcom/huami/device/feature/health/user/HealthSettingConfig;", "", "", "syncToServer", "", "commitChange", "resetToDefault", "resetOnBind", ShareAnalytics.ParamValue.SAVE, "adjustConfig", "a", "Z", "getSleepingBloodPressureMonitorEnable", "()Z", "setSleepingBloodPressureMonitorEnable", "(Z)V", "sleepingBloodPressureMonitorEnable", "", "getHrDetectType", "()I", "setHrDetectType", "(I)V", "hrDetectType", "getHrEnable", "setHrEnable", "hrEnable", "getFreq", "setFreq", "freq", "getAtrialFibEnable", "setAtrialFibEnable", "atrialFibEnable", "getAtrialSleepNotDisturb", "setAtrialSleepNotDisturb", "atrialSleepNotDisturb", "getWarningEnable", "setWarningEnable", "warningEnable", "getWarningValue", "setWarningValue", "warningValue", "getHighWarningValue", "setHighWarningValue", "highWarningValue", "getLowWarningValue", "setLowWarningValue", "lowWarningValue", "getHrSleepEnable", "setHrSleepEnable", "hrSleepEnable", "getSleepAssistEnable", "setSleepAssistEnable", "sleepAssistEnable", "getSportHrCheckEnable", "setSportHrCheckEnable", "sportHrCheckEnable", "getOsaEnable", "setOsaEnable", "osaEnable", "getSmartSpo2Enable", "setSmartSpo2Enable", "smartSpo2Enable", "getLowSpo2AlertValue", "setLowSpo2AlertValue", "lowSpo2AlertValue", "getPressureEnable", "setPressureEnable", "pressureEnable", "getPressureAlertEnable", "setPressureAlertEnable", "pressureAlertEnable", "getNeedMigrationHRWay", "setNeedMigrationHRWay", "needMigrationHRWay", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class HealthSettingConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean sleepingBloodPressureMonitorEnable;

    public static /* synthetic */ void commitChange$default(HealthSettingConfig healthSettingConfig, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitChange");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        healthSettingConfig.commitChange(z);
    }

    public static /* synthetic */ void save$default(HealthSettingConfig healthSettingConfig, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        healthSettingConfig.save(z);
    }

    public void adjustConfig() {
    }

    public abstract void commitChange(boolean syncToServer);

    public abstract boolean getAtrialFibEnable();

    public abstract boolean getAtrialSleepNotDisturb();

    public abstract int getFreq();

    public abstract int getHighWarningValue();

    public abstract int getHrDetectType();

    public abstract boolean getHrEnable();

    public abstract boolean getHrSleepEnable();

    public abstract int getLowSpo2AlertValue();

    public abstract int getLowWarningValue();

    public abstract boolean getNeedMigrationHRWay();

    public abstract boolean getOsaEnable();

    public abstract boolean getPressureAlertEnable();

    public abstract boolean getPressureEnable();

    public abstract boolean getSleepAssistEnable();

    public boolean getSleepingBloodPressureMonitorEnable() {
        return this.sleepingBloodPressureMonitorEnable;
    }

    public abstract boolean getSmartSpo2Enable();

    public abstract boolean getSportHrCheckEnable();

    public abstract boolean getWarningEnable();

    public abstract int getWarningValue();

    public abstract void resetOnBind();

    public abstract void resetToDefault();

    public final void save(boolean syncToServer) {
        commitChange(syncToServer);
        HealthConfigObserve.INSTANCE.getDefault().post(this);
    }

    public abstract void setAtrialFibEnable(boolean z);

    public abstract void setAtrialSleepNotDisturb(boolean z);

    public abstract void setFreq(int i);

    public abstract void setHighWarningValue(int i);

    public abstract void setHrDetectType(int i);

    public abstract void setHrEnable(boolean z);

    public abstract void setHrSleepEnable(boolean z);

    public abstract void setLowSpo2AlertValue(int i);

    public abstract void setLowWarningValue(int i);

    public abstract void setNeedMigrationHRWay(boolean z);

    public abstract void setOsaEnable(boolean z);

    public abstract void setPressureAlertEnable(boolean z);

    public abstract void setPressureEnable(boolean z);

    public abstract void setSleepAssistEnable(boolean z);

    public void setSleepingBloodPressureMonitorEnable(boolean z) {
        this.sleepingBloodPressureMonitorEnable = z;
    }

    public abstract void setSmartSpo2Enable(boolean z);

    public abstract void setSportHrCheckEnable(boolean z);

    public abstract void setWarningEnable(boolean z);

    public abstract void setWarningValue(int i);
}
