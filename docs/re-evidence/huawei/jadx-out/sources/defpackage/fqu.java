package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import health.compact.a.SystemProperties;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class fqu extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34422c;
    private DataInfos e;
    private Path h;
    private int j;
    private boolean k;
    private float l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private float s;
    private int t;
    private int u;
    private Paint v;
    private int x;
    private int y;

    public static int a(float f) {
        if (f <= 100.0f && f < 90.0f) {
            return f >= 80.0f ? 70 : 60;
        }
        return 85;
    }

    public fqu(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context, DataInfos dataInfos) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.p = 1;
        this.h = new Path();
        this.o = false;
        this.k = "tablet".equals(SystemProperties.d("ro.build.characteristics"));
        this.v = new Paint();
        this.r = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.m = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.f34422c = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        this.y = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.u = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.x = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        this.f34421b = ContextCompat.getColor(BaseApplication.getContext(), R.color.hw_show_color_text_30_persent_black);
        this.q = 0;
        this.j = 0;
        LogUtil.a("BloodOxygenLineChartRender", "BloodOxygenLineChartRender");
        j();
        this.e = dataInfos;
    }

    private void j() {
        this.v.setColor(this.f34421b);
        this.v.setAntiAlias(true);
        this.v.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.v.setStyle(Paint.Style.STROKE);
    }

    private Set<Float> c(IHwHealthLineDataSet iHwHealthLineDataSet) {
        HashSet hashSet = new HashSet(16);
        List<HwHealthBaseEntry> listAcquireEntryVals = iHwHealthLineDataSet.acquireEntryVals();
        if (listAcquireEntryVals == null || this.n) {
            LogUtil.j("BloodOxygenLineChartRender", "getRemindSet baseEntries is null or is horizontal");
            return hashSet;
        }
        LogUtil.a("BloodOxygenLineChartRender", "drawLinear baseEntries.size = ", Integer.valueOf(listAcquireEntryVals.size()));
        for (HwHealthBaseEntry hwHealthBaseEntry : listAcquireEntryVals) {
            if (hwHealthBaseEntry instanceof HwHealthLineEntry) {
                HwHealthLineEntry hwHealthLineEntry = (HwHealthLineEntry) hwHealthBaseEntry;
                if ((hwHealthLineEntry.acquireModel() instanceof fqt) && ((fqt) hwHealthLineEntry.acquireModel()).a()) {
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
            this.n = this.e == DataInfos.BloodOxygenDayHorizontal;
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
                if (entryForIndex2 != 0 && entryForIndex2.getY() != 0.0f && this.p != 0) {
                    arrayList.add(new PointF(entryForIndex2.getX(), entryForIndex2.getY() * phaseY));
                }
            }
            if (this.p == 0 || arrayList.size() <= 0) {
                return;
            }
            if (this.e != DataInfos.BloodOxygenDayDetail && this.e != DataInfos.BloodOxygenDayHorizontal) {
                LogUtil.j("BloodOxygenLineChartRender", "drawLinear other dataInfos");
            } else {
                b(canvas2, arrayList, iHwHealthLineDataSet, c(iHwHealthLineDataSet));
            }
        }
    }

    private Paint b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(20.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(153);
        return paint;
    }

    private Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(153);
        return paint;
    }

    private void b(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, Set<Float> set) {
        Rect rect;
        Paint paintB = b();
        Paint paintC = c();
        int size = list.size() * 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[list.size()];
        HashSet hashSet = new HashSet(list.size());
        b(list, iHwHealthLineDataSet);
        Iterator<PointF> it = list.iterator();
        float f = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            PointF next = it.next();
            int i4 = i + 1;
            fArr[i] = next.x;
            Iterator<PointF> it2 = it;
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
            fArr2[i3] = b(next.y, true);
            i3++;
            it = it2;
        }
        d(iHwHealthLineDataSet, fArr);
        PointF pointF = new PointF();
        ChartTouchHelper accessibilityHelper = ((HwHealthBaseBarLineChart) this.mChart).getAccessibilityHelper();
        if (accessibilityHelper != null) {
            accessibilityHelper.a().b();
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            float f2 = this.t + fArr[i5];
            int i7 = i5 / 2;
            float f3 = list.get(i7).y;
            int i8 = i5;
            int i9 = size;
            LinearGradient linearGradientD = d(f2, f3, d(paintB, fArr2[i6]), new float[]{0.0f, 1.0f});
            paintC.setShader(linearGradientD);
            a(canvas, paintC, f2, f3);
            if (accessibilityHelper != null) {
                AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i7);
                if (this.k && this.n) {
                    rect = new Rect((int) b(f2), (int) f3, (int) (f2 + 4.0f), (int) this.mViewPortHandler.contentBottom());
                } else {
                    rect = new Rect((int) b(f2), (int) f3, (int) f2, (int) this.mViewPortHandler.contentBottom());
                }
                abstractTouchNodeA.setRect(rect);
                abstractTouchNodeA.setDescription(c(iHwHealthLineDataSet, list.get(i7).x));
            } else {
                linearGradientD = linearGradientD;
                paintC = paintC;
                fArr = fArr;
                fArr2 = fArr2;
            }
            pointF.set(f2, f3);
            b(canvas, hashSet, i6, pointF, linearGradientD);
            i6++;
            paintB.setAlpha(153);
            paintB.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            c(canvas, paintB, f2, f3);
            i5 = i8 + 2;
            size = i9;
            hashSet = hashSet;
            fArr = fArr;
            paintC = paintC;
            fArr2 = fArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String c(IHwHealthLineDataSet iHwHealthLineDataSet, float f) {
        String formattedValue;
        HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) iHwHealthLineDataSet.getEntryForXValue(f, 0.0f);
        if (hwHealthBaseEntry == null) {
            LogUtil.j("BloodOxygenLineChartRender", "entry is null");
            return "";
        }
        IAxisValueFormatter valueFormatter = ((HwHealthBaseScrollBarLineChart) this.mChart).getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(hwHealthBaseEntry.getX(), this.mChart.getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(hwHealthBaseEntry.getX(), this.mChart.getXAxis());
        }
        String strF = qre.f(R.string.IDS_mean_blood_oxygen);
        if (this.e == DataInfos.BloodOxygenDayDetail) {
            formattedValue = qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, formattedValue, strF);
        }
        return qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, formattedValue, ltc.c(hwHealthBaseEntry.getY(), 2, 0));
    }

    private void a(Canvas canvas, Paint paint, float f, float f2) {
        if (this.k && this.n) {
            canvas.drawRect(b(f), this.mViewPortHandler.contentBottom(), f + 4.0f, f2, paint);
        } else {
            canvas.drawRect(b(f), this.mViewPortHandler.contentBottom(), f, f2, paint);
        }
    }

    private void c(Canvas canvas, Paint paint, float f, float f2) {
        if (this.k && this.n) {
            int i = this.t;
            canvas.drawCircle((f + 2.0f) - i, f2, i + 2, paint);
        } else {
            float f3 = this.t;
            canvas.drawCircle(f - f3, f2, f3, paint);
        }
    }

    private void b(List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet) {
        Integer[] numArrD = fqr.d(iHwHealthLineDataSet.getYMin(), iHwHealthLineDataSet.getYMax());
        if (!njy.c(numArrD, 0)) {
            LogUtil.a("BloodOxygenLineChartRender", "null args!");
            return;
        }
        int iIntValue = numArrD[0].intValue();
        int iIntValue2 = numArrD[1].intValue();
        float f = this.mChart.getContentRect().bottom;
        float fA = this.mChart.getContentRect().top + qqp.a(BaseApplication.getContext(), e());
        float f2 = (f - fA) / (iIntValue - iIntValue2);
        this.s = f2;
        this.l = fA - (f2 * iIntValue2);
        for (PointF pointF : list) {
            pointF.set(pointF.x, (((int) pointF.y) * this.s) + this.l);
        }
    }

    private float b(float f) {
        return f - (this.t * 2);
    }

    private void d(IHwHealthLineDataSet iHwHealthLineDataSet, float[] fArr) {
        float[] fArr2 = {0.0f, 100.0f};
        HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(fArr2);
        this.f34420a = fArr2[1];
        this.t = qqp.a(BaseApplication.getContext(), e());
    }

    private LinearGradient d(float f, float f2, int[] iArr, float[] fArr) {
        return new LinearGradient(f - (this.t * 2), this.mViewPortHandler.contentBottom(), f, f2, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private boolean c(float f) {
        float axisMinimum = (!(this.mChart instanceof HwHealthLineChart) || ((HwHealthLineChart) this.mChart).getAxisFirstParty() == null) ? 0.0f : ((HwHealthLineChart) this.mChart).getAxisFirstParty().getAxisMinimum();
        LogUtil.d("BloodOxygenLineChartRender", "isOutOfChart min = ", Float.valueOf(f), " axisMin = ", Float.valueOf(axisMinimum));
        return f < axisMinimum;
    }

    private void b(Canvas canvas, Set<Integer> set, int i, PointF pointF, LinearGradient linearGradient) {
        if (!set.contains(Integer.valueOf(i)) || this.n) {
            return;
        }
        Path path = new Path();
        float fSqrt = (float) Math.sqrt(3.0d);
        float f = this.mChart.getContentRect().top;
        float f2 = this.t;
        float f3 = f + f2 + (f2 * fSqrt);
        float f4 = pointF.x;
        int i2 = this.t;
        path.moveTo(f4 - (i2 * 2), f3 - (i2 * fSqrt));
        path.lineTo(pointF.x, f3 - (this.t * fSqrt));
        path.lineTo(pointF.x - this.t, f3);
        path.close();
        Paint paint = new Paint();
        paint.setColor(this.m);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        Paint paintC = c();
        paintC.setAlpha(20);
        paintC.setShader(linearGradient);
        float f5 = pointF.x;
        int i3 = this.t;
        canvas.drawRect(f5 - (i3 * 2), f3 - (i3 * fSqrt), pointF.x, pointF.y, paintC);
    }

    private float e() {
        return this.n ? 0.2f : 2.0f;
    }

    private int[] d(Paint paint, float f) {
        int[] iArr = new int[2];
        if (f == 1.0f) {
            int i = this.f34422c;
            iArr[0] = i;
            iArr[1] = i;
            paint.setColor(i);
            return iArr;
        }
        if (f == 2.0f) {
            int i2 = this.m;
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

    private int b(float f, boolean z) {
        if (z && (this.e == DataInfos.BloodOxygenAltitudeDayDetail || this.e == DataInfos.BloodOxygenDayDetail || this.e == DataInfos.BloodOxygenDayHorizontal)) {
            f = (f - this.l) / this.s;
        }
        if (f > 89.0f) {
            return 1;
        }
        return f >= 70.0f ? 2 : 4;
    }

    @Override // defpackage.qnq
    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        LogUtil.a("BloodOxygenLineChartRender", "set.getHighlightLineWidth() = ", Float.valueOf(iLineScatterCandleRadarDataSet.getHighlightLineWidth()));
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(Color.argb(0, 0, 0, 0));
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.h.reset();
            this.h.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.h.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.h, this.mHighlightPaint);
        }
        if (z2) {
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(-1);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(6.0f), this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(this.q);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(4.0f), this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
            return;
        }
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(this.j);
        int i2 = this.t;
        float f3 = i2;
        canvas.drawCircle(f - f3, f2, f3, this.mHighlightPaint);
        canvas.drawRect(f - (i2 * 2), f2, f, this.mViewPortHandler.contentBottom(), this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt lineData = this.mChart.getLineData();
        if (e(highlightArr, lineData)) {
            return;
        }
        int i = 1;
        int i2 = 0;
        this.n = this.e == DataInfos.BloodOxygenDayHorizontal;
        this.t = qqp.a(BaseApplication.getContext(), e());
        int length = highlightArr.length;
        int i3 = 0;
        while (i3 < length) {
            Highlight highlight = highlightArr[i3];
            List<T> dataSets = lineData.getDataSets();
            if (!c((List<IHwHealthLineDataSet>) dataSets)) {
                int iArgb = Color.argb(i2, i2, i2, i2);
                if (dataSets.size() == i) {
                    List<T> entriesForXValue = ((IHwHealthLineDataSet) dataSets.get(i2)).getEntriesForXValue(highlight.getX());
                    if (!a((List<HwHealthBaseEntry>) entriesForXValue)) {
                        Entry entry = (Entry) entriesForXValue.get(i2);
                        if (entry.getY() == 0.0f) {
                            return;
                        }
                        d(entry);
                        Entry entryA = a(highlight, entry);
                        float fC = c(entryA);
                        if (!c(a(entryA.getY()))) {
                            MPPointD mPPointDB = b((List<IHwHealthLineDataSet>) dataSets, entryA, fC);
                            float fD = d(fC, 0.0f);
                            mPPointDB.x += (double) this.t;
                            highlight.setDraw((float) mPPointDB.x, (float) mPPointDB.y);
                            e(canvas, (List<IHwHealthLineDataSet>) dataSets, iArgb, mPPointDB, fD);
                        }
                    }
                } else {
                    a((List<IHwHealthLineDataSet>) dataSets, highlight, canvas, iArgb);
                }
            }
            i3++;
            i = 1;
            i2 = 0;
        }
    }

    private boolean a(List<HwHealthBaseEntry> list) {
        return list == null || list.size() == 0;
    }

    private boolean c(List<IHwHealthLineDataSet> list) {
        return list == null || list.size() == 0;
    }

    private boolean e(Highlight[] highlightArr, qnt qntVar) {
        return highlightArr == null || highlightArr.length <= 0 || qntVar == null;
    }

    private float d(float f, float f2) {
        float f3 = this.s;
        if (f3 != 0.0f) {
            float f4 = this.l;
            if (f4 != 0.0f) {
                return (f * f3) + f4;
            }
        }
        return f2;
    }

    private Entry a(Highlight highlight, Entry entry) {
        return (this.o && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) ? new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue()) : entry;
    }

    private void e(Canvas canvas, List<IHwHealthLineDataSet> list, int i, MPPointD mPPointD, float f) {
        if (this.e == DataInfos.BloodOxygenDayDetail || this.e == DataInfos.BloodOxygenDayHorizontal) {
            d(canvas, (float) mPPointD.x, f, list.get(0), true, false, i);
        } else {
            d(canvas, (float) mPPointD.x, f, list.get(0), true, true, i);
        }
    }

    private float c(Entry entry) {
        if (entry.getY() == 100.0f || entry.getY() == 99.0f || entry.getY() == 98.0f) {
            float y = entry.getY();
            return y - 0.0f;
        }
        return entry.getY();
    }

    private MPPointD b(List<IHwHealthLineDataSet> list, Entry entry, float f) {
        return this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(entry.getX(), f * this.mAnimator.getPhaseY());
    }

    private void a(List<IHwHealthLineDataSet> list, Highlight highlight, Canvas canvas, int i) {
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

    private void d(Entry entry) {
        LogUtil.a("BloodOxygenLineChartRender", "setHighLightDotColor");
        int iB = b(entry.getY(), false);
        if (iB == 1) {
            this.q = this.f34422c;
            this.j = this.x;
        } else if (iB == 2) {
            this.q = this.m;
            this.j = this.u;
        } else {
            this.q = this.r;
            this.j = this.y;
            LogUtil.j("R_BloodOxygen_BloodOxygenLineChartRender", "high light grade no match");
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        LogUtil.a("BloodOxygenLineChartRender", "usePaintAsBackground");
        this.o = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        LogUtil.a("BloodOxygenLineChartRender", "isUsePaintAsBackground");
        return this.o;
    }
}
