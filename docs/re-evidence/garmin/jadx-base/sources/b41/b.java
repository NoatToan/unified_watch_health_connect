package b41;

import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.ScatterChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import qz.c;
import qz.e;
import qz.f;
import qz.h;
import zz.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb41/b;", "T", "Lqz/b;", "Lc00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineScatterCandleRadarDataSet;", "Lcom/github/mikephil/charting/data/Entry;", "dataConfig", "Ld41/a;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lqz/c;Ld41/a;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements qz.b<T, c00.a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LineDataSet f15709g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f15710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T, ILineScatterCandleRadarDataSet<Entry>> f15711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d41.a f15712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f15713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f15714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f15715f;

    static {
        new a(null);
        f15709g = new LineDataSet(j0.f134944a, "");
    }

    public b(CustomCombinedChart customCombinedChart, c<T, ILineScatterCandleRadarDataSet<Entry>> cVar, d41.a aVar, e eVar, f fVar, CustomLegendView customLegendView) {
        Legend legendB;
        b00.b f203307b;
        b00.b f203307b2;
        customCombinedChart.getClass();
        cVar.getClass();
        aVar.getClass();
        this.f15710a = customCombinedChart;
        this.f15711b = cVar;
        this.f15712c = aVar;
        this.f15713d = eVar;
        this.f15714e = fVar;
        this.f15715f = customLegendView;
        fz.a aVar2 = fz.a.f73959a;
        customCombinedChart.setLayerType(1, null);
        ChartAnimator animator = customCombinedChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = customCombinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        customCombinedChart.setRenderer(new d41.c(customCombinedChart, animator, viewPortHandler));
        customCombinedChart.setMaxVisibleValueCount(100000);
        customCombinedChart.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.SCATTER, CombinedChart.DrawOrder.LINE});
        Description description = customCombinedChart.getDescription();
        description.setEnabled(false);
        description.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        description.setTextAlign(Paint.Align.CENTER);
        description.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_mark));
        description.setTextSize(13.0f);
        customCombinedChart.setExtraBottomOffset(30.0f);
        customCombinedChart.setExtraTopOffset(70.0f);
        customCombinedChart.setHighlightPerDragEnabled(true);
        customCombinedChart.setHighlightPerTapEnabled(false);
        customCombinedChart.setPinchZoom(false);
        customCombinedChart.setScaleEnabled(false);
        customCombinedChart.setMarker(eVar != null ? eVar.b() : null);
        customCombinedChart.setOnChartGestureListener((eVar == null || (f203307b2 = eVar.getF179435c()) == null) ? null : f203307b2.a());
        customCombinedChart.setGetHighlightEntry(new b41.a(this, 0));
        customCombinedChart.setOnLongClickListener((eVar == null || (f203307b = eVar.getF179435c()) == null) ? null : f203307b.b());
        d dVar = new d(customCombinedChart);
        dVar.f207539a = eVar != null ? eVar.a() : null;
        customCombinedChart.setHighlighter(dVar);
        XAxis xAxis = customCombinedChart.getXAxis();
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1.0f);
        xAxis.setTextSize(10.0f);
        xAxis.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        d41.b bVar = (d41.b) aVar;
        i00.b bVar2 = bVar.f57460e;
        h00.b bVar3 = bVar.f57459d;
        xAxis.setValueFormatter(bVar3.f80601e);
        xAxis.setLabelRotationAngle(bVar3.f80604h);
        xAxis.setLabelCount(bVar3.f80602f, bVar3.f80603g);
        Paint paintAxisLabels = bVar3.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        bVar3.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = bVar3.getPaintAxisLabels();
        paintAxisLabels2.setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_mark));
        bVar3.f80599c = paintAxisLabels2;
        customCombinedChart.setXAxisRenderer(bVar3);
        xAxis.setYOffset(20.0f);
        xAxis.setDrawLimitLinesBehindData(true);
        YAxis axisLeft = customCombinedChart.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(bVar2.getF179280i());
        axisLeft.setDrawLabels(true);
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setGranularityEnabled(true);
        axisLeft.setGranularity(20.0f);
        axisLeft.setLabelCount(4, true);
        axisLeft.setAxisMinimum(cVar.t(null));
        axisLeft.setAxisMaximum(cVar.i(null));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        axisLeft.setGridColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_grid));
        axisLeft.setGridLineWidth(1.0f);
        axisLeft.setValueFormatter(bVar2.getF63194k());
        customCombinedChart.setRendererLeftYAxis(bVar2);
        axisLeft.setXOffset(3.0f);
        YAxis axisRight = customCombinedChart.getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        DataRenderer renderer = customCombinedChart.getRenderer();
        renderer.getClass();
        ChartAnimator animator2 = customCombinedChart.getAnimator();
        animator2.getClass();
        ViewPortHandler viewPortHandler2 = customCombinedChart.getViewPortHandler();
        viewPortHandler2.getClass();
        ((c00.a) renderer).setSubRenderers(x.m(new d41.e(customCombinedChart, animator2, viewPortHandler2), new ScatterChartRenderer(customCombinedChart, customCombinedChart.getAnimator(), customCombinedChart.getViewPortHandler())));
        customCombinedChart.getPaint(7).setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_mark));
        zz.e eVar2 = new zz.e(customCombinedChart);
        eVar2.f207540a = eVar != null ? eVar.a() : null;
        customCombinedChart.setHighlighter(eVar2);
        if (fVar == null || (legendB = fVar.b()) == null) {
            customCombinedChart.getF31342c().setEnabled(false);
        } else {
            customCombinedChart.setLegend(legendB);
        }
    }

    @Override // qz.a
    public final void a(Object obj, String str) {
        f00.c cVar;
        CustomCombinedChart customCombinedChart = this.f15710a;
        customCombinedChart.clear();
        XAxis xAxis = customCombinedChart.getXAxis();
        xAxis.removeAllLimitLines();
        c<T, ILineScatterCandleRadarDataSet<Entry>> cVar2 = this.f15711b;
        xAxis.setAxisMinimum(cVar2.e(obj));
        xAxis.setAxisMaximum(cVar2.q(obj));
        Integer numC = cVar2.c(obj);
        d41.a aVar = this.f15712c;
        if (numC != null) {
            xAxis.setLabelCount(numC.intValue(), ((d41.b) aVar).f57459d.f80603g);
        }
        List<LimitLine> listV = cVar2.v(obj);
        if (listV != null) {
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                xAxis.addLimitLine((LimitLine) it.next());
            }
        }
        YAxis axisLeft = customCombinedChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        axisLeft.setAxisMinimum(cVar2.t(obj));
        axisLeft.setAxisMaximum(cVar2.i(obj));
        List<LimitLine> listF = cVar2.f(obj);
        if (listF != null) {
            Iterator<T> it3 = listF.iterator();
            while (it3.hasNext()) {
                axisLeft.addLimitLine((LimitLine) it3.next());
            }
        }
        YAxis axisRight = customCombinedChart.getAxisRight();
        axisRight.setAxisMinimum(cVar2.m(obj));
        axisRight.setAxisMaximum(cVar2.w(obj));
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        h<f00.c> hVarF = aVar.f();
        if (hVarF != null && (cVar = (f00.c) hVarF.getF173486i()) != null) {
            arrayList.add(cVar);
        }
        f00.e f57458c = aVar.getF57458c();
        if (f57458c != null) {
            arrayList.add(f57458c);
        }
        d41.e f57457b = aVar.getF57457b();
        if (f57457b != null) {
            arrayList.add(f57457b);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            DataRenderer renderer = customCombinedChart.getRenderer();
            renderer.getClass();
            ((c00.a) renderer).setSubRenderers(arrayList);
        }
        LineData lineData = new LineData(f15709g);
        ScatterData scatterData = new ScatterData();
        Iterator<T> it4 = cVar2.a(obj).iterator();
        while (it4.hasNext()) {
            ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet = (ILineScatterCandleRadarDataSet) it4.next();
            if (iLineScatterCandleRadarDataSet instanceof LineDataSet) {
                lineData.addDataSet(iLineScatterCandleRadarDataSet);
            } else if (iLineScatterCandleRadarDataSet instanceof ScatterDataSet) {
                scatterData.addDataSet(iLineScatterCandleRadarDataSet);
            }
        }
        List<xz.f> listU = cVar2.u(obj);
        f fVar = this.f15714e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = this.f15715f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        String strR = cVar2.r(obj);
        if (strR != null) {
            Description description = customCombinedChart.getDescription();
            description.setEnabled(true);
            description.setText(strR);
        }
        CombinedData combinedData = new CombinedData();
        combinedData.setData(scatterData);
        combinedData.setData(lineData);
        customCombinedChart.setData(combinedData);
        if (obj instanceof z31.b) {
            List<i41.f> list = ((z31.b) obj).f202146h;
            if (list == null || list.isEmpty()) {
                customCombinedChart.setNoDataText(str);
            } else {
                customCombinedChart.setNoDataText("");
            }
        }
        customCombinedChart.invalidate();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb41/b$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "CHART_DESCRIPTION_TEXT_SIZE", "DEFAULT_CHART_EXTRA_BOTTOM_OFFSET", "DEFAULT_CHART_EXTRA_TOP_OFFSET", "Y_AXIS_X_OFFSET", "Lcom/github/mikephil/charting/data/LineDataSet;", "EMPTY_LINE_DATA_SET", "Lcom/github/mikephil/charting/data/LineDataSet;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(CustomCombinedChart customCombinedChart, c cVar, d41.a aVar, e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customCombinedChart, cVar, aVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
