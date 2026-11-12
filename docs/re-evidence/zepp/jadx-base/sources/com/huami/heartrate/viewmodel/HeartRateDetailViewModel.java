package com.huami.heartrate.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.core.utils.TimeUtils;
import com.huami.bigdata.statistics.heartrate.HeartRateStatistics;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.heartrate.usecase.HeartRateBigDataUseCase;
import com.huami.heartrate.utils.CoroutinueExtKt;
import com.huami.heartrate.vo.BarChartBuilder;
import com.huami.heartrate.vo.BarChartVo;
import com.huami.heartrate.vo.BarPeriodInfo;
import com.huami.heartrate.vo.StatisticsInfo;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00178\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c¨\u0006+"}, d2 = {"Lcom/huami/heartrate/viewmodel/HeartRateDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/huami/heartrate/vo/BarChartVo;", "list", "Lcom/huami/heartrate/vo/StatisticsInfo;", "statisticsInfo", "Lcom/huami/heartrate/vo/BarPeriodInfo;", "a", "", "time", "", "timeType", "", PointCategory.LOAD, "", "Ljava/lang/String;", "tag", "Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "b", "Lkotlin/Lazy;", "()Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "useCase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/vo/BarChartBuilder;", "c", "Landroidx/lifecycle/MutableLiveData;", "getChartBuilderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "chartBuilderLiveData", GoogleApiAvailabilityLight.a, "getBarPeriodInfoLiveData", "barPeriodInfoLiveData", "e", "getStatisticsLiveData", "statisticsLiveData", "Lcom/huami/bigdata/statistics/heartrate/HeartRateStatistics;", "f", "getRawData", "rawData", "userId", "<init>", "(Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "HeartRateDetailViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartBuilder> chartBuilderLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarPeriodInfo> barPeriodInfoLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<StatisticsInfo> statisticsLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HeartRateStatistics> rawData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load statistics heartRate time:" + this.a + ",timeMode:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateStatistics a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeartRateStatistics heartRateStatistics) {
            super(0);
            this.a = heartRateStatistics;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load statistics heartRate " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeartRateDetailViewModel(@NotNull String str) {
        final Scope hrScopeByUserId = HeartRateScopeKt.getHrScopeByUserId(str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.useCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HeartRateBigDataUseCase>() { // from class: com.huami.heartrate.viewmodel.HeartRateDetailViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.HeartRateBigDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HeartRateBigDataUseCase invoke() {
                return hrScopeByUserId.get(Reflection.getOrCreateKotlinClass(HeartRateBigDataUseCase.class), qualifier, objArr);
            }
        });
        this.chartBuilderLiveData = new MutableLiveData<>();
        this.barPeriodInfoLiveData = new MutableLiveData<>();
        this.statisticsLiveData = new MutableLiveData<>();
        this.rawData = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BarPeriodInfo a(List<BarChartVo> list, StatisticsInfo statisticsInfo) {
        int minValue = statisticsInfo.getMinValue();
        int maxValue = statisticsInfo.getMaxValue();
        BarChartVo barChartVo = (BarChartVo) CollectionsKt.firstOrNull((List) list);
        String extra = barChartVo == null ? null : barChartVo.getExtra();
        BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.lastOrNull((List) list);
        return new BarPeriodInfo(minValue, maxValue, extra, barChartVo2 != null ? barChartVo2.getExtra() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateBigDataUseCase b() {
        return (HeartRateBigDataUseCase) this.useCase.getValue();
    }

    @NotNull
    public final MutableLiveData<BarPeriodInfo> getBarPeriodInfoLiveData() {
        return this.barPeriodInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<BarChartBuilder> getChartBuilderLiveData() {
        return this.chartBuilderLiveData;
    }

    @NotNull
    public final MutableLiveData<HeartRateStatistics> getRawData() {
        return this.rawData;
    }

    @NotNull
    public final MutableLiveData<StatisticsInfo> getStatisticsLiveData() {
        return this.statisticsLiveData;
    }

    public final void load(long time, int timeType) {
        String strTimestampToYMD$default = TimeUtils.timestampToYMD$default(TimeUtils.INSTANCE, time, null, 2, null);
        HMLog.info(this.tag, new a(strTimestampToYMD$default, timeType));
        e.f(ViewModelKt.getViewModelScope(this), CoroutinueExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new HeartRateDetailViewModel$load$$inlined$safeLaunch$1(null, timeType, this, strTimestampToYMD$default, time), 2, null);
    }
}
