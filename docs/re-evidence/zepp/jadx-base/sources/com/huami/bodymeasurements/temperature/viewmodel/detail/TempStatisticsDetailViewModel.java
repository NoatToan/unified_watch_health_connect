package com.huami.bodymeasurements.temperature.viewmodel.detail;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.BarChartBuilder;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TempStatisticsInfo;
import com.huami.bodymeasurements.temperature.viewmodel.coroutines.ExtKt;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R'\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000e0\u000e0\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R'\u0010$\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u001f0\u001f0\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempStatisticsDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "dateMode", "", "time", "userId", "", "loadData", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "a", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "useCase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "b", "Landroidx/lifecycle/MutableLiveData;", "_statisticsInfoLiveData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "getStatisticsInfoLiveData", "()Landroidx/lifecycle/LiveData;", "statisticsInfoLiveData", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", GoogleApiAvailabilityLight.a, "_latestValueLiveData", "e", "getLatestValueLiveData", "latestValueLiveData", "Lcom/huami/bodymeasurements/common/chart/BarChartBuilder;", "f", "_chartBuilderLiveData", "g", "getChartBuilderLiveData", "chartBuilderLiveData", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempStatisticsDetailViewModel extends ViewModel {

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
    private final MutableLiveData<BarChartVo> _latestValueLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<BarChartVo> latestValueLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartBuilder> _chartBuilderLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<BarChartBuilder> chartBuilderLiveData;

    public TempStatisticsDetailViewModel(@NotNull GetLocalTempListBetweenTimeUseCase getLocalTempListBetweenTimeUseCase) {
        this.useCase = getLocalTempListBetweenTimeUseCase;
        MutableLiveData<TempStatisticsInfo> mutableLiveData = new MutableLiveData<>();
        this._statisticsInfoLiveData = mutableLiveData;
        this.statisticsInfoLiveData = Transformations.map(mutableLiveData, new Function<TempStatisticsInfo, TempStatisticsInfo>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final TempStatisticsInfo apply(TempStatisticsInfo tempStatisticsInfo) {
                return tempStatisticsInfo;
            }
        });
        MutableLiveData<BarChartVo> mutableLiveData2 = new MutableLiveData<>();
        this._latestValueLiveData = mutableLiveData2;
        this.latestValueLiveData = Transformations.map(mutableLiveData2, new Function<BarChartVo, BarChartVo>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final BarChartVo apply(BarChartVo barChartVo) {
                return barChartVo;
            }
        });
        MutableLiveData<BarChartBuilder> mutableLiveData3 = new MutableLiveData<>();
        this._chartBuilderLiveData = mutableLiveData3;
        this.chartBuilderLiveData = Transformations.map(mutableLiveData3, new Function<BarChartBuilder, BarChartBuilder>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final BarChartBuilder apply(BarChartBuilder barChartBuilder) {
                return barChartBuilder;
            }
        });
    }

    @NotNull
    public final LiveData<BarChartBuilder> getChartBuilderLiveData() {
        return this.chartBuilderLiveData;
    }

    @NotNull
    public final LiveData<BarChartVo> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final LiveData<TempStatisticsInfo> getStatisticsInfoLiveData() {
        return this.statisticsInfoLiveData;
    }

    public final void loadData(@NotNull String dateMode, long time, @NotNull String userId) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(null, time, dateMode, this, userId), 2, null);
    }
}
