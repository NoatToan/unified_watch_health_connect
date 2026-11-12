package com.huami.bloodoxygen.ui.business.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenStatistics;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.usecase.bigdata.GetClickSpo2BigDataUseCase;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetLocalClickSpo2ListFlowUseCase;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.ui.coroutines.ExtKt;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.vo.ChartParams;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006\""}, d2 = {"Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "time", "", PointCategory.LOAD, "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLocalClickSpo2ListFlowUseCase;", "a", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLocalClickSpo2ListFlowUseCase;", "getLocalClickSpo2ListFlowUseCase", "Lcom/huami/bloodoxygen/core/usecase/bigdata/GetClickSpo2BigDataUseCase;", "b", "Lcom/huami/bloodoxygen/core/usecase/bigdata/GetClickSpo2BigDataUseCase;", "clickSpo2BigDataUseCase", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", "c", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bloodoxygen/ui/vo/ChartParams;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getChartBuilderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "chartBuilderLiveData", "Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenStatistics;", "e", "getStatisticsLiveData", "statisticsLiveData", "<init>", "(Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLocalClickSpo2ListFlowUseCase;Lcom/huami/bloodoxygen/core/usecase/bigdata/GetClickSpo2BigDataUseCase;Lcom/huami/bloodoxygen/ui/dto/TimeMode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenDetailViewModel extends ViewModel {

    @NotNull
    private static final String f = "BloodOxygenDetailViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetLocalClickSpo2ListFlowUseCase getLocalClickSpo2ListFlowUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetClickSpo2BigDataUseCase clickSpo2BigDataUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TimeMode timeMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ChartParams> chartBuilderLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodOxygenStatistics> statisticsLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ BloodOxygenDetailViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, BloodOxygenDetailViewModel bloodOxygenDetailViewModel) {
            super(0);
            this.a = str;
            this.b = bloodOxygenDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BloodOxygenDetailViewModel load statistics bloodoxygen time:" + this.a + ",timeMode:" + this.b.timeMode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ClickMeasuredSpo2> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<ClickMeasuredSpo2> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BloodOxygenDetailViewModel collect " + BloodOxygenDetailViewModel.this.hashCode() + " " + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenStatistics a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BloodOxygenStatistics bloodOxygenStatistics) {
            super(0);
            this.a = bloodOxygenStatistics;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BloodOxygenDetailViewModel load statistics bloodoxygen " + new Gson().toJson(this.a);
        }
    }

    public BloodOxygenDetailViewModel(@NotNull GetLocalClickSpo2ListFlowUseCase getLocalClickSpo2ListFlowUseCase, @NotNull GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase, @NotNull TimeMode timeMode) {
        this.getLocalClickSpo2ListFlowUseCase = getLocalClickSpo2ListFlowUseCase;
        this.clickSpo2BigDataUseCase = getClickSpo2BigDataUseCase;
        this.timeMode = timeMode;
    }

    @NotNull
    public final MutableLiveData<ChartParams> getChartBuilderLiveData() {
        return this.chartBuilderLiveData;
    }

    @NotNull
    public final MutableLiveData<BloodOxygenStatistics> getStatisticsLiveData() {
        return this.statisticsLiveData;
    }

    public final void load(@NotNull Context context, long time) {
        String strTimestampToYMD = BloodOxygenUtils.INSTANCE.timestampToYMD(time);
        HMLog.info$default(null, new a(strTimestampToYMD, this), 1, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1(null, this, time, strTimestampToYMD, context), 2, null);
    }
}
