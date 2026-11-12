package sz;

import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleDataSet;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import qz.c;
import qz.e;
import qz.f;
import qz.h;
import s70.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013BS\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lsz/a;", "T", "Lqz/b;", "Lc00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lqz/c;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "dataConfig", "Lsz/b;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "customLegend", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lqz/c;Lsz/b;Lqz/e;Lqz/f;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> implements qz.b<T, c00.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LineDataSet f161311h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f161312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T, IBarLineScatterCandleBubbleDataSet<?>> f161313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f161314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f161315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f161316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLegendView f161317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f161318g;

    static {
        new C3044a(null);
        f161311h = new LineDataSet(j0.f134944a, "");
    }

    public a(CustomCombinedChart customCombinedChart, c<T, IBarLineScatterCandleBubbleDataSet<?>> cVar, b bVar, e eVar, f fVar, CustomLegendView customLegendView) {
        customCombinedChart.getClass();
        cVar.getClass();
        bVar.getClass();
        this.f161312a = customCombinedChart;
        this.f161313b = cVar;
        this.f161314c = bVar;
        this.f161315d = eVar;
        this.f161316e = fVar;
        this.f161317f = customLegendView;
        this.f161318g = customCombinedChart.getContext().getResources().getConfiguration().orientation == 2;
        c();
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
    @Override // qz.a
    public final void a(Object obj, String str) {
        d00.a aVar;
        d00.a aVar2;
        CustomCombinedChart customCombinedChart = this.f161312a;
        customCombinedChart.clear();
        XAxis xAxis = customCombinedChart.getXAxis();
        c<T, IBarLineScatterCandleBubbleDataSet<?>> cVar = this.f161313b;
        xAxis.setAxisMinimum(cVar.e(obj));
        xAxis.setAxisMaximum(cVar.q(obj));
        Integer numC = cVar.c(obj);
        b bVar = this.f161314c;
        if (numC != null) {
            xAxis.setLabelCount(numC.intValue(), bVar.getF107016d().f80603g);
        }
        YAxis axisLeft = customCombinedChart.getAxisLeft();
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
        YAxis axisRight = customCombinedChart.getAxisRight();
        axisRight.removeAllLimitLines();
        axisRight.setAxisMinimum(cVar.m(obj));
        axisRight.setAxisMaximum(cVar.w(obj));
        Integer numP = cVar.p(obj);
        if (numP != null) {
            axisRight.setLabelCount(numP.intValue(), true);
        }
        h00.b bVarB = bVar.getF107016d();
        bVarB.f80600d = cVar.g(obj);
        List<String> listO = cVar.o(obj);
        if (listO != null) {
            bVarB.f80597a = listO;
            bVarB.f80602f = customCombinedChart.getXAxis().getLabelCount();
        }
        customCombinedChart.getRenderer().getPaintRender().setShader(cVar.b(customCombinedChart.getViewPortHandler().getContentRect().bottom, customCombinedChart.getViewPortHandler().getContentRect().top, obj));
        h<d00.a> hVarE = bVar.e();
        if (hVarE != null && (aVar2 = (d00.a) hVarE.getF173486i()) != null) {
            customCombinedChart.setDrawBarShadow(aVar2.f56991c);
        }
        List<xz.f> listU = cVar.u(obj);
        f fVar = this.f161316e;
        if (fVar != null) {
            fVar.a(listU);
        }
        CustomLegendView customLegendView = this.f161317f;
        if (customLegendView != null) {
            if (listU == null) {
                listU = j0.f134944a;
            }
            customLegendView.a(listU);
        }
        LineData lineData = new LineData(f161311h);
        BarData barData = new BarData();
        barData.setDrawValues(false);
        h<d00.a> hVarE2 = bVar.e();
        if (hVarE2 != null && (aVar = (d00.a) hVarE2.getF173486i()) != null) {
            barData.setBarWidth(aVar.f56990b);
        }
        ScatterData scatterData = new ScatterData();
        CandleData candleData = new CandleData();
        BubbleData bubbleData = new BubbleData();
        Iterator<T> it3 = cVar.a(obj).iterator();
        while (it3.hasNext()) {
            IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) it3.next();
            if (iBarLineScatterCandleBubbleDataSet instanceof LineDataSet) {
                lineData.addDataSet(iBarLineScatterCandleBubbleDataSet);
            } else if (iBarLineScatterCandleBubbleDataSet instanceof BarDataSet) {
                barData.addDataSet(iBarLineScatterCandleBubbleDataSet);
            } else if (iBarLineScatterCandleBubbleDataSet instanceof ScatterDataSet) {
                scatterData.addDataSet(iBarLineScatterCandleBubbleDataSet);
            } else if (iBarLineScatterCandleBubbleDataSet instanceof CandleDataSet) {
                candleData.addDataSet(iBarLineScatterCandleBubbleDataSet);
            } else if (iBarLineScatterCandleBubbleDataSet instanceof BubbleDataSet) {
                bubbleData.addDataSet(iBarLineScatterCandleBubbleDataSet);
            }
        }
        CombinedData combinedData = new CombinedData();
        combinedData.setData(barData);
        combinedData.setData(lineData);
        combinedData.setData(scatterData);
        combinedData.setData(candleData);
        combinedData.setData(bubbleData);
        customCombinedChart.setData(combinedData);
        j23.e eVar = new j23.e(customCombinedChart.getXAxis().getAxisMinimum(), customCombinedChart.getXAxis().getAxisMaximum());
        if (lineData.getDataSetCount() == 1 && barData.getEntryCount() == 0 && scatterData.getEntryCount() == 0 && candleData.getEntryCount() == 0 && bubbleData.getEntryCount() == 0) {
            customCombinedChart.setNoDataText(str);
            customCombinedChart.setNoDataTextDescription(null);
        } else {
            List<T> dataSets = lineData.getDataSets();
            dataSets.getClass();
            Iterator<T> it4 = dataSets.iterator();
            while (true) {
                if (it4.hasNext()) {
                    ILineDataSet iLineDataSet = (ILineDataSet) it4.next();
                    int entryCount = iLineDataSet.getEntryCount();
                    int i14 = 0;
                    while (true) {
                        if (i14 < entryCount) {
                            if (!eVar.contains(Float.valueOf(iLineDataSet.getEntryForIndex(i14).getX()))) {
                                i14++;
                            }
                        }
                    }
                } else {
                    List<T> dataSets2 = barData.getDataSets();
                    dataSets2.getClass();
                    Iterator<T> it5 = dataSets2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            IBarDataSet iBarDataSet = (IBarDataSet) it5.next();
                            int entryCount2 = iBarDataSet.getEntryCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < entryCount2) {
                                    if (!eVar.contains(Float.valueOf(((BarEntry) iBarDataSet.getEntryForIndex(i15)).getX()))) {
                                        i15++;
                                    }
                                }
                            }
                        } else {
                            List<T> dataSets3 = scatterData.getDataSets();
                            dataSets3.getClass();
                            Iterator<T> it6 = dataSets3.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    IScatterDataSet iScatterDataSet = (IScatterDataSet) it6.next();
                                    int entryCount3 = iScatterDataSet.getEntryCount();
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < entryCount3) {
                                            if (!eVar.contains(Float.valueOf(iScatterDataSet.getEntryForIndex(i16).getX()))) {
                                                i16++;
                                            }
                                        }
                                    }
                                } else {
                                    List<T> dataSets4 = candleData.getDataSets();
                                    dataSets4.getClass();
                                    Iterator<T> it7 = dataSets4.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            ICandleDataSet iCandleDataSet = (ICandleDataSet) it7.next();
                                            int entryCount4 = iCandleDataSet.getEntryCount();
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 < entryCount4) {
                                                    if (!eVar.contains(Float.valueOf(((CandleEntry) iCandleDataSet.getEntryForIndex(i17)).getX()))) {
                                                        i17++;
                                                    }
                                                }
                                            }
                                        } else {
                                            List<T> dataSets5 = bubbleData.getDataSets();
                                            dataSets5.getClass();
                                            Iterator<T> it8 = dataSets5.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) it8.next();
                                                    int entryCount5 = iBubbleDataSet.getEntryCount();
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 < entryCount5) {
                                                            if (!eVar.contains(Float.valueOf(((BubbleEntry) iBubbleDataSet.getEntryForIndex(i18)).getX()))) {
                                                                i18++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    customCombinedChart.setNoDataText(str);
                                                    customCombinedChart.setNoDataTextDescription(null);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                customCombinedChart.setNoDataText(null);
                customCombinedChart.setNoDataTextDescription(null);
            }
        }
        zz.e eVar2 = new zz.e(customCombinedChart);
        e eVar3 = this.f161315d;
        eVar2.f207540a = eVar3 != null ? eVar3.a() : null;
        customCombinedChart.setHighlighter(eVar2);
        ArrayList arrayListH = bVar.h();
        if (arrayListH != null) {
            DataRenderer renderer = customCombinedChart.getRenderer();
            renderer.getClass();
            ((c00.a) renderer).setSubRenderers(arrayListH);
        }
        customCombinedChart.invalidate();
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
        d00.a aVar;
        f00.c cVar;
        fz.a aVar2 = fz.a.f73959a;
        CustomCombinedChart customCombinedChart = this.f161312a;
        if (customCombinedChart != null) {
            customCombinedChart.setLayerType(1, null);
        }
        customCombinedChart.getDescription().setEnabled(false);
        b bVar = this.f161314c;
        Float f14 = bVar.getF173486i().f22350b;
        customCombinedChart.setExtraBottomOffset(f14 != null ? f14.floatValue() : 30.0f);
        Float f15 = bVar.getF173486i().f22349a;
        customCombinedChart.setExtraTopOffset(f15 != null ? f15.floatValue() : 80.0f);
        customCombinedChart.setDoubleTapToZoomEnabled(false);
        customCombinedChart.setScaleYEnabled(false);
        boolean z14 = this.f161318g;
        customCombinedChart.setScaleXEnabled(z14);
        customCombinedChart.getViewPortHandler().setMaximumScaleX(z14 ? 3.0f : 1.0f);
        customCombinedChart.setPinchZoom(false);
        customCombinedChart.setHardwareAccelerationEnabled(false);
        customCombinedChart.setHighlightPerDragEnabled(false);
        customCombinedChart.setHighlightPerTapEnabled(false);
        e eVar = this.f161315d;
        customCombinedChart.setMarker(eVar != null ? eVar.b() : null);
        h<f00.c> hVarG = bVar.g();
        if (hVarG != null && (cVar = (f00.c) hVarG.getF173486i()) != null) {
            cVar.f67650a = eVar != null ? eVar.c() : null;
            cVar.f67651b = eVar != null ? eVar.e() : null;
        }
        h<d00.a> hVarE = bVar.e();
        if (hVarE != null && (aVar = (d00.a) hVarE.getF173486i()) != null) {
            aVar.f56989a = eVar != null ? eVar.c() : null;
        }
        ArrayList arrayListH = bVar.h();
        if (arrayListH != null) {
            DataRenderer renderer = customCombinedChart.getRenderer();
            renderer.getClass();
            ((c00.a) renderer).setSubRenderers(arrayListH);
        }
        customCombinedChart.setOnChartGestureListener((eVar == null || (bVarF2 = eVar.getF203307b()) == null) ? null : bVarF2.a());
        customCombinedChart.setGetHighlightEntry(new b0(this, 13));
        customCombinedChart.setOnLongClickListener((eVar == null || (bVarF = eVar.getF203307b()) == null) ? null : bVarF.b());
        XAxis xAxis = customCombinedChart.getXAxis();
        xAxis.setDrawAxisLine(bVar.getF107016d().getF134913m());
        xAxis.setDrawGridLines(bVar.getF107016d().f80607k);
        xAxis.setDrawLabels(bVar.getF107016d().f80608l);
        xAxis.setGranularity(1.0f);
        xAxis.setTextSize(10.0f);
        xAxis.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(bVar.getF107016d().f80601e);
        xAxis.setLabelRotationAngle(bVar.getF107016d().f80604h);
        xAxis.setLabelCount(bVar.getF107016d().f80602f, bVar.getF107016d().f80603g);
        h00.b bVarB = bVar.getF107016d();
        Paint paintAxisLabels = bVarB.getPaintAxisLabels();
        paintAxisLabels.setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        bVarB.f80598b = paintAxisLabels;
        Paint paintAxisLabels2 = bVarB.getPaintAxisLabels();
        paintAxisLabels2.setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_mark));
        bVarB.f80599c = paintAxisLabels2;
        customCombinedChart.setXAxisRenderer(bVarB);
        xAxis.setYOffset(bVar.getF107016d().f80605i);
        customCombinedChart.setRendererLeftYAxis(bVar.getF107017e());
        YAxis axisLeft = customCombinedChart.getAxisLeft();
        axisLeft.setDrawAxisLine(bVar.getF107017e().getF134911i());
        axisLeft.setDrawGridLines(bVar.getF107017e().getF63193j());
        axisLeft.setDrawLabels(bVar.getF107017e().getF63192i());
        YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
        axisLeft.setPosition(yAxisLabelPosition);
        axisLeft.setLabelCount(bVar.getF107017e().f86715e, bVar.getF107017e().f86716f);
        axisLeft.setDrawLimitLinesBehindData(bVar.getF107017e().getF160005j());
        c<T, IBarLineScatterCandleBubbleDataSet<?>> cVar2 = this.f161313b;
        axisLeft.setAxisMinimum(cVar2.t(null));
        axisLeft.setAxisMaximum(cVar2.i(null));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        axisLeft.setGridColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_grid));
        axisLeft.setGridLineWidth(1.0f);
        axisLeft.setValueFormatter(bVar.getF107017e().getF63194k());
        axisLeft.setXOffset(bVar.getF107017e().f86717g);
        i00.b bVarA = bVar.getF157071f();
        if (bVarA != null) {
            customCombinedChart.setRendererRightYAxis(bVarA);
        }
        YAxis axisRight = customCombinedChart.getAxisRight();
        i00.b bVarA2 = bVar.getF157071f();
        axisRight.setDrawAxisLine(bVarA2 != null ? bVarA2.getF134911i() : false);
        axisRight.setDrawGridLines(false);
        i00.b bVarA3 = bVar.getF157071f();
        axisRight.setDrawLabels(bVarA3 != null ? bVarA3.getF63192i() : true);
        axisRight.setPosition(yAxisLabelPosition);
        i00.b bVarA4 = bVar.getF157071f();
        axisRight.setLabelCount(bVarA4 != null ? bVarA4.f86715e : 0, true);
        axisRight.setAxisMinimum(cVar2.m(null));
        axisRight.setAxisMaximum(cVar2.w(null));
        axisRight.setTextSize(10.0f);
        axisRight.setTextColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_text_label));
        axisRight.setTypeface(h22.a.a("font/roboto_regular.ttf", customCombinedChart.getContext()));
        axisRight.setGridColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_grid));
        axisRight.setGridLineWidth(1.0f);
        i00.b bVarA5 = bVar.getF157071f();
        axisRight.setValueFormatter(bVarA5 != null ? bVarA5.getF63194k() : null);
        i00.b bVarA6 = bVar.getF157071f();
        axisRight.setXOffset(bVarA6 != null ? bVarA6.f86717g : bVar.getF107017e().f86717g);
        customCombinedChart.getPaint(7).setColor(a7.b.getColor(customCombinedChart.getContext(), R.color.gcm_chart_mark));
        f fVar = this.f161316e;
        if (fVar == null || (legendB = fVar.b()) == null) {
            customCombinedChart.getF31342c().setEnabled(false);
        } else {
            customCombinedChart.setLegend(legendB);
        }
    }

    /* JADX INFO: renamed from: sz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsz/a$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "CHART_TEXT_SIZE", "DEFAULT_CHART_EXTRA_BOTTOM_OFFSET", "DEFAULT_CHART_EXTRA_TOP_OFFSET", "MAXIMUM_SCALE_X_LANDSCAPE_CHART", "MAXIMUM_SCALE_X_PORTRAIT_CHART", "Lcom/github/mikephil/charting/data/LineDataSet;", "EMPTY_LINE_DATA_SET", "Lcom/github/mikephil/charting/data/LineDataSet;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3044a {
        public /* synthetic */ C3044a(j jVar) {
            this();
        }

        private C3044a() {
        }
    }

    public /* synthetic */ a(CustomCombinedChart customCombinedChart, c cVar, b bVar, e eVar, f fVar, CustomLegendView customLegendView, int i14, j jVar) {
        this(customCombinedChart, cVar, bVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? null : customLegendView);
    }
}
