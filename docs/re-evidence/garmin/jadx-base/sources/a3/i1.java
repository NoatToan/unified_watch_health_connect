package a3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f689g;

    public /* synthetic */ i1(h4.r rVar, o4.r1 r1Var, long j8, float f14, float f15, z3.e eVar) {
        this.f683a = 0;
        this.f684b = rVar;
        this.f687e = r1Var;
        this.f688f = j8;
        this.f685c = f14;
        this.f686d = f15;
        this.f689g = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f683a;
        Object obj3 = this.f689g;
        switch (i14) {
            case 0:
                z3.e eVar = (z3.e) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarC = n1.c(this.f686d, n1.d(this.f688f, (j0) mVar.A(k0.f707a), this.f685c, mVar), this.f684b, this.f687e);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new a03.h(15);
                        mVar.K(objQ);
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarC, false);
                    Unit unit = Unit.INSTANCE;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = m1.f754a;
                        mVar.K(objQ2);
                    }
                    h4.r rVarB = b5.s0.b(rVarC2, unit, (PointerInputEventHandler) objQ2);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                    int iP = mVar.P();
                    i2 i2VarX = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iP))) {
                        v.h.z(iP, mVar, iP, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar);
                    c2.u uVar = c2.u.f22885a;
                    eVar.invoke(mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                i3.f0 f0Var = i3.f0.f88041a;
                ((i3.f0) obj3).a(this.f684b, this.f685c, this.f686d, this.f687e, this.f688f, mVar2, p3.p0.t(196609));
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                zz2.b bVar2 = zz2.b.f207647a;
                ((zz2.b) obj3).a(this.f684b, this.f685c, this.f686d, this.f687e, this.f688f, mVar3, p3.p0.t(196609));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i1(Object obj, h4.r rVar, float f14, float f15, o4.r1 r1Var, long j8, int i14, int i15) {
        this.f683a = i15;
        this.f689g = obj;
        this.f684b = rVar;
        this.f685c = f14;
        this.f686d = f15;
        this.f687e = r1Var;
        this.f688f = j8;
    }
}
