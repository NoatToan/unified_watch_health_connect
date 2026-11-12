package ak0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b21.s8;
import b21.v4;
import b82.d2;
import c2.h2;
import c2.j;
import c2.l;
import c2.l2;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.g3;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import e2.k0;
import f5.p;
import f5.z0;
import gg1.o0;
import h4.k;
import h4.r;
import h5.e0;
import i3.d7;
import i3.e5;
import i3.fe;
import i3.h7;
import i3.i7;
import i3.mc;
import i3.mh;
import j02.h0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeMap;
import k2.i;
import kotlin.h4;
import kotlin.t1;
import l30.i0;
import l72.b1;
import l72.c1;
import l72.i3;
import l72.p2;
import l72.r1;
import l72.v2;
import l72.y2;
import lc.m0;
import m4.q;
import o4.m1;
import o72.a3;
import o72.i1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.z1;
import p1.u0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.s0;
import s5.t0;
import s5.x0;
import u1.a2;
import u1.y0;
import v62.s9;
import x5.f0;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3633g;

    public /* synthetic */ h(e23.l lVar, e23.p pVar, dy1.v vVar, e23.p pVar2, Context context, e23.l lVar2) {
        this.f3627a = 20;
        this.f3628b = lVar;
        this.f3629c = pVar;
        this.f3631e = vVar;
        this.f3632f = pVar2;
        this.f3630d = context;
        this.f3633g = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f3628b;
        fv0.g gVar = (fv0.g) this.f3629c;
        e23.a aVar = (e23.a) this.f3631e;
        Context context = (Context) this.f3630d;
        c.q qVar = (c.q) this.f3632f;
        e23.a aVar2 = (e23.a) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fe) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            ou0.e eVar = (ou0.e) ((g3) p1Var.getF182175a()).f35301b;
            if (eVar == null) {
                mVar.C(1502080804);
                mVar.f();
            } else {
                mVar.C(1502080805);
                boolean zR = mVar.r(context) | mVar.r(qVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new fv0.d(context, qVar, 0);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fv0.d(context, qVar, 0);
                        mVar.K(objQ);
                    }
                }
                fv0.f.c(gVar, eVar, aVar, (e23.a) objQ, aVar2, mVar, 0);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        e23.p pVar;
        h4.r.a aVar;
        boolean z14;
        u2 u2Var;
        u4.d dVar = (u4.d) this.f3628b;
        o4.d0 d0Var = (o4.d0) this.f3629c;
        e23.a aVar2 = (e23.a) this.f3630d;
        u4.d dVar2 = (u4.d) this.f3631e;
        String str = (String) this.f3632f;
        e23.p pVar2 = (e23.p) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t2) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar3, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var2 = u2.f22900a;
            if (dVar == null || d0Var == null) {
                pVar = pVar2;
                aVar = aVar3;
                z14 = true;
                u2Var = u2Var2;
                mVar.C(1712071989);
                mVar.f();
            } else {
                mVar.C(1711534232);
                d92.b.f58623a.getClass();
                long j8 = d92.b.a(mVar).f().f63508c;
                long j14 = d0Var.f128833a;
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97901d.f97904c;
                j92.e eVar = j92.b.f97899b;
                float f15 = eVar.f97917b;
                h4.r rVarC2 = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new ig2.d(14);
                    mVar.K(objQ);
                }
                h4.r rVarB = p5.v.b(rVarC2, (e23.l) objQ);
                boolean zB = mVar.B(aVar2);
                Object objQ2 = mVar.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new ii0.h(aVar2, 10);
                    mVar.K(objQ2);
                }
                pVar = pVar2;
                aVar = aVar3;
                z14 = true;
                u2Var = u2Var2;
                g02.i.a(u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15), dVar, j8, j14, f14, f15, null, mVar, 0, 192);
                mVar = mVar;
                mVar.f();
            }
            long jB = ds.e0.b(d92.b.f58623a, mVar);
            d92.b.f58625c.getClass();
            i7.b(dVar2, null, x2.q(aVar, j92.b.f97901d.f97905d), jB, mVar, 48, 0);
            h4.r.a aVar5 = aVar;
            h4.r rVarC3 = c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            d92.b.f58624b.getClass();
            mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
            if (pVar != null) {
                mVar.C(1712597377);
                c2.l.f(u2Var.a(aVar5, 1.0f, z14), mVar);
                pVar.invoke(mVar, 0);
                mVar.f();
            } else {
                mVar.C(1712708853);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f3628b;
        Long l14 = (Long) this.f3629c;
        Boolean bool = (Boolean) this.f3630d;
        gv0.d dVar = (gv0.d) this.f3631e;
        hl.a aVar = (hl.a) this.f3632f;
        x3 x3Var = (x3) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fe) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (((g3) p1Var.getF182175a()).f35300a != fw.p.SUCCESS || ((g3) p1Var.getF182175a()).f35301b == 0) {
                mVar.C(-664980921);
                mVar.f();
            } else {
                mVar.C(532705120);
                pu0.b bVar = (pu0.b) ((g3) p1Var.getF182175a()).f35301b;
                if (bVar == null) {
                    mVar.C(-666010463);
                    mVar.f();
                } else {
                    mVar.C(-666010462);
                    gv0.y yVarB = lv0.c.b(bVar, ((Boolean) x3Var.getF182175a()).booleanValue());
                    boolean zR = mVar.r(dVar);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new ik1.c(dVar, 2);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ik1.c(dVar, 2);
                            mVar.K(objQ);
                        }
                    }
                    e23.p pVar = (e23.p) objQ;
                    boolean zR2 = mVar.r(dVar);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new iv0.e.d(dVar);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new iv0.e.d(dVar);
                            mVar.K(objQ2);
                        }
                    }
                    e23.l lVar = (e23.l) ((k23.g) objQ2);
                    boolean zR3 = mVar.r(dVar) | mVar.r(bVar);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new i20.b(11, dVar, bVar);
                        mVar.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new i20.b(11, dVar, bVar);
                            mVar.K(objQ3);
                        }
                    }
                    hl.a.Companion companion = hl.a.INSTANCE;
                    iv0.e.a(bVar, l14, bool, yVarB, pVar, lVar, (e23.p) objQ3, aVar, mVar, 0);
                    mVar.f();
                }
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        jy0.l lVar = (jy0.l) this.f3628b;
        e23.l lVar2 = (e23.l) this.f3629c;
        e23.l lVar3 = (e23.l) this.f3630d;
        e23.a aVar = (e23.a) this.f3631e;
        x3 x3Var = (x3) this.f3632f;
        x3 x3Var2 = (x3) this.f3633g;
        c12.h hVar = (c12.h) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar.B(hVar) : mVar.r(hVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            jy0.u.a(lVar, hVar, (sy0.j) x3Var.getF182175a(), (sy0.g) x3Var2.getF182175a(), lVar2, lVar3, aVar, mVar, (c12.h.f22556c << 3) | 221184 | ((iIntValue << 3) & 112));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f3630d;
        b63.v vVar = (b63.v) this.f3628b;
        b63.v vVar2 = (b63.v) this.f3629c;
        List list = (List) this.f3631e;
        e23.l lVar = (e23.l) this.f3632f;
        p1 p1Var = (p1) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(mVar, R.string.sleep_lbl_bedtime);
            String strA = kb0.s.a(context, vVar);
            kb0.g.f103773a.getClass();
            z3.e eVar = kb0.g.f103775c;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new kb0.k(p1Var, 0);
                mVar.K(objQ);
            }
            p2Var.h(strQ, strA, null, aVar, null, false, false, eVar, null, null, (e23.a) objQ, mVar, 12585984, 6, 884);
            String strQ2 = gl1.y.Q(mVar, R.string.sleep_lbl_wake_time);
            String strA2 = kb0.s.a(context, vVar2);
            z3.e eVar2 = kb0.g.f103776d;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new kb0.k(p1Var, 1);
                mVar.K(objQ2);
            }
            p2Var.h(strQ2, strA2, null, null, null, false, false, eVar2, null, null, (e23.a) objQ2, mVar, 12582912, 6, 892);
            String strQ3 = gl1.y.Q(mVar, R.string.custom_sleep_windows_day_selector_label);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            mh.c(strQ3, c2.l.C(aVar, f14, f14, f14, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            lb0.c.a(0, lVar, c2.l.y(x2.f(aVar, 1.0f), eVar3.f97920e), list, mVar);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0087  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        zc.d dVar = (zc.d) this.f3628b;
        m21.e eVar = (m21.e) this.f3629c;
        e23.l lVar = (e23.l) this.f3630d;
        v21.e eVar2 = (v21.e) this.f3631e;
        e23.l lVar2 = (e23.l) this.f3632f;
        e23.l lVar3 = (e23.l) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            l2 l2VarE = c2.l.e(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = mVar.r(dVar) | mVar.r(eVar) | mVar.B(lVar) | mVar.r(eVar2) | mVar.B(lVar2) | mVar.B(lVar3);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new aa2.p(dVar, eVar2, lVar2, lVar3, eVar, lVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new aa2.p(dVar, eVar2, lVar2, lVar3, eVar, lVar);
                    mVar.K(objQ);
                }
            }
            e2.c.b(null, null, l2VarE, null, null, null, false, null, (e23.l) objQ, mVar, 0, 507);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        li0.a0 a0Var = (li0.a0) this.f3628b;
        e23.a aVar = (e23.a) this.f3629c;
        li0.f fVar = (li0.f) this.f3631e;
        Context context = (Context) this.f3630d;
        li0.d0 d0Var = (li0.d0) this.f3632f;
        p1 p1Var = (p1) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(mVar, a0Var.f112613a);
            h4.r.a aVar2 = h4.r.S;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b1(27);
                mVar.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar2, false);
            boolean zB = mVar.B(aVar) | mVar.k(a0Var.ordinal()) | mVar.r(fVar) | mVar.r(context) | mVar.r(d0Var);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                li0.t tVar = new li0.t(aVar, a0Var, fVar, context, d0Var, p1Var, 0);
                mVar.K(tVar);
                objQ2 = tVar;
            }
            p2Var.g(strQ, rVarC, null, null, null, false, false, (e23.a) objQ2, mVar, 0, 252);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cb  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        long jE;
        List<li0.a0> list = (List) this.f3628b;
        e23.a aVar = (e23.a) this.f3629c;
        li0.f fVar = (li0.f) this.f3631e;
        Context context = (Context) this.f3630d;
        li0.d0 d0Var = (li0.d0) this.f3632f;
        p1 p1Var = (p1) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        final int i14 = 0;
        final int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            for (final li0.a0 a0Var : list) {
                if (a0Var == li0.a0.f112608h || a0Var == li0.a0.f112610j) {
                    mVar.C(1622079024);
                    d92.b.f58623a.getClass();
                    jE = d92.b.a(mVar).k().e();
                } else {
                    mVar.C(1622079952);
                    d92.b.f58623a.getClass();
                    jE = d92.b.a(mVar).k().b();
                }
                mVar.f();
                final long j8 = jE;
                z3.e eVarC = z3.f.c(2141423353, new e23.p() { // from class: li0.u
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i16 = i14;
                        a0 a0Var2 = a0Var;
                        switch (i16) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    mh.c(gl1.y.Q(mVar2, a0Var2.f112613a), null, j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262138);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    u4.d dVar = a0Var2.f112614b;
                                    if (dVar == null) {
                                        mVar3.C(760641865);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(760641866);
                                        i7.b(dVar, null, null, j8, mVar3, 48, 4);
                                        mVar3.f();
                                    }
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar);
                boolean zB = mVar.B(aVar) | mVar.k(a0Var.ordinal()) | mVar.r(fVar) | mVar.r(context) | mVar.r(d0Var);
                Object objQ = mVar.q();
                if (zB) {
                    li0.t tVar = new li0.t(aVar, a0Var, fVar, context, d0Var, p1Var, 1);
                    mVar.K(tVar);
                    objQ = tVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        li0.t tVar2 = new li0.t(aVar, a0Var, fVar, context, d0Var, p1Var, 1);
                        mVar.K(tVar2);
                        objQ = tVar2;
                    }
                }
                p3.m mVar2 = mVar;
                i3.u.b(eVarC, (e23.a) objQ, null, z3.f.c(1253294998, new e23.p() { // from class: li0.u
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i16 = i15;
                        a0 a0Var2 = a0Var;
                        switch (i16) {
                            case 0:
                                p3.m mVar3 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    mh.c(gl1.y.Q(mVar3, a0Var2.f112613a), null, j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar3, 0, 0, 262138);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                p3.m mVar4 = (p3.m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    u4.d dVar = a0Var2.f112614b;
                                    if (dVar == null) {
                                        mVar4.C(760641865);
                                        mVar4.f();
                                    } else {
                                        mVar4.C(760641866);
                                        i7.b(dVar, null, null, j8, mVar4, 48, 4);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar4.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), null, false, null, null, mVar2, 3078, 500);
                i15 = i15;
                i14 = i14;
                mVar = mVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x025b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0278  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x0340  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj, Object obj2, Object obj3) {
        p3.m.a aVar;
        p3.m mVar;
        p3.m mVar2;
        nj2.a aVar2 = (nj2.a) this.f3628b;
        x3 x3Var = (x3) this.f3629c;
        lc.y yVar = (lc.y) this.f3630d;
        e23.l lVar = (e23.l) this.f3631e;
        p1 p1Var = (p1) this.f3632f;
        p1 p1Var2 = (p1) this.f3633g;
        h2 h2Var = (h2) obj;
        p3.m mVar3 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar3.B(h2Var) ? 4 : 2;
        }
        if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.l.x(x2.f(aVar3, 1.0f), h2Var), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar3.getU());
            i2 i2VarX = mVar3.x();
            h4.r rVarC = h4.k.c(rVarE, mVar3);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, mVar3);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar3);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar3);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarB = a2.b(c2.l.E(x2.f(aVar3, 1.0f), q1.Max), a2.a(mVar3), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar5 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar5, mVar3, 0);
            int iHashCode2 = Long.hashCode(mVar3.getU());
            i2 i2VarX2 = mVar3.x();
            h4.r rVarC2 = h4.k.c(rVarB, mVar3);
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            b4.c(eVar, zVarA, mVar3);
            b4.c(c1623g, i2VarX2, mVar3);
            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar3);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97917b;
            c2.l.f(x2.q(aVar3, f14), mVar3);
            c2.z zVarA2 = c2.y.a(kVar, aVar5, mVar3, 0);
            int iHashCode3 = Long.hashCode(mVar3.getU());
            i2 i2VarX3 = mVar3.x();
            h4.r rVarC3 = h4.k.c(aVar3, mVar3);
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            b4.c(eVar, zVarA2, mVar3);
            b4.c(c1623g, i2VarX3, mVar3);
            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar3, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, mVar3);
            h4.r rVarB2 = c2.l.B(x2.f(aVar3, 1.0f), f14, f15, f14, f15);
            String strQ = gl1.y.Q(mVar3, R.string.select_address_to_edit);
            j92.f.f97924a.getClass();
            mh.c(strQ, rVarB2, com.nimbusds.jose.shaded.gson.internal.a.x(mVar3), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar3, 0, 0, 131064);
            p3.m mVar4 = mVar3;
            c2.l.f(x2.q(aVar3, f15), mVar4);
            mVar4.C(124242549);
            Iterator it = ((Iterable) x3Var.getF182175a()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                fj2.a aVar6 = (fj2.a) it.next();
                mj2.c.f119091a.getClass();
                String strA = mj2.c.a(aVar6);
                String line1 = aVar6.getLine1();
                if (line1 == null) {
                    mVar4.C(1827048822);
                    mVar4.f();
                    mVar2 = mVar4;
                } else {
                    mVar4.C(1827048823);
                    String strG = e5.g(aVar6.getFirstName(), StringUtils.SPACE, aVar6.getLastName());
                    String line2 = aVar6.getLine2();
                    String line3 = aVar6.getLine3();
                    String line4 = aVar6.getLine4();
                    boolean zB = mVar4.B(lVar) | mVar4.r(aVar6);
                    Object objQ = mVar4.q();
                    if (zB) {
                        objQ = new i0(10, lVar, aVar6);
                        mVar4.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i0(10, lVar, aVar6);
                            mVar4.K(objQ);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ;
                    boolean zR = mVar4.r(aVar6);
                    Object objQ2 = mVar4.q();
                    if (zR) {
                        objQ2 = new kk1.a(aVar6, p1Var, p1Var2, 11);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new kk1.a(aVar6, p1Var, p1Var2, 11);
                            mVar4.K(objQ2);
                        }
                    }
                    p3.m mVar5 = mVar4;
                    kj2.e.a(strG, line1, line2, line3, line4, strA, aVar7, (e23.a) objQ2, mVar5, 0);
                    mVar2 = mVar5;
                    Unit unit = Unit.INSTANCE;
                    mVar2.f();
                }
                mVar4 = mVar2;
            }
            p3.m mVar6 = mVar4;
            mVar6.f();
            h4.r.a aVar8 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            c2.l.f(x2.q(aVar8, eVar3.f97918c), mVar6);
            String strQ2 = gl1.y.Q(mVar6, R.string.cm_add_address);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_plus);
            boolean zB2 = mVar6.B(lVar);
            Object objQ3 = mVar6.q();
            if (zB2) {
                objQ3 = new gt1.k(lVar, 17);
                mVar6.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new gt1.k(lVar, 17);
                    mVar6.K(objQ3);
                }
            }
            kj2.f.a(strQ2, numValueOf, (e23.a) objQ3, mVar6, 0);
            mVar6.y();
            c2.l.f(x2.q(aVar8, eVar3.f97920e), mVar6);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar6.C(-959333480);
                c1 c1Var = c1.f110940a;
                String strQ3 = gl1.y.Q(mVar6, R.string.cm_remove_address);
                String strQ4 = gl1.y.Q(mVar6, R.string.cm_remove_address_message);
                String strQ5 = gl1.y.Q(mVar6, R.string.cm_remove);
                String strQ6 = gl1.y.Q(mVar6, R.string.cm_cancel);
                boolean zR2 = mVar6.r(aVar2) | mVar6.B(x3Var) | mVar6.r(yVar);
                Object objQ4 = mVar6.q();
                if (zR2) {
                    v4 v4Var = new v4(aVar2, x3Var, yVar, p1Var2, p1Var, 19);
                    mVar6.K(v4Var);
                    objQ4 = v4Var;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        v4 v4Var2 = new v4(aVar2, x3Var, yVar, p1Var2, p1Var, 19);
                        mVar6.K(v4Var2);
                        objQ4 = v4Var2;
                    }
                }
                e23.a<Unit> aVar9 = (e23.a) objQ4;
                Object objQ5 = mVar6.q();
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new l51.c(p1Var2, 23);
                    mVar6.K(objQ5);
                }
                mVar = mVar6;
                c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, aVar9, strQ6, (e23.a) objQ5, mVar, 6, 6, 216);
                mVar.f();
            } else {
                mVar = mVar6;
                mVar.C(-958437146);
                mVar.f();
            }
            mVar.y();
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        h4.r rVarC;
        boolean z14;
        final ob0.a aVar = (ob0.a) this.f3628b;
        o0 o0Var = (o0) this.f3629c;
        e23.l lVar = (e23.l) this.f3630d;
        final e23.l lVar2 = (e23.l) this.f3631e;
        final e23.a aVar2 = (e23.a) this.f3632f;
        final e23.l lVar3 = (e23.l) this.f3633g;
        c2.a0 a0Var = (c2.a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97923h;
            float f15 = eVar.f97918c;
            c2.l.f(x2.h(aVar3, f14), mVar);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new m4.b0();
                mVar.K(objQ);
            }
            final m4.b0 b0Var = (m4.b0) objQ;
            final m4.q qVar = (m4.q) mVar.A(t1.f91491i);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = tn.k.c(mVar);
            }
            final a2.j jVar = (a2.j) objQ2;
            d92.b.f58624b.getClass();
            final x0 x0VarB = d92.c.b(j92.f.f97926c, mVar);
            s0 s0VarA = t0.a(mVar);
            g6.c cVar = (g6.c) mVar.A(t1.f91490h);
            mVar.C(-1341044988);
            float fC1 = cVar.c1(((int) (((h4) mVar.A(t1.f91503u)).b() >> 32)) / 2);
            mVar.f();
            l0 l0Var = aVar.f131100a;
            boolean z15 = aVar.f131102c;
            boolean z16 = aVar.f131101b;
            String str = l0Var.f188878a.f157138b;
            boolean zB = mVar.B(x0VarB) | mVar.B(str);
            Object objQ3 = mVar.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = g6.f.a(cVar.c1((int) (s0.a(s0VarA, str, x0VarB, 0L, 1020).f157282c >> 32)));
                mVar.K(objQ3);
            }
            final float f16 = ((g6.f) r13.b.e(g6.f.a(((g6.f) objQ3).f75997a), g6.f.a(fC1))).f75997a + f15;
            o0Var.getClass();
            int[] iArr = ob0.b.f131103a;
            final String strQ = gl1.y.Q(mVar, iArr[o0Var.ordinal()] == 1 ? R.string.lbl_kg : R.string.lbl_lbs);
            final String strQ2 = gl1.y.Q(mVar, iArr[o0Var.ordinal()] == 1 ? R.string.lbl_kilograms : R.string.lbl_pounds);
            z2.t2 t2Var = new z2.t2(zl.a.a(mVar), o4.d0.c(0.4f, d92.b.a(mVar).k().b(), 14), null);
            if (z16 || !z15) {
                mVar.C(1378505128);
                mVar.f();
                rVarC = aVar3;
            } else {
                mVar.C(1378220455);
                u1.u uVarA = u1.n.a(eVar.f97916a, d92.b.a(mVar).e().h());
                rVarC = u1.q.c(uVarA.f167683a, aVar3, uVarA.f167684b, k2.i.a(j92.b.f97900c.f97912d));
                mVar.f();
            }
            final h4.r rVar = rVarC;
            p3.v.a(z2.u2.f201804a.c(t2Var), z3.f.c(2029757946, new e23.p() { // from class: ob0.d
                /* JADX WARN: Code duplicated, block: B:23:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:28:0x012b  */
                /* JADX WARN: Code duplicated, block: B:33:0x0166  */
                /* JADX WARN: Code duplicated, block: B:38:0x01dd  */
                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) {
                    m mVar2 = (m) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        r.a aVar4 = r.S;
                        long jZ = fb1.c.z(d92.b.f58623a, mVar2);
                        d92.b.f58625c.getClass();
                        r rVarThen = u1.n.e(aVar4, jZ, i.a(j92.b.f97900c.f97912d)).then(rVar);
                        j92.e eVar2 = j92.b.f97899b;
                        r rVarY = l.y(rVarThen, eVar2.f97920e);
                        j.f22691a.getClass();
                        j.C0343j c0343j = j.f22692b;
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC2 = k.c(rVarY, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        u2 u2Var = u2.f22900a;
                        r rVarA = m4.e.a(x2.u(aVar4, f16), b0Var);
                        e23.l lVar4 = lVar2;
                        boolean zB2 = mVar2.B(lVar4);
                        Object objQ4 = mVar2.q();
                        m.a aVar6 = m.f135153a;
                        if (zB2) {
                            objQ4 = new na0.l(lVar4, 17);
                            mVar2.K(objQ4);
                        } else {
                            aVar6.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new na0.l(lVar4, 17);
                                mVar2.K(objQ4);
                            }
                        }
                        r rVarB = m4.e.b(rVarA, (e23.l) objQ4);
                        u2Var.getClass();
                        p pVar = f5.b.f68892a;
                        r rVarD = u2Var.d(rVarB, pVar);
                        l0 l0Var2 = aVar.f131100a;
                        v.f188954b.getClass();
                        int i14 = v.f188957e;
                        x5.p.f188918b.getClass();
                        p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i14, x5.p.f188926j, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        q qVar2 = qVar;
                        boolean zR = mVar2.r(qVar2);
                        e23.a aVar7 = aVar2;
                        boolean zB3 = zR | mVar2.B(aVar7);
                        Object objQ5 = mVar2.q();
                        if (zB3) {
                            objQ5 = new e11.s(qVar2, aVar7, 1);
                            mVar2.K(objQ5);
                        } else {
                            aVar6.getClass();
                            if (objQ5 == m.a.f135155b) {
                                objQ5 = new e11.s(qVar2, aVar7, 1);
                                mVar2.K(objQ5);
                            }
                        }
                        z1 z1Var = new z1((e23.l) objQ5, null, null, null, null, null, 62, null);
                        o4.t1 t1Var = new o4.t1(zl.a.a(mVar2), null);
                        e23.l lVar5 = lVar3;
                        boolean zB4 = mVar2.B(lVar5);
                        Object objQ6 = mVar2.q();
                        if (zB4) {
                            objQ6 = new na0.l(lVar5, 18);
                            mVar2.K(objQ6);
                        } else {
                            aVar6.getClass();
                            if (objQ6 == m.a.f135155b) {
                                objQ6 = new na0.l(lVar5, 18);
                                mVar2.K(objQ6);
                            }
                        }
                        p006l2.r.c(l0Var2, (e23.l) objQ6, rVarD, false, false, x0VarB, a2Var, z1Var, true, 0, 0, null, null, jVar, t1Var, null, mVar2, 102236160, 3072, 40472);
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                        r rVarD2 = u2Var.d(l.C(aVar4, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), pVar);
                        String str2 = strQ2;
                        boolean zB5 = mVar2.B(str2);
                        Object objQ7 = mVar2.q();
                        if (zB5) {
                            objQ7 = new o60.b(str2, 2);
                            mVar2.K(objQ7);
                        } else {
                            aVar6.getClass();
                            if (objQ7 == m.a.f135155b) {
                                objQ7 = new o60.b(str2, 2);
                                mVar2.K(objQ7);
                            }
                        }
                        mh.c(strQ, p5.v.c((e23.l) objQ7, rVarD2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 131068);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, mVar), mVar, 56);
            h4.r rVarY = c2.l.y(aVar3, f15);
            w13.c cVar2 = o0.f77290i;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : cVar2) {
                if (((o0) obj4) != o0.STATUTE_UK) {
                    arrayList.add(obj4);
                }
            }
            c2.j.f22691a.getClass();
            c2.j.c cVar3 = c2.j.f22696f;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarB2 = d92.c.b(x0Var, mVar);
            i1 i1Var = new i1(11);
            boolean zB2 = mVar.B(lVar);
            Object objQ4 = mVar.q();
            if (zB2 || objQ4 == p3.m.a.f135155b) {
                objQ4 = new na0.l(lVar, 16);
                mVar.K(objQ4);
            }
            da0.t.a(rVarY, cVar3, 0, o0Var, arrayList, x0VarB2, i1Var, (e23.l) objQ4, mVar, 48);
            if (z16 || !z15) {
                z14 = true;
                mVar.C(1382026728);
                mVar.f();
            } else {
                mVar.C(1381246396);
                h4.r.a aVar4 = h4.r.S;
                h4.r rVarF = x2.f(aVar4, 1.0f);
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC2 = h4.k.c(rVarF, mVar);
                h5.g.V.getClass();
                h5.e0.a aVar5 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar);
                u2 u2Var = u2.f22900a;
                d92.b.f58625c.getClass();
                h4.r rVarC3 = c2.l.C(x2.q(aVar4, j92.b.f97901d.f97905d), 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                s62.a.f157643a.getClass();
                y0.b(s9.a(t62.b.f162798a), null, rVarC3, null, mVar, 48, 120);
                int[] iArr2 = ob0.b.f131103a;
                z14 = true;
                mh.c(gl1.y.P(R.string.lbl_weight_value_range, new Object[]{Integer.valueOf(iArr2[o0Var.ordinal()] == 1 ? 1 : 2), Integer.valueOf(iArr2[o0Var.ordinal()] == 1 ? 453 : 999), strQ}, mVar), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131070);
                mVar.y();
                mVar.f();
            }
            h4.r.a aVar6 = h4.r.S;
            c2.l.f(a0Var.a(aVar6, 1.0f, z14), mVar);
            mh.c(gl1.y.Q(mVar, R.string.msg_profile_information_privacy), x2.f(aVar6, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 48, 0, 131068);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        o53.b0 b0Var = (o53.b0) this.f3628b;
        e23.p pVar = (e23.p) this.f3629c;
        k31.c cVar = (k31.c) this.f3630d;
        fe feVar = (fe) this.f3631e;
        String str = (String) this.f3632f;
        String str2 = (String) this.f3633g;
        e23.a aVar = (e23.a) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.r(aVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean zR = mVar.r(b0Var) | mVar.B(pVar) | mVar.k(cVar.ordinal()) | mVar.B(feVar) | mVar.B(str) | mVar.B(str2) | ((iIntValue & 14) == 4);
            Object objQ = mVar.q();
            if (zR) {
                r31.e eVar = new r31.e(b0Var, pVar, cVar, feVar, str, str2, aVar, null);
                mVar.K(eVar);
                objQ = eVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    r31.e eVar2 = new r31.e(b0Var, pVar, cVar, feVar, str, str2, aVar, null);
                    mVar.K(eVar2);
                    objQ = eVar2;
                }
            }
            p3.l0.e((e23.p) objQ, unit, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x0168  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c4  */
    private final Object l(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f3628b;
        e23.p pVar = (e23.p) this.f3629c;
        dy1.v vVar = (dy1.v) this.f3631e;
        e23.p pVar2 = (e23.p) this.f3632f;
        Context context = (Context) this.f3630d;
        e23.l lVar2 = (e23.l) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i14 = 16;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_stp_workout_steps);
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new me2.d(lVar, i14);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new me2.d(lVar, i14);
                    mVar.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zB2 = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new me2.d(lVar, 17);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new me2.d(lVar, 17);
                    mVar.K(objQ2);
                }
            }
            rx1.l.a(0, aVar2, (e23.a) objQ2, null, strQ, null, mVar, false);
            e2.i0 i0VarA = k0.a(0, 0, 3, mVar);
            boolean zB3 = mVar.B(pVar);
            Object objQ3 = mVar.q();
            if (zB3) {
                objQ3 = new rx1.h.b(pVar, 1, null);
                mVar.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new rx1.h.b(pVar, 1, null);
                    mVar.K(objQ3);
                }
            }
            h0 h0VarB = j02.d0.b(i0VarA, (e23.r) objQ3, mVar);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            h4.r rVarA = c2.b0.f22601a.a(x2.f(aVar3, 1.0f), 1.0f, false);
            boolean zR = mVar.r(vVar) | mVar.B(pVar2) | mVar.B(h0VarB) | mVar.r(context) | mVar.B(lVar2);
            Object objQ4 = mVar.q();
            if (zR) {
                rx1.g gVar = new rx1.g(vVar, pVar2, h0VarB, context, lVar2);
                mVar.K(gVar);
                objQ4 = gVar;
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    rx1.g gVar2 = new rx1.g(vVar, pVar2, h0VarB, context, lVar2);
                    mVar.K(gVar2);
                    objQ4 = gVar2;
                }
            }
            e2.c.b(rVarA, i0VarA, null, null, null, null, false, null, (e23.l) objQ4, mVar, 0, 508);
            String strP = gl1.y.P(R.string.lbl_estimated_workout_time, new Object[]{vVar.b(mVar)}, mVar);
            h4.r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA2 = c2.l.A(c2.l.A(rVarF, eVar.f97921f, 0.0f, 2), 0.0f, eVar.f97920e, 1);
            boolean zB4 = mVar.B(strP);
            Object objQ5 = mVar.q();
            if (zB4) {
                objQ5 = new o60.b(strP, 26);
                mVar.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new o60.b(strP, 26);
                    mVar.K(objQ5);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ5, rVarA2, false);
            String strP2 = gl1.y.P(R.string.lbl_est_workout_time, new Object[]{vVar.b(mVar)}, mVar);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97933j, mVar);
            d6.h.f57752b.getClass();
            mh.c(strP2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2, Object obj3) {
        h4.r.a aVar;
        t50.e eVar = (t50.e) this.f3628b;
        e23.l lVar = (e23.l) this.f3629c;
        p1 p1Var = (p1) this.f3630d;
        p1 p1Var2 = (p1) this.f3631e;
        p1 p1Var3 = (p1) this.f3632f;
        n1 n1Var = (n1) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((h2) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar2, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pp.b(p1Var, 22);
                mVar.K(objQ);
            }
            mVar.L(1765406104);
            g8.a.a(c50.i.class, aVar2, g8.i.U(mVar), Bundle.EMPTY, (e23.l) objQ, mVar, 24576, 0);
            mVar.R();
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar.C(-2095376724);
                Drawable drawable = (Drawable) p1Var3.getF182175a();
                if (drawable == null) {
                    mVar.C(-532169003);
                    mVar.f();
                    aVar = aVar2;
                } else {
                    mVar.C(-532169002);
                    h4.r rVarC2 = c2.l.C(uVar.c(aVar2, h4.d.a.f81528f), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar, n1Var.getIntValue()), 7);
                    t4.d dVarRememberDrawablePainter = DrawablePainter2Kt.rememberDrawablePainter(drawable, mVar, 0);
                    aVar = aVar2;
                    y0.a(dVarRememberDrawablePainter, null, rVarC2, null, null, 0.0f, null, mVar, 48, 120);
                    mVar = mVar;
                    mVar.f();
                }
                mVar.f();
            } else {
                aVar = aVar2;
                mVar.C(-531760019);
                mVar.f();
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = v2.a(c2.l.y(aVar, j92.b.f97899b.f97920e), eVar.f162542b, new s50.b(0), mVar, 0);
            k2.h hVar = k2.i.f102406a;
            long j8 = d92.b.a(mVar).f().f63508c;
            long j14 = d92.b.a(mVar).f().f63509d;
            boolean zB = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new me2.d(lVar, 25);
                mVar.K(objQ2);
            }
            s50.a.f157338a.getClass();
            p3.m mVar2 = mVar;
            d7.d((e23.a) objQ2, rVarA, hVar, j8, j14, null, s50.a.f157339b, mVar2, 12582912, 96);
            mVar2.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    private final Object o(Object obj, Object obj2, Object obj3) {
        ?? T;
        Set set = (Set) this.f3628b;
        Set set2 = (Set) this.f3630d;
        p1 p1Var = (p1) this.f3631e;
        List list = (List) this.f3632f;
        sc.h hVar = (sc.h) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(set);
            Object obj4 = this.f3629c;
            boolean zR2 = zR | mVar.r(obj4) | mVar.r(set2) | mVar.B(p1Var);
            Object objQ = mVar.q();
            if (zR2) {
                objQ = new mt0.e0(set, obj4, set2, p1Var, 25);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mt0.e0(set, obj4, set2, p1Var, 25);
                    mVar.K(objQ);
                }
            }
            p3.l0.a(obj4, (e23.l) objQ, mVar);
            mVar.C(358947325);
            if (list instanceof RandomAccess) {
                u0 u0Var = new u0(list.size());
                T = new ArrayList(list.size());
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj5 = list.get(i14);
                    if (u0Var.d(obj5)) {
                        T.add(obj5);
                    }
                }
            } else {
                T = p13.h0.T(list);
            }
            if (!T.isEmpty()) {
                ListIterator listIterator = T.listIterator(T.size());
                while (listIterator.hasPrevious()) {
                    hVar = new sc.h(hVar, z3.f.c(-330823412, new ry0.g(7, (sc.i) listIterator.previous(), hVar), mVar));
                }
            }
            mVar.f();
            hVar.a(mVar, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:31:0x0115  */
    /* JADX WARN: Code duplicated, block: B:34:0x0129  */
    /* JADX WARN: Code duplicated, block: B:35:0x0153  */
    /* JADX WARN: Code duplicated, block: B:38:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x0205  */
    /* JADX WARN: Code duplicated, block: B:41:0x0209  */
    /* JADX WARN: Code duplicated, block: B:46:0x0226  */
    /* JADX WARN: Code duplicated, block: B:49:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x040d  */
    /* JADX WARN: Code duplicated, block: B:81:0x041b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0423  */
    /* JADX WARN: Code duplicated, block: B:86:0x0428  */
    /* JADX WARN: Code duplicated, block: B:89:0x046b  */
    /* JADX WARN: Code duplicated, block: B:91:0x046f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0473  */
    private final Object q(Object obj, Object obj2, Object obj3) {
        Float f14;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        h4.g.b bVar;
        c2.j.C0343j c0343j;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        u2 u2Var;
        String strQ;
        x0 x0Var;
        j92.e eVar;
        h4.g.b bVar2;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        p3.m mVar;
        h5.g.a.b bVar3;
        s2 s2VarA3;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        String str;
        p3.m mVar2;
        Float f15 = (Float) this.f3628b;
        double d14 = ((lt2.a) this.f3629c).f114867b;
        ag2.c.a aVar = (ag2.c.a) this.f3630d;
        ah2.e eVar2 = (ah2.e) this.f3631e;
        String str2 = (String) this.f3632f;
        String str3 = (String) this.f3633g;
        p3.m mVar3 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar3, 48);
            int iHashCode4 = Long.hashCode(mVar3.getU());
            i2 i2VarX4 = mVar3.x();
            h4.r rVarC4 = h4.k.c(rVarF, mVar3);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, mVar3);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX4, mVar3);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar3.getT()) {
                f14 = f15;
            } else {
                f14 = f15;
                if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, mVar3);
                b0Var = c2.b0.f22601a;
                h4.r rVarA = b0Var.a(aVar2, 0.2f, true);
                bVar = h4.d.a.f81535m;
                c0343j = c2.j.f22692b;
                s2VarA = q2.a(c0343j, bVar, mVar3, 48);
                iHashCode = Long.hashCode(mVar3.getU());
                i2VarX = mVar3.x();
                rVarC = h4.k.c(rVarA, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar4);
                } else {
                    mVar3.c();
                }
                b4.c(eVar3, s2VarA, mVar3);
                b4.c(c1623g, i2VarX, mVar3);
                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, mVar3);
                u2Var = u2.f22900a;
                strQ = gl1.y.Q(mVar3, aVar.f3219b);
                if (strQ.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    String strValueOf = String.valueOf(strQ.charAt(0));
                    strValueOf.getClass();
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb3.append((Object) upperCase);
                    sb3.append(strQ.substring(1));
                    strQ = sb3.toString();
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0Var = j92.f.f97931h;
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar3), mVar3, 0, 0, 131070);
                mVar3.y();
                d92.b.f58625c.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarC5 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, eVar.f97920e, 5);
                bVar2 = h4.d.a.f81533k;
                s2VarA2 = q2.a(c0343j, bVar2, mVar3, 0);
                iHashCode2 = Long.hashCode(mVar3.getU());
                i2VarX2 = mVar3.x();
                rVarC2 = h4.k.c(rVarC5, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar4);
                } else {
                    mVar3.c();
                }
                b4.c(eVar3, s2VarA2, mVar3);
                b4.c(c1623g, i2VarX2, mVar3);
                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, mVar3);
                mh.c(eVar2.f3289a, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(d92.c.b(j92.f.f97928e, mVar3), 0L, o53.f0.B(48), null, null, 0L, null, null, 0, 0L, null, null, 16777213), mVar3, 0, 0, 131070);
                mVar = mVar3;
                if (str2 == null) {
                    mVar.C(-995264338);
                    mVar.f();
                    bVar3 = bVar4;
                } else {
                    mVar.C(-995264337);
                    x0 x0VarB = d92.c.b(x0Var, mVar);
                    bVar3 = bVar4;
                    mh.c(str2, u2Var.c(c2.l.y(aVar2, eVar.f97918c), bVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                    mVar = mVar;
                    mVar.f();
                }
                mVar.y();
                if (f14 != null || d14 <= 0.0d) {
                    mVar.C(-1716484014);
                    h4.r rVarA2 = b0Var.a(r3, 0.2f, true);
                    s2VarA3 = q2.a(c0343j, bVar2, mVar, 48);
                    iHashCode3 = Long.hashCode(mVar.getU());
                    i2VarX3 = mVar.x();
                    rVarC3 = h4.k.c(rVarA2, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(r7, s2VarA3, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = str3;
                    }
                    x0 x0VarF = d92.c.f(x0Var, mVar);
                    float f16 = eVar.f97916a;
                    mVar2 = mVar;
                    mh.c(str, c2.l.C(r3, f16, 0.0f, 0.0f, f16, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    mVar2.y();
                    mVar2.f();
                } else {
                    mVar.C(-1717107486);
                    h4.r rVarA3 = b0Var.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0.2f, true);
                    s2 s2VarA4 = q2.a(c0343j, bVar2, mVar, 48);
                    int iHashCode5 = Long.hashCode(mVar.getU());
                    i2 i2VarX5 = mVar.x();
                    h4.r rVarC6 = h4.k.c(rVarA3, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar3, s2VarA4, mVar);
                    b4.c(c1623g, i2VarX5, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar, iHashCode5, bVar3);
                    }
                    b4.c(fVar, rVarC6, mVar);
                    p3.m mVar4 = mVar;
                    y2 y2Var = y2.f111386a;
                    gl.c.f77766a.getClass();
                    long jC = gl.c.a(mVar4).c();
                    float fFloatValue = (float) (((double) f14.floatValue()) / d14);
                    mg2.w.f118432a.getClass();
                    y2Var.a(fFloatValue, mg2.w.f118438g, 0, 196656, 84, jC, 0L, x2.f(aVar2, 0.9f), mVar4);
                    mVar4.y();
                    mVar4.f();
                    mVar2 = mVar4;
                }
                mVar2.y();
            }
            v.h.z(iHashCode4, mVar3, iHashCode4, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, mVar3);
            b0Var = c2.b0.f22601a;
            h4.r rVarA4 = b0Var.a(aVar2, 0.2f, true);
            bVar = h4.d.a.f81535m;
            c0343j = c2.j.f22692b;
            s2VarA = q2.a(c0343j, bVar, mVar3, 48);
            iHashCode = Long.hashCode(mVar3.getU());
            i2VarX = mVar3.x();
            rVarC = h4.k.c(rVarA4, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            b4.c(eVar3, s2VarA, mVar3);
            b4.c(c1623g, i2VarX, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar4);
            } else {
                v.h.z(iHashCode, mVar3, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, mVar3);
            u2Var = u2.f22900a;
            strQ = gl1.y.Q(mVar3, aVar.f3219b);
            if (strQ.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                String strValueOf2 = String.valueOf(strQ.charAt(0));
                strValueOf2.getClass();
                String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                sb4.append((Object) upperCase2);
                sb4.append(strQ.substring(1));
                strQ = sb4.toString();
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0Var = j92.f.f97931h;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar3), mVar3, 0, 0, 131070);
            mVar3.y();
            d92.b.f58625c.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarC7 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, eVar.f97920e, 5);
            bVar2 = h4.d.a.f81533k;
            s2VarA2 = q2.a(c0343j, bVar2, mVar3, 0);
            iHashCode2 = Long.hashCode(mVar3.getU());
            i2VarX2 = mVar3.x();
            rVarC2 = h4.k.c(rVarC7, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            b4.c(eVar3, s2VarA2, mVar3);
            b4.c(c1623g, i2VarX2, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
            } else {
                v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, mVar3);
            mh.c(eVar2.f3289a, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(d92.c.b(j92.f.f97928e, mVar3), 0L, o53.f0.B(48), null, null, 0L, null, null, 0, 0L, null, null, 16777213), mVar3, 0, 0, 131070);
            mVar = mVar3;
            if (str2 == null) {
                mVar.C(-995264338);
                mVar.f();
                bVar3 = bVar4;
            } else {
                mVar.C(-995264337);
                x0 x0VarB2 = d92.c.b(x0Var, mVar);
                bVar3 = bVar4;
                mh.c(str2, u2Var.c(c2.l.y(aVar2, eVar.f97918c), bVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar, 0, 0, 131068);
                mVar = mVar;
                mVar.f();
            }
            mVar.y();
            if (f14 != null) {
                mVar.C(-1716484014);
                h4.r rVarA5 = b0Var.a(r3, 0.2f, true);
                s2VarA3 = q2.a(c0343j, bVar2, mVar, 48);
                iHashCode3 = Long.hashCode(mVar.getU());
                i2VarX3 = mVar.x();
                rVarC3 = h4.k.c(rVarA5, mVar);
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                b4.c(r7, s2VarA3, mVar);
                b4.c(c1623g, i2VarX3, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                } else {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, mVar);
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                x0 x0VarF2 = d92.c.f(x0Var, mVar);
                float f17 = eVar.f97916a;
                mVar2 = mVar;
                mh.c(str, c2.l.C(r3, f17, 0.0f, 0.0f, f17, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 131068);
                mVar2.y();
                mVar2.f();
            } else {
                mVar.C(-1716484014);
                h4.r rVarA6 = b0Var.a(r3, 0.2f, true);
                s2VarA3 = q2.a(c0343j, bVar2, mVar, 48);
                iHashCode3 = Long.hashCode(mVar.getU());
                i2VarX3 = mVar.x();
                rVarC3 = h4.k.c(rVarA6, mVar);
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                b4.c(r7, s2VarA3, mVar);
                b4.c(c1623g, i2VarX3, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                } else {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, mVar);
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                x0 x0VarF3 = d92.c.f(x0Var, mVar);
                float f18 = eVar.f97916a;
                mVar2 = mVar;
                mh.c(str, c2.l.C(r3, f18, 0.0f, 0.0f, f18, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, mVar2, 0, 0, 131068);
                mVar2.y();
                mVar2.f();
            }
            mVar2.y();
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        Float f14;
        Float f15;
        lt2.a aVar = (lt2.a) this.f3628b;
        o13.p pVar = (o13.p) this.f3629c;
        ah2.e eVar = (ah2.e) this.f3630d;
        String str = (String) this.f3631e;
        String str2 = (String) this.f3632f;
        String str3 = (String) this.f3633g;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            double dFloatValue = 0.0d;
            if (aVar.f114868c == mt2.b.ABOVE) {
                mVar.C(-2104321964);
                gl.c.f77766a.getClass();
                List listK = p13.x.k(o4.d0.a(gl.c.a(mVar).l()), o4.d0.a(gl.c.a(mVar).e()));
                if (eVar != null && (f15 = eVar.f3290b) != null) {
                    dFloatValue = f15.floatValue();
                }
                sg2.n.a(null, listK, 1, pVar, dFloatValue, str, str2, str3, null, mVar, 100663680);
                mVar.f();
            } else {
                mVar.C(-2103812076);
                gl.c.f77766a.getClass();
                List listK2 = p13.x.k(o4.d0.a(gl.c.a(mVar).e()), o4.d0.a(gl.c.a(mVar).l()));
                if (eVar != null && (f14 = eVar.f3290b) != null) {
                    dFloatValue = f14.floatValue();
                }
                sg2.n.a(null, listK2, 0, pVar, dFloatValue, str, str2, str3, null, mVar, 100663680);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object s(Object obj, Object obj2, Object obj3) {
        p1 p1Var;
        p3.m mVar;
        e23.l lVar = (e23.l) this.f3628b;
        hv.a aVar = (hv.a) this.f3629c;
        n1 n1Var = (n1) this.f3630d;
        p1 p1Var2 = (p1) this.f3631e;
        p1 p1Var3 = (p1) this.f3632f;
        String str = (String) this.f3633g;
        c2.a0 a0Var = (c2.a0) obj;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(a0Var) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarA = a0Var.a(x2.f(x80.c.a(aVar2, lVar), 1.0f), 0.6f, true);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarA, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            mVar2.N(1492215251, mVar2.G(0, Integer.valueOf(n1Var.getIntValue())));
            tb0.k.a(x2.f(aVar2, 1.0f), aVar, n1Var.getIntValue(), ((Boolean) p1Var2.getF182175a()).booleanValue(), mVar2, 390);
            mVar2.Q();
            h4.r rVarF = x2.f(aVar2, 1.0f);
            boolean zR = mVar2.r(aVar);
            Object objQ = mVar2.q();
            if (zR) {
                p1Var = p1Var3;
                mVar = mVar2;
                t42.l lVar2 = new t42.l(aVar, p1Var, n1Var, p1Var2, 3);
                mVar.K(lVar2);
                objQ = lVar2;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    p1Var = p1Var3;
                    mVar = mVar2;
                    t42.l lVar3 = new t42.l(aVar, p1Var, n1Var, p1Var2, 3);
                    mVar.K(lVar3);
                    objQ = lVar3;
                } else {
                    p1Var = p1Var3;
                    mVar = mVar2;
                }
            }
            tb0.k.d(rVarF, aVar, (e23.l) objQ, mVar, 390);
            mVar.y();
            h4.r rVarA2 = a0Var.a(x2.f(aVar2, 1.0f), 0.4f, true);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarA2, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            p3.m mVar3 = mVar;
            ub0.b.a(c2.b0.f22601a, new ba0.a((String) p1Var.getF182175a(), gl1.y.Q(mVar, R.string.sensor_indicator_pairing)), gl1.y.Q(mVar, R.string.common_learn_more), str, mVar3, 6);
            mVar3.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object u(Object obj, Object obj2, Object obj3) {
        tn.m mVar = (tn.m) this.f3628b;
        Context context = (Context) this.f3630d;
        m0 m0Var = (m0) this.f3629c;
        p1 p1Var = (p1) this.f3631e;
        p1 p1Var2 = (p1) this.f3632f;
        p1 p1Var3 = (p1) this.f3633g;
        h2 h2Var = (h2) obj;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = tn.m.f165476e;
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(h2Var) ? 4 : 2;
        }
        int i15 = 1;
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarX = c2.l.x(u1.n.e(x2.c(aVar, 1.0f), tn.k.a(d92.b.f58623a, mVar2), m1.f128891a), h2Var);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarX, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            String str = (String) p1Var.getF182175a();
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 24, 0.0f, 0.0f, 13);
            String str2 = mVar.f165478b;
            boolean zR = mVar2.r(mVar) | mVar2.r(context);
            Object objQ = mVar2.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new t42.l(mVar, context, p1Var, p1Var2);
                mVar2.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t42.l(mVar, context, p1Var, p1Var2);
                    mVar2.K(objQ);
                }
            }
            int i16 = 24;
            l72.p1.a(str, rVarC2, str2, 75, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ, mVar2, 3120, 0, 16368);
            boolean zR2 = mVar2.r(mVar) | mVar2.r(m0Var);
            Object objQ2 = mVar2.q();
            if (zR2) {
                objQ2 = new sg0.j(mVar, i16, m0Var, p1Var3);
                mVar2.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new sg0.j(mVar, i16, m0Var, p1Var3);
                    mVar2.K(objQ2);
                }
            }
            c.w.a(6, 0, (e23.a) objQ2, mVar2, true);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                mVar2.C(-833582553);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(mVar2, R.string.message_common_confirm_leaving_screen);
                String strQ2 = gl1.y.Q(mVar2, R.string.lbl_ok);
                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                boolean zR3 = mVar2.r(m0Var);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new s8(m0Var, p1Var3, 8);
                    mVar2.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new s8(m0Var, p1Var3, 8);
                        mVar2.K(objQ3);
                    }
                }
                e23.a<Unit> aVar5 = (e23.a) objQ3;
                Object objQ4 = mVar2.q();
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new tn.h(p1Var3, i15);
                    mVar2.K(objQ4);
                }
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, aVar5, strQ3, (e23.a) objQ4, mVar2, 6, 6, 218);
                mVar2.f();
            } else {
                mVar2.C(-832972721);
                mVar2.f();
            }
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        m12.s.c cVar = (m12.s.c) this.f3628b;
        Context context = (Context) this.f3630d;
        String str = (String) this.f3629c;
        p1 p1Var = (p1) this.f3631e;
        e23.l lVar = (e23.l) this.f3632f;
        n1 n1Var = (n1) this.f3633g;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            int i14 = 13;
            if (objQ == c2565a) {
                objQ = new a3(n1Var, 13);
                mVar.K(objQ);
            }
            h4.r rVarG = f5.g0.g(rVar, (e23.l) objQ);
            String strA = cVar.a(context);
            String strB = cVar.b(context);
            z3.e eVarC = z3.f.c(2089687448, new w12.e(cVar, 1), mVar);
            boolean zB = mVar.B(p1Var) | mVar.B(lVar) | mVar.B(cVar);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new ug2.b0(lVar, cVar, p1Var, i14);
                mVar.K(objQ2);
            }
            x12.a.a(rVarG, strA, strB, str, eVarC, (e23.a) objQ2, mVar, 24576, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    private final Object w(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f3628b;
        CustomBarChart customBarChart = (CustomBarChart) this.f3629c;
        p1 p1Var = (p1) this.f3630d;
        rz.a aVar = (rz.a) this.f3631e;
        gs1.t tVar = (gs1.t) this.f3632f;
        String str = (String) this.f3633g;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(rVar, 1.0f), 320);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            boolean zB = mVar.B(lVar) | mVar.r(customBarChart);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new vv0.n(26, lVar, customBarChart);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vv0.n(26, lVar, customBarChart);
                    mVar.K(objQ);
                }
            }
            h4.r rVarB = wz1.i.b(rVarA, (e23.a) objQ, mVar);
            boolean zR = mVar.r(customBarChart);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new di0.c(customBarChart, 8);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new di0.c(customBarChart, 8);
                    mVar.K(objQ2);
                }
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean zB2 = mVar.B(p1Var) | mVar.r(aVar) | mVar.r(tVar) | mVar.B(str);
            Object objQ3 = mVar.q();
            if (zB2) {
                t42.l lVar3 = new t42.l(aVar, tVar, str, p1Var, 28);
                mVar.K(lVar3);
                objQ3 = lVar3;
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    t42.l lVar4 = new t42.l(aVar, tVar, str, p1Var, 28);
                    mVar.K(lVar4);
                    objQ3 = lVar4;
                }
            }
            p002j6.c.b(lVar2, rVarB, (e23.l) objQ3, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0395  */
    /* JADX WARN: Code duplicated, block: B:189:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x059f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0977  */
    /* JADX WARN: Code duplicated, block: B:302:0x0993  */
    /* JADX WARN: Code duplicated, block: B:307:0x09af  */
    /* JADX WARN: Code duplicated, block: B:312:0x09db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:346:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:351:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:360:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:374:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:398:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:403:0x0d15  */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u uVar;
        gv0.d dVar;
        p3.m mVar;
        p3.m mVar2;
        int i14 = this.f3627a;
        int i15 = 2;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f3633g;
        Object obj5 = this.f3632f;
        Object obj6 = this.f3631e;
        Object obj7 = this.f3630d;
        Object obj8 = this.f3629c;
        Object obj9 = this.f3628b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj9;
                b.u uVar2 = (b.u) obj8;
                Context context = (Context) obj7;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj6;
                a aVar2 = (a) obj5;
                sc.f fVar = (sc.f) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    T t7 = g3Var.f35301b;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c cVar = t7 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c ? (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) t7 : null;
                    i53.c<ck0.t> cVar2 = (cVar == null || (uVar = cVar.f35482b) == null) ? null : uVar.f3684f;
                    if (cVar2 != null) {
                        mVar3.C(1479644986);
                        String strQ = gl1.y.Q(mVar3, R.string.exclusive_offers);
                        i3 i3Var = new i3("EXCLUSIVE_OFFERS_HELP", gl1.y.Q(mVar3, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
                        boolean zR = mVar3.r(uVar2);
                        Object objQ = mVar3.q();
                        if (zR) {
                            objQ = new i(uVar2, 3);
                            mVar3.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new i(uVar2, 3);
                                mVar3.K(objQ);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ;
                        boolean zR2 = mVar3.r(context);
                        Object objQ2 = mVar3.q();
                        if (zR2) {
                            objQ2 = new a51.m(context, 1);
                            mVar3.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a51.m(context, 1);
                                mVar3.K(objQ2);
                            }
                        }
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(strQ, i3Var, false, false, aVar3, (e23.l) objQ2, z3.f.c(1443282661, new j((Object) cVar2, (Object) eVar, aVar2, context, (Object) fVar, 2), mVar3), mVar3, 1572928, 12);
                        mVar3.f();
                    } else {
                        mVar3.C(1481471847);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.a aVar4 = (e23.a) obj9;
                String str = (String) obj8;
                x3 x3Var = (x3) obj7;
                wn1.n nVar = (wn1.n) obj6;
                x3 x3Var2 = (x3) obj5;
                e23.a aVar5 = (e23.a) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zB = mVar4.B(aVar4) | mVar4.B(str) | mVar4.B(x3Var) | mVar4.r(nVar) | mVar4.B(x3Var2) | mVar4.B(aVar5);
                    Object objQ3 = mVar4.q();
                    if (zB) {
                        objQ3 = new aa2.p(nVar, aVar4, str, x3Var, x3Var2, aVar5);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new aa2.p(nVar, aVar4, str, x3Var, x3Var2, aVar5);
                            mVar4.K(objQ3);
                        }
                    }
                    e2.c.b(rVarF, null, null, null, null, null, false, null, (e23.l) objQ3, mVar4, 6, 510);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 2:
                Context context2 = (Context) obj7;
                p1 p1Var = (p1) obj9;
                p1 p1Var2 = (p1) obj8;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(t2Var) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ2 = gl1.y.Q(mVar5, R.string.strength_training_set);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    float f15 = eVar2.f97918c;
                    h4.r rVarC = c2.l.C(aVar6, f14, 0.0f, f15, 0.0f, 10);
                    boolean zR3 = mVar5.r(context2);
                    Object objQ4 = mVar5.q();
                    if (zR3) {
                        objQ4 = new as.d(context2, p1Var, 0);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new as.d(context2, p1Var, 0);
                            mVar5.K(objQ4);
                        }
                    }
                    int i16 = iIntValue3 & 14;
                    int i17 = i16 | 196608;
                    d2Var.c(t2Var, strQ2, null, f5.g0.f(rVarC, (e23.l) objQ4), null, 1, 0, mVar5, i17, 42);
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_name);
                    h4.r rVarA = t2Var.a(c2.l.A(aVar6, f15, 0.0f, 2), 1.0f, true);
                    boolean zR4 = mVar5.r(context2);
                    Object objQ5 = mVar5.q();
                    if (zR4) {
                        objQ5 = new as.d(context2, p1Var2, 1);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new as.d(context2, p1Var2, 1);
                            mVar5.K(objQ5);
                        }
                    }
                    d2Var.c(t2Var, strQ3, null, f5.g0.f(rVarA, (e23.l) objQ5), null, 0, 0, mVar5, i16, 58);
                    String strQ4 = gl1.y.Q(mVar5, R.string.lbl_time);
                    h4.r rVarC2 = c2.l.C(aVar6, eVar2.f97917b, 0.0f, eVar2.f97918c, 0.0f, 10);
                    boolean zR5 = mVar5.r(context2);
                    Object objQ6 = mVar5.q();
                    if (zR5) {
                        objQ6 = new as.d(context2, p1Var3, 2);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new as.d(context2, p1Var3, 2);
                            mVar5.K(objQ6);
                        }
                    }
                    d2Var.c(t2Var, strQ4, null, f5.g0.f(rVarC2, (e23.l) objQ6), null, 1, 0, mVar5, i17, 42);
                    String strQ5 = gl1.y.Q(mVar5, R.string.strength_training_reps);
                    h4.r rVarA2 = c2.l.A(aVar6, f15, 0.0f, 2);
                    boolean zR6 = mVar5.r(context2);
                    Object objQ7 = mVar5.q();
                    if (zR6) {
                        objQ7 = new as.d(context2, p1Var4, 3);
                        mVar5.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new as.d(context2, p1Var4, 3);
                            mVar5.K(objQ7);
                        }
                    }
                    d2Var.c(t2Var, strQ5, null, f5.g0.f(rVarA2, (e23.l) objQ7), null, 1, 0, mVar5, i17, 42);
                    String strQ6 = gl1.y.Q(mVar5, R.string.lbl_weight);
                    String strQ7 = gl1.y.Q(mVar5, am.j.z(f12.l.f68084a) ? R.string.lbl_kg : R.string.lbl_lbs);
                    h4.r rVarC3 = c2.l.C(aVar6, eVar2.f97918c, 0.0f, eVar2.f97920e, 0.0f, 10);
                    boolean zR7 = mVar5.r(context2);
                    Object objQ8 = mVar5.q();
                    if (zR7) {
                        objQ8 = new as.d(context2, p1Var5, 4);
                        mVar5.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new as.d(context2, p1Var5, 4);
                            mVar5.K(objQ8);
                        }
                    }
                    d2Var.c(t2Var, strQ6, strQ7, f5.g0.f(rVarC3, (e23.l) objQ8), null, 1, 0, mVar5, i17, 40);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 3:
                gv0.d dVar2 = (gv0.d) obj9;
                yu0.f fVar2 = (yu0.f) obj8;
                sc.f fVar3 = (sc.f) obj4;
                e23.l lVar = (e23.l) obj7;
                e23.a aVar7 = (e23.a) obj6;
                e23.a aVar8 = (e23.a) obj5;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((bv0.a.z) obj).getClass();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zR8 = mVar6.r(fVar3);
                    Object objQ9 = mVar6.q();
                    if (zR8) {
                        objQ9 = new bv0.o(fVar3, 1);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new bv0.o(fVar3, 1);
                            mVar6.K(objQ9);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ9;
                    boolean zR9 = mVar6.r(fVar3);
                    Object objQ10 = mVar6.q();
                    if (zR9) {
                        objQ10 = new bv0.o(fVar3, 2);
                        mVar6.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new bv0.o(fVar3, 2);
                            mVar6.K(objQ10);
                        }
                    }
                    e23.a aVar10 = (e23.a) objQ10;
                    boolean zR10 = mVar6.r(fVar3);
                    Object objQ11 = mVar6.q();
                    if (zR10) {
                        objQ11 = new bv0.o(fVar3, 3);
                        mVar6.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new bv0.o(fVar3, 3);
                            mVar6.K(objQ11);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ11;
                    boolean zR11 = mVar6.r(fVar3) | mVar6.B(aVar7) | mVar6.r(dVar2) | mVar6.B(aVar8);
                    Object objQ12 = mVar6.q();
                    if (zR11) {
                        dVar = dVar2;
                        bv0.c cVar3 = new bv0.c(fVar3, aVar7, dVar, aVar8, 7);
                        mVar6.K(cVar3);
                        objQ12 = cVar3;
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            dVar = dVar2;
                            bv0.c cVar4 = new bv0.c(fVar3, aVar7, dVar, aVar8, 7);
                            mVar6.K(cVar4);
                            objQ12 = cVar4;
                        } else {
                            dVar = dVar2;
                        }
                    }
                    jv0.i.a(dVar, fVar2, aVar9, lVar, aVar10, aVar11, (e23.a) objQ12, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 4:
                e50.d dVar3 = (e50.d) obj9;
                e23.l lVar2 = (e23.l) obj8;
                p1 p1Var6 = (p1) obj7;
                p1 p1Var7 = (p1) obj6;
                p1 p1Var8 = (p1) obj5;
                n1 n1Var = (n1) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((h2) obj).getClass();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC4 = h4.k.c(aVar12, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar13);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar7);
                    c2.u uVar3 = c2.u.f22885a;
                    Object objQ13 = mVar7.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ13 == c2565a) {
                        objQ13 = new a11.m(p1Var6, 6);
                        mVar7.K(objQ13);
                    }
                    mVar7.L(1765406104);
                    g8.a.a(c50.i.class, aVar12, g8.i.U(mVar7), Bundle.EMPTY, (e23.l) objQ13, mVar7, 24576, 0);
                    mVar7.R();
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        mVar7.C(-1702361008);
                        Drawable drawable = (Drawable) p1Var8.getF182175a();
                        if (drawable == null) {
                            mVar7.C(-1233583695);
                            mVar7.f();
                        } else {
                            mVar7.C(-1233583694);
                            y0.a(DrawablePainter2Kt.rememberDrawablePainter(drawable, mVar7, 0), null, c2.l.C(uVar3.c(aVar12, h4.d.a.f81528f), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar7, n1Var.getIntValue()), 7), null, null, 0.0f, null, mVar7, 48, 120);
                            mVar7.f();
                        }
                        mVar7.f();
                    } else {
                        mVar7.C(-1233174711);
                        mVar7.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA3 = v2.a(c2.l.y(aVar12, j92.b.f97899b.f97920e), dVar3.f62991c, new bk0.i(4), mVar7, 0);
                    k2.h hVar = k2.i.f102406a;
                    long j8 = d92.b.a(mVar7).f().f63508c;
                    long j14 = d92.b.a(mVar7).f().f63509d;
                    boolean zB2 = mVar7.B(lVar2);
                    Object objQ14 = mVar7.q();
                    if (zB2 || objQ14 == c2565a) {
                        objQ14 = new a40.a(lVar2, 12);
                        mVar7.K(objQ14);
                    }
                    c50.b.f24466a.getClass();
                    d7.d((e23.a) objQ14, rVarA3, hVar, j8, j14, null, c50.b.f24467b, mVar7, 12582912, 96);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj9;
                m4.b0 b0Var = (m4.b0) obj8;
                p1 p1Var9 = (p1) obj7;
                List list = (List) obj6;
                String str3 = (String) obj5;
                e23.l lVar3 = (e23.l) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c2.w) obj).getClass();
                if (mVar8.n(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    h4.r.a aVar14 = h4.r.S;
                    h4.r rVarY = x2.y(aVar14, null, 3);
                    g6.f.a aVar15 = g6.f.f75994b;
                    h4.r rVarB = l4.k.b(rVarY, k2.i.a(4));
                    d92.b.f58623a.getClass();
                    h4.r rVarE = u1.n.e(rVarB, d92.b.a(mVar8).d().a().b(), m1.f128891a);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar8, 48);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC5 = h4.k.c(rVarE, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar16);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar8);
                    u2 u2Var = u2.f22900a;
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97933j, mVar8);
                    d92.b.f58625c.getClass();
                    mh.c(str2, c2.l.C(aVar14, j92.b.f97899b.f97921f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 131068);
                    Object objQ15 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ15 == c2565a2) {
                        objQ15 = new cr.f(b0Var, p1Var9, 0);
                        mVar8.K(objQ15);
                    }
                    cr.a.f55249a.getClass();
                    h7.a((e23.a) objQ15, null, false, null, null, cr.a.f55250b, mVar8, 1572870, 62);
                    mVar8.y();
                    h4.r rVarI = x2.i(x2.u(aVar14, 300), 0, 250);
                    boolean zBooleanValue = ((Boolean) p1Var9.getF182175a()).booleanValue();
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar8);
                    Object objQ16 = mVar8.q();
                    if (objQ16 == c2565a2) {
                        objQ16 = new z(p1Var9, 26);
                        mVar8.K(objQ16);
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ16, rVarI, 0L, null, null, null, jC, 0.0f, 0.0f, z3.f.c(1665537187, new cr.d(list, str3, lVar3, p1Var9, 0), mVar8), mVar8, 432, 48, 1912);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 6:
                List list2 = (List) obj9;
                i53.c<pv0.d> cVar5 = (i53.c) obj8;
                e23.l lVar4 = (e23.l) obj7;
                o53.b0 b0Var2 = (o53.b0) obj6;
                mc mcVar = (mc) obj5;
                aw0.a aVar17 = (aw0.a) obj4;
                int iIntValue7 = ((Integer) obj).intValue();
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar9.k(iIntValue7) ? 4 : 2;
                }
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    pv0.b bVar4 = (pv0.b) list2.get(iIntValue7);
                    ArrayList arrayList = new ArrayList(p13.y.r(cVar5, 10));
                    for (pv0.d dVar4 : cVar5) {
                        arrayList.add(pv0.d.a(dVar4, aVar17.a(Long.valueOf(dVar4.f141358a), dVar4.f141361d), null, 1015));
                    }
                    i53.c cVarE = i53.a.e(p13.h0.N0(pv0.f.a(arrayList, bVar4), new pv0.e()));
                    if (og2.k.y(bVar4)) {
                        mVar9.C(65796719);
                        boolean zR12 = mVar9.r(b0Var2) | mVar9.B(mcVar);
                        Object objQ17 = mVar9.q();
                        if (zR12) {
                            objQ17 = new cn1.t(b0Var2, mcVar, i15);
                            mVar9.K(objQ17);
                        } else {
                            aVar.getClass();
                            if (objQ17 == p3.m.a.f135155b) {
                                objQ17 = new cn1.t(b0Var2, mcVar, i15);
                                mVar9.K(objQ17);
                            }
                        }
                        wv0.i.g(cVarE, lVar4, (e23.a) objQ17, mVar9, pv0.d.f141356k);
                        mVar9.f();
                    } else {
                        mVar9.C(279229602);
                        wv0.i.d(cVarE, lVar4, mVar9, pv0.d.f141356k);
                        mVar9.f();
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 7:
                fs.f fVar4 = (fs.f) obj9;
                n4.d dVar5 = (n4.d) obj8;
                e23.l lVar5 = (e23.l) obj7;
                e23.a aVar18 = (e23.a) obj6;
                e23.a aVar19 = (e23.a) obj5;
                p3.m1 m1Var = (p3.m1) obj4;
                h4.r rVar = (h4.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                v.h.y(-1662395786, rVar, (Integer) obj3, mVar10);
                x1 x1Var9 = p3.n.f135158a;
                Unit unit = Unit.INSTANCE;
                boolean zR13 = mVar10.r(fVar4) | mVar10.B(dVar5) | mVar10.B(lVar5) | mVar10.B(aVar18) | mVar10.B(aVar19);
                Object objQ18 = mVar10.q();
                if (zR13) {
                    fs.d.a aVar20 = new fs.d.a(lVar5, fVar4, aVar18, aVar19, dVar5, m1Var);
                    mVar10.K(aVar20);
                    objQ18 = aVar20;
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        fs.d.a aVar21 = new fs.d.a(lVar5, fVar4, aVar18, aVar19, dVar5, m1Var);
                        mVar10.K(aVar21);
                        objQ18 = aVar21;
                    }
                }
                h4.r rVarB2 = b5.s0.b(rVar, unit, (PointerInputEventHandler) objQ18);
                mVar10.f();
                return rVarB2;
            case 8:
                return a(obj, obj2, obj3);
            case 9:
                return b(obj, obj2, obj3);
            case 10:
                return c(obj, obj2, obj3);
            case 11:
                jf.j jVar = (jf.j) obj9;
                e23.q qVar = (e23.q) obj8;
                jf.d dVar6 = (jf.d) obj7;
                String str4 = (String) obj6;
                h4.d dVar7 = (h4.d) obj5;
                f5.k kVar = (f5.k) obj4;
                c2.w wVar = (c2.w) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar11.B(wVar) ? 4 : 2;
                }
                if (mVar11.n(1 & iIntValue9, (iIntValue9 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    jVar.g(wVar.getF22927c());
                    qVar.invoke(new jf.q(wVar, dVar6, str4, dVar7, kVar, 1.0f, null, true), mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                return d(obj, obj2, obj3);
            case 13:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                return i(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return n(obj, obj2, obj3);
            case 22:
                return o(obj, obj2, obj3);
            case 23:
                return q(obj, obj2, obj3);
            case 24:
                return r(obj, obj2, obj3);
            case 25:
                return s(obj, obj2, obj3);
            case 26:
                return u(obj, obj2, obj3);
            case 27:
                return v(obj, obj2, obj3);
            case 28:
                return w(obj, obj2, obj3);
            default:
                ArrayList<vf2.e> arrayList2 = (ArrayList) obj9;
                i53.c cVar6 = (i53.c) obj8;
                i53.c cVar7 = (i53.c) obj7;
                e23.l lVar6 = (e23.l) obj6;
                lc.y yVar = (lc.y) obj5;
                p1 p1Var10 = (p1) obj4;
                int iIntValue10 = ((Integer) obj).intValue();
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar12.k(iIntValue10) ? 4 : 2;
                }
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    if (iIntValue10 == 0) {
                        mVar12.C(-1471225714);
                        if (arrayList2.isEmpty()) {
                            mVar = mVar12;
                            mVar.C(-1470544675);
                            mVar.f();
                        } else {
                            mVar12.C(-1471202960);
                            r1.b(gl1.y.Q(mVar12, R.string.common_suggested), null, mVar12, 0, 2);
                            for (vf2.e eVar3 : arrayList2) {
                                String str5 = eVar3.f177933e;
                                if (str5 == null) {
                                    mVar12.C(-1470996160);
                                    mVar12.f();
                                    mVar2 = mVar12;
                                } else {
                                    mVar12.C(-1470996159);
                                    p2 p2Var = p2.f111205a;
                                    boolean zB3 = mVar12.B(lVar6) | mVar12.B(eVar3) | mVar12.r(yVar);
                                    Object objQ19 = mVar12.q();
                                    if (zB3) {
                                        objQ19 = new yg2.l(lVar6, eVar3, yVar, 0);
                                        mVar12.K(objQ19);
                                    } else {
                                        aVar.getClass();
                                        if (objQ19 == p3.m.a.f135155b) {
                                            objQ19 = new yg2.l(lVar6, eVar3, yVar, 0);
                                            mVar12.K(objQ19);
                                        }
                                    }
                                    p3.m mVar13 = mVar12;
                                    p2Var.g(str5, null, null, null, null, false, false, (e23.a) objQ19, mVar13, 0, 254);
                                    mVar2 = mVar13;
                                    Unit unit2 = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                mVar12 = mVar2;
                            }
                            mVar = mVar12;
                            mVar.f();
                        }
                        ArrayList<vf2.e> arrayList3 = new ArrayList();
                        for (Object obj10 : cVar6) {
                            String str6 = ((vf2.e) obj10).f177933e;
                            if (str6 != null && d53.w.z(str6, (String) p1Var10.getF182175a(), true)) {
                                arrayList3.add(obj10);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            mVar.C(-1469673699);
                            mVar.f();
                        } else {
                            mVar.C(-1470325257);
                            r1.b(gl1.y.Q(mVar, R.string.common_recent), null, mVar, 0, 2);
                            for (vf2.e eVar4 : arrayList3) {
                                String str7 = eVar4.f177933e;
                                if (str7 == null) {
                                    mVar.C(-1470125184);
                                    mVar.f();
                                } else {
                                    mVar.C(-1470125183);
                                    p2 p2Var2 = p2.f111205a;
                                    boolean zB4 = mVar.B(lVar6) | mVar.B(eVar4) | mVar.r(yVar);
                                    Object objQ20 = mVar.q();
                                    if (zB4) {
                                        objQ20 = new yg2.l(lVar6, eVar4, yVar, 1);
                                        mVar.K(objQ20);
                                    } else {
                                        aVar.getClass();
                                        if (objQ20 == p3.m.a.f135155b) {
                                            objQ20 = new yg2.l(lVar6, eVar4, yVar, 1);
                                            mVar.K(objQ20);
                                        }
                                    }
                                    p2Var2.g(str7, null, null, null, null, false, false, (e23.a) objQ20, mVar, 0, 254);
                                    Unit unit3 = Unit.INSTANCE;
                                    mVar.f();
                                }
                            }
                            mVar.f();
                        }
                        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                            mVar.C(-1469577320);
                            h4.d.f81522a.getClass();
                            h4.g.a aVar22 = h4.d.a.f81537o;
                            h4.r.a aVar23 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar22, mVar, 48);
                            x1 x1Var12 = p3.n.f135158a;
                            int iHashCode3 = Long.hashCode(mVar.getU());
                            i2 i2VarX3 = mVar.x();
                            h4.r rVarC6 = h4.k.c(aVar23, mVar);
                            h5.g.V.getClass();
                            h5.e0.a aVar24 = h5.g.a.f81805b;
                            if (mVar.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar24);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX3, mVar);
                            h5.g.a.b bVar5 = h5.g.a.f81813j;
                            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar, iHashCode3, bVar5);
                            }
                            b4.c(h5.g.a.f81807d, rVarC6, mVar);
                            c2.b0 b0Var3 = c2.b0.f22601a;
                            b82.n.c(null, StringUtils.SPACE, gl1.y.Q(mVar, R.string.no_suggested_exercises), null, null, mVar, 48, 25);
                            mVar.y();
                            mVar.f();
                        } else {
                            mVar.C(-1469326499);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar12.C(-1469205661);
                        e2.i0 i0VarA = k0.a(0, 0, 3, mVar12);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj11 : cVar7) {
                            String str8 = ((vf2.e) obj11).f177933e;
                            if (str8 != null && d53.w.z(str8, (String) p1Var10.getF182175a(), true)) {
                                arrayList4.add(obj11);
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj12 : arrayList4) {
                            String str9 = ((vf2.e) obj12).f177933e;
                            Character chValueOf = str9 != null ? Character.valueOf(d53.y.p0(str9)) : null;
                            Object arrayList5 = linkedHashMap.get(chValueOf);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                linkedHashMap.put(chValueOf, arrayList5);
                            }
                            ((List) arrayList5).add(obj12);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            Character ch3 = (Character) entry.getKey();
                            if (ch3 != null && Character.isDigit(ch3.charValue())) {
                                linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayListS = p13.y.s(linkedHashMap3.values());
                        if (!arrayListS.isEmpty()) {
                            linkedHashMap2.put('#', arrayListS);
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            Character ch4 = (Character) entry2.getKey();
                            if (ch4 != null && !Character.isDigit(ch4.charValue())) {
                                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
                        Comparator comparatorReversed = new yg2.m.a().reversed();
                        comparatorReversed.getClass();
                        TreeMap treeMap = new TreeMap(comparatorReversed);
                        treeMap.putAll(linkedHashMap5);
                        boolean zR14 = mVar12.r(treeMap) | mVar12.B(lVar6) | mVar12.r(yVar);
                        Object objQ21 = mVar12.q();
                        if (zR14) {
                            objQ21 = new wn2.f(treeMap, 15, lVar6, yVar);
                            mVar12.K(objQ21);
                        } else {
                            aVar.getClass();
                            if (objQ21 == p3.m.a.f135155b) {
                                objQ21 = new wn2.f(treeMap, 15, lVar6, yVar);
                                mVar12.K(objQ21);
                            }
                        }
                        e2.c.b(null, i0VarA, null, null, null, null, false, null, (e23.l) objQ21, mVar12, 0, 509);
                        mVar12.f();
                    }
                    x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Context context, Object obj, Object obj2, Object obj3, Object obj4, p1 p1Var, int i14) {
        this.f3627a = i14;
        this.f3630d = context;
        this.f3628b = obj;
        this.f3629c = obj2;
        this.f3631e = obj3;
        this.f3632f = obj4;
        this.f3633g = p1Var;
    }

    public /* synthetic */ h(gv0.d dVar, yu0.f fVar, sc.f fVar2, e23.l lVar, e23.a aVar, e23.a aVar2) {
        this.f3627a = 3;
        this.f3628b = dVar;
        this.f3629c = fVar;
        this.f3633g = fVar2;
        this.f3630d = lVar;
        this.f3631e = aVar;
        this.f3632f = aVar2;
    }

    public /* synthetic */ h(Object obj, Context context, Object obj2, p1 p1Var, Object obj3, p1 p1Var2, int i14) {
        this.f3627a = i14;
        this.f3628b = obj;
        this.f3630d = context;
        this.f3629c = obj2;
        this.f3631e = p1Var;
        this.f3632f = obj3;
        this.f3633g = p1Var2;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Context context, Object obj4, Object obj5, int i14) {
        this.f3627a = i14;
        this.f3628b = obj;
        this.f3629c = obj2;
        this.f3631e = obj3;
        this.f3630d = context;
        this.f3632f = obj4;
        this.f3633g = obj5;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f3627a = i14;
        this.f3628b = obj;
        this.f3629c = obj2;
        this.f3630d = obj3;
        this.f3631e = obj4;
        this.f3632f = obj5;
        this.f3633g = obj6;
    }
}
