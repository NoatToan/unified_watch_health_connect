package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0011\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "toString", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "c", "[B", "getExtra", "()[B", "setExtra", "([B)V", "extra", "getBytes", HTTP.CONTENT_RANGE_BYTES, "<init>", "(I[B)V", "Companion", "QueryVersionCommand", "QueryVersionResponseCommand", "SetMotorVibrateParametersCommand", "SetMotorVibrateParametersResponseCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class MotorVibrateCommand extends Request.Command {
    private static final int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private byte[] extra;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends MotorVibrateCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public QueryVersionCommand() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand$QueryVersionResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionResponseCommand extends MotorVibrateCommand {
        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public QueryVersionResponseCommand() {
            int i = 2;
            super(i, null, i, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand$SetMotorVibrateParametersCommand;", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetMotorVibrateParametersCommand extends MotorVibrateCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public SetMotorVibrateParametersCommand() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand$SetMotorVibrateParametersResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetMotorVibrateParametersResponseCommand extends MotorVibrateCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public SetMotorVibrateParametersResponseCommand() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ MotorVibrateCommand(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    /* JADX INFO: renamed from: getBytes */
    public byte[] getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String() {
        return ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(this.cmd, 1), this.extra);
    }

    public final int getCmd() {
        return this.cmd;
    }

    @NotNull
    public final byte[] getExtra() {
        return this.extra;
    }

    public final void setExtra(@NotNull byte[] bArr) {
        this.extra = bArr;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public String toString() {
        return "MotorVibrateCommand(" + ((Object) GattUtils.bytesToHexString(getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) + ')';
    }

    public MotorVibrateCommand(int i, @NotNull byte[] bArr) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(i, 1), bArr));
        this.cmd = i;
        this.extra = bArr;
    }
}
