package com.huami.sky.ui.realtime;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.lib.repo.SkyRepository;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.play.SkyPlayRecordManager;
import com.huami.sky.ui.play.SkyPlayServiceHelper;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 F2\u00020\u0001:\u0001FB'\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\bD\u0010EJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$R\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0&8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020 0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010$R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020 0&8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0>8\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyRealTimeViewModel;", "Landroidx/lifecycle/ViewModel;", "", "startTime", "endTime", "", "c", "b", "playStartTime", "a", "e", "f", "", "isSupportSkyFeature", "firstLoadRelaxScore", "firstObserveRelaxScore", "relaxChartXStartTime", "relaxChartXEndTime", "Lcom/huami/sky/lib/api/DeviceDataApi;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceApi", "Lcom/huami/sky/lib/repo/SkyRepository;", "Lcom/huami/sky/lib/repo/SkyRepository;", "skyRepo", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "skyServiceHelper", "Lcom/huami/sky/ui/play/SkyPlayRecordManager;", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/ui/play/SkyPlayRecordManager;", "playRecordManager", "", "Lcom/huami/sky/lib/entity/RelaxInfo;", "Ljava/util/List;", "relaxInfoList", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_relaxInfoListFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "g", "Lkotlinx/coroutines/flow/SharedFlow;", "getRelaxInfoListFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "relaxInfoListFlow", "h", "_resetChartFlow", "i", "getResetChartFlow", "resetChartFlow", z.j, "_minuteRelaxFlow", hl.k, "getMinuteRelaxFlow", "minuteRelaxFlow", "l", "J", "Lkotlinx/coroutines/Job;", "m", "Lkotlinx/coroutines/Job;", "minuteTimingJob", GoogleApiAvailabilityLight.b, "relaxScoreJob", "Lkotlinx/coroutines/flow/StateFlow;", "o", "Lkotlinx/coroutines/flow/StateFlow;", "getDeviceConnectedFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "deviceConnectedFlow", "<init>", "(Lcom/huami/sky/lib/api/DeviceDataApi;Lcom/huami/sky/lib/repo/SkyRepository;Lcom/huami/sky/ui/play/SkyPlayServiceHelper;Lcom/huami/sky/ui/play/SkyPlayRecordManager;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyRealTimeViewModel extends ViewModel {

    @NotNull
    private static final String p = "SkyRealTimeViewModel";
    private static final long q = 60000;
    private static final int r = 30;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SkyRepository skyRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayServiceHelper skyServiceHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayRecordManager playRecordManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<RelaxInfo> relaxInfoList = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<List<RelaxInfo>> _relaxInfoListFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<List<RelaxInfo>> relaxInfoListFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Boolean> _resetChartFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<Boolean> resetChartFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<RelaxInfo> _minuteRelaxFlow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<RelaxInfo> minuteRelaxFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long relaxChartXStartTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Job minuteTimingJob;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Job relaxScoreJob;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Boolean> deviceConnectedFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器：一次播放记录, 剩余时间 " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeViewModel$getRelaxScoreFromServer$1", f = "SkyRealTimeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyRealTimeViewModel.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyRealTimeViewModel.this.skyRepo.saveRelaxScoreFromServer(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器：一次播放记录开始时间relaxChartXStartTime: " + SkyRealTimeViewModel.this.relaxChartXStartTime;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeViewModel$startMinuteTiming$1", f = "SkyRealTimeViewModel.kt", i = {}, l = {150, 154, 159}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public int b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyRealTimeViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0090 -> B:28:0x00ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:28:0x00ac). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0092
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sky.ui.realtime.SkyRealTimeViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.realtime.SkyRealTimeViewModel$firstLoadRelaxScore$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeViewModel$firstLoadRelaxScore$1", f = "SkyRealTimeViewModel.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.realtime.SkyRealTimeViewModel$firstLoadRelaxScore$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.a = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "播放器：一次播放记录开始时间: " + this.a;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyRealTimeViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> playStartTimeFlow = SkyRealTimeViewModel.this.skyServiceHelper.getPlayStartTimeFlow();
                SkyRealTimeViewModel$firstLoadRelaxScore$1$invokeSuspend$$inlined$collect$1 skyRealTimeViewModel$firstLoadRelaxScore$1$invokeSuspend$$inlined$collect$1 = new SkyRealTimeViewModel$firstLoadRelaxScore$1$invokeSuspend$$inlined$collect$1(SkyRealTimeViewModel.this);
                this.a = 1;
                if (playStartTimeFlow.collect(skyRealTimeViewModel$firstLoadRelaxScore$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    public SkyRealTimeViewModel(@NotNull DeviceDataApi deviceDataApi, @NotNull SkyRepository skyRepository, @NotNull SkyPlayServiceHelper skyPlayServiceHelper, @NotNull SkyPlayRecordManager skyPlayRecordManager) {
        this.deviceApi = deviceDataApi;
        this.skyRepo = skyRepository;
        this.skyServiceHelper = skyPlayServiceHelper;
        this.playRecordManager = skyPlayRecordManager;
        MutableSharedFlow<List<RelaxInfo>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._relaxInfoListFlow = mutableSharedFlowMutableSharedFlow$default;
        this.relaxInfoListFlow = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._resetChartFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.resetChartFlow = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<RelaxInfo> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._minuteRelaxFlow = mutableSharedFlowMutableSharedFlow$default3;
        this.minuteRelaxFlow = mutableSharedFlowMutableSharedFlow$default3;
        this.relaxChartXStartTime = -1L;
        this.deviceConnectedFlow = skyPlayRecordManager.getDeviceConnectedFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a(long playStartTime) {
        if (SkyServiceHelperKt.getSkyService().getPlayState() == PlayState.IDLE || playStartTime < 0) {
            return -1L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = (jCurrentTimeMillis - playStartTime) / 60000;
        long j2 = j % ((long) 30);
        HMLog.info(p, new a(j2));
        if (j < 30) {
            return playStartTime;
        }
        if (j2 == 0) {
            return jCurrentTimeMillis - BloodPressureCorrectViewModel.NEED_RETURN_TIME;
        }
        Long.signum(j2);
        return jCurrentTimeMillis - (j2 * 60000);
    }

    private final void b(long startTime) {
        Job job = this.relaxScoreJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        this.relaxScoreJob = e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SkyRealTimeViewModel$getRelaxScoreFromLocal$1(this, startTime, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(long startTime, long endTime) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(startTime, endTime, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Job job = this.minuteTimingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.minuteTimingJob = e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        Job job = this.minuteTimingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.minuteTimingJob = null;
    }

    public final void firstLoadRelaxScore() {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void firstObserveRelaxScore() {
        long jCurrentTimeMillis = this.relaxChartXStartTime;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        b(jCurrentTimeMillis);
    }

    @NotNull
    public final StateFlow<Boolean> getDeviceConnectedFlow() {
        return this.deviceConnectedFlow;
    }

    @NotNull
    public final SharedFlow<RelaxInfo> getMinuteRelaxFlow() {
        return this.minuteRelaxFlow;
    }

    @NotNull
    public final SharedFlow<List<RelaxInfo>> getRelaxInfoListFlow() {
        return this.relaxInfoListFlow;
    }

    @NotNull
    public final SharedFlow<Boolean> getResetChartFlow() {
        return this.resetChartFlow;
    }

    public final boolean isSupportSkyFeature() {
        return this.deviceApi.isSupportSkyFeature();
    }

    public final long relaxChartXEndTime() {
        long j = this.relaxChartXStartTime;
        if (j < 0) {
            return -1L;
        }
        return j + BloodPressureCorrectViewModel.NEED_RETURN_TIME;
    }

    public final long relaxChartXStartTime() {
        HMLog.info(p, new c());
        return this.relaxChartXStartTime;
    }
}
