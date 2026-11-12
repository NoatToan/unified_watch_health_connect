package com.huami.bodymeasurements.common.chart;

import android.util.SparseArray;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.HMColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u00118&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u0016\u0010+\u001a\u00020\u00108&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0016\u0010/\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u001c\u00103\u001a\b\u0012\u0004\u0012\u0002000\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/BarChartBuilder;", "", "", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "Lkotlin/Function1;", "", "", "Lcom/huami/bodymeasurements/common/chart/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getValueOffset", "()F", "valueOffset", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "getNoDataStringRes", "()I", "noDataStringRes", "getSupportRadian", "supportRadian", "getSupportGradient", "supportGradient", "Lcom/huami/chart/util/ChartGradientColor;", "getChartGradientColors", "()[Lcom/huami/chart/util/ChartGradientColor;", "chartGradientColors", "common_release"}, k = 1, mv = {1, 5, 1})
public interface BarChartBuilder {
    @NotNull
    HMColor[] getBarColors();

    @Nullable
    Function1<Float, Integer> getBarDataColorGetter();

    @Nullable
    Integer getBarMaxSize();

    @NotNull
    ChartGradientColor[] getChartGradientColors();

    int getNoDataStringRes();

    @NotNull
    List<BarChartVo> getPoints();

    boolean getSupportGradient();

    boolean getSupportRadian();

    float getValueOffset();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    boolean getYScaleLongDash();

    void setPoints(@NotNull List<BarChartVo> list);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);
}
