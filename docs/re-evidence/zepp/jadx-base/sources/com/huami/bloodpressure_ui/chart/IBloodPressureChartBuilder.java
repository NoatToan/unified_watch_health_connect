package com.huami.bloodpressure_ui.chart;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.huami.bloodpressure_ui.ext.BloodPressureWrap;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0017\u001a\u00020\u00148&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010#\"\u0004\b&\u0010'R$\u0010/\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000fR$\u00106\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR*\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000208\u0018\u0001078&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010C\u001a\u0004\u0018\u00010>8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/IBloodPressureChartBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "", "getValueOffset", "()F", "valueOffset", "Lkotlin/Function1;", "", "Lcom/huami/bloodpressure_ui/chart/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "getShowIntersectionPoint", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "", "Lcom/huami/chart/data/ChartDataList;", "getAvgPoints", "()[Lcom/huami/chart/data/ChartDataList;", "setAvgPoints", "([Lcom/huami/chart/data/ChartDataList;)V", "avgPoints", "Lcom/huami/chart/data/ChartData;", "getSbpList", "setSbpList", "sbpList", "getDbpList", "setDbpList", "dbpList", "", "Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "getDataListMap", "()Ljava/util/Map;", "setDataListMap", "(Ljava/util/Map;)V", "dataListMap", "", "getLastDataTimestamp", "()Ljava/lang/Long;", "setLastDataTimestamp", "(Ljava/lang/Long;)V", "lastDataTimestamp", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureChartBuilder<T> {
    @Nullable
    ChartDataList[] getAvgPoints();

    @Nullable
    Function1<Float, Integer> getBarDataColorGetter();

    @Nullable
    Integer getBarMaxSize();

    @Nullable
    Map<Integer, BloodPressureWrap> getDataListMap();

    @Nullable
    SparseArray<ChartData> getDbpList();

    @Nullable
    Long getLastDataTimestamp();

    @NotNull
    List<BarChartVo<T>> getPoints();

    @Nullable
    SparseArray<ChartData> getSbpList();

    boolean getShowIntersectionPoint();

    float getValueOffset();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    boolean getYScaleLongDash();

    void setAvgPoints(@Nullable ChartDataList[] chartDataListArr);

    void setDataListMap(@Nullable Map<Integer, BloodPressureWrap> map);

    void setDbpList(@Nullable SparseArray<ChartData> sparseArray);

    void setLastDataTimestamp(@Nullable Long l);

    void setPoints(@NotNull List<BarChartVo<T>> list);

    void setSbpList(@Nullable SparseArray<ChartData> sparseArray);

    void setShowIntersectionPoint(boolean z);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);
}
