package com.huami.bodymeasurements.temperature.viewmodel.detail;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TempStatisticsInfo;
import com.huami.bodymeasurements.temperature.view.vo.chart.TempMixLineChartBuilder;
import com.huami.bodymeasurements.temperature.viewmodel.coroutines.ExtKt;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR'\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR'\u0010#\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u001e0\u001e0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDayDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "", "userId", "", "loadData", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "a", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "useCase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "b", "Landroidx/lifecycle/MutableLiveData;", "_statisticsInfoLiveData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "getStatisticsInfoLiveData", "()Landroidx/lifecycle/LiveData;", "statisticsInfoLiveData", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", GoogleApiAvailabilityLight.a, "_latestValueLiveData", "e", "getLatestValueLiveData", "latestValueLiveData", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "f", "_chartBuilderLiveData", "g", "getChartBuilderLiveData", "chartBuilderLiveData", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempDayDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetLocalTempListBetweenTimeUseCase useCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TempStatisticsInfo> _statisticsInfoLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<TempStatisticsInfo> statisticsInfoLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ChartDataVo> _latestValueLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ChartDataVo> latestValueLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TempMixLineChartBuilder> _chartBuilderLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<TempMixLineChartBuilder> chartBuilderLiveData;

    public TempDayDetailViewModel(@NotNull GetLocalTempListBetweenTimeUseCase getLocalTempListBetweenTimeUseCase) {
        this.useCase = getLocalTempListBetweenTimeUseCase;
        MutableLiveData<TempStatisticsInfo> mutableLiveData = new MutableLiveData<>();
        this._statisticsInfoLiveData = mutableLiveData;
        this.statisticsInfoLiveData = Transformations.map(mutableLiveData, new Function<TempStatisticsInfo, TempStatisticsInfo>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final TempStatisticsInfo apply(TempStatisticsInfo tempStatisticsInfo) {
                return tempStatisticsInfo;
            }
        });
        MutableLiveData<ChartDataVo> mutableLiveData2 = new MutableLiveData<>();
        this._latestValueLiveData = mutableLiveData2;
        this.latestValueLiveData = Transformations.map(mutableLiveData2, new Function<ChartDataVo, ChartDataVo>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final ChartDataVo apply(ChartDataVo chartDataVo) {
                return chartDataVo;
            }
        });
        MutableLiveData<TempMixLineChartBuilder> mutableLiveData3 = new MutableLiveData<>();
        this._chartBuilderLiveData = mutableLiveData3;
        this.chartBuilderLiveData = Transformations.map(mutableLiveData3, new Function<TempMixLineChartBuilder, TempMixLineChartBuilder>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final TempMixLineChartBuilder apply(TempMixLineChartBuilder tempMixLineChartBuilder) {
                return tempMixLineChartBuilder;
            }
        });
    }

    @NotNull
    public final LiveData<TempMixLineChartBuilder> getChartBuilderLiveData() {
        return this.chartBuilderLiveData;
    }

    @NotNull
    public final LiveData<ChartDataVo> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final LiveData<TempStatisticsInfo> getStatisticsInfoLiveData() {
        return this.statisticsInfoLiveData;
    }

    public final void loadData(long time, @NotNull String userId) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempDayDetailViewModel$loadData$$inlined$safeLaunch$1(null, time, this, userId), 2, null);
    }
}
