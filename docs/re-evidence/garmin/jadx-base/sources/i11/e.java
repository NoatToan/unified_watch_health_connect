package i11;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(int i14, p pVar, r rVar, String str, String str2, String str3, p3.m mVar) {
        p pVar2;
        o0 o0Var;
        r rVar2;
        boolean z14;
        String str4;
        str2.getClass();
        o0 o0VarE = mVar.E(956609998);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            float f16 = eVar.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = c2.l.B(rVarF, f14, f15, f15, f16);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            r rVarA = u2.f22900a.a(aVar, 1.0f, true);
            bVar.getClass();
            float f17 = eVar.f97918c;
            bVar.getClass();
            r rVarC2 = c2.l.C(rVarA, 0.0f, eVar.f97918c, f17, 0.0f, 9);
            bVar.getClass();
            s2 s2VarA2 = q2.a(c2.j.i(f16), bVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            bVar.getClass();
            float f18 = j92.b.f97901d.f97907f;
            bVar.getClass();
            y01.h.a(str3, f18, f16, o0VarE, (i16 >> 9) & 14);
            if (str != null) {
                o0VarE.C(-353775955);
                String strP = y.P(R.string.common_hyphenated_values, new Object[]{str2, str}, o0VarE);
                z14 = false;
                o0VarE.g0(false);
                str4 = strP;
            } else {
                z14 = false;
                o0VarE.C(-353661968);
                o0VarE.g0(false);
                str4 = str2;
            }
            d92.b.f58624b.getClass();
            rVar2 = aVar;
            boolean z15 = z14;
            mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (pVar == null) {
                o0Var.C(39955311);
                o0Var.g0(z15);
                pVar2 = pVar;
            } else {
                o0Var.C(1109667538);
                pVar2 = pVar;
                pVar2.invoke(o0Var, 6);
                o0Var.g0(z15);
            }
            o0Var.g0(true);
        } else {
            pVar2 = pVar;
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, str, str2, str3, pVar2, i14);
        }
    }
}
