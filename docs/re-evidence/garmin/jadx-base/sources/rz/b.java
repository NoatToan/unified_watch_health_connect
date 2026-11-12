package rz;

import android.content.Context;
import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomHorizontalBarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import d00.b;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import qw0.y;
import qz.c;
import qz.d;
import qz.e;
import qz.f;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0014BU\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrz/b;", "T", "Ld00/b;", "S", "Lqz/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/data/BarDataSet;", "dataConfig", "Lqz/d;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;Lqz/c;Lqz/d;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<T, S extends d00.b> implements qz.a<T, S> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f155199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f155200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f155201i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomHorizontalBarChart f155202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T, BarDataSet> f155203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<S> f155204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f155205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f155206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f155207f;

    static {
        new a(null);
        f155199g = R.color.gcm_chart_grid;
        f155200h = R.color.gcm_chart_text_label;
        f155201i = R.color.gcm_chart_mark;
    }

    public b(CustomHorizontalBarChart customHorizontalBarChart, c<T, BarDataSet> cVar, d<S> dVar, e eVar, f fVar, CustomLegendView customLegendView) {
        customHorizontalBarChart.getClass();
        cVar.getClass();
        dVar.getClass();
        this.f155202a = customHorizontalBarChart;
        this.f155203b = cVar;
        this.f155204c = dVar;
        this.f155205d = eVar;
        this.f155206e = fVar;
        this.f155207f = customLegendView;
        c();
        customHorizontalBarChart.setTag(R.id.configurator_name, cVar.getClass().getName());
    }

    @Override // qz.a
    public final void a(Object obj, String str) {
        CustomHorizontalBarChart customHorizontalBarChart = this.f155202a;
        customHorizontalBarChart.clear();
        XAxis xAxis = customHorizontalBarChart.getXAxis();
        xAxis.removeAllLimitLines();
        c<T, BarDataSet> cVar = this.f155203b;
        xAxis.setAxisMinimum(cVar.e(obj));
        xAxis.setAxisMaximum(cVar.q(obj));
        Integer numC = cVar.c(obj);
        d<S> dVar = this.f155204c;
        if (numC != null) {
            int iIntValue = numC.intValue();
            dVar.getF178724a().getClass();
            xAxis.setLabelCount(iIntValue, false);
        }
        YAxis axisRight = customHorizontalBarChart.getAxisRight();
        axisRight.removeAllLimitLines();
        axisRight.setAxisMinimum(cVar.m(obj));
        axisRight.setAxisMaximum(cVar.w(obj));
        Integer numP = cVar.p(obj);
        if (numP != null) {
            axisRight.setLabelCount(numP.intValue(), true);
        }
        h00.d f178724a = dVar.getF178724a();
        f178724a.f80593c = cVar.g(obj);
        List<String> listO = cVar.o(obj);
        if (listO != null) {
            f178724a.f80591a = listO;
            f178724a.f80595e = customHorizontalBarChart.getXAxis().getLabelCount();
        }
        dVar.getF178726c().getClass();
        customHorizontalBarChart.setDrawBarShadow(false);
        List<xz.f> listU = cVar.u(obj);
        f fVar = this.f155206e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = this.f155207f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        BarData barData = new BarData(cVar.a(obj));
        barData.setDrawValues(false);
        barData.setBarWidth(dVar.getF178726c().f56997b);
        customHorizontalBarChart.setData(barData);
        if (((BarData) customHorizontalBarChart.getData()).getEntryCount() == 0) {
            customHorizontalBarChart.setNoDataText(str);
            customHorizontalBarChart.setNoDataTextDescription(null);
        } else {
            customHorizontalBarChart.setNoDataText(null);
            customHorizontalBarChart.setNoDataTextDescription(null);
        }
        customHorizontalBarChart.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        Legend legendB;
        b00.b bVarF;
        b00.b bVarF2;
        CustomHorizontalBarChart customHorizontalBarChart = this.f155202a;
        customHorizontalBarChart.getDescription().setEnabled(false);
        d<S> dVar = this.f155204c;
        Float f14 = dVar.getF178726c().f56999d;
        customHorizontalBarChart.setExtraTopOffset(f14 != null ? f14.floatValue() : 80.0f);
        Float f15 = dVar.getF178726c().f57000e;
        customHorizontalBarChart.setExtraBottomOffset(f15 != null ? f15.floatValue() : 45.0f);
        customHorizontalBarChart.setDoubleTapToZoomEnabled(false);
        e eVar = this.f155205d;
        customHorizontalBarChart.setTouchEnabled(eVar != null);
        customHorizontalBarChart.setPinchZoom(false);
        customHorizontalBarChart.setScaleEnabled(false);
        customHorizontalBarChart.setDrawBarShadow(false);
        customHorizontalBarChart.setNoDataText("");
        customHorizontalBarChart.setNoDataTextDescription(null);
        customHorizontalBarChart.setHighlightPerTapEnabled(false);
        customHorizontalBarChart.setHighlightPerDragEnabled(false);
        customHorizontalBarChart.setMarker(eVar != null ? eVar.b() : null);
        d00.b f178726c = dVar.getF178726c();
        ViewPortHandler viewPortHandler = customHorizontalBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        f178726c.f56996a = new v(viewPortHandler, 0.0f, 2, null);
        customHorizontalBarChart.setRenderer(f178726c);
        customHorizontalBarChart.setOnChartGestureListener((eVar == null || (bVarF2 = eVar.f()) == null) ? null : bVarF2.a());
        customHorizontalBarChart.setGetHighlightEntry(new y(this, 26));
        customHorizontalBarChart.setOnLongClickListener((eVar == null || (bVarF = eVar.f()) == null) ? null : bVarF.b());
        zz.d dVar2 = new zz.d(customHorizontalBarChart);
        dVar2.f207539a = new zz.b();
        customHorizontalBarChart.setHighlighter(dVar2);
        XAxis xAxis = customHorizontalBarChart.getXAxis();
        dVar.getF178724a().getClass();
        xAxis.setDrawAxisLine(false);
        dVar.getF178724a().getClass();
        xAxis.setDrawGridLines(false);
        xAxis.setDrawLabels(dVar.getF178724a().f80596f);
        xAxis.setTextSize(10.0f);
        Context context = customHorizontalBarChart.getContext();
        int i14 = f155200h;
        xAxis.setTextColor(a7.b.getColor(context, i14));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customHorizontalBarChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(dVar.getF178724a().f80594d);
        dVar.getF178724a().getClass();
        xAxis.setLabelRotationAngle(0.0f);
        int i15 = dVar.getF178724a().f80595e;
        dVar.getF178724a().getClass();
        xAxis.setLabelCount(i15, false);
        h00.d f178724a = dVar.getF178724a();
        Paint paintAxisLabels = f178724a.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customHorizontalBarChart.getContext(), i14));
        f178724a.f80592b = paintAxisLabels;
        Paint paintAxisLabels2 = f178724a.getPaintAxisLabels();
        Context context2 = customHorizontalBarChart.getContext();
        int i16 = f155201i;
        paintAxisLabels2.setColor(a7.b.getColor(context2, i16));
        customHorizontalBarChart.setXAxisRenderer(f178724a);
        customHorizontalBarChart.getAxisLeft().setEnabled(false);
        customHorizontalBarChart.setRendererRightYAxis(dVar.getF178725b());
        YAxis axisRight = customHorizontalBarChart.getAxisRight();
        dVar.getF178725b().getClass();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(dVar.getF178725b().f86705a);
        axisRight.setDrawLabels(dVar.getF178725b().f86706b);
        axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisRight.setLabelCount(dVar.getF178725b().f86707c, dVar.getF178725b().f86708d);
        c<T, BarDataSet> cVar = this.f155203b;
        axisRight.setAxisMinimum(cVar.m(null));
        axisRight.setAxisMaximum(cVar.w(null));
        axisRight.setTextSize(10.0f);
        axisRight.setTextColor(a7.b.getColor(customHorizontalBarChart.getContext(), i14));
        axisRight.setTypeface(h22.a.a("font/roboto_regular.ttf", customHorizontalBarChart.getContext()));
        axisRight.setGridColor(a7.b.getColor(customHorizontalBarChart.getContext(), f155199g));
        axisRight.setGridLineWidth(1.0f);
        axisRight.setValueFormatter(dVar.getF178725b().f178727f);
        axisRight.setXOffset(dVar.getF178725b().f86709e);
        customHorizontalBarChart.getPaint(7).setColor(a7.b.getColor(customHorizontalBarChart.getContext(), i16));
        f fVar = this.f155206e;
        if (fVar == null || (legendB = fVar.b()) == null) {
            customHorizontalBarChart.getF31342c().setEnabled(false);
        } else {
            customHorizontalBarChart.setLegend(legendB);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lrz/b$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "CHART_EXTRA_BOTTOM_OFFSET", "CHART_EXTRA_TOP_OFFSET", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(CustomHorizontalBarChart customHorizontalBarChart, c cVar, d dVar, e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customHorizontalBarChart, cVar, dVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
