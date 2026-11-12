package zm;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzm/x;", "Lzm/q;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "chartData", "<init>", "(Landroidx/fragment/app/m;Lzm/p;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.m f205261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f205262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f205263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f205264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.l f205265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LineChart f205266f;

    static {
        new a(null);
    }

    public x(androidx.fragment.app.m mVar, p pVar) {
        mVar.getClass();
        pVar.getClass();
        this.f205261a = mVar;
        this.f205262b = pVar;
        this.f205263c = a7.b.getColor(mVar, R.color.gcm_chart_text_label);
        this.f205265e = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.f205264d = linearLayout;
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        androidx.fragment.app.m mVar = this.f205261a;
        View viewInflate = LayoutInflater.from(mVar).inflate(R.layout.gcm3_line_chart_view_v3, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.line_chart_chart_view);
        viewFindViewById.getClass();
        LineChart lineChart = (LineChart) viewFindViewById;
        int i14 = qm.t.f145451a;
        lineChart.setLayerType(1, null);
        lineChart.getDescription().setEnabled(false);
        lineChart.getF31342c().setEnabled(false);
        lineChart.setTouchEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setDrawGridBackground(false);
        lineChart.setNoDataText("");
        lineChart.setExtraBottomOffset(20.0f);
        lineChart.setExtraLeftOffset(Utils.convertPixelsToDp(lineChart.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_right)));
        boolean zY = this.f205265e.y();
        m3 m3Var = zY ? m3.METER : m3.YARD;
        p pVar = this.f205262b;
        ValueFormatter valueFormatterA = c22.v.a(pVar.getF113514x1(), m3Var);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setValueFormatter(valueFormatterA);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        int i15 = this.f205263c;
        xAxis.setTextColor(i15);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisLineColor(i15);
        xAxis.setTextSize(10.0f);
        xAxis.setLabelCount(6, true);
        YAxis axisRight = lineChart.getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setTextColor(i15);
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setLabelCount(6, true);
        LimitLine limitLine = new LimitLine((float) pVar.getF113499i1(), "");
        limitLine.setLineColor(a7.b.getColor(mVar, R.color.gcm_chart_avg_line));
        limitLine.setLineWidth(mVar.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2);
        axisLeft.addLimitLine(limitLine);
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis2 = lineChart.getXAxis();
        xAxis2.getClass();
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        Transformer transformer = lineChart.getTransformer(axisDependency);
        transformer.getClass();
        lineChart.setXAxisRenderer(new h00.j(viewPortHandler, xAxis2, transformer, pVar.getF113514x1(), zY, h00.g.MULTIPLE_OF_10));
        this.f205266f = lineChart;
        LineDataSet lineDataSet = new LineDataSet(ar.e.d(pVar.P(0)), "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setCircleRadius(0.0f);
        lineDataSet.setAxisDependency(axisDependency);
        if (ar.h.d(pVar)) {
            lineDataSet.setFillFormatter(new xw.b(this, 10));
        }
        lineDataSet.setMode(k.e(pVar) ? LineDataSet.Mode.STEPPED : LineDataSet.Mode.LINEAR);
        int[] iArrA = im.a.a(pVar.getB1());
        lineDataSet.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{a7.b.getColor(mVar, iArrA[0]), a7.b.getColor(mVar, iArrA[1])}));
        lineDataSet.setColor(a7.b.getColor(mVar, R.color.gcm3_transparent));
        lineDataSet.setDrawFilled(true);
        double yMin = lineDataSet.getYMin();
        double yMax = lineDataSet.getYMax();
        LineChart lineChart2 = this.f205266f;
        if (lineChart2 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        double[] dArrA = k.a(yMin, yMax, pVar, 4, lineChart2.getContext().getResources().getConfiguration().orientation == 2, false, 32);
        LineChart lineChart3 = this.f205266f;
        if (lineChart3 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        YAxis axisLeft2 = lineChart3.getAxisLeft();
        axisLeft2.getClass();
        k.h(mVar, axisLeft2, dArrA, pVar, null);
        LineChart lineChart4 = this.f205266f;
        if (lineChart4 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        k.f(lineChart4, pVar.getB1());
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineDataSet);
        LineChart lineChart5 = this.f205266f;
        if (lineChart5 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        ChartAnimator animator = lineChart5.getAnimator();
        animator.getClass();
        LineChart lineChart6 = this.f205266f;
        if (lineChart6 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        ViewPortHandler viewPortHandler2 = lineChart6.getViewPortHandler();
        viewPortHandler2.getClass();
        f00.e eVar = new f00.e(lineChart5, animator, viewPortHandler2, false, new y(), 8, null);
        LineChart lineChart7 = this.f205266f;
        if (lineChart7 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        lineChart7.setRenderer(eVar);
        LineChart lineChart8 = this.f205266f;
        if (lineChart8 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        lineChart8.setData(new LineData(arrayList));
        LineChart lineChart9 = this.f205266f;
        if (lineChart9 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        lineChart9.invalidate();
        TextView textViewA = qm.t.a(mVar, i15, i15, pVar.getF113500j1());
        LinearLayout linearLayout = this.f205264d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(0);
            linearLayout.addView(textViewA);
        }
        return viewInflate;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lzm/x$a;", "", "<init>", "()V", "", "Y_LABELS_FOUR", "I", "", "BOTTOM_OFFSET", "F", "LABEL_COUNT", "NO_CIRCLE_RADIUS", "DEFAULT_X_LABEL_COUNT", "X_AXIS_TEXT_SIZE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
