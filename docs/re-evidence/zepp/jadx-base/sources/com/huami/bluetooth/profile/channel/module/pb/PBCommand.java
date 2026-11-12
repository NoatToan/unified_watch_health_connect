package com.huami.bluetooth.profile.channel.module.pb;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "QueryVersionCommand", "UpdateRecodesCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class PBCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/pb/PBCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends PBCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        private QueryVersionCommand() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBCommand$UpdateRecodesCommand;", "Lcom/huami/bluetooth/profile/channel/module/pb/PBCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateRecodesCommand extends PBCommand {

        @NotNull
        public static final UpdateRecodesCommand INSTANCE = new UpdateRecodesCommand();

        private UpdateRecodesCommand() {
            super(3);
        }
    }

    public PBCommand(int i) {
        super(new byte[]{(byte) i});
        this.cmd = i;
    }

    public final int getCmd() {
        return this.cmd;
    }
}
