package com.xiaomi.hm.health.bt.profile.base;

import androidx.core.app.NotificationCompat;
import com.huami.bluetooth.profile.channel.Channel;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.model.ChannelRequest;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0005\u001a\u00020\u0003J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001b\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/ChannelApiDecorate;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "", "decorate", "unDecorate", "", "moduleId", "", "isOneTime", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "callback", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;", "request", "sendData", NotificationCompat.CATEGORY_TRANSPORT, "(Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "setChannel", Constant.FUNCTION_CLOSE_CHANNEL, "", "getAddress", "a", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelApiDecorate implements ChannelApi {

    @NotNull
    private static final String b = "ChannelApiDecorate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ChannelApi channelApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.base.ChannelApiDecorate", f = "ChannelApiDecorate.kt", i = {}, l = {58}, m = NotificationCompat.CATEGORY_TRANSPORT, n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ChannelApiDecorate.this.transport(null, this);
        }
    }

    public ChannelApiDecorate(@Nullable ChannelApi channelApi) {
        this.channelApi = channelApi;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void closeChannel() {
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while close channel");
        }
        ChannelApi channelApi = this.channelApi;
        if (channelApi == null) {
            return;
        }
        channelApi.closeChannel();
    }

    public final void decorate(@Nullable ChannelApi channelApi) {
        this.channelApi = channelApi;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @NotNull
    public String getAddress() {
        String address;
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while get address");
        }
        ChannelApi channelApi = this.channelApi;
        return (channelApi == null || (address = channelApi.getAddress()) == null) ? "" : address;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @NotNull
    public ChannelVersion getVersion() {
        ChannelApi channelApi = this.channelApi;
        ChannelVersion version = channelApi == null ? null : channelApi.getVersion();
        return version == null ? new ChannelVersion(0, null, 3, null) : version;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void register(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while register");
        }
        ChannelApi channelApi = this.channelApi;
        if (channelApi == null) {
            return;
        }
        channelApi.register(moduleId, isOneTime, callback);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void sendData(@NotNull ChannelRequest request) {
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while send data");
        }
        ChannelApi channelApi = this.channelApi;
        if (channelApi == null) {
            return;
        }
        channelApi.sendData(request);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void setChannel(@NotNull Channel channel) {
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while set channel");
        }
        ChannelApi channelApi = this.channelApi;
        if (channelApi == null) {
            return;
        }
        channelApi.setChannel(channel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @Nullable
    public Object transport(@NotNull ChannelRequest channelRequest, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objTransport = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTransport);
            if (this.channelApi == null) {
                Debug.fi(b, "Channel api decorate is null while transport");
            }
            ChannelApi channelApi = this.channelApi;
            if (channelApi != null) {
                aVar.c = 1;
                objTransport = channelApi.transport(channelRequest, aVar);
                if (objTransport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objTransport);
        Boolean bool = (Boolean) objTransport;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void unDecorate() {
        ChannelApi channelApi = this.channelApi;
        if (channelApi != null) {
            channelApi.closeChannel();
        }
        this.channelApi = null;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void unregister(int moduleId) {
        if (this.channelApi == null) {
            Debug.fi(b, "Channel api decorate is null while unregister");
        }
        ChannelApi channelApi = this.channelApi;
        if (channelApi == null) {
            return;
        }
        channelApi.unregister(moduleId);
    }
}
