package com.huami.bodymeasurements.common.chart;

import android.util.SparseArray;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011j\b\u0012\u0004\u0012\u00020\r`\u00128&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u001aj\u0002`\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\"\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0016\u0010$\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000fR\u0016\u0010&\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000fR\"\u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020.0'8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0016\u00102\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u00063"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/LineAndPointChartBuilder;", "", "", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "getShadowColor", "()[I", "shadowColor", "", "getLineColor", "()I", "lineColor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSubPointIndexList", "()Ljava/util/ArrayList;", "subPointIndexList", "", "getSubPointRadius", "()F", "subPointRadius", "Lkotlin/Function1;", "Lcom/huami/bodymeasurements/common/chart/SubPointColorGetter;", "getSubPointColorGetter", "()Lkotlin/jvm/functions/Function1;", "subPointColorGetter", "getDividerValue", "dividerValue", "getAboveDividerLineColor", "aboveDividerLineColor", "getBelowDividerLineColor", "belowDividerLineColor", "getDisConnectLineGap", "disConnectLineGap", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "getNoDataStringRes", "noDataStringRes", "common_release"}, k = 1, mv = {1, 5, 1})
public interface LineAndPointChartBuilder {
    int getAboveDividerLineColor();

    int getBelowDividerLineColor();

    int getDisConnectLineGap();

    float getDividerValue();

    int getLineColor();

    int getNoDataStringRes();

    @NotNull
    List<ChartDataVo> getPoints();

    @NotNull
    int[] getShadowColor();

    @NotNull
    Function1<Float, Integer> getSubPointColorGetter();

    @NotNull
    ArrayList<Integer> getSubPointIndexList();

    float getSubPointRadius();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    void setPoints(@NotNull List<ChartDataVo> list);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);
}
