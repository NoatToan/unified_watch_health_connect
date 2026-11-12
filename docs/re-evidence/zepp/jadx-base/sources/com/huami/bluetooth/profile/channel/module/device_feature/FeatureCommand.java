package com.huami.bluetooth.profile.channel.module.device_feature;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/FeatureCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "QueryFeatureCommand", "QueryResponseCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class FeatureCommand extends Request.Command {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/FeatureCommand$QueryFeatureCommand;", "Lcom/huami/bluetooth/profile/channel/module/device_feature/FeatureCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryFeatureCommand extends FeatureCommand {

        @NotNull
        public static final QueryFeatureCommand INSTANCE = new QueryFeatureCommand();

        private QueryFeatureCommand() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/FeatureCommand$QueryResponseCommand;", "Lcom/huami/bluetooth/profile/channel/module/device_feature/FeatureCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryResponseCommand extends FeatureCommand {

        @NotNull
        public static final QueryResponseCommand INSTANCE = new QueryResponseCommand();

        private QueryResponseCommand() {
            super(2);
        }
    }

    public FeatureCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }
}
