package com.xiaomi.hm.health.healthdata.ui.view;

import android.graphics.Color;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u001c\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u0006\u0012\u0016\u0010\u000e\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003j\u0002`\f¢\u0006\u0004\b=\u0010>R,\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003j\u0002`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R<\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020%0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u0016\u0010,\u001a\u00020)8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R*\u00101\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f\u0018\u00010-j\u0004\u0018\u0001`.8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0002058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R$\u0010<\u001a\u0002052\u0006\u0010\u001a\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u00107\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/BloodPressureChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarPointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/XAxisDataGetter;", "b", "xAxisDataGetter", "", "c", LogUtil.I, "lowColor", GoogleApiAvailabilityLight.a, "highColor", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "setYAxisData", "yAxisData", "", "getValueOffset", "()F", "valueOffset", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "getShowIntersectionPoint", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartBuilder implements BarChartBuilder<Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<BarChartVo<Number>>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int lowColor = Color.parseColor("#0C6AFB");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int highColor = Color.parseColor("#FC2323");

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureChartBuilder(@NotNull Function0<? extends List<BarChartVo<Number>>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public HMColor[] getBarColors() {
        return new HMColor[]{new HMColor(this.lowColor), new HMColor(this.highColor)};
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @Nullable
    public Function1<Float, Integer> getBarDataColorGetter() {
        return null;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @Nullable
    public Integer getBarMaxSize() {
        return null;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public List<BarChartVo<Number>> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public boolean getShowIntersectionPoint() {
        return false;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public float getValueOffset() {
        return HealthDataUtils.INSTANCE.getBarChartOffset(HealthDataType.BLOOD_PRESSURE);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return HealthChartBuilderKt.getYAxisDataByType(HealthDataType.BLOOD_PRESSURE);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public boolean getYScaleLongDash() {
        return false;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public void setPoints(@NotNull List<BarChartVo<Number>> list) {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public void setShowIntersectionPoint(boolean z) {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    public void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
    }
}
