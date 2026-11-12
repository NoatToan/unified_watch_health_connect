package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.huami.bluetooth.profile.Request;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "QueryGDSPVersionCommand", "StartTransferCommand", "StopTransferCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class GDSPCommand extends Request.Command {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand$QueryGDSPVersionCommand;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryGDSPVersionCommand extends GDSPCommand {

        @NotNull
        public static final QueryGDSPVersionCommand INSTANCE = new QueryGDSPVersionCommand();

        private QueryGDSPVersionCommand() {
            super(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand$StartTransferCommand;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StartTransferCommand extends GDSPCommand {

        @NotNull
        public static final StartTransferCommand INSTANCE = new StartTransferCommand();

        private StartTransferCommand() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand$StopTransferCommand;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopTransferCommand extends GDSPCommand {

        @NotNull
        public static final StopTransferCommand INSTANCE = new StopTransferCommand();

        private StopTransferCommand() {
            super(3);
        }
    }

    public GDSPCommand(int i) {
        super(new byte[]{(byte) i});
    }
}
