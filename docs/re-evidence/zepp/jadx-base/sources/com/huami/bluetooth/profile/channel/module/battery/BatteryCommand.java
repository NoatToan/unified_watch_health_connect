package com.huami.bluetooth.profile.channel.module.battery;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "BatteryNotifyCommand", "BatteryResponseCommand", "QueryBatteryCommand", "QueryVersionCommand", "QueryVersionResponseCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class BatteryCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand$BatteryNotifyCommand;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class BatteryNotifyCommand extends BatteryCommand {

        @NotNull
        public static final BatteryNotifyCommand INSTANCE = new BatteryNotifyCommand();

        private BatteryNotifyCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand$BatteryResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class BatteryResponseCommand extends BatteryCommand {

        @NotNull
        public static final BatteryResponseCommand INSTANCE = new BatteryResponseCommand();

        private BatteryResponseCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand$QueryBatteryCommand;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryBatteryCommand extends BatteryCommand {

        @NotNull
        public static final QueryBatteryCommand INSTANCE = new QueryBatteryCommand();

        private QueryBatteryCommand() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends BatteryCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand$QueryVersionResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionResponseCommand extends BatteryCommand {

        @NotNull
        public static final QueryVersionResponseCommand INSTANCE = new QueryVersionResponseCommand();

        private QueryVersionResponseCommand() {
            super(2);
        }
    }

    public BatteryCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }

    public final int getCmd() {
        return this.cmd;
    }
}
