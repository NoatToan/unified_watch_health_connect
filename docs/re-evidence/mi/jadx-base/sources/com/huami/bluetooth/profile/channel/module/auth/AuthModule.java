package com.huami.bluetooth.profile.channel.module.auth;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.AuthResult;
import defpackage.AuthorizationProtocolInfo;
import defpackage.ChannelResponse;
import defpackage.RequestAuthResponse;
import defpackage.StartAuthResponse;
import defpackage.mp;
import defpackage.p0;
import defpackage.r0;
import defpackage.r3;
import defpackage.rm;
import defpackage.t5t;
import defpackage.tet;
import defpackage.w2;
import defpackage.y;
import defpackage.y2;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "init", "Lv0;", "getAuthorizationInfo", "", "apiLevel", "", "keyBytes", "Lut;", "startLocalBinding", CommonConstants.KEY_PUB_KEY, "startCloudBiding", MiTsmConstants.KEY_SIGNATURE, "Lkotlin/Function0;", "callback", "Lt0;", "verifySignature", "Llq;", "requestAuth", "requestDeAuth", "requestRandomNumber", "cipher", "authorize", "deAuthorize", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class AuthModule extends a implements CoroutineScope {
    public static final int ANDROID_PLATFORM = 2;
    public static final int AUTH_MODULE_ID_L = 128;
    private static final int CMD_AUTHORIZE = 5;
    public static final int CMD_DE_AUTHORIZE = 7;
    private static final int CMD_QUERY_VERSION = 0;
    private static final int CMD_REQUEST_DE_AUTHORIZE = 6;
    public static final int CMD_REQUEST_RANDOM_NUMBER = 4;
    private static final int CMD_RESPONSE_PREFIX = 16;
    public static final int CMD_START_CLOUD_BINDING = 2;
    private static final int CMD_START_LOCAL_BINDING = 1;
    private static final long CMD_TIMEOUT = 10000;
    private static final int CMD_VERIFY_SIGNATURE = 3;
    public static final int CODE_SUCCESS = 1;
    public static final int CODE_UNKNOWN = 0;
    public static final int ECDH_PUB_KEY_LEN = 48;
    public static final int PUBLIC_KEY_LENGTH = 16;
    public static final int RANDOM_NUMBER_LENGTH = 16;

    @NotNull
    private static final String TAG = "AuthModule";
    private static final long WAIT_KNOCK_TIMEOUT = 30000;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$init$1$1", f = "AuthModule.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {TSMAuthContants.PARAM_PAYLOAD}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object t;
            public int u;
            public final /* synthetic */ ChannelResponse v;
            public final /* synthetic */ AuthModule w;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.auth.AuthModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$init$1$1$sendResult$1", f = "AuthModule.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0278a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ AuthModule u;
                public final /* synthetic */ Integer v;
                public final /* synthetic */ byte[] w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0278a(AuthModule authModule, Integer num, byte[] bArr, Continuation<? super C0278a> continuation) {
                    super(2, continuation);
                    this.u = authModule;
                    this.v = num;
                    this.w = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0278a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0278a(this.u, this.v, this.w, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.u.getMsgChannels().get(this.v);
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
            public a(ChannelResponse channelResponse, AuthModule authModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.v = channelResponse;
                this.w = authModule;
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
                return new a(this.v, this.w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                byte[] bArr;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.u;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.v.getData().length == 0) {
                        t5t.d(AuthModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    if ((ArraysKt___ArraysKt.first(this.v.getData()) & 255) != 16) {
                        t5t.d(AuthModule.TAG, "Unrecognizable response");
                        return Unit.INSTANCE;
                    }
                    Integer numA = r0.a(this.v.getData());
                    if (numA == null) {
                        t5t.d(AuthModule.TAG, "Response no corresponding command");
                        return Unit.INSTANCE;
                    }
                    byte[] bArrB = y2.b(this.v.getData());
                    C0278a c0278a = new C0278a(this.w, numA, bArrB, null);
                    this.t = bArrB;
                    this.u = 1;
                    obj = TimeoutKt.withTimeoutOrNull(1000L, c0278a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bArr = bArrB;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr = (byte[]) this.t;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Unit) obj) == null) {
                    t5t.d(AuthModule.TAG, "Enqueue response failed:" + y2.c(bArr));
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, AuthModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lt0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$verifySignature$1", f = "AuthModule.kt", i = {}, l = {119, 123}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AuthResult>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ byte[] w;
        public final /* synthetic */ Function0<Unit> x;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$verifySignature$1$1", f = "AuthModule.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ AuthModule u;
            public final /* synthetic */ int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthModule authModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = authModule;
                this.v = i;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
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
                    Channel channel = (Channel) this.u.getMsgChannels().get(Boxing.boxInt(this.v));
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
        public d(int i, byte[] bArr, Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = bArr;
            this.x = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super AuthResult> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AuthModule.this.new d(this.v, this.w, this.x, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:25:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x0096  */
        /* JADX WARN: Code duplicated, block: B:28:0x009c  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer numBoxInt;
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
                byte[] bArr = (byte[]) obj;
                numBoxInt = bArr != null ? Boxing.boxInt(r0.a(ArraysKt___ArraysKt.first(bArr))) : null;
                if (numBoxInt == null) {
                    return new AuthResult(p0.OTHER.getT(), y.VERIFY_NOT_RESPONSE);
                }
                return numBoxInt.intValue() == 1 ? new AuthResult(1, rm.u) : new AuthResult(numBoxInt.intValue(), new mp(numBoxInt.intValue()));
            }
            ResultKt.throwOnFailure(obj);
            AuthModule.this.getMsgChannels().put(Boxing.boxInt(this.v), ChannelKt.Channel$default(0, null, null, 7, null));
            AuthModule authModule = AuthModule.this;
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{3}, this.w);
            this.t = 1;
            obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(authModule, bArrPlus, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return new AuthResult(p0.OPERATION_FAILED.getT(), y.VERIFY_SIGNATURE_FAIL);
            }
            Function0<Unit> function0 = this.x;
            if (function0 != null) {
                function0.invoke();
            }
            a aVar = new a(AuthModule.this, this.v, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(30000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            byte[] bArr2 = (byte[]) obj;
            if (bArr2 != null) {
            }
            if (numBoxInt == null) {
                return new AuthResult(p0.OTHER.getT(), y.VERIFY_NOT_RESPONSE);
            }
            if (numBoxInt.intValue() == 1) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthResult verifySignature$default(AuthModule authModule, byte[] bArr, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifySignature");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return authModule.verifySignature(bArr, function0);
    }

    @NotNull
    public final AuthResult authorize(@NotNull byte[] cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{5}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Empty response for authorize");
            return new AuthResult(0, y.AUTHORIZE_FAIL);
        }
        int iA = r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        return iA == 1 ? new AuthResult(1, rm.u) : new AuthResult(iA, new mp(iA));
    }

    public int deAuthorize(@NotNull byte[] cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{6}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null && bArrSendCommand$default.length != 0) {
            return r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        }
        t5t.d(TAG, "Empty response for de authorize");
        return 0;
    }

    @Nullable
    public final AuthorizationProtocolInfo getAuthorizationInfo() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 0, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null) {
            t5t.d(TAG, "No response while get version");
            return null;
        }
        if (ArraysKt___ArraysKt.first(bArrSendCommand$default) != 1) {
            return null;
        }
        return AuthorizationProtocolInfo.d.a(y2.a(bArrSendCommand$default));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 128;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getChannelModule(), false, new b(), 2, null);
    }

    @Nullable
    public RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, bArrR), new byte[]{2}), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Empty response for random number request");
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC == 1) {
                return new RequestAuthResponse(w2Var.a(16), new byte[0]);
            }
            t5t.d(TAG, "Request random number error:" + iC);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d(TAG, String.valueOf(thM889exceptionOrNullimpl));
            }
            return (RequestAuthResponse) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    @Nullable
    public final byte[] requestDeAuth(int apiLevel) {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, new byte[]{6}, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Empty response for random number request");
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC == 1) {
                return w2Var.a(16);
            }
            t5t.d(TAG, "Request random number error:" + iC);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d(TAG, String.valueOf(thM889exceptionOrNullimpl));
            }
            return (byte[]) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    @Nullable
    public final byte[] requestRandomNumber(int apiLevel) {
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, bArrR), new byte[]{2}), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Empty response for random number request");
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC == 1) {
                return w2Var.a(16);
            }
            t5t.d(TAG, "Request random number error:" + iC);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d(TAG, String.valueOf(thM889exceptionOrNullimpl));
            }
            return (byte[]) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    @Nullable
    public StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, bArrR), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "Start cloud binding with null response, maybe response timeout");
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC != 1) {
                return new StartAuthResponse(iC, null, null, null, 14, null);
            }
            if (bArrSendCommand$default.length == 33) {
                return new StartAuthResponse(iC, w2Var.a(16), null, w2Var.a(16));
            }
            t5t.d(TAG, "Start cloud bind response length error");
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            return (StartAuthResponse) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    @Nullable
    public final StartAuthResponse startLocalBinding(int apiLevel, @NotNull byte[] keyBytes) {
        Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{1}, bArrR), keyBytes), 0, 30000L, 2, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            return null;
        }
        return new StartAuthResponse(ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255, null, null, null, 14, null);
    }

    @NotNull
    public final AuthResult verifySignature(@NotNull byte[] signature, @Nullable Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        return (AuthResult) BuildersKt__BuildersKt.runBlocking$default(null, new d(3, signature, callback, null), 1, null);
    }
}
