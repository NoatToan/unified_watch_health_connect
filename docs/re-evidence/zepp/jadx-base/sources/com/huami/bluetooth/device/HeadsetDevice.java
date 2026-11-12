package com.huami.bluetooth.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.device.function.EqualizerFun;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.bluetooth.profile.ecf.data.Sn;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003GHIJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&J\b\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u001cH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH&J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H&J\n\u0010$\u001a\u0004\u0018\u00010!H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0011\u0010(\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0011\u0010+\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b+\u0010)J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0011\u0010-\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b-\u0010)J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0011\u0010/\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b/\u0010)J\u0010\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0018H&J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0011\u00104\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b4\u0010)J\u0010\u00105\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0011\u00106\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b6\u0010)J\u0010\u00107\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0011\u00108\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b8\u0010)J\u0010\u00109\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0011\u0010:\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b:\u0010)J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;H&J\n\u0010>\u001a\u0004\u0018\u00010;H&J\u0010\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u001aH&J\u0010\u0010A\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\u0011\u0010C\u001a\u0004\u0018\u00010BH&¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H&J\b\u0010F\u001a\u00020\u0015H&¨\u0006J"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice;", "Lcom/huami/bluetooth/device/function/EqualizerFun;", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "setting", "", "setHeadsetKnock", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "getHeadsetSideListenSetting", "setHeadsetSideListen", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "getHeadsetSportSetting", "setHeadsetSport", "Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "part", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "getHeadsetDeviceState", "Lcom/huami/bluetooth/device/HeadsetDevice$StateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerStateListener", "unregisterStateListener", "", "getSecondEarVersion", "", "getSecondEarVersionCode", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "versionHost", "", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "getSnList", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "mode", "setNoiseControl", "getNoiseControl", "isOpen", "setReportHeadsetInfoSwitch", "setEnvironmentSound", "getEnvironmentSound", "()Ljava/lang/Boolean;", "setRunningRecognition", "getRunningRecognition", "setVoiceControl", "getVoiceControl", "setRelaxationPrompt", "getRelaxationPrompt", "deviceName", "modifyDeviceName", "enable", "setWearInduction", "getWearInduction", "setHearingHealth", "getHearingHealth", "setCervicalProtection", "getCervicalProtection", "setPercussionBroadcast", "getPercussionBroadcast", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "hrReminderInfo", "setHrReminder", "getHrReminder", Constants.JSON_FEATURE, "hasHeadsetFeature", "doPostureCalibration", "", "getHeadNeckAngle", "()Ljava/lang/Short;", "enableCervicalProtectionSound", "connectServiceOfHeadsetAndA2DP", "HeadsetDeviceState", "Part", "StateListener", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HeadsetDevice extends EqualizerFun {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "a", "", "isLeftConnected", "isRightConnected", "isDualConnected", "isRight", "isWear", "isDualWear", "state", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "getHost", "()Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "host", "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class HeadsetDeviceState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final MultiDeviceState state;

        public HeadsetDeviceState(@NotNull MultiDeviceState multiDeviceState) {
            this.state = multiDeviceState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final MultiDeviceState getState() {
            return this.state;
        }

        public static /* synthetic */ HeadsetDeviceState copy$default(HeadsetDeviceState headsetDeviceState, MultiDeviceState multiDeviceState, int i, Object obj) {
            if ((i & 1) != 0) {
                multiDeviceState = headsetDeviceState.state;
            }
            return headsetDeviceState.copy(multiDeviceState);
        }

        @NotNull
        public final HeadsetDeviceState copy(@NotNull MultiDeviceState state) {
            return new HeadsetDeviceState(state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeadsetDeviceState) && Intrinsics.areEqual(this.state, ((HeadsetDeviceState) other).state);
        }

        @NotNull
        public final MultiDeviceState.Host getHost() {
            return this.state.getHost();
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public final boolean isDualConnected() {
            return Intrinsics.areEqual(this.state.getConnection(), MultiDeviceState.Connection.Multi.INSTANCE);
        }

        public final boolean isDualWear() {
            MultiDeviceState.State rightState = this.state.getRightState();
            MultiDeviceState.State.Wear wear = MultiDeviceState.State.Wear.INSTANCE;
            return Intrinsics.areEqual(rightState, wear) && Intrinsics.areEqual(this.state.getLeftState(), wear);
        }

        public final boolean isLeftConnected() {
            return Intrinsics.areEqual(getHost(), MultiDeviceState.Host.Left.INSTANCE) || isDualConnected();
        }

        public final boolean isRightConnected() {
            return Intrinsics.areEqual(getHost(), MultiDeviceState.Host.Right.INSTANCE) || isDualConnected();
        }

        public final boolean isWear(boolean isRight) {
            return isRight ? Intrinsics.areEqual(this.state.getRightState(), MultiDeviceState.State.Wear.INSTANCE) : Intrinsics.areEqual(this.state.getLeftState(), MultiDeviceState.State.Wear.INSTANCE);
        }

        @NotNull
        public String toString() {
            return "HeadsetDeviceState(state=" + this.state + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "", "", "a", LogUtil.I, "getBatteryIndex", "()I", "batteryIndex", "<init>", "(I)V", "Box", "Left", "Right", "Lcom/huami/bluetooth/device/HeadsetDevice$Part$Left;", "Lcom/huami/bluetooth/device/HeadsetDevice$Part$Right;", "Lcom/huami/bluetooth/device/HeadsetDevice$Part$Box;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Part {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int batteryIndex;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$Part$Box;", "Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Box extends Part {

            @NotNull
            public static final Box INSTANCE = new Box();

            private Box() {
                super(2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$Part$Left;", "Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Left extends Part {

            @NotNull
            public static final Left INSTANCE = new Left();

            private Left() {
                super(0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$Part$Right;", "Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Right extends Part {

            @NotNull
            public static final Right INSTANCE = new Right();

            private Right() {
                super(1, null);
            }
        }

        private Part(int i) {
            this.batteryIndex = i;
        }

        public /* synthetic */ Part(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public final int getBatteryIndex() {
            return this.batteryIndex;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/device/HeadsetDevice$StateListener;", "", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "", "onStateChanged", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public interface StateListener {
        void onStateChanged(@NotNull HeadsetDeviceState state);
    }

    void connectServiceOfHeadsetAndA2DP();

    boolean doPostureCalibration(boolean enable);

    boolean enableCervicalProtectionSound(boolean enable);

    @Nullable
    BatteryInfo getBatteryInfo(@NotNull Part part);

    @Nullable
    Boolean getCervicalProtection();

    @Nullable
    Boolean getEnvironmentSound();

    @Nullable
    Short getHeadNeckAngle();

    @Nullable
    HeadsetDeviceState getHeadsetDeviceState();

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
    NoiseControl getNoiseControl();

    @Nullable
    Boolean getPercussionBroadcast();

    @Nullable
    Boolean getRelaxationPrompt();

    @Nullable
    Boolean getRunningRecognition();

    @Nullable
    String getSecondEarVersion();

    int getSecondEarVersionCode();

    @NotNull
    List<Sn> getSnList();

    @Nullable
    Boolean getVoiceControl();

    @Nullable
    Boolean getWearInduction();

    boolean hasHeadsetFeature(int feature);

    boolean modifyDeviceName(@NotNull String deviceName);

    void registerStateListener(@NotNull StateListener listener);

    boolean setCervicalProtection(boolean enable);

    boolean setEnvironmentSound(boolean isOpen);

    boolean setHeadsetKnock(@NotNull HeadsetKnockSetting setting);

    boolean setHeadsetSideListen(@NotNull HeadsetSideListenSetting setting);

    boolean setHeadsetSport(@NotNull HeadsetSportSetting setting);

    boolean setHearingHealth(boolean enable);

    boolean setHrReminder(@NotNull HrReminderInfo hrReminderInfo);

    boolean setNoiseControl(@NotNull NoiseControl mode);

    boolean setPercussionBroadcast(boolean enable);

    boolean setRelaxationPrompt(boolean isOpen);

    boolean setReportHeadsetInfoSwitch(boolean isOpen);

    boolean setRunningRecognition(boolean isOpen);

    boolean setVoiceControl(boolean isOpen);

    boolean setWearInduction(boolean enable);

    void unregisterStateListener(@NotNull StateListener listener);

    @NotNull
    MultiDeviceState.Host versionHost();
}
