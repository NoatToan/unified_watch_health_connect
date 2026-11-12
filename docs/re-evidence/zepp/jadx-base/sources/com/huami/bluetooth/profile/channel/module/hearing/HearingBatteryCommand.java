package com.huami.bluetooth.profile.channel.module.hearing;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(I)V", "Companion", "NotifyBatteryCommand", "NotifyEarphoneStatusCommand", "QueryBatteryCommand", "QueryEarphoneStatusCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HearingBatteryCommand extends Request.Command {
    private static final int c = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand$NotifyBatteryCommand;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NotifyBatteryCommand extends HearingBatteryCommand {

        @NotNull
        public static final NotifyBatteryCommand INSTANCE = new NotifyBatteryCommand();

        private NotifyBatteryCommand() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand$NotifyEarphoneStatusCommand;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NotifyEarphoneStatusCommand extends HearingBatteryCommand {

        @NotNull
        public static final NotifyEarphoneStatusCommand INSTANCE = new NotifyEarphoneStatusCommand();

        private NotifyEarphoneStatusCommand() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand$QueryBatteryCommand;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryBatteryCommand extends HearingBatteryCommand {

        @NotNull
        public static final QueryBatteryCommand INSTANCE = new QueryBatteryCommand();

        private QueryBatteryCommand() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand$QueryEarphoneStatusCommand;", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryEarphoneStatusCommand extends HearingBatteryCommand {

        @NotNull
        public static final QueryEarphoneStatusCommand INSTANCE = new QueryEarphoneStatusCommand();

        private QueryEarphoneStatusCommand() {
            super(5);
        }
    }

    public HearingBatteryCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
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
