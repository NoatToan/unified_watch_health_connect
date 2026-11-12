package bp0;

import a03.t0;
import a42.z;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(String str, String str2, ArrayList arrayList, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1447443431);
        int i15 = i14 | (o0VarP.B(str) ? 4 : 2) | (o0VarP.B(str2) ? 32 : 16) | (o0VarP.r(arrayList) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024) | (o0VarP.r(aVar2) ? 16384 : 8192);
        if (o0VarP.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            g82.c cVar = g82.c.f76436a;
            String strQ = y.Q(o0VarP, R.string.challenges_card_get_challenged_button_text);
            String strQ2 = y.Q(o0VarP, R.string.common_button_not_now);
            e eVarC = f.c(933908543, new t0(22, str2, arrayList), o0VarP);
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new bm.y(14);
                o0VarP.K(objQ);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            int i16 = i15 << 3;
            cVar.b(null, str, eVarC, strQ, aVar, strQ2, aVar2, false, aVar3, o0VarP, (i16 & 57344) | (i16 & 112) | 100663680 | ((i15 << 6) & 3670016), 129);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) str, (Object) str2, (Object) arrayList, (Object) aVar, (Object) aVar2, i14, 8);
        }
    }

    public static final void b(ArrayList arrayList, m mVar, int i14) {
        o0 o0VarE = mVar.E(1265855242);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1784359440);
            for (List<ap0.g> list : h0.i1(arrayList, 3, 3, true)) {
                r.a aVar3 = r.S;
                j.f22691a.getClass();
                j.C0343j c0343j = j.f22692b;
                d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = k.c(aVar3, o0VarE);
                g.V.getClass();
                e0.a aVar4 = g.a.f81805b;
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
                b4.c(g.a.f81810g, s2VarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA1, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(-976554736);
                for (ap0.g gVar : list) {
                    r rVarA = u2Var.a(r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(rVarA, j92.b.f97899b.f97919d);
                    d.f81522a.getClass();
                    z0 z0VarD = q.d(d.a.f81524b, true);
                    x1 x1Var3 = n.f135158a;
                    int iHashCode3 = Long.hashCode(o0VarE.U);
                    i2 i2VarA2 = o0VarE.a0();
                    r rVarC3 = k.c(rVarY, o0VarE);
                    g.V.getClass();
                    e0.a aVar5 = g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(g.a.f81810g, z0VarD, o0VarE);
                    b4.c(g.a.f81809f, i2VarA2, o0VarE);
                    g.a.b bVar3 = g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
                    }
                    b4.c(g.a.f81807d, rVarC3, o0VarE);
                    u uVar = u.f22885a;
                    a.a(gVar, o0VarE, 0);
                    o0VarE.g0(true);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var4 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(arrayList, i14, i16);
        }
    }
}
