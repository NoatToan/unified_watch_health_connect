package com.huami.bluetooth.profile.channel.module;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u000f\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\"\u0010\u001d\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0014\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001c\u0010 \u001a\u00020\u00112\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u001aJ\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u00112\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001aJ!\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010%J\u001f\u0010$\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010'J\u001b\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u000e\u0010)\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020(J\u000e\u0010*\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020(R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R(\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020201008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020(058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020:8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "worldTimes", "", "version", "", GoogleApiAvailabilityLight.a, "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "e", "mutableList", "", "f", "offset", SessionDescription.p, "", "i", "", "h", PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callback", "setWorldClock", "", "setWorldClockSync", "queryWorldClock", "queryWorldClockSync", "queryVersionSync", "()Ljava/lang/Integer;", "queryVersion", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/DataChangeCallback;", "registerDataCallback", "unRegisterDataCallback", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "Ljava/util/Map;", "channels", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "callbacks", z.j, "Ljava/lang/Integer;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockModule extends BaseModule implements CoroutineScope {
    public static final int DEFAULT_VERSION_01 = 1;

    @NotNull
    private static final String k = "WorldClockModule";
    private static final long l = 15000;
    private static final int m = 8;
    private static final byte n = 1;
    private static final byte o = 2;
    private static final int p = 3;
    private static final byte q = 4;
    private static final byte r = 5;
    private static final byte s = 6;
    private static final byte t = 7;
    private static final byte u = 1;
    private static final byte v = 2;
    private static final byte w = 3;
    private static final byte x = 4;
    private static final byte y = 5;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<DataChangeCallback> callbacks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private volatile Integer version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.WorldClockModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$init$1$1", f = "WorldClockModule.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0315a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ WorldClockModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0315a(ChannelResponse channelResponse, WorldClockModule worldClockModule, Continuation<? super C0315a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = worldClockModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0315a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0315a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    Debug.fi(WorldClockModule.k, Intrinsics.stringPlus("Receive WorldClockModule response:", GattUtils.bytesToHexString(this.b.getData())));
                    byte bFirst = ArraysKt___ArraysKt.first(this.b.getData());
                    if (bFirst == 7) {
                        Iterator it2 = this.c.callbacks.iterator();
                        while (it2.hasNext()) {
                            ((DataChangeCallback) it2.next()).onNotify();
                        }
                    } else {
                        Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.b;
                            this.a = 1;
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            WorldClockModule worldClockModule = WorldClockModule.this;
            kotlinx.coroutines.e.f(worldClockModule, null, null, new C0315a(channelResponse, worldClockModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
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
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryVersion$1", f = "WorldClockModule.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Integer> b;
        public final /* synthetic */ WorldClockModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMCallback<Integer> hMCallback, WorldClockModule worldClockModule, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = worldClockModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                WorldClockModule worldClockModule = this.c;
                this.a = 1;
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
            this.b.sendOnFinishMessage((Integer) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {0}, l = {147}, m = "queryVersion", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WorldClockModule.this.queryVersion(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryVersionSync$1", f = "WorldClockModule.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClock$1", f = "WorldClockModule.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<List<WorldTime>> b;
        public final /* synthetic */ WorldClockModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMCallback<List<WorldTime>> hMCallback, WorldClockModule worldClockModule, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = worldClockModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                WorldClockModule worldClockModule = this.c;
                this.a = 1;
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
            this.b.sendOnFinishMessage((List<WorldTime>) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_SHOOT, DataTypeSource.SPORT_TYPE_BOULDERING, 193}, m = "queryWorldClock", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WorldClockModule.this.queryWorldClock(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClock$response$1", f = "WorldClockModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(6));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClockSync$1", f = "WorldClockModule.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<WorldTime>>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WorldTime>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {}, l = {157, 162}, m = "queryWorldClockVersion", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WorldClockModule.this.g(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$queryWorldClockVersion$response$1", f = "WorldClockModule.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(2));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClock$1", f = "WorldClockModule.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Object> b;
        public final /* synthetic */ WorldClockModule c;
        public final /* synthetic */ List<WorldTime> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(HMCallback<Object> hMCallback, WorldClockModule worldClockModule, List<? extends WorldTime> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = worldClockModule;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                WorldClockModule worldClockModule = this.c;
                List<WorldTime> list = this.d;
                this.a = 1;
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
            this.b.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule", f = "WorldClockModule.kt", i = {}, l = {108, 111, 116}, m = "setWorldClock", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WorldClockModule.this.setWorldClock((List<? extends WorldTime>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClock$response$1", f = "WorldClockModule.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) WorldClockModule.this.channels.get(Boxing.boxInt(4));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WorldClockModule$setWorldClockSync$1", f = "WorldClockModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ List<WorldTime> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(List<? extends WorldTime> list, Continuation<? super o> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockModule.this.new o(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockModule worldClockModule = WorldClockModule.this;
                List<WorldTime> list = this.c;
                this.a = 1;
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

    public WorldClockModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
        this.channels = new LinkedHashMap();
        this.callbacks = new CopyOnWriteArrayList<>();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    private final byte[] d(List<? extends WorldTime> worldTimes, int version) {
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
        return byteArrayOutputStream.toByteArray();
    }

    private final List<WorldTime> e(ByteBuffer byteBuffer, int version) {
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = byteBuffer.get() & 255;
            int i3 = 0;
            if (i2 > 0) {
                do {
                    i3++;
                    f(byteBuffer, arrayList, version);
                } while (i3 < i2);
            }
        } catch (Exception e2) {
            Debug.fi(k, e2.getMessage());
        }
        return arrayList;
    }

    private final void f(ByteBuffer byteBuffer, List<WorldTime> mutableList, int version) {
        int i2 = byteBuffer.get() & 255;
        String strI = i(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer);
        mutableList.add(new WorldTime(ProfileUtils.getTimezoneOffset(byteBuffer.get()), i(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer), i(byteBuffer.position(), byteBuffer.array().length - byteBuffer.position(), byteBuffer), strI, byteBuffer.get() & 255, byteBuffer.get(), h(byteBuffer), i2, version > 1 ? ByteUtilsKt.toBoolean(byteBuffer.get()) : true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Continuation<? super Integer> continuation) {
        j jVar;
        WorldClockModule worldClockModule;
        ChannelResponse channelResponse;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objSendDataWithResult$default = jVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                worldClockModule = (WorldClockModule) jVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(k, Intrinsics.stringPlus("query version response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            return Boxing.boxInt(channelResponse.getData()[1] & 255);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(k, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(2))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        }
        jVar.a = this;
        jVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{1}, 0, false, jVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        worldClockModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write query version cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        k kVar = worldClockModule.new k(null);
        jVar.a = null;
        jVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(k, Intrinsics.stringPlus("query version response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        return Boxing.boxInt(channelResponse.getData()[1] & 255);
    }

    private final long h(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = iPosition + 4;
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(byteBuffer.array(), iPosition, i2);
        byteBuffer.position(i2);
        return ByteUtilsKt.toLong$default(bArrCopyOfRange, 4, 0, 2, null);
    }

    private final String i(int offset, int length, ByteBuffer byteBuffer) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
        bufByteDecoder.append(ArraysKt___ArraysJvmKt.copyOfRange(byteBuffer.array(), offset, length + offset));
        String string = bufByteDecoder.readString();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        byteBuffer.position(offset + string.getBytes(charset).length + 1);
        return string;
    }

    public static /* synthetic */ Object queryVersion$default(WorldClockModule worldClockModule, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return worldClockModule.queryVersion(z, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 8;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    public final void queryVersion(@NotNull HMCallback<Integer> callback) {
        kotlinx.coroutines.e.f(this, null, null, new c(callback, this, null), 3, null);
    }

    @Nullable
    public final Integer queryVersionSync() {
        return (Integer) kotlinx.coroutines.d.b(null, new e(null), 1, null);
    }

    public final void queryWorldClock(@NotNull HMCallback<List<WorldTime>> callback) {
        kotlinx.coroutines.e.f(this, null, null, new f(callback, this, null), 3, null);
    }

    @Nullable
    public final List<WorldTime> queryWorldClockSync() {
        return (List) kotlinx.coroutines.d.b(null, new i(null), 1, null);
    }

    public final void registerDataCallback(@NotNull DataChangeCallback callback) {
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    public final void setWorldClock(@NotNull List<? extends WorldTime> worldTimes, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new l(callback, this, worldTimes, null), 3, null);
    }

    public final boolean setWorldClockSync(@NotNull List<? extends WorldTime> worldTimes) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new o(worldTimes, null), 1, null)).booleanValue();
    }

    public final void unRegisterDataCallback(@NotNull DataChangeCallback callback) {
        this.callbacks.remove(callback);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(boolean z, @NotNull Continuation<? super Integer> continuation) {
        d dVar;
        WorldClockModule worldClockModule;
        WorldClockModule worldClockModule2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objG = dVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            if (this.version == null || z) {
                dVar.a = this;
                dVar.b = this;
                dVar.e = 1;
                objG = g(dVar);
                if (objG == coroutine_suspended) {
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
        worldClockModule = (WorldClockModule) dVar.b;
        worldClockModule2 = (WorldClockModule) dVar.a;
        ResultKt.throwOnFailure(objG);
        Integer numBoxInt = (Integer) objG;
        if (numBoxInt == null) {
            numBoxInt = Boxing.boxInt(1);
        }
        worldClockModule.version = numBoxInt;
        return worldClockModule2.version;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e6 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[Catch: all -> 0x012f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:62:0x010f, B:66:0x0118, B:65:0x0114, B:16:0x0040, B:17:0x0047, B:18:0x0048, B:49:0x00d7, B:51:0x00e6, B:54:0x00ed, B:56:0x00f5, B:57:0x00fd, B:19:0x0051, B:36:0x00a6, B:40:0x00b5, B:45:0x00c6, B:20:0x0059, B:24:0x0073, B:31:0x008d, B:30:0x0082, B:9:0x0018), top: B:72:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0109, please report this as an issue */
    @Nullable
    public final synchronized Object queryWorldClock(@NotNull Continuation<? super List<WorldTime>> continuation) {
        g gVar;
        WorldClockModule worldClockModule;
        ChannelResponse channelResponse;
        Object objQueryVersion$default;
        WorldClockModule worldClockModule2;
        ChannelResponse channelResponse2;
        Integer num;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.e = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        g gVar2 = gVar;
        Object objSendDataWithResult$default = gVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar2.e;
        List<WorldTime> listE = null;
        int iIntValue = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                worldClockModule = (WorldClockModule) gVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 == 2) {
                    worldClockModule = (WorldClockModule) gVar2.a;
                    ResultKt.throwOnFailure(objSendDataWithResult$default);
                    channelResponse = (ChannelResponse) objSendDataWithResult$default;
                    Debug.fi(k, Intrinsics.stringPlus("query world clock response: ", channelResponse));
                    if (channelResponse == null) {
                        return new ArrayList();
                    }
                    if (channelResponse.getData()[1] != 1) {
                        Debug.fi(k, "query world clock response status error");
                    } else {
                        gVar2.a = worldClockModule;
                        gVar2.b = channelResponse;
                        gVar2.e = 3;
                        objQueryVersion$default = queryVersion$default(worldClockModule, false, gVar2, 1, null);
                        if (objQueryVersion$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objSendDataWithResult$default = objQueryVersion$default;
                        worldClockModule2 = worldClockModule;
                        channelResponse2 = channelResponse;
                    }
                    return listE;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelResponse2 = (ChannelResponse) gVar2.b;
                worldClockModule2 = (WorldClockModule) gVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            num = (Integer) objSendDataWithResult$default;
            if (num == null) {
                iIntValue = num.intValue();
            }
            listE = worldClockModule2.e(ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(channelResponse2.getData(), 2, channelResponse2.getData().length)), iIntValue);
            return listE;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(k, "start query world clock data");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(6))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        }
        gVar2.a = this;
        gVar2.e = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{5}, 0, false, gVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        worldClockModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(k, Intrinsics.stringPlus("write query world clock cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        h hVar = worldClockModule.new h(null);
        gVar2.a = worldClockModule;
        gVar2.e = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, hVar, gVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(k, Intrinsics.stringPlus("query world clock response: ", channelResponse));
        if (channelResponse == null) {
            return new ArrayList();
        }
        if (channelResponse.getData()[1] != 1) {
            Debug.fi(k, "query world clock response status error");
        } else {
            gVar2.a = worldClockModule;
            gVar2.b = channelResponse;
            gVar2.e = 3;
            objQueryVersion$default = queryVersion$default(worldClockModule, false, gVar2, 1, null);
            if (objQueryVersion$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            objSendDataWithResult$default = objQueryVersion$default;
            worldClockModule2 = worldClockModule;
            channelResponse2 = channelResponse;
            num = (Integer) objSendDataWithResult$default;
            if (num == null) {
                iIntValue = num.intValue();
            }
            listE = worldClockModule2.e(ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(channelResponse2.getData(), 2, channelResponse2.getData().length)), iIntValue);
        }
        return listE;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:59:0x0113, B:61:0x0122, B:64:0x0128, B:71:0x0141, B:67:0x0131, B:69:0x0139, B:16:0x003a, B:17:0x0041, B:18:0x0042, B:45:0x00de, B:49:0x00ed, B:51:0x00fa, B:55:0x0102, B:19:0x004e, B:36:0x00a4, B:40:0x00ae, B:39:0x00aa, B:20:0x0060, B:24:0x0079, B:31:0x0093, B:30:0x0088, B:9:0x0018), top: B:77:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:61:0x0122 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:59:0x0113, B:61:0x0122, B:64:0x0128, B:71:0x0141, B:67:0x0131, B:69:0x0139, B:16:0x003a, B:17:0x0041, B:18:0x0042, B:45:0x00de, B:49:0x00ed, B:51:0x00fa, B:55:0x0102, B:19:0x004e, B:36:0x00a4, B:40:0x00ae, B:39:0x00aa, B:20:0x0060, B:24:0x0079, B:31:0x0093, B:30:0x0088, B:9:0x0018), top: B:77:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0128 A[Catch: all -> 0x0147, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:59:0x0113, B:61:0x0122, B:64:0x0128, B:71:0x0141, B:67:0x0131, B:69:0x0139, B:16:0x003a, B:17:0x0041, B:18:0x0042, B:45:0x00de, B:49:0x00ed, B:51:0x00fa, B:55:0x0102, B:19:0x004e, B:36:0x00a4, B:40:0x00ae, B:39:0x00aa, B:20:0x0060, B:24:0x0079, B:31:0x0093, B:30:0x0088, B:9:0x0018), top: B:77:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[Catch: all -> 0x0147, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:10:0x001d, B:15:0x0033, B:59:0x0113, B:61:0x0122, B:64:0x0128, B:71:0x0141, B:67:0x0131, B:69:0x0139, B:16:0x003a, B:17:0x0041, B:18:0x0042, B:45:0x00de, B:49:0x00ed, B:51:0x00fa, B:55:0x0102, B:19:0x004e, B:36:0x00a4, B:40:0x00ae, B:39:0x00aa, B:20:0x0060, B:24:0x0079, B:31:0x0093, B:30:0x0088, B:9:0x0018), top: B:77:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0111, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    @Nullable
    public final synchronized Object setWorldClock(@NotNull List<? extends WorldTime> list, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        List<? extends WorldTime> list2;
        Object objQueryVersion$default;
        WorldClockModule worldClockModule;
        boolean z;
        Object objSendDataWithResult$default;
        WorldClockModule worldClockModule2;
        boolean zBooleanValue;
        boolean z2;
        Object objWithTimeoutOrNull;
        ?? r0;
        ChannelResponse channelResponse;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object obj = mVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                List<? extends WorldTime> list3 = (List) mVar.b;
                WorldClockModule worldClockModule3 = (WorldClockModule) mVar.a;
                ResultKt.throwOnFailure(obj);
                worldClockModule = worldClockModule3;
                objQueryVersion$default = obj;
                list2 = list3;
            } else if (i3 == 2) {
                WorldClockModule worldClockModule4 = (WorldClockModule) mVar.a;
                ResultKt.throwOnFailure(obj);
                worldClockModule2 = worldClockModule4;
                objSendDataWithResult$default = obj;
                z = false;
                zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
                if (zBooleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Debug.fi(k, Intrinsics.stringPlus("set result: ", Boxing.boxBoolean(z2)));
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(z);
                }
                n nVar = worldClockModule2.new n(null);
                mVar.a = null;
                mVar.e = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, nVar, mVar);
                r0 = z;
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objWithTimeoutOrNull = obj;
                r0 = 0;
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            Debug.fi(k, Intrinsics.stringPlus("set response: ", channelResponse));
            if (channelResponse == null) {
                return Boxing.boxBoolean(r0);
            }
            return Boxing.boxBoolean(channelResponse.getData().length != 2 && channelResponse.getData()[r0] == 4 && channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(obj);
        Debug.fi(k, "start set worldTimes data");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(4))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        }
        mVar.a = this;
        list2 = list;
        mVar.b = list2;
        mVar.e = 1;
        objQueryVersion$default = queryVersion$default(this, false, mVar, 1, null);
        if (objQueryVersion$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        worldClockModule = this;
        Integer num = (Integer) objQueryVersion$default;
        byte[] bArrD = worldClockModule.d(list2, num == null ? 0 : num.intValue());
        Debug.fi(k, Intrinsics.stringPlus("worldClock rawData:", GattUtils.bytesToHexString(bArrD)));
        mVar.a = worldClockModule;
        mVar.b = null;
        mVar.e = 2;
        WorldClockModule worldClockModule5 = worldClockModule;
        z = false;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(worldClockModule, bArrD, 0, false, mVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        worldClockModule2 = worldClockModule5;
        zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (zBooleanValue) {
            z2 = true;
        } else {
            z2 = false;
        }
        Debug.fi(k, Intrinsics.stringPlus("set result: ", Boxing.boxBoolean(z2)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(z);
        }
        n nVar2 = worldClockModule2.new n(null);
        mVar.a = null;
        mVar.e = 3;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, nVar2, mVar);
        r0 = z;
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        Debug.fi(k, Intrinsics.stringPlus("set response: ", channelResponse));
        if (channelResponse == null) {
            return Boxing.boxBoolean(r0);
        }
        return Boxing.boxBoolean(channelResponse.getData().length != 2 && channelResponse.getData()[r0] == 4 && channelResponse.getData()[1] == 1);
    }
}
