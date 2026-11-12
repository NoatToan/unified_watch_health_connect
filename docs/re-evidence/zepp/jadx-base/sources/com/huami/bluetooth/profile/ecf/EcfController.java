package com.huami.bluetooth.profile.ecf;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.bluetooth.profile.ecf.data.ActivityGoal;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.HRZone;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 h2\u00020\u0001:\u0001hJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\rH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0004H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0018\u001a\u00020\u0004H&J\u001e\u0010\u001d\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0004H&J\u0016\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H&J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020!H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&J\u0011\u0010&\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010+H&¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b1\u0010'J\u0019\u00102\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H&J\u0018\u00105\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H&J\u0011\u00106\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b6\u0010'J\u0019\u00107\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b7\u0010*J\u0011\u00108\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b8\u0010'J\u0010\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H&J\u0010\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H&J\u0011\u0010<\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b<\u0010'J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0016H&J\n\u0010@\u001a\u0004\u0018\u00010?H&J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020?H&J\u0010\u0010C\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H&J\u0011\u0010D\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bD\u0010'J\u0010\u0010E\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H&J\u0011\u0010F\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bF\u0010'J\u0010\u0010G\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H&J\u0011\u0010H\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bH\u0010'J\u0019\u0010K\u001a\u0004\u0018\u00010\u00042\u0006\u0010J\u001a\u00020IH&¢\u0006\u0004\bK\u0010LJ\u0010\u0010N\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\u0011\u0010O\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bO\u0010'J\u0010\u0010P\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\u0011\u0010Q\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bQ\u0010'J\u0010\u0010R\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\u0011\u0010S\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bS\u0010'J\u0010\u0010T\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\u0011\u0010U\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\bU\u0010'J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH&J\n\u0010Y\u001a\u0004\u0018\u00010VH&J\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010[\u001a\u00020ZH&J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H&J\b\u0010^\u001a\u00020\u0004H&J\u0010\u0010_\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\u0011\u0010a\u001a\u0004\u0018\u00010`H&¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H&J\n\u0010e\u001a\u0004\u0018\u00010dH&J\n\u0010g\u001a\u0004\u0018\u00010fH&¨\u0006i"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfController;", "", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "state", "", "syncAppState", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "equalizer", "setEqualizer", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "setting", "setHeadsetKnock", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "getHeadsetSideListenSetting", "setHeadsetSideListen", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "getHeadsetSportSetting", "setHeadsetSport", Configs.Params.RESET, "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "getMultiDeviceState", "", "getVersion", "syncSecondEarStatistic", "", "Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal;", GoalLineStyleConstant.GOALS, "useTwoWayCmd", "setActivityGoal", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwares", "setOtaProgress", "Lcom/xiaomi/hm/health/bt/profile/milipro/DisplaySetting;", "setDisplaySettingByTimexVendor", "Lcom/huami/bluetooth/profile/ecf/data/HRZone;", "hrZone", "setHrZone", "readAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "(Z)Ljava/lang/Boolean;", "", "interval", "setAlldayHeartRate", "(I)Ljava/lang/Boolean;", "getAlldayHeartRate", "()Ljava/lang/Integer;", "getRemEnable", "setRemEnable", "setHrSleepEnable", "isNewHealthDetect", "setOsaEnable", "getOsaEnable", "setPressEnable", "getPressEnable", "isOpen", "setReportHeadsetInfoSwitch", "setRelaxationPrompt", "getRelaxationPrompt", "deviceName", "modifyDeviceName", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "getNoiseControl", SessionDescription.n, "setNoiseControl", "setEnvironmentSound", "getEnvironmentSound", "setRunningRecognition", "getRunningRecognition", "setVoiceControl", "getVoiceControl", "Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "config", "setNowTimeConfig", "(Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;)Ljava/lang/Boolean;", "enable", "setWearInduction", "getWearInduction", "setHearingHealth", "getHearingHealth", "setCervicalProtection", "getCervicalProtection", "setPercussionBroadcast", "getPercussionBroadcast", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "hrReminderInfo", "setHrReminder", "getHrReminder", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setMiliHrReminder", "setSportHrEnable", "doRoleSwitch", "doPostureCalibration", "", "getHeadNeckAngle", "()Ljava/lang/Short;", "enableCervicalProtectionSound", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "getOffWristLockState", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface EcfController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfController$Companion;", "", "b", "Ljava/lang/Object;", "getEcfLock", "()Ljava/lang/Object;", "ecfLock", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final Object ecfLock = new Object();

        private Companion() {
        }

        @NotNull
        public final Object getEcfLock() {
            return ecfLock;
        }
    }

    boolean doPostureCalibration(boolean enable);

    boolean doRoleSwitch();

    boolean enableCervicalProtectionSound(boolean enable);

    @Nullable
    Integer getAlldayHeartRate();

    @Nullable
    Boolean getCervicalProtection();

    @Nullable
    Boolean getEnvironmentSound();

    @Nullable
    Short getHeadNeckAngle();

    @Nullable
    HeadsetKnockSetting getHeadsetKnockSetting();

    @Nullable
    HeadsetSideListenSetting getHeadsetSideListenSetting();

    @Nullable
    HeadsetSportSetting getHeadsetSportSetting();

    @Nullable
    Boolean getHearingHealth();

    @Nullable
    HrReminderInfo getHrReminder();

    @Nullable
    Mtu getMtu();

    @Nullable
    MultiDeviceState getMultiDeviceState();

    @Nullable
    NoiseControl getNoiseControl();

    @Nullable
    HMNotifyResponse getOffWristLockState();

    @Nullable
    Boolean getOsaEnable();

    @Nullable
    Boolean getPercussionBroadcast();

    @Nullable
    Boolean getPressEnable();

    @Nullable
    Boolean getRelaxationPrompt();

    @Nullable
    Boolean getRemEnable();

    @Nullable
    Boolean getRunningRecognition();

    @Nullable
    String getVersion();

    @Nullable
    Boolean getVoiceControl();

    @Nullable
    Boolean getWearInduction();

    boolean modifyDeviceName(@NotNull String deviceName);

    @Nullable
    Boolean readAtrialFibEnable();

    boolean reset();

    boolean setActivityGoal(@NotNull List<ActivityGoal> goals, boolean useTwoWayCmd);

    @Nullable
    Boolean setAlldayHeartRate(int interval);

    @Nullable
    Boolean setAtrialFibEnable(boolean isEnable);

    boolean setCervicalProtection(boolean enable);

    boolean setDisplaySettingByTimexVendor(@NotNull DisplaySetting setting);

    boolean setEnvironmentSound(boolean isOpen);

    boolean setEqualizer(@NotNull Equalizer equalizer);

    boolean setHeadsetKnock(@NotNull HeadsetKnockSetting setting);

    boolean setHeadsetSideListen(@NotNull HeadsetSideListenSetting setting);

    boolean setHeadsetSport(@NotNull HeadsetSportSetting setting);

    boolean setHearingHealth(boolean enable);

    boolean setHrReminder(@NotNull HrReminderInfo hrReminderInfo);

    boolean setHrSleepEnable(boolean isEnable);

    boolean setHrZone(@NotNull HRZone hrZone);

    boolean setMiliHrReminder(@NotNull HMHrReminder hrReminder);

    boolean setNoiseControl(@NotNull NoiseControl control);

    @Nullable
    Boolean setNowTimeConfig(@NotNull NowTimeConfig config);

    boolean setOsaEnable(boolean isEnable, boolean isNewHealthDetect);

    boolean setOtaProgress(@NotNull List<? extends HMFirmwareInfo> firmwares);

    boolean setPercussionBroadcast(boolean enable);

    @Nullable
    Boolean setPressEnable(boolean isEnable);

    boolean setRelaxationPrompt(boolean isOpen);

    @Nullable
    Boolean setRemEnable(boolean isEnable);

    boolean setReportHeadsetInfoSwitch(boolean isOpen);

    boolean setRunningRecognition(boolean isOpen);

    boolean setSportHrEnable(boolean isEnable);

    boolean setVoiceControl(boolean isOpen);

    boolean setWearInduction(boolean enable);

    boolean syncAppState(@NotNull AppState state);

    boolean syncSecondEarStatistic();
}
