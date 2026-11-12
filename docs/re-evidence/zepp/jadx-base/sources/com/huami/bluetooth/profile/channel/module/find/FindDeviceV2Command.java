package com.huami.bluetooth.profile.channel.module.find;

import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceV2Command;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "", Constant.h, "<init>", "(I)V", "EnableDeviceRingCommand", "EnablePhoneRingNotification", "StopFindDeviceCommand", "StopFindDeviceCommandResponse", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class FindDeviceV2Command extends FindDeviceCommand {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceV2Command$EnableDeviceRingCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableDeviceRingCommand extends FindDeviceCommand {

        @NotNull
        public static final EnableDeviceRingCommand INSTANCE = new EnableDeviceRingCommand();

        private EnableDeviceRingCommand() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceV2Command$EnablePhoneRingNotification;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnablePhoneRingNotification extends FindDeviceCommand {

        @NotNull
        public static final EnablePhoneRingNotification INSTANCE = new EnablePhoneRingNotification();

        private EnablePhoneRingNotification() {
            super(21);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceV2Command$StopFindDeviceCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopFindDeviceCommand extends FindDeviceCommand {

        @NotNull
        public static final StopFindDeviceCommand INSTANCE = new StopFindDeviceCommand();

        private StopFindDeviceCommand() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceV2Command$StopFindDeviceCommandResponse;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopFindDeviceCommandResponse extends FindDeviceCommand {

        @NotNull
        public static final StopFindDeviceCommandResponse INSTANCE = new StopFindDeviceCommandResponse();

        private StopFindDeviceCommandResponse() {
            super(7);
        }
    }

    public FindDeviceV2Command(int i) {
        super(i);
    }
}
