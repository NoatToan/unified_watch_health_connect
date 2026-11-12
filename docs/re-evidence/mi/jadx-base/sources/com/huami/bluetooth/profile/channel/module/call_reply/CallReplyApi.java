package com.huami.bluetooth.profile.channel.module.call_reply;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001aH&J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001e\u001a\u00020\tH&¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "Ljava/io/Serializable;", "delete", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "id", "", "queryData", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "sendReplyContent", MiuiCursorConstants.CONTENT, "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "sendReplyResult", "result", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "sendSmsPermission", "permission", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "setEditCallReplyContentDelegate", "", "delegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "setReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "syncMsg", "msgList", "update", "msg", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CallReplyApi extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi$Companion;", "", "()V", "serialVersionUID", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
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
