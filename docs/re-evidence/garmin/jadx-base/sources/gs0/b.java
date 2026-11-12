package gs0;

import am.j;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import g02.h0;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.e;
import j92.f;
import k2.i;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import v.h;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78683a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.PRE_TRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.TRAVELING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.AT_DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78683a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x033d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    public static final void a(int i14, e23.a aVar, r rVar, String str, String str2, String str3, m mVar) {
        int i15;
        o0 o0Var;
        g.a.b bVar;
        e0.a aVar2;
        g.a.b bVar2;
        String str4 = str2;
        o0 o0VarE = mVar.E(-1669569902);
        c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            long jA = j.A(d92.b.f58623a, o0VarE);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97917b;
            float f16 = eVar.f97920e;
            r rVarE = u1.n.e(rVar, jA, i.a(f14));
            boolean z14 = aVar != null;
            boolean z15 = (57344 & i15) == 16384;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z15) {
                objQ = new h0(aVar, 21);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h0(aVar, 21);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, z14, null, null, (e23.a) objQ, 14);
            d.f81522a.getClass();
            z0 z0VarD = q.d(d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            g.a.b bVar4 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            r.a aVar5 = r.S;
            r rVarF = x2.f(aVar5, 1.0f);
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            r rVarB = l.B(rVarF, f16, f16, f16, f16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar6 = d.a.f81536n;
            z zVarA = y.a(kVar, aVar6, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarB, o0VarE);
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
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar4;
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar4;
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_jet_lag_advisor);
            f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = f.f97931h;
            g.a.b bVar5 = bVar;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            r rVarF2 = x2.f(aVar5, 1.0f);
            bVar3.getClass();
            r rVarC3 = l.C(rVarF2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar3.getClass();
            s2 s2VarA = q2.a(c2.j.i(eVar.f97918c), d.a.f81533k, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = k.c(rVarC3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar2 = aVar4;
                o0VarE.M(aVar2);
            } else {
                aVar2 = aVar4;
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                bVar2 = bVar5;
                h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                bVar2 = bVar5;
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar3.getClass();
            r rVarA = l.A(aVar5, 0.0f, f15, 1);
            s62.a.f157643a.getClass();
            u4.d dVarA = f72.x2.a(t62.c.f162799a);
            f02.h.f67736a.getClass();
            g.a.b bVar6 = bVar2;
            long jA2 = f02.h.a(o0VarE);
            gl.c.f77766a.getClass();
            e0.a aVar7 = aVar2;
            int i16 = i15;
            g02.i.a(rVarA, dVarA, jA2, gl.c.a(o0VarE).c(), w13.b.j(o0VarE), 0.0f, null, o0VarE, 0, 224);
            r rVarF3 = x2.f(aVar5, 1.0f);
            bVar3.getClass();
            z zVarA2 = y.a(c2.j.i(f15), aVar6, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC5 = k.c(rVarF3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                h.A(iHashCode4, o0VarE, iHashCode4, bVar6);
            }
            b4.c(fVar, rVarC5, o0VarE);
            boolean z16 = (i16 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z16) {
                str4 = str2;
                objQ2 = new gp.j(str4, 4);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    str4 = str2;
                    objQ2 = new gp.j(str4, 4);
                    o0VarE.K(objQ2);
                } else {
                    str4 = str2;
                }
            }
            r rVarC6 = v.c((e23.l) objQ2, aVar5, false);
            fVar2.getClass();
            mh.c(str, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131068);
            fVar2.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97932i, o0VarE), o0VarE, (i16 >> 9) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g11.i(rVar, str, str4, str3, aVar, i14);
        }
    }
}
