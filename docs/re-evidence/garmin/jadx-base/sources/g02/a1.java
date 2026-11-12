package g02;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.h7;
import i3.p7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class a1 {
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    public static final void a(h4.r rVar, int i14, final float f14, final e23.l<? super Integer, Unit> lVar, p3.m mVar, final int i15, final int i16) {
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1893918364);
        int i17 = i15 | 6;
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 = i15 | 54;
        } else if ((i15 & 48) == 0) {
            i17 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= ((i16 & 4) == 0 && o0VarE.i(f14)) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                rVar = h4.r.S;
                if (i18 != 0) {
                    i14 = 0;
                }
                if ((i16 & 4) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97901d.f97906e;
                    i17 &= -897;
                }
            } else {
                o0VarE.e();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = ((i17 & 112) == 32) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new w0(i14, context);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w0(i14, context);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-1378317977);
            final int i19 = 0;
            while (i19 < 5) {
                final boolean z14 = i19 < i14;
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1751207792, new e23.p() { // from class: g02.x0
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i24 = 0;
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar2 = h4.r.S;
                            float f15 = f14;
                            h4.r rVarQ = x2.q(aVar2, f15);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar2.B(lVar2);
                            int i25 = i19;
                            boolean zK = zB | mVar2.k(i25);
                            Object objQ2 = mVar2.q();
                            if (zK) {
                                objQ2 = new au0.m(lVar2, i25, 10);
                                mVar2.K(objQ2);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new au0.m(lVar2, i25, 10);
                                    mVar2.K(objQ2);
                                }
                            }
                            h7.a((e23.a) objQ2, rVarQ, false, null, null, z3.f.c(-1087401810, new z0(i25, f15, i24, z14), mVar2), mVar2, 1572864, 60);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                i19++;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        final h4.r rVar2 = rVar;
        final int i24 = i14;
        final float f15 = f14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: g02.y0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a1.a(rVar2, i24, f15, lVar, (p3.m) obj, p3.p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
