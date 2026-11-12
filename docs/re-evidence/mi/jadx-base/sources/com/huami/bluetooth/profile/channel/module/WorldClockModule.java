package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.c3;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.w2;
import defpackage.y5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
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
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
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
@Metadata(bv = {}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u000f\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\"\u0010\u001d\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0014\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001c\u0010 \u001a\u00020\u00112\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u001aJ\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u00112\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001aJ!\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010%J\u001f\u0010$\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010'J\u001b\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u000e\u0010)\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020(J\u000e\u0010*\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020(R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020302018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020(068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "worldTimes", "", "version", "", "getWorldClockTotalByteData", "queryWorldClockVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "parseWorldClock", "mutableList", "", "parseWorldClockItem", "offset", "length", "", "readString", "", "readOffsetTransitionDateTime", "init", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callback", "setWorldClock", "", "setWorldClockSync", "queryWorldClock", "queryWorldClockSync", "queryVersionSync", "()Ljava/lang/Integer;", "queryVersion", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly5;", "registerDataCallback", "unRegisterDataCallback", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "callbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/Integer;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class WorldClockModule extends a implements CoroutineScope {
    private static final byte CODE_EXCEED_MAX_LIMIT = 2;
    private static final byte CODE_INVALID_PARAMETER = 4;
    private static final byte CODE_NO_DATA = 3;
    private static final byte CODE_OK = 1;
    private static final byte CODE_UPDATE_FAILED = 5;
    public static final int DEFAULT_VERSION_01 = 1;

    @NotNull
    private static final String TAG = "WorldClockModule";
    private static final long TIMEOUT = 15000;
    private static final byte TYPE_NOTIFY_DATA_CHANGE = 7;
    private static final byte TYPE_QUERY_DATA = 5;
    private static final byte TYPE_QUERY_DATA_RETURN = 6;
    private static final byte TYPE_QUERY_VERSION = 1;
    private static final byte TYPE_QUERY_VERSION_RETURN = 2;
    private static final int TYPE_UPDATE_WORLD_CLOCK_DATA = 3;
    private static final byte TYPE_UPDATE_WORLD_CLOCK_RETURN = 4;
    private static final int WORLD_CLOCK = 8;

    @NotNull
    private final CopyOnWriteArrayList<y5> callbacks;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private volatile Integer version;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$init$1$1", f = "WorldClockModule.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ WorldClockModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, WorldClockModule worldClockModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = worldClockModule;
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
                    t5t.d(WorldClockModule.TAG, "Receive WorldClockModule response:" + tet.x(this.u.getData()));
                    byte bFirst = ArraysKt___ArraysKt.first(this.u.getData());
                    if (bFirst == 7) {
                        Iterator it = this.v.callbacks.iterator();
                        while (it.hasNext()) {
                            ((y5) it.next()).a();
                        }
                    } else {
                        Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.u;
                            this.t = 1;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            WorldClockModule worldClockModule = WorldClockModule.this;
            BuildersKt__Builders_commonKt.launch$default(worldClockModule, null, null, new a(it, worldClockModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryVersion$1", f = "WorldClockModule.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Integer> u;
        public final /* synthetic */ WorldClockModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMCallback<Integer> hMCallback, WorldClockModule worldClockModule, Continuation<? super d> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = worldClockModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                WorldClockModule worldClockModule = this.v;
                this.t = 1;
                obj = worldClockModule.queryVersion(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage((Integer) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {0}, l = {147}, m = "queryVersion", n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WorldClockModule.this.queryVersion(false, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryVersionSync$1", f = "WorldClockModule.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int t;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                this.t = 1;
                obj = worldClockModule.queryVersion(true, this);
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClock$1", f = "WorldClockModule.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<List<WorldTime>> u;
        public final /* synthetic */ WorldClockModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMCallback<List<WorldTime>> hMCallback, WorldClockModule worldClockModule, Continuation<? super g> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = worldClockModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                WorldClockModule worldClockModule = this.v;
                this.t = 1;
                obj = worldClockModule.queryWorldClock(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage((List<WorldTime>) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {0, 1, 2, 2}, l = {179, SportReportBaseParser.ReportType.exitTime, SportReportBaseParser.ReportType.divingOTU}, m = "queryWorldClock", n = {"this", "this", "this", com.xiaomi.onetrack.api.b.I}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WorldClockModule.this.queryWorldClock(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClock$response$1", f = "WorldClockModule.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(6));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClockSync$1", f = "WorldClockModule.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<WorldTime>>, Object> {
        public int t;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WorldTime>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                this.t = 1;
                obj = worldClockModule.queryWorldClock(this);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {0}, l = {157, 162}, m = "queryWorldClockVersion", n = {"this"}, s = {"L$0"})
    public static final class k extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return WorldClockModule.this.queryWorldClockVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClockVersion$response$1", f = "WorldClockModule.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(2));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClock$1", f = "WorldClockModule.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Object> u;
        public final /* synthetic */ WorldClockModule v;
        public final /* synthetic */ List<WorldTime> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(HMCallback<Object> hMCallback, WorldClockModule worldClockModule, List<? extends WorldTime> list, Continuation<? super m> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = worldClockModule;
            this.w = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new m(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                WorldClockModule worldClockModule = this.v;
                List<WorldTime> list = this.w;
                this.t = 1;
                obj = worldClockModule.setWorldClock(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {0, 0, 1}, l = {108, 111, 116}, m = "setWorldClock", n = {"this", "worldTimes", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class n extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WorldClockModule.this.setWorldClock((List<? extends WorldTime>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClock$response$1", f = "WorldClockModule.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(4));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClockSync$1", f = "WorldClockModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ List<WorldTime> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(List<? extends WorldTime> list, Continuation<? super p> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new p(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                List<WorldTime> list = this.v;
                this.t = 1;
                obj = worldClockModule.setWorldClock(list, this);
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
    public WorldClockModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
        this.channels = new LinkedHashMap();
        this.callbacks = new CopyOnWriteArrayList<>();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final byte[] getWorldClockTotalByteData(List<? extends WorldTime> worldTimes, int version) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(worldTimes.size());
        for (WorldTime worldTime : worldTimes) {
            if (version > 1) {
                try {
                    byteArray = worldTime.getByteArray(true);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else {
                byteArray = worldTime.getByteArray();
            }
            byteArrayOutputStream.write(byteArray);
        }
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "bos.toByteArray()");
        return byteArray2;
    }

    private final List<WorldTime> parseWorldClock(ByteBuffer byteBuffer, int version) {
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = byteBuffer.get() & 255;
            for (int i3 = 0; i3 < i2; i3++) {
                parseWorldClockItem(byteBuffer, arrayList, version);
            }
        } catch (Exception e2) {
            t5t.d(TAG, e2.getMessage());
        }
        return arrayList;
    }

    private final void parseWorldClockItem(ByteBuffer byteBuffer, List<WorldTime> mutableList, int version) {
        int i2 = byteBuffer.get() & 255;
        String string = readString(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer);
        mutableList.add(new WorldTime(ProfileUtils.getTimezoneOffset(byteBuffer.get()), readString(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer), readString(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer), string, byteBuffer.get() & 255, byteBuffer.get(), readOffsetTransitionDateTime(byteBuffer), i2, version > 1 ? c3.a(byteBuffer.get()) : true));
    }

    public static /* synthetic */ Object queryVersion$default(WorldClockModule worldClockModule, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return worldClockModule.queryVersion(z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object queryWorldClockVersion(Continuation<? super Integer> continuation) {
        k kVar;
        WorldClockModule worldClockModule;
        ChannelResponse channelResponse;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.w = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objSendDataWithResult$default = kVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = kVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                worldClockModule = (WorldClockModule) kVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "query version response: " + channelResponse);
            if (channelResponse == null) {
                return null;
            }
            return Boxing.boxInt(channelResponse.getData()[1] & 255);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(2)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        kVar.t = this;
        kVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1}, 0, false, kVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        worldClockModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "write query version cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        l lVar = worldClockModule.new l(null);
        kVar.t = null;
        kVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, lVar, kVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "query version response: " + channelResponse);
        if (channelResponse == null) {
            return null;
        }
        return Boxing.boxInt(channelResponse.getData()[1] & 255);
    }

    private final long readOffsetTransitionDateTime(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArrArray = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
        int i2 = iPosition + 4;
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrArray, iPosition, i2);
        byteBuffer.position(i2);
        return c3.b(bArrCopyOfRange, 4, 0, 2, null);
    }

    private final String readString(int offset, int length, ByteBuffer byteBuffer) {
        w2 w2Var = new w2(null, 0, 3, null);
        byte[] bArrArray = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
        w2Var.a(ArraysKt___ArraysJvmKt.copyOfRange(bArrArray, offset, length + offset));
        String strF = w2Var.f();
        byte[] bytes = strF.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteBuffer.position(offset + bytes.length + 1);
        return strF;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 8;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public final void queryVersion(@NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(callback, this, null), 3, null);
    }

    @Nullable
    public final Integer queryVersionSync() {
        return (Integer) BuildersKt__BuildersKt.runBlocking$default(null, new f(null), 1, null);
    }

    public final void queryWorldClock(@NotNull HMCallback<List<WorldTime>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(callback, this, null), 3, null);
    }

    @Nullable
    public final List<WorldTime> queryWorldClockSync() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new j(null), 1, null);
    }

    public final void registerDataCallback(@NotNull y5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    public final void setWorldClock(@NotNull List<? extends WorldTime> worldTimes, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(worldTimes, "worldTimes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new m(callback, this, worldTimes, null), 3, null);
    }

    public final boolean setWorldClockSync(@NotNull List<? extends WorldTime> worldTimes) {
        Intrinsics.checkNotNullParameter(worldTimes, "worldTimes");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new p(worldTimes, null), 1, null)).booleanValue();
    }

    public final void unRegisterDataCallback(@NotNull y5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(boolean z, @NotNull Continuation<? super Integer> continuation) {
        e eVar;
        WorldClockModule worldClockModule;
        WorldClockModule worldClockModule2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.x = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objQueryWorldClockVersion = eVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.x;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryWorldClockVersion);
            if (this.version == null || z) {
                eVar.t = this;
                eVar.u = this;
                eVar.x = 1;
                objQueryWorldClockVersion = queryWorldClockVersion(eVar);
                if (objQueryWorldClockVersion == coroutine_suspended) {
                    return coroutine_suspended;
                }
                worldClockModule = this;
                worldClockModule2 = worldClockModule;
            } else {
                worldClockModule2 = this;
            }
            return worldClockModule2.version;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        worldClockModule = (WorldClockModule) eVar.u;
        worldClockModule2 = (WorldClockModule) eVar.t;
        ResultKt.throwOnFailure(objQueryWorldClockVersion);
        worldClockModule.version = (Integer) objQueryWorldClockVersion;
        return worldClockModule2.version;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2 A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0016, B:13:0x0024, B:18:0x0037, B:55:0x0114, B:57:0x0118, B:58:0x011c, B:19:0x0044, B:20:0x004b, B:21:0x004c, B:42:0x00d1, B:44:0x00eb, B:47:0x00f2, B:49:0x00fa, B:50:0x0102, B:22:0x0055, B:34:0x009e, B:38:0x00be, B:23:0x005d, B:28:0x0079, B:29:0x0085, B:12:0x001e), top: B:63:0x0007 }] */
    @Nullable
    public final synchronized Object queryWorldClock(@NotNull Continuation<? super List<WorldTime>> continuation) {
        h hVar;
        WorldClockModule worldClockModule;
        ChannelResponse channelResponse;
        Object objQueryVersion$default;
        WorldClockModule worldClockModule2;
        ChannelResponse channelResponse2;
        synchronized (this) {
            try {
                if (continuation instanceof h) {
                    hVar = (h) continuation;
                    int i2 = hVar.x;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hVar.x = i2 - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(continuation);
                    }
                } else {
                    hVar = new h(continuation);
                }
                h hVar2 = hVar;
                Object objSendDataWithResult$default = hVar2.v;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = hVar2.x;
                List<WorldTime> worldClock = null;
                if (i3 != 0) {
                    if (i3 == 1) {
                        worldClockModule = (WorldClockModule) hVar2.t;
                        ResultKt.throwOnFailure(objSendDataWithResult$default);
                    } else {
                        if (i3 == 2) {
                            worldClockModule = (WorldClockModule) hVar2.t;
                            ResultKt.throwOnFailure(objSendDataWithResult$default);
                            channelResponse = (ChannelResponse) objSendDataWithResult$default;
                            t5t.d(TAG, "query world clock response: " + channelResponse);
                            if (channelResponse == null) {
                                return new ArrayList();
                            }
                            if (channelResponse.getData()[1] != 1) {
                                t5t.d(TAG, "query world clock response status error");
                            } else {
                                hVar2.t = worldClockModule;
                                hVar2.u = channelResponse;
                                hVar2.x = 3;
                                objQueryVersion$default = queryVersion$default(worldClockModule, false, hVar2, 1, null);
                                if (objQueryVersion$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objSendDataWithResult$default = objQueryVersion$default;
                                worldClockModule2 = worldClockModule;
                                channelResponse2 = channelResponse;
                            }
                            return worldClock;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelResponse2 = (ChannelResponse) hVar2.u;
                        worldClockModule2 = (WorldClockModule) hVar2.t;
                        ResultKt.throwOnFailure(objSendDataWithResult$default);
                    }
                    Integer num = (Integer) objSendDataWithResult$default;
                    int iIntValue = num != null ? num.intValue() : 0;
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(channelResponse2.getData(), 2, channelResponse2.getData().length));
                    Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(response.data.copyO…e(2, response.data.size))");
                    worldClock = worldClockModule2.parseWorldClock(byteBufferWrap, iIntValue);
                    return worldClock;
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
                t5t.d(TAG, "start query world clock data");
                Map<Integer, Channel<ChannelResponse>> map = this.channels;
                if (!(!map.containsKey(Boxing.boxInt(6)))) {
                    map = null;
                }
                if (map != null) {
                    map.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
                }
                hVar2.t = this;
                hVar2.x = 1;
                objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{5}, 0, false, hVar2, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                worldClockModule = this;
                boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
                t5t.d(TAG, "write query world clock cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return null;
                }
                i iVar = worldClockModule.new i(null);
                hVar2.t = worldClockModule;
                hVar2.x = 2;
                objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, iVar, hVar2);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelResponse = (ChannelResponse) objSendDataWithResult$default;
                t5t.d(TAG, "query world clock response: " + channelResponse);
                if (channelResponse == null) {
                    return new ArrayList();
                }
                if (channelResponse.getData()[1] != 1) {
                    t5t.d(TAG, "query world clock response status error");
                } else {
                    hVar2.t = worldClockModule;
                    hVar2.u = channelResponse;
                    hVar2.x = 3;
                    objQueryVersion$default = queryVersion$default(worldClockModule, false, hVar2, 1, null);
                    if (objQueryVersion$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objSendDataWithResult$default = objQueryVersion$default;
                    worldClockModule2 = worldClockModule;
                    channelResponse2 = channelResponse;
                    Integer num2 = (Integer) objSendDataWithResult$default;
                    if (num2 != null) {
                    }
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(channelResponse2.getData(), 2, channelResponse2.getData().length));
                    Intrinsics.checkNotNullExpressionValue(byteBufferWrap2, "wrap(response.data.copyO…e(2, response.data.size))");
                    worldClock = worldClockModule2.parseWorldClock(byteBufferWrap2, iIntValue);
                }
                return worldClock;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:17:0x0036, B:51:0x0115, B:53:0x012f, B:56:0x0135, B:64:0x014e, B:59:0x013d, B:61:0x0145, B:18:0x003b, B:19:0x0042, B:20:0x0043, B:42:0x00de, B:44:0x00fc, B:47:0x0102, B:21:0x004f, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:22:0x0061, B:27:0x007c, B:28:0x0088, B:11:0x001b), top: B:69:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:17:0x0036, B:51:0x0115, B:53:0x012f, B:56:0x0135, B:64:0x014e, B:59:0x013d, B:61:0x0145, B:18:0x003b, B:19:0x0042, B:20:0x0043, B:42:0x00de, B:44:0x00fc, B:47:0x0102, B:21:0x004f, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:22:0x0061, B:27:0x007c, B:28:0x0088, B:11:0x001b), top: B:69:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0102 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:17:0x0036, B:51:0x0115, B:53:0x012f, B:56:0x0135, B:64:0x014e, B:59:0x013d, B:61:0x0145, B:18:0x003b, B:19:0x0042, B:20:0x0043, B:42:0x00de, B:44:0x00fc, B:47:0x0102, B:21:0x004f, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:22:0x0061, B:27:0x007c, B:28:0x0088, B:11:0x001b), top: B:69:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0113 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:53:0x012f A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:17:0x0036, B:51:0x0115, B:53:0x012f, B:56:0x0135, B:64:0x014e, B:59:0x013d, B:61:0x0145, B:18:0x003b, B:19:0x0042, B:20:0x0043, B:42:0x00de, B:44:0x00fc, B:47:0x0102, B:21:0x004f, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:22:0x0061, B:27:0x007c, B:28:0x0088, B:11:0x001b), top: B:69:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:17:0x0036, B:51:0x0115, B:53:0x012f, B:56:0x0135, B:64:0x014e, B:59:0x013d, B:61:0x0145, B:18:0x003b, B:19:0x0042, B:20:0x0043, B:42:0x00de, B:44:0x00fc, B:47:0x0102, B:21:0x004f, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:22:0x0061, B:27:0x007c, B:28:0x0088, B:11:0x001b), top: B:69:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0113, please report this as an issue */
    @Nullable
    public final synchronized Object setWorldClock(@NotNull List<? extends WorldTime> list, @NotNull Continuation<? super Boolean> continuation) {
        n nVar;
        List<? extends WorldTime> list2;
        Object objQueryVersion$default;
        WorldClockModule worldClockModule;
        Object objSendDataWithResult$default;
        WorldClockModule worldClockModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        try {
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i2 = nVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nVar.x = i2 - Integer.MIN_VALUE;
                } else {
                    nVar = new n(continuation);
                }
            } else {
                nVar = new n(continuation);
            }
            Object objWithTimeoutOrNull = nVar.v;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = nVar.x;
            boolean z = false;
            if (i3 != 0) {
                if (i3 == 1) {
                    List<? extends WorldTime> list3 = (List) nVar.u;
                    WorldClockModule worldClockModule3 = (WorldClockModule) nVar.t;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    worldClockModule = worldClockModule3;
                    objQueryVersion$default = objWithTimeoutOrNull;
                    list2 = list3;
                } else if (i3 == 2) {
                    WorldClockModule worldClockModule4 = (WorldClockModule) nVar.t;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    worldClockModule2 = worldClockModule4;
                    objSendDataWithResult$default = objWithTimeoutOrNull;
                    zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
                    t5t.d(TAG, "set result: " + zBooleanValue);
                    if (!zBooleanValue) {
                        return Boxing.boxBoolean(false);
                    }
                    o oVar = worldClockModule2.new o(0);
                    nVar.t = r9;
                    nVar.x = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, oVar, nVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                }
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                t5t.d(TAG, "set response: " + channelResponse);
                if (channelResponse == null) {
                    return Boxing.boxBoolean(false);
                }
                if (channelResponse.getData().length == 2 && channelResponse.getData()[0] == 4 && channelResponse.getData()[1] == 1) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            t5t.d(TAG, "start set worldTimes data");
            Map<Integer, Channel<ChannelResponse>> map = this.channels;
            if (!(!map.containsKey(Boxing.boxInt(4)))) {
                map = null;
            }
            if (map != null) {
                map.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
            }
            nVar.t = this;
            list2 = list;
            nVar.u = list2;
            nVar.x = 1;
            objQueryVersion$default = queryVersion$default(this, false, nVar, 1, null);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockModule = this;
            Integer num = (Integer) objQueryVersion$default;
            byte[] worldClockTotalByteData = worldClockModule.getWorldClockTotalByteData(list2, num != null ? num.intValue() : 0);
            t5t.d(TAG, "worldClock rawData:" + tet.x(worldClockTotalByteData));
            nVar.t = worldClockModule;
            nVar.u = null;
            nVar.x = 2;
            WorldClockModule worldClockModule5 = worldClockModule;
            objSendDataWithResult$default = a.sendDataWithResult$default(worldClockModule, worldClockTotalByteData, 0, false, nVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            worldClockModule2 = worldClockModule5;
            zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
            t5t.d(TAG, "set result: " + zBooleanValue);
            if (!zBooleanValue) {
                return Boxing.boxBoolean(false);
            }
            o oVar2 = worldClockModule2.new o(0);
            nVar.t = r9;
            nVar.x = 3;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, oVar2, nVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            t5t.d(TAG, "set response: " + channelResponse);
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData().length == 2) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        } catch (Throwable th) {
            throw th;
        }
    }
}
