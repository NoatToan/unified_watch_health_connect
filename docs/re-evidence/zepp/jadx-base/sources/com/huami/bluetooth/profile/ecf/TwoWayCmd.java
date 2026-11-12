package com.huami.bluetooth.profile.ecf;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0010\u0018\u0000 \u00062\u00020\u0001:\u0016\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "b", "AtrialFib", "CervicalProtection", "a", "Dial", "EnvironmentSoundSwitch", "GoalAndReminder", "HeadsetKnocking", "HeadsetSideListen", "HeadsetSport", "HearingHealth", "HighHrReminder", "HrInterval", "NoiseControlCmd", "NowTime", "Osa", "PercussionBroadcast", "Pressure", "RelaxationPromptSwitch", "Rem", "RunningRecognitionSwitch", "VoiceControlSwitch", "WearInduction", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class TwoWayCmd extends Request.Command {

    @Deprecated
    public static final int SIZE_BYTES = 1;

    @NotNull
    private static final a b = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$AtrialFib;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AtrialFib extends TwoWayCmd {

        @NotNull
        public static final AtrialFib INSTANCE = new AtrialFib();

        private AtrialFib() {
            super(10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$CervicalProtection;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CervicalProtection extends TwoWayCmd {

        @NotNull
        public static final CervicalProtection INSTANCE = new CervicalProtection();

        private CervicalProtection() {
            super(42);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$Dial;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Dial extends TwoWayCmd {

        @NotNull
        public static final Dial INSTANCE = new Dial();

        private Dial() {
            super(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$EnvironmentSoundSwitch;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnvironmentSoundSwitch extends TwoWayCmd {

        @NotNull
        public static final EnvironmentSoundSwitch INSTANCE = new EnvironmentSoundSwitch();

        private EnvironmentSoundSwitch() {
            super(37);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$GoalAndReminder;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GoalAndReminder extends TwoWayCmd {

        @NotNull
        public static final GoalAndReminder INSTANCE = new GoalAndReminder();

        private GoalAndReminder() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HeadsetKnocking;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetKnocking extends TwoWayCmd {

        @NotNull
        public static final HeadsetKnocking INSTANCE = new HeadsetKnocking();

        private HeadsetKnocking() {
            super(32);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HeadsetSideListen;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetSideListen extends TwoWayCmd {

        @NotNull
        public static final HeadsetSideListen INSTANCE = new HeadsetSideListen();

        private HeadsetSideListen() {
            super(33);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HeadsetSport;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetSport extends TwoWayCmd {

        @NotNull
        public static final HeadsetSport INSTANCE = new HeadsetSport();

        private HeadsetSport() {
            super(34);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HearingHealth;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HearingHealth extends TwoWayCmd {

        @NotNull
        public static final HearingHealth INSTANCE = new HearingHealth();

        private HearingHealth() {
            super(41);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HighHrReminder;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighHrReminder extends TwoWayCmd {

        @NotNull
        public static final HighHrReminder INSTANCE = new HighHrReminder();

        private HighHrReminder() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$HrInterval;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HrInterval extends TwoWayCmd {

        @NotNull
        public static final HrInterval INSTANCE = new HrInterval();

        private HrInterval() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$NoiseControlCmd;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoiseControlCmd extends TwoWayCmd {

        @NotNull
        public static final NoiseControlCmd INSTANCE = new NoiseControlCmd();

        private NoiseControlCmd() {
            super(36);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$NowTime;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NowTime extends TwoWayCmd {

        @NotNull
        public static final NowTime INSTANCE = new NowTime();

        private NowTime() {
            super(11);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$Osa;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Osa extends TwoWayCmd {

        @NotNull
        public static final Osa INSTANCE = new Osa();

        private Osa() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$PercussionBroadcast;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PercussionBroadcast extends TwoWayCmd {

        @NotNull
        public static final PercussionBroadcast INSTANCE = new PercussionBroadcast();

        private PercussionBroadcast() {
            super(43);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$Pressure;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pressure extends TwoWayCmd {

        @NotNull
        public static final Pressure INSTANCE = new Pressure();

        private Pressure() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$RelaxationPromptSwitch;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class RelaxationPromptSwitch extends TwoWayCmd {

        @NotNull
        public static final RelaxationPromptSwitch INSTANCE = new RelaxationPromptSwitch();

        private RelaxationPromptSwitch() {
            super(35);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$Rem;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rem extends TwoWayCmd {

        @NotNull
        public static final Rem INSTANCE = new Rem();

        private Rem() {
            super(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$RunningRecognitionSwitch;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunningRecognitionSwitch extends TwoWayCmd {

        @NotNull
        public static final RunningRecognitionSwitch INSTANCE = new RunningRecognitionSwitch();

        private RunningRecognitionSwitch() {
            super(38);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$VoiceControlSwitch;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VoiceControlSwitch extends TwoWayCmd {

        @NotNull
        public static final VoiceControlSwitch INSTANCE = new VoiceControlSwitch();

        private VoiceControlSwitch() {
            super(39);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TwoWayCmd$WearInduction;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class WearInduction extends TwoWayCmd {

        @NotNull
        public static final WearInduction INSTANCE = new WearInduction();

        private WearInduction() {
            super(40);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/bluetooth/profile/ecf/TwoWayCmd$a", "", "", "value", "", "a", "SIZE_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] a(int value) {
            return ByteUtilsKt.toByteArray(value, 1);
        }
    }

    public TwoWayCmd(int i) {
        super(b.a(i));
    }
}
