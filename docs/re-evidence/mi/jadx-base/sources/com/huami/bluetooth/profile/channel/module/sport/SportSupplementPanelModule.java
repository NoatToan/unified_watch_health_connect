package com.huami.bluetooth.profile.channel.module.sport;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.onetrack.c.q;
import defpackage.ChannelResponse;
import defpackage.d4;
import defpackage.h3;
import defpackage.qt;
import defpackage.r0;
import defpackage.r3;
import defpackage.r6t;
import defpackage.t5t;
import defpackage.tet;
import defpackage.y2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "command", "", "handleDeviceControl", "(I)V", "", "bytes", "handleDeviceInit", "([B)V", "init", "()V", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerSportControllerListener", "(Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;)V", "queryVersion", "()I", "", "alive", "()Z", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", q.f13857a, "(Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;)Z", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "Lr6t;", "info", "sendControlCommand", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;Lr6t;)Z", "sportListener", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 25)
public final class SportSupplementPanelModule extends a {
    private static final int CMD_ALIVE = 5;
    private static final int CMD_CONFIG = 2;
    private static final int CMD_CONTROL = 3;
    private static final int CMD_CONTROL_DEVICE_INIT = 32;
    private static final int CMD_CONTROL_FROM_DEVICE = 17;
    private static final int CMD_DATA = 4;
    private static final int CMD_RESPONSE_PREFIX = 16;
    private static final int CMD_VERSION_QUERY = 1;
    private static final int CODE_SUCCESS = 1;
    private static final byte PARAM_NO_REMIND = 0;
    private static final byte PARAM_WITH_REMIND = 1;

    @NotNull
    private static final String TAG = "SportModule";
    private static final long TIMEOUT = 5000;
    public static final int VERSION_1 = 1;

    @Nullable
    private IHMSportListener sportListener;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$alive$1", f = "SportSupplementPanelModule.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.t = 1;
                obj = a.sendDataWithResult$default(SportSupplementPanelModule.this, new byte[]{5}, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$init$1$1", f = "SportSupplementPanelModule.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ SportSupplementPanelModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, SportSupplementPanelModule sportSupplementPanelModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = sportSupplementPanelModule;
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
                        t5t.d(SportSupplementPanelModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int iA = r0.a(ArraysKt___ArraysKt.first(this.u.getData()));
                    if (iA == 17) {
                        SportSupplementPanelModule sportSupplementPanelModule = this.v;
                        Integer numA = r0.a(this.u.getData());
                        sportSupplementPanelModule.handleDeviceControl(numA != null ? numA.intValue() : 0);
                    }
                    if (iA == 32) {
                        this.v.handleDeviceInit(y2.a(this.u.getData()));
                    }
                    if (iA != 16) {
                        t5t.d(SportSupplementPanelModule.TAG, "Unrecognizable response");
                        return Unit.INSTANCE;
                    }
                    Integer numA2 = r0.a(this.u.getData());
                    if (numA2 == null) {
                        t5t.d(SportSupplementPanelModule.TAG, "Response no corresponding command");
                        return Unit.INSTANCE;
                    }
                    byte[] bArrB = y2.b(this.u.getData());
                    Channel channel = (Channel) this.v.getMsgChannels().get(numA2);
                    if (channel != null) {
                        this.t = 1;
                        if (channel.send(bArrB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public c() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, SportSupplementPanelModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$sendControlCommand$1", f = "SportSupplementPanelModule.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ byte[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new d(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportSupplementPanelModule sportSupplementPanelModule = SportSupplementPanelModule.this;
                byte[] param = this.v;
                Intrinsics.checkNotNullExpressionValue(param, "param");
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{4, 1}, param);
                this.t = 1;
                obj = a.sendDataWithResult$default(sportSupplementPanelModule, bArrPlus, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule$sendControlCommand$2", f = "SportSupplementPanelModule.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ byte[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(byte[] bArr, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSupplementPanelModule.this.new e(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportSupplementPanelModule sportSupplementPanelModule = SportSupplementPanelModule.this;
                byte[] param = this.v;
                Intrinsics.checkNotNullExpressionValue(param, "param");
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{4, 0}, param);
                this.t = 1;
                obj = a.sendDataWithResult$default(sportSupplementPanelModule, bArrPlus, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportSupplementPanelModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDeviceControl(int command) {
        h3.f19635a.a((byte) command);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDeviceInit(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return;
        }
        h3.f19635a.a(bytes);
    }

    public final boolean alive() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new b(null), 1, null)).booleanValue();
    }

    public final boolean config(@NotNull SportConfig sportConfig) {
        Intrinsics.checkNotNullParameter(sportConfig, "sportConfig");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, new byte[]{2, sportConfig.getSportKind().getKind(), !sportConfig.isNeedDeviceClock() ? 1 : 0}, 0, 0L, 6, (Object) null);
        return (bArrSendCommand$default == null || bArrSendCommand$default.length == 0 || r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default)) != 1) ? false : true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getChannelModule(), false, new c(), 2, null);
    }

    public final int queryVersion() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 1, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Query version failed no response");
            return -1;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst == 1) {
            Integer numA = r0.a(bArrSendCommand$default);
            Intrinsics.checkNotNull(numA);
            return numA.intValue() & 255;
        }
        t5t.d(TAG, "Query version failed(" + iFirst + ')');
        return -1;
    }

    public final void registerSportControllerListener(@NotNull IHMSportListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.sportListener = listener;
    }

    public final boolean sendControlCommand(@NotNull SportCommand command, @Nullable r6t info) {
        byte[] param;
        Intrinsics.checkNotNullParameter(command, "command");
        if (info == null || (param = info.i()) == null) {
            param = tet.p(0);
        }
        if (!qt.a().containsKey(command)) {
            return command == SportCommand.NOTIFY ? ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new d(param, null), 1, null)).booleanValue() : ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new e(param, null), 1, null)).booleanValue();
        }
        byte[] bArr = new byte[2];
        bArr[0] = 3;
        Byte b2 = qt.a().get(command);
        if (b2 == null) {
            throw new IllegalStateException("Could not be happen".toString());
        }
        bArr[1] = b2.byteValue();
        Intrinsics.checkNotNullExpressionValue(param, "param");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(bArr, param), 0, 0L, 6, (Object) null);
        t5t.d(TAG, tet.x(bArrSendCommand$default));
        return bArrSendCommand$default != null && r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default)) == 1;
    }
}
