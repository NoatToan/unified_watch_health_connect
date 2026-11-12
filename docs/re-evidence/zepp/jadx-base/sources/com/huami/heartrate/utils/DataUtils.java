package com.huami.heartrate.utils;

import android.util.SparseArray;
import com.huami.bigdata.statistics.heartrate.HeartRateDateData;
import com.huami.bigdata.statistics.heartrate.HeartRateStatistics;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.heartrate.chart.ChartDataConverterKt;
import com.huami.heartrate.chart.HRChartHelperKt;
import com.huami.heartrate.dto.BarDto;
import com.huami.heartrate.vo.BarChartBuilder;
import com.huami.heartrate.vo.BarChartVo;
import com.huami.heartrate.vo.StatisticsDetailData;
import com.huami.heartrate.vo.StatisticsInfo;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/heartrate/utils/DataUtils;", "", "Ljava/util/Date;", "date", "", SleepAnalysisFragment.TIME_MODE, "maxValue", "", "Lcom/huami/bigdata/statistics/heartrate/HeartRateDateData;", "data", "Lcom/huami/heartrate/vo/BarChartBuilder;", "a", "Lcom/huami/bigdata/statistics/heartrate/HeartRateStatistics;", "dateStatistics", "Lcom/huami/heartrate/vo/StatisticsDetailData;", "getStatisticsDetailData", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class DataUtils {

    @NotNull
    public static final DataUtils INSTANCE = new DataUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DataUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBarChartBuilder data is null or empty";
        }
    }

    private DataUtils() {
    }

    private final BarChartBuilder a(Date date, int timeMode, int maxValue, List<HeartRateDateData> data) {
        List<BarChartVo> weekBarChartDataList;
        SparseArray<XAxisData> xAxisData = HRChartHelperKt.getXAxisData(timeMode, date);
        SparseArray<YAxisData> yAxisData = HRChartHelperKt.getYAxisData((int) HRChartHelperKt.getRoundUpTen(maxValue));
        if (data == null || data.isEmpty()) {
            HMLog.info(TAG, a.a);
            BarChartBuilder barChartBuilder = new BarChartBuilder(null, 1, null);
            barChartBuilder.setXAxisData(xAxisData);
            barChartBuilder.setYAxisData(yAxisData);
            return barChartBuilder;
        }
        List<BarDto> barDtoList = ChartDataConverterKt.toBarDtoList(data, timeMode);
        if (timeMode != 17) {
            weekBarChartDataList = timeMode != 18 ? ChartDataConverterKt.toYearBarChartDataList(barDtoList) : ChartDataConverterKt.toMonthBarChartDataList(barDtoList);
        } else {
            weekBarChartDataList = ChartDataConverterKt.toWeekBarChartDataList(barDtoList);
        }
        BarChartBuilder barChartBuilder2 = new BarChartBuilder(weekBarChartDataList);
        barChartBuilder2.setXAxisData(xAxisData);
        barChartBuilder2.setYAxisData(yAxisData);
        return barChartBuilder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarChartBuilder b(DataUtils dataUtils, Date date, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            date = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return dataUtils.a(date, i, i2, list);
    }

    @NotNull
    public final StatisticsDetailData getStatisticsDetailData(@NotNull Date date, int timeMode, @Nullable HeartRateStatistics dateStatistics) {
        return dateStatistics == null ? new StatisticsDetailData(b(this, date, timeMode, 0, null, 8, null), null, 2, null) : new StatisticsDetailData(a(date, timeMode, dateStatistics.getMaxValue(), dateStatistics.getDataArray()), new StatisticsInfo(dateStatistics.getMaxValue(), dateStatistics.getMinValue(), c.roundToInt(dateStatistics.getAvgValue())));
    }
}
