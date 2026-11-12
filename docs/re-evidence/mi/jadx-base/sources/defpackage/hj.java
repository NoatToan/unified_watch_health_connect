package defpackage;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J0\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010\u0004J\u0011\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u00100\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b0\u0010\u0019J\u0010\u00101\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016J\u0011\u00102\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0004¨\u00065"}, d2 = {"Lhj;", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "getHrReminder", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "setHrMaxValue", "getHrMaxValue", "setBodyEnergyEnable", "getBodyEnergyEnable", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hj implements HeartHealthApi {
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableFull(boolean isEnable, int interval) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableOsa(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressure(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressureAlert(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableSmartSpo2(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getBodyEnergyEnable() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getHrMaxValue() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getHrReminder() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getLowSpo2AlertValue() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getOsaEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepAssistantEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitorEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSmartSpo2Enable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSportHeartRateEnable() {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean recoverHrSetting(boolean hrEnable, int hrInterval, boolean hrSleepEnable, boolean atrialFibEnable, boolean isSupportAtrial) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setAtrialFibEnable(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setBodyEnergyEnable(boolean enable) {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHeartRate(boolean isEnable, int interval) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrInterval(int interval) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrMaxValue(int value) {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowSpo2AlertValue(int value) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepAssistantEnable(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepingBloodPressureMonitorEnable(boolean enable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSportHeartRateEnable(boolean isEnable) {
        t5t.d("IdleImpl", "创建HealthApi失败，所以走到了这里");
        return false;
    }
}
