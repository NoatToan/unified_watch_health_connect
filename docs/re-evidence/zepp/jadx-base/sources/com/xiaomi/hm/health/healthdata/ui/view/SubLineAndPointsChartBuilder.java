package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR&\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u001fj\b\u0012\u0004\u0012\u00020\u0017`!8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R&\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001fj\b\u0012\u0004\u0012\u00020\u001b`!8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0016\u0010,\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0016\u0010.\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR&\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001b0/j\u0002`08&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0016\u00107\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0016\u00109\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0016\u0010;\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001d¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/SubLineAndPointsChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/HealthChartBuilder;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "", "getYMaxValue", "()F", "yMaxValue", "", "getShadowColor", "()[I", "shadowColor", "", "getLineColor", "()I", "lineColor", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "Lkotlin/collections/ArrayList;", "getSubIndex", "()Ljava/util/ArrayList;", "subIndex", "getSubLineColor", "subLineColor", "getSubIndexShadowColors", "subIndexShadowColors", "getSubPointIndex", "subPointIndex", "getSubPointRadius", "subPointRadius", "getSubPointNormalColor", "subPointNormalColor", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/healthdata/ui/view/PointDataColorGetter;", "getSubPointDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "subPointDataColorGetter", "getDividerValue", "dividerValue", "getAboveDividerLineColor", "aboveDividerLineColor", "getBelowDividerLineColor", "belowDividerLineColor", "getDisConnectLineGap", "disConnectLineGap", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface SubLineAndPointsChartBuilder extends HealthChartBuilder {
    int getAboveDividerLineColor();

    int getBelowDividerLineColor();

    int getDisConnectLineGap();

    float getDividerValue();

    int getLineColor();

    @NotNull
    List<HealthChartDataVo> getPoints();

    @NotNull
    int[] getShadowColor();

    @NotNull
    ArrayList<RangeIndex> getSubIndex();

    @NotNull
    ArrayList<int[]> getSubIndexShadowColors();

    int getSubLineColor();

    @NotNull
    Function1<Float, Integer> getSubPointDataColorGetter();

    @NotNull
    ArrayList<Integer> getSubPointIndex();

    int getSubPointNormalColor();

    float getSubPointRadius();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    float getYMaxValue();

    void setPoints(@NotNull List<HealthChartDataVo> list);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);
}
