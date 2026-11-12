package qm;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class p implements zm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LineChart f145424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f145425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f145426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f145427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f145428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f145429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f145430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f145431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zm.p f145432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zm.p f145433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap f145434k;

    public p(Context context, zm.p pVar, zm.p pVar2) {
        this.f145425b = context;
        this.f145432i = pVar;
        this.f145433j = pVar2;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.removeAllViews();
            String strO2 = this.f145432i.o2();
            Context context = this.f145425b;
            int color = a7.b.getColor(context, R.color.gcm_text_secondary);
            linearLayout.addView(t.a(context, color, color, strO2));
        }
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public View d(ViewGroup viewGroup) {
        Context context = this.f145425b;
        LineChart lineChart = new LineChart(context);
        this.f145424a = lineChart;
        lineChart.setBackgroundColor(a7.b.getColor(context, R.color.gcm3_transparent));
        lineChart.getPaint(7).setColor(a7.b.getColor(context, R.color.gcm3_text_orange));
        int i14 = t.f145451a;
        lineChart.setLayerType(1, null);
        lineChart.getLegend().setEnabled(false);
        lineChart.setTouchEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setHighlightPerDragEnabled(false);
        lineChart.setHighlightPerTapEnabled(false);
        lineChart.setDoubleTapToZoomEnabled(false);
        lineChart.setScaleYEnabled(false);
        lineChart.setScaleXEnabled(false);
        lineChart.setDescription(null);
        lineChart.setDrawGridBackground(false);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawGridLines(false);
        lineChart.setExtraBottomOffset(20.0f);
        e(lineChart);
        return lineChart;
    }

    public final void e(LineChart lineChart) {
        hz.h hVar;
        hz.h hVar2;
        hz.h hVar3;
        hz.h hVar4;
        zm.p pVar = this.f145432i;
        rm.a aVarU3 = pVar.U3();
        Float f14 = aVarU3.f153493g;
        this.f145426c = f14 != null ? f14.floatValue() : 0.0f;
        Float f15 = aVarU3.f153495i;
        this.f145427d = f15 != null ? f15.floatValue() : 0.0f;
        Float f16 = aVarU3.f153496j;
        int i14 = 0;
        this.f145428e = f16 != null ? f16.intValue() : 0;
        Float f17 = aVarU3.f153497k;
        float fIntValue = f17 != null ? f17.intValue() : 0;
        this.f145429f = fIntValue;
        float f18 = this.f145428e;
        if (f18 == fIntValue) {
            this.f145428e = (float) (((double) f18) + 0.5d);
            this.f145429f = (float) (((double) fIntValue) - 0.5d);
        }
        Float f19 = aVarU3.f153498l;
        this.f145430g = f19 != null ? f19.intValue() : 0;
        Float f22 = aVarU3.f153499m;
        float fIntValue2 = f22 != null ? f22.intValue() : 0;
        this.f145431h = fIntValue2;
        float f24 = this.f145430g;
        if (fIntValue2 == f24) {
            this.f145430g = (float) (((double) f24) + 0.5d);
            this.f145431h = (float) (((double) fIntValue2) - 0.5d);
        }
        lineChart.getXAxis().setValues(aVarU3.f153491e);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setDrawLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10.0f);
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        lineChart.setXAxisRenderer(new mz.f(viewPortHandler, xAxis, lineChart.getTransformer(axisDependency), 2, 0, true));
        Context context = this.f145425b;
        xAxis.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        xAxis.setValueFormatter(new o(this));
        xAxis.setDrawGridLines(false);
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        axisLeft.setAxisMinValue(0.0f);
        axisLeft.setAxisMaxValue(this.f145426c + (this.f145427d > 0.0f ? 0 : 1));
        axisLeft.setValueFormatter(new n(this));
        if (!Double.isNaN(pVar.V()) && !Double.isNaN(pVar.h4())) {
            float fV = (float) (pVar.V() - pVar.h4());
            if (!am.j.z(f12.l.f68084a)) {
                l3.f23124b.getClass();
                fV = (float) (((double) fV) / 3.2808399d);
            }
            LimitLine limitLine = new LimitLine(fV, "");
            limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_avg_line));
            limitLine.setLineWidth(context.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2.0f);
            axisLeft.addLimitLine(limitLine);
        }
        zm.p pVar2 = this.f145433j;
        int iG1 = pVar2 != null ? pVar2.g1() : -1;
        om.b bVar = new om.b(lineChart);
        this.f145434k = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = aVarU3.f153487a;
        if (arrayList2 != null) {
            hVar = new hz.h(arrayList2, "");
            hVar.setAxisDependency(axisDependency);
            hVar.setDrawFilled(true);
            hVar.setDrawValues(false);
            hVar.setDrawCircles(false);
            hVar.setDrawValues(false);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a7.b.getColor(context, R.color.gds_data_viz_teal_secondary), a7.b.getColor(context, R.color.gds_data_viz_teal_primary)});
            gradientDrawable.setAlpha(200);
            hVar.setFillDrawable(gradientDrawable);
            hVar.setDrawStepped(false);
            hVar.setHighlightEnabled(true);
            hVar.setHighlightLineWidth(0.0f);
            hVar.setLineWidth(0.0f);
        } else {
            hVar = null;
        }
        ArrayList<Entry> arrayList3 = aVarU3.f153487a;
        HashMap map = aVarU3.f153492f;
        ArrayList arrayList4 = new ArrayList();
        for (Entry entry : arrayList3) {
            q6.f.t(context, R.color.transparent, arrayList4);
        }
        for (Long l14 : map.keySet()) {
            long jLongValue = l14.longValue();
            if (!arrayList3.isEmpty()) {
                Entry entry2 = (Entry) arrayList3.get(i14);
                ArrayList arrayList5 = arrayList3;
                long jAbs = Math.abs(((long) entry2.getXIndex()) - jLongValue);
                Iterator it = arrayList5.iterator();
                long j8 = jAbs;
                Entry entry3 = entry2;
                while (it.hasNext()) {
                    Entry entry4 = (Entry) it.next();
                    Iterator it3 = it;
                    long jAbs2 = Math.abs(((long) entry4.getXIndex()) - jLongValue);
                    if (jAbs2 < j8) {
                        j8 = jAbs2;
                        entry3 = entry4;
                    }
                    it = it3;
                }
                arrayList3 = arrayList5;
                int iIndexOf = arrayList3.indexOf(entry3);
                arrayList4.set(iIndexOf, Integer.valueOf(a7.b.getColor(context, R.color.palette_swagger_1)));
                this.f145434k.put(Integer.valueOf(iIndexOf), (String) map.get(l14));
            }
            i14 = 0;
        }
        hVar.setCircleColors(arrayList4);
        hVar.setDrawCircles(true);
        hVar.setCircleRadius(3.0f);
        hVar.setDrawCircleHole(false);
        ArrayList arrayList6 = aVarU3.f153488b;
        if (arrayList6 != null) {
            hVar2 = new hz.h(arrayList6, "");
            hVar2.setDrawCircles(false);
            hVar2.setDrawFilled(true);
            hVar2.setAxisDependency(YAxis.AxisDependency.LEFT);
            hVar2.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a7.b.getColor(context, R.color.gds_data_viz_red_secondary), a7.b.getColor(context, R.color.gds_data_viz_red_primary)}));
            hVar2.setDrawStepped(true);
            hVar2.setHighlightEnabled(true);
            hVar2.setDrawValues(false);
            hVar2.setColor(a7.b.getColor(context, R.color.gds_data_viz_neutral_primary));
        } else {
            hVar2 = null;
        }
        arrayList.add(hVar);
        if (hVar2 != null) {
            arrayList.add(hVar2);
        }
        if (iG1 == 3) {
            ArrayList arrayList7 = aVarU3.f153489c;
            if (arrayList7 != null) {
                hVar4 = new hz.h(arrayList7, "");
                hVar4.setDrawValues(false);
                hVar4.setDrawCircleHole(false);
                hVar4.setDrawCircles(false);
                hVar4.setDrawFilled(false);
                hVar4.setLineWidth(2.0f);
                hVar4.setHighlightEnabled(true);
                hVar4.setHighlightLineWidth(1.0f);
                hVar4.setColor(a7.b.getColor(context, R.color.gds_data_viz_red_primary));
                hVar4.setDrawStepped(false);
            } else {
                hVar4 = null;
            }
            if (hVar4 != null && !aVarU3.f153489c.isEmpty()) {
                arrayList.add(hVar4);
            }
        } else if (iG1 == 6) {
            ArrayList arrayList8 = aVarU3.f153490d;
            if (arrayList8 != null) {
                hVar3 = new hz.h(arrayList8, "");
                hVar3.setDrawValues(false);
                hVar3.setDrawCircleHole(false);
                hVar3.setDrawCircles(false);
                hVar3.setDrawFilled(false);
                hVar3.setLineWidth(2.0f);
                hVar3.setHighlightEnabled(true);
                hVar3.setHighlightLineWidth(1.0f);
                hVar3.setColor(a7.b.getColor(context, R.color.gcm3_chart_gradient_gray_end));
                hVar3.setDrawStepped(false);
            } else {
                hVar3 = null;
            }
            if (hVar3 != null && !aVarU3.f153490d.isEmpty()) {
                arrayList.add(hVar3);
            }
        } else {
            LineChart lineChart2 = this.f145424a;
            if (lineChart2 != null) {
                lineChart2.getAxisRight().setEnabled(false);
            }
        }
        lineChart.setData(new LineData(lineChart.getXAxis().getValues(), arrayList));
        lineChart.setRenderer(bVar);
        lineChart.invalidate();
    }
}
