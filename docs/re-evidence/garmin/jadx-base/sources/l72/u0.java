package l72;

import com.garmin.android.apps.connectmobile.R;
import i3.d8;
import i3.fb;
import i3.i7;
import i3.p7;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:103:0x023b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01de  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, o0 o0Var, String str, a2.j jVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        String strQ;
        e23.a<Unit> aVar2;
        o0 o0Var2;
        h4.r rVar3;
        a2.j jVar2;
        o0 o0Var3;
        a2.j jVar3;
        o0 o0Var4;
        h5.g.a.f fVar;
        c2.u uVar;
        h4.r.a aVar3;
        h4.g gVar;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-702929990);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.k(o0Var == null ? -1 : o0Var.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                strQ = str;
                int i19 = o0VarE.B(strQ) ? 256 : 128;
                i16 |= i19;
            } else {
                strQ = str;
            }
            i16 |= i19;
        } else {
            strQ = str;
        }
        int i24 = i16 | 3072;
        if ((i14 & 24576) == 0) {
            aVar2 = aVar;
            i24 |= o0VarE.r(aVar2) ? 16384 : 8192;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i24 & 1, (i24 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
                o0 o0Var5 = i18 != 0 ? o0.MEDIUM : o0Var;
                if ((i15 & 4) != 0) {
                    i24 &= -897;
                    strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_close);
                }
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                o0 o0Var6 = o0Var5;
                rVar2 = rVar4;
                o0Var3 = o0Var6;
                jVar3 = (a2.j) objQ;
            } else {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i24 &= -897;
                }
                o0Var3 = o0Var;
                jVar3 = jVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i25 = i24 >> 3;
            float fA = o0Var3.a();
            d92.b.f58623a.getClass();
            float f14 = d92.b.d(o0VarE) ? 0.9f : 0.8f;
            p5.l.f136032b.getClass();
            float f15 = fA / 2;
            g6.f.a aVar4 = g6.f.f75994b;
            String str2 = strQ;
            h4.r rVar5 = rVar2;
            h4.r rVarB = u1.w.b(rVar5, jVar3, fb.a(f15, 4, 0L, false), false, null, p5.l.a(0), aVar2, 12);
            a2.j jVar4 = jVar3;
            f5.p pVar = p7.f89279a;
            h4.r rVarThen = rVarB.then(d8.f87832a);
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81524b;
            f5.z0 z0VarD2 = c2.q.d(gVar2, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                o0Var4 = o0Var3;
            } else {
                o0Var4 = o0Var3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = c2.u.f22885a;
                aVar3 = h4.r.S;
                h4.r rVarQ = c2.x2.q(aVar3, fA);
                gVar = h4.d.a.f81528f;
                h4.r rVarC3 = u1.n.c(f14, uVar.c(rVarQ, gVar), new o4.t1(((o4.d0) d92.b.a(o0VarE).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a);
                z0VarD = c2.q.d(gVar2, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u4.d.b bVar2 = u4.d.f168373k;
                strQ = str2;
                i7.b(n5.e.b(R.drawable.close_x_thick, o0VarE, 6), strQ, uVar.c(c2.x2.q(aVar3, f15), gVar), am.j.d(o0VarE), o0VarE, i25 & 112, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                o0Var2 = o0Var4;
                rVar3 = rVar5;
                jVar2 = jVar4;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = c2.u.f22885a;
            aVar3 = h4.r.S;
            h4.r rVarQ2 = c2.x2.q(aVar3, fA);
            gVar = h4.d.a.f81528f;
            h4.r rVarC4 = u1.n.c(f14, uVar.c(rVarQ2, gVar), new o4.t1(((o4.d0) d92.b.a(o0VarE).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a);
            z0VarD = c2.q.d(gVar2, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC4, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u4.d.b bVar3 = u4.d.f168373k;
            strQ = str2;
            i7.b(n5.e.b(R.drawable.close_x_thick, o0VarE, 6), strQ, uVar.c(c2.x2.q(aVar3, f15), gVar), am.j.d(o0VarE), o0VarE, i25 & 112, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
            o0Var2 = o0Var4;
            rVar3 = rVar5;
            jVar2 = jVar4;
        } else {
            o0VarE.e();
            o0Var2 = o0Var;
            rVar3 = rVar2;
            jVar2 = jVar;
        }
        String str3 = strQ;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(rVar3, (Object) o0Var2, (Object) str3, (Object) jVar2, (Object) aVar, i14, i15, 19);
        }
    }
}
