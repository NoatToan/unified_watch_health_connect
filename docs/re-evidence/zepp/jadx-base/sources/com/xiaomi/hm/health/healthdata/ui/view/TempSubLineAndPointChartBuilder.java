package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0016\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b\u0012 \u0010\u0013\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u0002j\u0002`\u0011\u0012 \u0010\u0017\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u00100\u0002j\u0002`\u0015\u0012 \u0010\u001b\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u00100\u0002j\u0002`\u0019¢\u0006\u0004\bS\u0010TR&\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R0\u0010\u0013\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u0002j\u0002`\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R0\u0010\u0017\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u00100\u0002j\u0002`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R0\u0010\u001b\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u00100\u0002j\u0002`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR0\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0016\u00102\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R&\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R&\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0016\u0010?\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00104R&\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0016\u0010C\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00101R\u0016\u0010E\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00104R&\u0010J\u001a\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00180Fj\u0002`G8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101R\u0016\u0010N\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u00104R\u0016\u0010P\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00104R\u0016\u0010R\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u00104¨\u0006U"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/TempSubLineAndPointChartBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/SubLineAndPointsChartBuilder;", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "Lcom/xiaomi/hm/health/healthdata/ui/view/PointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/XAxisDataGetter;", "b", "xAxisDataGetter", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/hm/health/healthdata/ui/view/SubIndexGetter;", "c", "subIndexGetter", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/SubIndexShadowColorsGetter;", GoogleApiAvailabilityLight.a, "subIndexShadowColorsGetter", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/SubPointIndexGetter;", "e", "subPointIndexGetter", "f", LogUtil.I, "normalColor", "g", "aboveColor", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "", "getYMaxValue", "()F", "yMaxValue", "getLineColor", "()I", "lineColor", "getShadowColor", "()[I", "shadowColor", "getSubIndex", "()Ljava/util/ArrayList;", "subIndex", "getSubIndexShadowColors", "subIndexShadowColors", "getSubLineColor", "subLineColor", "getSubPointIndex", "subPointIndex", "getSubPointRadius", "subPointRadius", "getSubPointNormalColor", "subPointNormalColor", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/healthdata/ui/view/PointDataColorGetter;", "getSubPointDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "subPointDataColorGetter", "getDividerValue", "dividerValue", "getAboveDividerLineColor", "aboveDividerLineColor", "getBelowDividerLineColor", "belowDividerLineColor", "getDisConnectLineGap", "disConnectLineGap", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempSubLineAndPointChartBuilder implements SubLineAndPointsChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<HealthChartDataVo>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<ArrayList<RangeIndex>> subIndexGetter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<ArrayList<int[]>> subIndexShadowColorsGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<ArrayList<Integer>> subPointIndexGetter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int normalColor = ContextCompat.getColor(BraceletApp.getContext(), R.color.s20);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int aboveColor = ContextCompat.getColor(BraceletApp.getContext(), R.color.s34);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
    public TempSubLineAndPointChartBuilder(@NotNull Function0<? extends List<HealthChartDataVo>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1, @NotNull Function0<? extends ArrayList<RangeIndex>> function2, @NotNull Function0<? extends ArrayList<int[]>> function3, @NotNull Function0<? extends ArrayList<Integer>> function4) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
        this.subIndexGetter = function2;
        this.subIndexShadowColorsGetter = function3;
        this.subPointIndexGetter = function4;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    /* JADX INFO: renamed from: getAboveDividerLineColor, reason: from getter */
    public int getAboveColor() {
        return this.aboveColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    /* JADX INFO: renamed from: getBelowDividerLineColor, reason: from getter */
    public int getNormalColor() {
        return this.normalColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public int getDisConnectLineGap() {
        return 300;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public float getDividerValue() {
        return 37.2f;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public int getLineColor() {
        return this.normalColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public List<HealthChartDataVo> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public int[] getShadowColor() {
        return new int[]{HealthChartBuilderKt.changeAlpha(this.normalColor, 51), 0};
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public ArrayList<RangeIndex> getSubIndex() {
        return this.subIndexGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public ArrayList<int[]> getSubIndexShadowColors() {
        return this.subIndexShadowColorsGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public int getSubLineColor() {
        return this.normalColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public Function1<Float, Integer> getSubPointDataColorGetter() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public ArrayList<Integer> getSubPointIndex() {
        return this.subPointIndexGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public int getSubPointNormalColor() {
        return this.normalColor;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public float getSubPointRadius() {
        return 4.0f;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return TempUtils.INSTANCE.getTempYAxisData();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public float getYMaxValue() {
        return 42.0f;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public void setPoints(@NotNull List<HealthChartDataVo> list) {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }
}
