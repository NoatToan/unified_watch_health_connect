package com.xiaomi.hm.health.healthdata.ui.viewmodel.stress;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StatisticsStressDetailData;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b$\u0010%J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR'\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001a¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressStatisticsDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "loadStatisticsStress", "(Ljava/lang/Long;Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;)V", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "a", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "combineUseCase", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "b", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "chartRep", "", "kotlin.jvm.PlatformType", "c", "Ljava/lang/String;", "tag", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getTimeMode", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StatisticsStressDetailData;", "e", "getDetailDataLiveData", "detailDataLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "f", "getLatestValueLiveData", "latestValueLiveData", "<init>", "(Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressStatisticsDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetCombineStressBetweenStampUseCase combineUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChartRepo chartRep;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String tag = StressStatisticsDetailViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeMode> timeMode = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<StatisticsStressDetailData> detailDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartVo<Number>> latestValueLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ TimeMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, TimeMode timeMode) {
            super(0);
            this.a = l;
            this.b = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadStatisticsStress time:" + this.a + ",timeMode :" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressStatisticsDetailViewModel$loadStatisticsStress$2$1", f = "StressStatisticsDetailViewModel.kt", i = {0}, l = {52}, m = "invokeSuspend", n = {"date"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Long c;
        public final /* synthetic */ TimeMode d;
        public final /* synthetic */ StressStatisticsDetailViewModel e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<SingleStress> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<SingleStress> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "raw combine stress:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l, TimeMode timeMode, StressStatisticsDetailViewModel stressStatisticsDetailViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = l;
            this.d = timeMode;
            this.e = stressStatisticsDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Date date;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Pair<Long, Long> timeRangeByTimeMode = HealthDataTimeUtils.INSTANCE.getTimeRangeByTimeMode(new Date(this.c.longValue()), this.d);
                Date date2 = new Date(this.c.longValue());
                GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase = this.e.combineUseCase;
                long jLongValue = timeRangeByTimeMode.getFirst().longValue();
                long jLongValue2 = timeRangeByTimeMode.getSecond().longValue();
                this.a = date2;
                this.b = 1;
                obj = getCombineStressBetweenStampUseCase.execute(jLongValue, jLongValue2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                date = date2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                date = (Date) this.a;
                ResultKt.throwOnFailure(obj);
            }
            List<SingleStress> list = (List) obj;
            HMLog.debug(this.e.tag, new a(list));
            StatisticsStressDetailData statisticsStressDetailData = StressDataHelper.INSTANCE.getStatisticsStressDetailData(list, date, this.d);
            StressStatisticsDetailViewModel stressStatisticsDetailViewModel = this.e;
            statisticsStressDetailData.setBarChartBuilder(stressStatisticsDetailViewModel.chartRep.getBarChartBuilder(date, this.d, statisticsStressDetailData.getChartData(), StressDataType.ALL_DAY));
            this.e.getDetailDataLiveData().postValue(statisticsStressDetailData);
            this.e.getLatestValueLiveData().postValue(CollectionsKt.lastOrNull((List) statisticsStressDetailData.getChartData()));
            return Unit.INSTANCE;
        }
    }

    public StressStatisticsDetailViewModel(@NotNull GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase, @NotNull ChartRepo chartRepo) {
        this.combineUseCase = getCombineStressBetweenStampUseCase;
        this.chartRep = chartRepo;
    }

    @NotNull
    public final MutableLiveData<StatisticsStressDetailData> getDetailDataLiveData() {
        return this.detailDataLiveData;
    }

    @NotNull
    public final MutableLiveData<BarChartVo<Number>> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final MutableLiveData<TimeMode> getTimeMode() {
        return this.timeMode;
    }

    public final void loadStatisticsStress(@Nullable Long time, @Nullable TimeMode timeMode) {
        HMLog.info(this.tag, new a(time, timeMode));
        if (timeMode == null || time == null) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new StressStatisticsDetailViewModel$loadStatisticsStress$$inlined$safeLaunch$default$1(null, time, timeMode, this), 2, null);
    }
}
