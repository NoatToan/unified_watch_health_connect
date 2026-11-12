package defpackage;

import com.miui.tsmclient.model.ErrorCode;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\n\u0010\u0019J\u001d\u0010\n\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\n\u0010\u001bJ!\u0010\n\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\n\u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u0015\u0010\u001bJ%\u0010\n\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\n\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006,"}, d2 = {"Llc;", "Lkc;", "", "init", "()Z", "Ljava/util/Calendar;", "startTime", "", "type", "Lf4s;", PluginDeviceInfo.FMODEL, "(Ljava/util/Calendar;B)Lf4s;", "Lkotlinx/coroutines/channels/Channel;", "Lqe;", "()Lkotlinx/coroutines/channels/Channel;", "Lec;", "getData", "", "code", "(Ljava/lang/Integer;)Z", "", PluginDeviceInfo.FDESC, "()V", "deInit", "Lf6;", "(I)Lf6;", "channel", "(Lkotlinx/coroutines/channels/Channel;)V", "data", "(Lkotlinx/coroutines/channels/Channel;Lec;)V", "", "value", "([BLkotlinx/coroutines/channels/Channel;)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "mProfile$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FICONON, "()Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "mProfile", "Ljet;", "gattPeripheral", "version", "<init>", "(Ljet;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@ExperimentalCoroutinesApi
public final class lc implements kc {

    @NotNull
    public static final b n = new b(null);

    @NotNull
    public static final Lazy<Set<Byte>> o = LazyKt__LazyJVMKt.lazy(a.t);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final jet f24879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24880b;

    @NotNull
    public final Lazy c;

    @NotNull
    public final AtomicBoolean d;

    @NotNull
    public final AtomicBoolean e;

    @NotNull
    public final AtomicInteger f;

    @NotNull
    public final AtomicReference<byte[]> g;
    public Channel<GdspPieceData> h;
    public int i;

    @NotNull
    public final AtomicBoolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f24881k;
    public long l;
    public int m;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0010\u0005\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", PluginDeviceInfo.FMODEL, "()Ljava/util/Set;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<Set<Byte>> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<Byte> invoke() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add((byte) 3);
            linkedHashSet.add((byte) 16);
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_SPO2_POINT));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_SPO2_OSA));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_SPO2_ODI));
            linkedHashSet.add((byte) 48);
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE));
            linkedHashSet.add(Byte.valueOf(HMProSyncDataBaseProfile.DATA_TYPE_COACHING));
            linkedHashSet.add((byte) 5);
            linkedHashSet.add((byte) 6);
            return linkedHashSet;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Llc$b;", "", "", "CHANNEL_DATA_BUF_SIZE", "I", "", "CHANNEL_SEND_TIME_OUT", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$listenData$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Channel<GdspPieceData> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Channel<GdspPieceData> channel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = channel;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return lc.this.new c(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMProSyncDataBaseProfile hMProSyncDataBaseProfileC = lc.this.c();
            final lc lcVar = lc.this;
            final Channel<GdspPieceData> channel = this.v;
            hMProSyncDataBaseProfileC.setDataCallback(new zh.b() { // from class: x5t
                @Override // zh.b
                public final void e(byte[] bArr) throws InterruptedException {
                    lc.c.a(lcVar, channel, bArr);
                }
            });
            while (!lc.this.d.get()) {
                lc.this.d.set(true);
                lc.this.c().waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
            lc.this.l = System.currentTimeMillis();
            lc.this.b(this.v);
            return Unit.INSTANCE;
        }

        public static final void a(lc lcVar, Channel channel, byte[] value) throws InterruptedException {
            if (lcVar.e.get()) {
                lcVar.d.set(true);
                lcVar.c().waitingNotify();
                lcVar.a((Channel<GdspPieceData>) channel, new GdspPieceData(true, null, mb.CANCEL));
                lcVar.b((Channel<?>) channel);
                return;
            }
            if (channel.isClosedForSend()) {
                return;
            }
            lcVar.m += value.length;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            lcVar.a(value, (Channel<GdspPieceData>) channel);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", PluginDeviceInfo.FMODEL, "()Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<HMProSyncDataBaseProfile> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMProSyncDataBaseProfile invoke() {
            return new HMProSyncDataBaseProfile(lc.this.f24879a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeClose$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Channel<?> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Channel<?> channel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.u = channel;
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
            return new e(this.u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.u.isClosedForSend()) {
                SendChannel.DefaultImpls.close$default(this.u, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeSend$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Channel<GdspPieceData> u;
        public final /* synthetic */ GdspPieceData v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeSend$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
            public int t;
            public final /* synthetic */ Channel<GdspPieceData> u;
            public final /* synthetic */ GdspPieceData v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
                this.v = gdspPieceData;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Result<Unit>> continuation) {
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
                Object objM886constructorimpl;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel<GdspPieceData> channel = this.u;
                        GdspPieceData gdspPieceData = this.v;
                        Result.Companion companion = Result.Companion;
                        this.t = 1;
                        if (channel.send(gdspPieceData, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    t5t.d("GdspSyncProfile", "Send on channel failed:" + thM889exceptionOrNullimpl);
                }
                return Result.m885boximpl(objM886constructorimpl);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData, Continuation<? super f> continuation) {
            super(2, continuation);
            this.u = channel;
            this.v = gdspPieceData;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.u.isClosedForSend()) {
                    a aVar = new a(this.u, this.v, null);
                    this.t = 1;
                    if (TimeoutKt.withTimeoutOrNull(500L, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$startTransfer$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Channel<qe> u;
        public final /* synthetic */ qe v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$startTransfer$1$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ Channel<qe> u;
            public final /* synthetic */ qe v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<qe> channel, qe qeVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
                this.v = qeVar;
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
                    Channel<qe> channel = this.u;
                    qe qeVar = this.v;
                    this.t = 1;
                    if (channel.send(qeVar, this) == coroutine_suspended) {
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
        public g(Channel<qe> channel, qe qeVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.u = channel;
            this.v = qeVar;
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
                if (!this.u.isClosedForSend()) {
                    a aVar = new a(this.u, this.v, null);
                    this.t = 1;
                    if (TimeoutKt.withTimeoutOrNull(500L, aVar, this) == coroutine_suspended) {
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

    public lc(@NotNull jet gattPeripheral, int i) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.f24879a = gattPeripheral;
        this.f24880b = i;
        this.c = LazyKt__LazyJVMKt.lazy(new d());
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(-1);
        this.g = new AtomicReference<>(new byte[0]);
        this.i = i;
        this.j = new AtomicBoolean(false);
        this.f24881k = -1L;
        this.l = -1L;
    }

    @Override // defpackage.kc
    public boolean deInit() {
        return true;
    }

    @Override // defpackage.kc
    @NotNull
    public Channel<GdspPieceData> getData() {
        Channel<GdspPieceData> channel = this.h;
        if (channel != null) {
            return channel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDataChannel");
        return null;
    }

    @Override // defpackage.kc
    public boolean init() {
        boolean zInit;
        if (this.j.get()) {
            return true;
        }
        if (this.f24880b != 1) {
            zInit = c().init();
        } else {
            int version = c().getVersion().getVersion();
            this.i = version;
            zInit = version != GDSPVersion.f30182b.a().getVersion();
        }
        if (zInit) {
            this.j.set(true);
        }
        return zInit;
    }

    public final void b(Channel<?> channel) throws InterruptedException {
        BuildersKt.runBlocking(ic.t.getU(), new e(channel, null));
    }

    public final HMProSyncDataBaseProfile c() {
        return (HMProSyncDataBaseProfile) this.c.getValue();
    }

    @Override // defpackage.kc
    public void b() {
        this.e.set(true);
    }

    @Override // defpackage.kc
    @Nullable
    public f4s a(@NotNull Calendar startTime, byte type) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f24881k = -1L;
        this.m = 0;
        if (this.i == 2) {
            return c().getDataHeader(startTime, type, true);
        }
        return c().getDataHeader(startTime, type);
    }

    @Override // defpackage.kc
    @Nullable
    public Channel<qe> a() {
        this.d.set(false);
        this.f.set(-1);
        this.g.set(new byte[0]);
        Channel<GdspPieceData> channelChannel$default = ChannelKt.Channel$default(500, null, null, 6, null);
        this.h = channelChannel$default;
        if (channelChannel$default == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataChannel");
            channelChannel$default = null;
        }
        a(channelChannel$default);
        if (!c().startTransfer()) {
            return null;
        }
        this.f24881k = System.currentTimeMillis();
        this.m = 0;
        final Channel<qe> channelChannel$default2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        c().setControlCallback(new zh.b() { // from class: w5t
            @Override // zh.b
            public final void e(byte[] bArr) throws InterruptedException {
                lc.a(this.f37644a, channelChannel$default2, bArr);
            }
        });
        return channelChannel$default2;
    }

    public static final void a(lc this$0, Channel channel, byte[] bArr) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(channel, "$channel");
        t5t.d("GdspSyncProfile", "fetchData control point:" + tet.x(bArr));
        this$0.d.set(true);
        this$0.c().waitingNotify();
        BuildersKt.runBlocking(ic.t.getU(), new g(channel, qe.g(bArr), null));
        this$0.b((Channel<?>) channel);
    }

    public final void a(Channel<GdspPieceData> channel) {
        BuildersKt__Builders_commonKt.launch$default(ic.t, null, null, new c(channel, null), 3, null);
    }

    public final void a(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData) throws InterruptedException {
        BuildersKt.runBlocking(ic.t.getU(), new f(channel, gdspPieceData, null));
    }

    public final synchronized void a(byte[] value, Channel<GdspPieceData> channel) {
        try {
            int i = value[0] & 255;
            t5t.m("GdspSyncProfile", "fetchData index:" + i);
            if (this.f.get() == i && Arrays.equals(value, this.g.get())) {
                this.d.set(false);
            } else if (this.f.get() + 1 != i && (this.f.get() != 255 || i != 0)) {
                a(channel, new GdspPieceData(true, null, mb.PACKET_INDEX_ERROR));
                t5t.d("GdspSyncProfile", "missing package!!!");
                this.d.set(true);
                c().waitingNotify();
            } else {
                this.d.set(false);
                a(channel, new GdspPieceData(false, ArraysKt___ArraysJvmKt.copyOfRange(value, 1, value.length), mb.SUCCESS));
            }
            this.f.set(i);
            this.g.set(value);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.kc
    public boolean a(@Nullable Integer code) {
        this.d.set(false);
        this.e.set(false);
        this.f.set(-1);
        this.g.set(new byte[0]);
        if (code == null) {
            return c().stopTransfer();
        }
        return c().stopTransfer(code.intValue());
    }

    @Override // defpackage.kc
    @NotNull
    public f6 a(int type) {
        return new f6(type, this.m, (int) (this.l - this.f24881k));
    }
}
