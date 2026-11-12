package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0016\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b¢\u0006\u0004\b,\u0010-R&\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R0\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020$0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u0016\u0010+\u001a\u00020(8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/MuscleChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/LineChartBuilder;", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "Lcom/xiaomi/hm/health/healthdata/ui/view/PointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/XAxisDataGetter;", "b", "xAxisDataGetter", "", "c", LogUtil.I, "themeColor", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "getLineColor", "()I", "lineColor", "getGradientStartColor", "gradientStartColor", "getGradientEndColor", "gradientEndColor", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "setYAxisData", "yAxisData", "", "getYMaxValue", "()F", "yMaxValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MuscleChartBuilder implements LineChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<HealthChartDataVo>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int themeColor = ContextCompat.getColor(BraceletApp.getContext(), R.color.s30);

    /* JADX WARN: Multi-variable type inference failed */
    public MuscleChartBuilder(@NotNull Function0<? extends List<HealthChartDataVo>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public int getGradientEndColor() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public int getGradientStartColor() {
        return HealthChartBuilderKt.changeAlpha(this.themeColor, 51);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    /* JADX INFO: renamed from: getLineColor, reason: from getter */
    public int getThemeColor() {
        return this.themeColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    @NotNull
    public List<HealthChartDataVo> getPoints() {
        return this.pointsGetter.getA();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.getA();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return HealthChartBuilderKt.getYAxisDataByType(HealthDataType.MUSCLE);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public float getYMaxValue() {
        return HealthChartBuilderKt.getYMaxValue(HealthDataType.MUSCLE);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public void setPoints(@NotNull List<HealthChartDataVo> list) {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder
    public void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
    }
}
