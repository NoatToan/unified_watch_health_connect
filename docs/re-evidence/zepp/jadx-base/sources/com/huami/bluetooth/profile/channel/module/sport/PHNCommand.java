package com.huami.bluetooth.profile.channel.module.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "GetWeekTrimpCommand", "PullPHNCommand", "QueryVersionCommand", "StartPHNCommand", "StopPHNCommand", "UpdateRestDayCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class PHNCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$GetWeekTrimpCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetWeekTrimpCommand extends PHNCommand {

        @NotNull
        public static final GetWeekTrimpCommand INSTANCE = new GetWeekTrimpCommand();

        private GetWeekTrimpCommand() {
            super(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$PullPHNCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PullPHNCommand extends PHNCommand {

        @NotNull
        public static final PullPHNCommand INSTANCE = new PullPHNCommand();

        private PullPHNCommand() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends PHNCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$StartPHNCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StartPHNCommand extends PHNCommand {

        @NotNull
        public static final StartPHNCommand INSTANCE = new StartPHNCommand();

        private StartPHNCommand() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$StopPHNCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopPHNCommand extends PHNCommand {

        @NotNull
        public static final StopPHNCommand INSTANCE = new StopPHNCommand();

        private StopPHNCommand() {
            super(10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand$UpdateRestDayCommand;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateRestDayCommand extends PHNCommand {

        @NotNull
        public static final UpdateRestDayCommand INSTANCE = new UpdateRestDayCommand();

        private UpdateRestDayCommand() {
            super(4);
        }
    }

    public PHNCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }

    public final int getCmd() {
        return this.cmd;
    }
}
