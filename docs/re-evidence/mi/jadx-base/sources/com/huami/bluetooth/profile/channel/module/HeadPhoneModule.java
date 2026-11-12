package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.c3;
import defpackage.d4;
import defpackage.ks;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fR\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "init", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "setSmartPlay", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSmartPlay", TSMAuthContants.PARAM_FACTORY_RESET, "getRebootCount", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 57)
public final class HeadPhoneModule extends a implements CoroutineScope {
    private static final int CODE_INVALID_PARAMETER = 1;
    private static final int CODE_INVALID_STATE = 3;
    private static final int CODE_NOT_SUPPORT_CMD = 2;
    private static final int CODE_RESULT_OK = 0;
    private static final int HEADPHONE = 57;

    @NotNull
    private static final String TAG = "HeadPhoneModule";
    private static final long TIMEOUT = 15000;
    private static final int TYPE_FACTORY_RESET = 6;
    private static final int TYPE_FACTORY_RESET_RESPONSE = 7;
    private static final int TYPE_QUERY_VERSION = 0;
    private static final int TYPE_QUERY_VERSION_RESPONSE = 1;
    private static final int TYPE_STATISTICS_REBOOT_COUNT = 8;
    private static final int TYPE_STATISTICS_REBOOT_COUNT_RESPONSE = 9;
    private static final int TYPE_SWITCH_READ_SMART_MUSIC = 4;
    private static final int TYPE_SWITCH_READ_SMART_MUSIC_RESPONSE = 5;
    private static final int TYPE_SWITCH_WRITE_SMART_MUSIC = 2;
    private static final int TYPE_SWITCH_WRITE_SMART_MUSIC_RESPONSE = 3;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @NotNull
    private final ks innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0}, l = {131, 136}, m = TSMAuthContants.PARAM_FACTORY_RESET, n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.factoryReset(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$factoryReset$response$1", f = "HeadPhoneModule.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(7));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0}, l = {153, 158}, m = "getRebootCount", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.getRebootCount(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$getRebootCount$response$1", f = "HeadPhoneModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(9));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0}, l = {106, 111}, m = "getSmartPlay", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.getSmartPlay(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$getSmartPlay$response$1", f = "HeadPhoneModule.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(5));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$init$1$1", f = "HeadPhoneModule.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ HeadPhoneModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, HeadPhoneModule headPhoneModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = headPhoneModule;
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
                        return Unit.INSTANCE;
                    }
                    try {
                        this.v.innerInterceptor.a(this.u.getData());
                    } catch (Exception e) {
                        t5t.d(HeadPhoneModule.TAG, "interceptor.onReceive error " + e.getMessage());
                    }
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.u.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.u;
                        this.t = 1;
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

        public h() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HeadPhoneModule headPhoneModule = HeadPhoneModule.this;
            BuildersKt__Builders_commonKt.launch$default(headPhoneModule, null, null, new a(it, headPhoneModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<CompletableJob> {
        public static final i t = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0}, l = {60, 65}, m = "queryVersion", n = {"this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$queryVersion$response$1", f = "HeadPhoneModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(1));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0, 0}, l = {178}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class l extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.sendData((byte[]) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule", f = "HeadPhoneModule.kt", i = {0}, l = {84, 89}, m = "setSmartPlay", n = {"this"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return HeadPhoneModule.this.setSmartPlay(false, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.HeadPhoneModule$setSmartPlay$response$1", f = "HeadPhoneModule.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadPhoneModule.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) HeadPhoneModule.this.channels.get(Boxing.boxInt(3));
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
            return (ChannelResponse) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadPhoneModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(i.t);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new ks(TAG, null, 2, null);
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        l lVar;
        HeadPhoneModule headPhoneModule;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.x = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        l lVar2 = lVar;
        Object objSendDataWithResult$default = lVar2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar2.x;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.b(bArr);
            } catch (Exception e2) {
                t5t.d(TAG, "interceptor.onSend error " + e2.getMessage());
            }
            lVar2.t = this;
            lVar2.u = bArr;
            lVar2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, lVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            headPhoneModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) lVar2.u;
            headPhoneModule = (HeadPhoneModule) lVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            headPhoneModule.innerInterceptor.a(bArr, zBooleanValue);
        } catch (Exception e3) {
            t5t.d(TAG, "interceptor.onFinishSend error " + e3.getMessage());
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object factoryReset(@NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendData = bVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) bVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "factory reset response: " + channelResponse);
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            byte[] data = channelResponse.getData();
            return Boxing.boxBoolean(data.length != 2 && data[0] == 7 && data[1] == 0);
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "factory reset");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(7)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(7), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        bVar.t = this;
        bVar.w = 1;
        objSendData = sendData(new byte[]{6}, bVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write factory reset cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        c cVar = headPhoneModule.new c(null);
        bVar.t = null;
        bVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "factory reset response: " + channelResponse);
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        byte[] data2 = channelResponse.getData();
        return Boxing.boxBoolean(data2.length != 2 && data2[0] == 7 && data2[1] == 0);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 57;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object getRebootCount(@NotNull Continuation<? super Integer> continuation) {
        d dVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.w = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendData = dVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) dVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "get reboot count response: " + channelResponse);
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data.length == 6 || data[0] != 9 || data[1] != 0) {
                data = null;
            }
            if (data != null) {
                return Boxing.boxInt(tet.d(data, 2, 4));
            }
            return null;
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "get reboot count");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(9)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(9), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        dVar.t = this;
        dVar.w = 1;
        objSendData = sendData(new byte[]{8}, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write get reboot count cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        e eVar = headPhoneModule.new e(null);
        dVar.t = null;
        dVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, eVar, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "get reboot count response: " + channelResponse);
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data.length == 6) {
            data = null;
        } else {
            data = null;
        }
        if (data != null) {
            return Boxing.boxInt(tet.d(data, 2, 4));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object getSmartPlay(@NotNull Continuation<? super Boolean> continuation) {
        f fVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.w = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objSendData = fVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fVar.w;
        byte[] bArr = null;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) fVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "get smart play response: " + channelResponse);
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            data = channelResponse.getData();
            if (data.length == 3 && data[0] == 5 && data[1] == 0) {
                bArr = data;
            }
            return Boxing.boxBoolean(bArr == null && c3.a(bArr[2]));
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "get smart play");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(5)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(5), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        fVar.t = this;
        fVar.w = 1;
        objSendData = sendData(new byte[]{4}, fVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write get smart play cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        g gVar = headPhoneModule.new g(null);
        fVar.t = null;
        fVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, gVar, fVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "get smart play response: " + channelResponse);
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        data = channelResponse.getData();
        if (data.length == 3) {
            bArr = data;
        }
        return Boxing.boxBoolean(bArr == null && c3.a(bArr[2]));
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new h(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        j jVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.w = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objSendData = jVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) jVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "query version response: " + channelResponse);
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data.length == 3 || data[0] != 1 || data[1] != 0) {
                data = null;
            }
            if (data != null) {
                return Boxing.boxInt(data[2]);
            }
            return null;
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(1)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(1), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        jVar.t = this;
        jVar.w = 1;
        objSendData = sendData(new byte[]{0}, jVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write query version cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        k kVar = headPhoneModule.new k(null);
        jVar.t = null;
        jVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "query version response: " + channelResponse);
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data.length == 3) {
            data = null;
        } else {
            data = null;
        }
        if (data != null) {
            return Boxing.boxInt(data[2]);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object setSmartPlay(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        HeadPhoneModule headPhoneModule;
        ChannelResponse channelResponse;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.w = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objSendData = mVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                headPhoneModule = (HeadPhoneModule) mVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "set smart play response: " + channelResponse);
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            byte[] data = channelResponse.getData();
            return Boxing.boxBoolean(data.length != 2 && data[0] == 3 && data[1] == 0);
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "set smart play");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(3)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(3), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        byte[] bArr = {2, c3.a(z)};
        mVar.t = this;
        mVar.w = 1;
        objSendData = sendData(bArr, mVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        headPhoneModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write set smart play cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        n nVar = headPhoneModule.new n(null);
        mVar.t = null;
        mVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, nVar, mVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "set smart play response: " + channelResponse);
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        byte[] data2 = channelResponse.getData();
        return Boxing.boxBoolean(data2.length != 2 && data2[0] == 3 && data2[1] == 0);
    }
}
