package com.huami.bluetooth.profile.channel.module.starsky;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.r3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlin/Function1;", "Lm4;", "", "callback", "setReceiveCallback", com.xiaomi.onetrack.api.b.I, "onReceive", "(Lm4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", RnReportConst.ApiReport.PARAM_MODULE, "I", "getModule", "()I", "mReceiveCallback", "Lkotlin/jvm/functions/Function1;", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class StarSkyModule extends a {
    public static final int CMD_DEVICE_DATA_TO_APP = 7;
    public static final int CMD_DEVICE_DATA_TO_APP_RESULT = 8;
    public static final int CMD_DISABLE_RELAX_MUSIC = 5;
    public static final int CMD_DISABLE_RELAX_MUSIC_RESPONSE = 6;
    public static final int CMD_ENABLE_RELAX_MUSIC = 3;
    public static final int CMD_ENABLE_RELAX_MUSIC_RESPONSE = 4;
    public static final int CMD_QUERY_VERSION = 1;
    public static final int CMD_QUERY_VERSION_RESPONSE = 2;
    public static final int STAR_SKY_MODULE = 54;

    @Nullable
    private Function1<? super ChannelResponse, Unit> mReceiveCallback;
    private final int module;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyModule", f = "StarSkyModule.kt", i = {0, 0}, l = {34}, m = "onReceive", n = {"this", com.xiaomi.onetrack.api.b.I}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return StarSkyModule.this.onReceive((ChannelResponse) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarSkyModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.module = 54;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return this.module;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.a
    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        StarSkyModule starSkyModule;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.x = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            bVar.t = this;
            bVar.u = channelResponse;
            bVar.x = 1;
            if (super.onReceive(channelResponse, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            starSkyModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelResponse = (ChannelResponse) bVar.u;
            starSkyModule = (StarSkyModule) bVar.t;
            ResultKt.throwOnFailure(obj);
        }
        Function1<? super ChannelResponse, Unit> function1 = starSkyModule.mReceiveCallback;
        if (function1 != null) {
            function1.invoke2(channelResponse);
        }
        return Unit.INSTANCE;
    }

    public final void setReceiveCallback(@NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mReceiveCallback = callback;
    }
}
