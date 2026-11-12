package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qns extends HwHealthLineChartRenderLayerOriginal implements IHwHealthDataRender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qoc f46535a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthRenderMode f46536c;
    private Path e;

    public qns(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler);
        this.f46536c = null;
        this.f46535a = null;
        this.e = new Path();
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            this.f46536c = new HwHealthRenderMode((HwHealthBaseBarLineChart) this.mChart, this.mViewPortHandler);
        }
        this.f46535a = new qoc(this.f46536c);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            if (highlight != null) {
                List<IHwHealthLineDataSet> dataSets = lineData.getDataSets();
                if (!njy.e(dataSets)) {
                    d(canvas, highlight, dataSets, Color.argb(0, 0, 0, 0));
                }
            }
        }
    }

    private void d(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
        if (list.size() == 1) {
            d(canvas, highlight, list.get(0), i);
            return;
        }
        MPPointD pixelForValues = this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(highlight.getX(), 0.0f);
        c(canvas, (float) pixelForValues.x, (float) pixelForValues.y, list.get(0), true, false, i);
        for (IHwHealthLineDataSet iHwHealthLineDataSet : list) {
            if (!(this.mChart instanceof HwHealthBaseBarLineChart)) {
                return;
            }
            IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = iHwHealthLineDataSet.cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
            if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                List<HwHealthBaseEntry> listSearchEntryForXValue = ((IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer).searchEntryForXValue(highlight.getX());
                if (!njy.e(listSearchEntryForXValue)) {
                    HwHealthBaseEntry hwHealthBaseEntry = listSearchEntryForXValue.get(0);
                    MPPointD pixelForValues2 = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues2.x, (float) pixelForValues2.y);
                    c(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, iHwHealthLineDataSet, false, true, i);
                }
            }
        }
    }

    private void d(Canvas canvas, Highlight highlight, IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        boolean z;
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = iHwHealthLineDataSet.cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
            if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                List<HwHealthBaseEntry> listSearchEntryForXValue = ((IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer).searchEntryForXValue(highlight.getX());
                if (njy.e(listSearchEntryForXValue)) {
                    return;
                }
                HwHealthBaseEntry hwHealthBaseEntry = listSearchEntryForXValue.get(0);
                if ((this.f46536c.d() instanceof HwHealthRenderMode.e) && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                    z = false;
                    hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                } else {
                    z = true;
                }
                MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
                highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                c(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, true, z, i);
            }
        }
    }

    protected void c(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(i);
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.e.reset();
            this.e.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.e.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.e, this.mHighlightPaint);
        }
        if (z2) {
            float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
            float fConvertDpToPixel2 = Utils.convertDpToPixel(6.0f);
            if (this.mChart instanceof HwHealthCombinedChart) {
                if (b() != 0.0f) {
                    fConvertDpToPixel = b();
                }
                fConvertDpToPixel2 = 1.5f * fConvertDpToPixel;
            }
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(qqn.d(R.color.colorBackground));
            canvas.drawCircle(f, f2, fConvertDpToPixel2, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(a(iLineScatterCandleRadarDataSet));
            canvas.drawCircle(f, f2, fConvertDpToPixel, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        }
    }

    private float b() {
        List<T> dataSets = this.mChart.getData().getDataSets();
        if (!njy.b(dataSets) || !(dataSets.get(0) instanceof HwHealthBarDataSet) || ((HwHealthCombinedChart) this.mChart).getBarData() == null) {
            return 0.0f;
        }
        float[] fArr = {0.0f, 0.0f, ((HwHealthCombinedChart) this.mChart).getBarData().a(), 0.0f};
        this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
        return (fArr[2] - fArr[0]) / 2.0f;
    }

    protected int a(ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        if (this.f46536c.d() instanceof HwHealthRenderMode.e) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iLineScatterCandleRadarDataSet.getColor();
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawCubicBezier(IHwHealthLineDataSet iHwHealthLineDataSet) {
        throw new RuntimeException("needs intercept,not support bezier");
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (!(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            LogUtil.j("HealthChart_HwHealthLineChartRenderer", "drawLinear !(dataSetArg instanceof HwHealthLineDataSet)");
            return;
        }
        HwHealthLineDataSet hwHealthLineDataSet = (HwHealthLineDataSet) iHwHealthLineDataSet;
        Canvas canvas2 = this.mBitmapCanvas;
        if (hwHealthLineDataSet.isDataCalculated()) {
            this.f46536c.a(hwHealthLineDataSet);
            this.f46536c.a();
            HwHealthRenderMode.IRenderMode iRenderModeD = this.f46536c.d();
            qmi axisDataRenderArg = this.mChart.getAxisDataRenderArg(hwHealthLineDataSet.getAxisDependencyExt());
            if (axisDataRenderArg != null && axisDataRenderArg.b()) {
                if (!hwHealthLineDataSet.f()) {
                    throw new RuntimeException("drawLadderLinear needs displayIntervalSeted");
                }
                iRenderModeD.setLadderMode(hwHealthLineDataSet.b());
            } else {
                iRenderModeD.setStandMode();
            }
            if (this.mChart instanceof HwHealthBaseBarLineChart) {
                IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = hwHealthLineDataSet.cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
                if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                    this.f46535a.a(canvas2, (IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer, this.mChart.getTransformer(hwHealthLineDataSet.getAxisDependencyExt()));
                }
            }
        }
    }

    public HwHealthLineDataProvider d() {
        return this.mChart;
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        if (z) {
            this.f46536c.a("render_background");
        } else {
            this.f46536c.a("render_foreground");
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.f46536c.d() instanceof HwHealthRenderMode.e;
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qnt lineData = this.mChart.getLineData();
        return (lineData == null || lineData.getDataSets() == null || lineData.getDataSets().size() == 0) ? false : true;
    }

    public void c(int i) {
        if (this.f46536c.d() instanceof HwHealthRenderMode.RenderModeCommon) {
            ((HwHealthRenderMode.RenderModeCommon) this.f46536c.d()).setPointStyle(i);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void focusArea(List<qmj> list) {
        boolean z;
        if (this.f46536c.d() instanceof HwHealthRenderMode.a) {
            z = false;
        } else {
            this.f46536c.a("render_focus_area");
            z = true;
        }
        HwHealthRenderMode.a aVar = (HwHealthRenderMode.a) this.f46536c.d();
        if (aVar.e(list) && !z) {
            return;
        }
        aVar.b(list);
        ((HwHealthBaseBarLineChart) this.mChart).invalidate();
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void disableFocusArea() {
        this.f46536c.a("render_foreground");
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            ((HwHealthBaseBarLineChart) this.mChart).invalidate();
        }
    }
}
