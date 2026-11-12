package ya1;

import c2.x2;
import f5.z0;
import h5.e0;
import l72.y2;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lya1/l;", "Lg82/c$a;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements g82.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f195570a;

    public l(x3<Float> x3Var) {
        this.f195570a = x3Var;
    }

    @Override // g82.c.a
    public final void a(p3.m mVar) {
        mVar.C(1976438658);
        x1 x1Var = p3.n.f135158a;
        h4.r.a aVar = h4.r.S;
        g6.f.a aVar2 = g6.f.f75994b;
        h4.r rVarH = x2.h(x2.f(aVar, 1.0f), 100);
        h4.d.f81522a.getClass();
        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
        int iHashCode = Long.hashCode(mVar.getU());
        i2 i2VarX = mVar.x();
        h4.r rVarC = h4.k.c(rVarH, mVar);
        h5.g.V.getClass();
        e0.a aVar3 = h5.g.a.f81805b;
        if (mVar.F() == null) {
            p0.l();
            throw null;
        }
        mVar.z();
        if (mVar.getT()) {
            mVar.M(aVar3);
        } else {
            mVar.c();
        }
        b4.c(h5.g.a.f81810g, z0VarD, mVar);
        b4.c(h5.g.a.f81809f, i2VarX, mVar);
        h5.g.a.b bVar = h5.g.a.f81813j;
        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
            v.h.z(iHashCode, mVar, iHashCode, bVar);
        }
        b4.c(h5.g.a.f81807d, rVarC, mVar);
        y2.f111386a.c(this.f195570a.getF182175a().floatValue(), c2.u.f22885a.c(c2.l.y(aVar, 16), h4.d.a.f81528f), false, mVar, 384, 0);
        mVar.y();
        mVar.f();
    }
}
