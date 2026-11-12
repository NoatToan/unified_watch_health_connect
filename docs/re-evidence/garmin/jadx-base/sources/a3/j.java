package a3;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class j implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f691b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f690a = pVar;
        this.f691b = pVar2;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            float f14 = 8;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(rVarF, f14, 2);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarZ, mVar2);
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
            f.c(f14, 12, z3.f.c(-1975681962, new i(this.f690a, this.f691b), mVar2), mVar2, 438);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
