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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidDeviceCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(I)V", "Companion", "DeviceRecovery", "GetDeviceBattery", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HearingAidDeviceCommand extends Request.Command {
    private static final int c = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @NotNull
    private static final byte[] d = ByteUtilsKt.toByteArray(2, 1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidDeviceCommand$DeviceRecovery;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceRecovery extends HearingAidDeviceCommand {

        @NotNull
        public static final DeviceRecovery INSTANCE = new DeviceRecovery();

        private DeviceRecovery() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidDeviceCommand$GetDeviceBattery;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetDeviceBattery extends HearingAidDeviceCommand {

        @NotNull
        public static final GetDeviceBattery INSTANCE = new GetDeviceBattery();

        private GetDeviceBattery() {
            super(1);
        }
    }

    public HearingAidDeviceCommand(int i) {
        super(ArraysKt___ArraysJvmKt.plus(d, ByteUtilsKt.toByteArray(i, 1)));
        this.cmd = i;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    /* JADX INFO: renamed from: getBytes */
    public byte[] getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String() {
        return ByteUtilsKt.toByteArray(this.cmd, 1);
    }

    public final int getCmd() {
        return this.cmd;
    }
}
