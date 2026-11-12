package com.huami.bluetooth.profile.channel.module.settings;

import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.sport.SportRemindConfig;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H&J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001dH&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H&J\u0012\u0010(\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010'H&J\b\u0010)\u001a\u00020\u0004H&J\b\u0010+\u001a\u00020*H&J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010/\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b/\u00100J\u0012\u00102\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u000101H&J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u00104\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b4\u00100J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u00106\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b6\u00100J\u0010\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020*H&J\u0011\u00109\u001a\u0004\u0018\u00010*H&¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010<\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b<\u00100J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010>\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b>\u00100J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010@\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b@\u00100J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010B\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bB\u00100J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u0010D\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bD\u00100J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020EH&J\n\u0010H\u001a\u0004\u0018\u00010EH&J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010F\u001a\u00020EH&J\n\u0010J\u001a\u0004\u0018\u00010EH&J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020KH&J\n\u0010M\u001a\u0004\u0018\u00010KH&J!\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020N2\b\u0010P\u001a\u0004\u0018\u00010*H&¢\u0006\u0004\bQ\u0010RJ\u0018\u0010V\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010U\u001a\u00020TH&J\u0018\u0010X\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010W\u001a\u00020TH&J)\u0010Z\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020T2\b\u0010P\u001a\u0004\u0018\u00010*H&¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020TH&J\u0018\u0010_\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010^\u001a\u00020TH&J\n\u0010`\u001a\u0004\u0018\u00010NH&J\u0018\u0010b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010a\u001a\u00020*H&J\u0011\u0010c\u001a\u0004\u0018\u00010*H&¢\u0006\u0004\bc\u0010:J(\u0010i\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u001d2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020e2\u0006\u0010h\u001a\u00020\u001dH&J\u0010\u0010j\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020*H&J\u0011\u0010k\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bk\u00100J\u0018\u0010m\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010l\u001a\u00020TH&J\u0018\u0010o\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010n\u001a\u00020TH&J\u0011\u0010p\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bp\u00100J\u0011\u0010q\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bq\u00100J\u0010\u0010r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010u\u001a\u00020\u00042\u0006\u0010t\u001a\u00020sH&J\u0010\u0010v\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0011\u0010w\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bw\u00100J\u0011\u0010x\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bx\u00100J\u0010\u0010{\u001a\u00020z2\u0006\u0010y\u001a\u00020\u0004H&J\u0010\u0010}\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u0004H&J\u0011\u0010~\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b~\u00100¨\u0006\u007f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsApi;", "", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertMode;", "mode", "", "show", "showContactSync", "isContactShow", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/base/HMOtherVersion;", "getDeviceInfoSync", "Lcom/xiaomi/hm/health/bt/model/HMDisconnectRemindConfig;", "config", "setDisconnectRemind", "enable", "setMultiLinkSwitch", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "hidStatus", "setHidStatus", "getHidStatus", "setConnectedAdvSwitch", WatchFaceApi.CUSTOMIZABLE_DISABLE, "setRestrictedBindingSwitch", "is12Hour", "setTimeFormat", "", TrainingWebConst.QueryParam.VIDEO_FORMAT, "setDateDisplayStyle", "", "calendar", "setOtherCalendar", "dayOfWeek", "setWeeklyStartTime", TdmillHmFragment.ARG_IS_METRIC, "setMileageUnit", "Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "nowTimeConfig", "setHourlyAnnounceSwitch", "Lcom/xiaomi/hm/health/bt/model/HMSilentConfig;", "setSilent", "stopDevice", "", "getSwimLogSwitch", "enableSwimLog", "enableHrBroadcast", "enableSportHeartRate", "getSportHeartRate", "()Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportRemindConfig;", "setSportRemindConfig", "enableOsa", "getOsaEnable", "setSmartSpo2", "getSmartSpo2", "value", "setLowSpo2Alert", "getLowSpo2Alert", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "enableHrSleep", "getHrSleepEnable", "enableAtrialFib", "getAtrialFibEnable", "enableAtrialAlertSleepNotDisturb", "getAtrialAlertSleepNotDisturbEnable", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHighHrReminder", "getHighHrReminder", "setLowHrReminder", "getLowHrReminder", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "setStandAlertConfig", "getStandAlertConfig", "Lcom/xiaomi/hm/health/bt/model/HMTarget;", "target", "settingsVersion", "setTargets", "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Z", "remind", "", "distance", "setDistanceTarget", "calorie", "setCalorieTarget", "step", "setStepTarget", "(ZJLjava/lang/Integer;)Z", "weight", "setWeightTarget", "sleep", "setSleepTarget", "getTargets", "interval", "setAlldayHeartRate", "getHeartRateInterval", "type", "", "percents", "zones", "restHR", "setHeartRateZoneSync", "setActivityMode", "getOffWristLockState", "stand", "setStandTarget", "activity", "setActivityTarget", "getLockStatus", "getSleepingBloodPressureMonitor", "setSleepingBloodPressureMonitor", "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "info", "setNightMode", "disableHid", "isHidDisable", "getAutoOtaAtNightSwitch", "open", "", "setAutoOtaAtNightSwitch", WifiSetActivity.KEY_CONNECT, "setHidConnect", "isHidConnect", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SettingsApi {
    boolean disableHid(boolean disable);

    boolean enableAtrialAlertSleepNotDisturb(boolean enable);

    boolean enableAtrialFib(boolean enable);

    boolean enableHrBroadcast(boolean enable);

    boolean enableHrSleep(boolean enable);

    boolean enableOsa(boolean enable);

    boolean enablePressure(boolean enable);

    boolean enablePressureAlert(boolean enable);

    boolean enableSportHeartRate(boolean enable);

    boolean enableSwimLog(boolean enable);

    @Nullable
    Boolean getAtrialAlertSleepNotDisturbEnable();

    @Nullable
    Boolean getAtrialFibEnable();

    @Nullable
    Boolean getAutoOtaAtNightSwitch();

    @Nullable
    HMOtherVersion getDeviceInfoSync(@NotNull HMDeviceSource source);

    @Nullable
    Integer getHeartRateInterval();

    @Nullable
    HidStatus getHidStatus();

    @Nullable
    HMHrReminder getHighHrReminder();

    @Nullable
    Boolean getHrSleepEnable();

    @Nullable
    Boolean getLockStatus();

    @Nullable
    HMHrReminder getLowHrReminder();

    @Nullable
    Integer getLowSpo2Alert();

    @Nullable
    Boolean getOffWristLockState();

    @Nullable
    Boolean getOsaEnable();

    @Nullable
    Boolean getPressureAlertEnable();

    @Nullable
    Boolean getPressureEnable();

    @Nullable
    Boolean getSleepingBloodPressureMonitor();

    @Nullable
    Boolean getSmartSpo2();

    @Nullable
    Boolean getSportHeartRate();

    @Nullable
    StandAlertConfig getStandAlertConfig();

    int getSwimLogSwitch();

    @Nullable
    HMTarget getTargets();

    boolean isContactShow(@NotNull HMAlertMode mode);

    @Nullable
    Boolean isHidConnect();

    @Nullable
    Boolean isHidDisable();

    boolean setActivityMode(int mode);

    boolean setActivityTarget(boolean remind, long activity);

    boolean setAlldayHeartRate(boolean enable, int interval);

    void setAutoOtaAtNightSwitch(boolean open);

    boolean setCalorieTarget(boolean remind, long calorie);

    boolean setConnectedAdvSwitch(boolean enable);

    boolean setDateDisplayStyle(@Nullable String format);

    boolean setDisconnectRemind(@Nullable HMDisconnectRemindConfig config);

    boolean setDistanceTarget(boolean remind, long distance);

    boolean setHeartRateZoneSync(byte type, @NotNull byte[] percents, @NotNull byte[] zones, byte restHR);

    boolean setHidConnect(boolean connect);

    boolean setHidStatus(@NotNull HidStatus hidStatus);

    boolean setHighHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setHourlyAnnounceSwitch(@NotNull NowTimeConfig nowTimeConfig);

    boolean setLowHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setLowSpo2Alert(int value);

    boolean setMileageUnit(boolean isMetric);

    boolean setMultiLinkSwitch(boolean enable);

    boolean setNightMode(@NotNull HMAutoBacklightInfo info);

    boolean setOtherCalendar(byte calendar);

    boolean setRestrictedBindingSwitch(boolean disable);

    boolean setSilent(@Nullable HMSilentConfig config);

    boolean setSleepTarget(boolean remind, long sleep);

    boolean setSleepingBloodPressureMonitor(boolean enable);

    boolean setSmartSpo2(boolean enable);

    boolean setSportRemindConfig(@Nullable SportRemindConfig config);

    boolean setStandAlertConfig(@NotNull StandAlertConfig config);

    boolean setStandTarget(boolean remind, long stand);

    boolean setStepTarget(boolean remind, long step, @Nullable Integer settingsVersion);

    boolean setTargets(@NotNull HMTarget target, @Nullable Integer settingsVersion);

    boolean setTimeFormat(boolean is12Hour);

    boolean setWeeklyStartTime(byte dayOfWeek);

    boolean setWeightTarget(boolean remind, long weight);

    boolean showContactSync(@NotNull HMAlertMode mode, boolean show);

    boolean stopDevice();
}
