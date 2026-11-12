package com.huami.bluetooth.profile.channel.module.auth;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.AuthErrorCode;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0016R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "getAuthorizationInfo", "", "apiLevel", "", "keyBytes", "Lcom/huami/bluetooth/profile/channel/module/auth/StartAuthResponse;", "startLocalBinding", "pubKey", "startCloudBiding", "signature", "Lkotlin/Function0;", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "verifySignature", "Lcom/huami/bluetooth/profile/channel/module/auth/RequestAuthResponse;", "requestAuth", "requestDeAuth", "requestRandomNumber", "cipher", "authorize", "deAuthorize", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "getModule", "()I", "module", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class AuthModule extends BaseModule implements CoroutineScope {
    public static final int ANDROID_PLATFORM = 2;
    public static final int AUTH_MODULE_ID_L = 128;
    public static final int CMD_DE_AUTHORIZE = 7;
    public static final int CMD_REQUEST_RANDOM_NUMBER = 4;
    public static final int CMD_START_CLOUD_BINDING = 2;
    public static final int CODE_SUCCESS = 1;
    public static final int CODE_UNKNOWN = 0;
    public static final int ECDH_PUB_KEY_LEN = 48;
    public static final int PUBLIC_KEY_LENGTH = 16;
    public static final int RANDOM_NUMBER_LENGTH = 16;

    @NotNull
    private static final String h = "AuthModule";
    private static final int i = 16;
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 3;
    private static final int m = 5;
    private static final int n = 6;
    private static final long o = 10000;
    private static final long p = 30000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.auth.AuthModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$init$1$1", f = "AuthModule.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"payload"}, s = {"L$0"})
        public static final class C0321a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ ChannelResponse c;
            public final /* synthetic */ AuthModule d;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.auth.AuthModule$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$init$1$1$sendResult$1", f = "AuthModule.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0322a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ AuthModule b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ byte[] d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0322a(AuthModule authModule, Integer num, byte[] bArr, Continuation<? super C0322a> continuation) {
                    super(2, continuation);
                    this.b = authModule;
                    this.c = num;
                    this.d = bArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0322a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0322a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.b.getMsgChannels().get(this.c);
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
            public C0321a(ChannelResponse channelResponse, AuthModule authModule, Continuation<? super C0321a> continuation) {
                super(2, continuation);
                this.c = channelResponse;
                this.d = authModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0321a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0321a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                byte[] bArr;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.c.getData().length == 0) {
                        Debug.fi(AuthModule.h, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    if ((ArraysKt___ArraysKt.first(this.c.getData()) & 255) != 16) {
                        Debug.fi(AuthModule.h, "Unrecognizable response");
                        return Unit.INSTANCE;
                    }
                    Integer numSecond = AuthModuleKt.second(this.c.getData());
                    if (numSecond == null) {
                        Debug.fi(AuthModule.h, "Response no corresponding command");
                        return Unit.INSTANCE;
                    }
                    byte[] bArrSubArrayWithoutFirstTwoElement = ByteArrayKt.subArrayWithoutFirstTwoElement(this.c.getData());
                    C0322a c0322a = new C0322a(this.d, numSecond, bArrSubArrayWithoutFirstTwoElement, null);
                    this.a = bArrSubArrayWithoutFirstTwoElement;
                    this.b = 1;
                    obj = TimeoutKt.withTimeoutOrNull(1000L, c0322a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bArr = bArrSubArrayWithoutFirstTwoElement;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr = (byte[]) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Unit) obj) == null) {
                    Debug.fi(AuthModule.h, Intrinsics.stringPlus("Enqueue response failed:", ByteArrayKt.toHexString(bArr)));
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            d.b(null, new C0321a(channelResponse, AuthModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$verifySignature$1", f = "AuthModule.kt", i = {}, l = {119, 123}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AuthResult>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ Function0<Unit> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.auth.AuthModule$verifySignature$1$1", f = "AuthModule.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ AuthModule b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthModule authModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = authModule;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.a = 1;
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
        public c(int i, byte[] bArr, Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = bArr;
            this.e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AuthModule.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super AuthResult> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0093  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:34:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            byte[] bArr;
            Byte bBoxByte;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Integer numBoxInt = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bArr = (byte[]) obj;
                if (bArr != null && (bBoxByte = Boxing.boxByte(ArraysKt___ArraysKt.first(bArr))) != null) {
                    numBoxInt = Boxing.boxInt(AuthModuleKt.toUnSignInt(bBoxByte.byteValue()));
                }
                if (numBoxInt == null) {
                    return new AuthResult(AuthErrorCode.OTHER.getCode(), AppAuthError.VERIFY_NOT_RESPONSE);
                }
                return numBoxInt.intValue() == 1 ? new AuthResult(1, NewProtocolSuccess.INSTANCE) : new AuthResult(numBoxInt.intValue(), new ProtocolAuthError(numBoxInt.intValue()));
            }
            ResultKt.throwOnFailure(obj);
            AuthModule.this.getMsgChannels().put(Boxing.boxInt(this.c), ChannelKt.Channel$default(0, 1, null));
            AuthModule authModule = AuthModule.this;
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{3}, this.d);
            this.a = 1;
            obj = BaseModule.sendDataWithResult$default(authModule, bArrPlus, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return new AuthResult(AuthErrorCode.OPERATION_FAILED.getCode(), AppAuthError.VERIFY_SIGNATURE_FAIL);
            }
            Function0<Unit> function0 = this.e;
            if (function0 != null) {
                function0.invoke();
            }
            a aVar = new a(AuthModule.this, this.c, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(30000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            bArr = (byte[]) obj;
            if (bArr != null) {
                numBoxInt = Boxing.boxInt(AuthModuleKt.toUnSignInt(bBoxByte.byteValue()));
            }
            if (numBoxInt == null) {
                return new AuthResult(AuthErrorCode.OTHER.getCode(), AppAuthError.VERIFY_NOT_RESPONSE);
            }
            if (numBoxInt.intValue() == 1) {
            }
        }
    }

    public AuthModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthResult verifySignature$default(AuthModule authModule, byte[] bArr, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifySignature");
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        return authModule.verifySignature(bArr, function0);
    }

    @NotNull
    public final AuthResult authorize(@NotNull byte[] cipher) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{5}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default));
                return unSignInt == 1 ? new AuthResult(1, NewProtocolSuccess.INSTANCE) : new AuthResult(unSignInt, new ProtocolAuthError(unSignInt));
            }
        }
        Debug.fi(h, "Empty response for authorize");
        return new AuthResult(0, AppAuthError.AUTHORIZE_FAIL);
    }

    public int deAuthorize(@NotNull byte[] cipher) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{6}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                return AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default));
            }
        }
        Debug.fi(h, "Empty response for de authorize");
        return 0;
    }

    @Nullable
    public final AuthorizationProtocolInfo getAuthorizationInfo() {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, 0, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null) {
            Debug.fi(h, "No response while get version");
            return null;
        }
        if (ArraysKt___ArraysKt.first(bArrSendCommand$default) != 1) {
            return null;
        }
        return AuthorizationProtocolInfo.INSTANCE.fromBytes(ByteArrayKt.subArrayWithoutFirstElement(bArrSendCommand$default));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 128;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    @Nullable
    public RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, GattUtils.numberToBytes(apiLevel, 2)), new byte[]{2}), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i2 = bufByteDecoder.readByte();
                    if (i2 == 1) {
                        return new RequestAuthResponse(bufByteDecoder.readBytes(16), new byte[0]);
                    }
                    Debug.fi(h, Intrinsics.stringPlus("Request random number error:", Integer.valueOf(i2)));
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi(h, String.valueOf(thM3848exceptionOrNullimpl));
                    }
                    return (RequestAuthResponse) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        Debug.fi(h, "Empty response for random number request");
        return null;
    }

    @Nullable
    public final byte[] requestDeAuth(int apiLevel) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, new byte[]{6}, 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i2 = bufByteDecoder.readByte();
                    if (i2 == 1) {
                        return bufByteDecoder.readBytes(16);
                    }
                    Debug.fi(h, Intrinsics.stringPlus("Request random number error:", Integer.valueOf(i2)));
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi(h, String.valueOf(thM3848exceptionOrNullimpl));
                    }
                    return (byte[]) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        Debug.fi(h, "Empty response for random number request");
        return null;
    }

    @Nullable
    public final byte[] requestRandomNumber(int apiLevel) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, GattUtils.numberToBytes(apiLevel, 2)), new byte[]{2}), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i2 = bufByteDecoder.readByte();
                    if (i2 == 1) {
                        return bufByteDecoder.readBytes(16);
                    }
                    Debug.fi(h, Intrinsics.stringPlus("Request random number error:", Integer.valueOf(i2)));
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi(h, String.valueOf(thM3848exceptionOrNullimpl));
                    }
                    return (byte[]) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        Debug.fi(h, "Empty response for random number request");
        return null;
    }

    @Nullable
    public StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, GattUtils.numberToBytes(apiLevel, 2)), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i2 = bufByteDecoder.readByte();
                    if (i2 != 1) {
                        return new StartAuthResponse(i2, null, null, null, 14, null);
                    }
                    if (bArrSendCommand$default.length == 33) {
                        return new StartAuthResponse(i2, bufByteDecoder.readBytes(16), null, bufByteDecoder.readBytes(16));
                    }
                    Debug.fi(h, "Start cloud bind response length error");
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    return (StartAuthResponse) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        Debug.fi(h, "Start cloud binding with null response, maybe response timeout");
        return null;
    }

    @Nullable
    public final StartAuthResponse startLocalBinding(int apiLevel, @NotNull byte[] keyBytes) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{1}, GattUtils.numberToBytes(apiLevel, 2)), keyBytes), 0, 30000L, 2, (Object) null);
        if (bArrSendCommand$default == null) {
            return null;
        }
        if (bArrSendCommand$default.length == 0) {
            return null;
        }
        return new StartAuthResponse(ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255, null, null, null, 14, null);
    }

    @NotNull
    public final AuthResult verifySignature(@NotNull byte[] signature, @Nullable Function0<Unit> callback) {
        return (AuthResult) d.b(null, new c(3, signature, callback, null), 1, null);
    }
}
