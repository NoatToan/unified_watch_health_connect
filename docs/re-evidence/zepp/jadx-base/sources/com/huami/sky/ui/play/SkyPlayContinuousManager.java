package com.huami.sky.ui.play;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.cache.SkyPlayCache;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkyWeekPlanEventKt;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "", "", "a", "", "f", "b", "g", GoogleApiAvailabilityLight.a, "e", "", "c", "startObservePlayDone", "startPlayDoneCount", "clear", "Lcom/huami/sky/lib/api/DeviceDataApi;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceApi", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "deviceStatus", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "weekPlanDataSource", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "skyServiceHelper", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "skyIOScope", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "countDownJob", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_playPlanDoneFlow", "Lkotlinx/coroutines/flow/StateFlow;", "h", "Lkotlinx/coroutines/flow/StateFlow;", "getPlayPlanDoneFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "playPlanDoneFlow", "<init>", "(Lcom/huami/sky/lib/api/DeviceDataApi;Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;Lcom/huami/sky/ui/play/SkyPlayServiceHelper;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayContinuousManager {

    @NotNull
    private static final String i = "SkyPlayContinuousManager";
    private static final int j = 300;
    private static final long k = 1000;

    @NotNull
    private static final String l = "weekPlanNeverShowCount";
    private static final int m = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISkyDeviceStatusAssistant deviceStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WeekPlanDataSource weekPlanDataSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayServiceHelper skyServiceHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private CoroutineScope skyIOScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Job countDownJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<Long> _playPlanDoneFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Long> playPlanDoneFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始连续5分钟完成计时：" + SkyPlayContinuousManager.this.weekPlanDataSource.getProgress() + ", " + SkyPlayContinuousManager.this.deviceApi.isSupportSkyFeature() + ", " + (!SkyPlayContinuousManager.this.g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            long j = this.a;
            long j2 = this.b;
            return "一次播放记录内是否打卡成功过: " + j + ", " + j2 + ", " + (j > j2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayContinuousManager$startCountDown$1", f = "SkyPlayContinuousManager.kt", i = {0}, l = {113, 115}, m = "invokeSuspend", n = {"lastTime"}, s = {"J$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public int b;

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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "开始连续播放计时：" + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayContinuousManager.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    j = this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SkyPlayContinuousManager.this.e();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            HMLog.info(SkyPlayContinuousManager.i, new a(jCurrentTimeMillis));
            this.a = jCurrentTimeMillis;
            this.b = 1;
            if (DelayKt.delay(300000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jCurrentTimeMillis;
            SkyPlayContinuousManager.this.weekPlanDataSource.markDate(new Date(j));
            MutableStateFlow mutableStateFlow = SkyPlayContinuousManager.this._playPlanDoneFlow;
            Long lBoxLong = Boxing.boxLong(j);
            this.b = 2;
            if (mutableStateFlow.emit(lBoxLong, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            SkyPlayContinuousManager.this.e();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayContinuousManager$startObservePlayDone$1", f = "SkyPlayContinuousManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<SkyDeviceStatus, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SkyDeviceStatus skyDeviceStatus, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(skyDeviceStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayContinuousManager.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyPlayContinuousManager.this.startPlayDoneCount();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/PlayState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayContinuousManager$startObservePlayDone$2", f = "SkyPlayContinuousManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<PlayState, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull PlayState playState, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(playState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayContinuousManager.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyPlayContinuousManager.this.startPlayDoneCount();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayState a;
        public final /* synthetic */ SkyDeviceStatus b;
        public final /* synthetic */ SkyPlayContinuousManager c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PlayState playState, SkyDeviceStatus skyDeviceStatus, SkyPlayContinuousManager skyPlayContinuousManager, boolean z) {
            super(0);
            this.a = playState;
            this.b = skyDeviceStatus;
            this.c = skyPlayContinuousManager;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            PlayState playState = this.a;
            SkyDeviceStatus skyDeviceStatus = this.b;
            Job job = this.c.countDownJob;
            boolean z = false;
            if (job != null && job.isActive()) {
                z = true;
            }
            return "开始连续5分钟完成计时：" + playState + ", " + skyDeviceStatus + ", " + (!z) + ", " + (!this.d);
        }
    }

    public SkyPlayContinuousManager(@NotNull DeviceDataApi deviceDataApi, @NotNull ISkyDeviceStatusAssistant iSkyDeviceStatusAssistant, @NotNull WeekPlanDataSource weekPlanDataSource, @NotNull SkyPlayServiceHelper skyPlayServiceHelper) {
        this.deviceApi = deviceDataApi;
        this.deviceStatus = iSkyDeviceStatusAssistant;
        this.weekPlanDataSource = weekPlanDataSource;
        this.skyServiceHelper = skyPlayServiceHelper;
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(-1L);
        this._playPlanDoneFlow = MutableStateFlow;
        this.playPlanDoneFlow = MutableStateFlow;
    }

    private final boolean a() {
        HMLog.info(i, new a());
        int progress = this.weekPlanDataSource.getProgress();
        return (progress >= 0 && progress <= 6) && this.deviceApi.isSupportSkyFeature() && !g() && !d();
    }

    private final void b() {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = null;
    }

    private final int c() {
        Date date$default;
        int progress;
        String startDate = this.weekPlanDataSource.getStartDate();
        int i2 = 0;
        if (startDate == null || (date$default = TimeExtKt.toDate$default(startDate, null, null, 3, null)) == null || (progress = this.weekPlanDataSource.getProgress()) < 0 || progress < 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (this.weekPlanDataSource.getDateMarked(SkyExtKt.nextDay(date$default, i2))) {
                i3++;
            }
            if (i2 == progress) {
                return i3;
            }
            i2 = i4;
        }
    }

    private final boolean d() {
        long jLongValue = this.skyServiceHelper.getPlayStartTimeFlow().getValue().longValue();
        long jLongValue2 = this.playPlanDoneFlow.getValue().longValue();
        HMLog.info(i, new b(jLongValue2, jLongValue));
        return jLongValue > 0 && jLongValue2 > 0 && jLongValue2 > jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_FINISH_E, r.mapOf(TuplesKt.to("num", String.valueOf(this.weekPlanDataSource.getWeekPlanRound())), TuplesKt.to("index", String.valueOf(this.weekPlanDataSource.getProgress() + 1)), TuplesKt.to("day", String.valueOf(c()))));
    }

    private final void f() {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = kotlinx.coroutines.e.f(this.skyIOScope, null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return SkyPlayCache.INSTANCE.getInstance().getIntWithUserId(l, 0) >= 3;
    }

    public final void clear() {
        CoroutineScopeKt.cancel$default(this.skyIOScope, null, 1, null);
    }

    @NotNull
    public final StateFlow<Long> getPlayPlanDoneFlow() {
        return this.playPlanDoneFlow;
    }

    public final void startObservePlayDone() {
        FlowKt.launchIn(FlowKt.onEach(this.deviceStatus.deviceConnectNotifiers(), new d(null)), this.skyIOScope);
        FlowKt.launchIn(FlowKt.onEach(SkyServiceHelperKt.getSkyService().listenPlayState(), new e(null)), this.skyIOScope);
    }

    public final void startPlayDoneCount() {
        PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
        SkyDeviceStatus deviceConnectStatus = this.deviceStatus.getDeviceConnectStatus();
        if (playState == PlayState.IDLE || playState == PlayState.ERROR || playState == PlayState.PAUSE) {
            b();
            return;
        }
        if (deviceConnectStatus != SkyDeviceStatus.CONNECT_SUCCESS) {
            b();
            return;
        }
        if (a()) {
            boolean dateMarked = this.weekPlanDataSource.getDateMarked(new Date());
            HMLog.info(i, new f(playState, deviceConnectStatus, this, dateMarked));
            if (playState == PlayState.PLAYING) {
                Job job = this.countDownJob;
                boolean z = false;
                if (job != null && job.isActive()) {
                    z = true;
                }
                if (z || dateMarked) {
                    return;
                }
                f();
            }
        }
    }
}
