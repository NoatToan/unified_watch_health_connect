package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/LineChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/HealthChartBuilder;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "getLineColor", "()I", "lineColor", "getGradientStartColor", "gradientStartColor", "getGradientEndColor", "gradientEndColor", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "setYAxisData", "yAxisData", "", "getYMaxValue", "()F", "yMaxValue", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface LineChartBuilder extends HealthChartBuilder {
    int getGradientEndColor();

    int getGradientStartColor();

    int getLineColor();

    @NotNull
    List<HealthChartDataVo> getPoints();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    float getYMaxValue();

    void setPoints(@NotNull List<HealthChartDataVo> list);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);

    void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray);
}
