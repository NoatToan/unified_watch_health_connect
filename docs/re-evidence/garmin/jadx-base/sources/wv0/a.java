package wv0;

import b82.k0;
import c2.x2;
import c2.z;
import h5.e0;
import i3.mh;
import i3.ve;
import m4.b0;
import o4.t1;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import x5.f0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187358a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f187359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f187360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f187361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f187362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m4.q f187365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f187366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.l f187367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1 f187368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f187369l;

    public /* synthetic */ a(h4.r rVar, String str, b0 b0Var, p1 p1Var, int i14, int i15, m4.q qVar, Integer num, e23.l lVar, p1 p1Var2, String str2) {
        this.f187359b = rVar;
        this.f187360c = str;
        this.f187361d = b0Var;
        this.f187362e = p1Var;
        this.f187363f = i14;
        this.f187364g = i15;
        this.f187365h = qVar;
        this.f187366i = num;
        this.f187367j = lVar;
        this.f187368k = p1Var2;
        this.f187369l = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        x0 x0VarF;
        int i14 = this.f187358a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
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
                    h4.r rVar = this.f187359b;
                    h4.r rVarF = x2.f(rVar, 1.0f);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = tn.k.c(mVar);
                    }
                    a2.j jVar = (a2.j) objQ;
                    Object objQ2 = mVar.q();
                    b0 b0Var2 = this.f187361d;
                    p1 p1Var = this.f187362e;
                    if (objQ2 == c2565a) {
                        objQ2 = new cr.f(b0Var2, p1Var, 2);
                        mVar.K(objQ2);
                    }
                    ve.a(u1.w.b(rVarF, jVar, null, false, null, null, (e23.a) objQ2, 28), null, p6.b.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(532739091, new a(rVar, this.f187360c, b0Var2, this.f187368k, this.f187363f, this.f187364g, this.f187365h, this.f187366i, this.f187367j, p1Var, this.f187369l), mVar), mVar, 12582912, 122);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF2 = x2.f(c2.l.y(this.f187359b, j92.b.f97899b.f97920e), 1.0f);
                    c2.j jVar2 = c2.j.f22691a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(2);
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(iVarI, h4.d.a.f81536n, mVar2, 54);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(this.f187360c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                    h4.r rVarA = m4.e.a(h4.r.S, this.f187361d);
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    p1 p1Var2 = this.f187368k;
                    if (objQ3 == c2565a2) {
                        objQ3 = new vd0.d(p1Var2, 22);
                        mVar2.K(objQ3);
                    }
                    h4.r rVarC3 = m4.e.c(rVarA, (e23.l) objQ3);
                    p1 p1Var3 = this.f187362e;
                    l0 l0Var = (l0) p1Var3.getF182175a();
                    x5.u.f188948b.getClass();
                    a2 a2Var = new a2(x5.u.f188952f, (Boolean) null, this.f187363f, this.f187364g, (f0) null, (Boolean) null, (z5.c) null, 114, (p005kotlin.jvm.internal.j) null);
                    m4.q qVar = this.f187365h;
                    boolean zR = mVar2.r(qVar);
                    Object objQ4 = mVar2.q();
                    if (zR || objQ4 == c2565a2) {
                        objQ4 = new k0(qVar, 14);
                        mVar2.K(objQ4);
                    }
                    z1 z1Var = new z1((e23.l) objQ4, null, null, null, null, null, 62, null);
                    t1 t1Var = new t1(zl.a.a(mVar2), null);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar2.C(-2116409225);
                        x0VarF = d92.c.b(j92.f.f97933j, mVar2);
                    } else {
                        mVar2.C(-2116408039);
                        x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                    }
                    mVar2.f();
                    Integer num = this.f187366i;
                    boolean zB = mVar2.B(num);
                    e23.l lVar = this.f187367j;
                    boolean zB2 = zB | mVar2.B(lVar);
                    Object objQ5 = mVar2.q();
                    if (zB2 || objQ5 == c2565a2) {
                        objQ5 = new r82.r(num, lVar, p1Var3, 1);
                        mVar2.K(objQ5);
                    }
                    p006l2.r.c(l0Var, (e23.l) objQ5, rVarC3, false, false, x0VarF, a2Var, z1Var, false, 0, 0, null, null, null, t1Var, z3.f.c(268425286, new sa0.e(p1Var3, this.f187369l, p1Var2), mVar2), mVar2, 100663296, 196608, 15896);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(h4.r rVar, b0 b0Var, p1 p1Var, String str, p1 p1Var2, int i14, int i15, m4.q qVar, Integer num, e23.l lVar, String str2) {
        this.f187359b = rVar;
        this.f187361d = b0Var;
        this.f187362e = p1Var;
        this.f187360c = str;
        this.f187368k = p1Var2;
        this.f187363f = i14;
        this.f187364g = i15;
        this.f187365h = qVar;
        this.f187366i = num;
        this.f187367j = lVar;
        this.f187369l = str2;
    }
}
