package com.huami.bluetooth.profile.channel.module;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.SimpleParseInterceptor;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
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
@ChannelModule(id = 57)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fR\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PointCategory.INIT, "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "setSmartPlay", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSmartPlay", "factoryReset", "getRebootCount", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "h", "Ljava/util/Map;", "channels", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "i", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "innerInterceptor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeadPhoneModule extends BaseModule implements CoroutineScope {
    private static final int j = 57;

    @NotNull
    private static final String k = "HeadPhoneModule";
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 6;
    private static final int s = 7;
    private static final int t = 8;
    private static final int u = 9;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final long z = 15000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SimpleParseInterceptor innerInterceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {}, l = {131, 136}, m = "factoryReset", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.factoryReset(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$factoryReset$response$1", f = "HeadPhoneModule.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(7));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {}, l = {153, 158}, m = "getRebootCount", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.getRebootCount(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$getRebootCount$response$1", f = "HeadPhoneModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(9));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {}, l = {106, 111}, m = "getSmartPlay", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.getSmartPlay(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$getSmartPlay$response$1", f = "HeadPhoneModule.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(5));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$init$1$1", f = "HeadPhoneModule.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ HeadPhoneModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, HeadPhoneModule headPhoneModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = headPhoneModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    try {
                        this.c.innerInterceptor.onReceive(this.b.getData());
                    } catch (Exception e) {
                        Debug.fi(HeadPhoneModule.k, Intrinsics.stringPlus("interceptor.onReceive error ", e.getMessage()));
                    }
                    Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.b.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.b;
                        this.a = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
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

        public g() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            HeadPhoneModule headPhoneModule = HeadPhoneModule.this;
            kotlinx.coroutines.e.f(headPhoneModule, null, null, new a(channelResponse, headPhoneModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Job> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {}, l = {60, 65}, m = "queryVersion", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$queryVersion$response$1", f = "HeadPhoneModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(1));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0, 0}, l = {DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.sendData((byte[]) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {}, l = {84, 89}, m = "setSmartPlay", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.setSmartPlay(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$setSmartPlay$response$1", f = "HeadPhoneModule.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(3));
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
            return (ChannelResponse) obj;
        }
    }

    public HeadPhoneModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(h.a);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new SimpleParseInterceptor(k, null, 2, null);
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        k kVar;
        HeadPhoneModule headPhoneModule;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object objSendDataWithResult$default = kVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar2.e;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.onSend(bArr);
            } catch (Exception e2) {
                Debug.fi(k, Intrinsics.stringPlus("interceptor.onSend error ", e2.getMessage()));
            }
            kVar2.a = this;
            kVar2.b = bArr;
            kVar2.e = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, kVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            headPhoneModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) kVar2.b;
            headPhoneModule = (HeadPhoneModule) kVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            SimpleParseInterceptor simpleParseInterceptor = headPhoneModule.innerInterceptor;
            if (!zBooleanValue) {
                z2 = false;
            }
            simpleParseInterceptor.onFinishSend(bArr, z2);
        } catch (Exception e3) {
            Debug.fi(k, Intrinsics.stringPlus("interceptor.onFinishSend error ", e3.getMessage()));
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object factoryReset(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objSendData = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.d;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) aVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(k, Intrinsics.stringPlus("factory reset response: ", channelResponse));
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            data = channelResponse.getData();
            if (data.length == 2 && data[0] == 7 && data[1] == 0) {
                z2 = true;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(k, "factory reset");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(7))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(7), ChannelKt.Channel$default(0, 1, null));
        }
        aVar.a = this;
        aVar.d = 1;
        objSendData = sendData(new byte[]{6}, aVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write factory reset cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        b bVar = headPhoneModule.new b(null);
        aVar.a = null;
        aVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, bVar, aVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(k, Intrinsics.stringPlus("factory reset response: ", channelResponse));
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        data = channelResponse.getData();
        if (data.length == 2) {
            z2 = true;
        }
        return Boxing.boxBoolean(z2);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 57;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRebootCount(@NotNull Continuation<? super Integer> continuation) {
        c cVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendData = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.d;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) cVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(k, Intrinsics.stringPlus("get reboot count response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data.length == 6 && data[0] == 9 && data[1] == 0) {
                z2 = true;
            }
            if (!Boxing.boxBoolean(z2).booleanValue()) {
                data = null;
            }
            if (data == null) {
                return null;
            }
            return Boxing.boxInt(GattUtils.bytesToInt(data, 2, 4));
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(k, "get reboot count");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(9))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(9), ChannelKt.Channel$default(0, 1, null));
        }
        cVar.a = this;
        cVar.d = 1;
        objSendData = sendData(new byte[]{8}, cVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write get reboot count cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        d dVar = headPhoneModule.new d(null);
        cVar.a = null;
        cVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, dVar, cVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(k, Intrinsics.stringPlus("get reboot count response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data.length == 6) {
            z2 = true;
        }
        if (!Boxing.boxBoolean(z2).booleanValue()) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boxing.boxInt(GattUtils.bytesToInt(data, 2, 4));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSmartPlay(@NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] bArr;
        Boolean boolBoxBoolean;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objSendData = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) eVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(k, Intrinsics.stringPlus("get smart play response: ", channelResponse));
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            byte[] data = channelResponse.getData();
            bArr = Boxing.boxBoolean(data.length != 3 && data[0] == 5 && data[1] == 0).booleanValue() ? data : null;
            if (bArr != null && (boolBoxBoolean = Boxing.boxBoolean(ByteUtilsKt.toBoolean(bArr[2]))) != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(k, "get smart play");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(5))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(5), ChannelKt.Channel$default(0, 1, null));
        }
        eVar.a = this;
        eVar.d = 1;
        objSendData = sendData(new byte[]{4}, eVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue2 = ((Boolean) objSendData).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write get smart play cmd result: ", Boxing.boxBoolean(zBooleanValue2)));
        if (!zBooleanValue2) {
            return Boxing.boxBoolean(false);
        }
        f fVar = headPhoneModule.new f(null);
        eVar.a = null;
        eVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, fVar, eVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(k, Intrinsics.stringPlus("get smart play response: ", channelResponse));
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        byte[] data2 = channelResponse.getData();
        if (Boxing.boxBoolean(data2.length != 3 && data2[0] == 5 && data2[1] == 0).booleanValue()) {
        }
        if (bArr != null) {
            zBooleanValue = boolBoxBoolean.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new g(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        i iVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.d = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objSendData = iVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.d;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) iVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(k, Intrinsics.stringPlus("query version response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data.length == 3 && data[0] == 1 && data[1] == 0) {
                z2 = true;
            }
            if (!Boxing.boxBoolean(z2).booleanValue()) {
                data = null;
            }
            if (data == null) {
                return null;
            }
            return Boxing.boxInt(data[2]);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(k, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(1))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(1), ChannelKt.Channel$default(0, 1, null));
        }
        iVar.a = this;
        iVar.d = 1;
        objSendData = sendData(new byte[]{0}, iVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write query version cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        j jVar = headPhoneModule.new j(null);
        iVar.a = null;
        iVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, jVar, iVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(k, Intrinsics.stringPlus("query version response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data.length == 3) {
            z2 = true;
        }
        if (!Boxing.boxBoolean(z2).booleanValue()) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boxing.boxInt(data[2]);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setSmartPlay(boolean z2, @NotNull Continuation<? super Boolean> continuation) {
        l lVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.d = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objSendData = lVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.d;
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) lVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(k, Intrinsics.stringPlus("set smart play response: ", channelResponse));
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            data = channelResponse.getData();
            if (data.length == 2 && data[0] == 3 && data[1] == 0) {
                z3 = true;
            }
            return Boxing.boxBoolean(z3);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(k, "set smart play");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(3))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(3), ChannelKt.Channel$default(0, 1, null));
        }
        byte[] bArr = {2, ByteUtilsKt.toByte(z2)};
        lVar.a = this;
        lVar.d = 1;
        objSendData = sendData(bArr, lVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write set smart play cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        m mVar = headPhoneModule.new m(null);
        lVar.a = null;
        lVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, mVar, lVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(k, Intrinsics.stringPlus("set smart play response: ", channelResponse));
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        data = channelResponse.getData();
        if (data.length == 2) {
            z3 = true;
        }
        return Boxing.boxBoolean(z3);
    }
}
