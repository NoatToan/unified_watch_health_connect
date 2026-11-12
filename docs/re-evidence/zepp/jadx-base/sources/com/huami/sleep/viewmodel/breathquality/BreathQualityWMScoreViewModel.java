package com.huami.sleep.viewmodel.breathquality;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.vo.BreathQualityWMScoreVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007R\u0019\u0010\u0011\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/sleep/viewmodel/breathquality/BreathQualityWMScoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/sleep/model/BreathQualityRiskLevel;", FirebaseAnalytics.Param.LEVEL, "", "a", "userId", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "", "getScoreAndCostLiveData", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "getRepo", "()Lcom/huami/sleep/repo/IBreathQualityRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "b", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "scoreAndCostLiveData", "Landroidx/lifecycle/LiveData;", "", "c", "Landroidx/lifecycle/LiveData;", "getEmptyDataLive", "()Landroidx/lifecycle/LiveData;", "emptyDataLive", "<init>", "(Lcom/huami/sleep/repo/IBreathQualityRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityWMScoreViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scoreAndCostLiveData = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> emptyDataLive = Transformations.map(getScoreAndCostLiveData(), new Function<BreathQualityWMScoreVo, Boolean>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$special$$inlined$map$1
        @Override // androidx.arch.core.util.Function
        public final Boolean apply(BreathQualityWMScoreVo breathQualityWMScoreVo) {
            return Boolean.valueOf(breathQualityWMScoreVo.getChartData().size() == 0);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BreathQualityRiskLevel.values().length];
            iArr[BreathQualityRiskLevel.HIGH.ordinal()] = 1;
            iArr[BreathQualityRiskLevel.MEDIUM.ordinal()] = 2;
            iArr[BreathQualityRiskLevel.LOW.ordinal()] = 3;
            iArr[BreathQualityRiskLevel.NORMAL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<BreathQualityWMScoreVo>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<BreathQualityWMScoreVo> getA() {
            return new MutableLiveData<>();
        }
    }

    /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$getScoreAndCostLiveData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$getScoreAndCostLiveData$1", f = "BreathQualityWMScoreViewModel.kt", i = {}, l = {46, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TimeMode b;
        public final /* synthetic */ long c;
        public final /* synthetic */ BreathQualityWMScoreViewModel d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$getScoreAndCostLiveData$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimeMode.values().length];
                iArr[TimeMode.WEEK.ordinal()] = 1;
                iArr[TimeMode.MONTH.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$getScoreAndCostLiveData$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel$getScoreAndCostLiveData$1$1", f = "BreathQualityWMScoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<BreathQualityWMScoreVo, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ BreathQualityWMScoreViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BreathQualityWMScoreViewModel breathQualityWMScoreViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = breathQualityWMScoreViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull BreathQualityWMScoreVo breathQualityWMScoreVo, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(breathQualityWMScoreVo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BreathQualityWMScoreVo breathQualityWMScoreVo = (BreathQualityWMScoreVo) this.b;
                breathQualityWMScoreVo.setTopRiskDesc(this.c.a(breathQualityWMScoreVo.getTopRisk()));
                this.c.getScoreAndCostLiveData().postValue(breathQualityWMScoreVo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMode timeMode, long j, BreathQualityWMScoreViewModel breathQualityWMScoreViewModel, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = timeMode;
            this.c = j;
            this.d = breathQualityWMScoreViewModel;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair pair;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i2 == 1) {
                SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
                pair = new Pair(Boxing.boxLong(sleepTimeUtil.getFirstDayOfWeekTime(this.c)), Boxing.boxLong(sleepTimeUtil.getLastDayOfWeekTime(this.c)));
            } else if (i2 != 2) {
                pair = new Pair(Boxing.boxLong(this.c), Boxing.boxLong(this.c));
            } else {
                SleepTimeUtil sleepTimeUtil2 = SleepTimeUtil.INSTANCE;
                pair = new Pair(Boxing.boxLong(sleepTimeUtil2.getFirstDayOfMonthTime(this.c)), Boxing.boxLong(sleepTimeUtil2.getLastDayOfMonthTime(this.c)));
            }
            IBreathQualityRepo repo = this.d.getRepo();
            Context appContext = KoinExtKt.getAppContext();
            String str = this.e;
            TimeMode timeMode = this.b;
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            this.a = 1;
            obj = repo.getMWScoreShowInfo(appContext, str, timeMode, jLongValue, jLongValue2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            a aVar = new a(this.d, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) obj, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public BreathQualityWMScoreViewModel(@NotNull IBreathQualityRepo iBreathQualityRepo) {
        this.repo = iBreathQualityRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(BreathQualityRiskLevel level) {
        int i = level == null ? -1 : WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            return KoinExtKt.getAppContext().getResources().getString(R.string.risk_level_high);
        }
        if (i == 2) {
            return KoinExtKt.getAppContext().getResources().getString(R.string.risk_level_medium);
        }
        if (i != 3) {
            return i != 4 ? "" : KoinExtKt.getAppContext().getResources().getString(R.string.risk_level_normal);
        }
        return KoinExtKt.getAppContext().getResources().getString(R.string.risk_level_low);
    }

    @NotNull
    public final LiveData<Boolean> getEmptyDataLive() {
        return this.emptyDataLive;
    }

    @NotNull
    public final IBreathQualityRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final MutableLiveData<BreathQualityWMScoreVo> getScoreAndCostLiveData() {
        return (MutableLiveData) this.scoreAndCostLiveData.getValue();
    }

    @ExperimentalCoroutinesApi
    public final void getScoreAndCostLiveData(@NotNull String userId, @NotNull TimeMode timeMode, long time) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(timeMode, time, this, userId, null), 3, null);
    }
}
