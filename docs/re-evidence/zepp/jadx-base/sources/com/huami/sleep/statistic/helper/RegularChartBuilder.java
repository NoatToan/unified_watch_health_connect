package com.huami.sleep.statistic.helper;

import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/sleep/statistic/helper/RegularChartBuilder;", "", "", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "", "", "getLinColors", "()[Ljava/lang/Integer;", "linColors", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "setYAxisData", "yAxisData", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface RegularChartBuilder {
    @NotNull
    List<SleepRegularChartVo> getDataList();

    @NotNull
    Integer[] getLinColors();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    void setDataList(@NotNull List<SleepRegularChartVo> list);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);

    void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray);
}
