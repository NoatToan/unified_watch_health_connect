package nf1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.q0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import l72.n0;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:104:0x02de  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(o82.a aVar, o82.g gVar, u82.f<List<if1.c>> fVar, p1<Boolean> p1Var, m mVar, int i14) {
        long j8;
        long j14;
        ArrayList arrayList;
        aVar.getClass();
        gVar.getClass();
        fVar.getClass();
        p1Var.getClass();
        o0 o0VarE = mVar.E(1278779732);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(aVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(p1Var) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            j0 j0Var = new j0(y.Q(o0VarE, R.string.actual_distance), null, null, false, p1Var.getF182175a().booleanValue(), 14, null);
            d92.b.f58623a.getClass();
            long j15 = ((d0) d92.b.a(o0VarE).l().f63541j.getF182175a()).f128833a;
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(546693451);
                o0VarE.g0(false);
                j8 = j15;
            } else {
                o0VarE.C(546694943);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(o0VarE).b();
                o0VarE.g0(false);
                j8 = jB;
            }
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(546697355);
                o0VarE.g0(false);
                j14 = j15;
            } else {
                o0VarE.C(546698849);
                gl.c.f77766a.getClass();
                long jH = gl.c.a(o0VarE).h();
                o0VarE.g0(false);
                j14 = jH;
            }
            gl.c.f77766a.getClass();
            if1.b bVar = new if1.b(aVar, gVar, fVar.a(), new if1.a(j8, j14, j15, gl.c.a(o0VarE).n(), null), p1Var.getF182175a().booleanValue(), context);
            r rVarF = x2.f(r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            kf1.j.b(bVar, fVar.a(), gVar, p1Var.getF182175a().booleanValue(), o0VarE, (i15 << 3) & 896);
            List<if1.c> listA = fVar.a();
            if (listA != null && (listA.isEmpty() ^ true)) {
                o0VarE.C(-2138232125);
                List<if1.c> listA2 = fVar.a();
                if (listA2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : listA2) {
                        Float f14 = ((if1.c) obj).f93214e;
                        f14.getClass();
                        if (f14.floatValue() > 0.0f) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    o0VarE.C(-2137772860);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2138097678);
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97920e;
                    bVar3.getClass();
                    r rVarC2 = l.C(aVar3, f15, 0.0f, 0.0f, eVar.f97918c, 6);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    r rVarC3 = k.c(rVarC2, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                    u2 u2Var = u2.f22900a;
                    boolean z14 = (i15 & 7168) == 2048;
                    Object objQ = o0VarE.q();
                    if (z14) {
                        objQ = new md0.f(p1Var, 5);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new md0.f(p1Var, 5);
                            o0VarE.K(objQ);
                        }
                    }
                    n0.a(null, j0Var, 0L, (e23.l) objQ, o0VarE, 0, 5);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                ArrayList arrayList2 = r11.f93198n;
                if (arrayList2 != null) {
                    o0VarE.C(-2137719261);
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar5, j92.b.f97899b.f97917b), o0VarE);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        h.b(context, (if1.c) it.next(), bVar.f93193i, o0VarE, 64);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2137472284);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2137462364);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(aVar, gVar, fVar, p1Var, i14, 21);
        }
    }
}
