package qm;

import am.r1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import p005kotlin.math.MathKt;
import ps.x0;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqm/c0;", "Lqm/e;", "Landroid/content/Context;", "ctx", "Lzm/p;", "chartData", "Lqm/j;", "chartStyle", "", "height", "", "fullScreen", "<init>", "(Landroid/content/Context;Lzm/p;Lqm/j;IZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f145331z = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zm.p f145332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f145333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<o20.a> f145334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<x0> f145335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f145336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f145337r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f145338t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f145339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f145340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final b00.g f145341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gc0.a f145342y;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/c0$a", "Llz/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends lz.a {
        public a() {
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            motionEvent.getClass();
            int i14 = c0.f145331z;
            c0 c0Var = c0.this;
            LineChart lineChart = c0Var.f134442b;
            if (lineChart != null) {
                if (c0Var.f145338t) {
                    c0Var.f145338t = false;
                    lineChart.fitScreen();
                    return;
                }
                lineChart.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                c0Var.f145338t = true;
                LineChart lineChart2 = c0Var.f134442b;
                int lowestVisibleXIndex = lineChart2 != null ? lineChart2.getLowestVisibleXIndex() : 0;
                LineChart lineChart3 = c0Var.f134442b;
                c0Var.y(new j23.l(lowestVisibleXIndex, lineChart3 != null ? lineChart3.getHighestVisibleXIndex() : 1));
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            motionEvent.getClass();
            chartGesture.getClass();
            int i14 = c0.f145331z;
            c0 c0Var = c0.this;
            c0Var.x();
            LineChart lineChart = c0Var.f134442b;
            int lowestVisibleXIndex = lineChart != null ? lineChart.getLowestVisibleXIndex() : 0;
            LineChart lineChart2 = c0Var.f134442b;
            c0Var.y(new j23.l(lowestVisibleXIndex, lineChart2 != null ? lineChart2.getHighestVisibleXIndex() : 1));
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            motionEvent.getClass();
            c0 c0Var = c0.this;
            c0Var.f145338t = true;
            LineChart lineChart = c0Var.f134442b;
            int lowestVisibleXIndex = lineChart != null ? lineChart.getLowestVisibleXIndex() : 0;
            LineChart lineChart2 = c0Var.f134442b;
            c0Var.y(new j23.l(lowestVisibleXIndex, lineChart2 != null ? lineChart2.getHighestVisibleXIndex() : 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, zm.p pVar, j jVar, int i14, boolean z14) {
        super(context, pVar, jVar);
        context.getClass();
        pVar.getClass();
        jVar.getClass();
        this.f145332m = pVar;
        this.f145333n = z14;
        this.f145334o = pVar.P(0);
        List<x0> listO2 = pVar.O2();
        this.f145335p = listO2 == null ? p13.j0.f134944a : listO2;
        this.f145336q = r1.p(context);
        this.f145340w = new a();
        this.f145341x = new b00.g(this, 6);
        this.f145342y = new gc0.a(this, 2);
    }

    public static final float[] w(c0 c0Var) {
        List<o20.a> list = c0Var.f145334o;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((o20.a) it.next()).D()));
        }
        y0.b(arrayList).remove(arrayList.size() - 1);
        Double dU0 = p13.h0.u0(arrayList);
        Double dP0 = p13.h0.p0(arrayList);
        double dN = p13.h0.N(arrayList);
        if (dU0 == null || dP0 == null) {
            return new float[]{0.05f, 0.15f, 0.25f, 0.35f, 0.45f, 0.55f, 0.65f, 0.75f, 0.85f, 0.95f};
        }
        float fDoubleValue = (float) ((dN - dU0.doubleValue()) / (dP0.doubleValue() - dU0.doubleValue()));
        float fDoubleValue2 = (float) ((dP0.doubleValue() - dN) / (dP0.doubleValue() - dU0.doubleValue()));
        float f14 = c0Var.f145333n ? 0.85f : 0.8f;
        float f15 = f14 * fDoubleValue2;
        return new float[]{f15 * 0.1f, f15 * 0.3f, f15 * 0.5f, f15 * 0.7f, f15 * 0.9f, ((0.1f * fDoubleValue) + fDoubleValue2) * f14, ((0.3f * fDoubleValue) + fDoubleValue2) * f14, ((0.5f * fDoubleValue) + fDoubleValue2) * f14, ((0.7f * fDoubleValue) + fDoubleValue2) * f14, ((fDoubleValue * 0.9f) + fDoubleValue2) * f14};
    }

    @Override // qm.e, oz.c
    public final void l(LineChart lineChart) {
        LineChart lineChart2;
        super.l(lineChart);
        LineChart lineChart3 = this.f134442b;
        YAxis axisLeft = lineChart3 != null ? lineChart3.getAxisLeft() : null;
        this.f145351f = axisLeft;
        axisLeft.getClass();
        e(axisLeft, this.f134444d);
        this.f145357l = 42;
        mz.a aVar = new mz.a(this.f134442b, p());
        LineChart lineChart4 = this.f134442b;
        if (lineChart4 != null) {
            lineChart4.setRenderer(aVar);
        }
        if (this.f145333n && (lineChart2 = this.f134442b) != null) {
            lineChart2.setExtraTopOffset(50.0f);
        }
        s sVar = new s(this.f134441a);
        this.f145337r = sVar;
        LineChart lineChart5 = this.f134442b;
        if (lineChart5 != null) {
            lineChart5.setMarkerView(sVar);
        }
        if (this.f145350e != null) {
            u();
        }
    }

    @Override // qm.e
    public final void o() {
        r();
        this.f145356k.addView(new jm.b(this.f134441a));
    }

    @Override // qm.e
    public final void u() {
        zm.p pVar = this.f145350e;
        double dH4 = pVar.h4();
        this.f145357l = pVar.g1();
        Context context = this.f134441a;
        float fConvertPixelsToDp = Utils.convertPixelsToDp(context.getResources().getDimension(R.dimen.gcm3_chart_margin_right));
        LineChart lineChart = this.f134442b;
        boolean z14 = this.f145333n;
        if (z14) {
            if (lineChart != null) {
                a0 a0Var = new a0(lineChart, 0);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                s0.d.c(lineChart, a0Var);
                if (lineChart.isAttachedToWindow()) {
                    lineChart.requestApplyInsets();
                } else {
                    lineChart.addOnAttachStateChangeListener(new d0(lineChart, lineChart));
                }
            }
        } else if (lineChart != null) {
            lineChart.setExtraLeftOffset(fConvertPixelsToDp);
        }
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            lineChart2.setDrawGridBackground(false);
        }
        List<o20.a> list = this.f145334o;
        ArrayList arrayListA = ar.e.a(list);
        arrayListA.getClass();
        hz.h hVar = new hz.h(arrayListA, "ACTIVITY_TYPE_TAG");
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        hVar.setAxisDependency(axisDependency);
        hVar.setLineWidth(2.0f);
        hVar.setDrawValues(false);
        hVar.setDrawStepped(true);
        hVar.setDrawFilled(false);
        hVar.setDrawCircles(false);
        hVar.setHighlightLineWidth(2.0f);
        hVar.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        LineChart lineChart3 = this.f134442b;
        if (lineChart3 != null) {
            if (!lineChart3.isLaidOut() || lineChart3.isLayoutRequested()) {
                lineChart3.addOnLayoutChangeListener(new b0(hVar, lineChart3, this));
            } else {
                hVar.f86400b = new LinearGradient(0.0f, 0.0f, 0.0f, lineChart3.getViewPortHandler().getChartHeight(), this.f145336q, w(this), Shader.TileMode.CLAMP);
            }
        }
        ArrayList arrayList = new ArrayList();
        this.f145352g = arrayList;
        arrayList.add(hVar);
        double[] dArrN = n(hVar, dH4);
        YAxis yAxis = this.f145351f;
        yAxis.getClass();
        i(yAxis, dH4, true);
        v(dArrN);
        g();
        YAxis yAxis2 = this.f145351f;
        if (yAxis2 != null) {
            yAxis2.setValueFormatter(new q6.f(12));
        }
        y(j23.t.o(0, list.size()));
        LineChart lineChart4 = this.f134442b;
        XAxis xAxis = lineChart4 != null ? lineChart4.getXAxis() : null;
        xAxis.setValues(this.f145355j);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        XAxis xAxis2 = this.f134443c;
        if (xAxis2 != null) {
            xAxis2.setYOffset(20.0f);
        }
        LineChart lineChart5 = this.f134442b;
        if (lineChart5 != null) {
            lineChart5.setVisibleXRange(2.0f, list.size() - 1);
        }
        LineChart lineChart6 = this.f134442b;
        ViewPortHandler viewPortHandler = lineChart6 != null ? lineChart6.getViewPortHandler() : null;
        XAxis xAxis3 = this.f134443c;
        LineChart lineChart7 = this.f134442b;
        mz.f fVar = new mz.f(viewPortHandler, xAxis3, lineChart7 != null ? lineChart7.getTransformer(axisDependency) : null, 4, 0, false, this.f145335p.size() * 2, 0, 20, 20.0f);
        LineChart lineChart8 = this.f134442b;
        if (lineChart8 != null) {
            lineChart8.setXAxisRenderer(fVar);
        }
        LineData lineData = new LineData(this.f145355j, this.f145352g);
        this.f145354i = lineData;
        j(lineData);
        o();
        if (z14) {
            LineChart lineChart9 = this.f134442b;
            if (lineChart9 != null) {
                lineChart9.setTouchEnabled(true);
            }
            LineChart lineChart10 = this.f134442b;
            if (lineChart10 != null) {
                lineChart10.setOnLongClickListener(this.f145342y);
            }
            LineChart lineChart11 = this.f134442b;
            if (lineChart11 != null) {
                lineChart11.setHighlightPerDragEnabled(false);
            }
            LineChart lineChart12 = this.f134442b;
            if (lineChart12 != null) {
                lineChart12.setHighlightPerTapEnabled(false);
            }
            LineChart lineChart13 = this.f134442b;
            if (lineChart13 != null) {
                lineChart13.setOnChartGestureListener(this.f145340w);
            }
            LineChart lineChart14 = this.f134442b;
            if (lineChart14 != null) {
                lineChart14.setOnTouchListener(this.f145341x);
            }
            LineChart lineChart15 = this.f134442b;
            if (lineChart15 != null) {
                lineChart15.setDoubleTapToZoomEnabled(false);
            }
        }
    }

    public final void x() {
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            lineChart.setDragEnabled(true);
        }
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            lineChart2.setScaleEnabled(true);
        }
        LineChart lineChart3 = this.f134442b;
        if (lineChart3 != null) {
            lineChart3.setScaleYEnabled(false);
        }
        LineChart lineChart4 = this.f134442b;
        if (lineChart4 != null) {
            lineChart4.highlightValues(null);
        }
        LineChart lineChart5 = this.f134442b;
        if (lineChart5 != null) {
            lineChart5.setHighlightPerDragEnabled(false);
        }
    }

    public final void y(j23.l lVar) {
        this.f145355j = new ArrayList();
        int i14 = (lVar.f96797b - lVar.f96796a) / 2;
        int i15 = 10;
        if (i14 <= 10) {
            i15 = i14;
        } else if (11 <= i14 && i14 < 21) {
            i15 = i14 / 2;
        }
        if (i15 >= 1) {
            int i16 = (i14 * 2) / i15;
            List<o20.a> list = this.f145334o;
            int size = list.size();
            int i17 = 0;
            while (i17 < size) {
                this.f145355j.add((i17 == 0 || i17 == list.size() - 1 || (i17 + 1) % i16 != 0) ? "" : String.valueOf(MathKt.c((i17 + 1.0f) / 2.0f)));
                i17++;
            }
            XAxis xAxis = this.f134443c;
            if (xAxis != null) {
                xAxis.setValues(this.f145355j);
            }
        }
    }
}
