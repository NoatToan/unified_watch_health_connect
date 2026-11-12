package com.huami.bluetooth.profile.channel.module.call_reply;

import com.facebook.internal.AnalyticsEvents;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "Ljava/io/Serializable;", "<init>", "()V", "Companion", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Success;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Failed;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class ReplyResult implements Serializable {
    private static final long serialVersionUID = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Failed;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Failed extends ReplyResult {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Success;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends ReplyResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private ReplyResult() {
    }

    public /* synthetic */ ReplyResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
