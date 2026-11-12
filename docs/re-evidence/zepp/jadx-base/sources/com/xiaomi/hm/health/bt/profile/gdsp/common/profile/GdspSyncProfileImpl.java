package com.xiaomi.hm.health.bt.profile.gdsp.common.profile;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPVersion;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspScope;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.GdspPieceData;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Objects;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0017\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\bG\u0010HJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0002H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0019H\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R$\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\n0\n038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010%R\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010-R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010%¨\u0006J"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfileImpl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspPieceData;", "channel", "", GoogleApiAvailabilityLight.a, "data", "f", "e", "", "value", "b", "", PointCategory.INIT, "Ljava/util/Calendar;", "startTime", "", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "readHeader", "withCompress", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "startTransfer", "getData", "", "code", "stopTransfer", "(Ljava/lang/Integer;)Z", "forceStop", "deInit", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "getDataTransferRate", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", LogUtil.I, "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "mProfile", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStop", "mIsForceStop", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mLastIndex", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "g", "Ljava/util/concurrent/atomic/AtomicReference;", "mLastData", "h", "Lkotlinx/coroutines/channels/Channel;", "mDataChannel", "i", "secondVersion", z.j, "mHasInit", "", hl.k, "J", "transferStartTime", "l", "transferStopTime", "m", "totalDataSize", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class GdspSyncProfileImpl implements GdspSyncProfile {

    @NotNull
    private static final String n = "GdspSyncProfile";
    private static final long o = 500;
    private static final int p = 500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Channel<GdspPieceData> mDataChannel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int secondVersion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int totalDataSize;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Set<Byte>> q = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProfile = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean isStop = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean mIsForceStop = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger mLastIndex = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AtomicReference<byte[]> mLastData = new AtomicReference<>(new byte[0]);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean mHasInit = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long transferStartTime = -1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long transferStopTime = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfileImpl$Companion;", "", "", "", "sUseGpsHeaderTypeSet$delegate", "Lkotlin/Lazy;", "a", "()Ljava/util/Set;", "sUseGpsHeaderTypeSet", "", "CHANNEL_DATA_BUF_SIZE", LogUtil.I, "", "CHANNEL_SEND_TIME_OUT", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "sUseGpsHeaderTypeSet", "getSUseGpsHeaderTypeSet()Ljava/util/Set;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<Byte> a() {
            return (Set) GdspSyncProfileImpl.q.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010#\n\u0002\u0010\u0005\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Set<Byte>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Set<Byte> getA() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add((byte) 3);
            linkedHashSet.add((byte) 16);
            linkedHashSet.add((byte) 42);
            linkedHashSet.add((byte) 37);
            linkedHashSet.add((byte) 38);
            linkedHashSet.add((byte) 39);
            linkedHashSet.add((byte) 43);
            linkedHashSet.add((byte) 40);
            linkedHashSet.add((byte) 48);
            linkedHashSet.add((byte) 46);
            linkedHashSet.add((byte) 47);
            linkedHashSet.add((byte) 14);
            linkedHashSet.add((byte) 5);
            linkedHashSet.add((byte) 6);
            return linkedHashSet;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$listenData$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Channel<GdspPieceData> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Channel<GdspPieceData> channel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = channel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(GdspSyncProfileImpl gdspSyncProfileImpl, Channel channel, byte[] bArr) throws InterruptedException {
            if (gdspSyncProfileImpl.mIsForceStop.get()) {
                gdspSyncProfileImpl.isStop.set(true);
                gdspSyncProfileImpl.c().waitingNotify();
                gdspSyncProfileImpl.f(channel, new GdspPieceData(true, null, GDSPErrorCode.CANCEL));
                gdspSyncProfileImpl.e(channel);
                return;
            }
            if (channel.isClosedForSend()) {
                return;
            }
            gdspSyncProfileImpl.totalDataSize += bArr.length;
            gdspSyncProfileImpl.b(bArr, channel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GdspSyncProfileImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMProSyncDataBaseProfile hMProSyncDataBaseProfileC = GdspSyncProfileImpl.this.c();
            final GdspSyncProfileImpl gdspSyncProfileImpl = GdspSyncProfileImpl.this;
            final Channel<GdspPieceData> channel = this.c;
            hMProSyncDataBaseProfileC.setDataCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.profile.a
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) throws InterruptedException {
                    GdspSyncProfileImpl.b.b(gdspSyncProfileImpl, channel, bArr);
                }
            });
            while (!GdspSyncProfileImpl.this.isStop.get()) {
                GdspSyncProfileImpl.this.isStop.set(true);
                GdspSyncProfileImpl.this.c().waiting(20000);
            }
            GdspSyncProfileImpl.this.transferStopTime = System.currentTimeMillis();
            GdspSyncProfileImpl.this.e(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HMProSyncDataBaseProfile> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMProSyncDataBaseProfile getA() {
            return new HMProSyncDataBaseProfile(GdspSyncProfileImpl.this.gattPeripheral);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeClose$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Channel<?> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Channel<?> channel, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.b.isClosedForSend()) {
                SendChannel.DefaultImpls.close$default(this.b, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeSend$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Channel<GdspPieceData> b;
        public final /* synthetic */ GdspPieceData c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$safeSend$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
            public int a;
            public final /* synthetic */ Channel<GdspPieceData> b;
            public final /* synthetic */ GdspPieceData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
                this.c = gdspPieceData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Result<Unit>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel<GdspPieceData> channel = this.b;
                        GdspPieceData gdspPieceData = this.c;
                        Result.Companion companion = Result.Companion;
                        this.a = 1;
                        if (channel.send(gdspPieceData, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    Debug.fi(GdspSyncProfileImpl.n, Intrinsics.stringPlus("Send on channel failed:", thM3848exceptionOrNullimpl));
                }
                return Result.m3844boximpl(objM3845constructorimpl);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = channel;
            this.c = gdspPieceData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.b.isClosedForSend()) {
                    a aVar = new a(this.b, this.c, null);
                    this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$startTransfer$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Channel<HMNotifyResponse> b;
        public final /* synthetic */ HMNotifyResponse c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl$startTransfer$1$1$1", f = "GdspSyncProfileImpl.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Channel<HMNotifyResponse> b;
            public final /* synthetic */ HMNotifyResponse c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<HMNotifyResponse> channel, HMNotifyResponse hMNotifyResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
                this.c = hMNotifyResponse;
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
                    Channel<HMNotifyResponse> channel = this.b;
                    HMNotifyResponse hMNotifyResponse = this.c;
                    this.a = 1;
                    if (channel.send(hMNotifyResponse, this) == coroutine_suspended) {
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
        public f(Channel<HMNotifyResponse> channel, HMNotifyResponse hMNotifyResponse, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = channel;
            this.c = hMNotifyResponse;
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
                if (!this.b.isClosedForSend()) {
                    a aVar = new a(this.b, this.c, null);
                    this.a = 1;
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

    public GdspSyncProfileImpl(@NotNull GattPeripheral gattPeripheral, int i) {
        this.gattPeripheral = gattPeripheral;
        this.version = i;
        this.secondVersion = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b(byte[] value, Channel<GdspPieceData> channel) {
        int i = value[0] & 255;
        Debug.i(n, Intrinsics.stringPlus("fetchData index:", Integer.valueOf(i)));
        if (this.mLastIndex.get() == i && Arrays.equals(value, this.mLastData.get())) {
            this.isStop.set(false);
        } else if (this.mLastIndex.get() + 1 == i || (this.mLastIndex.get() == 255 && i == 0)) {
            this.isStop.set(false);
            f(channel, new GdspPieceData(false, ArraysKt___ArraysJvmKt.copyOfRange(value, 1, value.length), GDSPErrorCode.SUCCESS));
        } else {
            f(channel, new GdspPieceData(true, null, GDSPErrorCode.PACKET_INDEX_ERROR));
            Debug.fi(n, "missing package!!!");
            this.isStop.set(true);
            c().waitingNotify();
        }
        this.mLastIndex.set(i);
        this.mLastData.set(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMProSyncDataBaseProfile c() {
        return (HMProSyncDataBaseProfile) this.mProfile.getValue();
    }

    private final void d(Channel<GdspPieceData> channel) {
        kotlinx.coroutines.e.f(GdspScope.INSTANCE, null, null, new b(channel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Channel<?> channel) throws InterruptedException {
        BuildersKt.runBlocking(GdspScope.INSTANCE.getCoroutineContext(), new d(channel, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Channel<GdspPieceData> channel, GdspPieceData gdspPieceData) throws InterruptedException {
        BuildersKt.runBlocking(GdspScope.INSTANCE.getCoroutineContext(), new e(channel, gdspPieceData, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(GdspSyncProfileImpl gdspSyncProfileImpl, Channel channel, byte[] bArr) throws InterruptedException {
        Debug.fi(n, Intrinsics.stringPlus("fetchData control point:", GattUtils.bytesToHexString(bArr)));
        gdspSyncProfileImpl.isStop.set(true);
        gdspSyncProfileImpl.c().waitingNotify();
        BuildersKt.runBlocking(GdspScope.INSTANCE.getCoroutineContext(), new f(channel, HMNotifyResponse.parse(bArr), null));
        gdspSyncProfileImpl.e(channel);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    public void forceStop() {
        this.mIsForceStop.set(true);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    @NotNull
    public Channel<GdspPieceData> getData() {
        Channel<GdspPieceData> channel = this.mDataChannel;
        Objects.requireNonNull(channel);
        return channel;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    @NotNull
    public DataTransferRate getDataTransferRate(int type) {
        return new DataTransferRate(type, this.totalDataSize, (int) (this.transferStopTime - this.transferStartTime));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    public boolean init() {
        boolean zInit;
        if (this.mHasInit.get()) {
            return true;
        }
        if (this.version != 1) {
            zInit = c().init();
        } else {
            int version = c().getVersion().getVersion();
            this.secondVersion = version;
            zInit = version != GDSPVersion.INSTANCE.getINVALID_VERSION().getVersion();
        }
        if (zInit) {
            this.mHasInit.set(true);
        }
        return zInit;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    @Nullable
    public DataHeader readHeader(@NotNull Calendar startTime, byte type) {
        this.transferStartTime = -1L;
        this.totalDataSize = 0;
        return this.secondVersion == 2 ? c().getDataHeader(startTime, type, true) : c().getDataHeader(startTime, type);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    @Nullable
    public Channel<HMNotifyResponse> startTransfer() {
        this.isStop.set(false);
        this.mLastIndex.set(-1);
        this.mLastData.set(new byte[0]);
        Channel<GdspPieceData> Channel = ChannelKt.Channel(500);
        this.mDataChannel = Channel;
        Objects.requireNonNull(Channel);
        d(Channel);
        if (!c().startTransfer()) {
            return null;
        }
        this.transferStartTime = System.currentTimeMillis();
        this.totalDataSize = 0;
        final Channel<HMNotifyResponse> Channel2 = ChannelKt.Channel(Integer.MAX_VALUE);
        c().setControlCallback(new IGattCallback.INotifyCallback() { // from class: ke2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) throws InterruptedException {
                GdspSyncProfileImpl.g(this.a, Channel2, bArr);
            }
        });
        return Channel2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    public boolean stopTransfer(@Nullable Integer code) {
        this.isStop.set(false);
        this.mIsForceStop.set(false);
        this.mLastIndex.set(-1);
        this.mLastData.set(new byte[0]);
        return code == null ? c().stopTransfer() : c().stopTransfer(code.intValue());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile
    @Nullable
    public DataHeader readHeader(@NotNull Calendar startTime, byte type, boolean withCompress) {
        this.transferStartTime = -1L;
        this.totalDataSize = 0;
        if (this.secondVersion == 2) {
            return c().getDataHeader(startTime, type, withCompress);
        }
        return c().getDataHeader(startTime, type);
    }
}
