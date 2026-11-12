package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qnq extends HwHealthLineChartRenderLayerOriginal implements IHwHealthDataRender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f46532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qmj> f46533c;
    protected Path d;
    private boolean e;
    protected float[] f;
    protected float[] g;
    protected int i;

    protected boolean a() {
        return true;
    }

    public qnq(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler);
        this.i = 0;
        this.g = new float[4];
        this.f = new float[4];
        this.d = new Path();
        this.f46531a = false;
        this.e = false;
        this.f46533c = new ArrayList();
        this.f46532b = new Path();
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt dataset = getDataset();
        if (highlightArr == null || highlightArr.length <= 0 || dataset == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            if (highlight != null) {
                List<T> dataSets = dataset.getDataSets();
                if (!njy.e(dataSets)) {
                    b(dataSets, dataSets.size());
                    c(canvas, highlight, (List<IHwHealthLineDataSet>) dataSets, Color.argb(0, 0, 0, 0));
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public qnt getDataset() {
        return this.mChart.getLineData();
    }

    private void c(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
        boolean z;
        if (list.size() == 1) {
            List<T> entriesForXValue = list.get(0).getEntriesForXValue(highlight.getX());
            if (njy.e(entriesForXValue)) {
                return;
            }
            Entry hwHealthBaseEntry = (Entry) entriesForXValue.get(0);
            if (this.f46531a && (this.mChart instanceof HwHealthBaseBarLineChart) && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                z = false;
            } else {
                z = true;
            }
            MPPointD pixelForValues = this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
            highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
            d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, list.get(0), true, z, i);
            return;
        }
        MPPointD pixelForValues2 = this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(highlight.getX(), 0.0f);
        d(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, list.get(0), true, false, i);
        for (IHwHealthLineDataSet iHwHealthLineDataSet : list) {
            if (iHwHealthLineDataSet != null) {
                List<T> entriesForXValue2 = iHwHealthLineDataSet.getEntriesForXValue(highlight.getX());
                if (!njy.e(entriesForXValue2)) {
                    Entry entry = (Entry) entriesForXValue2.get(0);
                    MPPointD pixelForValues3 = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues3.x, (float) pixelForValues3.y);
                    d(canvas, (float) pixelForValues3.x, (float) pixelForValues3.y, iHwHealthLineDataSet, false, true, i);
                }
            }
        }
    }

    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(i);
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.d.reset();
            this.d.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.d.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.d, this.mHighlightPaint);
        }
        if (z2) {
            float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
            float fConvertDpToPixel2 = Utils.convertDpToPixel(6.0f);
            if (this.mChart instanceof HwHealthCombinedChart) {
                if (e() != 0.0f) {
                    fConvertDpToPixel = e();
                }
                fConvertDpToPixel2 = 1.5f * fConvertDpToPixel;
            }
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setShadowLayer(Utils.convertDpToPixel(2.0f), 0.0f, 0.0f, Color.argb(127, 0, 0, 0));
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(-1);
            canvas.drawCircle(f, f2, fConvertDpToPixel2, this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(d(iLineScatterCandleRadarDataSet));
            canvas.drawCircle(f, f2, fConvertDpToPixel, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        }
    }

    private float e() {
        List<T> dataSets = this.mChart.getData().getDataSets();
        if (dataSets.size() <= 0 || !(dataSets.get(0) instanceof HwHealthBarDataSet) || !(this.mChart instanceof HwHealthCombinedChart) || ((HwHealthCombinedChart) this.mChart).getBarData() == null) {
            return 0.0f;
        }
        float[] fArr = {0.0f, 0.0f, ((HwHealthCombinedChart) this.mChart).getBarData().a(), 0.0f};
        this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
        return (fArr[2] - fArr[0]) / 2.0f;
    }

    protected int d(ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        if (this.f46531a) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iLineScatterCandleRadarDataSet.getColor();
    }

    protected int b(List<IHwHealthLineDataSet> list, int i) {
        if (i == 1) {
            return list.get(0).getColor();
        }
        return Color.argb(127, 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawCubicBezier(IHwHealthLineDataSet iHwHealthLineDataSet) {
        IHwHealthLineDataSet iHwHealthLineDataSet2 = iHwHealthLineDataSet;
        float phaseY = this.mAnimator.getPhaseY();
        HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
        this.mXBounds.set(this.mChart, iHwHealthLineDataSet2);
        float cubicIntensity = iHwHealthLineDataSet.getCubicIntensity();
        this.mCubicPath.reset();
        if (this.mXBounds.range >= 1) {
            int i = this.mXBounds.min;
            ?? entryForIndex = iHwHealthLineDataSet2.getEntryForIndex(Math.max(i, 0));
            if (entryForIndex == 0) {
                return;
            }
            this.mCubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            Object entryForIndex2 = iHwHealthLineDataSet2.getEntryForIndex(Math.max(i - 1, 0));
            int i2 = this.mXBounds.min + 1;
            int i3 = -1;
            ?? r9 = entryForIndex;
            ?? r5 = entryForIndex2;
            ?? r8 = entryForIndex;
            while (i2 <= this.mXBounds.range + this.mXBounds.min) {
                ?? entryForIndex3 = i3 == i2 ? r9 : iHwHealthLineDataSet2.getEntryForIndex(i2);
                int i4 = i2 + 1;
                if (i4 < iHwHealthLineDataSet.getEntryCount()) {
                    i2 = i4;
                }
                ?? entryForIndex4 = iHwHealthLineDataSet2.getEntryForIndex(i2);
                float x = entryForIndex3.getX();
                float x2 = r5.getX();
                float y = entryForIndex3.getY();
                float y2 = r5.getY();
                float x3 = entryForIndex4.getX();
                float x4 = r8.getX();
                float y3 = entryForIndex4.getY();
                float y4 = r8.getY();
                this.mCubicPath.cubicTo(r8.getX() + ((x - x2) * cubicIntensity), (r8.getY() + ((y - y2) * cubicIntensity)) * phaseY, entryForIndex3.getX() - ((x3 - x4) * cubicIntensity), (entryForIndex3.getY() - ((y3 - y4) * cubicIntensity)) * phaseY, entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
                iHwHealthLineDataSet2 = iHwHealthLineDataSet;
                r5 = r8;
                r8 = entryForIndex3;
                i3 = i2;
                i2 = i4;
                r9 = entryForIndex4;
            }
        }
        if (iHwHealthLineDataSet.isDrawFilledEnabled()) {
            this.mCubicFillPath.reset();
            this.mCubicFillPath.addPath(this.mCubicPath);
            drawCubicFill();
        }
        this.mRenderPaint.setColor(a(iHwHealthLineDataSet));
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.mCubicPath);
        this.mBitmapCanvas.drawPath(this.mCubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        qmi axisDataRenderArg = this.mChart.getAxisDataRenderArg(iHwHealthLineDataSet.getAxisDependencyExt());
        c();
        if (axisDataRenderArg != null) {
            if (axisDataRenderArg.b()) {
                e(iHwHealthLineDataSet, axisDataRenderArg);
            } else {
                a(iHwHealthLineDataSet, axisDataRenderArg);
            }
        }
    }

    private boolean b(IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (!iHwHealthLineDataSet.isDataCalculated()) {
            return false;
        }
        if (!(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            LogUtil.e("HealthChart_HwHealthLineChartRendererSepBranch", "!(dataSet instanceof HwHealthLineDataSet)");
            return false;
        }
        if (((HwHealthLineDataSet) iHwHealthLineDataSet).f()) {
            return true;
        }
        LogUtil.e("HealthChart_HwHealthLineChartRendererSepBranch", "drawLadderLinear needs isDisplayIntervalSetted");
        return false;
    }

    private void c(IHwHealthLineDataSet iHwHealthLineDataSet) {
        int entryCount = iHwHealthLineDataSet.getEntryCount() * 8;
        if (this.g.length < Math.max(entryCount, 8)) {
            this.g = new float[Math.max(entryCount, 8)];
        }
        if (this.f.length < Math.max(entryCount, 8)) {
            this.f = new float[Math.max(entryCount, 8)];
        }
    }

    private void d(IHwHealthLineDataSet iHwHealthLineDataSet, Transformer transformer, qmi qmiVar) {
        if (!iHwHealthLineDataSet.isDrawFilledEnabled() || iHwHealthLineDataSet.getEntryCount() <= 0) {
            return;
        }
        e(this.mBitmapCanvas, iHwHealthLineDataSet, transformer, this.mXBounds, qmiVar);
    }

    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet, qmi qmiVar) {
        if (b(iHwHealthLineDataSet)) {
            d();
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            Canvas canvas = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            d(iHwHealthLineDataSet, transformer, qmiVar);
            c(iHwHealthLineDataSet);
            if (iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                ArrayList arrayList = new ArrayList();
                int[] iArr = {0, 0};
                int[] iArr2 = {0, 0};
                for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
                    Entry entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i);
                    if (entryForIndex != null) {
                        Entry entryC = c(iHwHealthLineDataSet, i);
                        Entry entryA = a(iHwHealthLineDataSet, i);
                        if (this.i != 0) {
                            arrayList.add(new PointF(entryForIndex.getX(), entryForIndex.getY() * this.mAnimator.getPhaseY()));
                        }
                        float fB = ((HwHealthLineDataSet) iHwHealthLineDataSet).b();
                        boolean zA = a(iHwHealthLineDataSet, entryC, entryForIndex);
                        boolean zA2 = a(iHwHealthLineDataSet, entryForIndex, entryA);
                        if (!zA && !zA2) {
                            b(iArr2, entryForIndex, fB);
                        }
                        if (entryC != null) {
                            c(iArr, entryC, entryForIndex, entryA != null, fB, zA);
                        }
                    }
                }
                a(canvas, iArr, iHwHealthLineDataSet, transformer, 2);
                d(canvas, transformer, iHwHealthLineDataSet, iArr2, arrayList);
            }
            this.mRenderPaint.setPathEffect(null);
        }
    }

    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet) {
        this.mRenderPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mRenderPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mRenderPaint.setColor(a(iHwHealthLineDataSet));
    }

    protected void a(Canvas canvas, int[] iArr, IHwHealthLineDataSet iHwHealthLineDataSet, Transformer transformer, int i) {
        if (iArr[0] <= 0) {
            return;
        }
        e(iHwHealthLineDataSet);
        transformer.pointValuesToPixel(this.g);
        int iMax = Math.max(iArr[1] * i, i);
        Path path = new Path();
        float[] fArr = this.g;
        path.moveTo(fArr[0], fArr[1]);
        float[] fArr2 = this.g;
        float f = fArr2[0];
        float f2 = fArr2[1];
        int i2 = 0;
        float f3 = f;
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 < iMax) {
                float[] fArr3 = this.g;
                int i4 = i2 * 4;
                float f4 = fArr3[i4];
                float f5 = fArr3[i4 + 1];
                int i5 = i3 * 2;
                float f6 = fArr3[i5];
                float f7 = fArr3[i5 + 1];
                if (c(f3, f4) && c(f2, f5)) {
                    path.lineTo(f6, f7);
                } else {
                    e(canvas, f, f3, iHwHealthLineDataSet, path);
                    path.moveTo(f4, f5);
                    path.lineTo(f6, f7);
                    f = f4;
                }
                i2++;
                f3 = f6;
                f2 = f7;
            } else {
                e(canvas, f, f3, iHwHealthLineDataSet, path);
                return;
            }
        }
    }

    protected boolean a(IHwHealthLineDataSet iHwHealthLineDataSet, Entry entry, Entry entry2) {
        if (entry == null || entry2 == null || !(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            return false;
        }
        return ((HwHealthLineDataSet) iHwHealthLineDataSet).e((int) entry.getX(), (int) entry2.getX());
    }

    private void c(int[] iArr, Entry entry, Entry entry2, boolean z, float f, boolean z2) {
        float phaseY = this.mAnimator.getPhaseY();
        int i = iArr[0];
        if (!z2) {
            this.g[i] = entry.getX();
            this.g[i + 1] = entry.getY() * phaseY;
            this.g[i + 2] = entry.getX() + f;
            this.g[i + 3] = entry.getY() * phaseY;
            iArr[1] = iArr[1] + 1;
            iArr[0] = i + 4;
            return;
        }
        this.g[i] = entry.getX();
        this.g[i + 1] = entry.getY() * phaseY;
        this.g[i + 2] = entry2.getX();
        this.g[i + 3] = entry.getY() * phaseY;
        iArr[1] = iArr[1] + 1;
        this.g[i + 4] = entry2.getX();
        this.g[i + 5] = entry.getY() * phaseY;
        this.g[i + 6] = entry2.getX();
        int i2 = i + 8;
        this.g[i + 7] = entry2.getY() * phaseY;
        iArr[1] = iArr[1] + 1;
        if (!z) {
            this.g[i2] = entry2.getX();
            this.g[i + 9] = entry2.getY() * phaseY;
            this.g[i + 10] = entry2.getX() + f;
            i2 = i + 12;
            this.g[i + 11] = entry2.getY() * phaseY;
            iArr[1] = iArr[1] + 1;
        }
        iArr[0] = i2;
    }

    protected void b(int[] iArr, Entry entry, float f) {
        float phaseY = this.mAnimator.getPhaseY();
        int i = iArr[0];
        this.f[i] = entry.getX();
        this.f[i + 1] = entry.getY() * phaseY;
        this.f[i + 2] = entry.getX() + f;
        this.f[i + 3] = entry.getY() * phaseY;
        iArr[0] = i + 4;
        iArr[1] = iArr[1] + 1;
    }

    protected void a(int i, int i2) {
        int i3 = i * i2;
        int iMax = Math.max(i3, i2) * 2;
        int iMax2 = Math.max(i3, i2) * 4;
        if (this.g.length < iMax) {
            this.g = new float[iMax2];
        }
        if (this.f.length < iMax) {
            this.f = new float[iMax2];
        }
    }

    protected void a(IHwHealthLineDataSet iHwHealthLineDataSet, qmi qmiVar) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            d();
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            d(iHwHealthLineDataSet, transformer, qmiVar);
            int i = iHwHealthLineDataSet.isDrawSteppedEnabled() ? 4 : 2;
            a(iHwHealthLineDataSet.getEntryCount(), i);
            e(iHwHealthLineDataSet, i, transformer, this.mBitmapCanvas);
            this.mRenderPaint.setPathEffect(null);
        }
    }

    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet, int i, Transformer transformer, Canvas canvas) {
        if (iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min) == 0) {
            return;
        }
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        ArrayList arrayList = new ArrayList();
        for (int i2 = this.mXBounds.min; i2 <= this.mXBounds.range + this.mXBounds.min; i2++) {
            Entry entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i2);
            if (entryForIndex != null) {
                if (this.i != 0) {
                    float x = entryForIndex.getX();
                    if (x > this.mChart.getLowestVisibleX() && x < this.mChart.getHighestVisibleX()) {
                        arrayList.add(new PointF(entryForIndex.getX(), entryForIndex.getY() * this.mAnimator.getPhaseY()));
                    }
                }
                Entry entryC = c(iHwHealthLineDataSet, i2);
                Entry entryA = a(iHwHealthLineDataSet, i2);
                boolean zA = a(iHwHealthLineDataSet, entryC, entryForIndex);
                boolean zA2 = a(iHwHealthLineDataSet, entryForIndex, entryA);
                if (!zA && !zA2) {
                    b(iArr, entryForIndex, 0.0f);
                }
                if (entryC != null && zA) {
                    b(iArr2, entryC, entryForIndex);
                }
            }
        }
        a(canvas, iArr2, iHwHealthLineDataSet, transformer, i);
        d(canvas, transformer, iHwHealthLineDataSet, iArr, arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry] */
    private Entry c(IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        if (i != 0) {
            return iHwHealthLineDataSet.getEntryForIndex(i - 1);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.Entry] */
    private Entry a(IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        if (i != this.mXBounds.range + this.mXBounds.min) {
            return iHwHealthLineDataSet.getEntryForIndex(i + 1);
        }
        return null;
    }

    protected void d() {
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        this.mRenderPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    protected void b(int[] iArr, Entry entry, Entry entry2) {
        float phaseY = this.mAnimator.getPhaseY();
        int i = iArr[0];
        this.g[i] = entry.getX();
        this.g[i + 1] = entry.getY() * phaseY;
        this.g[i + 2] = entry2.getX();
        this.g[i + 3] = entry2.getY() * phaseY;
        iArr[0] = i + 4;
        iArr[1] = iArr[1] + 1;
    }

    protected void e(Canvas canvas, float f, float f2, IHwHealthLineDataSet iHwHealthLineDataSet, Path path) {
        int iSave = canvas.save();
        canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
        if (this.e) {
            canvas.clipPath(this.f46532b, Region.Op.DIFFERENCE);
        }
        canvas.drawPath(path, this.mRenderPaint);
        canvas.restoreToCount(iSave);
        if (this.e) {
            c(canvas, f, f2, iHwHealthLineDataSet, path);
        }
        path.reset();
    }

    private void c(Canvas canvas, float f, float f2, IHwHealthLineDataSet iHwHealthLineDataSet, Path path) {
        int iSave = canvas.save();
        canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setColor(c(iHwHealthLineDataSet, true));
        canvas.clipPath(this.f46532b);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        canvas.restoreToCount(iSave);
    }

    public void d(Canvas canvas, Transformer transformer, IHwHealthLineDataSet iHwHealthLineDataSet, int[] iArr, List<PointF> list) {
        if (iArr[0] > 0) {
            this.mRenderPaint.setStrokeCap(Paint.Cap.ROUND);
            transformer.pointValuesToPixel(this.f);
            this.mRenderPaint.setColor(a(iHwHealthLineDataSet));
            float strokeWidth = this.mRenderPaint.getStrokeWidth();
            if (iHwHealthLineDataSet instanceof HwHealthLineDataSet) {
                this.mRenderPaint.setStrokeWidth(((HwHealthLineDataSet) iHwHealthLineDataSet).d(iHwHealthLineDataSet.isDrawFilledEnabled()));
            }
            canvas.drawLines(this.f, 0, iArr[1] * 4, this.mRenderPaint);
            this.mRenderPaint.setStrokeWidth(strokeWidth);
        }
        if (this.i == 0 || list == null || list.size() <= 0) {
            return;
        }
        c(canvas, a(iHwHealthLineDataSet), list, iHwHealthLineDataSet);
    }

    protected void c(Canvas canvas, int i, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
        if (this.mChart instanceof HwHealthCombinedChart) {
            List<T> dataSets = this.mChart.getData().getDataSets();
            if (dataSets.size() > 0 && (dataSets.get(0) instanceof HwHealthBarDataSet) && (this.mChart instanceof HwHealthCombinedChart) && ((HwHealthCombinedChart) this.mChart).getBarData() != null) {
                float[] fArr = {0.0f, 0.0f, ((HwHealthCombinedChart) this.mChart).getBarData().a(), 0.0f};
                this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
                fConvertDpToPixel = (fArr[2] - fArr[0]) / 2.0f;
            }
        }
        if (this.i == 1) {
            paint.setStyle(Paint.Style.STROKE);
            int size = list.size() * 2;
            float[] fArr2 = new float[size];
            int i2 = 0;
            for (PointF pointF : list) {
                if (pointF != null) {
                    fArr2[i2] = pointF.x;
                    fArr2[i2 + 1] = pointF.y;
                    i2 += 2;
                }
            }
            this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr2);
            for (int i3 = 0; i3 < size; i3 += 2) {
                paint.setAntiAlias(true);
                paint.setStrokeWidth(1.0f);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(i);
                float f = fArr2[i3];
                float f2 = fArr2[i3 + 1];
                canvas.drawCircle(f, f2, fConvertDpToPixel, paint);
                paint.setColor(-1);
                canvas.drawCircle(f, f2, fConvertDpToPixel / 2.0f, paint);
            }
        }
    }

    private boolean c(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-7f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    protected void e(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds, qmi qmiVar) {
        Drawable fillDrawable;
        Path path = this.mGenerateFilledPathBuffer;
        int i = xBounds.min;
        int i2 = xBounds.range + xBounds.min;
        int i3 = i;
        while (i3 <= i2 && (this.mChart instanceof HwHealthLineChart)) {
            float[] fArr = ((HwHealthLineChart) this.mChart).getAxisFirstParty().mEntries;
            if (fArr.length < 2) {
                return;
            }
            float[] fArr2 = {0.0f, fArr[fArr.length - 2]};
            transformer.pointValuesToPixel(fArr2);
            int iA = a(iHwHealthLineDataSet, i3, path, i2);
            transformer.pathValueToPixel(path);
            if (i3 + 1 == iA && (iHwHealthLineDataSet instanceof HwHealthLineDataSet) && ((HwHealthLineDataSet) iHwHealthLineDataSet).c(true)) {
                b(iHwHealthLineDataSet, i3, path, transformer, qmiVar);
            }
            if (iHwHealthLineDataSet instanceof HwHealthLineDataSet) {
                HwHealthLineDataSet hwHealthLineDataSet = (HwHealthLineDataSet) iHwHealthLineDataSet;
                if (hwHealthLineDataSet.h()) {
                    GradientDrawable gradientDrawableG = hwHealthLineDataSet.g();
                    GradientDrawable gradientDrawableD = hwHealthLineDataSet.d();
                    if (this.f46531a) {
                        drawFilledPath(canvas, path, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(128, 204, 204, 204), Color.argb(128, 204, 204, 204)}));
                    } else if (gradientDrawableG != null && gradientDrawableD != null) {
                        d(canvas, path, (Drawable) gradientDrawableG, fArr2[1], true);
                        d(canvas, path, (Drawable) gradientDrawableD, fArr2[1], false);
                    }
                } else {
                    fillDrawable = iHwHealthLineDataSet.getFillDrawable();
                    if (fillDrawable != null) {
                        drawFilledPath(canvas, path, fillDrawable);
                    }
                }
            } else {
                fillDrawable = iHwHealthLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                }
            }
            if (iA == i3) {
                return;
            } else {
                i3 = iA;
            }
        }
    }

    private int a(IHwHealthLineDataSet iHwHealthLineDataSet, int i, Path path, int i2) {
        Entry entry;
        if (!(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            LogUtil.e("HealthChart_HwHealthLineChartRendererSepBranch", "!(dataSet instanceof HwHealthLineDataSet");
            return i;
        }
        boolean zB = this.mChart.getAxisDataRenderArg(iHwHealthLineDataSet.getAxisDependencyExt()).b();
        float fB = ((HwHealthLineDataSet) iHwHealthLineDataSet).b();
        int i3 = i + 128;
        if (i3 > i2) {
            i3 = i2;
        }
        float[] fArr = {0.0f, this.mChart.getContentRect().bottom + this.mChart.getXAxis().getYOffset()};
        this.mChart.getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
        float f = fArr[1];
        float phaseY = this.mAnimator.getPhaseY();
        path.reset();
        Entry entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i);
        path.moveTo(entryForIndex.getX(), f);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        Entry entryForIndex2 = null;
        int i4 = i;
        int i5 = i + 1;
        Entry entry2 = entryForIndex;
        while (true) {
            if (i5 > i3) {
                i5 = i4;
                break;
            }
            entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i5);
            if (a(iHwHealthLineDataSet, entry2, entryForIndex2)) {
                if (!zB) {
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                } else {
                    path.lineTo(entryForIndex2.getX(), entry2.getY() * phaseY);
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                }
                if (i5 == i2) {
                    i5 = i2 + 1;
                    break;
                }
                entry2 = entryForIndex2;
                i4 = i5;
                i5++;
            } else {
                if (zB) {
                    path.lineTo(entry2.getX() + fB, entry2.getY() * phaseY);
                }
                entry = entry2;
            }
            a(path, entry, f, fB, zB);
            return i5;
        }
        entry = entryForIndex2;
        a(path, entry, f, fB, zB);
        return i5;
    }

    private void a(Path path, Entry entry, float f, float f2, boolean z) {
        if (entry != null) {
            if (!z) {
                path.lineTo(entry.getX(), f);
            } else {
                path.lineTo(entry.getX() + f2, entry.getY() * this.mAnimator.getPhaseY());
                path.lineTo(entry.getX() + f2, f);
            }
        }
        path.close();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.github.mikephil.charting.data.Entry] */
    private void b(IHwHealthLineDataSet iHwHealthLineDataSet, int i, Path path, Transformer transformer, qmi qmiVar) {
        if (!(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            LogUtil.e("HealthChart_HwHealthLineChartRendererSepBranch", "!(dataSet instanceof HwHealthLineDataSet)");
            return;
        }
        float[] fArr = {0.0f, this.mChart.getContentRect().bottom + this.mChart.getXAxis().getYOffset()};
        this.mChart.getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
        float f = fArr[1];
        float phaseY = this.mAnimator.getPhaseY();
        path.reset();
        HwHealthLineDataSet hwHealthLineDataSet = (HwHealthLineDataSet) iHwHealthLineDataSet;
        float fD = hwHealthLineDataSet.d(true);
        ?? entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i);
        float[] fArr2 = {entryForIndex.getX(), f};
        float[] fArr3 = {entryForIndex.getX(), entryForIndex.getY() * phaseY};
        float[] fArr4 = {entryForIndex.getX() + hwHealthLineDataSet.b(), entryForIndex.getY() * phaseY};
        transformer.pointValuesToPixel(fArr2);
        transformer.pointValuesToPixel(fArr3);
        transformer.pointValuesToPixel(fArr4);
        if (!qmiVar.b()) {
            float f2 = fD / 2.0f;
            path.moveTo(fArr3[0] - f2, fArr2[1]);
            path.lineTo(fArr3[0] - f2, fArr3[1]);
            path.lineTo(fArr3[0] + f2, fArr3[1]);
            path.lineTo(fArr3[0] + f2, fArr2[1]);
        } else {
            path.moveTo(fArr3[0], fArr2[1]);
            path.lineTo(fArr3[0], fArr3[1]);
            path.lineTo(fArr4[0], fArr4[1]);
            path.lineTo(fArr4[0], fArr2[1]);
        }
        path.close();
    }

    protected void d(Canvas canvas, Path path, Drawable drawable, float f, boolean z) {
        boolean z2 = this.e;
        int iSave = canvas.save();
        canvas.clipPath(path);
        if (z2) {
            canvas.clipPath(this.f46532b);
        }
        if (z) {
            drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) f);
        } else {
            int iContentBottom = (int) this.mViewPortHandler.contentBottom();
            if (a()) {
                iContentBottom = (int) (iContentBottom + this.mChart.getXAxis().getYOffset());
            }
            drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) f, (int) this.mViewPortHandler.contentRight(), iContentBottom);
        }
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.github.mikephil.charting.renderer.LineRadarRenderer
    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) (this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset()));
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void usePaintAsBackground(boolean z) {
        this.f46531a = z;
    }

    public boolean isUsePaintAsBackground() {
        return this.f46531a;
    }

    protected int a(IHwHealthLineDataSet iHwHealthLineDataSet) {
        return c(iHwHealthLineDataSet, false);
    }

    private int c(IHwHealthLineDataSet iHwHealthLineDataSet, boolean z) {
        if (z) {
            return iHwHealthLineDataSet.getColor();
        }
        if (this.f46531a) {
            return Color.argb(51, 0, 0, 0);
        }
        if (this.e) {
            return Color.argb(51, 0, 0, 0);
        }
        return iHwHealthLineDataSet.getColor();
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qnt dataset = getDataset();
        return (dataset == null || dataset.getDataSets() == null || dataset.getDataSets().size() == 0) ? false : true;
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void focusArea(List<qmj> list) {
        boolean z;
        int i = 0;
        if (this.e) {
            z = false;
        } else {
            z = true;
            this.e = true;
        }
        if (list != null && list.size() == this.f46533c.size()) {
            while (true) {
                if (i >= this.f46533c.size()) {
                    if (z) {
                        break;
                    } else {
                        return;
                    }
                } else if (list.get(i).a() != this.f46533c.get(i).a() || list.get(i).d() != this.f46533c.get(i).d()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f46533c.clear();
        if (list != null) {
            this.f46533c.addAll(list);
        }
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            ((HwHealthBaseBarLineChart) this.mChart).invalidate();
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void disableFocusArea() {
        this.e = false;
        this.f46533c.clear();
        this.f46532b.reset();
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            ((HwHealthBaseBarLineChart) this.mChart).invalidate();
        }
    }

    private void c() {
        if (this.e) {
            this.f46532b.reset();
            for (qmj qmjVar : this.f46533c) {
                if (qmjVar != null) {
                    float[] fArr = {qmjVar.a(), 0.0f, qmjVar.d(), 0.0f};
                    if (this.mChart instanceof HwHealthBaseBarLineChart) {
                        this.mChart.getTransformer(((HwHealthBaseBarLineChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
                    }
                    this.f46532b.addRect(fArr[0], this.mViewPortHandler.contentTop(), fArr[2], (int) (this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset()), Path.Direction.CW);
                }
            }
        }
    }
}
