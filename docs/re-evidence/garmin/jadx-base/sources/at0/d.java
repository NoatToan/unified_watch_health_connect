package at0;

import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p13.j0;
import p13.x;
import qz.f;
import qz.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lat0/d;", "T", "Lqz/b;", "Lf00/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "dataConfig", "Lqz/g;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;Lqz/c;Lqz/g;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements qz.b<T, f00.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LineDataSet f12744h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f12745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz.c<T, ILineDataSet> f12746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<f00.c> f12747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qz.e f12748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f12749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f12750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12751g;

    static {
        new a(null);
        f12744h = new LineDataSet(j0.f134944a, "");
    }

    public d(CustomLineChart customLineChart, qz.c<T, ILineDataSet> cVar, g<f00.c> gVar, qz.e eVar, f fVar, CustomLegendView customLegendView) {
        customLineChart.getClass();
        cVar.getClass();
        gVar.getClass();
        this.f12745a = customLineChart;
        this.f12746b = cVar;
        this.f12747c = gVar;
        this.f12748d = eVar;
        this.f12749e = fVar;
        this.f12750f = customLegendView;
        this.f12751g = customLineChart.getContext().getResources().getConfiguration().orientation == 2;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // qz.a
    public final void a(Object obj, String str) {
        d<T> dVar;
        Object obj2;
        CustomLineChart customLineChart = this.f12745a;
        customLineChart.clear();
        r0 r0Var = new r0();
        float f14 = customLineChart.getContentRect().bottom;
        float f15 = customLineChart.getContentRect().top;
        qz.c<T, ILineDataSet> cVar = this.f12746b;
        T t7 = (T) cVar.b(f14, f15, obj);
        r0Var.f105810a = t7;
        if (t7 != null) {
            customLineChart.getRenderer().getPaintRender().setShader((Shader) r0Var.f105810a);
            dVar = this;
            obj2 = obj;
            new Handler(Looper.getMainLooper()).post(new c(r0Var, dVar, obj2, customLineChart, 0));
        } else {
            dVar = this;
            obj2 = obj;
        }
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.removeAllLimitLines();
        xAxis.setAxisMinimum(cVar.e(obj2));
        xAxis.setAxisMaximum(cVar.q(obj2));
        Integer numC = cVar.c(obj2);
        g<f00.c> gVar = dVar.f12747c;
        if (numC != null) {
            xAxis.setLabelCount(numC.intValue(), gVar.getF63186d().f80603g);
        }
        xAxis.setDrawLimitLinesBehindData(cVar.l());
        List<LimitLine> listV = cVar.v(obj2);
        if (listV != null) {
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                xAxis.addLimitLine((LimitLine) it.next());
            }
        }
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        axisLeft.setDrawLabels(true);
        axisLeft.setDrawGridLines(gVar.getF63187e().getF63193j());
        axisLeft.setAxisMinimum(cVar.t(obj2));
        axisLeft.setAxisMaximum(cVar.i(obj2));
        Integer numJ = cVar.j(obj2);
        if (numJ != null) {
            axisLeft.setLabelCount(numJ.intValue(), true);
        }
        List<LimitLine> listF = cVar.f(obj2);
        if (listF != null) {
            Iterator<T> it3 = listF.iterator();
            while (it3.hasNext()) {
                axisLeft.addLimitLine((LimitLine) it3.next());
            }
        }
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.removeAllLimitLines();
        axisRight.setDrawLabels(true);
        axisRight.setDrawGridLines(gVar.getF21078f().getF63193j());
        axisRight.setAxisMinimum(cVar.m(obj2));
        axisRight.setAxisMaximum(cVar.w(obj2));
        Integer numP = cVar.p(obj2);
        if (numP != null) {
            axisRight.setLabelCount(numP.intValue(), true);
        }
        axisRight.setValueFormatter(gVar.getF21078f().getF63194k());
        axisRight.setInverted(cVar.k());
        h00.b f101974h = gVar.getF63186d();
        f101974h.f80597a = cVar.o(obj2);
        f101974h.f80600d = cVar.g(obj2);
        List<xz.f> listU = cVar.u(obj2);
        f fVar = dVar.f12749e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = dVar.f12750f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        String strR = cVar.r(obj2);
        if (strR != null) {
            Description description = customLineChart.getDescription();
            description.setEnabled(true);
            description.setText(strR);
        }
        List listA = cVar.a(obj2);
        ArrayList arrayListM = x.m(f12744h);
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayListM.add((ILineDataSet) it4.next());
        }
        customLineChart.setData(new LineData(arrayListM));
        if (((LineData) customLineChart.getData()).getDataSetCount() == 1) {
            customLineChart.setNoDataText(str);
            customLineChart.setNoDataTextDescription(null);
            c();
        } else {
            customLineChart.setNoDataText(null);
            customLineChart.setNoDataTextDescription(null);
        }
        customLineChart.invalidate();
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
        fz.a aVar = fz.a.f73959a;
        CustomLineChart customLineChart = this.f12745a;
        if (customLineChart != null) {
            customLineChart.setLayerType(1, null);
        }
        Description description = customLineChart.getDescription();
        description.setEnabled(false);
        description.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        description.setTextAlign(Paint.Align.CENTER);
        description.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        description.setTextSize(13.0f);
        g<f00.c> gVar = this.f12747c;
        Float f67654e = gVar.getF173486i().getF67654e();
        customLineChart.setExtraBottomOffset(f67654e != null ? f67654e.floatValue() : 30.0f);
        Float f101323h = gVar.getF173486i().getF101323h();
        customLineChart.setExtraTopOffset(f101323h != null ? f101323h.floatValue() : 80.0f);
        Float f14 = gVar.getF173486i().f67655f;
        customLineChart.setExtraLeftOffset(f14 != null ? f14.floatValue() : 0.0f);
        Float f15 = gVar.getF173486i().f67656g;
        customLineChart.setExtraRightOffset(f15 != null ? f15.floatValue() : 0.0f);
        customLineChart.setDoubleTapToZoomEnabled(false);
        customLineChart.setScaleYEnabled(false);
        boolean z14 = this.f12751g;
        customLineChart.setScaleXEnabled(z14);
        customLineChart.getViewPortHandler().setMaximumScaleX(z14 ? 3.0f : 1.0f);
        customLineChart.setPinchZoom(false);
        customLineChart.setHighlightPerDragEnabled(false);
        customLineChart.setHighlightPerTapEnabled(false);
        qz.e eVar = this.f12748d;
        customLineChart.setMarker(eVar != null ? eVar.b() : null);
        f00.c cVarC = gVar.getF173486i();
        f00.c cVar = cVarC;
        cVar.f67650a = eVar != null ? eVar.c() : null;
        cVar.f67651b = eVar != null ? eVar.e() : null;
        customLineChart.setRenderer(cVarC);
        customLineChart.setOnChartGestureListener((eVar == null || (bVarF2 = eVar.getF203307b()) == null) ? null : bVarF2.a());
        customLineChart.setGetHighlightEntry(new a03.f(this, 21));
        customLineChart.setOnLongClickListener((eVar == null || (bVarF = eVar.getF203307b()) == null) ? null : bVarF.b());
        zz.d dVar = new zz.d(customLineChart);
        dVar.f207539a = eVar != null ? eVar.a() : null;
        customLineChart.setHighlighter(dVar);
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1.0f);
        xAxis.setTextSize(10.0f);
        xAxis.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(gVar.getF63186d().f80601e);
        xAxis.setLabelRotationAngle(gVar.getF63186d().f80604h);
        xAxis.setLabelCount(gVar.getF63186d().f80602f, gVar.getF63186d().f80603g);
        h00.b f101974h = gVar.getF63186d();
        Paint paintAxisLabels = f101974h.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        f101974h.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = f101974h.getPaintAxisLabels();
        paintAxisLabels2.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        f101974h.f80599c = paintAxisLabels2;
        customLineChart.setXAxisRenderer(f101974h);
        xAxis.setYOffset(gVar.getF63186d().f80605i);
        xAxis.setDrawLimitLinesBehindData(true);
        customLineChart.setMaxVisibleValueCount(DateTimeConstants.SECONDS_PER_DAY);
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawLabels(false);
        YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
        axisLeft.setPosition(yAxisLabelPosition);
        axisLeft.setLabelCount(gVar.getF63187e().f86715e, gVar.getF63187e().f86716f);
        axisLeft.setGranularityEnabled(true);
        axisLeft.setDrawLimitLinesBehindData(gVar.getF63187e().getF160005j());
        qz.c<T, ILineDataSet> cVar2 = this.f12746b;
        axisLeft.setAxisMinimum(cVar2.t(null));
        axisLeft.setAxisMaximum(cVar2.i(null));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        axisLeft.setGridColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_grid));
        axisLeft.setGridLineWidth(1.0f);
        axisLeft.setValueFormatter(gVar.getF63187e().getF63194k());
        customLineChart.setRendererLeftYAxis(gVar.getF63187e());
        axisLeft.setXOffset(gVar.getF63187e().f86717g);
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        axisRight.setPosition(yAxisLabelPosition);
        axisRight.setLabelCount(gVar.getF21078f().f86715e, gVar.getF21078f().f86716f);
        axisRight.setGranularityEnabled(true);
        axisRight.setDrawLimitLinesBehindData(gVar.getF21078f().getF160005j());
        axisRight.setAxisMinimum(cVar2.m(null));
        axisRight.setAxisMaximum(cVar2.w(null));
        axisRight.setTextSize(10.0f);
        axisRight.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        axisRight.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        axisRight.setGridColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_grid));
        axisRight.setGridLineWidth(1.0f);
        axisRight.setValueFormatter(gVar.getF21078f().getF63194k());
        customLineChart.setRendererRightYAxis(gVar.getF21078f());
        axisRight.setXOffset(gVar.getF21078f().f86717g);
        customLineChart.getPaint(7).setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        f fVar = this.f12749e;
        if (fVar == null || (legendB = fVar.b()) == null) {
            customLineChart.getF31342c().setEnabled(false);
        } else {
            customLineChart.setLegend(legendB);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lat0/d$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "CHART_DESCRIPTION_TEXT_SIZE", "DEFAULT_CHART_EXTRA_BOTTOM_OFFSET", "DEFAULT_CHART_EXTRA_TOP_OFFSET", "DEFAULT_CHART_EXTRA_LEFT_OFFSET", "DEFAULT_CHART_EXTRA_RIGHT_OFFSET", "MAXIMUM_SCALE_X_LANDSCAPE_CHART", "MAXIMUM_SCALE_X_PORTRAIT_CHART", "", "MAX_VISIBLE_COUNT", "I", "Lcom/github/mikephil/charting/data/LineDataSet;", "EMPTY_LINE_DATA_SET", "Lcom/github/mikephil/charting/data/LineDataSet;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(CustomLineChart customLineChart, qz.c cVar, g gVar, qz.e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customLineChart, cVar, gVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
