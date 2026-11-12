package zm;

import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BaseEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lzm/z;", "Lzm/q;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "chartData", "overlayChartData", "Lqm/j;", "chartStyle", "<init>", "(Landroidx/fragment/app/m;Lzm/p;Lzm/p;Lqm/j;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f205267p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.m f205268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f205269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f205270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qm.j f205271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f205272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OverlayCombinedChart f205273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f12.l f205274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f205275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f205276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f205277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f205278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f205279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public um.a f205280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final im.g f205281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f205282o;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f205283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OverlayCombinedChart f205284b;

        public b(View view2, OverlayCombinedChart overlayCombinedChart) {
            this.f205283a = view2;
            this.f205284b = overlayCombinedChart;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            this.f205283a.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            this.f205284b.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zm/z$c", "Lum/d;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements um.d {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00de  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // um.d
        public final void a(float f14) {
            zz.l lVar;
            um.a aVar;
            String strE;
            z zVar = z.this;
            OverlayCombinedChart overlayCombinedChart = zVar.f205273f;
            im.g gVar = zVar.f205281n;
            p pVar = zVar.f205269b;
            p pVar2 = zVar.f205270c;
            if (overlayCombinedChart == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            List<T> entriesForXValue = ((IBarLineScatterCandleBubbleDataSet) ((CombinedData) overlayCombinedChart.getData()).getDataSetByIndex(0)).getEntriesForXValue(f14);
            entriesForXValue.getClass();
            zz.l lVar2 = (entriesForXValue.isEmpty() || (strE = z.e(zVar, ((Entry) com.airbnb.lottie.animation.keyframe.a.c(1, entriesForXValue)).getY(), pVar)) == null) ? null : new zz.l(null, strE, null, null, null, im.g.b(gVar, Float.valueOf(f14), Integer.valueOf(pVar.getB1()), null, pVar.K(), 4), null, null, 221, null);
            if (pVar2 == null) {
                lVar = null;
            } else {
                OverlayCombinedChart overlayCombinedChart2 = zVar.f205273f;
                if (overlayCombinedChart2 == null) {
                    p005kotlin.jvm.internal.s.m("chart");
                    throw null;
                }
                if (((CombinedData) overlayCombinedChart2.getData()).getDataSetCount() <= 1) {
                    lVar = null;
                } else {
                    OverlayCombinedChart overlayCombinedChart3 = zVar.f205273f;
                    if (overlayCombinedChart3 == null) {
                        p005kotlin.jvm.internal.s.m("chart");
                        throw null;
                    }
                    List<T> entriesForXValue2 = ((IBarLineScatterCandleBubbleDataSet) ((CombinedData) overlayCombinedChart3.getData()).getDataSetByIndex(1)).getEntriesForXValue(f14);
                    entriesForXValue2.getClass();
                    if (entriesForXValue2.isEmpty()) {
                        lVar = null;
                    } else {
                        Entry entry = (Entry) com.airbnb.lottie.animation.keyframe.a.c(1, entriesForXValue2);
                        if (z.e(zVar, entry.getY(), pVar2) != null) {
                            lVar = new zz.l(null, z.e(zVar, entry.getY(), pVar2), null, null, null, im.g.b(gVar, Float.valueOf(f14), Integer.valueOf(pVar2.getB1()), null, pVar2.K(), 4), null, null, 221, null);
                        } else {
                            lVar = null;
                        }
                    }
                }
            }
            ArrayList arrayListC = p13.u.C(new zz.l[]{lVar2, lVar});
            ArrayList arrayList = arrayListC.isEmpty() ? null : arrayListC;
            if (arrayList == null || (aVar = zVar.f205280m) == null) {
                return;
            }
            aVar.b(new yz.j().getFormattedValue(f14), arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
        @Override // um.d
        public final void b(float f14, float f15) {
            String string;
            z zVar = z.this;
            OverlayCombinedChart overlayCombinedChart = zVar.f205273f;
            androidx.fragment.app.m mVar = zVar.f205268a;
            p pVar = zVar.f205269b;
            if (overlayCombinedChart == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            int i14 = 0;
            T dataSetByIndex = ((CombinedData) overlayCombinedChart.getData()).getDataSetByIndex(0);
            dataSetByIndex.getClass();
            IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) dataSetByIndex;
            Entry entry = (Entry) com.airbnb.lottie.animation.keyframe.a.c(1, iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f14));
            String formattedValue = new yz.j().getFormattedValue(entry.getX());
            Entry entry2 = (Entry) com.airbnb.lottie.animation.keyframe.a.c(1, iBarLineScatterCandleBubbleDataSet.getEntriesForXValue(f15));
            String string2 = mVar.getString(R.string.string_line_string_pattern, formattedValue, new yz.j().getFormattedValue(entry2.getX()));
            string2.getClass();
            int b14 = pVar.getB1();
            if (p13.x.k(1, 68, 69, 67).contains(Integer.valueOf(b14))) {
                string = z.e(zVar, entry.getY() - entry2.getY(), pVar);
            } else {
                int entryIndex = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entry);
                int entryIndex2 = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entry2);
                float y14 = 0.0f;
                if (entryIndex <= entryIndex2) {
                    while (true) {
                        ?? entryForIndex = iBarLineScatterCandleBubbleDataSet.getEntryForIndex(entryIndex);
                        if (entryForIndex != 0 && entryForIndex.getY() > 0.0f) {
                            y14 += entryForIndex.getY();
                            i14++;
                        }
                        if (entryIndex == entryIndex2) {
                            break;
                        } else {
                            entryIndex++;
                        }
                    }
                }
                float f16 = i14 > 0 ? y14 / i14 : 0.0f;
                String string3 = mVar.getResources().getString(R.string.sleep_lbl_average_prefix);
                string3.getClass();
                string = mVar.getString(R.string.string_space_string_pattern, z.e(zVar, f16, pVar), string3);
            }
            String str = string;
            im.g gVar = zVar.f205281n;
            Integer numValueOf = Integer.valueOf(b14);
            List<r1> listK = pVar.K();
            int i15 = im.g.f94146b;
            zz.l lVar = new zz.l(null, str, null, null, null, gVar.c(entry, numValueOf, null, listK), null, null, 217, null);
            um.a aVar = zVar.f205280m;
            if (aVar != null) {
                aVar.b(string2, p13.w.c(lVar));
            }
        }
    }

    static {
        new a(null);
    }

    public z(androidx.fragment.app.m mVar, p pVar, p pVar2, qm.j jVar) {
        List<o20.a> listP;
        mVar.getClass();
        pVar.getClass();
        jVar.getClass();
        this.f205268a = mVar;
        this.f205269b = pVar;
        this.f205270c = pVar2;
        this.f205271d = jVar;
        this.f205272e = new Path();
        this.f205274g = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        this.f205277j = a7.b.getColor(mVar, R.color.gcm_chart_text_label);
        this.f205278k = a7.b.getColor(mVar, R.color.gcm_chart_highlight_line);
        boolean z14 = false;
        if (pVar2 != null && (listP = pVar2.P(0)) != null && (!listP.isEmpty())) {
            z14 = true;
        }
        this.f205279l = z14;
        this.f205281n = new im.g(new l22.a(mVar));
        this.f205282o = new c();
    }

    public static final String e(z zVar, float f14, p pVar) {
        zVar.getClass();
        androidx.fragment.app.m mVar = zVar.f205268a;
        if (pVar.getB1() == 1 || pVar.getB1() == 68) {
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            l3.a aVar = l3.f23124b;
            double dAbs = Math.abs(f14);
            boolean zY = lVar.y();
            aVar.getClass();
            String strR0 = aVar.r0(mVar, dAbs, zY, false, "");
            if (!d53.w.J(strR0)) {
                if (f14 < 0.0f) {
                    strR0 = "- ".concat(strR0);
                }
                return mVar.getString(R.string.string_space_string_pattern, strR0, pVar.k4());
            }
        } else {
            l3.f23124b.getClass();
            String strB = l3.a.B(f14);
            if (!d53.w.J(strB)) {
                return strB;
            }
        }
        return null;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.f205276i = linearLayout;
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.f205275h = linearLayout;
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        LineDataSet lineDataSet;
        int i14;
        androidx.fragment.app.m mVar = this.f205268a;
        View viewInflate = LayoutInflater.from(mVar).inflate(R.layout.gcm3_overlay_combined_chart_view, viewGroup, false);
        OverlayCombinedChart overlayCombinedChart = (OverlayCombinedChart) viewInflate.findViewById(R.id.combined_chart_view);
        if (overlayCombinedChart != null) {
            zm.a aVar = new zm.a(overlayCombinedChart, 1);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(overlayCombinedChart, aVar);
            if (overlayCombinedChart.isAttachedToWindow()) {
                overlayCombinedChart.requestApplyInsets();
            } else {
                overlayCombinedChart.addOnAttachStateChangeListener(new b(overlayCombinedChart, overlayCombinedChart));
            }
        }
        qm.t.c(overlayCombinedChart);
        int i15 = this.f205277j;
        p pVar = this.f205270c;
        p pVar2 = this.f205269b;
        if (overlayCombinedChart != null) {
            overlayCombinedChart.getDescription().setEnabled(false);
            overlayCombinedChart.getF31342c().setEnabled(false);
            overlayCombinedChart.setTouchEnabled(true);
            qm.j jVar = this.f205271d;
            overlayCombinedChart.setPinchZoom(jVar.f145392b);
            overlayCombinedChart.setDrawGridBackground(false);
            overlayCombinedChart.setScaleYEnabled(jVar.f145393c);
            overlayCombinedChart.setExtraBottomOffset(Utils.convertPixelsToDp(overlayCombinedChart.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_bottom_large)));
            boolean zY = this.f205274g.y();
            ValueFormatter valueFormatterA = c22.v.a(pVar2.getF113514x1(), zY ? m3.METER : m3.YARD);
            XAxis xAxis = overlayCombinedChart.getXAxis();
            xAxis.setValueFormatter(valueFormatterA);
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(i15);
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setAxisLineColor(i15);
            xAxis.setTextSize(10.0f);
            xAxis.setLabelCount(10);
            YAxis axisRight = overlayCombinedChart.getAxisRight();
            axisRight.setDrawGridLines(false);
            axisRight.setDrawAxisLine(false);
            if (pVar != null) {
                YAxis axisLeft = overlayCombinedChart.getAxisLeft();
                if (axisLeft != null) {
                    axisLeft.removeAllLimitLines();
                }
                axisRight.setTextColor(a7.b.getColor(overlayCombinedChart.getContext(), im.a.a(pVar.getB1())[1]));
                axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                axisRight.setLabelCount(6, true);
            } else {
                axisRight.setDrawLabels(false);
            }
            YAxis axisLeft2 = overlayCombinedChart.getAxisLeft();
            axisLeft2.setDrawGridLines(false);
            axisLeft2.setDrawAxisLine(false);
            axisLeft2.setTextColor(i15);
            axisLeft2.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisLeft2.setLabelCount(6, true);
            LimitLine limitLine = new LimitLine((float) pVar2.getF113499i1(), "");
            limitLine.setLineColor(a7.b.getColor(mVar, R.color.gcm_chart_avg_line));
            limitLine.setLineWidth(mVar.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2);
            axisLeft2.addLimitLine(limitLine);
            ViewPortHandler viewPortHandler = overlayCombinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            XAxis xAxis2 = overlayCombinedChart.getXAxis();
            xAxis2.getClass();
            Transformer transformer = overlayCombinedChart.getTransformer(YAxis.AxisDependency.LEFT);
            transformer.getClass();
            overlayCombinedChart.setXAxisRenderer(new h00.j(viewPortHandler, xAxis2, transformer, pVar2.getF113514x1(), zY, h00.g.MULTIPLE_OF_10));
            this.f205273f = overlayCombinedChart;
        }
        LineData lineData = new LineData();
        boolean zContains = p13.x.k(1, 68, 69, 67).contains(Integer.valueOf(pVar2.getB1()));
        LineDataSet lineDataSet2 = new LineDataSet(ar.e.d(pVar2.P(0)), "");
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setCircleRadius(0.0f);
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet2.setHighlightLineWidth(1.0f);
        int i16 = this.f205278k;
        lineDataSet2.setHighLightColor(i16);
        lineDataSet2.setCircleColor(i16);
        lineDataSet2.setDrawHorizontalHighlightIndicator(false);
        if (zContains) {
            lineDataSet2.setFillFormatter(new xw.b(this, 11));
        }
        lineDataSet2.setMode(k.e(pVar2) ? LineDataSet.Mode.STEPPED : LineDataSet.Mode.LINEAR);
        int[] iArrA = im.a.a(pVar2.getB1());
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{a7.b.getColor(mVar, iArrA[0]), a7.b.getColor(mVar, iArrA[1])});
        gradientDrawable.setAlpha(pVar != null ? 127 : 255);
        lineDataSet2.setFillDrawable(gradientDrawable);
        lineDataSet2.setColor(a7.b.getColor(mVar, R.color.gcm3_transparent));
        lineDataSet2.setDrawFilled(true);
        double[] dArrA = k.a(lineDataSet2.getYMin(), lineDataSet2.getYMax(), pVar2, 4, mVar.getResources().getConfiguration().orientation == 2, false, 32);
        OverlayCombinedChart overlayCombinedChart2 = this.f205273f;
        if (overlayCombinedChart2 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        YAxis axisLeft3 = overlayCombinedChart2.getAxisLeft();
        axisLeft3.getClass();
        k.h(mVar, axisLeft3, dArrA, pVar2, null);
        OverlayCombinedChart overlayCombinedChart3 = this.f205273f;
        if (overlayCombinedChart3 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        k.f(overlayCombinedChart3, pVar2.getB1());
        lineData.addDataSet(lineDataSet2);
        if (pVar == null) {
            lineDataSet = null;
        } else {
            int b14 = pVar.getB1();
            lineDataSet = new LineDataSet(ar.e.d(pVar.P(0)), "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setCircleRadius(0.0f);
            lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
            lineDataSet.setHighlightLineWidth(1.0f);
            lineDataSet.setHighLightColor(i16);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setCircleColor(i16);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setColor(a7.b.getColor(mVar, im.a.a(b14)[1]));
            lineDataSet.setDrawFilled(false);
            double[] dArrA2 = k.a(lineDataSet.getYMin(), lineDataSet.getYMax(), this.f205270c, 4, mVar.getResources().getConfiguration().orientation == 2, false, 32);
            OverlayCombinedChart overlayCombinedChart4 = this.f205273f;
            if (overlayCombinedChart4 == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            YAxis axisRight2 = overlayCombinedChart4.getAxisRight();
            axisRight2.getClass();
            k.h(mVar, axisRight2, dArrA2, pVar, null);
        }
        lineData.addDataSet(lineDataSet);
        CombinedData combinedData = new CombinedData();
        combinedData.setData(lineData);
        OverlayCombinedChart overlayCombinedChart5 = this.f205273f;
        if (overlayCombinedChart5 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        overlayCombinedChart5.setData(combinedData);
        OverlayCombinedChart overlayCombinedChart6 = this.f205273f;
        if (overlayCombinedChart6 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        ChartAnimator animator = overlayCombinedChart6.getAnimator();
        OverlayCombinedChart overlayCombinedChart7 = this.f205273f;
        if (overlayCombinedChart7 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        c0 c0Var = new c0(this, overlayCombinedChart6, animator, overlayCombinedChart7.getViewPortHandler(), new d0());
        OverlayCombinedChart overlayCombinedChart8 = this.f205273f;
        if (overlayCombinedChart8 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        DataRenderer renderer = overlayCombinedChart8.getRenderer();
        renderer.getClass();
        ((CombinedChartRenderer) renderer).setSubRenderers(p13.w.c(c0Var));
        OverlayCombinedChart overlayCombinedChart9 = this.f205273f;
        if (overlayCombinedChart9 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        um.a aVar2 = new um.a(mVar, R.layout.chart_highlight_dynamic_metrics_view, true);
        this.f205280m = aVar2;
        c cVar = this.f205282o;
        boolean z14 = this.f205279l;
        aVar2.a(z14, cVar);
        overlayCombinedChart9.setMarker(this.f205280m);
        overlayCombinedChart9.setHighlighter(new zz.h(overlayCombinedChart9));
        overlayCombinedChart9.setHighlightPerDragEnabled(false);
        overlayCombinedChart9.setHighlightPerTapEnabled(false);
        overlayCombinedChart9.setDoubleTapToZoomEnabled(true);
        overlayCombinedChart9.setOnChartGestureListener(new s(overlayCombinedChart9));
        t.b(overlayCombinedChart9, new a0(this), new b0(this), !z14, this.f205280m);
        um.a aVar3 = this.f205280m;
        if (aVar3 != null) {
            OverlayCombinedChart overlayCombinedChart10 = this.f205273f;
            if (overlayCombinedChart10 == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            float axisLineWidth = overlayCombinedChart10.getAxisLeft().getAxisLineWidth();
            OverlayCombinedChart overlayCombinedChart11 = this.f205273f;
            if (overlayCombinedChart11 == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            aVar3.setOffset(axisLineWidth, overlayCombinedChart11.getAxisRight().getAxisLineWidth());
        }
        OverlayCombinedChart overlayCombinedChart12 = this.f205273f;
        if (overlayCombinedChart12 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        overlayCombinedChart12.invalidate();
        TextView textViewA = qm.t.a(mVar, i15, i15, pVar2.getF113500j1());
        LinearLayout linearLayout = this.f205275h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            i14 = 0;
            linearLayout.setVisibility(0);
        } else {
            i14 = 0;
        }
        LinearLayout linearLayout2 = this.f205276i;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
            linearLayout2.setVisibility(i14);
            linearLayout2.addView(textViewA);
        }
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Highlight f(float f14, int i14) {
        OverlayCombinedChart overlayCombinedChart = this.f205273f;
        Highlight highlight = null;
        if (overlayCombinedChart == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        List<T> entriesForXValue = ((IBarLineScatterCandleBubbleDataSet) ((CombinedData) overlayCombinedChart.getData()).getDataSetByIndex(i14)).getEntriesForXValue(f14);
        if (entriesForXValue.size() == 1) {
            highlight = new Highlight(((Entry) entriesForXValue.get(0)).getX(), ((BaseEntry) entriesForXValue.get(0)).getY(), i14);
        } else if (entriesForXValue.size() == 2) {
            highlight = new Highlight(((Entry) entriesForXValue.get(1)).getX(), ((BaseEntry) entriesForXValue.get(1)).getY(), i14);
        }
        if (highlight != null) {
            highlight.setDataIndex(0);
        }
        return highlight;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lzm/z$a;", "", "<init>", "()V", "", "Y_LABELS_FOUR", "I", "Y_LABEL_COUNT", "X_LABEL_COUNT", "", "NO_CIRCLE_RADIUS", "F", "X_AXIS_TEXT_SIZE", "DEFAULT_LINE_WIDTH", "ALPHA_HALF_TRANSPARENT_COLOR", "ALPHA_FULL_COLOR", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
