package com.huami.bluetooth.profile.channel.module.openapp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "ActivityDataWriteBackCommand", "ActivityDataWriteResponseCommand", "DeviceOpenAppCommand", "DeviceOpenAppResult", "DeviceRealtimeHrCommand", "DeviceRealtimeHrResult", "DeviceSleepStateCommand", "QueryVersionCommand", "ReplyVersionCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class OpenAppCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$ActivityDataWriteBackCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ActivityDataWriteBackCommand extends OpenAppCommand {

        @NotNull
        public static final ActivityDataWriteBackCommand INSTANCE = new ActivityDataWriteBackCommand();

        private ActivityDataWriteBackCommand() {
            super(9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$ActivityDataWriteResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ActivityDataWriteResponseCommand extends OpenAppCommand {

        @NotNull
        public static final ActivityDataWriteResponseCommand INSTANCE = new ActivityDataWriteResponseCommand();

        private ActivityDataWriteResponseCommand() {
            super(10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$DeviceOpenAppCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceOpenAppCommand extends OpenAppCommand {

        @NotNull
        public static final DeviceOpenAppCommand INSTANCE = new DeviceOpenAppCommand();

        private DeviceOpenAppCommand() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$DeviceOpenAppResult;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceOpenAppResult extends OpenAppCommand {

        @NotNull
        public static final DeviceOpenAppResult INSTANCE = new DeviceOpenAppResult();

        private DeviceOpenAppResult() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$DeviceRealtimeHrCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceRealtimeHrCommand extends OpenAppCommand {

        @NotNull
        public static final DeviceRealtimeHrCommand INSTANCE = new DeviceRealtimeHrCommand();

        private DeviceRealtimeHrCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$DeviceRealtimeHrResult;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceRealtimeHrResult extends OpenAppCommand {

        @NotNull
        public static final DeviceRealtimeHrResult INSTANCE = new DeviceRealtimeHrResult();

        private DeviceRealtimeHrResult() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$DeviceSleepStateCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceSleepStateCommand extends OpenAppCommand {

        @NotNull
        public static final DeviceSleepStateCommand INSTANCE = new DeviceSleepStateCommand();

        private DeviceSleepStateCommand() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends OpenAppCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand$ReplyVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyVersionCommand extends OpenAppCommand {

        @NotNull
        public static final ReplyVersionCommand INSTANCE = new ReplyVersionCommand();

        private ReplyVersionCommand() {
            super(1);
        }
    }

    public OpenAppCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }

    public final int getCmd() {
        return this.cmd;
    }
}
