package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.health.knit.section.chart.HwHealthPressureBarChart;
import com.huawei.health.knit.section.view.SectionLineChart;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class frf extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34434c;
    private int e;
    private int h;
    private int j;
    private int k;
    private Path l;
    private int m;
    private DataInfos n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private Paint y;

    private int b(float f) {
        if (f >= 1.0f && f <= 29.0f) {
            return 1;
        }
        if (f <= 29.0f || f >= 60.0f) {
            return (f < 60.0f || f >= 80.0f) ? 4 : 3;
        }
        return 2;
    }

    public frf(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context, DataInfos dataInfos) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.s = 1;
        this.l = new Path();
        this.r = false;
        this.y = new Paint();
        this.t = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_4);
        this.p = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_3);
        this.m = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_2);
        this.h = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_1);
        this.f34432a = BaseApplication.getContext().getResources().getColor(R.color.color_4de67e17);
        this.e = BaseApplication.getContext().getResources().getColor(R.color.color_4dffdf80);
        this.f34434c = BaseApplication.getContext().getResources().getColor(R.color.color_4d67dbe6);
        this.f34433b = BaseApplication.getContext().getResources().getColor(R.color.color_4d3db6f2);
        this.v = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_4);
        this.u = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_3);
        this.x = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_2);
        this.w = BaseApplication.getContext().getResources().getColor(R.color.color_pressure_1);
        this.j = BaseApplication.getContext().getResources().getColor(R.color.health_pressureline_color);
        this.o = BaseApplication.getContext().getResources().getColor(R.color.color_26000000);
        this.q = 0;
        this.k = 0;
        b();
        this.n = dataInfos;
    }

    private void b() {
        this.y.setColor(this.j);
        this.y.setAntiAlias(true);
        this.y.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.y.setStyle(Paint.Style.STROKE);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.github.mikephil.charting.data.Entry] */
    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            int entryCount = iHwHealthLineDataSet.getEntryCount();
            int i = iHwHealthLineDataSet.isDrawSteppedEnabled() ? 4 : 2;
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            float phaseY = this.mAnimator.getPhaseY();
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            int i2 = entryCount * i;
            if (this.g.length < Math.max(i2, i) * 2) {
                this.g = new float[Math.max(i2, i) * 4];
            }
            if (this.f.length < Math.max(i2, i) * 2) {
                this.f = new float[Math.max(i2, i) * 4];
            }
            T entryForIndex = iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min);
            ArrayList arrayList = new ArrayList(10);
            ArrayList arrayList2 = new ArrayList(10);
            if (entryForIndex != 0) {
                for (int i3 = this.mXBounds.min; i3 <= this.mXBounds.range + this.mXBounds.min; i3++) {
                    ?? entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i3);
                    if (DataInfos.PressureDayDetail == this.n && entryForIndex2 != 0) {
                        arrayList2.add(new Entry(entryForIndex2.getX(), entryForIndex2.getY()));
                    }
                    if (entryForIndex2 != 0 && this.s != 0) {
                        arrayList.add(new PointF(entryForIndex2.getX(), entryForIndex2.getY() * phaseY));
                    }
                }
                e(i, transformer, canvas2, c(iHwHealthLineDataSet, phaseY, arrayList2));
                if (this.s == 0 || arrayList.size() <= 0) {
                    return;
                }
                if (DataInfos.PressureDayDetail == this.n) {
                    b(canvas2, arrayList, iHwHealthLineDataSet);
                } else {
                    a(canvas2, arrayList, iHwHealthLineDataSet);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry] */
    private int c(IHwHealthLineDataSet iHwHealthLineDataSet, float f, List<Entry> list) {
        ?? entryForIndex;
        Object entryForIndex2;
        Entry entry;
        int i = 0;
        int i2 = 0;
        for (int i3 = this.mXBounds.min; i3 <= this.mXBounds.range + this.mXBounds.min; i3++) {
            ?? r3 = 0;
            if (i3 == 0) {
                entryForIndex = 0;
            } else if (DataInfos.PressureDayDetail == this.n) {
                int i4 = i3 - 1;
                if (list.size() - 1 >= i4) {
                    entryForIndex = list.get(i4);
                } else {
                    entryForIndex = 0;
                }
            } else {
                entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i3 - 1);
            }
            if (DataInfos.PressureDayDetail == this.n) {
                if (list.size() - 1 >= i3) {
                    entry = list.get(i3);
                }
            } else {
                entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i3);
            }
            if (r3 == 0) {
                r3 = entryForIndex2;
                r3 = entry;
            } else if (entryForIndex != 0 && (DataInfos.PressureDayDetail != this.n || a(entryForIndex.getX(), r3.getX()))) {
                this.g[i2] = entryForIndex.getX();
                this.g[i2 + 1] = entryForIndex.getY() * f;
                this.g[i2 + 2] = r3.getX();
                this.g[i2 + 3] = r3.getY() * f;
                i++;
                i2 += 4;
            }
        }
        return i;
    }

    private void e(int i, Transformer transformer, Canvas canvas, int i2) {
        if (i2 <= 0) {
            return;
        }
        transformer.pointValuesToPixel(this.g);
        int iMax = Math.max(i2 * i, i);
        if (DataInfos.PressureDayDetail == this.n) {
            return;
        }
        Path path = new Path();
        int i3 = 0;
        path.moveTo(this.g[0], this.g[1]);
        float f = this.g[0];
        float f2 = this.g[0];
        float f3 = this.g[0];
        float f4 = this.g[1];
        while (true) {
            int i4 = (i3 * 2) + 1;
            if (i4 < iMax) {
                int i5 = i3 * 4;
                float f5 = this.g[i5];
                float f6 = this.g[i5 + 1];
                int i6 = i4 * 2;
                float f7 = this.g[i6];
                float f8 = this.g[i6 + 1];
                if (c(f3, f5) && c(f4, f6)) {
                    path.lineTo(f7, f8);
                } else {
                    canvas.save();
                    canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                    this.y.setShadowLayer(10.0f, 0.0f, 5.0f, this.o);
                    canvas.drawPath(path, this.y);
                    canvas.restore();
                    path.reset();
                    path.moveTo(f5, f6);
                    path.lineTo(f7, f8);
                    f = f5;
                }
                i3++;
                f4 = f8;
                f2 = f7;
                f3 = f2;
            } else {
                canvas.save();
                canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                this.y.setShadowLayer(10.0f, 0.0f, 5.0f, this.o);
                canvas.drawPath(path, this.y);
                canvas.restore();
                path.reset();
                return;
            }
        }
    }

    private boolean c(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-7f;
    }

    private void b(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        int size = list.size() * 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[list.size()];
        int i = 0;
        int i2 = 0;
        for (PointF pointF : list) {
            fArr[i] = pointF.x;
            fArr[i + 1] = pointF.y;
            fArr2[i2] = b(pointF.y);
            i2++;
            i += 2;
        }
        this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
        ChartTouchHelper accessibilityHelper = ((HwHealthBaseBarLineChart) this.mChart).getAccessibilityHelper();
        if (accessibilityHelper != null) {
            accessibilityHelper.a().b();
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            float f = fArr[i3];
            float f2 = fArr[i3 + 1];
            int iA = qqp.a(BaseApplication.getContext(), 2.0f);
            a(paint, fArr2[i4]);
            paint.setAlpha(153);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            float f3 = iA;
            canvas.drawCircle(f, f2, f3, paint);
            canvas.drawRect(f - f3, f2, f + f3, this.mViewPortHandler.contentBottom(), paint);
            if (accessibilityHelper != null) {
                AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i4);
                int i5 = (int) f;
                abstractTouchNodeA.setRect(new Rect(i5 - iA, (int) f2, i5 + iA, (int) this.mViewPortHandler.contentBottom()));
                abstractTouchNodeA.setDescription(d(iHwHealthLineDataSet, list.get(i4).x));
            }
            i3 += 2;
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String d(IHwHealthLineDataSet iHwHealthLineDataSet, float f) {
        String formattedValue;
        HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) iHwHealthLineDataSet.getEntryForXValue(f, 0.0f);
        SectionLineChart section = ((HwHealthPressureBarChart) this.mChart).getSection();
        if (section == null || hwHealthBaseEntry == null) {
            LogUtil.j("PressureLineChartRender", "section ", section, " entry", hwHealthBaseEntry);
            return "";
        }
        IAxisValueFormatter valueFormatter = ((HwHealthBaseScrollBarLineChart) this.mChart).getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(hwHealthBaseEntry.getX(), this.mChart.getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(hwHealthBaseEntry.getX(), this.mChart.getXAxis());
        }
        String[] strArr = {section.getThirdLayerText(), section.b(hwHealthBaseEntry), section.a(hwHealthBaseEntry)};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                formattedValue = qre.a(R.string.IDS_two_parts, formattedValue, str);
            }
        }
        return formattedValue;
    }

    private void a(Paint paint, float f) {
        if (f == 1.0f) {
            paint.setColor(this.h);
            return;
        }
        if (f == 2.0f) {
            paint.setColor(this.m);
            return;
        }
        if (f == 3.0f) {
            paint.setColor(this.p);
        } else if (f == 4.0f) {
            paint.setColor(this.t);
        } else {
            LogUtil.a("PressureLineChartRender", "grade no match");
        }
    }

    private void a(Canvas canvas, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet) {
        Paint paint = new Paint();
        boolean z = true;
        paint.setAntiAlias(true);
        float f = 4.0f;
        float fConvertDpToPixel = Utils.convertDpToPixel(4.0f);
        if (this.s == 1) {
            paint.setStyle(Paint.Style.STROKE);
            int size = list.size() * 2;
            float[] fArr = new float[size];
            float[] fArr2 = new float[list.size()];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (PointF pointF : list) {
                fArr[i2] = pointF.x;
                fArr[i2 + 1] = pointF.y;
                fArr2[i3] = b(pointF.y);
                i3++;
                i2 += 2;
            }
            this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
            ChartTouchHelper accessibilityHelper = ((HwHealthBaseBarLineChart) this.mChart).getAccessibilityHelper();
            if (accessibilityHelper != null) {
                accessibilityHelper.a().b();
            }
            int i4 = 0;
            while (i < size) {
                float f2 = fArr2[i4];
                if (f2 == 1.0f) {
                    paint.setColor(this.h);
                } else if (f2 == 2.0f) {
                    paint.setColor(this.m);
                } else if (f2 == 3.0f) {
                    paint.setColor(this.p);
                } else if (f2 == f) {
                    paint.setColor(this.t);
                } else {
                    LogUtil.a("PressureLineChartRender", "no grade match!");
                }
                paint.setAntiAlias(z);
                paint.setStyle(Paint.Style.FILL);
                float f3 = fArr[i];
                float f4 = fArr[i + 1];
                canvas.drawCircle(f3, f4, fConvertDpToPixel, paint);
                paint.setColor(-1);
                canvas.drawCircle(f3, f4, fConvertDpToPixel / 2.0f, paint);
                if (iHwHealthLineDataSet.isVisible() && accessibilityHelper != null) {
                    AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i4);
                    abstractTouchNodeA.setRect(new Rect((int) (f3 - fConvertDpToPixel), (int) (f4 - fConvertDpToPixel), (int) (f3 + fConvertDpToPixel), (int) (f4 + fConvertDpToPixel)));
                    abstractTouchNodeA.setDescription(d(iHwHealthLineDataSet, list.get(i4).x));
                }
                i += 2;
                i4++;
                z = true;
                f = 4.0f;
            }
        }
    }

    @Override // defpackage.qnq
    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(i);
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.l.reset();
            this.l.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
            this.l.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
            canvas.drawPath(this.l, this.mHighlightPaint);
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
        this.mHighlightPaint.setColor(this.k);
        float fA = qqp.a(BaseApplication.getContext(), 2.0f);
        canvas.drawCircle(f, f2, fA, this.mHighlightPaint);
        canvas.drawRect(f - fA, f2, f + fA, this.mViewPortHandler.contentBottom(), this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null) {
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
                        e(hwHealthBaseEntry);
                        if (this.r && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                            hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                        }
                        MPPointD pixelForValues = this.mChart.getTransformer(((IHwHealthLineDataSet) dataSets.get(0)).getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
                        highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                        if (DataInfos.PressureDayDetail == this.n) {
                            d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, (ILineScatterCandleRadarDataSet) dataSets.get(0), true, false, iArgb);
                        } else {
                            d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, (ILineScatterCandleRadarDataSet) dataSets.get(0), true, true, iArgb);
                        }
                    }
                } else {
                    for (T t : dataSets) {
                        List<T> entriesForXValue2 = t.getEntriesForXValue(highlight.getX());
                        if (entriesForXValue2 != 0 && entriesForXValue2.size() != 0) {
                            Entry entry = (Entry) entriesForXValue2.get(0);
                            MPPointD pixelForValues2 = this.mChart.getTransformer(t.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
                            highlight.setDraw((float) pixelForValues2.x, (float) pixelForValues2.y);
                            if (DataInfos.PressureDayDetail == this.n) {
                                d(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, t, false, false, iArgb);
                            } else {
                                d(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, t, false, true, iArgb);
                            }
                        }
                    }
                }
            }
        }
    }

    private void e(Entry entry) {
        int iB = b(entry.getY());
        if (iB == 1) {
            this.q = this.h;
            this.k = this.w;
            return;
        }
        if (iB == 2) {
            this.q = this.m;
            this.k = this.x;
        } else if (iB == 3) {
            this.q = this.p;
            this.k = this.u;
        } else if (iB == 4) {
            this.q = this.t;
            this.k = this.v;
        } else {
            LogUtil.a("PressureLineChartRender", "high light grade no match");
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        this.r = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.r;
    }

    private boolean a(float f, float f2) {
        Date date = new Date(((long) f) * 60000);
        Date date2 = new Date(((long) f2) * 60000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(6);
        calendar.setTime(date2);
        return calendar.get(6) == i;
    }
}
