package za1;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.List;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p13.x;
import yc.l2;
import za.j;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lza1/b;", "", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f203281e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f203282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f203283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f203284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f203285d;

    /* JADX INFO: renamed from: za1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ViewOnAttachStateChangeListenerC3794b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f203286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f203287b;

        public ViewOnAttachStateChangeListenerC3794b(View view2, b bVar) {
            this.f203286a = view2;
            this.f203287b = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            this.f203286a.removeOnAttachStateChangeListener(this);
            CustomLineChart customLineChart = this.f203287b.f203282a;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            customLineChart.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    static {
        new a(null);
    }

    public b(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f203282a = customLineChart;
        Context context = customLineChart.getContext();
        context.getClass();
        this.f203283b = context;
        boolean z14 = context.getResources().getConfiguration().orientation == 2;
        this.f203285d = z14;
        i iVar = new i(customLineChart);
        f fVar = new f(customLineChart);
        fz.a aVar = fz.a.f73959a;
        customLineChart.setLayerType(1, null);
        customLineChart.getDescription().setEnabled(false);
        customLineChart.setExtraBottomOffset(20.0f);
        customLineChart.setExtraTopOffset(25.0f);
        customLineChart.setDoubleTapToZoomEnabled(false);
        customLineChart.setScaleYEnabled(false);
        customLineChart.setScaleXEnabled(z14);
        customLineChart.getViewPortHandler().setMaximumScaleX(3.0f);
        customLineChart.setPinchZoom(false);
        customLineChart.setHighlightPerDragEnabled(false);
        customLineChart.setHighlightPerTapEnabled(false);
        customLineChart.setMarker(fVar.f203309d);
        v vVar = fVar.f203308c;
        f00.c cVar = iVar.f203326d;
        cVar.f67650a = vVar;
        cVar.f67651b = null;
        customLineChart.setRenderer(cVar);
        b00.b bVar = fVar.f203307b;
        customLineChart.setOnChartGestureListener(bVar.a());
        customLineChart.setGetHighlightEntry(new yw2.h(fVar, 8));
        customLineChart.setOnLongClickListener(bVar.b());
        customLineChart.setOnTouchListener(bVar.c());
        zz.d dVar = new zz.d(customLineChart);
        dVar.f207539a = new zz.b();
        customLineChart.setHighlighter(dVar);
        customLineChart.setDrawGridBackground(false);
        customLineChart.setNoDataText(customLineChart.getContext().getString(R.string.txt_empty_page_no_data));
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        xAxis.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        xAxis.setTextSize(11.0f);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        h00.i iVar2 = iVar.f203324b;
        xAxis.setValueFormatter(iVar2.f80601e);
        Paint paintAxisLabels = iVar2.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        iVar2.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = iVar2.getPaintAxisLabels();
        paintAxisLabels2.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        iVar2.f80599c = paintAxisLabels2;
        customLineChart.setXAxisRenderer(iVar2);
        xAxis.setYOffset(iVar2.f80605i);
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        axisLeft.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        axisLeft.setTextSize(11.0f);
        axisLeft.setAxisLineColor(a7.b.getColor(customLineChart.getContext(), R.color.transparent));
        axisLeft.setLabelCount(5, true);
        axisLeft.setDrawLabels(true);
        axisLeft.setDrawGridLines(false);
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        axisRight.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gray_40_static));
        axisRight.setTextSize(11.0f);
        axisRight.setAxisLineColor(a7.b.getColor(customLineChart.getContext(), R.color.transparent));
        axisRight.setLabelCount(5, true);
        axisRight.setDrawLabels(true);
        axisRight.setDrawGridLines(false);
        axisRight.setValueFormatter(iVar.f203325c);
        customLineChart.getF31342c().setEnabled(false);
    }

    public final void a(c cVar) {
        e eVar = new e(this.f203283b, cVar);
        CustomLineChart customLineChart = this.f203282a;
        customLineChart.clear();
        if (this.f203285d) {
            xw.b bVar = new xw.b(this, 4);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(customLineChart, bVar);
            if (customLineChart.isAttachedToWindow()) {
                customLineChart.requestApplyInsets();
            } else {
                customLineChart.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3794b(customLineChart, this));
            }
        }
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(eVar.f203301c);
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(eVar.f203302d);
        axisLeft.addLimitLine(eVar.f203303e);
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.setAxisMinimum(eVar.f203304f);
        axisRight.setAxisMaximum(eVar.f203305g);
        j jVar = this.f203284c;
        if (jVar != null) {
            customLineChart.removeViewportJob(jVar);
        }
        j jVar2 = new j(1, customLineChart, eVar);
        this.f203284c = jVar2;
        customLineChart.addViewportJob(jVar2);
        c cVar2 = eVar.f203300b;
        LineDataSet lineDataSet = new LineDataSet(cVar2.f203296i, "");
        Context context = eVar.f203299a;
        lineDataSet.setColor(a7.b.getColor(context, R.color.transparent));
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setFillColor(a7.b.getColor(context, R.color.gray_45_static));
        lineDataSet.setFillFormatter(new l2(19));
        LineDataSet lineDataSet2 = new LineDataSet(cVar2.f203295h, "");
        lineDataSet2.setMode(LineDataSet.Mode.STEPPED);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setDrawFilled(false);
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setHighlightEnabled(false);
        lineDataSet2.setLineWidth(2.0f);
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet2.setColor(a7.b.getColor(context, R.color.white));
        customLineChart.setData(new LineData((List<ILineDataSet>) x.k(lineDataSet, lineDataSet2)));
        customLineChart.setNoDataText(null);
        customLineChart.invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lza1/b$a;", "", "<init>", "()V", "", "CHART_EXTRA_TOP_OFFSET", "F", "CHART_EXTRA_BOTTOM_OFFSET", "MAXIMUM_SCALE_X_LANDSCAPE_CHART", "CHART_TEXT_SIZE", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
