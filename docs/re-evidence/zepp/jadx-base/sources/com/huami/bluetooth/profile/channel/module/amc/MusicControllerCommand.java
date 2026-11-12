package com.huami.bluetooth.profile.channel.module.amc;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, Constant.h, "<init>", "(I)V", "AppControllerCommand", "DeviceControllerCommand", "DeviceMusicControllerStateCommand", "VersionWQueryCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class MusicControllerCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand$AppControllerCommand;", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AppControllerCommand extends MusicControllerCommand {

        @NotNull
        public static final AppControllerCommand INSTANCE = new AppControllerCommand();

        private AppControllerCommand() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand$DeviceControllerCommand;", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceControllerCommand extends MusicControllerCommand {

        @NotNull
        public static final DeviceControllerCommand INSTANCE = new DeviceControllerCommand();

        private DeviceControllerCommand() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand$DeviceMusicControllerStateCommand;", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceMusicControllerStateCommand extends MusicControllerCommand {

        @NotNull
        public static final DeviceMusicControllerStateCommand INSTANCE = new DeviceMusicControllerStateCommand();

        private DeviceMusicControllerStateCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand$VersionWQueryCommand;", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VersionWQueryCommand extends MusicControllerCommand {

        @NotNull
        public static final VersionWQueryCommand INSTANCE = new VersionWQueryCommand();

        private VersionWQueryCommand() {
            super(1);
        }
    }

    public MusicControllerCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }
}
