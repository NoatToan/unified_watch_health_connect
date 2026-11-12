package f21;

import android.text.format.DateFormat;
import c2.q2;
import c2.s2;
import c2.u2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.a2;
import f5.z0;
import i3.mh;
import i3.v5;
import java.time.LocalTime;
import l72.v2;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    public static final void a(h4.r rVar, v21.e eVar, g21.f fVar, e23.p pVar, e23.l lVar, e23.p pVar2, e23.l lVar2, e23.l lVar3, gw1.d dVar, boolean z14, boolean z15, p3.m mVar, int i14) {
        e23.l lVar4;
        e23.p pVar3;
        boolean z16;
        p1 p1Var;
        h4.r.a aVar;
        ?? r14;
        v21.e eVar2 = eVar;
        p3.o0 o0VarE = mVar.E(-361412118);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16) | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(pVar2) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar3) ? 8388608 : 4194304) | (o0VarE.r(dVar) ? 67108864 : 33554432) | (o0VarE.h(z14) ? 536870912 : 268435456);
        char c14 = o0VarE.h(z15) ? (char) 4 : (char) 2;
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            boolean zR = o0VarE.r(fVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                z16 = true;
                objQ2 = new f2.o0(fVar, 1);
                o0VarE.K(objQ2);
            } else {
                z16 = true;
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ2, aVar3, z16);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g21.o oVar = fVar.f75416b;
            if (oVar != null) {
                o0VarE.C(639546024);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2);
                boolean z17 = (pVar == null || oVar.f75472j) ? false : true;
                boolean z18 = z17;
                boolean zR2 = ((i15 & 1879048192) == 536870912) | o0VarE.r(oVar) | ((c14 & 14) == 4) | ((i15 & 7168) == 2048);
                Object objQ3 = o0VarE.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new e0(oVar, z14, z15, pVar);
                    o0VarE.K(objQ3);
                }
                e23.a aVar4 = (e23.a) objQ3;
                boolean zR3 = ((458752 & i15) == 131072) | o0VarE.r(oVar);
                Object objQ4 = o0VarE.q();
                if (zR3 || objQ4 == c2565a) {
                    objQ4 = new e52.b(12, pVar2, oVar);
                    o0VarE.K(objQ4);
                }
                aVar = aVar3;
                p1Var = p1Var2;
                eVar2 = eVar;
                s.a(rVarA, eVar2, oVar, z18, aVar4, (e23.l) objQ4, lVar2, lVar3, dVar, o0VarE, 267911280 & i15);
                r14 = 0;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
            } else {
                eVar2 = eVar;
                p1Var = p1Var2;
                boolean z19 = false;
                aVar = aVar3;
                o0VarE.C(640520354);
                b63.v vVar = fVar.f75415a;
                if (vVar == null) {
                    o0VarE.C(640520353);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(640520354);
                    b(v2.a(aVar, (pVar == null && lVar == null) ? false : true, new eb0.a(p1Var, 2), o0VarE, 6), eVar2, vVar, o0VarE, i15 & 112);
                    Unit unit2 = Unit.INSTANCE;
                    z19 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z19);
                r14 = z19;
            }
            o0VarE.g0(true);
            h4.r rVarC4 = uVar.c(aVar, h4.d.a.f81525c);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, r14);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC5 = h4.k.c(rVarC4, o0VarE);
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
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar2, rVarC5, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            d92.b.f58623a.getClass();
            long jG = d92.b.a(o0VarE).c().g();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new a2(p1Var, 8);
                o0VarE.K(objQ5);
            }
            pVar3 = pVar;
            lVar4 = lVar;
            i3.u.a(zBooleanValue, (e23.a) objQ5, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(134265401, new a42.y(lVar4, pVar3, fVar, p1Var), o0VarE), o0VarE, 48, 48, 1916);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            lVar4 = lVar;
            pVar3 = pVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, eVar2, fVar, pVar3, lVar4, pVar2, lVar2, lVar3, dVar, z14, z15, i14);
        }
    }

    public static final void b(h4.r rVar, v21.e eVar, b63.v vVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(562767465);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(vVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVar, eVar2.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar2.f97916a, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            eVar.getClass();
            vVar.getClass();
            LocalTime localTime = vVar.f16219a;
            String strPrint = DateTimeFormat.forPattern(DateFormat.is24HourFormat(eVar.f175324a) ? "HH:mm" : "h a").print(new org.joda.time.LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond()));
            strPrint.getClass();
            d92.b.f58624b.getClass();
            mh.c(strPrint, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131070);
            h4.r rVarA2 = u2Var.a(h4.r.S, 1.0f, true);
            long jC = sn.a.c(o0VarE);
            o0VarE = o0VarE;
            v5.a(0.0f, 0, 2, jC, rVarA2, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(rVar, eVar, vVar, i14, 0);
        }
    }
}
