package db0;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import e23.p;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58977a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f58979c;

    public /* synthetic */ e(int i14, l lVar) {
        this.f58978b = i14;
        this.f58979c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58977a;
        int i15 = this.f58978b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar = r.S;
                    r rVarF = x2.f(aVar, 1.0f);
                    h4.d.f81522a.getClass();
                    g.a aVar2 = h4.d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, aVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarF, mVar);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    r rVarX = x2.x(x2.z(aVar, null, 3), null, 3);
                    Integer numValueOf = i15 >= 0 ? Integer.valueOf(i15) : null;
                    c.a(rVarX, null, null, 0, numValueOf != null ? numValueOf.intValue() : 0, this.f58979c, mVar, 6);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                h50.m.a(this.f58979c, (m) obj, i15, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, l lVar, int i15) {
        this.f58978b = i14;
        this.f58979c = lVar;
    }
}
