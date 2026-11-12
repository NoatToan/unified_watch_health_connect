package com.huami.bluetooth.profile.channel.module.connect;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "Companion", "NotifyCommand", "PingCommand", "PongCommand", "QueryCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ConnectParamCommand extends Request.Command {
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand$NotifyCommand;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NotifyCommand extends ConnectParamCommand {

        @NotNull
        public static final NotifyCommand INSTANCE = new NotifyCommand();

        private NotifyCommand() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand$PingCommand;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PingCommand extends ConnectParamCommand {

        @NotNull
        public static final PingCommand INSTANCE = new PingCommand();

        private PingCommand() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand$PongCommand;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PongCommand extends ConnectParamCommand {

        @NotNull
        public static final PongCommand INSTANCE = new PongCommand();

        private PongCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand$QueryCommand;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParamCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryCommand extends ConnectParamCommand {

        @NotNull
        public static final QueryCommand INSTANCE = new QueryCommand();

        private QueryCommand() {
            super(1);
        }
    }

    public ConnectParamCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }
}
