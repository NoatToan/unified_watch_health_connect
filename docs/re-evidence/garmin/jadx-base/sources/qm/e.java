package qm;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class e extends oz.c implements zm.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zm.p f145350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public YAxis f145351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f145352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LineChart f145353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LineData f145354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f145355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f145356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f145357l;

    public e(Context context, zm.p pVar) {
        super(context);
        j.f145390d.getClass();
        new j(false, false, false);
        this.f145350e = pVar;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        this.f145356k = linearLayout;
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f134441a).inflate(R.layout.gcm3_line_chart_view, viewGroup, false);
        LineChart lineChart = (LineChart) viewInflate.findViewById(R.id.line_chart_chart_view);
        this.f145353h = lineChart;
        t.c(lineChart);
        l(this.f145353h);
        return viewInflate;
    }

    @Override // oz.c
    public void l(LineChart lineChart) {
        super.l(lineChart);
        LineChart lineChart2 = this.f134442b;
        zm.p pVar = this.f145350e;
        if (lineChart2 != null) {
            YAxis axisLeft = lineChart2.getAxisLeft();
            this.f145351f = axisLeft;
            e(axisLeft, this.f134444d);
            if (pVar != null) {
                this.f145357l = pVar.getB1();
            }
            if (this.f145357l == 38) {
                this.f134442b.setExtraBottomOffset(40.0f);
            }
            this.f134442b.setRenderer(t());
        }
        if (pVar != null) {
            u();
        }
    }

    public final double[] m(double d14, double d15, double d16) {
        double d17;
        double d18;
        int i14;
        if (!Double.isNaN(d16) && d14 == d16 && d15 == d16) {
            d18 = 2.0d * d16;
            d17 = 0.0d;
        } else {
            d17 = d14;
            d18 = d15;
        }
        zm.p pVar = this.f145350e;
        return (pVar != null && pVar.getF113509s1() == 0.0d && pVar.getF113510t1() == 0.0d && ((i14 = this.f145357l) == 0 || i14 == 10 || i14 == 51 || i14 == 65 || i14 == 87 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 6 || i14 == 7 || i14 == 8 || i14 == 62 || i14 == 63)) ? new double[]{-10.0d, 0.0d, 10.0d} : this.f145350e.f1(4, d17, d18, 0.05d);
    }

    public double[] n(LineDataSet lineDataSet, double d14) {
        return m(lineDataSet.getYMin(), lineDataSet.getYMax(), d14);
    }

    public void o() {
        zm.p pVar;
        r();
        if (this.f145356k == null || (pVar = this.f145350e) == null) {
            return;
        }
        String strO2 = pVar.getF113500j1();
        int i14 = this.f134444d;
        this.f145356k.addView(t.a(this.f134441a, i14, i14, strO2));
    }

    public final mz.d p() {
        Resources resources = this.f134441a.getResources();
        mz.d dVar = new mz.d();
        dVar.f121619a = resources.getDimension(R.dimen.chart_hover_marker_view_height);
        dVar.f121620b = resources.getDimension(R.dimen.spacing_micro);
        return dVar;
    }

    public final boolean q() {
        String strU = this.f145350e.getF113501k1();
        int i14 = this.f145357l;
        if ((i14 != 1 && i14 != 68) || strU == null) {
            return i14 == 7 || i14 == 9 || i14 == 10 || i14 == 65;
        }
        z0 z0Var = z0.f4390a;
        return z0.b(x0.f4313o1, strU);
    }

    public final void r() {
        LinearLayout linearLayout = this.f145356k;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f145356k.setVisibility(0);
        }
    }

    public final void s(LineDataSet lineDataSet) {
        int[] iArrA = im.a.a(this.f145357l);
        Context context = this.f134441a;
        lineDataSet.setColor(a7.b.getColor(context, R.color.gcm3_transparent));
        lineDataSet.setDrawFilled(true);
        if (this.f145357l != 20) {
            lineDataSet.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{a7.b.getColor(context, iArrA[0]), a7.b.getColor(context, iArrA[1])}));
        } else {
            zm.p pVar = this.f145350e;
            ColorDrawable colorDrawable = new ColorDrawable(pVar.Y3());
            colorDrawable.setAlpha(pVar.O1());
            lineDataSet.setFillDrawable(colorDrawable);
        }
    }

    public DataRenderer t() {
        mz.a aVar = new mz.a(this.f134442b, p());
        aVar.f121604a = gl1.y.B(this.f145357l);
        return aVar;
    }

    public void u() {
        zm.p pVar = this.f145350e;
        if (pVar == null) {
            r();
            return;
        }
        o();
        double dH4 = pVar.getF113499i1();
        this.f145357l = pVar.getB1();
        List<o20.a> listP = pVar.P(0);
        LineDataSet eVar = ar.h.d(pVar) ? new lm.e(ar.e.a(listP), "ACTIVITY_TYPE_TAG") : new LineDataSet(ar.e.a(listP), "ACTIVITY_TYPE_TAG");
        if (this.f134442b != null) {
            this.f134442b.setExtraLeftOffset(Utils.convertPixelsToDp(this.f134441a.getResources().getDimension(R.dimen.gcm3_chart_margin_right)));
            this.f134442b.setDrawGridBackground(false);
        }
        eVar.setCircleRadius(0.0f);
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        eVar.setAxisDependency(axisDependency);
        eVar.setDrawValues(false);
        eVar.setDrawStepped(q());
        s(eVar);
        ArrayList arrayList = new ArrayList();
        this.f145352g = arrayList;
        arrayList.add(eVar);
        this.f145355j = ar.e.e(listP, this.f145357l, pVar.getF113514x1());
        XAxis xAxis = this.f134442b.getXAxis();
        xAxis.setValues(this.f145355j);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        double[] dArrN = n(eVar, dH4);
        if (im.a.e(this.f145357l)) {
            h(this.f145351f, dH4);
        }
        v(dArrN);
        g();
        if (pVar.getB1() == 38) {
            HashMap<Double, Double> mapM2 = pVar.m2();
            if (this.f134442b != null) {
                om.e eVar2 = new om.e(this.f134442b.getViewPortHandler(), this.f134443c, this.f134442b.getTransformer(axisDependency), 2, 0, true, mapM2);
                fz.c cVarP1 = pVar.getF113514x1();
                f12.l.f68084a.getClass();
                boolean zY = f12.l.a.a().y();
                cVarP1.getClass();
                eVar2.f121638m = cVarP1;
                eVar2.f121639n = zY;
                this.f134442b.setXAxisRenderer(eVar2);
            }
        } else {
            fz.c cVarP2 = pVar.getF113514x1();
            f12.l.f68084a.getClass();
            k(cVarP2, f12.l.a.a().y());
        }
        LineData lineData = new LineData(this.f145355j, this.f145352g);
        this.f145354i = lineData;
        j(lineData);
    }

    public final void v(double[] dArr) {
        int i14;
        boolean zB = gl1.y.B(this.f145357l);
        this.f145351f.setLabelCount(6, true);
        zm.p pVar = this.f145350e;
        if (zB) {
            this.f145351f.setAxisMaxValue((float) dArr[0]);
            this.f145351f.setAxisMinValue((float) dArr[dArr.length - 1]);
            this.f145351f.setValueFormatter(new mm.e());
            this.f145351f.setInverted(true);
        } else {
            float f14 = (float) dArr[dArr.length - 1];
            float f15 = (float) dArr[0];
            boolean z14 = ((double) f15) < 0.0d;
            this.f145351f.setAxisMaxValue(f14);
            this.f145351f.setAxisMinValue(f15);
            if ((this.f145357l == 20 && pVar.t2() == 0) || (i14 = this.f145357l) == 41) {
                float f16 = (f14 - f15) + 1.0f;
                if (f16 < 6) {
                    this.f145351f.setLabelCount((int) f16, true);
                }
            } else if (i14 == 33) {
                this.f145351f.setValueFormatter(new mm.c(0, z14));
            } else if (i14 == 36) {
                this.f145351f.setValueFormatter(new mm.c(3, z14));
            } else if (i14 == 38) {
                this.f145351f.setValueFormatter(new mm.c(2, z14));
            }
        }
        int i15 = this.f145357l;
        if (i15 == 33 || i15 == 36 || i15 == 38) {
            this.f145351f.setLabelCount(dArr.length, true);
        }
        if ((z0.o(pVar.getF113501k1()) || z0.x(pVar.getF113501k1())) && this.f145357l == 2) {
            this.f145351f.setLabelCount(4, true);
        }
    }

    public e(Context context, zm.p pVar, j jVar) {
        super(context);
        this.f145350e = pVar;
    }
}
