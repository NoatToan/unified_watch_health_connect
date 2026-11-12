package com.xiaomi.hm.health.healthdata.ui.view;

import android.graphics.Color;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u001c\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u0006\u0012\u0016\u0010\u000e\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003j\u0002`\f¢\u0006\u0004\b<\u0010=R,\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003j\u0002`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R<\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0016\u0010*\u001a\u00020'8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R*\u00100\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020,\u0018\u00010+j\u0004\u0018\u0001`-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010,8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0002048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R$\u0010;\u001a\u0002042\u0006\u0010\u0015\u001a\u0002048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00106\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/TempBarChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarPointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/XAxisDataGetter;", "b", "xAxisDataGetter", "Lcom/huami/chart/util/HMColor;", "c", "Lcom/huami/chart/util/HMColor;", "lowColor", GoogleApiAvailabilityLight.a, "highColor", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "", "getValueOffset", "()F", "valueOffset", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "getShowIntersectionPoint", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempBarChartBuilder implements BarChartBuilder<Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<BarChartVo<Number>>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMColor lowColor = new HMColor(Color.parseColor("#1AAF4C"));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMColor highColor = new HMColor(Color.parseColor("#FFBA00"));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, Integer> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final int a(float f) {
            return HealthDataUtils.INSTANCE.getTempChartDataColor(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Float f) {
            return Integer.valueOf(a(f.floatValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TempBarChartBuilder(@NotNull Function0<? extends List<BarChartVo<Number>>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public HMColor[] getBarColors() {
        return new HMColor[]{this.lowColor, this.highColor};
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @Nullable
    public Function1<Float, Integer> getBarDataColorGetter() {
        return a.a;
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
        return HealthDataUtils.INSTANCE.getBarChartOffset(TemperatureDataType.ALL_DAY);
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return TempUtils.INSTANCE.getTempYAxisData();
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
}
