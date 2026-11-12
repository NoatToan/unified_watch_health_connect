package bm;

import am.r1;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.d1;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityChartFullScreenActivity;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class q extends qm.e {
    public static final /* synthetic */ int D = 0;
    public final a0.c A;
    public final b B;
    public final c C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<o20.a> f18851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MotionEvent f18853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gz.c f18854r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f18855t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fz.c f18856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f18857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x f18858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f18859y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f18860z;

    public class a implements gz.c.b {
        public a() {
        }

        @Override // gz.c.b
        public final void a(int i14) {
            String strB;
            int i15 = q.D;
            q qVar = q.this;
            LineChart lineChart = qVar.f134442b;
            if (lineChart != null) {
                lineChart.highlightValues(new Highlight[]{new Highlight(i14, 0)});
                List<Entry> entriesAtIndex = qVar.f134442b.getEntriesAtIndex(i14);
                if (entriesAtIndex != null) {
                    d dVar = qVar.f18855t;
                    float val = entriesAtIndex.get(0).getVal();
                    dVar.getClass();
                    strB = dVar.b(val);
                } else {
                    strB = null;
                }
                String strC = qVar.f18855t.c(i14);
                gz.c cVar = qVar.f18854r;
                cVar.setValueLabel(strB);
                cVar.setOverlayValueLabel(null);
                cVar.setTimeLabel(strC);
            }
        }

        @Override // gz.c.b
        public final void b(int i14, int i15) {
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view2, MotionEvent motionEvent) {
            q qVar = q.this;
            qVar.f18853q = motionEvent;
            a0.c cVar = qVar.A;
            Handler handler = qVar.f18860z;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 2) {
                handler.postDelayed(cVar, 500L);
            }
            if (actionMasked == 6 || actionMasked == 1) {
                handler.removeCallbacks(cVar);
                LineChart lineChart = qVar.f134442b;
                if (lineChart != null) {
                    lineChart.setDragEnabled(true);
                    qVar.f134442b.setScaleEnabled(true);
                    qVar.f134442b.highlightValues(null);
                    qVar.f134442b.setHighlightPerDragEnabled(false);
                }
            }
            return false;
        }
    }

    public class c extends lz.a {
        public c() {
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            LineChart lineChart;
            q qVar = q.this;
            if (!qVar.f18857w || (lineChart = qVar.f134442b) == null) {
                return;
            }
            if (qVar.f18852p) {
                qVar.f18852p = false;
                lineChart.fitScreen();
            } else {
                lineChart.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                qVar.f18852p = true;
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            int i14 = q.D;
            q qVar = q.this;
            LineChart lineChart = qVar.f134442b;
            if (lineChart != null) {
                lineChart.setDragEnabled(true);
                qVar.f134442b.setScaleEnabled(true);
                qVar.f134442b.highlightValues(null);
                qVar.f134442b.setHighlightPerDragEnabled(false);
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            q.this.f18852p = true;
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartSingleTapped(MotionEvent motionEvent) {
            q qVar = q.this;
            if (qVar.f18857w) {
                return;
            }
            Context context = qVar.f134441a;
            zm.p pVar = qVar.f145350e;
            Integer numValueOf = Integer.valueOf(qVar.f18849m);
            Integer numValueOf2 = Integer.valueOf(qVar.f18850n);
            int iOrdinal = qVar.f18856v.ordinal();
            TrimActivityChartFullScreenActivity.f28831c.getClass();
            TrimActivityChartFullScreenActivity.a.a(context, pVar, numValueOf, numValueOf2, iOrdinal);
        }
    }

    public class d implements gz.f {
        public d() {
        }

        @Override // gz.f
        public final String a(float f14, boolean z14) {
            return "";
        }

        @Override // gz.f
        public String b(float f14) {
            return Float.toString(f14);
        }

        @Override // gz.f
        public final String c(int i14) {
            int i15 = q.D;
            LineChart lineChart = q.this.f134442b;
            if (lineChart != null) {
                return lineChart.getXValue(i14);
            }
            return null;
        }
    }

    public q(Context context, zm.p pVar, int i14, int i15, boolean z14, fz.c cVar) {
        super(context, pVar);
        this.f18852p = false;
        this.f18859y = new a();
        this.f18860z = new Handler();
        this.A = new a0.c(this, 22);
        this.B = new b();
        this.C = new c();
        this.f18849m = i14;
        this.f18850n = i15;
        this.f18856v = cVar;
        this.f18857w = z14;
    }

    @Override // qm.e
    public final DataRenderer t() {
        x xVar = new x(this.f134442b, p(), this.f18849m, this.f18850n);
        this.f18858x = xVar;
        xVar.f121604a = gl1.y.B(this.f145357l);
        return this.f18858x;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // qm.e
    public final void u() throws Exception {
        d wVar;
        zm.p pVar = this.f145350e;
        if (pVar == null) {
            r();
            return;
        }
        LineChart lineChart = this.f134442b;
        int i14 = 2;
        Context context = this.f134441a;
        if (lineChart != null) {
            lineChart.setTouchEnabled(true);
            int iG1 = pVar.g1();
            String strK4 = pVar.k4();
            boolean z14 = am.j.z(f12.l.f68084a);
            boolean zR = r1.r();
            if (iG1 == 0) {
                wVar = new w(this, z14);
            } else if (iG1 == 1) {
                wVar = new p(this, z14, strK4);
            } else if (iG1 == 2) {
                wVar = new u(this, zR);
            } else if (iG1 == 3) {
                wVar = new r(this);
            } else if (iG1 == 5) {
                wVar = new v(this);
            } else if (iG1 == 41) {
                wVar = new s(this);
            } else if (iG1 == 43) {
                wVar = new t(this);
            } else if (iG1 == 50) {
                wVar = new p(this, z14, strK4);
            } else if (iG1 != 61) {
                switch (iG1) {
                    case 67:
                    case 68:
                    case 69:
                        wVar = new p(this, z14, strK4);
                        break;
                    default:
                        wVar = new d();
                        break;
                }
            } else {
                wVar = new v(this);
            }
            this.f18855t = wVar;
            gz.c cVar = new gz.c(context, R.layout.chart_hover_marker, this.f18855t);
            this.f18854r = cVar;
            cVar.f80366k = false;
            cVar.f80365j = this.f18859y;
            TextView textView = cVar.f80362g;
            if (textView != null) {
                textView.setVisibility(8);
            }
            gz.c cVar2 = this.f18854r;
            int i15 = this.f145357l;
            cVar2.setComputeDifference((i15 == 3 || i15 == 10 || i15 == 7 || i15 == 65) ? false : true);
            this.f134442b.setMarkerView(this.f18854r);
            LineChart lineChart2 = this.f134442b;
            lineChart2.setHighlighter(new kz.a(lineChart2));
            this.f134442b.setHighlightPerDragEnabled(false);
            this.f134442b.setHighlightPerTapEnabled(false);
            this.f134442b.setOnChartGestureListener(this.C);
            this.f134442b.setOnTouchListener(this.B);
            this.f134442b.setDoubleTapToZoomEnabled(false);
        }
        o();
        double dH4 = pVar.h4();
        this.f145357l = pVar.g1();
        this.f18851o = pVar.P(0);
        boolean zD = ar.h.d(pVar);
        List<o20.a> list = this.f18851o;
        LineDataSet eVar = zD ? new lm.e(ar.e.a(list), "ACTIVITY_TYPE_TAG") : new LineDataSet(ar.e.a(list), "ACTIVITY_TYPE_TAG");
        if (this.f134442b != null) {
            this.f134442b.setExtraLeftOffset(Utils.convertPixelsToDp(context.getResources().getDimension(R.dimen.gcm3_chart_margin_right)));
            this.f134442b.setDrawGridBackground(false);
            if (this.f18857w) {
                LineChart lineChart3 = this.f134442b;
                bd0.e eVar2 = new bd0.e(this, i14);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                s0.d.c(lineChart3, eVar2);
                LineChart lineChart4 = this.f134442b;
                b71.o oVar = new b71.o(23);
                if (lineChart4.isAttachedToWindow()) {
                    oVar.invoke(lineChart4);
                } else {
                    lineChart4.addOnAttachStateChangeListener(new d1(lineChart4, oVar));
                }
            }
        }
        eVar.setCircleRadius(0.0f);
        eVar.setAxisDependency(YAxis.AxisDependency.LEFT);
        eVar.setDrawValues(false);
        eVar.setDrawStepped(q());
        eVar.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        s(eVar);
        double[] dArrN = n(eVar, dH4);
        LineDataSet lineDataSetX = x(m.l(this.f18851o, this.f18849m, this.f18850n, this.f145357l));
        ArrayList arrayList = new ArrayList();
        this.f145352g = arrayList;
        arrayList.add(eVar);
        if (lineDataSetX != null) {
            lineDataSetX.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
            this.f145352g.add(lineDataSetX);
        }
        this.f145355j = ar.e.e(this.f18851o, this.f145357l, this.f18856v);
        w(lineDataSetX);
        XAxis xAxis = this.f134442b.getXAxis();
        xAxis.setValues(this.f145355j);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        v(dArrN);
        g();
        fz.c cVarP1 = pVar.P1();
        f12.l.f68084a.getClass();
        k(cVarP1, f12.l.a.a().y());
        LineData lineData = new LineData(this.f145355j, this.f145352g);
        this.f145354i = lineData;
        j(lineData);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    public final void w(LineDataSet lineDataSet) {
        LineChart lineChart;
        ?? entryForIndex;
        if (this.f18851o == null || (lineChart = this.f134442b) == null) {
            return;
        }
        lineChart.getXAxis().removeAllLimitLines();
        if (lineDataSet != null) {
            int i14 = this.f18849m;
            Context context = this.f134441a;
            if (i14 > 0 && (entryForIndex = lineDataSet.getEntryForIndex(i14)) != 0) {
                this.f134442b.getXAxis().addLimitLine(m.c(entryForIndex.getXIndex(), context));
            }
            if (this.f18850n < this.f18851o.size() - 1) {
                this.f134442b.getXAxis().addLimitLine(m.c(lineDataSet.getEntryForIndex(this.f18850n).getXIndex(), context));
            }
        }
    }

    public final LineDataSet x(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "TrimActivityDataSet");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setCircleRadius(0.0f);
        lineDataSet.setDrawFilled(true);
        Context context = this.f134441a;
        lineDataSet.setColor(a7.b.getColor(context, R.color.gcm3_transparent));
        lineDataSet.setFillDrawable(new ColorDrawable(a7.b.getColor(context, R.color.gcm3_window_black_30_opacity)));
        lineDataSet.setFillAlpha(255);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawHighlightIndicators(true);
        return lineDataSet;
    }

    public final void y() {
        if (this.f145354i.getDataSets().size() > 1 && this.f134442b != null) {
            this.f145354i.removeDataSet(1);
            this.f134442b.getXAxis().removeAllLimitLines();
        }
        LineDataSet lineDataSetX = x(m.l(this.f18851o, this.f18849m, this.f18850n, this.f145357l));
        if (lineDataSetX != null) {
            this.f145354i.addDataSet(lineDataSetX);
            w(lineDataSetX);
        }
        j(this.f145354i);
    }

    public final void z() {
        if (this.f145354i.getDataSets().size() <= 1 || this.f134442b == null) {
            return;
        }
        this.f145354i.removeDataSet(1);
        this.f134442b.getXAxis().removeAllLimitLines();
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            lineChart.invalidate();
        }
    }
}
