package com.huami.bluetooth.profile.channel.module.hearing;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0019\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0013\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getSubType", "()I", "subType", "c", "getCmd", Constant.h, "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(II)V", "Companion", "DeviceBound", "DeviceRecovery", "GetDSP", "GetDeviceBattery", "GetEQ", "GetHearingMode", "GetHearingPosition", "GetHighBass", "GetSN", "GetWDRC", "ResetUnusedEQ", "ResetUnusedHighBass", "SetDSP", "SetEQ", "SetHearingMode", "SetHearingPosition", "SetHighBass", "SetWDRC", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HearingAidCommand extends Request.Command {
    public static final int SUB_TYPE_DEVICE = 2;
    public static final int SUB_TYPE_HEARING = 1;
    public static final int SUB_TYPE_RESPONSE = 0;
    private static final int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$DeviceBound;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceBound extends HearingAidCommand {

        @NotNull
        public static final DeviceBound INSTANCE = new DeviceBound();

        private DeviceBound() {
            super(2, 6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$DeviceRecovery;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceRecovery extends HearingAidCommand {

        @NotNull
        public static final DeviceRecovery INSTANCE = new DeviceRecovery();

        private DeviceRecovery() {
            super(2, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetDSP;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetDSP extends HearingAidCommand {

        @NotNull
        public static final GetDSP INSTANCE = new GetDSP();

        private GetDSP() {
            super(1, 132);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetDeviceBattery;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetDeviceBattery extends HearingAidCommand {

        @NotNull
        public static final GetDeviceBattery INSTANCE = new GetDeviceBattery();

        private GetDeviceBattery() {
            super(2, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetEQ;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetEQ extends HearingAidCommand {

        @NotNull
        public static final GetEQ INSTANCE = new GetEQ();

        private GetEQ() {
            super(1, 131);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetHearingMode;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetHearingMode extends HearingAidCommand {

        @NotNull
        public static final GetHearingMode INSTANCE = new GetHearingMode();

        private GetHearingMode() {
            super(1, 130);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetHearingPosition;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetHearingPosition extends HearingAidCommand {

        @NotNull
        public static final GetHearingPosition INSTANCE = new GetHearingPosition();

        private GetHearingPosition() {
            super(1, 133);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetHighBass;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetHighBass extends HearingAidCommand {

        @NotNull
        public static final GetHighBass INSTANCE = new GetHighBass();

        private GetHighBass() {
            super(1, 129);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetSN;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetSN extends HearingAidCommand {

        @NotNull
        public static final GetSN INSTANCE = new GetSN();

        private GetSN() {
            super(2, 5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$GetWDRC;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetWDRC extends HearingAidCommand {

        @NotNull
        public static final GetWDRC INSTANCE = new GetWDRC();

        private GetWDRC() {
            super(1, 134);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$ResetUnusedEQ;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ResetUnusedEQ extends HearingAidCommand {

        @NotNull
        public static final ResetUnusedEQ INSTANCE = new ResetUnusedEQ();

        private ResetUnusedEQ() {
            super(2, 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$ResetUnusedHighBass;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ResetUnusedHighBass extends HearingAidCommand {

        @NotNull
        public static final ResetUnusedHighBass INSTANCE = new ResetUnusedHighBass();

        private ResetUnusedHighBass() {
            super(2, 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetDSP;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetDSP extends HearingAidCommand {

        @NotNull
        public static final SetDSP INSTANCE = new SetDSP();

        private SetDSP() {
            super(1, 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetEQ;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetEQ extends HearingAidCommand {

        @NotNull
        public static final SetEQ INSTANCE = new SetEQ();

        private SetEQ() {
            super(1, 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetHearingMode;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetHearingMode extends HearingAidCommand {

        @NotNull
        public static final SetHearingMode INSTANCE = new SetHearingMode();

        private SetHearingMode() {
            super(1, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetHearingPosition;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetHearingPosition extends HearingAidCommand {

        @NotNull
        public static final SetHearingPosition INSTANCE = new SetHearingPosition();

        private SetHearingPosition() {
            super(1, 5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetHighBass;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetHighBass extends HearingAidCommand {

        @NotNull
        public static final SetHighBass INSTANCE = new SetHighBass();

        private SetHighBass() {
            super(1, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand$SetWDRC;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetWDRC extends HearingAidCommand {

        @NotNull
        public static final SetWDRC INSTANCE = new SetWDRC();

        private SetWDRC() {
            super(1, 6);
        }
    }

    public HearingAidCommand(int i, int i2) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(i, 1), ByteUtilsKt.toByteArray(i2, 1)));
        this.subType = i;
        this.cmd = i2;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    /* JADX INFO: renamed from: getBytes */
    public byte[] getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String() {
        return ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(this.subType, 1), ByteUtilsKt.toByteArray(this.cmd, 1));
    }

    public final int getCmd() {
        return this.cmd;
    }

    public final int getSubType() {
        return this.subType;
    }
}
