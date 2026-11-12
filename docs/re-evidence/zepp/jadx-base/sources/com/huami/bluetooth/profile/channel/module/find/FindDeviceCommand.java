package com.huami.bluetooth.profile.channel.module.find;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "FindPhoneDeviceCommand", "FindPhoneDeviceResponseCommand", "FindPhoneStopCommand", "FindWearableDeviceCommand", "FindWearableDeviceResponseCommand", "QueryVersionCommand", "QueryVersionResponseCommand", "StopFindPhoneDeviceCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class FindDeviceCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$FindPhoneDeviceCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FindPhoneDeviceCommand extends FindDeviceCommand {

        @NotNull
        public static final FindPhoneDeviceCommand INSTANCE = new FindPhoneDeviceCommand();

        private FindPhoneDeviceCommand() {
            super(17);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$FindPhoneDeviceResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FindPhoneDeviceResponseCommand extends FindDeviceCommand {

        @NotNull
        public static final FindPhoneDeviceResponseCommand INSTANCE = new FindPhoneDeviceResponseCommand();

        private FindPhoneDeviceResponseCommand() {
            super(18);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$FindPhoneStopCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FindPhoneStopCommand extends FindDeviceCommand {

        @NotNull
        public static final FindPhoneStopCommand INSTANCE = new FindPhoneStopCommand();

        private FindPhoneStopCommand() {
            super(20);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$FindWearableDeviceCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FindWearableDeviceCommand extends FindDeviceCommand {

        @NotNull
        public static final FindWearableDeviceCommand INSTANCE = new FindWearableDeviceCommand();

        private FindWearableDeviceCommand() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$FindWearableDeviceResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FindWearableDeviceResponseCommand extends FindDeviceCommand {

        @NotNull
        public static final FindWearableDeviceResponseCommand INSTANCE = new FindWearableDeviceResponseCommand();

        private FindWearableDeviceResponseCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends FindDeviceCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$QueryVersionResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionResponseCommand extends FindDeviceCommand {

        @NotNull
        public static final QueryVersionResponseCommand INSTANCE = new QueryVersionResponseCommand();

        private QueryVersionResponseCommand() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand$StopFindPhoneDeviceCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopFindPhoneDeviceCommand extends FindDeviceCommand {

        @NotNull
        public static final StopFindPhoneDeviceCommand INSTANCE = new StopFindPhoneDeviceCommand();

        private StopFindPhoneDeviceCommand() {
            super(19);
        }
    }

    public FindDeviceCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }

    public final int getCmd() {
        return this.cmd;
    }
}
