package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Li3/b6;", "", "<init>", "()V", "Li3/c6;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b6 {
    public /* synthetic */ b6(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z14, final e23.a aVar, final h4.r rVar, u1.d2 d2Var, boolean z15, o4.r1 r1Var, long j8, float f14, float f15, final z3.e eVar, p3.m mVar, final int i14, final int i15) {
        e23.a aVar2;
        int i16;
        final u1.d2 d2Var2;
        final boolean z16;
        final o4.r1 r1Var2;
        final long j14;
        final float f16;
        final float f17;
        int i17;
        float f18;
        float f19;
        long j15;
        o4.r1 r1Var3;
        u1.d2 d2Var3;
        byte b14;
        p3.o0 o0VarE = mVar.E(-126848451);
        int i18 = i14 | (o0VarE.h(z14) ? 4 : 2);
        if ((i14 & 48) == 0) {
            aVar2 = aVar;
            i18 |= o0VarE.r(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        int i19 = i18 | (o0VarE.B(rVar) ? 256 : 128) | 919168000;
        if ((i15 & 6) == 0) {
            i16 = i15 | (o0VarE.r(eVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(this) ? 32 : 16;
        }
        boolean z17 = true;
        if (o0VarE.n(i19 & 1, ((306783379 & i19) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                u1.d2 d2VarA = u1.a2.a(o0VarE);
                v7 v7Var = v7.f89994a;
                v7Var.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.g0 g0Var = n3.g0.f122855a;
                g0Var.getClass();
                o4.r1 r1VarC = fc.c(n3.g0.f122858d, o0VarE);
                v7Var.getClass();
                g0Var.getClass();
                long jE = k2.e(n3.g0.f122856b, o0VarE);
                i17 = i19 & (-4135937);
                v7Var.getClass();
                float f22 = v7.f89995b;
                v7Var.getClass();
                f18 = f22;
                f19 = v7.f89996c;
                j15 = jE;
                r1Var3 = r1VarC;
                d2Var3 = d2VarA;
            } else {
                o0VarE.e();
                i17 = i19 & (-4135937);
                d2Var3 = d2Var;
                z17 = z15;
                r1Var3 = r1Var;
                j15 = j8;
                f18 = f14;
                f19 = f15;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                Unit unit = Unit.INSTANCE;
                p3.t1 t1Var = p3.t1.f135313a;
                t1Var.getClass();
                p3.c2 c2Var = new p3.c2(unit, t1Var);
                o0VarE.K(c2Var);
                objQ = c2Var;
            }
            p3.p1 p1Var = (p3.p1) objQ;
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            int i24 = c2.k3.f22728a;
            int i25 = c2.q3.c(o0VarE).e().f25191b;
            if (z14) {
                o0VarE.C(629991660);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new i11.i(p1Var, 2);
                    o0VarE.K(objQ2);
                }
                j6.a((e23.a) objQ2, o0VarE, 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(630077189);
                o0VarE.g0(false);
            }
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new s1.t0(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            s1.t0 t0Var = (s1.t0) objQ3;
            t0Var.f(Boolean.valueOf(z14));
            if (((Boolean) t0Var.f155742b.getF182175a()).booleanValue() || ((Boolean) t0Var.f155743c.getF182175a()).booleanValue()) {
                o0VarE.C(630396489);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    o4.z1.f129046b.getClass();
                    objQ4 = p3.p0.n(o4.z1.a(o4.z1.f129047c));
                    o0VarE.K(objQ4);
                }
                p3.p1 p1Var2 = (p3.p1) objQ4;
                boolean zB = o0VarE.B(cVar) | o0VarE.k(i25);
                int i26 = i17;
                Object objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    b14 = 0;
                    objQ5 = new i6(cVar, i25, p1Var, 0, new am.l1(p1Var2, 13, b14), 8, null);
                    o0VarE.K(objQ5);
                } else {
                    b14 = 0;
                }
                i6 i6Var = (i6) objQ5;
                String strD = d();
                boolean zC = c();
                l3.d1 d1VarB = l3.b.b(b14, o0VarE, 7);
                int i27 = !((Boolean) d1VarB.getF182175a()).booleanValue() ? 393248 : 393216;
                y5.f90403b.getClass();
                if ((p005kotlin.jvm.internal.s.g(strD, y5.f90405d) || (p005kotlin.jvm.internal.s.g(strD, y5.f90406e) && !((Boolean) d1VarB.getF182175a()).booleanValue())) && !zC) {
                    i27 |= 8;
                }
                p004k6.g.a(i6Var, aVar2, new p004k6.d0(i27, false, false, false, false, false, 62, (p005kotlin.jvm.internal.j) null), z3.f.c(2063119149, new a6(this, rVar, z17, t0Var, p1Var2, d2Var3, r1Var3, j15, f18, f19, null, eVar), o0VarE), o0VarE, (i26 & 112) | 3072, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(631807237);
                o0VarE.g0(false);
            }
            z16 = z17;
            d2Var2 = d2Var3;
            r1Var2 = r1Var3;
            j14 = j15;
            f16 = f18;
            f17 = f19;
        } else {
            o0VarE.e();
            d2Var2 = d2Var;
            z16 = z15;
            r1Var2 = r1Var;
            j14 = j8;
            f16 = f14;
            f17 = f15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.z5
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    this.f90539a.a(z14, aVar, rVar, d2Var2, z16, r1Var2, j14, f16, f17, eVar, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public abstract h4.r b(h4.r rVar, boolean z14);

    public abstract boolean c();

    public abstract String d();

    public abstract h4.r e(h4.r rVar, String str);

    private b6() {
    }
}
