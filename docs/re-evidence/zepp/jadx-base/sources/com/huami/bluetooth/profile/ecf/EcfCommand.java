package com.huami.bluetooth.profile.ecf;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0010\u0018\u0000 \b2\u00020\u0001:\u0013\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "command", "(ILcom/huami/bluetooth/profile/Request$Command;)V", "b", "CervicalProtectionSoundSwitch", "a", "Extend", "GetVersion", "HeadNeckAngle", "HeadsetKnockingNew", "HeadsetRoleSwitch", "ModifyDeviceName", "MtuCom", "MultiDeviceState", "OffWristLock", "PostureCalibration", "ReportHeadsetInfoSwitch", "SetEq", "StandAlert", "SyncAppState", "SyncHidStatus", "TwoWay", "Vendor", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class EcfCommand extends Request.Command {

    @Deprecated
    public static final int SIZE_BYTES = 1;

    @NotNull
    private static final a b = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$CervicalProtectionSoundSwitch;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CervicalProtectionSoundSwitch extends EcfCommand {

        @NotNull
        public static final CervicalProtectionSoundSwitch INSTANCE = new CervicalProtectionSoundSwitch();

        private CervicalProtectionSoundSwitch() {
            super(79);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$Extend;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", Constant.h, "<init>", "(Lcom/huami/bluetooth/profile/ecf/ExtendCmd;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Extend extends EcfCommand {
        public Extend(@NotNull ExtendCmd extendCmd) {
            super(6, extendCmd);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$GetVersion;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetVersion extends EcfCommand {

        @NotNull
        public static final GetVersion INSTANCE = new GetVersion();

        private GetVersion() {
            super(55);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$HeadNeckAngle;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadNeckAngle extends EcfCommand {

        @NotNull
        public static final HeadNeckAngle INSTANCE = new HeadNeckAngle();

        private HeadNeckAngle() {
            super(73);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$HeadsetKnockingNew;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetKnockingNew extends EcfCommand {

        @NotNull
        public static final HeadsetKnockingNew INSTANCE = new HeadsetKnockingNew();

        private HeadsetKnockingNew() {
            super(68);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$HeadsetRoleSwitch;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetRoleSwitch extends EcfCommand {

        @NotNull
        public static final HeadsetRoleSwitch INSTANCE = new HeadsetRoleSwitch();

        private HeadsetRoleSwitch() {
            super(74);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$ModifyDeviceName;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyDeviceName extends EcfCommand {

        @NotNull
        public static final ModifyDeviceName INSTANCE = new ModifyDeviceName();

        private ModifyDeviceName() {
            super(67);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$MtuCom;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class MtuCom extends EcfCommand {

        @NotNull
        public static final MtuCom INSTANCE = new MtuCom();

        private MtuCom() {
            super(19);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$MultiDeviceState;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class MultiDeviceState extends EcfCommand {

        @NotNull
        public static final MultiDeviceState INSTANCE = new MultiDeviceState();

        private MultiDeviceState() {
            super(52);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$OffWristLock;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OffWristLock extends EcfCommand {

        @NotNull
        public static final OffWristLock INSTANCE = new OffWristLock();

        private OffWristLock() {
            super(80);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$PostureCalibration;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PostureCalibration extends EcfCommand {

        @NotNull
        public static final PostureCalibration INSTANCE = new PostureCalibration();

        private PostureCalibration() {
            super(78);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$ReportHeadsetInfoSwitch;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReportHeadsetInfoSwitch extends EcfCommand {

        @NotNull
        public static final ReportHeadsetInfoSwitch INSTANCE = new ReportHeadsetInfoSwitch();

        private ReportHeadsetInfoSwitch() {
            super(66);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$SetEq;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetEq extends EcfCommand {

        @NotNull
        public static final SetEq INSTANCE = new SetEq();

        private SetEq() {
            super(42);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$StandAlert;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StandAlert extends EcfCommand {

        @NotNull
        public static final StandAlert INSTANCE = new StandAlert();

        private StandAlert() {
            super(62);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$SyncAppState;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncAppState extends EcfCommand {

        @NotNull
        public static final SyncAppState INSTANCE = new SyncAppState();

        private SyncAppState() {
            super(56);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$SyncHidStatus;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncHidStatus extends EcfCommand {
        public SyncHidStatus() {
            super(61);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$TwoWay;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;", Constant.h, "", "read", "<init>", "(Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;Z)V", "(Lcom/huami/bluetooth/profile/ecf/TwoWayCmd;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class TwoWay extends EcfCommand {
        public TwoWay(@NotNull TwoWayCmd twoWayCmd, boolean z) {
            super(254, new Request.Command(twoWayCmd, new byte[]{ByteUtilsKt.toByte(z)}));
        }

        public TwoWay(@NotNull TwoWayCmd twoWayCmd) {
            this(twoWayCmd, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfCommand$Vendor;", "Lcom/huami/bluetooth/profile/ecf/EcfCommand;", "Lcom/huami/bluetooth/profile/ecf/VendorCmd;", Constant.h, "<init>", "(Lcom/huami/bluetooth/profile/ecf/VendorCmd;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Vendor extends EcfCommand {
        public Vendor(@NotNull VendorCmd vendorCmd) {
            super(34, vendorCmd);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/bluetooth/profile/ecf/EcfCommand$a", "", "", "value", "", "a", "SIZE_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

    public EcfCommand(int i) {
        super(b.a(i));
    }

    public EcfCommand(int i, @NotNull Request.Command command) {
        super(b.a(i), command);
    }
}
