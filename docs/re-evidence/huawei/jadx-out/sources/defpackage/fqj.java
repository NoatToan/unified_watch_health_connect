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
import com.huawei.health.servicesui.R;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;
import health.compact.a.SystemProperties;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class fqj extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataInfos f34408a;
    private Paint aa;
    private float ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f34409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qoc f34410c;
    private int e;
    private int h;
    private float j;
    private HwHealthRenderMode k;
    private boolean l;
    private int m;
    private boolean n;
    private Path o;
    private int p;
    private float q;
    private int r;
    private int s;
    private float t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public static int a(float f) {
        if (f <= 100.0f && f < 90.0f) {
            return f >= 80.0f ? 70 : 60;
        }
        return 85;
    }

    private int e(float f) {
        if (f >= 90.0f) {
            return 1;
        }
        return f >= 70.0f ? 2 : 4;
    }

    public fqj(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context, DataInfos dataInfos) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.r = 1;
        this.o = new Path();
        this.n = false;
        this.f34409b = "tablet".equals(SystemProperties.d("ro.build.characteristics"));
        this.aa = new Paint();
        this.w = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.s = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.e = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        this.v = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.u = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.x = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        this.h = ContextCompat.getColor(BaseApplication.getContext(), R.color.hw_show_color_text_30_persent_black);
        this.p = 0;
        this.m = 0;
        this.k = null;
        this.f34410c = null;
        this.q = 0.0f;
        this.t = 0.0f;
        LogUtil.a("BloodOxygenLineChartRender", "BloodOxygenLineChartRender");
        j();
        this.f34408a = dataInfos;
        if (this.mChart instanceof HwHealthBaseBarLineChart) {
            this.k = new HwHealthRenderMode((HwHealthBaseBarLineChart) this.mChart, this.mViewPortHandler);
            this.f34410c = new qnv(this.k, this.f34408a);
        }
    }

    private void j() {
        this.aa.setColor(this.h);
        this.aa.setAntiAlias(true);
        this.aa.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.aa.setStyle(Paint.Style.STROKE);
    }

    private Set<Float> b(IHwHealthLineDataSet iHwHealthLineDataSet) {
        HashSet hashSet = new HashSet(16);
        List<HwHealthBaseEntry> listAcquireEntryVals = iHwHealthLineDataSet.acquireEntryVals();
        if (listAcquireEntryVals == null || this.l) {
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

    /* JADX WARN: Type inference failed for: r5v5, types: [com.github.mikephil.charting.data.Entry] */
    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        ?? entryForIndex;
        if (iHwHealthLineDataSet.isDataCalculated()) {
            if (this.f34408a == DataInfos.BloodOxygenAltitudeDayDetail || this.f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal) {
                a(canvas, iHwHealthLineDataSet);
            }
            this.l = this.f34408a == DataInfos.BloodOxygenDayHorizontal || this.f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal;
            float phaseY = this.mAnimator.getPhaseY();
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            T entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min);
            ArrayList arrayList = new ArrayList(16);
            if (entryForIndex2 == 0) {
                LogUtil.j("BloodOxygenLineChartRender", "entryMin is null");
                return;
            }
            for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min + 1; i++) {
                if (i < iHwHealthLineDataSet.getEntryCount() && (entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i)) != 0 && entryForIndex.getY() != 0.0f) {
                    if (entryForIndex.getX() <= this.mChart.getHighestVisibleX() && this.r != 0) {
                        arrayList.add(new PointF(entryForIndex.getX(), entryForIndex.getY() * phaseY));
                    }
                }
            }
            if (this.r == 0 || arrayList.size() <= 0) {
                return;
            }
            if (this.f34408a != DataInfos.BloodOxygenDayDetail && this.f34408a != DataInfos.BloodOxygenDayHorizontal && this.f34408a != DataInfos.BloodOxygenAltitudeDayDetail && this.f34408a != DataInfos.BloodOxygenAltitudeDayHorizontal) {
                LogUtil.j("BloodOxygenLineChartRender", "drawLinear other dataInfos");
            } else {
                c(canvas2, arrayList, iHwHealthLineDataSet, b(iHwHealthLineDataSet));
            }
        }
    }

    private void a(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (!(iHwHealthLineDataSet instanceof HwHealthLineDataSet)) {
            LogUtil.j("BloodOxygenLineChartRender", "drawLinear !(dataSetArg instanceof  HwHealthLineDataSet)");
            return;
        }
        HwHealthLineDataSet hwHealthLineDataSet = (HwHealthLineDataSet) iHwHealthLineDataSet;
        hwHealthLineDataSet.setColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_altitude_blue_color));
        hwHealthLineDataSet.a(Color.argb(102, 0, 199, a.A), Color.argb(0, 0, 199, a.A), true);
        hwHealthLineDataSet.setFillAlpha(51);
        Canvas canvas2 = this.mBitmapCanvas;
        if (hwHealthLineDataSet.isDataCalculated()) {
            this.k.a(hwHealthLineDataSet);
            this.k.a();
            HwHealthRenderMode.IRenderMode iRenderModeD = this.k.d();
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
                    this.f34410c.a(canvas2, (IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer, this.mChart.getTransformer(hwHealthLineDataSet.getAxisDependencyExt()));
                }
            }
        }
    }

    public void c(Canvas canvas, Highlight[] highlightArr) {
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            if (highlight != null) {
                List<IHwHealthLineDataSet> dataSets = lineData.getDataSets();
                if (!njy.e(dataSets)) {
                    e(canvas, highlight, dataSets, Color.argb(0, 0, 0, 0));
                }
            }
        }
    }

    private void e(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
        if (list.size() == 1) {
            b(canvas, highlight, list, i);
        } else {
            a(canvas, highlight, list, i);
        }
    }

    private void a(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
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

    private void b(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
        HwHealthBaseEntry hwHealthBaseEntry;
        boolean z;
        fqt fqtVar;
        List<HwHealthBaseEntry> listE = e(highlight, list);
        if (listE == null) {
            return;
        }
        HwHealthBaseEntry hwHealthBaseEntry2 = listE.get(0);
        List<Entry> arrayList = new ArrayList();
        if (list.get(0) instanceof HwHealthBaseBarLineDataSet) {
            arrayList = ((HwHealthBaseBarLineDataSet) list.get(0)).getValues();
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        for (Entry entry : arrayList) {
            if ((entry.getData() instanceof fqt) && (fqtVar = (fqt) entry.getData()) != null && fqtVar.b() != Integer.MAX_VALUE) {
                int iB = fqtVar.b();
                if (iB > i2) {
                    i2 = iB;
                }
                if (iB < i3) {
                    i3 = iB;
                }
            }
        }
        int i4 = i3 % 50;
        int i5 = i4 == 0 ? i3 - 50 : i3 - i4;
        int i6 = i2 % 50;
        int i7 = i2 + 50;
        if (i6 != 0) {
            i7 -= i6;
        }
        float f = (i7 - i5) / 20.5f;
        float f2 = i5;
        if ((this.k.d() instanceof HwHealthRenderMode.e) && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
            z = false;
            hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
        } else {
            hwHealthBaseEntry = hwHealthBaseEntry2;
            z = true;
        }
        c(canvas, highlight, list, i, hwHealthBaseEntry, f, f2 - (80.5f * f), z);
    }

    private void c(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i, Entry entry, float f, float f2, boolean z) {
        if (entry.getData() instanceof fqt) {
            fqt fqtVar = (fqt) entry.getData();
            if (fqtVar.b() == Integer.MAX_VALUE) {
                return;
            }
            MPPointD pixelForValues = this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(entry.getX(), ((fqtVar.b() * this.mAnimator.getPhaseY()) - f2) / f);
            highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
            c(canvas, (float) pixelForValues.x, (float) pixelForValues.y, list.get(0), true, z, i);
        }
    }

    private List<HwHealthBaseEntry> e(Highlight highlight, List<IHwHealthLineDataSet> list) {
        if (!(this.mChart instanceof HwHealthBaseBarLineChart)) {
            return null;
        }
        IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = list.get(0).cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
        if (!(iHwHealthDatasContainerCacheDataContainer instanceof fqi)) {
            return null;
        }
        List<HwHealthBaseEntry> listA = ((fqi) iHwHealthDatasContainerCacheDataContainer).a(highlight.getX());
        if (njy.e(listA)) {
            return null;
        }
        return listA;
    }

    protected void c(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(i);
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.o.reset();
            this.o.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.o.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.o, this.mHighlightPaint);
        }
        if (z2) {
            float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
            float fConvertDpToPixel2 = Utils.convertDpToPixel(6.0f);
            if (this.mChart instanceof HwHealthCombinedChart) {
                if (i() != 0.0f) {
                    fConvertDpToPixel = i();
                }
                fConvertDpToPixel2 = 1.5f * fConvertDpToPixel;
            }
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(qqn.d(com.huawei.ui.commonui.R.color.colorBackground));
            canvas.drawCircle(f, f2, fConvertDpToPixel2, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_altitude_blue_color));
            canvas.drawCircle(f, f2, fConvertDpToPixel, this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        }
    }

    private float i() {
        List<T> dataSets = this.mChart.getData().getDataSets();
        if (!njy.b(dataSets) || !(dataSets.get(0) instanceof HwHealthBarDataSet) || ((HwHealthCombinedChart) this.mChart).getBarData() == null) {
            return 0.0f;
        }
        float[] fArr = {0.0f, 0.0f, ((HwHealthCombinedChart) this.mChart).getBarData().a(), 0.0f};
        this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
        return (fArr[2] - fArr[0]) / 2.0f;
    }

    private Paint e() {
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

    private void c(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, Set<Float> set) {
        List<PointF> list2 = list;
        Paint paintE = e();
        Paint paintC = c();
        int size = list.size() * 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[list.size()];
        HashSet hashSet = new HashSet(list.size());
        c(list2, iHwHealthLineDataSet, fArr2);
        Iterator<PointF> it = list.iterator();
        float f = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            PointF next = it.next();
            int i3 = i + 1;
            fArr[i] = next.x;
            Iterator<PointF> it2 = it;
            if (set.contains(Float.valueOf(next.x))) {
                hashSet.add(Integer.valueOf(i2));
            }
            if (next.y == 100.0f || next.y == 99.0f || next.y == 98.0f) {
                i += 2;
                fArr[i3] = next.y - 0.0f;
            } else {
                i += 2;
                fArr[i3] = next.y;
            }
            if (next.y < f) {
                f = next.y;
            }
            i2++;
            it = it2;
        }
        d(iHwHealthLineDataSet, fArr);
        PointF pointF = new PointF();
        if (d(a(f))) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            float f2 = fArr[i4] + this.y;
            float f3 = list2.get(i4 / 2).y;
            if (Float.isNaN(f3)) {
                return;
            }
            LinearGradient linearGradientA = a(f2, f3, b(paintE, fArr2[i5]), new float[]{0.0f, 1.0f});
            paintC.setShader(linearGradientA);
            d(canvas, paintC, f2, f3);
            pointF.set(f2, f3);
            c(canvas, hashSet, i5, pointF, linearGradientA);
            paintE.setAlpha(153);
            paintE.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            b(canvas, paintE, f2, f3);
            i5++;
            i4 += 2;
            list2 = list;
            paintC = paintC;
        }
    }

    private void d(Canvas canvas, Paint paint, float f, float f2) {
        if (this.f34409b && this.l) {
            canvas.drawRect(b(f), this.mViewPortHandler.contentBottom(), f + 4.0f, f2, paint);
        } else {
            canvas.drawRect(b(f), this.mViewPortHandler.contentBottom(), f, f2, paint);
        }
    }

    private void b(Canvas canvas, Paint paint, float f, float f2) {
        if (this.f34409b && this.l) {
            int i = this.y;
            canvas.drawCircle((f + 2.0f) - i, f2, i + 2, paint);
        } else {
            float f3 = this.y;
            canvas.drawCircle(f - f3, f2, f3, paint);
        }
    }

    private void c(List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, float[] fArr) {
        Integer[] numArrD = fqr.d(iHwHealthLineDataSet.getYMin(), iHwHealthLineDataSet.getYMax());
        int i = 0;
        if (!njy.c(numArrD, 0)) {
            LogUtil.a("BloodOxygenLineChartRender", "null args!");
            return;
        }
        int iIntValue = numArrD[0].intValue();
        int iIntValue2 = numArrD[1].intValue();
        float f = (this.mChart.getContentRect().bottom - this.mChart.getContentRect().top) / 4.0f;
        float f2 = this.mChart.getContentRect().bottom;
        float f3 = this.mChart.getContentRect().bottom - (f * 2.0f);
        this.ad = f3;
        float f4 = (f2 - f3) / (iIntValue - iIntValue2);
        this.q = f4;
        this.t = f3 - (f4 * iIntValue2);
        for (PointF pointF : list) {
            fArr[i] = e(pointF.y);
            pointF.set(pointF.x, (((int) pointF.y) * this.q) + this.t);
            i++;
        }
    }

    private float b(float f) {
        return f - (this.y * 2);
    }

    private void d(IHwHealthLineDataSet iHwHealthLineDataSet, float[] fArr) {
        float[] fArr2 = {0.0f, 100.0f};
        HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(fArr2);
        this.j = fArr2[1];
        this.y = qqp.a(BaseApplication.getContext(), b());
    }

    private LinearGradient a(float f, float f2, int[] iArr, float[] fArr) {
        return new LinearGradient(f - (this.y * 2), this.mViewPortHandler.contentBottom(), f, f2, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private boolean d(float f) {
        float axisMinimum = (!(this.mChart instanceof HwHealthLineChart) || ((HwHealthLineChart) this.mChart).getAxisFirstParty() == null) ? 0.0f : ((HwHealthLineChart) this.mChart).getAxisFirstParty().getAxisMinimum();
        LogUtil.d("BloodOxygenLineChartRender", "isOutOfChart min = ", Float.valueOf(f), " axisMin = ", Float.valueOf(axisMinimum));
        return f < axisMinimum;
    }

    private void c(Canvas canvas, Set<Integer> set, int i, PointF pointF, LinearGradient linearGradient) {
        if (!set.contains(Integer.valueOf(i)) || this.l) {
            return;
        }
        Path path = new Path();
        float fSqrt = (float) Math.sqrt(3.0d);
        float f = this.ad + (this.y * fSqrt);
        float f2 = pointF.x;
        int i2 = this.y;
        path.moveTo(f2 - (i2 * 2), f - (i2 * fSqrt));
        path.lineTo(pointF.x, f - (this.y * fSqrt));
        path.lineTo(pointF.x - this.y, f);
        path.close();
        Paint paint = new Paint();
        paint.setColor(this.s);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        Paint paintC = c();
        paintC.setAlpha(20);
        paintC.setShader(linearGradient);
        float f3 = pointF.x;
        int i3 = this.y;
        canvas.drawRect(f3 - (i3 * 2), f - (i3 * fSqrt), pointF.x, pointF.y, paintC);
    }

    private float b() {
        return (this.f34408a == DataInfos.BloodOxygenDayHorizontal || this.f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal) ? 0.2f : 2.0f;
    }

    private int[] b(Paint paint, float f) {
        int[] iArr = new int[2];
        if (f == 1.0f) {
            int i = this.e;
            iArr[0] = i;
            iArr[1] = i;
            paint.setColor(i);
            return iArr;
        }
        if (f == 2.0f) {
            int i2 = this.s;
            iArr[0] = i2;
            iArr[1] = i2;
            paint.setColor(i2);
            return iArr;
        }
        int i3 = this.w;
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
            this.o.reset();
            this.o.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.o.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.o, this.mHighlightPaint);
        }
        if (z2) {
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStrokeWidth(1.0f);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(-1);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(6.0f), this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(this.p);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(4.0f), this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
            return;
        }
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(this.m);
        int i2 = this.y;
        float f3 = i2;
        canvas.drawCircle(f - f3, f2, f3, this.mHighlightPaint);
        canvas.drawRect(f - (i2 * 2), f2, f, this.mViewPortHandler.contentBottom(), this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt qntVarA = a(canvas, highlightArr);
        if (qntVarA == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            List<T> dataSets = qntVarA.getDataSets();
            if (dataSets != 0 && dataSets.size() != 0) {
                int iArgb = Color.argb(0, 0, 0, 0);
                if (dataSets.size() == 1) {
                    c(canvas, highlight, (List<IHwHealthLineDataSet>) dataSets, iArgb);
                } else {
                    a((List<IHwHealthLineDataSet>) dataSets, highlight, canvas, iArgb);
                }
            }
        }
    }

    private void c(Canvas canvas, Highlight highlight, List<IHwHealthLineDataSet> list, int i) {
        float y;
        Entry entryB = b(highlight, list);
        if (entryB == null) {
            return;
        }
        e(entryB);
        if (this.n && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
            entryB = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
        }
        float f = 0.0f;
        if (entryB.getY() == 100.0f || entryB.getY() == 99.0f || entryB.getY() == 98.0f) {
            float y2 = entryB.getY();
            y = y2 - 0.0f;
        } else {
            y = entryB.getY();
        }
        if (d(a(entryB.getY()))) {
            return;
        }
        MPPointD mPPointDC = c(list, entryB, y);
        float f2 = this.q;
        if (f2 != 0.0f) {
            float f3 = this.t;
            if (f3 != 0.0f) {
                f = (y * f2) + f3;
            }
        }
        mPPointDC.x += (double) this.y;
        highlight.setDraw((float) mPPointDC.x, (float) mPPointDC.y);
        a(canvas, list, i, mPPointDC, f);
    }

    private void a(Canvas canvas, List<IHwHealthLineDataSet> list, int i, MPPointD mPPointD, float f) {
        if (this.f34408a == DataInfos.BloodOxygenDayDetail || this.f34408a == DataInfos.BloodOxygenDayHorizontal || this.f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal) {
            d(canvas, (float) mPPointD.x, f, list.get(0), true, false, i);
        } else if (this.f34408a == DataInfos.BloodOxygenAltitudeDayDetail) {
            d(canvas, (float) mPPointD.x, f, list.get(0), true, false, i);
        } else {
            d(canvas, (float) mPPointD.x, (float) mPPointD.y, list.get(0), true, true, i);
        }
    }

    private Entry b(Highlight highlight, List<IHwHealthLineDataSet> list) {
        List<T> entriesForXValue = list.get(0).getEntriesForXValue(highlight.getX());
        if (entriesForXValue == 0 || entriesForXValue.size() == 0) {
            return null;
        }
        Entry entry = new Entry();
        boolean z = true;
        for (T t : entriesForXValue) {
            if (t.getY() != 0.0f) {
                z = false;
                entry = t;
            }
        }
        if (z) {
            return null;
        }
        return entry;
    }

    private qnt a(Canvas canvas, Highlight[] highlightArr) {
        if (this.f34408a == DataInfos.BloodOxygenAltitudeDayDetail || this.f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal) {
            c(canvas, highlightArr);
        }
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null) {
            return null;
        }
        this.l = this.f34408a == DataInfos.BloodOxygenDayHorizontal;
        this.y = qqp.a(BaseApplication.getContext(), b());
        return lineData;
    }

    private MPPointD c(List<IHwHealthLineDataSet> list, Entry entry, float f) {
        return this.mChart.getTransformer(list.get(0).getAxisDependencyExt()).getPixelForValues(entry.getX(), f * this.mAnimator.getPhaseY());
    }

    private void a(List<IHwHealthLineDataSet> list, Highlight highlight, Canvas canvas, int i) {
        for (IHwHealthLineDataSet iHwHealthLineDataSet : list) {
            List<T> entriesForXValue = iHwHealthLineDataSet.getEntriesForXValue(highlight.getX());
            if (entriesForXValue != 0 && entriesForXValue.size() != 0) {
                Entry entry = (Entry) entriesForXValue.get(0);
                MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
                highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                if (this.f34408a == DataInfos.BloodOxygenDayDetail || this.f34408a == DataInfos.BloodOxygenDayHorizontal) {
                    d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, false, false, i);
                } else {
                    d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, false, true, i);
                }
            }
        }
    }

    private void e(Entry entry) {
        LogUtil.a("BloodOxygenLineChartRender", "setHighLightDotColor");
        int iE = e(entry.getY());
        if (iE == 1) {
            this.p = this.e;
            this.m = this.x;
        } else if (iE == 2) {
            this.p = this.s;
            this.m = this.u;
        } else {
            this.p = this.w;
            this.m = this.v;
            LogUtil.j("R_BloodOxygen_BloodOxygenLineChartRender", "high light grade no match");
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        LogUtil.a("BloodOxygenLineChartRender", "usePaintAsBackground");
        this.n = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        LogUtil.a("BloodOxygenLineChartRender", "isUsePaintAsBackground");
        return this.n;
    }
}
