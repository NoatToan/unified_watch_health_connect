package com.huami.bluetooth.profile.channel.module.call_reply;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "Ljava/io/Serializable;", "requestCallReply", "", "phoneNo", "", "msg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "requestSmsPermission", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CallReplyDelegate extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate$Companion;", "", "()V", "serialVersionUID", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long serialVersionUID = 1;

        private Companion() {
        }
    }

    void requestCallReply(@NotNull String phoneNo, @NotNull ReplyMsg msg);

    void requestSmsPermission();
}
