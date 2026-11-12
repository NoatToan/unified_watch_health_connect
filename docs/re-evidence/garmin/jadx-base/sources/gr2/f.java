package gr2;

import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e11.f0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.y0;
import v.h;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, ms2.a aVar, String str2, m mVar, int i14) {
        o0 o0Var;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.e eVar;
        e0.a aVar2;
        r.a aVar3;
        j92.e eVar2;
        int i15;
        o0 o0Var2;
        o0 o0Var3;
        str.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1956929822);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            r rVarY = l.y(aVar4, eVar3.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
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
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (aVar instanceof ms2.a.C2286a) {
                o0VarE.C(1912050691);
                g6.f.a aVar6 = g6.f.f75994b;
                eVar = eVar4;
                c1623g = c1623g2;
                bVar = bVar4;
                y0.a(n5.c.a(((ms2.a.C2286a) aVar).f120494a, o0VarE, 0), str, x2.r(aVar4, 57, 36), null, null, 0.0f, null, o0VarE, ((i16 << 3) & 112) | 384, 120);
                o0VarE.g0(false);
                i15 = 0;
                aVar2 = aVar5;
                eVar2 = eVar3;
                aVar3 = aVar4;
                o0Var2 = o0VarE;
            } else {
                c1623g = c1623g2;
                bVar = bVar4;
                eVar = eVar4;
                if (!(aVar instanceof ms2.a.b)) {
                    throw kg.f.h(o0VarE, 615866513, false);
                }
                o0VarE.C(1912332171);
                g6.f.a aVar7 = g6.f.f75994b;
                int i17 = ((i16 << 3) & 112) | 384;
                aVar2 = aVar5;
                aVar3 = aVar4;
                eVar2 = eVar3;
                i15 = 0;
                jf.r.b(((ms2.a.b) aVar).f120495a, str, x2.r(aVar4, 57, 36), null, n5.c.a(R.drawable.payment_default_card, o0VarE, 0), null, null, null, null, null, null, null, o0VarE, i17, 0, 32744);
                o0 o0Var4 = o0VarE;
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            }
            bVar2.getClass();
            l.f(x2.u(aVar3, eVar2.f97920e), o0Var2);
            z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0Var2, i15);
            int iHashCode2 = Long.hashCode(o0Var2.U);
            i2 i2VarA1 = o0Var2.a0();
            r rVarC2 = k.c(aVar3, o0Var2);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, zVarA, o0Var2);
            b4.c(c1623g, i2VarA1, o0Var2);
            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0Var2, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0Var2);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            o0 o0Var5 = o0Var2;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var2), o0Var5, i16 & 14, 0, 131070);
            o0 o0Var6 = o0Var5;
            if (str2 != null) {
                o0Var6.C(111929678);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var6), o0Var6, (i16 >> 6) & 14, 0, 131070);
                o0 o0Var7 = o0Var6;
                o0Var7.g0(i15);
                o0Var3 = o0Var7;
            } else {
                o0Var6.C(112014246);
                o0Var6.g0(i15);
                o0Var3 = o0Var6;
            }
            o0Var3.g0(true);
            o0Var3.g0(true);
            o0Var = o0Var3;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(str, (Object) aVar, (Object) str2, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    public static final void b(ArrayList arrayList, e23.l lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-645613597);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), n5.a.a(o0VarE, R.color.GPcolorBackgroundDefault), m1.f128891a);
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(arrayList);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(arrayList, lVar, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(arrayList, lVar, i16);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.y(i14, 1, lVar, arrayList);
        }
    }
}
