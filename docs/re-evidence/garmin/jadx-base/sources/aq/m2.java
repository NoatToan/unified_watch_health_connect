package aq;

import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12058f;

    public /* synthetic */ m2(int i14, int i15, int i16, p3.n1 n1Var, e23.l lVar) {
        this.f12053a = 3;
        this.f12054b = i14;
        this.f12055c = i15;
        this.f12056d = i16;
        this.f12057e = n1Var;
        this.f12058f = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12053a;
        int i15 = this.f12055c;
        Object obj3 = this.f12058f;
        Object obj4 = this.f12057e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i16 = n2.f12114f;
                ((n2) obj4).g(this.f12054b, this.f12055c, p3.p0.t(this.f12056d | 1), (String) obj3, (p3.m) obj);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                dk0.a.a((h4.r) obj4, (dk0.f) obj3, this.f12054b, (p3.m) obj, p3.p0.t(i15 | 1), this.f12056d);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                gs.l.b((h4.r) obj4, (List) obj3, this.f12054b, (p3.m) obj, p3.p0.t(i15 | 1), this.f12056d);
                return Unit.INSTANCE;
            case 3:
                p3.n1 n1Var = (p3.n1) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    boolean zB = mVar.B(n1Var) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new n02.i(lVar, n1Var, 0);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n02.i(lVar, n1Var, 0);
                            mVar.K(objQ);
                        }
                    }
                    r82.g.g(null, null, null, null, this.f12054b, this.f12055c, this.f12056d, (e23.l) objQ, mVar, 0, 15);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                w52.u.a(this.f12054b, iT, this.f12056d, (h4.r) obj4, (p3.m) obj, (z3.e) obj3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m2(n2 n2Var, int i14, int i15, String str, int i16) {
        this.f12053a = 0;
        this.f12057e = n2Var;
        this.f12054b = i14;
        this.f12055c = i15;
        this.f12058f = str;
        this.f12056d = i16;
    }

    public /* synthetic */ m2(h4.r rVar, int i14, z3.e eVar, int i15, int i16) {
        this.f12053a = 4;
        this.f12057e = rVar;
        this.f12054b = i14;
        this.f12058f = eVar;
        this.f12055c = i15;
        this.f12056d = i16;
    }

    public /* synthetic */ m2(h4.r rVar, Object obj, int i14, int i15, int i16, int i17) {
        this.f12053a = i17;
        this.f12057e = rVar;
        this.f12058f = obj;
        this.f12054b = i14;
        this.f12055c = i15;
        this.f12056d = i16;
    }
}
