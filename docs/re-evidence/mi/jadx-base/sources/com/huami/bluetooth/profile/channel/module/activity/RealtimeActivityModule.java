package com.huami.bluetooth.profile.channel.module.activity;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.cq;
import defpackage.le;
import defpackage.r0;
import defpackage.r3;
import defpackage.rft;
import defpackage.t5t;
import defpackage.y2;
import defpackage.ycs;
import defpackage.zp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0004\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\tR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/activity/RealtimeActivityModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lcq;", "", "unregisterRealtimeStepCallback", "()V", "init", "Lycs;", "getRealtimeStep", "()Lycs;", "Lrft;", "callback", "", "registerRealtimeStepCallback", "(Lrft;)Z", "(Lrft;)V", "startNotify", "()Z", "stopNotify", "", "queryVersion", "()I", "readRealtimeData", "", "commandToResponseCode", "Ljava/util/Map;", "getModule", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class RealtimeActivityModule extends a implements cq {
    private static final int CMD_READ_REALTIME_DATA = 3;
    private static final int CMD_READ_REALTIME_RESPONSE_CODE = 4;
    private static final int CMD_SET_NOTIFY = 5;
    private static final int CMD_SET_NOTIFY_RESPONSE = 6;
    private static final int CMD_VERSION_QUERY = 1;
    private static final int CMD_VERSION_RESPONSE_CODE = 2;
    private static final int CODE_SUCCESS = 1;
    public static final int REALTIME_STEP_MODULE = 22;
    private static final int RESPONSE_REALTIME = 7;
    private static final int SET_NOTIFY_START = 1;
    private static final int SET_NOTIFY_STOP = 0;

    @NotNull
    private static final String TAG = "RealtimeActivityModule";
    private static final int VERSION_1 = 1;

    @NotNull
    private final Map<Integer, Integer> commandToResponseCode;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$init$1$1", f = "RealtimeActivityModule.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ RealtimeActivityModule v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule$init$1$1$1", f = "RealtimeActivityModule.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0276a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ RealtimeActivityModule u;
                public final /* synthetic */ int v;
                public final /* synthetic */ byte[] w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0276a(RealtimeActivityModule realtimeActivityModule, int i, byte[] bArr, Continuation<? super C0276a> continuation) {
                    super(2, continuation);
                    this.u = realtimeActivityModule;
                    this.v = i;
                    this.w = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0276a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0276a(this.u, this.v, this.w, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.u.getMsgChannels().get(Boxing.boxInt(this.v));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArr = this.w;
                        this.t = 1;
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
            public a(ChannelResponse channelResponse, RealtimeActivityModule realtimeActivityModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = realtimeActivityModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d(RealtimeActivityModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int iA = r0.a(ArraysKt___ArraysKt.first(this.u.getData()));
                    if (iA == 7) {
                        zp.f41531a.a(y2.a(this.u.getData()));
                        return Unit.INSTANCE;
                    }
                    C0276a c0276a = new C0276a(this.v, iA, y2.a(this.u.getData()), null);
                    this.t = 1;
                    if (TimeoutKt.withTimeoutOrNull(1000L, c0276a, this) == coroutine_suspended) {
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, RealtimeActivityModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Start notify response code:" + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Stop notify response code:" + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.t = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Stop notify realtime step result:" + this.t;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeActivityModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.commandToResponseCode = MapsKt__MapsKt.mapOf(TuplesKt.to(1, 2), TuplesKt.to(3, 4), TuplesKt.to(5, 6));
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 22;
    }

    @Override // defpackage.cq
    @Nullable
    public ycs getRealtimeStep() {
        return readRealtimeData();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public final int queryVersion() {
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 1, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Query version failed no response");
            return -1;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst != 1) {
            t5t.d(TAG, "Query version failed(" + iFirst + ')');
            return -1;
        }
        Integer numA = r0.a(bArrSendCommand$default);
        if (numA != null) {
            return numA.intValue();
        }
        t5t.d(TAG, "固件返回了错误的版本信息:" + y2.c(bArrSendCommand$default));
        return -1;
    }

    @Nullable
    public final synchronized ycs readRealtimeData() {
        Object objM886constructorimpl;
        Integer num = this.commandToResponseCode.get(3);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 3, num.intValue(), 0L, 4, (Object) null);
        Object obj = null;
        if (bArrSendCommand$default != null && bArrSendCommand$default.length != 0) {
            if (r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default)) != 1) {
                return null;
            }
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ycs.b(y2.a(bArrSendCommand$default)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            if (!Result.m892isFailureimpl(objM886constructorimpl)) {
                obj = objM886constructorimpl;
            }
            return (ycs) obj;
        }
        t5t.d(TAG, "Query version failed no response");
        return null;
    }

    @Override // defpackage.cq
    public boolean registerRealtimeStepCallback(@NotNull rft callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean zStartNotify = startNotify();
        ycs realtimeStep = getRealtimeStep();
        if (realtimeStep != null) {
            callback.l(realtimeStep);
        }
        zp.f41531a.a(callback);
        return zStartNotify;
    }

    public boolean startNotify() {
        byte[] bArr = {5, 1};
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = a.sendCommand$default(this, bArr, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Start notify failed no response");
            return false;
        }
        int iA = r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        le.c(TAG, new c(iA));
        return iA == 1;
    }

    public boolean stopNotify() {
        byte[] bArr = {5, 0};
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommand$default = a.sendCommand$default(this, bArr, num.intValue(), 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Stop notify failed no response");
            return false;
        }
        int iA = r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        le.c(TAG, new d(iA));
        return iA == 1;
    }

    @Override // defpackage.cq
    public void unregisterRealtimeStepCallback(@NotNull rft callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        unregisterRealtimeStepCallback();
        le.c(TAG, new e(stopNotify()));
    }

    private final void unregisterRealtimeStepCallback() {
        zp.f41531a.a();
    }
}
