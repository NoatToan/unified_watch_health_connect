package com.xiaomi.hm.health.healthdata.ui.view;

import android.graphics.Color;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u001c\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003j\u0002`\u000b\u0012\u0016\u0010\u0012\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003j\u0002`\u0010\u0012\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015\u0012\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b?\u0010@R,\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003j\u0002`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR&\u0010\u0012\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003j\u0002`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR<\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R0\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00103\u001a\b\u0012\u0004\u0012\u0002010\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0016\u00106\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R*\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001d¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/StressBarChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarPointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarMaxSizeGetter;", "b", "barMaxSizeGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/XAxisDataGetter;", "c", "xAxisDataGetter", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarDataColorGetter;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "colorGetter", "", "e", "Z", "getShowIntersectionPoint", "()Z", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "getValueOffset", "()F", "valueOffset", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "getYScaleLongDash", "yScaleLongDash", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressBarChartBuilder implements BarChartBuilder<Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<BarChartVo<Number>>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> barMaxSizeGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Function1<Float, Integer> colorGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean showIntersectionPoint;

    /* JADX WARN: Multi-variable type inference failed */
    public StressBarChartBuilder(@NotNull Function0<? extends List<BarChartVo<Number>>> function0, @NotNull Function0<Integer> function1, @NotNull Function0<? extends SparseArray<XAxisData>> function2, @Nullable Function1<? super Float, Integer> function3, boolean z) {
        this.pointsGetter = function0;
        this.barMaxSizeGetter = function1;
        this.xAxisDataGetter = function2;
        this.colorGetter = function3;
        this.showIntersectionPoint = z;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public HMColor[] getBarColors() {
        return new HMColor[]{new HMColor(Color.parseColor("#FE6000")), new HMColor(Color.parseColor("#FE6000"))};
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @Nullable
    public Function1<Float, Integer> getBarDataColorGetter() {
        return this.colorGetter;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @Nullable
    public Integer getBarMaxSize() {
        return this.barMaxSizeGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public List<BarChartVo<Number>> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public boolean getShowIntersectionPoint() {
        return this.showIntersectionPoint;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public float getValueOffset() {
        return HealthDataUtils.INSTANCE.getBarChartOffset(StressDataType.ALL_DAY);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return HealthChartBuilderKt.getYAxisDataByType(StressDataType.ALL_DAY);
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
        this.showIntersectionPoint = z;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    public /* synthetic */ StressBarChartBuilder(Function0 function0, Function0 function1, Function0 function2, Function1 function3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, function2, (i & 8) != 0 ? null : function3, z);
    }
}
