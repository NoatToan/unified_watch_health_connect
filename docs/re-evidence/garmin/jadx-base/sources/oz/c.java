package oz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import mz.f;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Loz/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f134441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LineChart f134442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public XAxis f134443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f134444d;

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        this.f134441a = context;
        this.f134444d = a7.b.getColor(context, R.color.gcm_chart_text_label);
    }

    public void e(YAxis yAxis, int i14) {
        yAxis.getClass();
        yAxis.setLabelCount(6, false);
        yAxis.setStartAtZero(false);
        yAxis.setTextColor(i14);
        yAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        yAxis.setDrawGridLines(false);
        yAxis.setDrawAxisLine(false);
    }

    public int f() {
        return a7.b.getColor(this.f134441a, R.color.gcm_chart_avg_line);
    }

    public final void g() {
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            YAxis axisRight = lineChart != null ? lineChart.getAxisRight() : null;
            if (axisRight != null) {
                axisRight.setDrawAxisLine(false);
            }
            if (axisRight != null) {
                axisRight.setDrawGridLines(false);
            }
            if (axisRight != null) {
                axisRight.setDrawLabels(false);
            }
        }
    }

    public void h(YAxis yAxis, double d14) {
        yAxis.getClass();
        i(yAxis, d14, false);
    }

    public final void i(YAxis yAxis, double d14, boolean z14) {
        yAxis.getClass();
        LimitLine limitLine = new LimitLine((float) d14, "");
        limitLine.setLineColor(f());
        limitLine.setLineWidth(this.f134441a.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2);
        if (z14) {
            limitLine.enableDashedLine(20.0f, 20.0f, 0.0f);
        }
        yAxis.addLimitLine(limitLine);
    }

    public final void j(LineData lineData) {
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            lineChart.setData(lineData);
            LineChart lineChart2 = this.f134442b;
            if (lineChart2 != null) {
                lineChart2.invalidate();
            }
        }
    }

    public final void k(fz.c cVar, boolean z14) {
        cVar.getClass();
        if (this.f134442b != null) {
            LineChart lineChart = this.f134442b;
            ViewPortHandler viewPortHandler = lineChart != null ? lineChart.getViewPortHandler() : null;
            XAxis xAxis = this.f134443c;
            LineChart lineChart2 = this.f134442b;
            f fVar = new f(viewPortHandler, xAxis, lineChart2 != null ? lineChart2.getTransformer(YAxis.AxisDependency.LEFT) : null, 2, 0, 6);
            fVar.f121638m = cVar;
            fVar.f121639n = z14;
            LineChart lineChart3 = this.f134442b;
            if (lineChart3 != null) {
                lineChart3.setXAxisRenderer(fVar);
            }
        }
    }

    public void l(LineChart lineChart) {
        Legend legend;
        this.f134442b = lineChart;
        if (lineChart == null) {
            return;
        }
        if (lineChart != null) {
            lineChart.setTag(R.id.configurator_name, getClass().getName());
        }
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            lineChart2.setDescription("");
        }
        LineChart lineChart3 = this.f134442b;
        if (lineChart3 != null && (legend = lineChart3.getLegend()) != null) {
            legend.setEnabled(false);
        }
        LineChart lineChart4 = this.f134442b;
        if (lineChart4 != null) {
            lineChart4.setTouchEnabled(false);
        }
        LineChart lineChart5 = this.f134442b;
        if (lineChart5 != null) {
            lineChart5.setPinchZoom(false);
        }
        LineChart lineChart6 = this.f134442b;
        if (lineChart6 != null) {
            lineChart6.setDrawGridBackground(false);
        }
        LineChart lineChart7 = this.f134442b;
        XAxis xAxis = lineChart7 != null ? lineChart7.getXAxis() : null;
        this.f134443c = xAxis;
        int i14 = this.f134444d;
        if (xAxis != null) {
            xAxis.setTextColor(i14);
        }
        XAxis xAxis2 = this.f134443c;
        if (xAxis2 != null) {
            xAxis2.setPosition(XAxis.XAxisPosition.BOTTOM);
        }
        XAxis xAxis3 = this.f134443c;
        if (xAxis3 != null) {
            xAxis3.setDrawGridLines(false);
        }
        XAxis xAxis4 = this.f134443c;
        if (xAxis4 != null) {
            xAxis4.setDrawAxisLine(false);
        }
        XAxis xAxis5 = this.f134443c;
        if (xAxis5 != null) {
            xAxis5.setAxisLineColor(i14);
        }
        LineChart lineChart8 = this.f134442b;
        if (lineChart8 != null) {
            lineChart8.setExtraBottomOffset(20.0f);
        }
        LineChart lineChart9 = this.f134442b;
        if (lineChart9 != null) {
            lineChart9.setNoDataText("");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Loz/c$a;", "", "<init>", "()V", "", "DEFAULT_X_LABEL_COUNT", "I", "", "DEFAULT_LINE_WIDTH", "F", "NO_CIRCLE_RADIUS", "", "TAG", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
