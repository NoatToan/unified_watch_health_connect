package qm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.BarLineChartBase;
import com.github.mikephil.chartingv2.charts.Chart;
import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.ScatterDataSet;
import com.github.mikephil.chartingv2.formatter.DefaultYAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f145261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f145262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f145263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f145264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f145265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f145266f;

    @SuppressLint({"SwitchIntDef"})
    public static void f(androidx.fragment.app.m mVar, BarLineChartBase barLineChartBase, YAxis yAxis, int i14, float f14, float f15) {
        yAxis.setLabelCount(6, true);
        i(mVar, barLineChartBase, R.dimen.gcm3_chart_margin_right, 0);
        yAxis.setAxisMaxValue(f15);
        yAxis.setAxisMinValue(f14);
        if (i14 != 14) {
            if (i14 != 15) {
                if (i14 != 19) {
                    if (i14 != 86) {
                        switch (i14) {
                            case 21:
                                break;
                            case 22:
                                yAxis.setInverted(true);
                                break;
                            case 23:
                                yAxis.setGranularity(45.0f);
                                yAxis.setGranularityEnabled(true);
                                yAxis.setLabelCount(5, true);
                                yAxis.setInverted(true);
                                yAxis.setValueFormatter(new mm.d(i14));
                                j(barLineChartBase, -2.0f, 0);
                                return;
                            case 24:
                                yAxis.setGranularityEnabled(true);
                                yAxis.setLabelCount(5, true);
                                yAxis.removeAllLimitLines();
                                i(mVar, barLineChartBase, R.dimen.gcm3_chart_x_labels_padding, 0);
                                barLineChartBase.setRendererLeftYAxis(new om.c(barLineChartBase, YAxis.AxisDependency.LEFT, i14));
                                return;
                            case 25:
                            case 26:
                                yAxis.setGranularity(45.0f);
                                yAxis.setGranularityEnabled(true);
                                yAxis.setLabelCount(4, true);
                                yAxis.removeAllLimitLines();
                                yAxis.setInverted(true);
                                yAxis.setValueFormatter(new mm.d(i14));
                                j(barLineChartBase, -2.0f, 0);
                                return;
                            default:
                                return;
                        }
                        yAxis.removeAllLimitLines();
                        yAxis.setGranularity(5.0f);
                        yAxis.setGranularityEnabled(true);
                        yAxis.setLabelCount(5, true);
                        return;
                    }
                }
            }
            yAxis.setValueFormatter(new DefaultYAxisValueFormatter(1));
            return;
        }
        yAxis.setLabelCount(3, true);
        yAxis.removeAllLimitLines();
        i(mVar, barLineChartBase, R.dimen.gcm3_chart_x_labels_padding, 0);
        barLineChartBase.setRendererLeftYAxis(new om.c(barLineChartBase, YAxis.AxisDependency.LEFT, i14));
    }

    public static ScatterDataSet g(androidx.fragment.app.m mVar, ArrayList arrayList, int i14, int i15) {
        ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList, null);
        if (mVar != null) {
            scatterDataSet.setColor(a7.b.getColor(mVar, i14), i15);
        }
        scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        scatterDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        scatterDataSet.setScatterShapeSize(5.0f);
        scatterDataSet.setDrawValues(false);
        return scatterDataSet;
    }

    public static void i(Context context, Chart chart, int i14, int i15) {
        if (context != null) {
            j(chart, Utils.convertPixelsToDp(context.getResources().getDimension(i14)), i15);
        }
    }

    public static void j(Chart chart, float f14, int i14) {
        if (chart != null) {
            if (i14 == 0) {
                chart.setExtraLeftOffset(f14);
                return;
            }
            if (i14 == 1) {
                chart.setExtraRightOffset(f14);
            } else if (i14 == 2) {
                chart.setExtraTopOffset(f14);
            } else {
                if (i14 != 3) {
                    return;
                }
                chart.setExtraBottomOffset(f14);
            }
        }
    }

    public final void a(LinearLayout linearLayout) {
        this.f145261a = linearLayout;
    }

    public final void c(LinearLayout linearLayout) {
        this.f145262b = linearLayout;
    }

    public final void e(List<o20.a> list) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            o20.a aVar = list.get(i14);
            if (aVar.D() > this.f145264d) {
                this.f145264d = (float) aVar.D();
            }
            if (aVar.D() < this.f145263c) {
                this.f145263c = (float) aVar.D();
            }
        }
    }

    public void h(androidx.fragment.app.m mVar, YAxis yAxis, double d14, boolean z14) {
        LimitLine limitLine = new LimitLine((float) d14, "");
        limitLine.setLineColor(a7.b.getColor(mVar, R.color.gcm_chart_avg_line));
        limitLine.setLineWidth(mVar.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2.0f);
        if (z14) {
            limitLine.enableDashedLine(20.0f, 10.0f, 0.0f);
        }
        yAxis.addLimitLine(limitLine);
    }
}
