package com.huami.bodymeasurements.temperature.view.vo.chart;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.BarChartBuilder;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.TempConstantsKt;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.HMColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BG\u0012\u0016\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CR&\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fj\u0004\u0018\u0001`\"8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R0\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002040\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00100R\u0016\u00109\u001a\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010-R\u0016\u0010=\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010-R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempBarChartBuilder;", "Lcom/huami/bodymeasurements/common/chart/BarChartBuilder;", "Lkotlin/Function0;", "", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "Lcom/huami/bodymeasurements/common/chart/BarPointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/huami/bodymeasurements/common/chart/XAxisDataGetter;", "b", "xAxisDataGetter", "", "c", "Z", "radian", GoogleApiAvailabilityLight.a, "gradient", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "Lkotlin/Function1;", "", "", "Lcom/huami/bodymeasurements/common/chart/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getValueOffset", "()F", "valueOffset", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "getYScaleLongDash", "()Z", "yScaleLongDash", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "getNoDataStringRes", "()I", "noDataStringRes", "getSupportRadian", "supportRadian", "getSupportGradient", "supportGradient", "Lcom/huami/chart/util/ChartGradientColor;", "getChartGradientColors", "()[Lcom/huami/chart/util/ChartGradientColor;", "chartGradientColors", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZ)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempBarChartBuilder implements BarChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<BarChartVo>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean radian;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean gradient;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, Integer> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final int a(float f) {
            return TempBarChartBuilderKt.a(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Float f) {
            return Integer.valueOf(a(f.floatValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TempBarChartBuilder(@NotNull Function0<? extends List<BarChartVo>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1, boolean z, boolean z2) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
        this.radian = z;
        this.gradient = z2;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @NotNull
    public HMColor[] getBarColors() {
        return new HMColor[]{new HMColor(TempConstantsKt.getNORMAL_COLOR()), new HMColor(TempConstantsKt.getABNORMAL_COLOR())};
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @Nullable
    public Function1<Float, Integer> getBarDataColorGetter() {
        return a.a;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @Nullable
    public Integer getBarMaxSize() {
        return null;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @NotNull
    public ChartGradientColor[] getChartGradientColors() {
        return new ChartGradientColor[]{new ChartGradientColor(new HMColor(TempConstantsKt.getABNORMAL_COLOR()), new HMColor(TempConstantsKt.getABNORMAL_END_COLOR())), new ChartGradientColor(new HMColor(TempConstantsKt.getNORMAL_COLOR()), new HMColor(TempConstantsKt.getNORMAL_END_COLOR()))};
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    public int getNoDataStringRes() {
        return R.string.bm_temperature_no_data;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @NotNull
    public List<BarChartVo> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    /* JADX INFO: renamed from: getSupportGradient, reason: from getter */
    public boolean getGradient() {
        return this.gradient;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    /* JADX INFO: renamed from: getSupportRadian, reason: from getter */
    public boolean getRadian() {
        return this.radian;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    public float getValueOffset() {
        return 0.24f;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return TempConstantsKt.getTempYAxisData();
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    public boolean getYScaleLongDash() {
        return false;
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    public void setPoints(@NotNull List<BarChartVo> list) {
    }

    @Override // com.huami.bodymeasurements.common.chart.BarChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }
}
