package com.huami.bluetooth.profile.channel.module;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.ChannelVersion;
import defpackage.Failure;
import defpackage.Timeout;
import defpackage.d4;
import defpackage.fu;
import defpackage.g7;
import defpackage.l4;
import defpackage.nl;
import defpackage.ol;
import defpackage.r0;
import defpackage.r3;
import defpackage.t5t;
import defpackage.y3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 J2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010G\u001a\u00020\u000b¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0013\u001a\u00020\u0012J,\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J4\u0010!\u001a\u00020\u00022\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001eø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001a\u00020\u0002J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u0016J/\u0010(\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u0016H\u0007J\"\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ$\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001aJ$\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020.J$\u00100\u001a\u0004\u0018\u00010\b2\u0006\u00101\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020.J\u0006\u00103\u001a\u000202J\u0006\u00105\u001a\u000204R\u001b\u0010\u0017\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R,\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0;0:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00120@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR7\u0010E\u001a \b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/a;", "Ly3;", "", "init", "Lm4;", com.xiaomi.onetrack.api.b.I, "onReceive", "(Lm4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr3;", "channelApi", "setChannelApi", "Lg7;", "handler", "registerDeviceRequestHandler", "unregisterDeviceRequestHandler", "Lnl;", "request", "Lol;", "sendRequest", "", RnReportConst.ApiReport.PARAM_MODULE, "", "isOneTime", "Lkotlin/Function1;", "callback", "registerCallback", "unregisterCallback", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "registerMessageCallback", "(Lkotlin/jvm/functions/Function2;)V", "unregisterMessageCallback", "byteArray", "replyFreq", "sendData", "needTailReply", "sendDataWithResult", "([BIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSendData", "sendWithoutDataResponse", "cmd", "responseCode", "", "timeout", "sendCommand", "bytes", "", "getAddress", "Lo4;", "getChannelVersion", "module$delegate", "Lkotlin/Lazy;", "getModule", "()I", "", "Lkotlinx/coroutines/channels/Channel;", "msgChannels", "Ljava/util/Map;", "getMsgChannels", "()Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "requestList", "Ljava/util/concurrent/ConcurrentHashMap;", "deviceRequestHandler", "messageCallback", "Lkotlin/jvm/functions/Function2;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class a implements y3 {
    public static final long HANDLE_TIMEOUT = 1000;

    @NotNull
    public static final String TAG = "BaseModule";
    public static final long TIMEOUT = 15000;

    @NotNull
    private r3 channelController;

    @NotNull
    private final ConcurrentHashMap<Integer, g7> deviceRequestHandler;

    @Nullable
    private Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> messageCallback;

    /* JADX INFO: renamed from: module$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy module;

    @NotNull
    private final Map<Integer, Channel<byte[]>> msgChannels;

    @NotNull
    private final ConcurrentHashMap<UUID, nl> requestList;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.a$b$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$init$1$1", f = "BaseModule.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0273a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ a u;
            public final /* synthetic */ ChannelResponse v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0273a(a aVar, ChannelResponse channelResponse, Continuation<? super C0273a> continuation) {
                super(2, continuation);
                this.u = aVar;
                this.v = channelResponse;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0273a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0273a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = this.u;
                    ChannelResponse channelResponse = this.v;
                    this.t = 1;
                    if (aVar.onReceive(channelResponse, this) == coroutine_suspended) {
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
            BuildersKt__BuildersKt.runBlocking$default(null, new C0273a(a.this, response, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Object objM886constructorimpl;
            a aVar = a.this;
            try {
                Result.Companion companion = Result.Companion;
                d4 d4Var = (d4) aVar.getClass().getAnnotation(d4.class);
                objM886constructorimpl = Result.m886constructorimpl(Integer.valueOf(d4Var != null ? d4Var.id() : 0));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
                objM886constructorimpl = 0;
            }
            return (Integer) objM886constructorimpl;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule", f = "BaseModule.kt", i = {0, 0, 0, 0}, l = {101}, m = "onReceive$suspendImpl", n = {"$this", "data", "$this$forEach$iv", "request"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class d extends ContinuationImpl {
        public int B;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public int x;
        public int y;
        public /* synthetic */ Object z;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return a.onReceive$suspendImpl(a.this, (byte[]) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$onReceive$4$sendResult$1", f = "BaseModule.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ nl u;
        public final /* synthetic */ byte[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(nl nlVar, byte[] bArr, Continuation<? super e> continuation) {
            super(2, continuation);
            this.u = nlVar;
            this.v = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channelB = this.u.b();
                byte[] bArr = this.v;
                this.t = 1;
                if (channelB.send(bArr, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendCommand$1", f = "BaseModule.kt", i = {}, l = {SportReportBaseParser.ReportType.maxFreq, 227}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ byte[] w;
        public final /* synthetic */ long x;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.a$f$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendCommand$1$1", f = "BaseModule.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0274a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ a u;
            public final /* synthetic */ int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0274a(a aVar, int i, Continuation<? super C0274a> continuation) {
                super(2, continuation);
                this.u = aVar;
                this.v = i;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((C0274a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0274a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.u.getMsgChannels().get(Boxing.boxInt(this.v));
                    if (channel == null) {
                        return null;
                    }
                    this.t = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, byte[] bArr, long j, Continuation<? super f> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = bArr;
            this.x = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return a.this.new f(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            a.this.getMsgChannels().put(Boxing.boxInt(this.v), ChannelKt.Channel$default(-1, null, null, 6, null));
            a aVar = a.this;
            byte[] bArr = this.w;
            this.t = 1;
            obj = a.sendDataWithResult$default(aVar, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            long j = this.x;
            C0274a c0274a = new C0274a(a.this, this.v, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(j, c0274a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lol;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendRequest$1", f = "BaseModule.kt", i = {0}, l = {132}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ol<byte[]>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ nl w;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.a$g$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lol;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$sendRequest$1$response$1", f = "BaseModule.kt", i = {}, l = {133, 138}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0275a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ol<byte[]>>, Object> {
            public int t;
            public final /* synthetic */ a u;
            public final /* synthetic */ nl v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0275a(a aVar, nl nlVar, Continuation<? super C0275a> continuation) {
                super(2, continuation);
                this.u = aVar;
                this.v = nlVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ol<byte[]>> continuation) {
                return ((C0275a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0275a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new fu((byte[]) obj);
                }
                ResultKt.throwOnFailure(obj);
                a aVar = this.u;
                byte[] bytes = this.v.getF28026a().getF34884a();
                boolean e = this.v.getE();
                this.t = 1;
                obj = a.sendDataWithResult$default(aVar, bytes, 0, e, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Failure("Send failed!", 0, 2, null);
                }
                Channel<byte[]> channelB = this.v.b();
                this.t = 2;
                obj = channelB.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new fu((byte[]) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(nl nlVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.w = nlVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ol<byte[]>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = a.this.new g(this.w, continuation);
            gVar.u = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.u;
                a.this.requestList.put(this.w.getD(), this.w);
                long c = this.w.getC();
                C0275a c0275a = new C0275a(a.this, this.w, null);
                this.u = coroutineScope;
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(c, c0275a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Object timeout = (ol) obj;
            if (timeout == null) {
                a aVar = a.this;
                nl nlVar = this.w;
                if (aVar.requestList.contains(nlVar)) {
                    aVar.requestList.remove(nlVar.getD());
                }
                timeout = new Timeout(null, 1, null);
            }
            t5t.d(a.TAG, "Command " + this.w.getF28026a() + " with result " + timeout);
            return timeout;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function1<ChannelResponse, Unit> {
        public static final h t = new h();

        public h() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.BaseModule$syncSendData$1", f = "BaseModule.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ byte[] v;
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr, int i, Continuation<? super i> continuation) {
            super(2, continuation);
            this.v = bArr;
            this.w = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return a.this.new i(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                byte[] bArr = this.v;
                int i2 = this.w;
                this.t = 1;
                obj = a.sendDataWithResult$default(aVar, bArr, i2, false, this, 4, null);
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

    public a(@NotNull r3 channelController) {
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.channelController = channelController;
        this.module = LazyKt__LazyJVMKt.lazy(new c());
        this.msgChannels = new LinkedHashMap();
        this.requestList = new ConcurrentHashMap<>();
        this.deviceRequestHandler = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ Object onReceive$suspendImpl(a aVar, ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> function2 = aVar.messageCallback;
        if (function2 == null) {
            Object objOnReceive = aVar.onReceive(channelResponse.getData(), continuation);
            return objOnReceive == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnReceive : Unit.INSTANCE;
        }
        Object objInvoke = function2.invoke(channelResponse.getData(), continuation);
        return objInvoke == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    public static /* synthetic */ void registerCallback$default(a aVar, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerCallback");
        }
        if ((i3 & 2) != 0) {
            z = false;
        }
        aVar.registerCallback(i2, z, function1);
    }

    public static /* synthetic */ byte[] sendCommand$default(a aVar, int i2, int i3, long j, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
        }
        if ((i4 & 2) != 0) {
            i3 = i2;
        }
        if ((i4 & 4) != 0) {
            j = 15000;
        }
        return aVar.sendCommand(i2, i3, j);
    }

    public static /* synthetic */ void sendData$default(a aVar, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendData");
        }
        if ((i3 & 2) != 0) {
            i2 = 16;
        }
        aVar.sendData(bArr, i2);
    }

    public static /* synthetic */ Object sendDataWithResult$default(a aVar, byte[] bArr, int i2, boolean z, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDataWithResult");
        }
        if ((i3 & 2) != 0) {
            i2 = 16;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return aVar.sendDataWithResult(bArr, i2, z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendWithoutDataResponse$default(a aVar, byte[] bArr, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWithoutDataResponse");
        }
        if ((i2 & 2) != 0) {
            function1 = h.t;
        }
        aVar.sendWithoutDataResponse(bArr, function1);
    }

    public static /* synthetic */ boolean syncSendData$default(a aVar, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncSendData");
        }
        if ((i3 & 2) != 0) {
            i2 = 16;
        }
        return aVar.syncSendData(bArr, i2);
    }

    @NotNull
    public final String getAddress() {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(this.channelController.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = "";
        }
        return (String) objM886constructorimpl;
    }

    @NotNull
    public final ChannelVersion getChannelVersion() {
        return this.channelController.getVersion();
    }

    public int getModule() {
        return ((Number) this.module.getValue()).intValue();
    }

    @NotNull
    public final Map<Integer, Channel<byte[]>> getMsgChannels() {
        return this.msgChannels;
    }

    public void init() {
        registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public void onError(@NotNull ChannelResponse channelResponse) {
        y3.a.a(this, channelResponse);
    }

    public void onProgress(@NotNull Progress progress) {
        y3.a.a(this, progress);
    }

    @Nullable
    public Object onReceive(@NotNull ChannelResponse channelResponse, @NotNull Continuation<? super Unit> continuation) {
        return onReceive$suspendImpl(this, channelResponse, continuation);
    }

    public void onSuccess(@NotNull byte[] bArr) {
        y3.a.a(this, bArr);
    }

    public final void registerCallback(int module, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.channelController.a(module, isOneTime, callback);
    }

    public final void registerDeviceRequestHandler(@NotNull g7 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        int iHashCode = handler.hashCode();
        if (this.deviceRequestHandler.containsKey(Integer.valueOf(iHashCode))) {
            return;
        }
        this.deviceRequestHandler.put(Integer.valueOf(iHashCode), handler);
    }

    public final void registerMessageCallback(@NotNull Function2<? super byte[], ? super Continuation<? super Unit>, ? extends Object> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.messageCallback = callback;
    }

    @Nullable
    public final byte[] sendCommand(int cmd, int responseCode, long timeout) {
        return sendCommand(new byte[]{(byte) cmd}, responseCode, timeout);
    }

    public final void sendData(@NotNull byte[] byteArray, int replyFreq) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.channelController.a(new l4(getModule(), byteArray, replyFreq, 0, false, 0, null, false, 248, null));
    }

    @Nullable
    public final Object sendDataWithResult(@NotNull byte[] bArr, int i2, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.channelController.a(new l4(getModule(), bArr, i2, 0, false, 0, null, z, 120, null), continuation);
    }

    @NotNull
    public final ol<byte[]> sendRequest(@NotNull nl request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (ol) BuildersKt__BuildersKt.runBlocking$default(null, new g(request, null), 1, null);
    }

    public final void sendWithoutDataResponse(@NotNull byte[] byteArray, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(callback, "callback");
        registerCallback(getModule(), true, callback);
        this.channelController.a(new l4(getModule(), byteArray, 0, 0, false, 0, null, false, 252, null));
    }

    public final void setChannelApi(@NotNull r3 channelApi) {
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.channelController = channelApi;
        init();
    }

    public final boolean syncSendData(@NotNull byte[] byteArray, int replyFreq) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new i(byteArray, replyFreq, null), 1, null)).booleanValue();
    }

    public final void unregisterCallback(int module) {
        this.channelController.a(module);
    }

    public final void unregisterDeviceRequestHandler(@NotNull g7 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        int iHashCode = handler.hashCode();
        if (this.deviceRequestHandler.containsKey(Integer.valueOf(iHashCode))) {
            this.deviceRequestHandler.remove(Integer.valueOf(iHashCode));
        }
    }

    public final void unregisterMessageCallback() {
        this.messageCallback = null;
    }

    public static /* synthetic */ byte[] sendCommand$default(a aVar, byte[] bArr, int i2, long j, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
        }
        if ((i3 & 2) != 0) {
            i2 = r0.a(ArraysKt___ArraysKt.first(bArr));
        }
        if ((i3 & 4) != 0) {
            j = 15000;
        }
        return aVar.sendCommand(bArr, i2, j);
    }

    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        return onReceive$suspendImpl(this, bArr, continuation);
    }

    @Nullable
    public final byte[] sendCommand(@NotNull byte[] bytes, int responseCode, long timeout) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new f(responseCode, bytes, timeout, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:43:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:43:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c5 -> B:43:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ea -> B:39:0x00f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object onReceive$suspendImpl(com.huami.bluetooth.profile.channel.module.a r12, byte[] r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.a.onReceive$suspendImpl(com.huami.bluetooth.profile.channel.module.a, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void sendData(@NotNull byte[] byteArray, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(callback, "callback");
        registerCallback(getModule(), true, callback);
        this.channelController.a(new l4(getModule(), byteArray, 0, 0, false, 0, null, false, 252, null));
    }
}
