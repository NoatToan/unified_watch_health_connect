package g11;

import c2.b0;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f74854c;

    public /* synthetic */ h(String str, int i14, i53.c cVar) {
        this.f74852a = 0;
        this.f74853b = str;
        this.f74854c = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74852a;
        String str = this.f74853b;
        i53.c<j22.a> cVar = this.f74854c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.a(str, cVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    j.a(str, cVar, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    d92.b.f58624b.getClass();
                    mh.c(this.f74853b, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                    mVar2.C(2111917164);
                    for (j22.a aVar3 : cVar) {
                        j22.b.f96736a.getClass();
                        aVar3.getClass();
                        ib0.d.a(gl1.y.Q(mVar2, aVar3.f96734a), mVar2, 0);
                    }
                    mVar2.f();
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(String str, i53.c cVar, int i14, byte b14) {
        this.f74852a = i14;
        this.f74853b = str;
        this.f74854c = cVar;
    }
}
