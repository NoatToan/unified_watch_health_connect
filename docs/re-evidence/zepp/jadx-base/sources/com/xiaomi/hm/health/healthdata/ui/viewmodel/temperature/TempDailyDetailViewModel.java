package com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.view.TempSubLineAndPointChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempDailyDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "", "loadData", "Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "a", "Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "dataUseCase", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "b", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "chartRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "c", "Landroidx/lifecycle/MutableLiveData;", "getStatisticsInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statisticsInfoLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", GoogleApiAvailabilityLight.a, "getLatestValueLiveData", "latestValueLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/view/TempSubLineAndPointChartBuilder;", "e", "getChartBuilderLiveData", "chartBuilderLiveData", "<init>", "(Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempDailyDetailViewModel extends ViewModel {

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
    private final MutableLiveData<HealthChartDataVo> latestValueLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TempSubLineAndPointChartBuilder> chartBuilderLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ List<Temperature> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, List<Temperature> list) {
            super(0);
            this.a = j;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load daily temp date:" + HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(this.a) + "\ntempList:" + this.b;
        }
    }

    public TempDailyDetailViewModel(@NotNull GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, @NotNull ChartRepo chartRepo) {
        this.dataUseCase = getAllTypeTempBetweenTimeStampUseCase;
        this.chartRepo = chartRepo;
    }

    @NotNull
    public final MutableLiveData<TempSubLineAndPointChartBuilder> getChartBuilderLiveData() {
        return this.chartBuilderLiveData;
    }

    @NotNull
    public final MutableLiveData<HealthChartDataVo> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final MutableLiveData<TempStatisticsInfo> getStatisticsInfoLiveData() {
        return this.statisticsInfoLiveData;
    }

    public final void loadData(long time) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1(null, time, this), 2, null);
    }
}
