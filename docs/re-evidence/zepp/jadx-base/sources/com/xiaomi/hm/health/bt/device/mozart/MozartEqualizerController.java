package com.xiaomi.hm.health.bt.device.mozart;

import com.airoha.android.lib.peq.AirohaPeqMgr;
import com.airoha.android.lib.peq.PeqBandInfo;
import com.airoha.android.lib.peq.PeqUiDataStru;
import com.airoha.android.lib.transport.AirohaLink;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.function.EqualizerFun;
import com.huami.bluetooth.profile.ecf.data.EqUnit;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001-\u0018\u0000 62\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J'\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\u001a\u0010\u0011\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J#\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u000eR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b$\u0010/R\u001d\u00103\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b(\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController;", "Lcom/huami/bluetooth/device/function/EqualizerFun;", "", "Lcom/huami/bluetooth/profile/ecf/data/EqUnit;", "eqList", "", "masterGain", "", "f", "(Ljava/util/List;Ljava/lang/Double;)Z", "", "type", "g", "Lkotlin/Function0;", "", "action", "h", z.j, "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "a", "b", "Lcom/airoha/android/lib/peq/PeqUiDataStru;", "e", "(Ljava/util/List;Ljava/lang/Double;)Lcom/airoha/android/lib/peq/PeqUiDataStru;", "getEqualizer", "equalizer", "setEqualizer", "applyEqualizer", "onDisconnected", "Lcom/airoha/android/lib/transport/AirohaLink;", "Lcom/airoha/android/lib/transport/AirohaLink;", "deviceLink", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "customPeqReference", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/CountDownLatch;", "loadEqualizerLatch", "Ljava/util/concurrent/atomic/AtomicBoolean;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/atomic/AtomicBoolean;", "loadEqualizerResult", "setEqualizerLatch", "setEqualizerResult", "com/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController$pegStatusUiListener$2$1", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController$pegStatusUiListener$2$1;", "pegStatusUiListener", "Lcom/airoha/android/lib/peq/AirohaPeqMgr;", "()Lcom/airoha/android/lib/peq/AirohaPeqMgr;", "peqMgr", "<init>", "(Lcom/airoha/android/lib/transport/AirohaLink;)V", "i", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MozartEqualizerController implements EqualizerFun {

    @Deprecated
    @NotNull
    public static final String TAG = "MozartEqualizerController";

    @Deprecated
    public static final long TIMEOUT = 20;

    @NotNull
    private static final a i = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AirohaLink deviceLink;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private CountDownLatch loadEqualizerLatch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private CountDownLatch setEqualizerLatch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AtomicReference<PeqUiDataStru> customPeqReference = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean loadEqualizerResult = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean setEqualizerResult = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy pegStatusUiListener = LazyKt__LazyJVMKt.lazy(new Function0<MozartEqualizerController$pegStatusUiListener$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.bt.device.mozart.MozartEqualizerController$pegStatusUiListener$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.bt.device.mozart.MozartEqualizerController$pegStatusUiListener$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final MozartEqualizerController mozartEqualizerController = this.a;
            return new AirohaPeqMgr.OnPeqStatusUiListener() { // from class: com.xiaomi.hm.health.bt.device.mozart.MozartEqualizerController$pegStatusUiListener$2.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.device.mozart.MozartEqualizerController$pegStatusUiListener$2$1$WhenMappings */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AirohaPeqMgr.Action.values().length];
                        iArr[AirohaPeqMgr.Action.GetPEQGroupNum.ordinal()] = 1;
                        iArr[AirohaPeqMgr.Action.GetPEQGroupIdx.ordinal()] = 2;
                        iArr[AirohaPeqMgr.Action.LoadUiData.ordinal()] = 3;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.airoha.android.lib.peq.AirohaPeqMgr.OnPeqStatusUiListener
                public void OnActionCompleted(@NotNull AirohaPeqMgr.Action action) {
                    Debug.fi(MozartEqualizerController.TAG, Intrinsics.stringPlus("OnActionCompleted: ", action));
                    int i2 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        mozartEqualizerController.loadEqualizerResult.set(true);
                        CountDownLatch countDownLatch = mozartEqualizerController.loadEqualizerLatch;
                        if (countDownLatch == null) {
                            return;
                        }
                        countDownLatch.countDown();
                        return;
                    }
                    mozartEqualizerController.setEqualizerResult.set(true);
                    CountDownLatch countDownLatch2 = mozartEqualizerController.setEqualizerLatch;
                    if (countDownLatch2 == null) {
                        return;
                    }
                    countDownLatch2.countDown();
                }

                @Override // com.airoha.android.lib.peq.AirohaPeqMgr.OnPeqStatusUiListener
                public void OnActionError(@NotNull AirohaPeqMgr.Action action) {
                    Debug.fi(MozartEqualizerController.TAG, Intrinsics.stringPlus("OnActionError: ", action));
                    int i2 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        mozartEqualizerController.loadEqualizerResult.set(false);
                        CountDownLatch countDownLatch = mozartEqualizerController.loadEqualizerLatch;
                        if (countDownLatch == null) {
                            return;
                        }
                        countDownLatch.countDown();
                        return;
                    }
                    mozartEqualizerController.setEqualizerResult.set(false);
                    CountDownLatch countDownLatch2 = mozartEqualizerController.setEqualizerLatch;
                    if (countDownLatch2 == null) {
                        return;
                    }
                    countDownLatch2.countDown();
                }

                @Override // com.airoha.android.lib.peq.AirohaPeqMgr.OnPeqStatusUiListener
                public void OnLoadPeqUiData(@Nullable PeqUiDataStru peqUiDataStru) {
                    Debug.fi(MozartEqualizerController.TAG, Intrinsics.stringPlus("OnLoadPeqUiData: ", peqUiDataStru));
                    mozartEqualizerController.customPeqReference.set(peqUiDataStru);
                }
            };
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy peqMgr = LazyKt__LazyJVMKt.lazy(new f());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController$a", "", "", "TAG", "Ljava/lang/String;", "", "TIMEOUT", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PeqUiDataStru b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PeqUiDataStru peqUiDataStru) {
            super(0);
            this.b = peqUiDataStru;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().startRealtimeUpdate(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().getPeqGroupNum();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().getPeqGroupIdx();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().loadPeqUiData(MozartEqualizerController.this.b(), AirohaPeqMgr.TargetDeviceEnum.AGENT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/airoha/android/lib/peq/AirohaPeqMgr;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<AirohaPeqMgr> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AirohaPeqMgr invoke() {
            return new AirohaPeqMgr(MozartEqualizerController.this.deviceLink, MozartEqualizerController.this.c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PeqUiDataStru b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PeqUiDataStru peqUiDataStru) {
            super(0);
            this.b = peqUiDataStru;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().startRealtimeUpdate(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().savePeqCoef(MozartEqualizerController.this.b(), AirohaPeqMgr.TargetDeviceEnum.DUAL);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PeqUiDataStru b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(PeqUiDataStru peqUiDataStru) {
            super(0);
            this.b = peqUiDataStru;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().savePeqUiData(MozartEqualizerController.this.b(), this.b, AirohaPeqMgr.TargetDeviceEnum.DUAL);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MozartEqualizerController.this.d().setPeqGroupIdx((byte) this.b);
        }
    }

    public MozartEqualizerController(@NotNull AirohaLink airohaLink) {
        this.deviceLink = airohaLink;
    }

    private final Equalizer a() {
        List<PeqBandInfo> peqBandInfoList;
        List arrayList;
        byte pEQIdx = d().getPEQIdx();
        if (pEQIdx > d().getPeqDefaultGroupNum()) {
            pEQIdx = 0;
        } else if (pEQIdx == 0) {
            pEQIdx = -1;
        }
        PeqUiDataStru peqUiDataStru = this.customPeqReference.get();
        if (peqUiDataStru == null || (peqBandInfoList = peqUiDataStru.getPeqBandInfoList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(peqBandInfoList, 10));
            for (PeqBandInfo peqBandInfo : peqBandInfoList) {
                arrayList.add(new EqUnit((int) peqBandInfo.getFreq(), (int) peqBandInfo.getGain()));
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        PeqUiDataStru peqUiDataStru2 = this.customPeqReference.get();
        return new Equalizer(pEQIdx, arrayList, peqUiDataStru2 != null ? Double.valueOf(peqUiDataStru2.getMasterGain()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MozartEqualizerController$pegStatusUiListener$2.AnonymousClass1 c() {
        return (MozartEqualizerController$pegStatusUiListener$2.AnonymousClass1) this.pegStatusUiListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AirohaPeqMgr d() {
        return (AirohaPeqMgr) this.peqMgr.getValue();
    }

    private final PeqUiDataStru e(List<EqUnit> list, Double d2) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (EqUnit eqUnit : list) {
            arrayList.add(new PeqBandInfo(eqUnit.getFrequency(), eqUnit.getFrequency() / 2, eqUnit.getGain(), (byte) 1));
        }
        Object[] array = arrayList.toArray(new PeqBandInfo[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        PeqBandInfo[] peqBandInfoArr = (PeqBandInfo[]) array;
        return d2 == null ? new PeqUiDataStru(peqBandInfoArr) : new PeqUiDataStru(peqBandInfoArr, d2.doubleValue());
    }

    private final boolean f(List<EqUnit> eqList, Double masterGain) throws InterruptedException {
        try {
            PeqUiDataStru peqUiDataStruE = e(eqList, masterGain);
            if (!d().isPeqCoefReady()) {
                j(new g(peqUiDataStruE));
            }
            this.setEqualizerResult.set(false);
            j(new h());
            if (!this.setEqualizerResult.get()) {
                return false;
            }
            this.setEqualizerResult.set(false);
            j(new i(peqUiDataStruE));
            return this.setEqualizerResult.get();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private final boolean g(int type) throws InterruptedException {
        if (type > d().getPeqDefaultGroupNum()) {
            return false;
        }
        try {
            this.setEqualizerResult.set(false);
            j(new j(type));
            return this.setEqualizerResult.get();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private final void h(Function0<Unit> action) throws InterruptedException {
        this.loadEqualizerLatch = new CountDownLatch(1);
        if (action != null) {
            action.invoke();
        }
        CountDownLatch countDownLatch = this.loadEqualizerLatch;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.await(20L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(MozartEqualizerController mozartEqualizerController, Function0 function0, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        mozartEqualizerController.h(function0);
    }

    private final void j(Function0<Unit> action) throws InterruptedException {
        this.setEqualizerLatch = new CountDownLatch(1);
        if (action != null) {
            action.invoke();
        }
        CountDownLatch countDownLatch = this.setEqualizerLatch;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.await(20L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(MozartEqualizerController mozartEqualizerController, Function0 function0, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        mozartEqualizerController.j(function0);
    }

    public final boolean applyEqualizer(@NotNull Equalizer equalizer) throws InterruptedException {
        if (!this.deviceLink.isConnected()) {
            return false;
        }
        if (d().getWriteBackPeqSubsetContent() == null) {
            Debug.fi(TAG, "getEqualizer when applyEqualizer!");
            if (getEqualizer() == null) {
                return false;
            }
        }
        if (equalizer.getEqType() != 0) {
            return g(equalizer.getEqType() != -1 ? equalizer.getEqType() : 0);
        }
        PeqUiDataStru peqUiDataStruE = e(equalizer.getEqList(), equalizer.getMasterGain());
        this.setEqualizerResult.set(false);
        j(new b(peqUiDataStruE));
        return this.setEqualizerResult.get();
    }

    @Override // com.huami.bluetooth.device.function.EqualizerFun
    @Nullable
    public Equalizer getEqualizer() {
        try {
            this.loadEqualizerResult.set(false);
            h(new c());
            if (!this.loadEqualizerResult.get()) {
                return null;
            }
            this.loadEqualizerResult.set(false);
            h(new d());
            if (!this.loadEqualizerResult.get()) {
                return null;
            }
            this.loadEqualizerResult.set(false);
            h(new e());
            if (this.loadEqualizerResult.get()) {
                return a();
            }
            return null;
        } catch (Exception e2) {
            Debug.e(TAG, "getEqualizer Exception: ", e2);
            return null;
        }
    }

    public final void onDisconnected() {
        CountDownLatch countDownLatch = this.loadEqualizerLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        CountDownLatch countDownLatch2 = this.setEqualizerLatch;
        if (countDownLatch2 == null) {
            return;
        }
        countDownLatch2.countDown();
    }

    @Override // com.huami.bluetooth.device.function.EqualizerFun
    public boolean setEqualizer(@NotNull Equalizer equalizer) {
        if (!this.deviceLink.isConnected()) {
            return false;
        }
        if (d().getWriteBackPeqSubsetContent() == null) {
            Debug.fi(TAG, "getEqualizer when setEqualizer!");
            if (getEqualizer() == null) {
                return false;
            }
        }
        if (equalizer.getEqType() == 0) {
            return f(equalizer.getEqList(), equalizer.getMasterGain());
        }
        return g(equalizer.getEqType() != -1 ? equalizer.getEqType() : 0);
    }
}
