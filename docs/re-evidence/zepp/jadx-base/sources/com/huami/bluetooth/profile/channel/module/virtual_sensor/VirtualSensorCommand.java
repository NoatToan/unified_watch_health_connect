package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "QueryVersionCommand", "SyncSensorDataCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class VirtualSensorCommand extends Request.Command {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends VirtualSensorCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorCommand$SyncSensorDataCommand;", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncSensorDataCommand extends VirtualSensorCommand {

        @NotNull
        public static final SyncSensorDataCommand INSTANCE = new SyncSensorDataCommand();

        private SyncSensorDataCommand() {
            super(3);
        }
    }

    public VirtualSensorCommand(int i) {
        super(new byte[]{(byte) i});
    }
}
