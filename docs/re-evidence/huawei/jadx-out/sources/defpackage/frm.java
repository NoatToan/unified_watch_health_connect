package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class frm extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f34443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34444c;
    private Path e;
    private Paint h;
    private int j;

    @Override // defpackage.qnq
    protected boolean a() {
        return false;
    }

    public frm(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.j = 1;
        this.h = new Paint();
        this.f34442a = false;
        this.e = new Path();
        this.f34443b = new Paint();
        this.f34444c = context.getResources().getColor(R.color.sleep_curve_color);
        c();
    }

    private void c() {
        this.h.setColor(this.f34444c);
        this.h.setAntiAlias(true);
        this.h.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.h.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            int entryCount = iHwHealthLineDataSet.getEntryCount();
            boolean zIsDrawSteppedEnabled = iHwHealthLineDataSet.isDrawSteppedEnabled();
            int i = zIsDrawSteppedEnabled ? 4 : 2;
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            float phaseY = this.mAnimator.getPhaseY();
            this.mRenderPaint.setStyle(Paint.Style.STROKE);
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            if (iHwHealthLineDataSet.getColors().size() > 1) {
                if (this.g.length <= i * 2) {
                    this.g = new float[i * 4];
                }
                a(iHwHealthLineDataSet, zIsDrawSteppedEnabled, transformer, phaseY, canvas2);
            } else {
                d(entryCount, i);
                d((HwHealthLineDataSet) iHwHealthLineDataSet, i, transformer, phaseY, canvas2);
            }
            this.mRenderPaint.setPathEffect(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.data.Entry] */
    private void a(IHwHealthLineDataSet iHwHealthLineDataSet, boolean z, Transformer transformer, float f, Canvas canvas) {
        int i = z ? 4 : 2;
        for (int i2 = this.mXBounds.min; i2 <= this.mXBounds.range + this.mXBounds.min; i2++) {
            ?? entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i2);
            if (entryForIndex != 0) {
                this.g[0] = entryForIndex.getX();
                this.g[1] = entryForIndex.getY() * f;
                if (i2 < this.mXBounds.max) {
                    Entry entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i2 + 1);
                    if (entryForIndex2 == null) {
                        return;
                    } else {
                        d(z, f, entryForIndex2);
                    }
                } else {
                    this.g[2] = this.g[0];
                    this.g[3] = this.g[1];
                }
                transformer.pointValuesToPixel(this.g);
                if (!this.mViewPortHandler.isInBoundsRight(this.g[0])) {
                    return;
                }
                boolean z2 = (this.mViewPortHandler.isInBoundsTop(this.g[1]) || this.mViewPortHandler.isInBoundsBottom(this.g[3])) ? false : true;
                if (this.mViewPortHandler.isInBoundsLeft(this.g[2]) && !z2) {
                    this.mRenderPaint.setColor(iHwHealthLineDataSet.getColor(i2));
                    canvas.drawLines(this.g, 0, i * 2, this.mRenderPaint);
                }
            }
        }
    }

    private void d(int i, int i2) {
        int i3 = i * i2;
        if (this.g.length < Math.max(i3, i2) * 2) {
            this.g = new float[Math.max(i3, i2) * 4];
        }
        if (this.f.length < Math.max(i3, i2) * 2) {
            this.f = new float[Math.max(i3, i2) * 4];
        }
    }

    private void d(boolean z, float f, Entry entry) {
        if (z) {
            this.g[2] = entry.getX();
            this.g[3] = this.g[1];
            this.g[4] = this.g[2];
            this.g[5] = this.g[3];
            this.g[6] = entry.getX();
            this.g[7] = entry.getY() * f;
            return;
        }
        this.g[2] = entry.getX();
        this.g[3] = entry.getY() * f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.data.Entry] */
    private void d(HwHealthLineDataSet hwHealthLineDataSet, int i, Transformer transformer, float f, Canvas canvas) {
        Object entryForIndex = hwHealthLineDataSet.getEntryForIndex(this.mXBounds.min);
        ArrayList arrayList = new ArrayList(31);
        if (entryForIndex != null) {
            int i2 = this.mXBounds.min;
            int i3 = 0;
            int i4 = 0;
            while (i2 <= this.mXBounds.range + this.mXBounds.min) {
                ?? entryForIndex2 = i2 != 0 ? hwHealthLineDataSet.getEntryForIndex(i2 - 1) : 0;
                ?? entryForIndex3 = hwHealthLineDataSet.getEntryForIndex(i2);
                if (entryForIndex3 != 0) {
                    if (this.j != 0) {
                        arrayList.add(new PointF(entryForIndex3.getX(), entryForIndex3.getY() * f));
                    }
                    if (entryForIndex2 != 0) {
                        this.g[i3] = entryForIndex2.getX();
                        this.g[i3 + 1] = entryForIndex2.getY() * f;
                        this.g[i3 + 2] = entryForIndex3.getX();
                        this.g[i3 + 3] = entryForIndex3.getY() * f;
                        i4++;
                        i3 += 4;
                    }
                }
                i2++;
            }
            b(i, transformer, canvas, i3, i4);
            if (this.j == 0 || arrayList.size() <= 0) {
                return;
            }
            c(canvas, arrayList, hwHealthLineDataSet);
        }
    }

    private void b(int i, Transformer transformer, Canvas canvas, int i2, int i3) {
        if (i2 <= 0) {
            return;
        }
        transformer.pointValuesToPixel(this.g);
        int iMax = Math.max(i3 * i, i);
        Path path = new Path();
        int i4 = 0;
        path.moveTo(this.g[0], this.g[1]);
        float f = this.g[0];
        float f2 = this.g[0];
        float f3 = this.g[0];
        float f4 = this.g[1];
        while (true) {
            int i5 = (i4 * 2) + 1;
            if (i5 < iMax) {
                int i6 = i4 * 4;
                float f5 = this.g[i6];
                float f6 = this.g[i6 + 1];
                int i7 = i5 * 2;
                float f7 = this.g[i7];
                int i8 = iMax;
                float f8 = this.g[i7 + 1];
                if (b(f3, f5) && b(f4, f6)) {
                    path.lineTo(f7, f8);
                } else {
                    int iSave = canvas.save();
                    LogUtil.d("SleepManagementLineChartRender", "save is ：", Integer.valueOf(iSave));
                    canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                    canvas.drawPath(path, this.h);
                    canvas.restoreToCount(iSave);
                    path.reset();
                    path.moveTo(f5, f6);
                    path.lineTo(f7, f8);
                    f = f5;
                }
                i4++;
                f4 = f8;
                f2 = f7;
                f3 = f2;
                iMax = i8;
            } else {
                int iSave2 = canvas.save();
                LogUtil.d("SleepManagementLineChartRender", "save is ：", Integer.valueOf(iSave2));
                canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                canvas.drawPath(path, this.h);
                canvas.restoreToCount(iSave2);
                path.reset();
                return;
            }
        }
    }

    private boolean b(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-7f;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        this.f34442a = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.f34442a;
    }

    private void c(Canvas canvas, List<PointF> list, HwHealthLineDataSet hwHealthLineDataSet) {
        this.f34443b.setAntiAlias(true);
        float fConvertDpToPixel = Utils.convertDpToPixel(8.0f);
        if (this.j == 1) {
            this.f34443b.setStyle(Paint.Style.STROKE);
            float[] fArr = new float[list.size() * 2];
            float[] fArr2 = new float[list.size() * 2];
            int i = 0;
            int i2 = 0;
            for (PointF pointF : list) {
                fArr[i] = pointF.x;
                fArr[i + 1] = pointF.y;
                fArr2[i2] = pointF.x;
                fArr2[i2 + 1] = pointF.y;
                i2 += 2;
                i += 2;
            }
            this.mChart.getTransformer(hwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
            b bVar = new b();
            this.f34443b.setColor(this.f34444c);
            bVar.e(this.f34443b);
            bVar.e(fArr);
            bVar.b(fArr2);
            b(canvas, hwHealthLineDataSet, fConvertDpToPixel, bVar);
            this.f34443b.reset();
        }
    }

    private void b(Canvas canvas, HwHealthLineDataSet hwHealthLineDataSet, float f, b bVar) {
        String[] strArr;
        int i = 0;
        int i2 = 0;
        while (i < bVar.e().length) {
            bVar.c().setAntiAlias(true);
            bVar.c().setStyle(Paint.Style.FILL);
            float f2 = bVar.e()[i];
            float f3 = bVar.e()[i + 1];
            List<Integer> circleColors = hwHealthLineDataSet.getCircleColors();
            c(canvas, f, bVar, i, circleColors, i2);
            if (i2 == (bVar.e().length / 2) - 1) {
                bVar.c().setTextAlign(LanguageUtil.ba(BaseApplication.getContext()) ? Paint.Align.LEFT : Paint.Align.RIGHT);
                bVar.c().setColor(circleColors.get(circleColors.size() - 1).intValue());
                bVar.c().setTextSize(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
                String[] strArrE = e(hwHealthLineDataSet);
                float fD = d(hwHealthLineDataSet);
                if (fD > Math.pow(10.0d, -6.0d)) {
                    float f4 = ((f2 / fD) * 96.0f) - f2;
                    if (strArrE.length == 1) {
                        strArr = strArrE;
                        canvas.drawText(strArr[0], f2 + f4, c(strArrE, canvas, f3, f, 1), bVar.c());
                    } else {
                        strArr = strArrE;
                    }
                    if (strArr.length == 2) {
                        float f5 = f2 + f4;
                        canvas.drawText(strArr[0], f5, c(strArr, canvas, f3, f, 1), bVar.c());
                        canvas.drawText(strArr[1], f5, c(strArr, canvas, f3, f, 2), bVar.c());
                    }
                }
            }
            i += 2;
            i2++;
        }
    }

    private int c(String[] strArr, Canvas canvas, float f, float f2, int i) {
        float f3;
        if (strArr.length == 1) {
            f3 = f < ((float) canvas.getHeight()) / 2.0f ? (f2 * 3.0f) + f : f - (f2 * 2.0f);
        } else {
            f3 = 0.0f;
        }
        if (strArr.length == 2) {
            if (f < canvas.getHeight() / 2.0f) {
                if (i == 1) {
                    f3 = f + (3.0f * f2);
                }
                if (i == 2) {
                    f3 = f + (f2 * 5.0f);
                }
            } else {
                if (i == 1) {
                    f3 = f - (4.0f * f2);
                }
                if (i == 2) {
                    f3 = f - (f2 * 2.0f);
                }
            }
        }
        return (int) f3;
    }

    private String[] e(HwHealthLineDataSet hwHealthLineDataSet) {
        HwHealthBaseEntry hwHealthBaseEntry;
        String[] strArr = new String[0];
        List<T> listAcquireEntryVals = hwHealthLineDataSet.acquireEntryVals();
        if (njy.e(listAcquireEntryVals) || (hwHealthBaseEntry = (HwHealthBaseEntry) listAcquireEntryVals.get(listAcquireEntryVals.size() - 1)) == null) {
            return strArr;
        }
        Object data = hwHealthBaseEntry.getData();
        if (!(data instanceof String)) {
            LogUtil.a("SleepManagementLineChartRender", "des is not string");
            return strArr;
        }
        return ((String) data).split(",");
    }

    private float d(HwHealthLineDataSet hwHealthLineDataSet) {
        HwHealthBaseEntry hwHealthBaseEntry;
        List<T> listAcquireEntryVals = hwHealthLineDataSet.acquireEntryVals();
        if (njy.e(listAcquireEntryVals) || (hwHealthBaseEntry = (HwHealthBaseEntry) listAcquireEntryVals.get(listAcquireEntryVals.size() - 1)) == null) {
            return 0.0f;
        }
        return hwHealthBaseEntry.getX();
    }

    private void c(Canvas canvas, float f, b bVar, int i, List<Integer> list, int i2) {
        if (i < 0) {
            return;
        }
        float f2 = bVar.e()[i];
        float f3 = bVar.e()[i + 1];
        if (njy.e(list, i2)) {
            bVar.c().setColor(this.f34444c);
        } else {
            bVar.c().setColor(list.get(i2).intValue());
        }
        canvas.drawCircle(f2, f3, f / 2.0f, bVar.c());
        bVar.c().setColor(qqn.d(R.color.id_fa_color_text_primary_contrary));
        canvas.drawCircle(f2, f3, f / 4.0f, bVar.c());
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        boolean z;
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null || canvas == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            List<T> dataSets = lineData.getDataSets();
            if (dataSets != 0 && dataSets.size() != 0) {
                int iArgb = Color.argb(0, 0, 0, 0);
                if (dataSets.size() == 1) {
                    List<T> entriesForXValue = ((IHwHealthLineDataSet) dataSets.get(0)).getEntriesForXValue(highlight.getX());
                    if (entriesForXValue != 0 && entriesForXValue.size() != 0) {
                        Entry hwHealthBaseEntry = (Entry) entriesForXValue.get(0);
                        if (this.f34442a && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                            hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                            z = false;
                        } else {
                            z = true;
                        }
                        MPPointD pixelForValues = this.mChart.getTransformer(((IHwHealthLineDataSet) dataSets.get(0)).getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
                        highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                        d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, (ILineScatterCandleRadarDataSet) dataSets.get(0), true, z, iArgb);
                    }
                } else {
                    MPPointD pixelForValues2 = this.mChart.getTransformer(((IHwHealthLineDataSet) dataSets.get(0)).getAxisDependencyExt()).getPixelForValues(highlight.getX(), 0.0f);
                    double d = pixelForValues2.x;
                    double d2 = pixelForValues2.y;
                    d(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, (ILineScatterCandleRadarDataSet) dataSets.get(0), true, false, iArgb);
                    for (T t : dataSets) {
                        List<T> entriesForXValue2 = t.getEntriesForXValue(highlight.getX());
                        if (entriesForXValue2 != 0 && entriesForXValue2.size() != 0) {
                            Entry entry = (Entry) entriesForXValue2.get(0);
                            MPPointD pixelForValues3 = this.mChart.getTransformer(t.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
                            highlight.setDraw((float) pixelForValues3.x, (float) pixelForValues3.y);
                            d(canvas, (float) pixelForValues3.x, (float) pixelForValues3.y, t, false, true, iArgb);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.qnq
    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
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
            float fConvertDpToPixel = Utils.convertDpToPixel(8.0f);
            float fConvertDpToPixel2 = Utils.convertDpToPixel(12.0f);
            if (this.mChart instanceof HwHealthCombinedChart) {
                List<T> dataSets = this.mChart.getData().getDataSets();
                if (dataSets.size() > 0 && (dataSets.get(0) instanceof HwHealthBarDataSet)) {
                    float[] fArr = {0.0f, 0.0f, b(0.0f), 0.0f};
                    this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
                    fConvertDpToPixel = (fArr[2] - fArr[0]) / 2.0f;
                    fConvertDpToPixel2 = 1.5f * fConvertDpToPixel;
                }
            }
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(3.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(qqn.d(R.color.id_fa_color_foreground_contrary));
            canvas.drawCircle(f, f2, fConvertDpToPixel2 / 2.0f, this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            List<Integer> circleColors = ((HwHealthLineDataSet) iLineScatterCandleRadarDataSet).getCircleColors();
            this.mHighlightPaint.setColor(circleColors.get(circleColors.size() - 1).intValue());
            canvas.drawCircle(f, f2, fConvertDpToPixel / 2.0f, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        }
    }

    private float b(float f) {
        qly barData = ((HwHealthCombinedChart) this.mChart).getBarData();
        return barData != null ? barData.a() : f;
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Paint f34445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f34446c;
        private float[] e;

        b() {
        }

        public float[] e() {
            return this.f34446c;
        }

        public void e(float[] fArr) {
            this.f34446c = fArr;
        }

        public void b(float[] fArr) {
            this.e = fArr;
        }

        public Paint c() {
            return this.f34445b;
        }

        public void e(Paint paint) {
            this.f34445b = paint;
        }
    }
}
