package com.huami.bluetooth.profile.channel.module.activity;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/activity/RealtimeActivityModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/activity/RealtimeStepApi;", "", "c", PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getRealtimeStep", "Lcom/xiaomi/hm/health/bt/profile/base/IRealtimeStepCallback;", "callback", "", "registerRealtimeStepCallback", "unregisterRealtimeStepCallback", "startNotify", "stopNotify", "", "queryVersion", "readRealtimeData", "", "g", "Ljava/util/Map;", "commandToResponseCode", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RealtimeActivityModule extends BaseModule implements RealtimeStepApi {
    public static final int REALTIME_STEP_MODULE = 22;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 5;
    private static final int m = 6;
    private static final int n = 7;
    private static final int o = 1;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 1;

    @NotNull
    private static final String s = "RealtimeActivityModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Integer> commandToResponseCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$init$1$1", f = "RealtimeActivityModule.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0316a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ RealtimeActivityModule c;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$init$1$1$1", f = "RealtimeActivityModule.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0317a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ RealtimeActivityModule b;
                public final /* synthetic */ int c;
                public final /* synthetic */ byte[] d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0317a(RealtimeActivityModule realtimeActivityModule, int i, byte[] bArr, Continuation<? super C0317a> continuation) {
                    super(2, continuation);
                    this.b = realtimeActivityModule;
                    this.c = i;
                    this.d = bArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0317a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0317a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.b.getMsgChannels().get(Boxing.boxInt(this.c));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArr = this.d;
                        this.a = 1;
                        if (channel.send(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0316a(ChannelResponse channelResponse, RealtimeActivityModule realtimeActivityModule, Continuation<? super C0316a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = realtimeActivityModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0316a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0316a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        Debug.fi(RealtimeActivityModule.s, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(this.b.getData()));
                    if (unSignInt == 7) {
                        RealtimeActivityCallbackHolder.INSTANCE.onRealtimeActivity(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                        return Unit.INSTANCE;
                    }
                    C0317a c0317a = new C0317a(this.c, unSignInt, ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()), null);
                    this.a = 1;
                    if (TimeoutKt.withTimeoutOrNull(1000L, c0317a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            kotlinx.coroutines.d.b(null, new C0316a(channelResponse, RealtimeActivityModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Start notify response code:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Stop notify response code:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Stop notify realtime step result:", Boolean.valueOf(this.a));
        }
    }

    public RealtimeActivityModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.commandToResponseCode = r.mapOf(TuplesKt.to(1, 2), TuplesKt.to(3, 4), TuplesKt.to(5, 6));
    }

    private final void c() {
        RealtimeActivityCallbackHolder.INSTANCE.unregisterRealtimeStepCallback();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 22;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    @Nullable
    public RealtimeStep getRealtimeStep() {
        return readRealtimeData();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    public final int queryVersion() {
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, 1, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
                if (iFirst == 1) {
                    Integer numSecond = AuthModuleKt.second(bArrSendCommand$default);
                    if (numSecond != null) {
                        return numSecond.intValue();
                    }
                    Debug.fi(s, Intrinsics.stringPlus("固件返回了错误的版本信息:", ByteArrayKt.toHexString(bArrSendCommand$default)));
                    return -1;
                }
                Debug.fi(s, "Query version failed(" + iFirst + ')');
                return -1;
            }
        }
        Debug.fi(s, "Query version failed no response");
        return -1;
    }

    @Nullable
    public final synchronized RealtimeStep readRealtimeData() {
        Object objM3845constructorimpl;
        Integer num = this.commandToResponseCode.get(3);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, 3, num.intValue(), 0L, 4, (Object) null);
        Object obj = null;
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                if (AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default)) != 1) {
                    return null;
                }
                try {
                    Result.Companion companion = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(RealtimeStep.parseFrom(ByteArrayKt.subArrayWithoutFirstElement(bArrSendCommand$default)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    obj = objM3845constructorimpl;
                }
                return (RealtimeStep) obj;
            }
        }
        Debug.fi(s, "Query version failed no response");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean registerRealtimeStepCallback(@NotNull IRealtimeStepCallback callback) {
        if (!startNotify()) {
            return false;
        }
        RealtimeStep realtimeStep = getRealtimeStep();
        if (realtimeStep != null) {
            callback.onStepChanged(realtimeStep);
        }
        RealtimeActivityCallbackHolder.INSTANCE.registerRealtimeStepCallback(callback);
        return true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean startNotify() {
        byte[] bArr = {5, 1};
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, bArr, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default));
                HMLog.info(s, new b(unSignInt));
                return unSignInt == 1;
            }
        }
        Debug.fi(s, "Start notify failed no response");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean stopNotify() {
        byte[] bArr = {5, 0};
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, bArr, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default));
                HMLog.info(s, new c(unSignInt));
                return unSignInt == 1;
            }
        }
        Debug.fi(s, "Stop notify failed no response");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public void unregisterRealtimeStepCallback(@NotNull IRealtimeStepCallback callback) {
        c();
        HMLog.info(s, new d(stopNotify()));
    }
}
