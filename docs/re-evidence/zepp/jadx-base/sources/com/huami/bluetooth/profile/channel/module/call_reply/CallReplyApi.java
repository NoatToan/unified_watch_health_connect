package com.huami.bluetooth.profile.channel.module.call_reply;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "Ljava/io/Serializable;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "queryData", "msg", "", "update", "", "id", "delete", "msgList", "syncMsg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "result", "sendReplyResult", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", PointCategory.PERMISSION, "sendSmsPermission", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "content", "sendReplyContent", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "delegate", "", "setReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "setEditCallReplyContentDelegate", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface CallReplyApi extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi$Companion;", "", "", "b", "J", "serialVersionUID", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final long serialVersionUID = 1;

        private Companion() {
        }
    }

    @NotNull
    Response<Boolean> delete(int id);

    @NotNull
    Response<List<ReplyMsg>> queryData();

    @NotNull
    Response<Version> queryVersion();

    @NotNull
    Response<Boolean> sendReplyContent(@NotNull ReplyContent content);

    @NotNull
    Response<Boolean> sendReplyResult(@NotNull ReplyResult result);

    @NotNull
    Response<Boolean> sendSmsPermission(@NotNull SmsPermission permission);

    void setEditCallReplyContentDelegate(@NotNull EditCallReplyContentDelegate delegate);

    void setReplyDelegate(@NotNull CallReplyDelegate delegate);

    @NotNull
    Response<Boolean> syncMsg(@NotNull List<ReplyMsg> msgList);

    @NotNull
    Response<Boolean> update(@NotNull ReplyMsg msg);
}
