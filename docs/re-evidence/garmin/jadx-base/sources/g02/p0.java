package g02;

import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74513a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f74516d;

    public /* synthetic */ p0(String str, String str2, z3.e eVar, int i14) {
        this.f74514b = str;
        this.f74515c = str2;
        this.f74516d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74513a;
        z3.e eVar = this.f74516d;
        String str = this.f74515c;
        String str2 = this.f74514b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22696f, aVar2, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
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
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    eVar.invoke(mVar, 0);
                    o13.p pVar = new o13.p(str2, str);
                    xz1.a.f192853a.getClass();
                    xd2.m0 m0Var = new xd2.m0(14);
                    m.f74478a.getClass();
                    r1.b.a(pVar, null, m0Var, null, null, null, m.f74483f, mVar, 1572864, 58);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ho.w.b(str2, str, eVar, (p3.m) obj, p3.p0.t(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p0(z3.e eVar, String str, String str2) {
        this.f74516d = eVar;
        this.f74514b = str;
        this.f74515c = str2;
    }
}
