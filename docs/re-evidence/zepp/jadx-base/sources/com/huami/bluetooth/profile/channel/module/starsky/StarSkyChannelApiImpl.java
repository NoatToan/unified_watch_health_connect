package com.huami.bluetooth.profile.channel.module.starsky;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.tencent.open.SocialConstants;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R(\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApi;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "", "b", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/starsky/IStarSkyDeviceDataReceiver;", SocialConstants.PARAM_RECEIVER, "", "enableRelaxMusic", "(Lcom/huami/bluetooth/profile/channel/module/starsky/IStarSkyDeviceDataReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableRelaxMusic", "Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyModule;", "module", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "c", "Ljava/util/Map;", "channels", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/starsky/IStarSkyDeviceDataReceiver;", "mIStarSkyDeviceDataReceiver", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StarSkyChannelApiImpl implements StarSkyChannelApi, CoroutineScope {

    @NotNull
    private static final String e = "StarSkyChannelApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StarSkyModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<byte[]>> channels = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IStarSkyDeviceDataReceiver mIStarSkyDeviceDataReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$1$1", f = "StarSkyChannelApiImpl.kt", i = {}, l = {41, 44}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0334a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ StarSkyChannelApiImpl c;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$1$1$1", f = "StarSkyChannelApiImpl.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0335a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ StarSkyChannelApiImpl b;
                public final /* synthetic */ int c;
                public final /* synthetic */ byte[] d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0335a(StarSkyChannelApiImpl starSkyChannelApiImpl, int i, byte[] bArr, Continuation<? super C0335a> continuation) {
                    super(2, continuation);
                    this.b = starSkyChannelApiImpl;
                    this.c = i;
                    this.d = bArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0335a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0335a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(this.c));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(this.d);
                        this.a = 1;
                        if (channel.send(bArrSubArrayWithoutFirstElement, this) == coroutine_suspended) {
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
            public C0334a(ChannelResponse channelResponse, StarSkyChannelApiImpl starSkyChannelApiImpl, Continuation<? super C0334a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = starSkyChannelApiImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0334a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0334a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Debug.fi(StarSkyChannelApiImpl.e, Intrinsics.stringPlus("receive data: ", this.b));
                byte[] data = this.b.getData();
                if (data.length == 0) {
                    return Unit.INSTANCE;
                }
                int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(data));
                if (unSignInt != 7) {
                    C0335a c0335a = new C0335a(this.c, unSignInt, data, null);
                    this.a = 2;
                    if (TimeoutKt.withTimeoutOrNull(500L, c0335a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                StarSkyChannelApiImpl starSkyChannelApiImpl = this.c;
                byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(data);
                this.a = 1;
                if (starSkyChannelApiImpl.b(bArrSubArrayWithoutFirstElement, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            StarSkyChannelApiImpl starSkyChannelApiImpl = StarSkyChannelApiImpl.this;
            kotlinx.coroutines.e.f(starSkyChannelApiImpl, null, null, new C0334a(channelResponse, starSkyChannelApiImpl, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl", f = "StarSkyChannelApiImpl.kt", i = {}, l = {85, 90}, m = "disableRelaxMusic", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return StarSkyChannelApiImpl.this.disableRelaxMusic(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$disableRelaxMusic$result$1", f = "StarSkyChannelApiImpl.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Channel<byte[]> channel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
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
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl", f = "StarSkyChannelApiImpl.kt", i = {}, l = {67, 72}, m = "enableRelaxMusic", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return StarSkyChannelApiImpl.this.enableRelaxMusic(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$enableRelaxMusic$result$1", f = "StarSkyChannelApiImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Channel<byte[]> channel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
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
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Job> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$onReceiveDeviceData$2", f = "StarSkyChannelApiImpl.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ StarSkyChannelApiImpl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, StarSkyChannelApiImpl starSkyChannelApiImpl, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = starSkyChannelApiImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArr = {8, (byte) this.b, 1};
                StarSkyModule starSkyModule = this.c.module;
                this.a = 1;
                if (BaseModule.sendDataWithResult$default(starSkyModule, bArr, 0, false, this, 6, null) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl", f = "StarSkyChannelApiImpl.kt", i = {}, l = {55, 60}, m = "queryVersion", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return StarSkyChannelApiImpl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl$queryVersion$2", f = "StarSkyChannelApiImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Channel<byte[]> channel, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
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
            return obj;
        }
    }

    public StarSkyChannelApiImpl(@NotNull StarSkyModule starSkyModule) {
        this.module = starSkyModule;
        starSkyModule.setReceiveCallback(new a());
    }

    private final Job a() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized Object b(byte[] bArr, Continuation<? super Unit> continuation) {
        if (bArr.length < 3) {
            Debug.fi(e, "receive device data length must >= 3");
            return Unit.INSTANCE;
        }
        int unSignInt = AuthModuleKt.toUnSignInt(bArr[0]);
        Debug.fi(e, Intrinsics.stringPlus("type:", Boxing.boxInt(unSignInt)));
        byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(bArr);
        int iBytesToIntBE = GattUtils.bytesToIntBE(bArrSubArrayWithoutFirstElement, 0, 2);
        byte[] bArrSubArrayWithoutFirstTwoElement = ByteArrayKt.subArrayWithoutFirstTwoElement(bArrSubArrayWithoutFirstElement);
        if (iBytesToIntBE != bArrSubArrayWithoutFirstTwoElement.length) {
            Debug.fi(e, "receive device data length not equal");
            Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this.module, new byte[]{8, (byte) unSignInt, 0}, 0, false, continuation, 6, null);
            if (objSendDataWithResult$default == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                return objSendDataWithResult$default;
            }
            return Unit.INSTANCE;
        }
        Unit unit = null;
        kotlinx.coroutines.e.f(this, null, null, new g(unSignInt, this, null), 3, null);
        IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver = this.mIStarSkyDeviceDataReceiver;
        if (iStarSkyDeviceDataReceiver != null) {
            iStarSkyDeviceDataReceiver.onReceiveData(unSignInt, bArrSubArrayWithoutFirstTwoElement);
            unit = Unit.INSTANCE;
        }
        if (unit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            return unit;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApi
    @Nullable
    public Object disableRelaxMusic(@NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        StarSkyChannelApiImpl starSkyChannelApiImpl;
        Channel<byte[]> channel;
        StarSkyChannelApiImpl starSkyChannelApiImpl2;
        byte[] bArr;
        Byte bBoxByte;
        boolean z;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeoutOrNull = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) bVar.b;
                starSkyChannelApiImpl = (StarSkyChannelApiImpl) bVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                starSkyChannelApiImpl2 = (StarSkyChannelApiImpl) bVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bArr = (byte[]) objWithTimeoutOrNull;
            if (bArr == null && (bBoxByte = Boxing.boxByte(bArr[0])) != null && AuthModuleKt.toUnSignInt(bBoxByte.byteValue()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return Boxing.boxBoolean(false);
            }
            starSkyChannelApiImpl2.mIStarSkyDeviceDataReceiver = null;
            return Boxing.boxBoolean(true);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        this.channels.put(Boxing.boxInt(6), channelChannel$default);
        StarSkyModule starSkyModule = this.module;
        bVar.a = this;
        bVar.b = channelChannel$default;
        bVar.e = 1;
        Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(starSkyModule, new byte[]{5}, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        starSkyChannelApiImpl = this;
        channel = channelChannel$default;
        objWithTimeoutOrNull = objSendDataWithResult$default;
        if (!((Boolean) objWithTimeoutOrNull).booleanValue()) {
            Debug.fi(e, "send disable relax music cmd fail");
            return Boxing.boxBoolean(false);
        }
        c cVar = new c(channel, null);
        bVar.a = starSkyChannelApiImpl;
        bVar.b = null;
        bVar.e = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        starSkyChannelApiImpl2 = starSkyChannelApiImpl;
        bArr = (byte[]) objWithTimeoutOrNull;
        if (bArr == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return Boxing.boxBoolean(false);
        }
        starSkyChannelApiImpl2.mIStarSkyDeviceDataReceiver = null;
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApi
    @Nullable
    public Object enableRelaxMusic(@NotNull IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver2;
        StarSkyChannelApiImpl starSkyChannelApiImpl;
        Channel<byte[]> channel;
        StarSkyChannelApiImpl starSkyChannelApiImpl2;
        IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver3;
        byte[] bArr;
        Byte bBoxByte;
        boolean z;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithTimeoutOrNull = dVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) dVar.c;
                IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver4 = (IStarSkyDeviceDataReceiver) dVar.b;
                starSkyChannelApiImpl = (StarSkyChannelApiImpl) dVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                iStarSkyDeviceDataReceiver2 = iStarSkyDeviceDataReceiver4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iStarSkyDeviceDataReceiver3 = (IStarSkyDeviceDataReceiver) dVar.b;
                starSkyChannelApiImpl2 = (StarSkyChannelApiImpl) dVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bArr = (byte[]) objWithTimeoutOrNull;
            if (bArr == null && (bBoxByte = Boxing.boxByte(bArr[0])) != null && AuthModuleKt.toUnSignInt(bBoxByte.byteValue()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return Boxing.boxBoolean(false);
            }
            starSkyChannelApiImpl2.mIStarSkyDeviceDataReceiver = iStarSkyDeviceDataReceiver3;
            return Boxing.boxBoolean(true);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        this.channels.put(Boxing.boxInt(4), channelChannel$default);
        StarSkyModule starSkyModule = this.module;
        dVar.a = this;
        iStarSkyDeviceDataReceiver2 = iStarSkyDeviceDataReceiver;
        dVar.b = iStarSkyDeviceDataReceiver2;
        dVar.c = channelChannel$default;
        dVar.f = 1;
        Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(starSkyModule, new byte[]{3}, 0, false, dVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        starSkyChannelApiImpl = this;
        channel = channelChannel$default;
        objWithTimeoutOrNull = objSendDataWithResult$default;
        if (!((Boolean) objWithTimeoutOrNull).booleanValue()) {
            Debug.fi(e, "send enable relax music cmd fail");
            return Boxing.boxBoolean(false);
        }
        e eVar = new e(channel, null);
        dVar.a = starSkyChannelApiImpl;
        dVar.b = iStarSkyDeviceDataReceiver2;
        dVar.c = null;
        dVar.f = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, eVar, dVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        starSkyChannelApiImpl2 = starSkyChannelApiImpl;
        iStarSkyDeviceDataReceiver3 = iStarSkyDeviceDataReceiver2;
        bArr = (byte[]) objWithTimeoutOrNull;
        if (bArr == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return Boxing.boxBoolean(false);
        }
        starSkyChannelApiImpl2.mIStarSkyDeviceDataReceiver = iStarSkyDeviceDataReceiver3;
        return Boxing.boxBoolean(true);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        h hVar;
        Channel<byte[]> channel;
        byte[] bArr;
        Byte bBoxByte;
        Integer numBoxInt;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.d = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objSendDataWithResult$default = hVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.d;
        int iIntValue = -1;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) hVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            bArr = (byte[]) objSendDataWithResult$default;
            if (bArr != null && (bBoxByte = Boxing.boxByte(bArr[0])) != null && (numBoxInt = Boxing.boxInt(AuthModuleKt.toUnSignInt(bBoxByte.byteValue()))) != null) {
                iIntValue = numBoxInt.intValue();
            }
            return Boxing.boxInt(iIntValue);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        this.channels.put(Boxing.boxInt(2), channelChannel$default);
        StarSkyModule starSkyModule = this.module;
        hVar.a = channelChannel$default;
        hVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(starSkyModule, new byte[]{1}, 0, false, hVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            Debug.fi(e, "send query version cmd fail");
            return Boxing.boxInt(-1);
        }
        i iVar = new i(channel, null);
        hVar.a = null;
        hVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, iVar, hVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objSendDataWithResult$default;
        if (bArr != null) {
            iIntValue = numBoxInt.intValue();
        }
        return Boxing.boxInt(iIntValue);
    }
}
