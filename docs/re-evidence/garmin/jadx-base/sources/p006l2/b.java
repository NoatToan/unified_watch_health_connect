package p006l2;

import c2.x2;
import cq.q;
import e23.l;
import g6.f;
import g6.h;
import h4.d;
import h4.k;
import h4.r;
import kotlin.k2;
import kp2.a;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import z2.c;
import z2.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f108369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f108370b;

    static {
        float f14 = 25;
        f.a aVar = f.f75994b;
        f108369a = f14;
        f108370b = (f14 * 2.0f) / 2.4142137f;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    public static final void a(p pVar, r rVar, long j8, m mVar, int i14, int i15) {
        o0 o0VarE = mVar.E(1776202187);
        int i16 = (o0VarE.B(pVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= ((i15 & 4) == 0 && o0VarE.l(j8)) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
            } else if ((i15 & 4) != 0) {
                h.f76000b.getClass();
                j8 = h.f76001c;
                i16 &= -897;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            int i17 = i16 & 14;
            boolean z14 = i17 == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(pVar, 4);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(pVar, 4);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((l) objQ, rVar, false);
            d.f81522a.getClass();
            c.a(pVar, d.a.f81525c, z3.f.c(-1653527038, new a(j8, rVarC), o0VarE), o0VarE, i17 | 432);
        } else {
            o0VarE.e();
        }
        long j14 = j8;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(pVar, rVar, j14, i14, i15);
        }
    }

    public static final void b(r rVar, m mVar, int i14, int i15) {
        int i16;
        o0 o0VarE = mVar.E(694251107);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            if (i17 != 0) {
                rVar = r.S;
            }
            x1 x1Var = n.f135158a;
            c2.l.f(k.a(x2.r(rVar, f108370b, f108369a), k2.f91249a, new kq.r(15)), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c2.p(rVar, i14, i15);
        }
    }
}
