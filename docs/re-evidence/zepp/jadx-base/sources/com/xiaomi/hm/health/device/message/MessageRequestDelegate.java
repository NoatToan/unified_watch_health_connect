package com.xiaomi.hm.health.device.message;

import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyModule;
import com.huami.bluetooth.profile.channel.module.call_reply.EditCallReplyContentDelegate;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyContent;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/message/MessageRequestDelegate;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "content", "", "requestEdit", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "getApi", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MessageRequestDelegate implements EditCallReplyContentDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CallReplyApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/message/MessageRequestDelegate$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", PointCategory.INIT, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void init(@NotNull HMMiLiProDevice device) {
            CallReplyModule callReplyModule = (CallReplyModule) device.getChannelModule(CallReplyModule.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            CallReplyApi callReplyApiLoadApi = callReplyModule == null ? null : callReplyModule.loadApi();
            if (callReplyApiLoadApi == null) {
                return;
            }
            new MessageRequestDelegate(callReplyApiLoadApi, defaultConstructorMarker);
        }
    }

    private MessageRequestDelegate(CallReplyApi callReplyApi) {
        this.api = callReplyApi;
        callReplyApi.setEditCallReplyContentDelegate(this);
    }

    public /* synthetic */ MessageRequestDelegate(CallReplyApi callReplyApi, DefaultConstructorMarker defaultConstructorMarker) {
        this(callReplyApi);
    }

    @JvmStatic
    public static final void init(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        INSTANCE.init(hMMiLiProDevice);
    }

    @NotNull
    public final CallReplyApi getApi() {
        return this.api;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.EditCallReplyContentDelegate
    public void requestEdit(@NotNull ReplyContent content) {
        MessageHookManager.INSTANCE.openUI(content.getTitle(), content.getPhoneNo());
    }
}
