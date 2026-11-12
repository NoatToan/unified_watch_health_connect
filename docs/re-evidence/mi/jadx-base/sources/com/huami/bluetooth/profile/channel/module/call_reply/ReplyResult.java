package com.huami.bluetooth.profile.channel.module.call_reply;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "Ljava/io/Serializable;", "()V", "Companion", "Failed", "Success", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Failed;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Success;", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class ReplyResult implements Serializable {
    private static final long serialVersionUID = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Failed;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Failed extends ReplyResult {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult$Success;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
