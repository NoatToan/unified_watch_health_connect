package jn1;

import c2.q;
import c2.u;
import c2.x2;
import e23.l;
import f5.z0;
import fn1.t;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import in1.f;
import km1.v;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import sm1.s;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    public static final void a(km1.c cVar, DateTime dateTime, s sVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        sVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1175970795);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (cVar == null || !in1.a.b(cVar)) {
                o0VarE.C(703084885);
                f.b(cVar != null ? cVar.getDailySleep() : null, dateTime, sVar, aVar2, o0VarE, (i15 & 7168) | v.P0 | (i15 & 112) | (i15 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(702500566);
                r rVarE = u1.n.e(x2.d(r.S, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarE, o0VarE);
                g.V.getClass();
                e0.a aVar3 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, z0VarD, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                v dailySleep = cVar.getDailySleep();
                if (dailySleep == null || !in1.a.c(dailySleep)) {
                    o0VarE.C(-91936879);
                    c.a(cVar, dateTime, sVar, o0VarE, (i15 & 896) | km1.c.B | (i15 & 14) | (i15 & 112));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-92161939);
                    int sleepTimeSeconds = dailySleep.getSleepTimeSeconds();
                    String userNote = dailySleep.getUserNote();
                    boolean zR = o0VarE.r(sVar) | o0VarE.r(dailySleep);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new d(sVar, dailySleep, 0);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new d(sVar, dailySleep, 0);
                            o0VarE.K(objQ);
                        }
                    }
                    in1.e.a(userNote, (l) objQ, o0VarE, sleepTimeSeconds, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(cVar, dateTime, sVar, aVar, i14, 1);
        }
    }
}
