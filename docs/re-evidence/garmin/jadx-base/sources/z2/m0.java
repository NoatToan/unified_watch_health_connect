package z2;

import kotlin.q3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f201690a;

        public a(e23.a aVar) {
            this.f201690a = aVar;
        }

        @Override // z2.p
        public final /* synthetic */ long a() {
            return ((n4.c) this.f201690a.invoke()).f123544a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f201690a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void a(h4.r rVar, b0 b0Var, e23.l lVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        e23.l lVar2;
        p3.o0 o0VarE = mVar.E(-917932944);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i17 = i15 | (o0VarE.B(b0Var) ? 32 : 16);
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            r1.f201764l.getClass();
            d4.l lVar3 = r1.f201765m;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yx2.b(24);
                o0VarE.K(objQ);
            }
            r1 r1Var = (r1) d4.a.c(objArr, lVar3, (e23.a) objQ, o0VarE, 384);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new o1(r1Var);
                o0VarE.K(objQ2);
            }
            o1 o1Var = (o1) objQ2;
            kotlin.o1 o1Var2 = (kotlin.o1) o0VarE.A(kotlin.t1.f91488f);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            o53.b0 b0Var2 = (o53.b0) objQ3;
            o1Var.f201714e = (w4.a) o0VarE.A(kotlin.t1.f91494l);
            boolean zB = o0VarE.B(b0Var2) | o0VarE.B(o1Var2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new yt.f(3, b0Var2, o1Var2);
                o0VarE.K(objQ4);
            }
            o1Var.f201715f = (e23.l) objQ4;
            o1Var.f201716g = (q3) o0VarE.A(kotlin.t1.f91500r);
            lVar2 = lVar;
            o1Var.f201713d = new yt.f(4, o1Var, lVar2);
            o1Var.o(b0Var);
            if (u1.g0.f167496c) {
                o0VarE.C(-82280708);
                o1Var.f201733x = x.b(a0.StaticText, null, o0VarE, 54);
                o1Var.f201732w = b0Var2;
            } else {
                o0VarE.C(-86967598);
            }
            o0VarE.g0(false);
            o1Var.j();
            int i18 = p006l2.d0.f108435a;
            int i19 = p006l2.e0.f108449a;
            h4.r rVarA = h4.r.S;
            h4.r rVarB = z4.f.b(b5.s0.b(u1.m0.a(m4.e.b(m4.e.a(f5.g0.f(b5.s0.b(rVarA, Unit.INSTANCE, new k1(o1Var, new i0(o1Var, i16))), new h0(o1Var, 4)), o1Var.f201718i), new h0(o1Var, 5)), true, null), 8675309, new t0(new h0(o1Var, 6))), new j1(o1Var));
            if (o1Var.f() != null && o1Var.i()) {
                b0 b0VarG = o1Var.g();
                if (!(b0VarG == null ? true : p005kotlin.jvm.internal.s.g(b0VarG.f201523a, b0VarG.f201524b))) {
                    p5.j0<e23.a<n4.c>> j0Var = u1.j1.f167577a;
                    rVarA = h4.k.a(rVarA, kotlin.k2.f91249a, new xn.t(o1Var, 16));
                }
            }
            h4.r rVarThen = rVarB.then(rVarA);
            if (u1.g0.f167495b) {
                rVarThen = r2.i.a(rVarThen, new yr.d(o1Var, 19));
            }
            u1.a(rVar.then(rVarThen), z3.f.c(-1799563674, new g0(o1Var, r1Var, eVar), o0VarE), o0VarE, 48);
            boolean zR = o0VarE.r(o1Var);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new h0(o1Var, 0);
                o0VarE.K(objQ5);
            }
            p3.l0.a(o1Var, (e23.l) objQ5, o0VarE);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yz1.j(rVar, b0Var, lVar2, eVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(1949207773);
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            h4.r.a aVar = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(null);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            b0 b0Var = (b0) p1Var.getF182175a();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new xq1.c(p1Var, 15);
                o0VarE.K(objQ2);
            }
            eVar2 = eVar;
            a(aVar, b0Var, (e23.l) objQ2, eVar2, o0VarE, 3462);
            rVar = aVar;
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hw1.c(rVar, eVar2, i14, 3);
        }
    }
}
