package qm;

import android.content.Context;
import android.graphics.Paint;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqm/q0;", "Lqm/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lim/b0;", "splitsChartData", "", "fullscreen", "<init>", "(Landroid/content/Context;Lim/b0;Z)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends qm.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f145440l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final im.b0 f145441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f145442k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.r<Float, Float, Float, Float, Unit> {
        public b(Object obj) {
            super(4, obj, q0.class, "highlightRange", "highlightRange(FFFF)V", 0);
        }

        @Override // e23.r
        public final Unit invoke(Float f14, Float f15, Float f16, Float f17) {
            f14.floatValue();
            f15.floatValue();
            f16.floatValue();
            f17.floatValue();
            q0 q0Var = (q0) this.receiver;
            int i14 = q0.f145440l;
            q0Var.getClass();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.p<Float, Float, Unit> {
        public c(Object obj) {
            super(2, obj, q0.class, "highlightValue", "highlightValue(FF)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.p
        public final Unit invoke(Float f14, Float f15) {
            Highlight[] highlightArr;
            Collection<BarEntry> entriesForXValue;
            float fFloatValue = f14.floatValue();
            float fFloatValue2 = f15.floatValue();
            q0 q0Var = (q0) this.receiver;
            int i14 = q0.f145440l;
            Highlight highlightByTouchPoint = q0Var.f().getHighlightByTouchPoint(fFloatValue, fFloatValue2);
            if (highlightByTouchPoint != null) {
                float x14 = highlightByTouchPoint.getX();
                IBarDataSet iBarDataSet = (IBarDataSet) ((BarData) q0Var.f().getData()).getDataSetByIndex(0);
                ArrayList arrayList = null;
                if (iBarDataSet != null && (entriesForXValue = iBarDataSet.getEntriesForXValue(x14)) != null && !entriesForXValue.isEmpty()) {
                    arrayList = new ArrayList();
                    for (BarEntry barEntry : entriesForXValue) {
                        Highlight highlight = new Highlight(barEntry.getX(), barEntry.getY(), 0);
                        highlight.setDataIndex(highlight.getDataIndex());
                        arrayList.add(highlight);
                    }
                }
                BarChart barChartF = q0Var.f();
                if (arrayList == null || (highlightArr = (Highlight[]) arrayList.toArray(new Highlight[0])) == null) {
                    highlightArr = new Highlight[0];
                }
                barChartF.highlightValues(highlightArr);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/q0$d", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            return String.valueOf(MathKt.c(f14 * (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? 1.0f : 3.28084f)));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, im.b0 b0Var, boolean z14) {
        super(context, b0Var, z14);
        context.getClass();
        b0Var.getClass();
        this.f145441j = b0Var;
        Paint paint = new Paint();
        this.f145442k = paint;
        paint.setColor(context.getResources().getColor(R.color.gcm_chart_highlight_line, null));
        paint.setStrokeWidth(4.0f);
    }

    @Override // qm.a
    public final void e(BarChart barChart) {
        this.f145251e = new um.a(this.f145247a, R.layout.horizontal_hover_marker_layout, false, 4, null);
        this.f145253g = new BarHighlighter(barChart);
        barChart.setOnChartGestureListener(this.f145252f);
        h().a(true, this.f145254h);
        barChart.setTouchEnabled(true);
        barChart.setMarker(h());
        barChart.setHighlighter(this.f145253g);
        barChart.setHighlightPerDragEnabled(true);
        barChart.setHighlightPerTapEnabled(false);
        barChart.setDoubleTapToZoomEnabled(false);
        barChart.setDoubleTapToZoomEnabled(true);
        barChart.setOnChartGestureListener(new zm.s(barChart));
        zm.t.b(barChart, new b(this), new c(this), true, h());
    }

    @Override // qm.a
    public final r0 g(BarChart barChart) {
        return new r0(barChart, barChart.getAnimator(), barChart.getViewPortHandler(), this.f145442k);
    }

    @Override // qm.a
    public final void i() {
        BarChart barChartF = f();
        barChartF.setDrawMarkers(false);
        barChartF.setScaleYEnabled(false);
        barChartF.highlightValues(null);
        barChartF.setHighlightPerDragEnabled(false);
    }

    @Override // qm.a
    public final void j(float f14) {
        String strO;
        String string;
        int i14 = (int) (f14 - 1);
        if (i14 >= 0) {
            im.b0 b0Var = this.f145441j;
            ArrayList arrayList = b0Var.Y0;
            ArrayList arrayList2 = b0Var.Z0;
            if (i14 >= arrayList.size() || i14 < 0 || i14 >= arrayList2.size()) {
                return;
            }
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            m3 m3Var = lVar.y() ? m3.METER : m3.FOOT;
            o20.a aVar = this.f145248b.f94122l.get(i14);
            double D = aVar != null ? aVar.D() : 0.0d;
            if (D > 0.0d) {
                l3.f23124b.getClass();
                strO = l3.a.O(this.f145247a, D, m3Var, l3.f23131i, true);
            } else {
                strO = "";
            }
            q3 q3Var = lVar.y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            double dDoubleValue = ((Number) b0Var.Y0.get(i14)).doubleValue();
            if (dDoubleValue > 0.0d) {
                l3.a aVar2 = l3.f23124b;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar2.getClass();
                string = l3.a.M0(this.f145247a, dDoubleValue, q3Var, decimalFormat, true);
            } else {
                string = this.f145247a.getString(R.string.allday_stress_unmeasurable);
                string.getClass();
            }
            l3.a aVar3 = l3.f23124b;
            long jDoubleValue = ((long) ((Number) arrayList2.get(i14)).doubleValue()) * 1000;
            aVar3.getClass();
            String strB1 = l3.a.b1(jDoubleValue);
            int i15 = strO.equals("") ? 8 : 0;
            h().findViewById(R.id.second_value_label).setVisibility(i15);
            h().findViewById(R.id.separator2).setVisibility(i15);
            h().f171981l.a(strO, string, strB1);
        }
    }

    @Override // qm.a
    public final void k(BarChart barChart) {
        im.b bVar = this.f145248b;
        List<o20.a> list = bVar.f94122l;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (o20.a aVar : list) {
            int iIndexOf = bVar.f94122l.indexOf(aVar);
            float fC = ((float) aVar.C()) + 1;
            float fD = (float) aVar.D();
            int i14 = iIndexOf * 2;
            int iIntValue = bVar.n1().get(i14).intValue();
            Context context = this.f145247a;
            arrayListL.add(new xz.e(fC, fD, (Object) null, new int[]{a7.b.getColor(context, iIntValue), a7.b.getColor(context, bVar.n1().get(i14 + 1).intValue())}, (float) bVar.getF113504n1(), false, false, 100, (p005kotlin.jvm.internal.j) null));
        }
        BarDataSet barDataSet = new BarDataSet(arrayListL, "");
        barDataSet.setDrawValues(false);
        barDataSet.setDrawIcons(false);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.65f);
        barData.setHighlightEnabled(true);
        barChart.setData(barData);
    }

    @Override // qm.a
    public final void l(BarChart barChart) {
    }

    @Override // qm.a
    public final void m(XAxis xAxis) {
        xAxis.setEnabled(true);
        xAxis.setGranularity(1.0f);
        xAxis.setLabelCount(this.f145441j.f94122l.size());
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setTextColor(a7.b.getColor(this.f145247a, R.color.gcm_text_secondary));
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(true);
    }

    @Override // qm.a
    public final void n(YAxis yAxis) {
        List<o20.a> list = this.f145441j.f94122l;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayListL.add(Double.valueOf(((o20.a) it.next()).D()));
        }
        Double dP0 = p13.h0.p0(arrayListL);
        double[] dArrA = zm.k.a(0.0d, dP0 != null ? dP0.doubleValue() : 1.0d, this.f145441j, 0, f().getContext().getResources().getConfiguration().orientation == 2, false, 40);
        Context context = this.f145247a;
        yAxis.setAxisLineColor(a7.b.getColor(context, R.color.transparent));
        zm.k.h(context, yAxis, dArrA, this.f145248b, null);
        yAxis.setLabelCount(5, true);
        yAxis.setDrawGridLines(true);
        yAxis.setDrawLabels(true);
        yAxis.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        yAxis.setValueFormatter(new d());
    }

    @Override // qm.a
    public final void o(YAxis yAxis) {
        YAxis axisRight = f().getAxisRight();
        if (axisRight != null) {
            axisRight.setEnabled(false);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqm/q0$a;", "", "<init>", "()V", "", "BAR_WIDTH_PERCENTAGE", "F", "", "Y_AXIS_LEFT_LABEL_COUNT", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ q0(Context context, im.b0 b0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, b0Var, (i14 & 4) != 0 ? false : z14);
    }
}
