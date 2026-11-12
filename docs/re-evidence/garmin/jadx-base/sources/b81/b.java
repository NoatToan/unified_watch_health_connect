package b81;

import am.v1;
import am.x0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import c22.a4;
import cf.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import dy1.v;
import e23.l;
import e23.q;
import f5.c0;
import g8.i;
import i3.h6;
import i3.q5;
import i3.uj;
import java.util.Iterator;
import java.util.List;
import lc.m0;
import lc.y;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;
import p5.h0;
import p5.k0;
import r1.k2;
import r1.l2;
import r1.n;
import r1.o2;
import r1.s1;
import r1.u0;
import r1.x1;
import r21.j;
import r21.k;
import s1.f0;
import w3.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16396f;

    public /* synthetic */ b(int i14, String str, String str2, StringBuilder sb3, n1 n1Var) {
        this.f16391a = 4;
        this.f16392b = i14;
        this.f16393c = str;
        this.f16394d = str2;
        this.f16395e = sb3;
        this.f16396f = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        n4.d dVarG;
        int i14 = this.f16391a;
        int i15 = this.f16392b;
        Object obj2 = this.f16394d;
        Object obj3 = this.f16396f;
        Object obj4 = this.f16395e;
        Object obj5 = this.f16393c;
        switch (i14) {
            case 0:
                List list = (List) obj5;
                Context context = (Context) obj2;
                DateTime dateTime = (DateTime) obj4;
                DateTime dateTime2 = (DateTime) obj3;
                View view2 = (View) obj;
                if (view2 instanceof CustomLineChart) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        numValueOf = Integer.valueOf(((t71.a) it.next()).f163083a);
                        while (it.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((t71.a) it.next()).f163083a);
                            if (numValueOf.compareTo(numValueOf3) > 0) {
                                numValueOf = numValueOf3;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    Float fValueOf = numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null;
                    Iterator it3 = list.iterator();
                    if (it3.hasNext()) {
                        numValueOf2 = Integer.valueOf(((t71.a) it3.next()).f163083a);
                        while (it3.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(((t71.a) it3.next()).f163083a);
                            if (numValueOf2.compareTo(numValueOf4) < 0) {
                                numValueOf2 = numValueOf4;
                            }
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    Float fValueOf2 = numValueOf2 != null ? Float.valueOf(numValueOf2.intValue()) : null;
                    float f14 = 500;
                    float fMax = Math.max(0.0f, fValueOf != null ? fValueOf.floatValue() : 0.0f) - f14;
                    float fFloatValue = fValueOf2 != null ? fValueOf2.floatValue() : 1000.0f;
                    LocalDate localDate = dateTime.toLocalDate();
                    localDate.getClass();
                    LocalDate localDate2 = dateTime2.toLocalDate();
                    localDate2.getClass();
                    t71.d dVar = new t71.d(context, localDate, localDate2, this.f16392b, fMax, fFloatValue + f14, R.color.teal_40);
                    LocalDate localDate3 = dateTime.toLocalDate();
                    localDate3.getClass();
                    LocalDate localDate4 = dateTime2.toLocalDate();
                    localDate4.getClass();
                    tz.a aVar = new tz.a((CustomLineChart) view2, dVar, new t71.b((LineChart) view2, localDate3, localDate4), new t71.c((BarLineChartBase) view2), null, null, 48, null);
                    aVar.c();
                    qz.a.b(aVar, list, null, 6);
                }
                return Unit.INSTANCE;
            case 1:
                v vVar = (v) obj5;
                m0 m0Var = (m0) obj2;
                ey1.a aVar2 = (ey1.a) obj4;
                p1 p1Var = (p1) obj3;
                a4 a4Var = (a4) obj;
                by1.v vVar2 = by1.v.f22216a;
                a4Var.getClass();
                if (vVar != null) {
                    aVar2.a5(a4Var, vVar.f61640a);
                }
                if (i15 < ((i53.c) p1Var.getF182175a()).size() - 1) {
                    x.s(m0Var, by1.v.f22216a.c(), h7.c.a(new p("dayIndexKey", Integer.valueOf(i15 + 1))));
                } else {
                    aVar2.S4(null);
                    aVar2.A4();
                    y.k(by1.e.f22178a.c(), m0Var);
                }
                return Unit.INSTANCE;
            case 2:
                f0 f0Var = (f0) obj5;
                f0 f0Var2 = (f0) obj2;
                f0 f0Var3 = (f0) obj4;
                f0 f0Var4 = (f0) obj3;
                n nVar = (n) obj;
                int i16 = ((q5) nVar.f()).f89412a;
                q5.f89410b.getClass();
                int i17 = 8;
                int i18 = 2;
                return nVar.d(i16 == q5.f89411c ? r1.b.c(u0.k(new i11.f(i17), f0Var).b(u0.d(f0Var2, 2)), u0.e(f0Var3, 2).b(new x1(new o2(null, new l2(new s1(new a0(i15, i18)), f0Var), null, null, null, false, null, 125, null)))) : r1.b.c(u0.k(new a0(i15, i18), f0Var).b(u0.d(f0Var2, 2)), new x1(new o2(null, new l2(new s1(new i11.f(i17)), f0Var), null, null, null, false, null, 125, null)).b(u0.e(f0Var3, 2))), new k2(true, new fp0.l(f0Var4, 22)));
            case 3:
                p1 p1Var2 = (p1) obj2;
                n1 n1Var = (n1) obj3;
                c0 c0Var = (c0) obj;
                p1Var2.setValue(c0Var);
                ((n1) obj4).t((int) (c0Var.a() >> 32));
                View view3 = ((uj) obj5).f89959a;
                Rect rect = new Rect();
                view3.getWindowVisibleDisplayFrame(rect);
                g6.l lVar = new g6.l(rect.left, rect.top, rect.right, rect.bottom);
                c0 c0Var2 = (c0) p1Var2.getF182175a();
                if (c0Var2 == null || !c0Var2.isAttached()) {
                    n4.d.f123545e.getClass();
                    dVarG = n4.d.f123546f;
                } else {
                    n4.c.f123541b.getClass();
                    dVarG = i.g(c0Var2.W(0L), g6.n.c(c0Var2.a()));
                }
                n1Var.t(h6.b(lVar, dVarG, i15));
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj5;
                String str2 = (String) obj2;
                StringBuilder sb3 = (StringBuilder) obj4;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (((n1) obj3).getIntValue() != i15) {
                    str = str2;
                }
                h0.z(k0Var, str);
                h0.n(k0Var, sb3.toString());
                return Unit.INSTANCE;
            case 5:
                List list2 = (List) obj5;
                e2.f0 f0Var5 = (e2.f0) obj;
                f0Var5.getClass();
                f0Var5.a(list2.size(), null, new j(r21.i.f149499a, list2), new z3.e(802480018, true, new k(list2, this.f16394d, (q) obj4, this.f16392b, (l) obj3)));
                return Unit.INSTANCE;
            default:
                ps.x1 x1Var = (ps.x1) obj5;
                String str3 = (String) obj;
                str3.getClass();
                x1Var.y2(v1.c(((x0) obj2).f4358a, ((ps.u0) obj4).getScale(), str3));
                ((e23.p) obj3).invoke(x1Var, Integer.valueOf(i15));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3, p1 p1Var, int i15) {
        this.f16391a = i15;
        this.f16393c = obj;
        this.f16392b = i14;
        this.f16394d = obj2;
        this.f16395e = obj3;
        this.f16396f = p1Var;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i14, Object obj4, int i15) {
        this.f16391a = i15;
        this.f16393c = obj;
        this.f16394d = obj2;
        this.f16395e = obj3;
        this.f16392b = i14;
        this.f16396f = obj4;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f16391a = i15;
        this.f16393c = obj;
        this.f16394d = obj2;
        this.f16395e = obj3;
        this.f16396f = obj4;
        this.f16392b = i14;
    }
}
