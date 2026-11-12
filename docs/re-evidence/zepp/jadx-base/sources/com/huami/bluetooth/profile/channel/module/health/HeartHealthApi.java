package com.huami.bluetooth.profile.channel.module.health;

import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH&J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001d\u0010\u0004J0\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H&J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&J\n\u0010'\u001a\u0004\u0018\u00010$H&J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&J\n\u0010)\u001a\u0004\u0018\u00010$H&J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b+\u0010\u0004J\u0011\u0010,\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H&¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "getHrReminder", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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
    HeartRateConfig getHeartRateConfig();

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

    boolean setHeartRate(boolean isEnable, int interval);

    boolean setHrInterval(int interval);

    boolean setHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setLowHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setLowSpo2AlertValue(int value);

    boolean setSleepAssistantEnable(boolean isEnable);

    boolean setSleepingBloodPressureMonitorEnable(boolean enable);

    boolean setSportHeartRateEnable(boolean isEnable);
}
