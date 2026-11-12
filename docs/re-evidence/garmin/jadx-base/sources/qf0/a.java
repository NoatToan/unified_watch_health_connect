package qf0;

import androidx.core.view.j;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import gf0.d;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.x;
import p13.y;
import v22.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqf0/a;", "", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "", "isPortraitMode", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Z)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineChart f144595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f144598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f144599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f144600f;

    /* JADX INFO: renamed from: qf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qf0/a$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2723a extends ValueFormatter {
        public C2723a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getAxisLabel(float f14, AxisBase axisBase) {
            return axisBase instanceof XAxis ? j.f((int) (f14 / a.this.f144599e), "s") : "";
        }
    }

    public a(LineChart lineChart, boolean z14) {
        lineChart.getClass();
        this.f144595a = lineChart;
        int color = a7.b.getColor(lineChart.getContext(), R.color.gcm_chart_grid);
        this.f144596b = color;
        this.f144597c = a7.b.getColor(lineChart.getContext(), R.color.red_1);
        int color2 = a7.b.getColor(lineChart.getContext(), R.color.gcm_text_secondary);
        this.f144598d = color2;
        this.f144599e = 128;
        this.f144600f = 384;
        lineChart.getDescription().setEnabled(false);
        lineChart.setDragEnabled(!z14);
        lineChart.setScaleEnabled(false);
        lineChart.setExtraBottomOffset(8.0f);
        lineChart.setPinchZoom(false);
        LineData lineData = new LineData();
        lineData.setValueTextColor(color2);
        lineChart.setData(lineData);
        lineChart.getF31342c().setEnabled(false);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        xAxis.setTextColor(color2);
        xAxis.setDrawGridLines(true);
        xAxis.setGridLineWidth(1.0f);
        xAxis.setGridColor(color);
        xAxis.setAvoidFirstLastClipping(false);
        xAxis.setTextSize(12.0f);
        xAxis.setEnabled(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setLabelCount(4);
        xAxis.setAxisLineColor(color);
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setGranularity(128);
        xAxis.setValueFormatter(new C2723a());
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        axisLeft.setTextColor(color2);
        axisLeft.setAxisMaximum(2.0f);
        axisLeft.setAxisMinimum(-1.0f);
        axisLeft.setDrawGridLines(true);
        axisLeft.setDrawLabels(false);
        axisLeft.setAxisLineColor(color);
        axisLeft.setAxisLineWidth(1.0f);
        axisLeft.setGridColor(color);
        axisLeft.setGridLineWidth(1.0f);
        YAxis axisRight = lineChart.getAxisRight();
        axisRight.getClass();
        axisRight.setEnabled(true);
        axisRight.setTextColor(color2);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        axisRight.setAxisLineColor(color);
        axisRight.setAxisLineWidth(1.0f);
        axisRight.setGridColor(color);
        axisRight.setGridLineWidth(1.0f);
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        lineChart.setXAxisRenderer(new b(lineChart, transformer));
        lineChart.setVisibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(d dVar) {
        List<Double> listB;
        LineData lineData;
        LineChart lineChart = this.f144595a;
        e.q(lineChart);
        if (dVar == null || (listB = dVar.b()) == null) {
            listB = j0.f134944a;
        }
        if (listB.isEmpty() || (lineData = (LineData) lineChart.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(y.r(listB, 10));
        int i14 = 0;
        for (Object obj : listB) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(new Entry(i14, (float) ((Number) obj).doubleValue(), (Object) 0));
            i14 = i15;
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "ECG");
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setColor(this.f144597c);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setHighLightColor(this.f144596b);
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setValueTextColor(this.f144598d);
        lineDataSet.setValueTextSize(9.0f);
        lineDataSet.setDrawValues(false);
        lineData.addDataSet(lineDataSet);
        lineData.notifyDataChanged();
        lineChart.notifyDataSetChanged();
        lineChart.setVisibleXRangeMaximum(this.f144600f);
    }

    public /* synthetic */ a(LineChart lineChart, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lineChart, (i14 & 2) != 0 ? true : z14);
    }
}
