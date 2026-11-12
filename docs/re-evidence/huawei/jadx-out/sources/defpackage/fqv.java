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
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqv extends qnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float[] f34423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected float[] f34424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f34425c;
    protected float[] e;
    private fsq j;
    private float k;
    private final int l;
    private final int m;
    private HwHealthBaseEntry n;
    private float o;
    private int p;
    private Paint s;
    private Paint t;

    private boolean d(boolean z, boolean z2) {
        return (z || z2) ? false : true;
    }

    public fqv(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.m = qqn.d(R.color.emui_color_fg_2);
        this.l = qqn.d(R.color.emuiColor10);
        this.e = new float[4];
        this.f34424b = new float[4];
        this.f34423a = new float[4];
        this.f34425c = new float[4];
        this.p = 1;
        this.s = new Paint();
        this.t = new Paint();
        this.o = Utils.convertDpToPixel(2.0f);
        this.k = Utils.convertDpToPixel(4.0f);
        b();
    }

    @Override // defpackage.qnx
    protected void e(float[] fArr, IHwHealthLineDataSet iHwHealthLineDataSet, Canvas canvas, MPPointF mPPointF, int i) {
        super.e(fArr, iHwHealthLineDataSet, canvas, mPPointF, i);
    }

    private void b() {
        if (this.s == null) {
            this.s = new Paint();
        }
        if (this.t == null) {
            this.t = new Paint();
        }
        this.s.setAntiAlias(true);
        this.s.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.s.setStyle(Paint.Style.STROKE);
        this.t.setAntiAlias(true);
        this.t.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.t.setStyle(Paint.Style.STROKE);
        this.s.setColor(this.m);
        this.t.setColor(this.l);
    }

    @Override // defpackage.qnx, defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            int entryCount = iHwHealthLineDataSet.getEntryCount();
            int i = iHwHealthLineDataSet.isDrawSteppedEnabled() ? 4 : 2;
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            this.mRenderPaint.setStyle(Paint.Style.STROKE);
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            a(entryCount, i);
            e(iHwHealthLineDataSet, i, transformer, canvas2);
            this.mRenderPaint.setPathEffect(null);
        }
    }

    @Override // defpackage.qnq
    protected void a(int i, int i2) {
        int i3 = i * i2;
        int iMax = Math.max(i3, i2) * 2;
        int iMax2 = Math.max(i3, i2) * 4;
        if (this.e.length < iMax) {
            this.e = new float[iMax2];
            this.f34424b = new float[iMax2];
        }
        if (this.f34423a.length < iMax) {
            this.f34423a = new float[iMax2];
            this.f34425c = new float[iMax2];
        }
    }

    @Override // defpackage.qnq
    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet, int i, Transformer transformer, Canvas canvas) {
        int i2;
        fsq fsqVarA;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
            float phaseY = this.mAnimator.getPhaseY();
            int i3 = this.mXBounds.min;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i3 <= this.mXBounds.range + this.mXBounds.min) {
                Entry entryB = b(iHwHealthLineDataSet, i3);
                Entry entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i3);
                fsq fsqVarA2 = a(entryForIndex);
                if (fsqVarA2 == null) {
                    i2 = i3;
                } else {
                    Entry entryE = e(iHwHealthLineDataSet, i3);
                    i2 = i3;
                    int i10 = i6;
                    int i11 = i5;
                    arrayList.add(new PointF(entryForIndex.getX(), fsqVarA2.c() * phaseY));
                    arrayList2.add(new PointF(entryForIndex.getX(), fsqVarA2.b() * phaseY));
                    boolean zB = b(iHwHealthLineDataSet, entryB, entryForIndex);
                    if (d(zB, e(iHwHealthLineDataSet, entryForIndex, entryE))) {
                        this.f34423a[i7] = entryForIndex.getX();
                        this.f34423a[i7 + 1] = fsqVarA2.c() * phaseY;
                        this.f34423a[i7 + 2] = entryForIndex.getX();
                        this.f34423a[i7 + 3] = fsqVarA2.c() * phaseY;
                        this.f34425c[i8] = entryForIndex.getX();
                        this.f34425c[i8 + 1] = fsqVarA2.b() * phaseY;
                        this.f34425c[i8 + 2] = entryForIndex.getX();
                        this.f34425c[i8 + 3] = fsqVarA2.b() * phaseY;
                        i9++;
                        i8 += 4;
                        i7 += 4;
                    }
                    if (entryB == null || !zB || (fsqVarA = a(entryB)) == null) {
                        i6 = i10;
                        i5 = i11;
                    } else {
                        this.e[i4] = entryB.getX();
                        this.e[i4 + 1] = fsqVarA.c() * phaseY;
                        this.e[i4 + 2] = entryForIndex.getX();
                        this.e[i4 + 3] = fsqVarA2.c() * phaseY;
                        this.f34424b[i11] = entryB.getX();
                        this.f34424b[i11 + 1] = fsqVarA.b() * phaseY;
                        this.f34424b[i11 + 2] = entryForIndex.getX();
                        this.f34424b[i11 + 3] = fsqVarA2.b() * phaseY;
                        i6 = i10 + 1;
                        i5 = i11 + 4;
                        i4 += 4;
                    }
                }
                i3 = i2 + 1;
            }
            a(i4, i5, i6, i, transformer, canvas, iHwHealthLineDataSet, i7, i8, i9, arrayList, arrayList2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry] */
    private Entry b(IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        if (i != 0) {
            return iHwHealthLineDataSet.getEntryForIndex(i - 1);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.Entry] */
    private Entry e(IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        if (i != this.mXBounds.range + this.mXBounds.min) {
            return iHwHealthLineDataSet.getEntryForIndex(i + 1);
        }
        return null;
    }

    private fsq a(Entry entry) {
        fsq fsqVar;
        if (entry instanceof HwHealthBaseEntry) {
            HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) entry;
            if (!(hwHealthBaseEntry.getData() instanceof fsq) || (fsqVar = (fsq) hwHealthBaseEntry.getData()) == null) {
                return null;
            }
            return fsqVar;
        }
        return null;
    }

    private boolean b(IHwHealthLineDataSet iHwHealthLineDataSet, Entry entry, Entry entry2) {
        if (entry == null || !(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            return false;
        }
        return ((HwHealthLineDataSet) iHwHealthLineDataSet).e((int) entry.getX(), (int) entry2.getX());
    }

    private boolean e(IHwHealthLineDataSet iHwHealthLineDataSet, Entry entry, Entry entry2) {
        if (entry2 == null || !(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            return false;
        }
        return ((HwHealthLineDataSet) iHwHealthLineDataSet).e((int) entry.getX(), (int) entry2.getX());
    }

    private void c(int i, Transformer transformer, Canvas canvas, int[] iArr) {
        float[] fArr;
        Paint paint;
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        if (iArr[2] == 1) {
            fArr = this.e;
            paint = this.s;
        } else {
            fArr = this.f34424b;
            paint = this.t;
        }
        if (i3 <= 0) {
            return;
        }
        transformer.pointValuesToPixel(fArr);
        int iMax = Math.max(i5 * i, i);
        Path path = new Path();
        path.moveTo(fArr[0], fArr[1]);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = f;
        while (true) {
            int i6 = (i2 * 2) + i4;
            if (i6 < iMax) {
                int i7 = i2 * 4;
                float f4 = fArr[i7];
                float f5 = fArr[i7 + i4];
                int i8 = i6 * 2;
                float f6 = fArr[i8];
                float f7 = fArr[i8 + i4];
                if (d(f3, f4) && d(f2, f5)) {
                    path.lineTo(f6, f7);
                } else {
                    int iSave = canvas.save();
                    LogUtil.d("SectionLineChartRender", "save is ：", Integer.valueOf(iSave));
                    canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f3, (int) this.mViewPortHandler.contentBottom());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(iSave);
                    path.reset();
                    path.moveTo(f4, f5);
                    path.lineTo(f6, f7);
                    f = f4;
                }
                i2++;
                f2 = f7;
                f3 = f6;
                i4 = 1;
            } else {
                c(canvas, f, f3, path, paint);
                return;
            }
        }
    }

    protected void d(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        qnx.e eVar = new qnx.e();
        eVar.a(i);
        super.d(canvas, new Paint(), list, iHwHealthLineDataSet, eVar);
    }

    @Override // defpackage.qnx
    protected void b(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet, qnx.e eVar) {
        for (int i = 0; i < eVar.e().length; i += 2) {
            eVar.c().setAntiAlias(true);
            eVar.c().setStyle(Paint.Style.FILL);
            b(canvas, eVar, iHwHealthLineDataSet, i);
        }
    }

    @Override // defpackage.qnx, defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        List<T> entriesForXValue;
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null || canvas == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            List<T> dataSets = lineData.getDataSets();
            if (dataSets != 0 && dataSets.size() != 0 && dataSets.size() == 1 && (entriesForXValue = ((IHwHealthLineDataSet) dataSets.get(0)).getEntriesForXValue(highlight.getX())) != 0 && entriesForXValue.size() != 0) {
                Entry entry = (Entry) entriesForXValue.get(0);
                if (entry instanceof HwHealthBaseEntry) {
                    HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) entry;
                    this.n = hwHealthBaseEntry;
                    if (hwHealthBaseEntry.getData() instanceof fsq) {
                        this.j = (fsq) this.n.getData();
                    }
                }
                float[] fArr = new float[3];
                if (this.j != null) {
                    fArr[0] = entry.getX();
                    fArr[1] = this.j.b();
                    fArr[2] = this.j.c();
                }
                b(canvas, fArr, (IHwHealthLineDataSet) dataSets.get(0), true, true);
            }
        }
    }

    private void c(Canvas canvas, float f, float f2, Path path, Paint paint) {
        int iSave = canvas.save();
        LogUtil.d("SectionLineChartRender", "save is ：", Integer.valueOf(iSave));
        canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
        canvas.drawPath(path, paint);
        canvas.restoreToCount(iSave);
        path.reset();
    }

    private void a(int i, int i2, int i3, int i4, Transformer transformer, Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet, int i5, int i6, int i7, List<PointF> list, List<PointF> list2) {
        c(i4, transformer, canvas, new int[]{i, i3, 1});
        c(i4, transformer, canvas, new int[]{i2, i3, 2});
        d(canvas, transformer, iHwHealthLineDataSet, new int[]{i5, i7}, (List<PointF>) null);
        d(canvas, transformer, iHwHealthLineDataSet, new int[]{i6, i7}, (List<PointF>) null);
        if (list.size() > 0) {
            d(canvas, list, iHwHealthLineDataSet, 1);
            d(canvas, list2, iHwHealthLineDataSet, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00a6  */
    private void b(Canvas canvas, float[] fArr, IHwHealthLineDataSet iHwHealthLineDataSet, boolean z, boolean z2) {
        int iArgb = Color.argb(0, 0, 0, 0);
        MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(fArr[0], fArr[1] * this.mAnimator.getPhaseY());
        MPPointD pixelForValues2 = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(fArr[0], fArr[2] * this.mAnimator.getPhaseY());
        float f = (float) pixelForValues.x;
        this.mHighlightPaint.setStrokeWidth(iHwHealthLineDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(iArgb);
        this.mHighlightPaint.setPathEffect(iHwHealthLineDataSet.getDashPathEffectHighlight());
        if (iHwHealthLineDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.h.reset();
            if ((this.mChart instanceof Chart) && (((Chart) this.mChart).getMarker() instanceof MarkerView)) {
                this.h.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
                this.h.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
                canvas.drawPath(this.h, this.mHighlightPaint);
            }
        }
        if (z2) {
            float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
            float fConvertDpToPixel2 = Utils.convertDpToPixel(6.0f);
            if (this.mChart instanceof HwHealthCombinedChart) {
                List<T> dataSets = this.mChart.getData().getDataSets();
                if (dataSets.size() > 0 && (dataSets.get(0) instanceof HwHealthBarDataSet)) {
                    float[] fArr2 = {0.0f, 0.0f, a(0.0f), 0.0f};
                    this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr2);
                    fConvertDpToPixel = (fArr2[2] - fArr2[0]) / 2.0f;
                    fConvertDpToPixel2 = 1.5f * fConvertDpToPixel;
                }
            }
            c(pixelForValues, pixelForValues2, canvas, f, fConvertDpToPixel2, fConvertDpToPixel);
        }
    }

    @Override // defpackage.qnx
    protected void b(Canvas canvas, qnx.e eVar, IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        if (i < 0) {
            return;
        }
        float f = eVar.e()[i];
        float f2 = eVar.e()[i + 1];
        eVar.c().setColor(qqn.d(R.color.chart_background_color));
        canvas.drawCircle(f, f2, this.k, eVar.c());
        if (eVar.a() == 1) {
            eVar.c().setColor(this.m);
        } else {
            eVar.c().setColor(this.l);
        }
        canvas.drawCircle(f, f2, this.o, eVar.c());
    }

    private void c(MPPointD mPPointD, MPPointD mPPointD2, Canvas canvas, float f, float f2, float f3) {
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(qqn.d(R.color.chart_background_color));
        float f4 = (float) mPPointD.y;
        float f5 = (float) mPPointD2.y;
        this.mHighlightPaint.setShadowLayer(8.0f, 0.0f, 6.0f, qqn.d(R.color.chart_shadow_color));
        canvas.drawCircle(f, f4, f2, this.mHighlightPaint);
        canvas.drawCircle(f, f5, f2, this.mHighlightPaint);
        this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(this.l);
        canvas.drawCircle(f, f4, f3, this.mHighlightPaint);
        this.mHighlightPaint.setColor(this.m);
        canvas.drawCircle(f, f5, f3, this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }
}
