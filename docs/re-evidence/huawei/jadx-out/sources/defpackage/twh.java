package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.main.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class twh extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f49728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49730c;
    private DataInfos e;
    private int h;
    private Path j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private Paint u;

    private int b(float f) {
        if (f >= 90.0f) {
            return 1;
        }
        return f >= 70.0f ? 2 : 4;
    }

    public twh(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context, DataInfos dataInfos) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.n = 1;
        this.j = new Path();
        this.l = false;
        this.u = new Paint();
        this.r = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_color);
        this.o = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_color);
        this.f49730c = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_color);
        this.t = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.q = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.s = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        this.f49729b = ContextCompat.getColor(BaseApplication.getContext(), R.color.hw_show_color_text_30_persent_black);
        this.m = 0;
        this.h = 0;
        LogUtil.a("BloodOxygenLineChartRender", "BloodOxygenLineChartRender");
        f();
        this.e = dataInfos;
    }

    private void f() {
        this.u.setColor(this.f49729b);
        this.u.setAntiAlias(true);
        this.u.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.u.setStyle(Paint.Style.STROKE);
    }

    private Set<Float> b(IHwHealthLineDataSet iHwHealthLineDataSet) {
        HashSet hashSet = new HashSet(16);
        List<HwHealthBaseEntry> listAcquireEntryVals = iHwHealthLineDataSet.acquireEntryVals();
        if (listAcquireEntryVals == null || this.k) {
            LogUtil.j("BloodOxygenLineChartRender", "getRemindSet baseEntries is null or is horizontal");
            return hashSet;
        }
        LogUtil.a("BloodOxygenLineChartRender", "drawLinear baseEntries.size = ", Integer.valueOf(listAcquireEntryVals.size()));
        for (HwHealthBaseEntry hwHealthBaseEntry : listAcquireEntryVals) {
            if (hwHealthBaseEntry instanceof HwHealthLineEntry) {
                HwHealthLineEntry hwHealthLineEntry = (HwHealthLineEntry) hwHealthBaseEntry;
                if ((hwHealthLineEntry.acquireModel() instanceof twg) && ((twg) hwHealthLineEntry.acquireModel()).d()) {
                    hashSet.add(Float.valueOf(hwHealthBaseEntry.getX()));
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            this.k = this.e == DataInfos.BloodOxygenDayHorizontal;
            float phaseY = this.mAnimator.getPhaseY();
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            T entryForIndex = iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min);
            ArrayList arrayList = new ArrayList(16);
            if (entryForIndex == 0) {
                LogUtil.j("BloodOxygenLineChartRender", "entryMin is null");
                return;
            }
            for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
                ?? entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i);
                if (entryForIndex2 != 0 && this.n != 0) {
                    arrayList.add(new PointF(entryForIndex2.getX(), entryForIndex2.getY() * phaseY));
                }
            }
            if (this.n == 0 || arrayList.size() <= 0) {
                return;
            }
            if (this.e != DataInfos.BloodOxygenDayDetail && this.e != DataInfos.BloodOxygenDayHorizontal) {
                LogUtil.j("BloodOxygenLineChartRender", "drawLinear other dataInfos");
            } else {
                b(canvas2, arrayList, iHwHealthLineDataSet, b(iHwHealthLineDataSet));
            }
        }
    }

    private Paint e() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(20.0f);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private void b(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, Set<Float> set) {
        Paint paintE = e();
        Paint paintC = c();
        int size = list.size() * 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[list.size()];
        HashSet hashSet = new HashSet(list.size());
        Iterator<PointF> it = list.iterator();
        float f = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            PointF next = it.next();
            int i4 = i + 1;
            fArr[i] = next.x;
            if (set.contains(Float.valueOf(next.x))) {
                hashSet.add(Integer.valueOf(i2));
            }
            if (next.y == 100.0f || next.y == 99.0f || next.y == 98.0f) {
                i += 2;
                fArr[i4] = next.y - 0.0f;
            } else {
                i += 2;
                fArr[i4] = next.y;
            }
            if (next.y < f) {
                f = next.y;
            }
            i2++;
            fArr2[i3] = b(next.y);
            i3++;
        }
        b(iHwHealthLineDataSet, fArr);
        PointF pointF = new PointF();
        if (c(tvs.b(f))) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            float f2 = fArr[i5] + this.p;
            float f3 = fArr[i5 + 1];
            LinearGradient linearGradientB = b(f2, f3, a(paintE, fArr2[i6]), new float[]{0.0f, 1.0f});
            paintC.setShader(linearGradientB);
            canvas.drawRect(a(f2), this.mViewPortHandler.contentBottom(), f2, f3, paintC);
            pointF.set(f2, f3);
            e(canvas, hashSet, i6, pointF, linearGradientB);
            float f4 = this.p;
            canvas.drawCircle(f2 - f4, f3, f4, paintE);
            i6++;
            i5 += 2;
            size = size;
            paintC = paintC;
        }
    }

    private float a(float f) {
        return f - (this.p * 2);
    }

    private void b(IHwHealthLineDataSet iHwHealthLineDataSet, float[] fArr) {
        float[] fArr2 = {0.0f, 100.0f};
        HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(fArr2);
        this.f49728a = fArr2[1];
        this.p = qqp.a(BaseApplication.getContext(), b());
    }

    private LinearGradient b(float f, float f2, int[] iArr, float[] fArr) {
        return new LinearGradient(f - (this.p * 2), this.mViewPortHandler.contentBottom(), f, f2, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private boolean c(float f) {
        float axisMinimum = (!(this.mChart instanceof HwHealthLineChart) || ((HwHealthLineChart) this.mChart).getAxisFirstParty() == null) ? 0.0f : ((HwHealthLineChart) this.mChart).getAxisFirstParty().getAxisMinimum();
        LogUtil.d("BloodOxygenLineChartRender", "isOutOfChart min = ", Float.valueOf(f), " axisMin = ", Float.valueOf(axisMinimum));
        return f < axisMinimum;
    }

    private void e(Canvas canvas, Set<Integer> set, int i, PointF pointF, LinearGradient linearGradient) {
        if (!set.contains(Integer.valueOf(i)) || this.k) {
            return;
        }
        Path path = new Path();
        float fSqrt = (float) Math.sqrt(3.0d);
        float f = pointF.x;
        int i2 = this.p;
        path.moveTo(f - (i2 * 2), this.f49728a - (i2 * fSqrt));
        path.lineTo(pointF.x, this.f49728a - (this.p * fSqrt));
        path.lineTo(pointF.x - this.p, this.f49728a);
        path.close();
        Paint paint = new Paint();
        paint.setColor(this.o);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        Paint paintC = c();
        paintC.setAlpha(20);
        paintC.setShader(linearGradient);
        canvas.drawRect(pointF.x - (this.p * 2), this.f49728a, pointF.x, pointF.y, paintC);
    }

    private float b() {
        return this.k ? 1.0f : 2.0f;
    }

    private int[] a(Paint paint, float f) {
        int[] iArr = new int[2];
        if (f == 1.0f) {
            int i = this.f49730c;
            iArr[0] = i;
            iArr[1] = i;
            paint.setColor(i);
            return iArr;
        }
        if (f == 2.0f) {
            int i2 = this.o;
            iArr[0] = i2;
            iArr[1] = i2;
            paint.setColor(i2);
            return iArr;
        }
        int i3 = this.r;
        iArr[0] = i3;
        iArr[1] = i3;
        paint.setColor(i3);
        LogUtil.j("R_BloodOxygen_BloodOxygenLineChartRender", "grade no match");
        return iArr;
    }

    @Override // defpackage.qnq
    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        LogUtil.a("BloodOxygenLineChartRender", "set.getHighlightLineWidth() = ", Float.valueOf(iLineScatterCandleRadarDataSet.getHighlightLineWidth()));
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(Color.argb(0, 0, 0, 0));
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.j.reset();
            this.j.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.j.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.j, this.mHighlightPaint);
        }
        if (z2) {
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(-1);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(6.0f), this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(this.m);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(4.0f), this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
            return;
        }
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(this.h);
        int i2 = this.p;
        float f3 = i2;
        canvas.drawCircle(f - f3, f2, f3, this.mHighlightPaint);
        canvas.drawRect(f - (i2 * 2), f2, f, this.mViewPortHandler.contentBottom(), this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length == 0 || lineData == null) {
            return;
        }
        this.k = this.e == DataInfos.BloodOxygenDayHorizontal;
        this.p = qqp.a(BaseApplication.getContext(), b());
        e(lineData, canvas, highlightArr);
    }

    private void e(qnt qntVar, Canvas canvas, Highlight[] highlightArr) {
        float y;
        for (Highlight highlight : highlightArr) {
            List<IHwHealthLineDataSet> dataSets = qntVar.getDataSets();
            if (dataSets != null && dataSets.size() != 0) {
                int iArgb = Color.argb(0, 0, 0, 0);
                if (dataSets.size() == 1) {
                    List<T> entriesForXValue = dataSets.get(0).getEntriesForXValue(highlight.getX());
                    if (entriesForXValue != 0 && entriesForXValue.size() != 0) {
                        Entry hwHealthBaseEntry = (Entry) entriesForXValue.get(0);
                        e(hwHealthBaseEntry);
                        if (this.l && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                            hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                        }
                        if (hwHealthBaseEntry.getY() == 100.0f || hwHealthBaseEntry.getY() == 99.0f || hwHealthBaseEntry.getY() == 98.0f) {
                            float y2 = hwHealthBaseEntry.getY();
                            y = y2 - 0.0f;
                        } else {
                            y = hwHealthBaseEntry.getY();
                        }
                        if (!c(tvs.b(hwHealthBaseEntry.getY()))) {
                            MPPointD mPPointDD = d(dataSets, hwHealthBaseEntry, y);
                            mPPointDD.x += (double) this.p;
                            highlight.setDraw((float) mPPointDD.x, (float) mPPointDD.y);
                            if (this.e == DataInfos.BloodOxygenDayDetail || this.e == DataInfos.BloodOxygenDayHorizontal) {
                                d(canvas, (float) mPPointDD.x, (float) mPPointDD.y, dataSets.get(0), true, false, iArgb);
                            } else {
                                d(canvas, (float) mPPointDD.x, (float) mPPointDD.y, dataSets.get(0), true, true, iArgb);
                            }
                        }
                    }
                } else {
                    c(dataSets, highlight, canvas, iArgb);
                }
            }
        }
    }

    private MPPointD d(List<IHwHealthLineDataSet> list, Entry entry, float f) {
        return this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(entry.getX(), f * this.mAnimator.getPhaseY());
    }

    private void c(List<IHwHealthLineDataSet> list, Highlight highlight, Canvas canvas, int i) {
        for (IHwHealthLineDataSet iHwHealthLineDataSet : list) {
            List<T> entriesForXValue = iHwHealthLineDataSet.getEntriesForXValue(highlight.getX());
            if (entriesForXValue != 0 && entriesForXValue.size() != 0) {
                Entry entry = (Entry) entriesForXValue.get(0);
                MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
                highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                if (this.e == DataInfos.BloodOxygenDayDetail || this.e == DataInfos.BloodOxygenDayHorizontal) {
                    d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, false, false, i);
                } else {
                    d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, false, true, i);
                }
            }
        }
    }

    private void e(Entry entry) {
        LogUtil.a("BloodOxygenLineChartRender", "setHighLightDotColor");
        int iB = b(entry.getY());
        if (iB == 1) {
            this.m = this.f49730c;
            this.h = this.s;
        } else if (iB == 2) {
            this.m = this.o;
            this.h = this.q;
        } else {
            this.m = this.r;
            this.h = this.t;
            LogUtil.j("R_BloodOxygen_BloodOxygenLineChartRender", "high light grade no match");
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        LogUtil.a("BloodOxygenLineChartRender", "usePaintAsBackground");
        this.l = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        LogUtil.a("BloodOxygenLineChartRender", "isUsePaintAsBackground");
        return this.l;
    }
}
