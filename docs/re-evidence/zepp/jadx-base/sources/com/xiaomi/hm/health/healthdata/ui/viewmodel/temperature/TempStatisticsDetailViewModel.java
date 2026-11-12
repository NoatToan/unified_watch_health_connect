package com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.dto.DataLoadParam;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.StatisticsTempDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempStatisticsDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "", "loadData", "Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "a", "Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "dataUseCase", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "b", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "chartRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "c", "Landroidx/lifecycle/MutableLiveData;", "getStatisticsInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statisticsInfoLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", GoogleApiAvailabilityLight.a, "getLatestValueLiveData", "latestValueLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "e", "getBarChartBuilderLiveData", "setBarChartBuilderLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "barChartBuilderLiveData", "<init>", "(Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempStatisticsDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetAllTypeTempBetweenTimeStampUseCase dataUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChartRepo chartRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TempStatisticsInfo> statisticsInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartVo<Number>> latestValueLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<BarChartBuilder<Number>> barChartBuilderLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ DataLoadParam a;
        public final /* synthetic */ List<Temperature> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataLoadParam dataLoadParam, List<Temperature> list) {
            super(0);
            this.a = dataLoadParam;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load statistics temperature date:" + this.a + "\ntempList:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StatisticsTempDetailData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StatisticsTempDetailData statisticsTempDetailData) {
            super(0);
            this.a = statisticsTempDetailData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "detail:" + this.a;
        }
    }

    public TempStatisticsDetailViewModel(@NotNull GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, @NotNull ChartRepo chartRepo) {
        this.dataUseCase = getAllTypeTempBetweenTimeStampUseCase;
        this.chartRepo = chartRepo;
    }

    @NotNull
    public final MutableLiveData<BarChartBuilder<Number>> getBarChartBuilderLiveData() {
        return this.barChartBuilderLiveData;
    }

    @NotNull
    public final MutableLiveData<BarChartVo<Number>> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final MutableLiveData<TempStatisticsInfo> getStatisticsInfoLiveData() {
        return this.statisticsInfoLiveData;
    }

    public final void loadData(@NotNull TimeMode timeMode, long time) {
        if (timeMode == TimeMode.DAY) {
            return;
        }
        Pair<Date, Date> dateRangeByTimeMode = HealthDataTimeUtils.INSTANCE.getDateRangeByTimeMode(time, timeMode);
        DataLoadParam dataLoadParam = new DataLoadParam(timeMode, dateRangeByTimeMode.getFirst(), dateRangeByTimeMode.getSecond());
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(null, dateRangeByTimeMode, this, time, timeMode, dataLoadParam), 2, null);
    }

    public final void setBarChartBuilderLiveData(@NotNull MutableLiveData<BarChartBuilder<Number>> mutableLiveData) {
        this.barChartBuilderLiveData = mutableLiveData;
    }
}
