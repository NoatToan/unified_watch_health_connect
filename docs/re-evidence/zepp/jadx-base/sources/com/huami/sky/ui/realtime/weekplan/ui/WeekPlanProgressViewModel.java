package com.huami.sky.ui.realtime.weekplan.ui;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.lib.repo.weekplan.IWeekPlanHintRepo;
import com.huami.sky.lib.repo.weekplan.WeekPlanHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanHintDO;
import com.huami.sky.lib.repo.weekplan.WeekPlanIntHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanPluralIntHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl;
import com.huami.sky.lib.repo.weekplan.WeekPlanStr;
import com.huami.sky.lib.repo.weekplan.WeekPlanStrHint;
import com.huami.sky.ui.realtime.recommendelement.RecommendServiceUsecase;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanDeepHintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanHintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanHintRequest;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanRandom2HintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanRandomHintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanScoreHintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanSleepHintHandler;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanTimeHintHandler;
import com.huami.sleep.service.SleepService;
import com.huami.sleep.service.SleepWithTonalityInfo;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010$R\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010$R\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0&8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*R!\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040&8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\bF\u0010*¨\u0006J"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "", "currentProgress", "loadHintByProgress", "", "xPosition", "setXPosition", "setEndXPosition", "loadLocalMarkedData", "loadProgress", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "weekPlanDataSource", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "b", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "recommendUseCase", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;", "c", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;", "iWeekPlanHintRepo", "Lkotlinx/coroutines/Job;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/Job;", "currentProgressJob", "Lkotlinx/coroutines/flow/SharedFlow;", "", "e", "Lkotlinx/coroutines/flow/SharedFlow;", "weekPlanSharedFlow", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "f", "Landroidx/lifecycle/MutableLiveData;", "_weekPlanHintLiveData", "Landroidx/lifecycle/LiveData;", "g", "Landroidx/lifecycle/LiveData;", "getWeekPlanHintLiveData", "()Landroidx/lifecycle/LiveData;", "weekPlanHintLiveData", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "h", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "hintHandler", "i", "_xPositionLiveData", z.j, "getXPositionLiveData", "xPositionLiveData", hl.k, "_endXPositionLiveData", "l", "getEndXPositionLiveData", "endXPositionLiveData", "", "m", "Ljava/util/List;", "randomListStrId", "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/CoroutineScope;", "innerScope", "o", "getWeekPlanLiveData", "weekPlanLiveData", com.google.android.exoplayer2.text.ttml.b.r, "getValidProgressLiveData", "validProgressLiveData", "<init>", "(Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanProgressViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeekPlanDataSource weekPlanDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecommendServiceUsecase recommendUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IWeekPlanHintRepo iWeekPlanHintRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Job currentProgressJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<boolean[]> weekPlanSharedFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WeekPlanHint> _weekPlanHintLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<WeekPlanHint> weekPlanHintLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private WeekPlanHintHandler hintHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Float> _xPositionLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Float> xPositionLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Float> _endXPositionLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Float> endXPositionLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> randomListStrId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope innerScope;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<boolean[]> weekPlanLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> validProgressLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "innerScope " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/service/SleepWithTonalityInfo;", "sleepWithTonalityInfo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$1", f = "WeekPlanProgressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<SleepWithTonalityInfo, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepWithTonalityInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepWithTonalityInfo sleepWithTonalityInfo) {
                super(0);
                this.a = sleepWithTonalityInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sleepinfo " + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0570b extends Lambda implements Function0<String> {
            public final /* synthetic */ WeekPlanHintDO a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0570b(WeekPlanHintDO weekPlanHintDO) {
                super(0);
                this.a = weekPlanHintDO;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "lastResId " + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepWithTonalityInfo sleepWithTonalityInfo, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(sleepWithTonalityInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = WeekPlanProgressViewModel.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WeekPlanHint weekPlanIntHint;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepWithTonalityInfo sleepWithTonalityInfo = (SleepWithTonalityInfo) this.b;
            HMLog.info(WeekPlanRepoImpl.TAG, new a(sleepWithTonalityInfo));
            String timeString$default = TimeExtKt.toTimeString$default(new Date(), (String) null, (Locale) null, 3, (Object) null);
            if (timeString$default != null) {
                WeekPlanProgressViewModel weekPlanProgressViewModel = WeekPlanProgressViewModel.this;
                WeekPlanHintDO lastRes = weekPlanProgressViewModel.iWeekPlanHintRepo.getLastRes(timeString$default);
                HMLog.info(WeekPlanRepoImpl.TAG, new C0570b(lastRes));
                if (lastRes == null) {
                    WeekPlanHintHandler weekPlanHintHandler = weekPlanProgressViewModel.hintHandler;
                    Objects.requireNonNull(weekPlanHintHandler);
                    WeekPlanHint weekPlanHintHandleRequest = weekPlanHintHandler.handleRequest(new WeekPlanHintRequest(sleepWithTonalityInfo, null, 2, null));
                    weekPlanProgressViewModel._weekPlanHintLiveData.postValue(weekPlanHintHandleRequest);
                    weekPlanProgressViewModel.iWeekPlanHintRepo.saveLastRes(timeString$default, weekPlanHintHandleRequest);
                } else if (lastRes.isToday()) {
                    int type = lastRes.getWeekPlanHintPO().getType();
                    if (type != 2) {
                        weekPlanIntHint = type != 3 ? new WeekPlanStr(lastRes.getWeekPlanHintPO().getStrId()) : new WeekPlanStrHint(lastRes.getWeekPlanHintPO().getStrId(), lastRes.getWeekPlanHintPO().getValue());
                    } else {
                        weekPlanIntHint = new WeekPlanIntHint(lastRes.getWeekPlanHintPO().getStrId(), lastRes.getWeekPlanHintPO().getValue());
                    }
                    weekPlanProgressViewModel._weekPlanHintLiveData.postValue(weekPlanIntHint);
                } else {
                    WeekPlanHintHandler weekPlanHintHandler2 = weekPlanProgressViewModel.hintHandler;
                    Objects.requireNonNull(weekPlanHintHandler2);
                    WeekPlanHint weekPlanHintHandleRequest2 = weekPlanHintHandler2.handleRequest(new WeekPlanHintRequest(sleepWithTonalityInfo, Boxing.boxInt(lastRes.getWeekPlanHintPO().getStrId())));
                    weekPlanProgressViewModel.iWeekPlanHintRepo.saveLastRes(timeString$default, weekPlanHintHandleRequest2);
                    weekPlanProgressViewModel._weekPlanHintLiveData.postValue(weekPlanHintHandleRequest2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$2", f = "WeekPlanProgressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super SleepWithTonalityInfo>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sleep error " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super SleepWithTonalityInfo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(WeekPlanRepoImpl.TAG, new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$5", f = "WeekPlanProgressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ int b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "size " + this.a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(int i, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = WeekPlanProgressViewModel.this.new d(continuation);
            dVar.b = ((Number) obj).intValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return a(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.b;
            HMLog.info(WeekPlanRepoImpl.TAG, new a(i));
            WeekPlanProgressViewModel.this._weekPlanHintLiveData.postValue(new WeekPlanPluralIntHint(i > 2 ? 9 : 10, i));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$6", f = "WeekPlanProgressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "size exception " + this.a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.b = th;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(WeekPlanRepoImpl.TAG, new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    public WeekPlanProgressViewModel(@NotNull WeekPlanDataSource weekPlanDataSource, @NotNull RecommendServiceUsecase recommendServiceUsecase, @NotNull IWeekPlanHintRepo iWeekPlanHintRepo) {
        this.weekPlanDataSource = weekPlanDataSource;
        this.recommendUseCase = recommendServiceUsecase;
        this.iWeekPlanHintRepo = iWeekPlanHintRepo;
        Flow<boolean[]> weekPlanFlow = weekPlanDataSource.getWeekPlanFlow();
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        SharedFlow<boolean[]> sharedFlowShareIn = FlowKt.shareIn(weekPlanFlow, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.weekPlanSharedFlow = sharedFlowShareIn;
        MutableLiveData<WeekPlanHint> mutableLiveData = new MutableLiveData<>();
        this._weekPlanHintLiveData = mutableLiveData;
        this.weekPlanHintLiveData = mutableLiveData;
        MutableLiveData<Float> mutableLiveData2 = new MutableLiveData<>();
        this._xPositionLiveData = mutableLiveData2;
        this.xPositionLiveData = mutableLiveData2;
        MutableLiveData<Float> mutableLiveData3 = new MutableLiveData<>();
        this._endXPositionLiveData = mutableLiveData3;
        this.endXPositionLiveData = mutableLiveData3;
        this.randomListStrId = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3});
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new WeekPlanProgressViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)));
        this.innerScope = CoroutineScope;
        this.weekPlanLiveData = FlowLiveDataConversions.asLiveData$default(sharedFlowShareIn, CoroutineScope.getCoroutineContext().plus(Dispatchers.getMain()), 0L, 2, (Object) null);
        final Flow<Integer> progressFlow = weekPlanDataSource.getProgressFlow();
        this.validProgressLiveData = FlowLiveDataConversions.asLiveData$default(FlowKt.shareIn(new Flow<Integer>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Integer> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ WeekPlanProgressViewModel b;

                /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$special$$inlined$map$1$2", f = "WeekPlanProgressViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, WeekPlanProgressViewModel weekPlanProgressViewModel) {
                    this.a = flowCollector;
                    this.b = weekPlanProgressViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Integer num, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        int iIntValue = num.intValue();
                        boolean z = false;
                        if (iIntValue >= 0 && iIntValue <= 6) {
                            z = true;
                        }
                        Integer numBoxInt = z ? Boxing.boxInt(this.b.weekPlanDataSource.getProgress()) : null;
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = progressFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), CoroutineScope.getCoroutineContext().plus(Dispatchers.getMain()), 0L, 2, (Object) null);
        a();
        weekPlanDataSource.refreshChannel();
    }

    private final void a() {
        this.hintHandler = new WeekPlanRandomHintHandler(this.randomListStrId);
        WeekPlanRandom2HintHandler weekPlanRandom2HintHandler = new WeekPlanRandom2HintHandler(this.randomListStrId);
        WeekPlanSleepHintHandler weekPlanSleepHintHandler = new WeekPlanSleepHintHandler(5);
        WeekPlanDeepHintHandler weekPlanDeepHintHandler = new WeekPlanDeepHintHandler(6);
        WeekPlanScoreHintHandler weekPlanScoreHintHandler = new WeekPlanScoreHintHandler(7);
        WeekPlanTimeHintHandler weekPlanTimeHintHandler = new WeekPlanTimeHintHandler(8);
        weekPlanTimeHintHandler.setNextHandler(weekPlanRandom2HintHandler);
        weekPlanScoreHintHandler.setNextHandler(weekPlanTimeHintHandler);
        weekPlanDeepHintHandler.setNextHandler(weekPlanScoreHintHandler);
        weekPlanSleepHintHandler.setNextHandler(weekPlanDeepHintHandler);
        WeekPlanHintHandler weekPlanHintHandler = this.hintHandler;
        Objects.requireNonNull(weekPlanHintHandler);
        weekPlanHintHandler.setNextHandler(weekPlanSleepHintHandler);
    }

    @NotNull
    public final LiveData<Float> getEndXPositionLiveData() {
        return this.endXPositionLiveData;
    }

    @NotNull
    public final LiveData<Integer> getValidProgressLiveData() {
        return this.validProgressLiveData;
    }

    @NotNull
    public final LiveData<WeekPlanHint> getWeekPlanHintLiveData() {
        return this.weekPlanHintLiveData;
    }

    @NotNull
    public final LiveData<boolean[]> getWeekPlanLiveData() {
        return this.weekPlanLiveData;
    }

    @NotNull
    public final LiveData<Float> getXPositionLiveData() {
        return this.xPositionLiveData;
    }

    public final void loadHintByProgress(int currentProgress) {
        Flow<SleepWithTonalityInfo> flowFetchTodaySleepInfoWithTonality;
        Flow flowFlowOn;
        Flow flowOnEach;
        Flow flowM4456catch;
        if (currentProgress == 0) {
            this._weekPlanHintLiveData.postValue(new WeekPlanStr(4));
            return;
        }
        boolean z = false;
        if (1 <= currentProgress && currentProgress <= 5) {
            z = true;
        }
        Job jobLaunchIn = null;
        if (!z) {
            if (currentProgress == 6) {
                Job job = this.currentProgressJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                final SharedFlow<boolean[]> sharedFlow = this.weekPlanSharedFlow;
                final Flow<List<? extends Boolean>> flow = new Flow<List<? extends Boolean>>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$1

                    /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass2 implements FlowCollector<boolean[]> {
                        public final /* synthetic */ FlowCollector a;

                        /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$1$2", f = "WeekPlanProgressViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object a;
                            public int b;
                            public Object c;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.a = obj;
                                this.b |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.a = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(boolean[] zArr, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.b;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.b = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj = anonymousClass1.a;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.b;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = this.a;
                                List<Boolean> list = ArraysKt___ArraysKt.toList(zArr);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (Boxing.boxBoolean(((Boolean) obj2).booleanValue()).booleanValue()) {
                                        arrayList.add(obj2);
                                    }
                                }
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super List<? extends Boolean>> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.currentProgressJob = FlowKt.launchIn(FlowKt.m4456catch(FlowKt.onEach(new Flow<Integer>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$2

                    /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$2$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass2 implements FlowCollector<List<? extends Boolean>> {
                        public final /* synthetic */ FlowCollector a;

                        /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$2$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel$loadHintByProgress$$inlined$map$2$2", f = "WeekPlanProgressViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object a;
                            public int b;
                            public Object c;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.a = obj;
                                this.b |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.a = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(List<? extends Boolean> list, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.b;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.b = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj = anonymousClass1.a;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.b;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = this.a;
                                Integer numBoxInt = Boxing.boxInt(list.size());
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new d(null)), new e(null)), this.innerScope);
                return;
            }
            return;
        }
        Job job2 = this.currentProgressJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        SleepService sleepService = this.recommendUseCase.getSleepService();
        if (sleepService != null && (flowFetchTodaySleepInfoWithTonality = sleepService.fetchTodaySleepInfoWithTonality()) != null && (flowFlowOn = FlowKt.flowOn(flowFetchTodaySleepInfoWithTonality, Dispatchers.getIO())) != null && (flowOnEach = FlowKt.onEach(flowFlowOn, new b(null))) != null && (flowM4456catch = FlowKt.m4456catch(flowOnEach, new c(null))) != null) {
            jobLaunchIn = FlowKt.launchIn(flowM4456catch, this.innerScope);
        }
        this.currentProgressJob = jobLaunchIn;
    }

    public final void loadLocalMarkedData() {
        this.weekPlanDataSource.refreshChannel();
    }

    public final void loadProgress() {
        this.weekPlanDataSource.refreshProgressChannel();
    }

    public final void setEndXPosition(float xPosition) {
        this._endXPositionLiveData.postValue(Float.valueOf(xPosition));
    }

    public final void setXPosition(float xPosition) {
        this._xPositionLiveData.postValue(Float.valueOf(xPosition));
    }
}
