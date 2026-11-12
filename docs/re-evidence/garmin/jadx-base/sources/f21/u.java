package f21;

import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import i3.mc;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68619a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f68622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f68624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f68625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f68626h;

    public /* synthetic */ u(int i14, mc mcVar, o53.b0 b0Var, e23.p pVar, e23.p pVar2, int i15, int i16) {
        this.f68620b = i14;
        this.f68623e = mcVar;
        this.f68624f = b0Var;
        this.f68625g = pVar;
        this.f68626h = pVar2;
        this.f68621c = i15;
        this.f68622d = i16;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68619a;
        Object obj3 = this.f68626h;
        Object obj4 = this.f68625g;
        Object obj5 = this.f68623e;
        Object obj6 = this.f68624f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                w.a((t2) obj5, (String) obj6, (h4.r) obj4, (h4.d.b) obj3, this.f68620b, this.f68621c, (p3.m) obj, p0.t(this.f68622d | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                kn1.e.a(this.f68620b, (mc) obj5, (o53.b0) obj6, (e23.p) obj4, (e23.p) obj3, (p3.m) obj, p0.t(this.f68621c | 1), this.f68622d);
                return Unit.INSTANCE;
            default:
                String str = (String) obj6;
                String str2 = (String) obj5;
                n1 n1Var = (n1) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    String str3 = str == null ? "" : str;
                    String str4 = str2 == null ? "" : str2;
                    boolean zB = mVar.B(n1Var) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new n02.i(lVar, n1Var, 1);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n02.i(lVar, n1Var, 1);
                            mVar.K(objQ);
                        }
                    }
                    n02.m.a(null, null, null, str3, str4, this.f68620b, this.f68621c, this.f68622d, (e23.l) objQ, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u(t2 t2Var, String str, h4.r rVar, h4.d.b bVar, int i14, int i15, int i16) {
        this.f68623e = t2Var;
        this.f68624f = str;
        this.f68625g = rVar;
        this.f68626h = bVar;
        this.f68620b = i14;
        this.f68621c = i15;
        this.f68622d = i16;
    }

    public /* synthetic */ u(String str, String str2, int i14, int i15, int i16, n1 n1Var, e23.l lVar) {
        this.f68624f = str;
        this.f68623e = str2;
        this.f68620b = i14;
        this.f68621c = i15;
        this.f68622d = i16;
        this.f68625g = n1Var;
        this.f68626h = lVar;
    }
}
