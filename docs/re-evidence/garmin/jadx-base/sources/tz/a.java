package tz;

import android.graphics.Paint;
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
import com.github.mikephil.charting.renderer.DataRenderer;
import f00.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import qz.e;
import qz.f;
import qz.h;
import tn2.t;
import zz.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltz/a;", "T", "Lqz/b;", "Lf00/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "dataConfig", "Lqz/h;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;Lqz/c;Lqz/h;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a<T> implements qz.b<T, c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LineDataSet f167283i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f167284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz.c<T, ILineDataSet> f167285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<c> f167286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f167287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f167288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f167289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f167291h;

    static {
        new C3143a(null);
        f167283i = new LineDataSet(j0.f134944a, "");
    }

    public a(CustomLineChart customLineChart, qz.c<T, ILineDataSet> cVar, h<c> hVar, e eVar, f fVar, CustomLegendView customLegendView) {
        customLineChart.getClass();
        cVar.getClass();
        hVar.getClass();
        this.f167284a = customLineChart;
        this.f167285b = cVar;
        this.f167286c = hVar;
        this.f167287d = eVar;
        this.f167288e = fVar;
        this.f167289f = customLegendView;
        this.f167290g = customLineChart.getContext().getResources().getConfiguration().orientation == 2;
        c();
    }

    @Override // qz.a
    public void a(Object obj, String str) {
        CustomLineChart customLineChart = this.f167284a;
        customLineChart.clear();
        b bVar = this.f167291h;
        if (bVar != null) {
            customLineChart.getViewTreeObserver().removeOnGlobalLayoutListener(bVar);
        }
        b bVar2 = new b(customLineChart, this, obj);
        this.f167291h = bVar2;
        customLineChart.getViewTreeObserver().addOnGlobalLayoutListener(bVar2);
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.removeAllLimitLines();
        qz.c<T, ILineDataSet> cVar = this.f167285b;
        xAxis.setAxisMinimum(cVar.e(obj));
        xAxis.setAxisMaximum(cVar.q(obj));
        Integer numC = cVar.c(obj);
        h<c> hVar = this.f167286c;
        if (numC != null) {
            xAxis.setLabelCount(numC.intValue(), hVar.getF101974h().f80603g);
        }
        xAxis.setDrawLimitLinesBehindData(cVar.l());
        List<LimitLine> listV = cVar.v(obj);
        if (listV != null) {
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                xAxis.addLimitLine((LimitLine) it.next());
            }
        }
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        axisLeft.setAxisMinimum(cVar.t(obj));
        axisLeft.setAxisMaximum(cVar.i(obj));
        Integer numJ = cVar.j(obj);
        if (numJ != null) {
            axisLeft.setLabelCount(numJ.intValue(), true);
        }
        List<LimitLine> listF = cVar.f(obj);
        if (listF != null) {
            Iterator<T> it3 = listF.iterator();
            while (it3.hasNext()) {
                axisLeft.addLimitLine((LimitLine) it3.next());
            }
        }
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.setAxisMinimum(cVar.m(obj));
        axisRight.setAxisMaximum(cVar.w(obj));
        h00.b bVarB = hVar.getF101974h();
        bVarB.f80597a = cVar.o(obj);
        bVarB.f80600d = cVar.g(obj);
        List<xz.f> listU = cVar.u(obj);
        f fVar = this.f167288e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = this.f167289f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        String strR = cVar.r(obj);
        if (strR != null) {
            Description description = customLineChart.getDescription();
            description.setEnabled(true);
            description.setText(strR);
        }
        List<ILineDataSet> listA = cVar.a(obj);
        ArrayList arrayListM = x.m(f167283i);
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayListM.add((ILineDataSet) it4.next());
        }
        customLineChart.setData(new LineData(arrayListM));
        if (((LineData) customLineChart.getData()).getDataSetCount() == 1 || cVar.d(obj)) {
            customLineChart.setNoDataText(str);
            customLineChart.setNoDataTextDescription(null);
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
        CustomLineChart customLineChart = this.f167284a;
        if (customLineChart != null) {
            customLineChart.setLayerType(1, null);
        }
        Description description = customLineChart.getDescription();
        description.setEnabled(false);
        description.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        description.setTextAlign(Paint.Align.CENTER);
        description.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        description.setTextSize(13.0f);
        h<c> hVar = this.f167286c;
        Float f67654e = ((c) hVar.c()).getF67654e();
        customLineChart.setExtraBottomOffset(f67654e != null ? f67654e.floatValue() : 30.0f);
        Float f67653d = ((c) hVar.c()).getF101323h();
        customLineChart.setExtraTopOffset(f67653d != null ? f67653d.floatValue() : 80.0f);
        Float f14 = ((c) hVar.c()).f67655f;
        customLineChart.setExtraLeftOffset(f14 != null ? f14.floatValue() : 0.0f);
        Float f15 = ((c) hVar.c()).f67656g;
        customLineChart.setExtraRightOffset(f15 != null ? f15.floatValue() : 0.0f);
        customLineChart.setDoubleTapToZoomEnabled(false);
        customLineChart.setScaleYEnabled(false);
        boolean z14 = this.f167290g;
        customLineChart.setScaleXEnabled(z14);
        customLineChart.getViewPortHandler().setMaximumScaleX(z14 ? 3.0f : 1.0f);
        customLineChart.setPinchZoom(false);
        customLineChart.setHighlightPerDragEnabled(false);
        customLineChart.setHighlightPerTapEnabled(false);
        qz.c<T, ILineDataSet> cVar = this.f167285b;
        customLineChart.setShouldShowHighlightedOnTop(cVar.h());
        e eVar = this.f167287d;
        customLineChart.setMarker(eVar != null ? eVar.b() : null);
        DataRenderer dataRendererC = hVar.c();
        c cVar2 = (c) dataRendererC;
        cVar2.f67650a = eVar != null ? eVar.c() : null;
        cVar2.f67651b = eVar != null ? eVar.e() : null;
        customLineChart.setRenderer(dataRendererC);
        customLineChart.setOnChartGestureListener((eVar == null || (bVarF2 = eVar.f()) == null) ? null : bVarF2.a());
        customLineChart.setGetHighlightEntry(new t(this, 16));
        customLineChart.setOnLongClickListener((eVar == null || (bVarF = eVar.f()) == null) ? null : bVarF.b());
        d dVar = new d(customLineChart);
        dVar.f207539a = eVar != null ? eVar.a() : null;
        customLineChart.setHighlighter(dVar);
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.setDrawAxisLine(hVar.getF101974h().getF80606j());
        xAxis.setDrawGridLines(hVar.getF101974h().f80607k);
        xAxis.setDrawLabels(hVar.getF101974h().f80608l);
        xAxis.setGranularity(1.0f);
        xAxis.setTextSize(10.0f);
        xAxis.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(hVar.getF101974h().f80601e);
        xAxis.setLabelRotationAngle(hVar.getF101974h().f80604h);
        xAxis.setLabelCount(hVar.getF101974h().f80602f, hVar.getF101974h().f80603g);
        h00.b bVarB = hVar.getF101974h();
        Paint paintAxisLabels = bVarB.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        bVarB.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = bVarB.getPaintAxisLabels();
        paintAxisLabels2.setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        bVarB.f80599c = paintAxisLabels2;
        customLineChart.setXAxisRenderer(bVarB);
        xAxis.setYOffset(hVar.getF101974h().f80605i);
        xAxis.setDrawLimitLinesBehindData(true);
        customLineChart.setMaxVisibleValueCount(DateTimeConstants.SECONDS_PER_DAY);
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.setDrawAxisLine(hVar.getF101352b().a());
        axisLeft.setDrawGridLines(hVar.getF101352b().getF160006k());
        axisLeft.setDrawLabels(hVar.getF101352b().getF86712b());
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setLabelCount(hVar.getF101352b().f86715e, hVar.getF101352b().f86716f);
        axisLeft.setDrawLimitLinesBehindData(hVar.getF101352b().getF160005j());
        axisLeft.setAxisMinimum(cVar.t(null));
        axisLeft.setAxisMaximum(cVar.i(null));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTextColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_text_label));
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customLineChart.getContext()));
        axisLeft.setGridColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_grid));
        axisLeft.setGridLineWidth(1.0f);
        axisLeft.setValueFormatter(hVar.getF101352b().getF101975i());
        customLineChart.setRendererLeftYAxis(hVar.getF101352b());
        axisLeft.setXOffset(hVar.getF101352b().f86717g);
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        customLineChart.getPaint(7).setColor(a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark));
        f fVar = this.f167288e;
        if (fVar == null || (legendB = fVar.b()) == null) {
            customLineChart.getF31342c().setEnabled(false);
        } else {
            customLineChart.setLegend(legendB);
        }
    }

    /* JADX INFO: renamed from: tz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltz/a$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "CHART_DESCRIPTION_TEXT_SIZE", "DEFAULT_CHART_EXTRA_BOTTOM_OFFSET", "DEFAULT_CHART_EXTRA_TOP_OFFSET", "DEFAULT_CHART_EXTRA_LEFT_OFFSET", "DEFAULT_CHART_EXTRA_RIGHT_OFFSET", "MAXIMUM_SCALE_X_LANDSCAPE_CHART", "MAXIMUM_SCALE_X_PORTRAIT_CHART", "", "MAX_VISIBLE_COUNT", "I", "Lcom/github/mikephil/charting/data/LineDataSet;", "EMPTY_LINE_DATA_SET", "Lcom/github/mikephil/charting/data/LineDataSet;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3143a {
        public /* synthetic */ C3143a(j jVar) {
            this();
        }

        private C3143a() {
        }
    }

    public /* synthetic */ a(CustomLineChart customLineChart, qz.c cVar, h hVar, e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customLineChart, cVar, hVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
