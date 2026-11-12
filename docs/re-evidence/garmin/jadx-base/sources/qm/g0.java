package qm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.listener.OnChartGestureListener;
import com.github.mikephil.chartingv2.renderer.YAxisRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lqm/g0;", "Lqm/e;", "Lcom/garmin/android/apps/connectmobile/activities/charts/c$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "chartData", "overlayChartData", "", "isFullscreen", "", "initialSelection", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;Z[I)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends e implements com.garmin.android.apps.connectmobile.activities.charts.c.b {
    public static final /* synthetic */ int C = 0;
    public final c A;
    public final b B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zm.p f145364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zm.p f145365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f145366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f145367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rm.b f145368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f145369r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gz.b f145370t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public mz.c f145371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LineData f145372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h0 f145373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f145374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FullscreenChartActivity f145375z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/g0$b", "Lcom/github/mikephil/chartingv2/listener/OnChartGestureListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements OnChartGestureListener {
        public b() {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            g0 g0Var = g0.this;
            FullscreenChartActivity fullscreenChartActivity = g0Var.f145375z;
            if (fullscreenChartActivity != null) {
                fullscreenChartActivity.n1();
            }
            LineChart lineChart = g0Var.f134442b;
            if (lineChart != null) {
                lineChart.setDrawMarkerViews(false);
            }
            LineChart lineChart2 = g0Var.f134442b;
            if (lineChart2 != null) {
                lineChart2.setHighlightPerDragEnabled(false);
            }
            LineChart lineChart3 = g0Var.f134442b;
            if (lineChart3 != null) {
                lineChart3.highlightValues(null);
            }
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
            g0 g0Var = g0.this;
            FullscreenChartActivity fullscreenChartActivity = g0Var.f145375z;
            if (fullscreenChartActivity != null) {
                fullscreenChartActivity.J7();
            }
            LineChart lineChart = g0Var.f134442b;
            if (lineChart != null) {
                lineChart.setDrawMarkerViews(true);
            }
            LineChart lineChart2 = g0Var.f134442b;
            if (lineChart2 != null) {
                lineChart2.setHighlightPerDragEnabled(true);
            }
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartSingleTapped(MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartTranslate(MotionEvent motionEvent, float f14, float f15) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/g0$c", "Lgz/c$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements gz.c.b {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:96:0x0188  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        @Override // gz.c.b
        public final void a(int i14) {
            ?? arrayList;
            ILineDataSet iLineDataSet;
            Float f14;
            Object next;
            g0 g0Var = g0.this;
            h0 h0Var = g0Var.f145373x;
            String strC = null;
            if (h0Var == null) {
                p005kotlin.jvm.internal.s.m("markerView");
                throw null;
            }
            List dataSets = g0Var.f145372w.getDataSets();
            if (dataSets != null) {
                ArrayList<ILineDataSet> arrayList2 = new ArrayList();
                for (Object obj : dataSets) {
                    ILineDataSet iLineDataSet2 = (ILineDataSet) obj;
                    if (!p005kotlin.jvm.internal.s.g(iLineDataSet2.getLabel(), "OVERLAY") && iLineDataSet2.isVisible()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList<Entry> arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                for (ILineDataSet iLineDataSet3 : arrayList2) {
                    iLineDataSet3.getClass();
                    arrayList3.add(g0.z(i14, (LineDataSet) iLineDataSet3));
                }
                arrayList = new ArrayList();
                for (Entry entry : arrayList3) {
                    Integer numValueOf = entry != null ? Integer.valueOf(MathKt.c(entry.getVal())) : null;
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            zm.p pVar = g0Var.f145365n;
            Context context = g0Var.f134441a;
            List dataSets2 = g0Var.f145372w.getDataSets();
            if (dataSets2 != null) {
                Iterator it = dataSets2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((ILineDataSet) next).getLabel(), "OVERLAY"));
                iLineDataSet = (ILineDataSet) next;
            } else {
                iLineDataSet = null;
            }
            LineDataSet lineDataSet = iLineDataSet instanceof LineDataSet ? (LineDataSet) iLineDataSet : null;
            if (lineDataSet != null) {
                Entry entryZ = g0.z(i14, lineDataSet);
                String strValueOf = String.valueOf(MathKt.c(entryZ != null ? entryZ.getVal() : 0.0f));
                if ((entryZ != null ? entryZ.getVal() : -1.0f) < 0.0f) {
                    strC = "";
                } else {
                    f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    Integer numValueOf2 = pVar != null ? Integer.valueOf(pVar.getB1()) : null;
                    if (numValueOf2 != null && numValueOf2.intValue() == 35) {
                        rm.a aVarU3 = pVar.U3();
                        float fFloatValue = (aVarU3 == null || (f14 = aVarU3.f153493g) == null) ? 0.0f : f14.floatValue();
                        String string = context.getString(lVar.y() ? R.string.lbl_meter : R.string.lbl_foot);
                        string.getClass();
                        strC = e5.g(String.valueOf(MathKt.b(((double) (fFloatValue - (entryZ != null ? entryZ.getVal() : 0.0f))) * (lVar.y() ? 1.0d : 3.2808399d))), StringUtils.SPACE, string);
                    } else if (numValueOf2 != null && numValueOf2.intValue() == 6) {
                        String string2 = context.getString(lVar.y() ? R.string.lbl_celsius : R.string.lbl_fahrenheit);
                        strC = zl.a.c(string2, strValueOf, StringUtils.SPACE, string2);
                    } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                        String string3 = context.getString(R.string.lbl_bpm);
                        strC = zl.a.c(string3, strValueOf, StringUtils.SPACE, string3);
                    } else {
                        strC = "";
                    }
                }
            }
            TextView textView = h0Var.A;
            h0Var.f145383y.getClass();
            textView.setText(mm.e.a(i14));
            if (strC != null) {
                h0Var.f145384z.setText(strC);
            }
            if (arrayList != 0) {
                if (arrayList.size() >= 1) {
                    h0Var.B.setText(String.valueOf(((Number) arrayList.get(0)).intValue()));
                }
                if (arrayList.size() >= 2) {
                    h0Var.C.setText(String.valueOf(((Number) arrayList.get(1)).intValue()));
                }
                if (arrayList.size() >= 3) {
                    h0Var.D.setText(String.valueOf(((Number) arrayList.get(2)).intValue()));
                }
                if (arrayList.size() >= 4) {
                    h0Var.E.setText(String.valueOf(((Number) arrayList.get(3)).intValue()));
                }
            }
        }

        @Override // gz.c.b
        public final void b(int i14, int i15) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f145378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LineChart f145379b;

        public d(View view2, LineChart lineChart) {
            this.f145378a = view2;
            this.f145379b = lineChart;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            this.f145378a.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            this.f145379b.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, zm.p pVar, zm.p pVar2, boolean z14, int[] iArr) {
        super(context, pVar);
        context.getClass();
        pVar.getClass();
        this.f145364m = pVar;
        this.f145365n = pVar2;
        this.f145366o = z14;
        this.f145367p = iArr;
        zm.p pVar3 = this.f145350e;
        im.c0 c0Var = pVar3 instanceof im.c0 ? (im.c0) pVar3 : null;
        this.f145368q = c0Var != null ? c0Var.X0 : null;
        this.f145369r = new ArrayList();
        this.f145370t = new gz.b();
        this.f145372w = new LineData();
        this.A = new c();
        this.B = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.github.mikephil.chartingv2.data.Entry] */
    public static Entry z(int i14, LineDataSet lineDataSet) {
        int entryCount = lineDataSet.getEntryCount();
        ?? r14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        while (i16 < entryCount) {
            ?? entryForIndex = lineDataSet.getEntryForIndex(i16);
            int xIndex = entryForIndex.getXIndex();
            int iAbs = Math.abs(xIndex - i14);
            if (xIndex == i14 && entryForIndex.getVal() >= 0.0f) {
                return entryForIndex;
            }
            if (iAbs < i15 && entryForIndex.getVal() >= 0.0f) {
                r14 = entryForIndex;
                i15 = iAbs;
            }
            i16++;
            r14 = r14;
        }
        return r14;
    }

    public final List<Integer> A() {
        Collection dataSets = this.f145372w.getDataSets();
        if (dataSets == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : dataSets) {
            ILineDataSet iLineDataSet = (ILineDataSet) obj;
            if (!p005kotlin.jvm.internal.s.g(iLineDataSet.getLabel(), "OVERLAY") && iLineDataSet.isVisible()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ILineDataSet) it.next()).getColor()));
        }
        return arrayList2;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.c.b
    public final void A6(Object obj, boolean z14) {
        if ((obj instanceof String ? (String) obj : null) != null) {
            ArrayList arrayList = this.f145369r;
            if (!z14) {
                arrayList.remove(obj);
            } else if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            C();
        }
    }

    public final void B(List<? extends ILineDataSet> list) {
        int[] iArrD = im.a.d(this.f134441a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        rm.b bVar = this.f145368q;
        LinkedHashMap linkedHashMap = bVar != null ? bVar.f153506a : null;
        if (linkedHashMap != null) {
            for (String str : linkedHashMap.keySet()) {
                int iF0 = p13.h0.f0(linkedHashMap.keySet(), str);
                if (list.get(iF0).isVisible()) {
                    arrayList.add(Integer.valueOf(iArrD[iF0]));
                    arrayList2.add(str);
                    arrayList3.add("line_with_circle");
                }
            }
        }
        gz.b bVar2 = this.f145370t;
        bVar2.setCustom(arrayList, arrayList2);
        mz.c cVar = this.f145371v;
        if (cVar != null) {
            String[] strArr = (String[]) arrayList3.toArray(new String[0]);
            strArr.getClass();
            cVar.f121614b = strArr;
        }
        LineChart lineChart = this.f134442b;
        Paint paint = lineChart != null ? lineChart.getPaint(7) : null;
        LineChart lineChart2 = this.f134442b;
        bVar2.calculateDimensions(paint, lineChart2 != null ? lineChart2.getViewPortHandler() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [im.c0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [oz.c, qm.e, qm.g0] */
    public final void C() {
        ?? arrayList;
        ?? r14;
        Double dValueOf;
        im.c0 c0Var;
        h0 h0Var;
        Collection dataSets = this.f145372w.getDataSets();
        if (dataSets != null) {
            ArrayList<ILineDataSet> arrayList2 = new ArrayList();
            for (Object obj : dataSets) {
                if (!p005kotlin.jvm.internal.s.g(((ILineDataSet) obj).getLabel(), "OVERLAY")) {
                    arrayList2.add(obj);
                }
            }
            for (ILineDataSet iLineDataSet : arrayList2) {
                iLineDataSet.setVisible(this.f145369r.contains(iLineDataSet.getLabel()));
            }
            B(arrayList2);
        }
        Collection dataSets2 = this.f145372w.getDataSets();
        if (dataSets2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : dataSets2) {
                ILineDataSet iLineDataSet2 = (ILineDataSet) obj2;
                if (iLineDataSet2.isVisible() && !p005kotlin.jvm.internal.s.g(iLineDataSet2.getLabel(), "OVERLAY")) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((ILineDataSet) it.next()).getLabel());
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        if (this.f145366o && (h0Var = this.f145373x) != null) {
            h0Var.setVisibleTanksCount(arrayList.size());
            h0 h0Var2 = this.f145373x;
            if (h0Var2 == null) {
                p005kotlin.jvm.internal.s.m("markerView");
                throw null;
            }
            h0Var2.setVisibleTankColors(A());
        }
        this.f145351f.removeAllLimitLines();
        zm.p pVar = this.f145350e;
        if (pVar instanceof im.c0) {
            c0Var = (im.c0) pVar;
        } else {
            r14 = 0;
        }
        if (r14 != 0) {
            r14 = c0Var;
            dValueOf = Double.valueOf(r14.A(arrayList));
        } else {
            r14 = c0Var;
            dValueOf = null;
        }
        if (dValueOf != null) {
            YAxis yAxis = this.f145351f;
            yAxis.getClass();
            i(yAxis, dValueOf.doubleValue(), false);
        }
        LineChart lineChart = this.f134442b;
        BaseLineChart baseLineChart = lineChart instanceof BaseLineChart ? (BaseLineChart) lineChart : null;
        if (baseLineChart != null) {
            baseLineChart.setShowNoDataTextOnTop(false);
        }
        LineChart lineChart2 = this.f134442b;
        BaseLineChart baseLineChart2 = lineChart2 instanceof BaseLineChart ? (BaseLineChart) lineChart2 : null;
        if (baseLineChart2 != null) {
            baseLineChart2.setNoDataText("");
        }
        LineChart lineChart3 = this.f134442b;
        if (lineChart3 != null) {
            lineChart3.invalidate();
        }
    }

    @Override // oz.c
    public final void e(YAxis yAxis, int i14) {
        yAxis.getClass();
        yAxis.setLabelCount(6, false);
        yAxis.setStartAtZero(true);
        yAxis.setTextColor(i14);
        yAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        yAxis.setDrawGridLines(false);
        yAxis.setDrawAxisLine(false);
    }

    @Override // oz.c
    public final int f() {
        int size;
        Collection dataSets = this.f145372w.getDataSets();
        if (dataSets != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : dataSets) {
                if (((ILineDataSet) obj).isVisible()) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        return (size <= 0 || this.f145365n != null) ? a7.b.getColor(this.f134441a, R.color.transparent) : super.f();
    }

    @Override // qm.e, oz.c
    @SuppressLint({"ClickableViewAccessibility"})
    public final void l(LineChart lineChart) throws Throwable {
        super.l(lineChart);
        LineChart lineChart2 = this.f134442b;
        this.f145351f = lineChart2 != null ? lineChart2.getAxisLeft() : null;
        LineChart lineChart3 = this.f134442b;
        this.f134443c = lineChart3 != null ? lineChart3.getXAxis() : null;
        YAxis yAxis = this.f145351f;
        yAxis.getClass();
        e(yAxis, this.f134444d);
        this.f145357l = 45;
        mz.a aVar = new mz.a(this.f134442b, p());
        LineChart lineChart4 = this.f134442b;
        if (lineChart4 != null) {
            lineChart4.setRenderer(aVar);
        }
        LineChart lineChart5 = this.f134442b;
        boolean z14 = this.f145366o;
        if (lineChart5 != null) {
            lineChart5.setTouchEnabled(z14);
        }
        Context context = this.f134441a;
        float fConvertPixelsToDp = Utils.convertPixelsToDp(context.getResources().getDimension(R.dimen.gcm3_chart_margin_right));
        LineChart lineChart6 = this.f134442b;
        if (lineChart6 != null) {
            lineChart6.setExtraLeftOffset(fConvertPixelsToDp);
        }
        if (z14) {
            h0 h0Var = new h0(context);
            this.f145373x = h0Var;
            LineChart lineChart7 = this.f134442b;
            if (lineChart7 != null) {
                lineChart7.setMarkerView(h0Var);
            }
            LineChart lineChart8 = this.f134442b;
            if (lineChart8 != null) {
                lineChart8.setOnChartGestureListener(this.B);
            }
            LineChart lineChart9 = this.f134442b;
            if (lineChart9 != null) {
                lineChart9.setHighlighter(new kz.a(lineChart9));
            }
            LineChart lineChart10 = this.f134442b;
            if (lineChart10 != null) {
                lineChart10.setDoubleTapToZoomEnabled(true);
            }
            LineChart lineChart11 = this.f134442b;
            if (lineChart11 != null) {
                lineChart11.setHighlightPerTapEnabled(false);
            }
            LineChart lineChart12 = this.f134442b;
            if (lineChart12 != null) {
                lineChart12.setHighlightPerDragEnabled(false);
            }
            h0 h0Var2 = this.f145373x;
            if (h0Var2 == null) {
                p005kotlin.jvm.internal.s.m("markerView");
                throw null;
            }
            zm.p pVar = this.f145365n;
            boolean z15 = pVar != null;
            h0Var2.f80366k = z15;
            h0Var2.f80365j = this.A;
            TextView textView = h0Var2.f80362g;
            if (textView != null) {
                textView.setVisibility(z15 ? 0 : 8);
            }
            h0 h0Var3 = this.f145373x;
            if (pVar != null) {
                if (h0Var3 == null) {
                    p005kotlin.jvm.internal.s.m("markerView");
                    throw null;
                }
                h0Var3.T.setVisibility(0);
                h0Var3.f145384z.setVisibility(0);
            } else {
                if (h0Var3 == null) {
                    p005kotlin.jvm.internal.s.m("markerView");
                    throw null;
                }
                h0Var3.T.setVisibility(8);
                h0Var3.f145384z.setVisibility(8);
            }
            LineChart lineChart13 = this.f134442b;
            if (lineChart13 != null) {
                a0 a0Var = new a0(lineChart13, 1);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                s0.d.c(lineChart13, a0Var);
                if (lineChart13.isAttachedToWindow()) {
                    lineChart13.requestApplyInsets();
                } else {
                    lineChart13.addOnAttachStateChangeListener(new d(lineChart13, lineChart13));
                }
            }
        }
        if (this.f145350e != null) {
            u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.github.mikephil.chartingv2.utils.ViewPortHandler] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart, com.github.mikephil.chartingv2.charts.Chart] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.github.mikephil.chartingv2.utils.Transformer] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r4v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v19, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4, types: [im.c0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.github.mikephil.chartingv2.utils.Transformer] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.github.mikephil.chartingv2.utils.ViewPortHandler] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.mikephil.chartingv2.components.AxisBase, com.github.mikephil.chartingv2.components.ComponentBase, com.github.mikephil.chartingv2.components.YAxis] */
    @Override // qm.e
    public final void u() throws Throwable {
        List listX;
        Throwable th3;
        Object next;
        ?? arrayList;
        ?? r14;
        ?? r15;
        YAxis axisRight;
        im.c0 c0Var;
        h0 h0Var;
        ArrayList<ILineDataSet> arrayList2;
        ?? arrayList3;
        List listB1;
        rm.b bVar = this.f145368q;
        LinkedHashMap linkedHashMap = bVar != null ? bVar.f153506a : null;
        Context context = this.f134441a;
        int[] iArrD = im.a.d(context);
        YAxis yAxis = this.f145351f;
        yAxis.getClass();
        e(yAxis, a7.b.getColor(context, R.color.white));
        ArrayList arrayList4 = new ArrayList();
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List list = (List) linkedHashMap.get((String) it.next());
                if (list != null) {
                    ArrayList arrayList5 = new ArrayList(p13.y.r(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Integer.valueOf(((Entry) it3.next()).getXIndex()));
                    }
                    listB1 = p13.h0.b1(arrayList5);
                    if (listB1 == null) {
                        listB1 = p13.j0.f134944a;
                    }
                } else {
                    listB1 = p13.j0.f134944a;
                }
                arrayList4.addAll(listB1);
            }
        }
        zm.p pVar = this.f145365n;
        if (pVar != null) {
            if (pVar.getB1() == 35) {
                rm.a aVarU3 = pVar.U3();
                if (aVarU3 != null) {
                    ArrayList arrayList6 = aVarU3.f153487a;
                    arrayList6.getClass();
                    arrayList3 = new ArrayList(p13.y.r(arrayList6, 10));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((Entry) it4.next()).getXIndex()));
                    }
                } else {
                    arrayList3 = p13.j0.f134944a;
                }
                arrayList4.addAll((Collection) arrayList3);
            } else {
                List<o20.a> listP = pVar.P(0);
                ArrayList arrayList7 = new ArrayList(p13.y.r(listP, 10));
                Iterator it5 = listP.iterator();
                while (it5.hasNext()) {
                    arrayList7.add(Integer.valueOf((int) ((o20.a) it5.next()).C()));
                }
                arrayList4.addAll(arrayList7);
            }
        }
        p13.c0.t(arrayList4);
        Integer num = (Integer) p13.h0.n0(arrayList4);
        ArrayList arrayList8 = new ArrayList();
        if (this.f145374y) {
            y(linkedHashMap, iArrD, arrayList8, num);
            listX = x(pVar, arrayList8);
        } else {
            listX = x(pVar, arrayList8);
            y(linkedHashMap, iArrD, arrayList8, num);
        }
        ArrayList arrayList9 = new ArrayList();
        Integer num2 = (Integer) p13.h0.t0(arrayList4);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) p13.h0.o0(arrayList4);
        int iIntValue2 = num3 != null ? num3.intValue() : 1;
        if (iIntValue <= iIntValue2) {
            while (true) {
                arrayList9.add(String.valueOf(iIntValue));
                if (iIntValue == iIntValue2) {
                    break;
                } else {
                    iIntValue++;
                }
            }
        }
        this.f145372w = new LineData(arrayList9, arrayList8);
        ArrayList arrayList10 = this.f145369r;
        if (pVar == null) {
            arrayList10.clear();
        } else {
            p13.d0.B(new qc.c(16), arrayList10);
        }
        int[] iArr = this.f145367p;
        LineData lineData = this.f145372w;
        if (iArr != null) {
            Collection dataSets = lineData.getDataSets();
            if (dataSets != null) {
                arrayList2 = new ArrayList();
                for (Object obj : dataSets) {
                    if (!p005kotlin.jvm.internal.s.g(((ILineDataSet) obj).getLabel(), "OVERLAY")) {
                        arrayList2.add(obj);
                    }
                }
                th3 = null;
            } else {
                th3 = null;
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                for (ILineDataSet iLineDataSet : arrayList2) {
                    int[] iArr2 = this.f145367p;
                    if (iArr2 != null && p13.u.x(iArr2, arrayList2.indexOf(iLineDataSet))) {
                        iLineDataSet.setVisible(true);
                        String label = iLineDataSet.getLabel();
                        label.getClass();
                        arrayList10.add(label);
                    }
                }
            }
        } else {
            th3 = null;
            Collection dataSets2 = lineData.getDataSets();
            if (dataSets2 != null) {
                Iterator it6 = dataSets2.iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (p005kotlin.jvm.internal.s.g(((ILineDataSet) next).getLabel(), "OVERLAY"));
                ILineDataSet iLineDataSet2 = (ILineDataSet) next;
                if (iLineDataSet2 != null) {
                    iLineDataSet2.setVisible(true);
                    String label2 = iLineDataSet2.getLabel();
                    label2.getClass();
                    arrayList10.add(label2);
                }
            }
        }
        Collection dataSets3 = this.f145372w.getDataSets();
        if (dataSets3 != null) {
            ArrayList arrayList11 = new ArrayList();
            for (Object obj2 : dataSets3) {
                ILineDataSet iLineDataSet3 = (ILineDataSet) obj2;
                if (iLineDataSet3.isVisible() && !p005kotlin.jvm.internal.s.g(iLineDataSet3.getLabel(), "OVERLAY")) {
                    arrayList11.add(obj2);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList11, 10));
            Iterator it7 = arrayList11.iterator();
            while (it7.hasNext()) {
                arrayList.add(((ILineDataSet) it7.next()).getLabel());
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        if (this.f145366o && (h0Var = this.f145373x) != null) {
            h0Var.setVisibleTanksCount(arrayList.size());
            h0 h0Var2 = this.f145373x;
            if (h0Var2 == null) {
                p005kotlin.jvm.internal.s.m("markerView");
                throw th3;
            }
            h0Var2.setVisibleTankColors(A());
        }
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            lineChart.setNoDataText(context.getString(R.string.activity_details_diving_select_one));
        }
        XAxis xAxis = this.f134443c;
        if (xAxis != null) {
            xAxis.setValues(arrayList9);
        }
        double d14 = bVar != null ? bVar.f153509d : 0.0d;
        double d15 = bVar != null ? bVar.f153508c : 1.0d;
        zm.p pVar2 = this.f145350e;
        if (pVar2 instanceof im.c0) {
            c0Var = (im.c0) pVar2;
        } else {
            r14 = th3;
        }
        ?? ValueOf = r14 != 0 ? Double.valueOf(r14.A(arrayList10)) : th3;
        if (ValueOf != 0) {
            r14 = c0Var;
            r14 = c0Var;
            double[] dArrM = m(d14, d15, ValueOf.doubleValue());
            YAxis yAxis2 = this.f145351f;
            yAxis2.getClass();
            i(yAxis2, ValueOf.doubleValue(), false);
            v(dArrM);
            this.f145351f.setValueFormatter(new q6.f(14));
        }
        r14 = c0Var;
        r14 = c0Var;
        if (listX == null) {
            g();
        } else {
            final boolean z14 = pVar != null && pVar.getB1() == 35;
            ArrayList arrayList12 = new ArrayList(p13.y.r(listX, 10));
            Iterator it8 = listX.iterator();
            while (it8.hasNext()) {
                arrayList12.add(Float.valueOf(((Entry) it8.next()).getVal()));
            }
            Float fV0 = p13.h0.v0(arrayList12);
            double dFloatValue = fV0 != null ? fV0.floatValue() : 0.0d;
            ArrayList arrayList13 = new ArrayList(p13.y.r(listX, 10));
            Iterator it9 = listX.iterator();
            while (it9.hasNext()) {
                arrayList13.add(Float.valueOf(((Entry) it9.next()).getVal()));
            }
            Float fQ0 = p13.h0.q0(arrayList13);
            double dFloatValue2 = fQ0 != null ? fQ0.floatValue() : 1.0d;
            ArrayList arrayList14 = new ArrayList(p13.y.r(listX, 10));
            Iterator it10 = listX.iterator();
            while (it10.hasNext()) {
                arrayList14.add(Float.valueOf(((Entry) it10.next()).getVal()));
            }
            double dO = p13.h0.O(arrayList14);
            LineChart lineChart2 = this.f134442b;
            if (lineChart2 != null) {
                axisRight = lineChart2.getAxisRight();
            } else {
                r15 = th3;
            }
            if (r15 != 0) {
                r15 = axisRight;
                r15.setEnabled(true);
            }
            r15 = axisRight;
            double[] dArrM2 = m(dFloatValue, dFloatValue2, dO);
            final float f14 = (float) dArrM2[dArrM2.length - 1];
            float f15 = (float) dArrM2[0];
            if (r15 != 0) {
                r15.setDrawLabels(true);
            }
            LineChart lineChart3 = this.f134442b;
            if (lineChart3 != null) {
                ViewPortHandler viewPortHandler = lineChart3.getViewPortHandler();
                LineChart lineChart4 = this.f134442b;
                lineChart3.setRendererRightYAxis(new YAxisRenderer(viewPortHandler, r15, lineChart4 != null ? lineChart4.getTransformer(YAxis.AxisDependency.RIGHT) : th3));
            }
            if (r15 != 0) {
                r15.setAxisLineColor(a7.b.getColor(context, R.color.transparent));
            }
            if (r15 != 0) {
                r15.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
            }
            if (r15 != 0) {
                r15.setLabelCount(6, true);
            }
            if (r15 != 0) {
                r15.setDrawGridLines(false);
            }
            if (r15 != 0) {
                r15.setValueFormatter(new YAxisValueFormatter() { // from class: qm.f0
                    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
                    public final String getFormattedValue(float f16, YAxis yAxis3) {
                        int i14 = g0.C;
                        if (!z14) {
                            return String.valueOf(MathKt.c(f16));
                        }
                        return String.valueOf(MathKt.b(((double) (f14 - f16)) * (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? 1.0d : 3.2808399d)));
                    }
                });
            }
            if (r15 != 0) {
                r15.setAxisMaxValue(f14);
            }
            if (r15 != 0) {
                r15.setAxisMinValue(f15);
            }
        }
        XAxis xAxis2 = this.f134443c;
        if (xAxis2 != null) {
            xAxis2.setDrawLabels(true);
        }
        XAxis xAxis3 = this.f134443c;
        if (xAxis3 != null) {
            xAxis3.setPosition(XAxis.XAxisPosition.BOTTOM);
        }
        XAxis xAxis4 = this.f134443c;
        if (xAxis4 != null) {
            xAxis4.setTextSize(10.0f);
        }
        LineChart lineChart5 = this.f134442b;
        if (lineChart5 != null) {
            LineChart lineChart6 = this.f134442b;
            ?? viewPortHandler2 = lineChart6 != null ? lineChart6.getViewPortHandler() : th3;
            XAxis xAxis5 = this.f134443c;
            LineChart lineChart7 = this.f134442b;
            lineChart5.setXAxisRenderer(new mz.f((ViewPortHandler) viewPortHandler2, xAxis5, (Transformer) (lineChart7 != null ? lineChart7.getTransformer(YAxis.AxisDependency.LEFT) : th3), 2, 0, 9));
        }
        XAxis xAxis6 = this.f134443c;
        if (xAxis6 != null) {
            xAxis6.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        }
        XAxis xAxis7 = this.f134443c;
        if (xAxis7 != null) {
            xAxis7.setValueFormatter(new q6.f(15));
        }
        XAxis xAxis8 = this.f134443c;
        if (xAxis8 != null) {
            xAxis8.setDrawGridLines(false);
        }
        LineChart lineChart8 = this.f134442b;
        ?? r16 = lineChart8 instanceof BaseLineChart ? (BaseLineChart) lineChart8 : th3;
        gz.b bVar2 = this.f145370t;
        bVar2.setFormSize(11.0f);
        bVar2.setTextSize(12.0f);
        bVar2.setFormToTextSpace(10.0f);
        bVar2.setXEntrySpace(25.0f);
        bVar2.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        bVar2.setTypeface(h22.a.a(h22.b.a(bVar2.getTypeface()), context));
        mz.c cVar = new mz.c(r16 != 0 ? r16.getViewPortHandler() : th3, bVar2, context);
        this.f145371v = cVar;
        if (r16 != 0) {
            r16.a(bVar2, cVar);
        }
        List<? extends ILineDataSet> dataSets4 = this.f145372w.getDataSets();
        dataSets4.getClass();
        B(dataSets4);
        j(this.f145372w);
    }

    public final hz.h w(String str, List<? extends Entry> list, int i14, YAxis.AxisDependency axisDependency) {
        if (list == null) {
            list = p13.j0.f134944a;
        }
        hz.h hVar = new hz.h(list, str);
        hVar.setHighLightColor(a7.b.getColor(this.f134441a, R.color.gcm_chart_highlight_line));
        hVar.setHighlightEnabled(this.f145366o);
        hVar.setHighlightLineWidth(1.0f);
        hVar.setFillColor(i14);
        hVar.setColor(i14);
        hVar.setDrawFilled(false);
        hVar.setDrawCircles(false);
        hVar.setLineWidth(1.5f);
        hVar.setDrawValues(false);
        hVar.setVisible(p005kotlin.jvm.internal.s.g(str, "OVERLAY"));
        hVar.setAxisDependency(axisDependency);
        return hVar;
    }

    public final List x(zm.p pVar, ArrayList arrayList) {
        List<? extends Entry> arrayList2;
        if (pVar == null) {
            return null;
        }
        if (pVar.getB1() == 35) {
            arrayList2 = new ArrayList<>();
            zm.p pVar2 = this.f145365n;
            rm.a aVarU3 = pVar2 != null ? pVar2.U3() : null;
            if (aVarU3 != null && (arrayList2 = aVarU3.f153487a) == null) {
                arrayList2 = p13.j0.f134944a;
            }
        } else {
            List<o20.a> listP = pVar.P(0);
            ArrayList arrayList3 = new ArrayList();
            for (o20.a aVar : listP) {
                arrayList3.add(new Entry((float) aVar.D(), (int) aVar.C()));
            }
            arrayList2 = arrayList3;
        }
        arrayList.add(w("OVERLAY", arrayList2, a7.b.getColor(this.f134441a, R.color.palette_gray_4), YAxis.AxisDependency.RIGHT));
        return arrayList2;
    }

    public final void y(LinkedHashMap linkedHashMap, int[] iArr, ArrayList arrayList, Integer num) {
        if (linkedHashMap != null) {
            for (String str : linkedHashMap.keySet()) {
                List list = (List) linkedHashMap.get(str);
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                int iIntValue = num != null ? num.intValue() : 0;
                if (this.f145365n == null) {
                    Entry entry = arrayList2 != null ? (Entry) p13.h0.n0(arrayList2) : null;
                    if (entry != null && entry.getXIndex() < iIntValue) {
                        arrayList2.add(new Entry(entry.getVal(), iIntValue));
                    }
                }
                arrayList.add(w(str, arrayList2, iArr[p13.h0.f0(linkedHashMap.keySet(), str)], YAxis.AxisDependency.LEFT));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm/g0$a;", "", "<init>", "()V", "", "OVERLAY_LABEL", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
