package rz;

import android.content.Context;
import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import d00.a;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import qw0.y;
import qz.c;
import qz.e;
import qz.f;
import qz.h;
import zz.d;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0014BU\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrz/a;", "T", "Ld00/a;", "S", "Lqz/b;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/data/BarDataSet;", "dataConfig", "Lqz/h;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;Lqz/c;Lqz/h;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T, S extends d00.a> implements qz.b<T, S> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2940a f155189g = new C2940a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f155190h = R.color.gcm_chart_grid;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f155191i = R.color.gcm_chart_text_label;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f155192j = R.color.gcm_chart_mark;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomBarChart f155193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T, BarDataSet> f155194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<S> f155195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f155196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f155197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f155198f;

    public a(CustomBarChart customBarChart, c<T, BarDataSet> cVar, h<S> hVar, e eVar, f fVar, CustomLegendView customLegendView) {
        customBarChart.getClass();
        cVar.getClass();
        hVar.getClass();
        this.f155193a = customBarChart;
        this.f155194b = cVar;
        this.f155195c = hVar;
        this.f155196d = eVar;
        this.f155197e = fVar;
        this.f155198f = customLegendView;
        c();
        customBarChart.setTag(R.id.configurator_name, cVar.getClass().getName());
    }

    @Override // qz.a
    public final void a(Object obj, String str) {
        CustomBarChart customBarChart = this.f155193a;
        customBarChart.clear();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.removeAllLimitLines();
        c<T, BarDataSet> cVar = this.f155194b;
        xAxis.setAxisMinimum(cVar.e(obj));
        xAxis.setAxisMaximum(cVar.q(obj));
        Integer numC = cVar.c(obj);
        h<S> hVar = this.f155195c;
        if (numC != null) {
            xAxis.setLabelCount(numC.intValue(), hVar.getF101974h().f80603g);
        }
        YAxis axisLeft = customBarChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        axisLeft.setAxisMinimum(cVar.t(obj));
        axisLeft.setAxisMaximum(cVar.i(obj));
        Integer numJ = cVar.j(obj);
        if (numJ != null) {
            axisLeft.setLabelCount(numJ.intValue(), true);
        }
        List<LimitLine> listF = cVar.f(obj);
        if (listF != null) {
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                axisLeft.addLimitLine((LimitLine) it.next());
            }
        }
        h00.b f101974h = hVar.getF101974h();
        f101974h.f80600d = cVar.g(obj);
        List<String> listO = cVar.o(obj);
        if (listO != null) {
            f101974h.f80597a = listO;
            f101974h.f80602f = customBarChart.getXAxis().getLabelCount();
        }
        customBarChart.setDrawBarShadow(((d00.a) hVar.getF142393c()).f56991c);
        List<xz.f> listU = cVar.u(obj);
        f fVar = this.f155197e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = this.f155198f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        BarData barData = new BarData(cVar.a(obj));
        barData.setDrawValues(false);
        barData.setBarWidth(((d00.a) hVar.getF142393c()).f56990b);
        customBarChart.setData(barData);
        if (((BarData) customBarChart.getData()).getEntryCount() == 0) {
            customBarChart.setNoDataText(str);
            customBarChart.setNoDataTextDescription(null);
            if (fVar != null) {
                fVar.a(j0.f134944a);
            }
            if (customLegendView != null) {
                customLegendView.a(j0.f134944a);
            }
        } else {
            customBarChart.setNoDataText(null);
            customBarChart.setNoDataTextDescription(null);
        }
        customBarChart.invalidate();
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
        CustomBarChart customBarChart = this.f155193a;
        customBarChart.getDescription().setEnabled(false);
        h<S> hVar = this.f155195c;
        Float f14 = ((d00.a) hVar.getF142393c()).f56994f;
        customBarChart.setExtraTopOffset(f14 != null ? f14.floatValue() : 80.0f);
        Float f15 = ((d00.a) hVar.getF142393c()).f56995g;
        customBarChart.setExtraBottomOffset(f15 != null ? f15.floatValue() : 45.0f);
        customBarChart.setDoubleTapToZoomEnabled(false);
        e eVar = this.f155196d;
        customBarChart.setTouchEnabled(eVar != null);
        customBarChart.setPinchZoom(false);
        customBarChart.setScaleEnabled(false);
        customBarChart.setDrawBarShadow(false);
        customBarChart.setNoDataText("");
        customBarChart.setNoDataTextDescription(null);
        customBarChart.setHighlightPerTapEnabled(false);
        customBarChart.setHighlightPerDragEnabled(false);
        customBarChart.setMarker(eVar != null ? eVar.b() : null);
        DataRenderer f142393c = hVar.getF142393c();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        ((d00.a) f142393c).f56989a = new v(viewPortHandler, 0.0f, 2, null);
        customBarChart.setRenderer(f142393c);
        customBarChart.setOnChartGestureListener((eVar == null || (bVarF2 = eVar.f()) == null) ? null : bVarF2.a());
        customBarChart.setGetHighlightEntry(new y(this, 25));
        customBarChart.setOnLongClickListener((eVar == null || (bVarF = eVar.f()) == null) ? null : bVarF.b());
        d dVar = new d(customBarChart);
        dVar.f207539a = new zz.b();
        customBarChart.setHighlighter(dVar);
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.setDrawAxisLine(hVar.getF101974h().getF80606j());
        xAxis.setDrawGridLines(hVar.getF101974h().f80607k);
        xAxis.setDrawLabels(hVar.getF101974h().f80608l);
        xAxis.setTextSize(10.0f);
        Context context = customBarChart.getContext();
        int i14 = f155191i;
        xAxis.setTextColor(a7.b.getColor(context, i14));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customBarChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(hVar.getF101974h().f80601e);
        xAxis.setLabelRotationAngle(hVar.getF101974h().f80604h);
        xAxis.setLabelCount(hVar.getF101974h().f80602f, hVar.getF101974h().f80603g);
        h00.b f101974h = hVar.getF101974h();
        Paint paintAxisLabels = f101974h.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customBarChart.getContext(), i14));
        f101974h.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = f101974h.getPaintAxisLabels();
        Context context2 = customBarChart.getContext();
        int i15 = f155192j;
        paintAxisLabels2.setColor(a7.b.getColor(context2, i15));
        f101974h.f80599c = paintAxisLabels2;
        customBarChart.setXAxisRenderer(f101974h);
        YAxis axisLeft = customBarChart.getAxisLeft();
        axisLeft.setDrawAxisLine(hVar.getF101352b().a());
        axisLeft.setDrawGridLines(hVar.getF101352b().getF178733j());
        axisLeft.setDrawLabels(hVar.getF101352b().getF178732i());
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setLabelCount(hVar.getF101352b().f86715e, hVar.getF101352b().f86716f);
        axisLeft.setDrawLimitLinesBehindData(hVar.getF101352b().getF160005j());
        c<T, BarDataSet> cVar = this.f155194b;
        axisLeft.setAxisMinimum(cVar.t(null));
        axisLeft.setAxisMaximum(cVar.i(null));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTextColor(a7.b.getColor(customBarChart.getContext(), i14));
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customBarChart.getContext()));
        axisLeft.setGridColor(a7.b.getColor(customBarChart.getContext(), f155190h));
        axisLeft.setGridLineWidth(1.0f);
        axisLeft.setValueFormatter(hVar.getF101352b().getF21082i());
        customBarChart.setRendererLeftYAxis(hVar.getF101352b());
        axisLeft.setXOffset(hVar.getF101352b().f86717g);
        customBarChart.getAxisRight().setEnabled(false);
        customBarChart.getPaint(7).setColor(a7.b.getColor(customBarChart.getContext(), i15));
        f fVar = this.f155197e;
        if (fVar == null || (legendB = fVar.b()) == null) {
            customBarChart.getF31342c().setEnabled(false);
        } else {
            customBarChart.setLegend(legendB);
        }
    }

    /* JADX INFO: renamed from: rz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lrz/a$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "CHART_EXTRA_BOTTOM_OFFSET", "CHART_EXTRA_TOP_OFFSET", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2940a {
        public /* synthetic */ C2940a(j jVar) {
            this();
        }

        private C2940a() {
        }
    }

    public /* synthetic */ a(CustomBarChart customBarChart, c cVar, h hVar, e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customBarChart, cVar, hVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
