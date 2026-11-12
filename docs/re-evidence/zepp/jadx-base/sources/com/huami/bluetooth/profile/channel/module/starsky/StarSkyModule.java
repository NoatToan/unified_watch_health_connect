package com.huami.bluetooth.profile.channel.module.starsky;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "", "callback", "setReceiveCallback", AbstractJSONTokenResponse.RESPONSE, "onReceive", "(Lcom/huami/bluetooth/profile/channel/ChannelResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", LogUtil.I, "getModule", "()I", "module", "h", "Lkotlin/jvm/functions/Function1;", "mReceiveCallback", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StarSkyModule extends BaseModule {
    public static final int CMD_DEVICE_DATA_TO_APP = 7;
    public static final int CMD_DEVICE_DATA_TO_APP_RESULT = 8;
    public static final int CMD_DISABLE_RELAX_MUSIC = 5;
    public static final int CMD_DISABLE_RELAX_MUSIC_RESPONSE = 6;
    public static final int CMD_ENABLE_RELAX_MUSIC = 3;
    public static final int CMD_ENABLE_RELAX_MUSIC_RESPONSE = 4;
    public static final int CMD_QUERY_VERSION = 1;
    public static final int CMD_QUERY_VERSION_RESPONSE = 2;
    public static final int STAR_SKY_MODULE = 54;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ChannelResponse, Unit> mReceiveCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyModule", f = "StarSkyModule.kt", i = {0, 0}, l = {34}, m = "onReceive", n = {"this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return StarSkyModule.this.onReceive((ChannelResponse) null, this);
        }
    }

    public StarSkyModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.module = 54;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        StarSkyModule starSkyModule;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.a = this;
            aVar.b = channelResponse;
            aVar.e = 1;
            if (super.onReceive(channelResponse, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            starSkyModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelResponse = (ChannelResponse) aVar.b;
            starSkyModule = (StarSkyModule) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Function1<? super ChannelResponse, Unit> function1 = starSkyModule.mReceiveCallback;
        if (function1 != null) {
            function1.invoke(channelResponse);
        }
        return Unit.INSTANCE;
    }

    public final void setReceiveCallback(@NotNull Function1<? super ChannelResponse, Unit> callback) {
        this.mReceiveCallback = callback;
    }
}
