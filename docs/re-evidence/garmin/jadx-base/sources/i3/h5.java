package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/h5;", "Li3/x9;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h5 implements x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5 f88293a = new h5();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y9 f88294a;

        public a(y9 y9Var) {
            this.f88294a = y9Var;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                y9 y9Var = this.f88294a;
                h4.r rVarZ = g8.i.Z(c2.x2.b(c2.l.G(rVarF, y9Var.f90434e), 0.0f, w9.f90108a, 1));
                c2.j jVar = c2.j.f22691a;
                float f14 = w9.f90109b;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                h4.g.b bVar = h4.d.a.f81534l;
                e23.q<c2.t2, p3.m, Integer, Unit> qVar = y9Var.f90435f;
                c2.s2 s2VarA = c2.q2.a(iVarI, bVar, mVar2, 54);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar2);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                qVar.invoke(c2.u2.f22900a, mVar2, 6);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    private h5() {
    }

    @Override // i3.x9
    public final void a(y9 y9Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(882141204);
        char c14 = 2;
        int i15 = (o0VarE.B(y9Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ve.a(y9Var.f90430a, null, y9Var.f90431b, y9Var.f90432c, y9Var.f90433d, 0.0f, null, z3.f.c(1991263321, new a(y9Var), o0VarE), o0VarE, 12582912, 98);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(this, y9Var, i14, c14);
        }
    }
}
