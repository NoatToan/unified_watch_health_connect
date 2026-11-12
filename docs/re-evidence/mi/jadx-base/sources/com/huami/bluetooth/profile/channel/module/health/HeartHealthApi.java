package com.huami.bluetooth.profile.channel.module.health;

import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\rJ0\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0007H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0015H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0015H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H&J\u0010\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u00063"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "enableAtrialAlertSleepNotDisturb", "", "isEnable", "enableFull", "interval", "", "enableOsa", "enablePressure", "enablePressureAlert", "enableSmartSpo2", "getAtrialAlertSleepNotDisturbEnable", "()Ljava/lang/Boolean;", "getAtrialFibEnable", "getBodyEnergyEnable", "getHeartRateConfig", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHrMaxValue", "()Ljava/lang/Integer;", "getHrReminder", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "getLowHrReminder", "getLowSpo2AlertValue", "getOsaEnable", "getPressureAlertEnable", "getPressureEnable", "getSleepAssistantEnable", "getSleepingBloodPressureMonitorEnable", "getSmartSpo2Enable", "getSportHeartRateEnable", "recoverHrSetting", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "setAtrialFibEnable", "setBodyEnergyEnable", "enable", "setHeartRate", "setHrInterval", "setHrMaxValue", "value", "setHrReminder", "hrReminder", "setLowHrReminder", "setLowSpo2AlertValue", "setSleepAssistantEnable", "setSleepingBloodPressureMonitorEnable", "setSportHeartRateEnable", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HeartHealthApi {
    boolean enableAtrialAlertSleepNotDisturb(boolean isEnable);

    boolean enableFull(boolean isEnable, int interval);

    boolean enableOsa(boolean isEnable);

    boolean enablePressure(boolean isEnable);

    boolean enablePressureAlert(boolean isEnable);

    boolean enableSmartSpo2(boolean isEnable);

    @Nullable
    Boolean getAtrialAlertSleepNotDisturbEnable();

    @Nullable
    Boolean getAtrialFibEnable();

    @Nullable
    Boolean getBodyEnergyEnable();

    @Nullable
    HeartRateConfig getHeartRateConfig();

    @Nullable
    Integer getHrMaxValue();

    @Nullable
    HMHrReminder getHrReminder();

    @Nullable
    HMHrReminder getLowHrReminder();

    @Nullable
    Integer getLowSpo2AlertValue();

    @Nullable
    Boolean getOsaEnable();

    @Nullable
    Boolean getPressureAlertEnable();

    @Nullable
    Boolean getPressureEnable();

    @Nullable
    Boolean getSleepAssistantEnable();

    @Nullable
    Boolean getSleepingBloodPressureMonitorEnable();

    @Nullable
    Boolean getSmartSpo2Enable();

    @Nullable
    Boolean getSportHeartRateEnable();

    boolean recoverHrSetting(boolean hrEnable, int hrInterval, boolean hrSleepEnable, boolean atrialFibEnable, boolean isSupportAtrial);

    boolean setAtrialFibEnable(boolean isEnable);

    boolean setBodyEnergyEnable(boolean enable);

    boolean setHeartRate(boolean isEnable, int interval);

    boolean setHrInterval(int interval);

    boolean setHrMaxValue(int value);

    boolean setHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setLowHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setLowSpo2AlertValue(int value);

    boolean setSleepAssistantEnable(boolean isEnable);

    boolean setSleepingBloodPressureMonitorEnable(boolean enable);

    boolean setSportHeartRateEnable(boolean isEnable);
}
