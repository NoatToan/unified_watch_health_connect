package l3;

import i3.i5;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a2 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f109177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f109178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f109179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f109180d;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(x3<Float> x3Var, long j8, s5.x0 x0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f109177a = x3Var;
        this.f109178b = j8;
        this.f109179c = x0Var;
        this.f109180d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            x3<Float> x3Var = this.f109177a;
            boolean zB = mVar2.B(x3Var);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new i5(x3Var, 6);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i5(x3Var, 6);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarA = o4.s0.a(aVar, (e23.l) objQ);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarA, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            k2.b(this.f109178b, this.f109179c, this.f109180d, mVar2, 0);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
