package qm;

import am.r1;
import am.v1;
import am.x0;
import am.z0;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.charts.wrapper.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.data.ScatterDataSet;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import ps.u0;
import ps.w0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class c extends qm.b implements zm.q {
    public g0 A;
    public MotionEvent B;
    public final qm.h C;
    public final List<o20.a> I;
    public ps2.d T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gz.c f145270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f145271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zm.p f145272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zm.p f145273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qm.j f145274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<im.s> f145276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f145277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f145278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f145279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f145280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public OverlayCombinedChart f145281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public XAxis f145282r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public YAxis f145283t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public YAxis f145284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f145285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.fragment.app.m f145286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FullscreenChartActivity f145287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g0 f145288z;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean P = true;
    public final k X = new k();
    public final Handler Y = new Handler();
    public final po.g Z = new po.g(this, 6);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final v f145275k0 = new v();
    public final a0 H0 = new a0();

    public class a extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, l22.b bVar) {
            super();
            this.f145289c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.R0(this.f145289c, d14, true);
        }
    }

    public class a0 extends lz.a {
        public a0() {
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            c cVar = c.this;
            if (cVar.D) {
                cVar.D = false;
                cVar.f145281q.fitScreen();
            } else {
                cVar.f145281q.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                cVar.D = true;
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            c.l(c.this);
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            c.this.D = true;
        }
    }

    public class b extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, l22.b bVar) {
            super();
            this.f145291c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.i0(this.f145291c, d14, true);
        }
    }

    public class b0 extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(c cVar, l22.b bVar) {
            super();
            this.f145292c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            boolean z14 = this.f145304a;
            l3.f23124b.getClass();
            return l3.a.k0(this.f145292c, d14, z14, "");
        }
    }

    /* JADX INFO: renamed from: qm.c$c, reason: collision with other inner class name */
    public class C2741c extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2741c(c cVar, l22.b bVar) {
            super();
            this.f145293c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.j0(this.f145293c, d14);
        }
    }

    public class c0 extends g0 {
        public c0() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            c cVar = c.this;
            String strK = new l3(cVar.f145286x).k(f14, this.f145304a);
            return TextUtils.isEmpty(strK) ? cVar.f145286x.getString(R.string.no_value) : strK;
        }
    }

    public class d extends g0 {
        public d() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.A1(mVar != null ? new l22.a(mVar) : null, d14, true);
        }
    }

    public class d0 extends g0 {
        public d0() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            return c22.u.d((int) f14, c.this.f145286x);
        }
    }

    public class e extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c cVar, l22.b bVar) {
            super();
            this.f145297c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.z1(this.f145297c, d14, true);
        }
    }

    public class e0 extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f145298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(boolean z14) {
            super();
            this.f145298c = z14;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.Y0(d14, mVar, this.f145298c);
        }
    }

    public class f extends g0 {
        public f() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            c cVar = c.this;
            String string = cVar.f145286x.getString(R.string.no_value);
            androidx.fragment.app.m mVar = cVar.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            string.getClass();
            return l3.a.y1(mVar != null ? new l22.a(mVar) : null, d14, true, string);
        }
    }

    public class f0 extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f145301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(boolean z14) {
            super();
            this.f145301c = z14;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.W0(d14, mVar, this.f145301c);
        }
    }

    public class g extends g0 {
        public g() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.E(mVar, d14, true, false);
        }
    }

    public class g0 implements gz.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f145304a = true;

        public g0() {
        }

        @Override // gz.f
        public final String a(float f14, boolean z14) {
            c cVar = c.this;
            cVar.E = z14;
            cVar.F = false;
            return b(f14);
        }

        @Override // gz.f
        public String b(float f14) {
            return Float.toString(f14);
        }

        @Override // gz.f
        public final String c(int i14) {
            OverlayCombinedChart overlayCombinedChart = c.this.f145281q;
            if (overlayCombinedChart != null) {
                return overlayCombinedChart.getXValue(i14);
            }
            return null;
        }
    }

    public class h extends g0 {
        public h() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.E(mVar, d14, true, true);
        }
    }

    public class i extends g0 {
        public i() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.E(mVar, d14, true, false);
        }
    }

    public class j extends g0 {
        public j() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.G0(mVar, d14, true, "");
        }
    }

    public class k implements gz.c.b {
        public k() {
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0209 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:107:0x020b  */
        /* JADX WARN: Code duplicated, block: B:108:0x020f  */
        /* JADX WARN: Code duplicated, block: B:133:0x0264  */
        /* JADX WARN: Code duplicated, block: B:145:0x02a7  */
        /* JADX WARN: Code duplicated, block: B:148:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:150:0x02bf  */
        /* JADX WARN: Code duplicated, block: B:153:0x02c9  */
        /* JADX WARN: Code duplicated, block: B:157:0x030e  */
        /* JADX WARN: Code duplicated, block: B:160:0x0340  */
        /* JADX WARN: Code duplicated, block: B:162:0x035b  */
        /* JADX WARN: Code duplicated, block: B:164:0x0360  */
        /* JADX WARN: Code duplicated, block: B:167:0x036d  */
        /* JADX WARN: Code duplicated, block: B:168:0x0388  */
        /* JADX WARN: Code duplicated, block: B:171:0x039c  */
        /* JADX WARN: Code duplicated, block: B:180:0x02e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:181:? A[LOOP:1: B:151:0x02c3->B:181:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x014a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0150  */
        /* JADX WARN: Code duplicated, block: B:61:0x0155  */
        /* JADX WARN: Code duplicated, block: B:62:0x0157  */
        /* JADX WARN: Code duplicated, block: B:65:0x0162  */
        /* JADX WARN: Code duplicated, block: B:68:0x016f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:72:0x018c  */
        /* JADX WARN: Code duplicated, block: B:74:0x018f  */
        /* JADX WARN: Code duplicated, block: B:75:0x0194  */
        /* JADX WARN: Code duplicated, block: B:77:0x0197  */
        @Override // gz.c.b
        public final void a(int i14) {
            ArrayList arrayList;
            String strB;
            String string;
            HashMap<Double, Double> mapM2;
            Integer numB;
            Double dC;
            String strValueOf;
            String strC;
            String string2;
            List<w0> listK3;
            LinkedHashMap<String, String> linkedHashMap;
            LinkedHashMap<String, String> linkedHashMap2;
            DecimalFormat decimalFormat;
            double dDoubleValue;
            lo.l3 l3Var;
            String string3;
            double dDoubleValue2;
            int i15;
            int i16;
            c cVar = c.this;
            OverlayCombinedChart overlayCombinedChart = cVar.f145281q;
            zm.p pVar = cVar.f145273j;
            zm.p pVar2 = cVar.f145272i;
            androidx.fragment.app.m mVar = cVar.f145286x;
            overlayCombinedChart.highlightValues(new Highlight[]{new Highlight(i14, 0), new Highlight(i14, 1)});
            List<Entry> entriesAtIndex = cVar.f145281q.getEntriesAtIndex(i14);
            if (entriesAtIndex != null) {
                arrayList = new ArrayList();
                for (Object obj : entriesAtIndex) {
                    if (!"INVALID_ENTRY".equals(((Entry) obj).getData())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size >= 2) {
                    if (size == 2) {
                        cVar.E = true;
                        strB = cVar.f145288z.b(((Entry) arrayList.get(0)).getVal());
                        switch (cVar.f145279o) {
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                cVar.F = true;
                                strB = e5.g(strB, " / ", c.k(cVar, ((Entry) arrayList.get(1)).getVal(), false));
                                break;
                        }
                        g0 g0Var = cVar.A;
                        if (g0Var != null) {
                            string = g0Var.b(((Entry) arrayList.get(1)).getVal());
                        }
                    } else {
                        cVar.E = true;
                        float val = ((Entry) arrayList.get(0)).getVal();
                        g0 g0Var2 = cVar.f145288z;
                        g0Var2.f145304a = true;
                        String strB2 = g0Var2.b(val);
                        switch (cVar.f145280p) {
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                cVar.F = true;
                                strB2 = e5.g(strB2, " / ", c.k(cVar, ((Entry) arrayList.get(1)).getVal(), false));
                                break;
                        }
                        if (cVar.A != null) {
                            int i17 = 1;
                            String strB3 = null;
                            while (true) {
                                if (i17 < size) {
                                    Entry entry = (Entry) arrayList.get(i17);
                                    float val2 = entry.getVal();
                                    if (entry.getXIndex() == i14 && val != val2) {
                                        cVar.E = true;
                                        strB3 = cVar.A.b(val2);
                                        switch (cVar.f145279o) {
                                            case 23:
                                            case 24:
                                            case 25:
                                            case 26:
                                                cVar.F = true;
                                                Entry entry2 = (Entry) arrayList.get(size - 1);
                                                string = e5.g(strB3, " / ", c.k(cVar, entry2 != null ? entry2.getVal() : 0.0f, true));
                                                strB = strB2;
                                                break;
                                        }
                                    }
                                    i17++;
                                } else {
                                    strB = strB2;
                                    string = strB3;
                                }
                            }
                        } else {
                            strB = strB2;
                        }
                    }
                    if (cVar.f145279o != 38 || pVar2.getB1() == 38 || (pVar != null && pVar.getB1() == 38)) {
                        if (pVar2.getB1() == 38) {
                            mapM2 = pVar2.m2();
                        } else if (pVar == null && pVar.getB1() == 38) {
                            mapM2 = pVar.m2();
                        } else {
                            mapM2 = null;
                        }
                        numB = c22.u.b(cVar.f145281q.getXValue(i14));
                        if (numB != null || mapM2 == null) {
                            dC = null;
                        } else {
                            dC = mapM2.get(Double.valueOf(numB.intValue()));
                            if (dC == null) {
                                dC = c22.u.c(mapM2, numB.intValue());
                            }
                        }
                        if (dC != null) {
                            strValueOf = String.valueOf(dC);
                        } else {
                            strValueOf = null;
                        }
                    } else {
                        strValueOf = null;
                        dC = null;
                    }
                    if (pVar != null) {
                        StringBuilder sbK = e5.k(string);
                        sbK.append(cVar.s(pVar.getB1()));
                        string = sbK.toString();
                    }
                    if (pVar2.getB1() != 47 && (pVar2 instanceof im.t)) {
                        im.t tVar = (im.t) pVar2;
                        gz.c cVar2 = cVar.f145270g;
                        mVar.getClass();
                        x1 x1VarA = tVar.A(i14);
                        qs.x xVar = qs.x.CLIMB_ACTIVE;
                        boolean z14 = xVar == (x1VarA != null ? x1VarA.a2() : null);
                        if (z14) {
                            if ((x1VarA != null ? x1VarA.getInternalStatus() : null) == null || x1VarA.getNumFalls() == null) {
                                if (z14) {
                                    i16 = R.string.lbl_climb_indicator;
                                } else {
                                    i16 = R.string.stress_level_rest;
                                }
                            } else if (p005kotlin.jvm.internal.s.g(x1VarA.getInternalStatus(), qs.w.CLIMB_ATTEMPTED.f147194a)) {
                                i16 = R.string.chart_legend_label_route_attempts;
                            } else {
                                Integer numFalls = x1VarA.getNumFalls();
                                i16 = (numFalls != null && numFalls.intValue() == 0) ? R.string.activities_climb_send : R.string.chart_legend_label_route_complete_with_falls;
                            }
                        } else if (z14) {
                            i16 = R.string.lbl_climb_indicator;
                        } else {
                            i16 = R.string.stress_level_rest;
                        }
                        String string4 = mVar.getString(i16);
                        string4.getClass();
                        x1 x1VarA2 = tVar.A(i14);
                        boolean z15 = xVar == (x1VarA2 != null ? x1VarA2.a2() : null);
                        u0 difficulty = x1VarA2 != null ? x1VarA2.getDifficulty() : null;
                        String str = "";
                        if (z15 && difficulty != null) {
                            String str2 = tVar.Y;
                            if (str2 == null) {
                                str2 = "";
                            }
                            String strE = v1.e(str2, difficulty);
                            if (strE != null) {
                                str = strE;
                            }
                        }
                        cVar2.f(string4, strB, string, str);
                        return;
                    }
                    strC = cVar.f145288z.c(i14);
                    StringBuilder sbK2 = e5.k(strB);
                    sbK2.append(cVar.s(pVar2.getB1()));
                    string2 = sbK2.toString();
                    if (strValueOf != null) {
                        cVar.f145270g.d(true);
                        gz.c cVar3 = cVar.f145270g;
                        StringBuilder sbI = sn.a.i(strValueOf, "° ");
                        dDoubleValue2 = dC.doubleValue();
                        if (dDoubleValue2 > 45.0d || dDoubleValue2 > 315.0d) {
                            i15 = R.string.wind_speed_charts_headwind;
                        } else if (dDoubleValue2 <= 135.0d) {
                            i15 = R.string.wind_speed_charts_rightcross;
                        } else {
                            i15 = dDoubleValue2 <= 225.0d ? R.string.wind_speed_charts_tailwind : R.string.wind_speed_charts_leftcross;
                        }
                        sbI.append(mVar.getString(i15));
                        cVar3.f(string2, sbI.toString(), string, strC);
                        return;
                    }
                    listK3 = pVar2.K3();
                    if (listK3 != null) {
                        for (w0 w0Var : listK3) {
                            if (w0Var.f140252h == cVar.I.get(i14).C()) {
                                linkedHashMap2 = new LinkedHashMap<>();
                                String string5 = mVar.getString(R.string.lbl_jump_metrics_hangtime);
                                decimalFormat = l3.f23138p;
                                linkedHashMap2.put(string5, mVar.getString(R.string.lbl_short_form_for_seconds, decimalFormat.format(w0Var.getHangTime())));
                                if (w0Var.getSpeed() != null) {
                                    linkedHashMap2.put(mVar.getString(R.string.lbl_speed), new ns.w0(new l22.a(mVar), ((f12.l) KoinJavaComponent.get(f12.l.class)).y(), new ms.a0()).b(1, w0Var.getSpeed(), false));
                                }
                                if (w0Var.getDistance() != null) {
                                    String string6 = mVar.getString(R.string.lbl_distance);
                                    dDoubleValue = w0Var.getDistance().doubleValue();
                                    if (((f12.l) KoinJavaComponent.get(f12.l.class)).y()) {
                                        l3Var = lo.l3.METER;
                                    } else {
                                        l3Var = lo.l3.FOOT;
                                    }
                                    if (l3Var.f113907a.equals(lo.l3.METER.f113907a)) {
                                        string3 = mVar.getString(R.string.common_abbrev_n_meters_label, decimalFormat.format(dDoubleValue));
                                    } else {
                                        l3.f23124b.getClass();
                                        string3 = mVar.getString(R.string.lbl_short_form_for_feet, decimalFormat.format(dDoubleValue * 3.2808399d));
                                    }
                                    linkedHashMap2.put(string6, string3);
                                }
                                linkedHashMap = linkedHashMap2;
                            }
                        }
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = null;
                    }
                    cVar.f145270g.g(string2, string, strC, linkedHashMap);
                }
                g0 g0Var3 = cVar.f145288z;
                float val3 = ((Entry) arrayList.get(0)).getVal();
                g0Var3.f145304a = true;
                strB = g0Var3.b(val3);
            } else {
                strB = null;
            }
            string = null;
            if (cVar.f145279o != 38) {
                if (pVar2.getB1() == 38) {
                    mapM2 = pVar2.m2();
                } else if (pVar == null) {
                    mapM2 = null;
                } else {
                    mapM2 = null;
                }
                numB = c22.u.b(cVar.f145281q.getXValue(i14));
                if (numB != null) {
                    dC = null;
                } else {
                    dC = null;
                }
                if (dC != null) {
                    strValueOf = String.valueOf(dC);
                } else {
                    strValueOf = null;
                }
            } else {
                if (pVar2.getB1() == 38) {
                    mapM2 = pVar2.m2();
                } else if (pVar == null) {
                    mapM2 = null;
                } else {
                    mapM2 = null;
                }
                numB = c22.u.b(cVar.f145281q.getXValue(i14));
                if (numB != null) {
                    dC = null;
                } else {
                    dC = null;
                }
                if (dC != null) {
                    strValueOf = String.valueOf(dC);
                } else {
                    strValueOf = null;
                }
            }
            if (pVar != null) {
                StringBuilder sbK3 = e5.k(string);
                sbK3.append(cVar.s(pVar.getB1()));
                string = sbK3.toString();
            }
            if (pVar2.getB1() != 47) {
            }
            strC = cVar.f145288z.c(i14);
            StringBuilder sbK4 = e5.k(strB);
            sbK4.append(cVar.s(pVar2.getB1()));
            string2 = sbK4.toString();
            if (strValueOf != null) {
                cVar.f145270g.d(true);
                gz.c cVar4 = cVar.f145270g;
                StringBuilder sbI2 = sn.a.i(strValueOf, "° ");
                dDoubleValue2 = dC.doubleValue();
                if (dDoubleValue2 > 45.0d) {
                    i15 = R.string.wind_speed_charts_headwind;
                } else {
                    i15 = R.string.wind_speed_charts_headwind;
                }
                sbI2.append(mVar.getString(i15));
                cVar4.f(string2, sbI2.toString(), string, strC);
                return;
            }
            listK3 = pVar2.K3();
            if (listK3 != null) {
                while (r5.hasNext()) {
                    if (w0Var.f140252h == cVar.I.get(i14).C()) {
                        linkedHashMap2 = new LinkedHashMap<>();
                        String string7 = mVar.getString(R.string.lbl_jump_metrics_hangtime);
                        decimalFormat = l3.f23138p;
                        linkedHashMap2.put(string7, mVar.getString(R.string.lbl_short_form_for_seconds, decimalFormat.format(w0Var.getHangTime())));
                        if (w0Var.getSpeed() != null) {
                            linkedHashMap2.put(mVar.getString(R.string.lbl_speed), new ns.w0(new l22.a(mVar), ((f12.l) KoinJavaComponent.get(f12.l.class)).y(), new ms.a0()).b(1, w0Var.getSpeed(), false));
                        }
                        if (w0Var.getDistance() != null) {
                            String string8 = mVar.getString(R.string.lbl_distance);
                            dDoubleValue = w0Var.getDistance().doubleValue();
                            if (((f12.l) KoinJavaComponent.get(f12.l.class)).y()) {
                                l3Var = lo.l3.METER;
                            } else {
                                l3Var = lo.l3.FOOT;
                            }
                            if (l3Var.f113907a.equals(lo.l3.METER.f113907a)) {
                                l3.f23124b.getClass();
                                string3 = mVar.getString(R.string.lbl_short_form_for_feet, decimalFormat.format(dDoubleValue * 3.2808399d));
                            } else {
                                string3 = mVar.getString(R.string.common_abbrev_n_meters_label, decimalFormat.format(dDoubleValue));
                            }
                            linkedHashMap2.put(string8, string3);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                }
                linkedHashMap = null;
            } else {
                linkedHashMap = null;
            }
            cVar.f145270g.g(string2, string, strC, linkedHashMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gz.c.b
        public final void b(int i14, int i15) {
            ArrayList arrayList;
            c cVar = c.this;
            if (cVar.T == null) {
                cVar.T = new ps2.d(this, 14);
            }
            qm.h hVar = cVar.C;
            OverlayCombinedChart overlayCombinedChart = cVar.f145281q;
            ps2.d dVar = cVar.T;
            qm.g gVar = hVar.f145381b;
            if (gVar != null) {
                gVar.a();
            }
            if (dVar != null) {
                hVar.f145382c = dVar;
            } else {
                hVar.f145382c = hVar.f145380a;
            }
            CombinedData combinedData = (CombinedData) overlayCombinedChart.getData();
            int i16 = qm.t.f145451a;
            if (combinedData == null || combinedData.getDataSetCount() <= 0) {
                arrayList = new ArrayList(0);
            } else {
                arrayList = new ArrayList(i15 - i14);
                IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) combinedData.getDataSetByIndex(0);
                while (i14 < i15) {
                    T entryForXIndex = iBarLineScatterCandleBubbleDataSet.getEntryForXIndex(i14);
                    if (entryForXIndex != 0) {
                        arrayList.add(entryForXIndex);
                    }
                    i14++;
                }
            }
            if (arrayList.isEmpty()) {
                hVar.f145382c.a(0.0f);
                return;
            }
            qm.g gVar2 = new qm.g(hVar, s0.f129406a, arrayList);
            hVar.f145381b = gVar2;
            gVar2.c(new Void[0]);
        }
    }

    public class l extends g0 {
        public l() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            return l3.i(c.this.f145286x, f14);
        }
    }

    public class m extends g0 {
        public m(c cVar) {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.B(d14);
        }
    }

    public class n extends g0 {
        public n() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.T0(d14, mVar, true);
        }
    }

    public class o extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f145312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(c cVar, String str) {
            super();
            this.f145312c = str;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            return e5.g(l3.n().format(f14), StringUtils.SPACE, this.f145312c);
        }
    }

    public class p extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f145313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z14) {
            super();
            this.f145313c = z14;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            q3 q3Var;
            c cVar = c.this;
            if (z0.I(cVar.f145272i.getF113501k1())) {
                q3Var = q3.NAUTICAL_MILES_PER_HOUR;
            } else {
                q3Var = this.f145313c ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            }
            q3 q3Var2 = q3Var;
            androidx.fragment.app.m mVar = cVar.f145286x;
            double d14 = f14;
            DecimalFormat decimalFormatN = l3.n();
            l3.f23124b.getClass();
            return l3.a.X0(mVar, d14, q3Var2, decimalFormatN, null);
        }
    }

    public class q extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f145315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f145316d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z14, String str) {
            super();
            this.f145315c = z14;
            this.f145316d = str;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            return String.format(f14 < 0.0f ? "- %s %s" : "%s %s", l3.f23124b.q0(c.this.f145286x, Math.abs(f14), this.f145315c, false), this.f145316d);
        }
    }

    public class r extends g0 {
        public r() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.d0(d14, mVar, true);
        }
    }

    public class s extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mm.a f145319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f145320d;

        public s(c cVar, String str) {
            super();
            this.f145319c = new mm.a(cVar.f145272i.t2());
            this.f145320d = TextUtils.isEmpty(str) ? "" : str;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            return e5.g(this.f145319c.getFormattedValue(f14, null), StringUtils.SPACE, this.f145320d);
        }
    }

    public class t extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(c cVar, l22.b bVar) {
            super();
            this.f145321c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.C0(this.f145321c, d14);
        }
    }

    public class u extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(l22.b bVar) {
            super();
            this.f145322c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            boolean z14 = c.this.E;
            l3.f23124b.getClass();
            return l3.a.I0(this.f145322c, d14, z14, false);
        }
    }

    public class v implements View.OnTouchListener {
        public v() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view2, MotionEvent motionEvent) {
            c cVar = c.this;
            cVar.B = motionEvent;
            po.g gVar = cVar.Z;
            Handler handler = cVar.Y;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 2) {
                handler.postDelayed(gVar, 500L);
            }
            if (actionMasked != 6 && actionMasked != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            c.l(cVar);
            return false;
        }
    }

    public class w extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(l22.b bVar) {
            super();
            this.f145325c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            double d14 = f14;
            c cVar = c.this;
            boolean z14 = cVar.E;
            boolean z15 = cVar.F;
            l3.f23124b.getClass();
            return l3.a.I0(this.f145325c, d14, z14, z15);
        }
    }

    public class x extends g0 {
        public x() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.h0(mVar, d14);
        }
    }

    public class y extends g0 {
        public y() {
            super();
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            androidx.fragment.app.m mVar = c.this.f145286x;
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.e0(mVar, d14);
        }
    }

    public class z extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l22.b f145329c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(l22.b bVar) {
            super();
            this.f145329c = bVar;
        }

        @Override // qm.c.g0, gz.f
        public final String b(float f14) {
            String string = c.this.f145286x.getString(R.string.no_value);
            double d14 = f14;
            l3.f23124b.getClass();
            return l3.a.B0(this.f145329c, d14, 0, string);
        }
    }

    public c(androidx.fragment.app.m mVar, zm.p pVar, zm.p pVar2, qm.j jVar) {
        if (mVar == null) {
            i2.i("ActivityChartConfigurator", "ActivityChartConfigurator not initialized Context: null");
        } else {
            this.f145266f = R.color.gcm_chart_text_label;
            this.f145265e = a7.b.getColor(mVar, R.color.gcm_chart_text_label);
            mVar.getString(R.string.txt_empty_page_no_data);
        }
        this.f145286x = mVar;
        this.f145272i = pVar;
        this.f145273j = pVar2;
        this.f145271h = (pVar2 == null || pVar2.P(0).isEmpty()) ? false : true;
        this.f145274k = jVar;
        this.I = pVar.P(0);
        this.f145285w = a7.b.getColor(mVar, R.color.gcm_chart_highlight_line);
        this.C = new qm.h();
    }

    public static String k(c cVar, float f14, boolean z14) {
        cVar.E = false;
        return z14 ? cVar.A.b(f14) : cVar.f145288z.b(f14);
    }

    public static void l(c cVar) {
        cVar.f145281q.setDragEnabled(true);
        cVar.f145281q.setScaleEnabled(true);
        cVar.f145281q.setScaleYEnabled(cVar.f145274k.f145393c);
        cVar.f145281q.highlightValues(null);
        cVar.f145281q.setHighlightPerDragEnabled(false);
        FullscreenChartActivity fullscreenChartActivity = cVar.f145287y;
        if (fullscreenChartActivity != null) {
            fullscreenChartActivity.n1();
        }
    }

    @Override // zm.q
    public final void b() {
        qm.g gVar;
        qm.h hVar = this.C;
        if (hVar == null || (gVar = hVar.f145381b) == null) {
            return;
        }
        gVar.a();
    }

    /* JADX WARN: Failed to calculate best type for var: r1v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v33 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v34 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v62 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v62 ??, new type: com.github.mikephil.chartingv2.components.YAxis
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v63 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v63 ??, new type: com.github.mikephil.chartingv2.components.YAxis
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v19 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // zm.q
    public final android.view.View d(android.view.ViewGroup r35) {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.c.d(android.view.ViewGroup):android.view.View");
    }

    public final double[] m(hz.h hVar, double d14) {
        int i14;
        double yMin = hVar.getYMin();
        double yMax = hVar.getYMax();
        if (!Double.isNaN(d14) && yMin == d14 && yMax == d14) {
            yMax = d14 * 2.0d;
            yMin = 0.0d;
        }
        int i15 = this.f145279o;
        if (i15 == 2 || i15 == 87) {
            yMin -= 10.0d;
            yMax += 10.0d;
        }
        double d15 = yMin;
        double d16 = yMax;
        zm.p pVar = this.f145272i;
        return (pVar != null && pVar.getF113509s1() == 0.0d && pVar.getF113510t1() == 0.0d && ((i14 = this.f145279o) == 0 || i14 == 10 || i14 == 65 || i14 == 87 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 6 || i14 == 7 || i14 == 8)) ? new double[]{-10.0d, 0.0d, 10.0d} : this.f145272i.Q3(d15, d16, 4, 0.05d, this.f145279o);
    }

    public double[] n(LineDataSet lineDataSet, double d14) {
        return m((hz.h) lineDataSet, d14);
    }

    public final void o(YAxis yAxis, int i14) {
        yAxis.setStartAtZero(false);
        yAxis.setTextColor(i14);
        yAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        yAxis.setDrawGridLines(false);
        yAxis.setDrawAxisLine(false);
    }

    public final ArrayList p(int i14, List list, boolean z14) {
        int i15;
        ArrayList arrayList;
        zm.p pVar = this.f145273j;
        androidx.fragment.app.m mVar = this.f145286x;
        switch (i14) {
            case 23:
            case 24:
            case 25:
            case 26:
                this.f145278n = a7.b.getColor(mVar, im.a.a(this.f145279o)[0]);
                boolean z15 = pVar != null;
                if (list == null || list.isEmpty()) {
                    return new ArrayList(0);
                }
                ArrayList arrayList2 = new ArrayList(2);
                int size = list.size();
                int i16 = size / 2;
                ArrayList arrayList3 = new ArrayList(i16);
                ArrayList arrayList4 = new ArrayList(i16);
                int i17 = 0;
                while (i17 < size) {
                    o20.a aVar = new o20.a();
                    boolean z16 = z15;
                    aVar.F(((o20.a) list.get(i17)).C());
                    aVar.G(((o20.a) list.get(i17)).D());
                    if (i14 == 24 || i14 == 25) {
                        double D = aVar.D();
                        if (D <= 90.0d) {
                            aVar.G(90.0d - D);
                        } else {
                            aVar.G((360.0d - D) + 90.0d);
                        }
                    }
                    if (i17 < i16) {
                        arrayList3.add(aVar);
                    } else {
                        arrayList4.add(aVar);
                    }
                    i17++;
                    z15 = z16;
                }
                boolean z17 = z15;
                int[] iArrA = im.a.a(i14);
                int i18 = (!z17 || z14) ? 255 : 127;
                ScatterDataSet scatterDataSetG = qm.b.g(mVar, ar.e.a(arrayList3), iArrA[0], i18);
                ScatterDataSet scatterDataSetG2 = qm.b.g(mVar, ar.e.a(arrayList4), iArrA[1], i18);
                arrayList2.add(scatterDataSetG);
                arrayList2.add(scatterDataSetG2);
                return arrayList2;
            default:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int i19 = this.f145279o != 19 ? (pVar == null || z14) ? 255 : 127 : 127;
                int size2 = this.f145276l.size();
                im.s sVar = null;
                for (int i24 = 0; i24 < size2; i24++) {
                    sVar = this.f145276l.get(i24);
                    if (list == null || sVar == null) {
                        i15 = i19;
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        int size3 = list.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            double D2 = ((o20.a) list.get(i25)).D();
                            int i26 = i19;
                            if (D2 >= sVar.f94180b && D2 < sVar.f94181c) {
                                arrayList.add(new Entry((float) D2, i25));
                            }
                            i25++;
                            i19 = i26;
                        }
                        i15 = i19;
                    }
                    if (arrayList != null) {
                        arrayList6.addAll(arrayList);
                    }
                    i19 = i15;
                    arrayList5.add(qm.b.g(mVar, arrayList, sVar.f94179a, i19));
                }
                if (!arrayList6.isEmpty()) {
                    Collections.sort(arrayList6, new androidx.browser.trusted.c(27));
                    arrayList5.add(0, qm.b.g(mVar, arrayList6, R.color.gcm_text_on_color, 0));
                }
                this.f145278n = a7.b.getColor(mVar, sVar != null ? sVar.f94179a : this.f145266f);
                return arrayList5;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void q() {
        /*
            r7 = this;
            zm.p r0 = r7.f145272i
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.getF113500j1()
            int r1 = r7.f145265e
            androidx.fragment.app.m r2 = r7.f145286x
            android.widget.TextView r0 = qm.t.a(r2, r1, r1, r0)
            android.widget.LinearLayout r1 = r7.f145261a
            r3 = 0
            if (r1 == 0) goto L1d
            r1.removeAllViews()
            android.widget.LinearLayout r1 = r7.f145261a
            r1.setVisibility(r3)
        L1d:
            android.widget.LinearLayout r1 = r7.f145261a
            if (r1 == 0) goto L24
            r1.addView(r0)
        L24:
            android.widget.LinearLayout r0 = r7.f145262b
            if (r0 == 0) goto L30
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r7.f145262b
            r0.setVisibility(r3)
        L30:
            zm.p r0 = r7.f145273j
            if (r0 == 0) goto L39
            int r0 = r0.getB1()
            goto L3a
        L39:
            r0 = -1
        L3a:
            int r1 = r7.f145279o
            switch(r1) {
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                default: goto L3f;
            }
        L3f:
            switch(r0) {
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                default: goto L42;
            }
        L42:
            goto L93
        L43:
            r0 = 2132090572(0x7f151ecc, float:1.9821488E38)
            java.lang.String r1 = r2.getString(r0)
            r4 = 2131100627(0x7f0603d3, float:1.781364E38)
            int r4 = a7.b.getColor(r2, r4)
            r5 = 2132086821(0x7f151025, float:1.981388E38)
            java.lang.String r5 = r2.getString(r5)
            android.text.SpannedString r6 = new android.text.SpannedString
            r6.<init>(r1)
            int r1 = r7.f145265e
            android.widget.TextView r1 = qm.t.b(r2, r4, r6, r1, r5)
            android.widget.LinearLayout r4 = r7.f145262b
            if (r4 == 0) goto L6a
            r4.addView(r1)
        L6a:
            java.lang.String r0 = r2.getString(r0)
            r1 = 2131100625(0x7f0603d1, float:1.7813637E38)
            int r1 = a7.b.getColor(r2, r1)
            r4 = 2132086822(0x7f151026, float:1.9813882E38)
            java.lang.String r4 = r2.getString(r4)
            android.text.SpannedString r5 = new android.text.SpannedString
            r5.<init>(r0)
            int r0 = r7.f145265e
            android.widget.TextView r0 = qm.t.b(r2, r1, r5, r0, r4)
            r1 = 20
            r0.setPadding(r1, r3, r1, r3)
            android.widget.LinearLayout r1 = r7.f145262b
            if (r1 == 0) goto L93
            r1.addView(r0)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.c.q():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    @SuppressLint({"SwitchIntDef"})
    public final g0 r(int i14, String str) {
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        boolean zY = lVarA.y();
        boolean zC = lVarA.c();
        boolean zR = r1.r();
        l22.a aVar = new l22.a(this.f145286x);
        if (i14 == 34) {
            return new r();
        }
        if (i14 != 47) {
            if (i14 != 50) {
                if (i14 == 71) {
                    return new i();
                }
                if (i14 != 82) {
                    if (i14 == 96) {
                        return new f();
                    }
                    if (i14 == 43) {
                        return new d0();
                    }
                    if (i14 != 44) {
                        if (i14 != 86) {
                            if (i14 != 87) {
                                switch (i14) {
                                    case 0:
                                        return new p(zY);
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        return new b0(this, aVar);
                                    case 4:
                                        return new h();
                                    case 5:
                                        break;
                                    case 6:
                                        return new e0(zC);
                                    case 7:
                                    case 10:
                                        return new m(this);
                                    case 8:
                                        return new n();
                                    case 9:
                                        return new o(this, str);
                                    case 11:
                                        break;
                                    case 12:
                                        return new b(this, aVar);
                                    case 13:
                                        return new e(this, aVar);
                                    case 14:
                                        return new C2741c(this, aVar);
                                    case 15:
                                        break;
                                    case 16:
                                        return new d();
                                    default:
                                        switch (i14) {
                                            case 19:
                                                return new C2741c(this, aVar);
                                            case 20:
                                                return new s(this, str);
                                            case 21:
                                            case 22:
                                                return new t(this, aVar);
                                            case 23:
                                            case 25:
                                            case 26:
                                                return new u(aVar);
                                            case 24:
                                                return new w(aVar);
                                            default:
                                                switch (i14) {
                                                    case 39:
                                                        return new y();
                                                    case 40:
                                                        return new x();
                                                    case 41:
                                                        return new c0();
                                                    default:
                                                        switch (i14) {
                                                            case 57:
                                                            case 62:
                                                                break;
                                                            case 58:
                                                            case 59:
                                                                return new z(aVar);
                                                            case 60:
                                                                return new m(this);
                                                            case 61:
                                                            case 63:
                                                                return new j();
                                                            default:
                                                                switch (i14) {
                                                                    case 65:
                                                                        return new m(this);
                                                                    case 66:
                                                                        break;
                                                                    case 67:
                                                                    case 68:
                                                                    case 69:
                                                                        break;
                                                                    default:
                                                                        return new g0();
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                        }
                        return new a(this, aVar);
                    }
                    return new g();
                }
                return new l();
            }
            return new q(zY, str);
        }
        return new f0(zR);
    }

    public final String s(int i14) {
        if (i14 != 38) {
            return "";
        }
        f12.l.f68084a.getClass();
        return this.f145286x.getString(f12.l.a.a().y() ? R.string.lbl_kmh : R.string.lbl_mph);
    }

    public gz.c t() {
        return new gz.c(this.f145286x, R.layout.chart_hover_marker, this.f145288z);
    }

    public final LineData u(ArrayList arrayList) {
        hz.h hVar;
        boolean zB;
        LineData lineData = new LineData(arrayList);
        zm.p pVar = this.f145273j;
        double f113499i1 = pVar.getF113499i1();
        this.f145280p = this.f145279o;
        this.f145279o = pVar.getB1();
        List<o20.a> listP = pVar.P(0);
        boolean zD = ar.h.d(pVar);
        zm.p pVar2 = this.f145272i;
        if (zD) {
            hVar = new lm.a(ar.e.a(listP), "");
        } else {
            hVar = new hz.h(ar.e.b(this.P ? pVar2.P(0) : pVar.P(0), listP));
        }
        hVar.setCircleRadius(0.0f);
        hVar.setAxisDependency(YAxis.AxisDependency.RIGHT);
        hVar.setDrawValues(false);
        hVar.setLineWidth(2.0f);
        hVar.setHighlightLineWidth(1.0f);
        int i14 = this.f145285w;
        hVar.setHighLightColor(i14);
        hVar.setCircleColor(i14);
        String f113501k1 = pVar2.getF113501k1();
        int i15 = this.f145279o;
        if ((i15 == 1 || i15 == 68) && f113501k1 != null) {
            z0 z0Var = z0.f4390a;
            zB = z0.b(x0.f4313o1, f113501k1);
        } else {
            zB = i15 == 7 || i15 == 9 || i15 == 10 || i15 == 65;
        }
        hVar.setDrawStepped(zB);
        hVar.setDrawFilled(false);
        int i16 = this.f145279o;
        if (i16 == 20) {
            this.f145277m = pVar.Y3();
            hVar.setColor(pVar.Y3());
            hVar.setDrawFilled(false);
        } else {
            int color = a7.b.getColor(this.f145286x, im.a.a(i16)[1]);
            this.f145277m = color;
            hVar.setColor(color);
        }
        this.f145283t.removeAllLimitLines();
        w(m(hVar, f113499i1));
        lineData.addDataSet(hVar);
        return lineData;
    }

    public final ScatterData v(ArrayList arrayList) {
        zm.p pVar = this.f145273j;
        double f113499i1 = pVar.getF113499i1();
        this.f145280p = this.f145279o;
        this.f145279o = pVar.getB1();
        ScatterData scatterData = new ScatterData(arrayList);
        this.f145276l = im.a.c(this.f145279o, pVar.W());
        List<o20.a> listP = pVar.P(0);
        ArrayList arrayListP = p(pVar.getB1(), listP, true);
        e(listP);
        if (!Double.isNaN(f113499i1) && this.f145263c == f113499i1 && this.f145264d == f113499i1) {
            this.f145263c = (float) 0.0d;
            this.f145264d = (float) (f113499i1 * 2.0d);
        }
        this.f145283t.removeAllLimitLines();
        w(this.f145272i.Q3(this.f145263c, this.f145264d, 5, 0.05d, this.f145279o));
        int size = arrayListP.size();
        for (int i14 = 0; i14 < size; i14++) {
            ScatterDataSet scatterDataSet = (ScatterDataSet) arrayListP.get(i14);
            scatterDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
            scatterDataSet.setHighlightLineWidth(1.0f);
            scatterDataSet.setHighLightColor(this.f145285w);
            scatterData.addDataSet(scatterDataSet);
        }
        return scatterData;
    }

    @SuppressLint({"SwitchIntDef"})
    public final void w(double[] dArr) {
        OverlayCombinedChart overlayCombinedChart = this.f145281q;
        if (overlayCombinedChart != null) {
            this.f145284v = overlayCombinedChart.getAxisRight();
            if (im.a.b(this.f145279o) == 2) {
                YAxis yAxis = this.f145284v;
                int i14 = this.f145277m;
                if (i14 == 0) {
                    i14 = this.f145265e;
                }
                o(yAxis, i14);
            } else if (im.a.b(this.f145279o) == 4) {
                YAxis yAxis2 = this.f145284v;
                int i15 = this.f145278n;
                if (i15 == 0) {
                    i15 = this.f145265e;
                }
                o(yAxis2, i15);
            }
            if (this.f145279o == 6) {
                this.f145284v.setGranularityEnabled(true);
                this.f145284v.setGranularity(0.5f);
            }
        }
        float f14 = (float) dArr[dArr.length - 1];
        float f15 = (float) dArr[0];
        boolean z14 = f15 < 0.0f;
        int i16 = this.f145279o;
        androidx.fragment.app.m mVar = this.f145286x;
        if (i16 == 14 || i16 == 19) {
            this.f145284v.setLabelCount(3, true);
            qm.b.i(mVar, this.f145281q, R.dimen.gcm3_chart_x_labels_padding, 1);
            OverlayCombinedChart overlayCombinedChart2 = this.f145281q;
            overlayCombinedChart2.setRendererRightYAxis(new om.c(overlayCombinedChart2, YAxis.AxisDependency.RIGHT, this.f145279o));
        } else if (i16 == 41) {
            this.f145284v.setLabelCount(Math.min((int) ((f14 - f15) + 1.0f), 6), true);
        } else if (i16 != 43) {
            switch (i16) {
                case 22:
                    this.f145284v.setInverted(true);
                case 21:
                    this.f145284v.removeAllLimitLines();
                    this.f145284v.setGranularity(5.0f);
                    this.f145284v.setGranularityEnabled(true);
                    this.f145284v.setLabelCount(5, true);
                    break;
                case 23:
                    this.f145284v.setGranularity(45.0f);
                    this.f145284v.setGranularityEnabled(true);
                    this.f145284v.setLabelCount(5, true);
                    this.f145284v.setInverted(true);
                    this.f145284v.setValueFormatter(new mm.d(this.f145279o));
                    qm.b.j(this.f145281q, -2.0f, 1);
                    break;
                case 24:
                    this.f145284v.setLabelCount(5, true);
                    qm.b.i(mVar, this.f145281q, R.dimen.gcm3_chart_x_labels_padding, 1);
                    OverlayCombinedChart overlayCombinedChart3 = this.f145281q;
                    overlayCombinedChart3.setRendererRightYAxis(new om.c(overlayCombinedChart3, YAxis.AxisDependency.RIGHT, this.f145279o));
                    break;
                case 25:
                case 26:
                    this.f145284v.setGranularityEnabled(true);
                    this.f145284v.setLabelCount(4, true);
                    this.f145284v.setInverted(true);
                    this.f145284v.setValueFormatter(new mm.d(this.f145279o));
                    qm.b.j(this.f145281q, -2.0f, 1);
                    break;
                default:
                    this.f145284v.setLabelCount(6, true);
                    break;
            }
        } else {
            this.f145284v.setLabelCount(5, true);
        }
        this.f145284v.setDrawLabels(true);
        int i17 = this.f145279o;
        if (i17 != 1) {
            if (i17 == 36) {
                this.f145284v.setAxisMaxValue(f14);
                this.f145284v.setAxisMinValue(f15);
                this.f145284v.setValueFormatter(new mm.c(3, z14));
                return;
            }
            if (i17 == 38) {
                this.f145284v.setAxisMaxValue(f14);
                this.f145284v.setAxisMinValue(f15);
                this.f145284v.setValueFormatter(new mm.c(2, z14));
                return;
            }
            if (i17 == 43) {
                this.f145284v.setAxisMinValue(0.0f);
                this.f145284v.setAxisMaxValue(100.0f);
                return;
            }
            if (i17 != 50) {
                zm.p pVar = this.f145273j;
                switch (i17) {
                    case 20:
                        this.f145284v.setAxisMaxValue(f14);
                        this.f145284v.setAxisMinValue(f15);
                        if (pVar != null) {
                            this.f145284v.setValueFormatter(new q6.f(9));
                            return;
                        }
                        return;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        if (pVar != null) {
                            this.f145284v.setAxisMaxValue((float) pVar.getF113510t1());
                            this.f145284v.setAxisMinValue((float) pVar.getF113509s1());
                            return;
                        }
                        return;
                    default:
                        switch (i17) {
                            case 67:
                            case 68:
                            case 69:
                                break;
                            default:
                                this.f145284v.setAxisMaxValue(f14);
                                this.f145284v.setAxisMinValue(f15);
                                break;
                        }
                        return;
                }
            }
        }
        this.f145284v.setAxisMinValue(f14);
        this.f145284v.setAxisMaxValue(f15);
        this.f145284v.setValueFormatter(new mm.e());
        this.f145284v.setInverted(true);
    }
}
