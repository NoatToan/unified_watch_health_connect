package b82;

import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.sg;
import i3.wg;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o13.h f16771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16772g;

    public /* synthetic */ s0(long j8, String str, a2.j jVar, String str2, e23.p pVar, m4.q qVar) {
        this.f16767b = j8;
        this.f16768c = str;
        this.f16770e = jVar;
        this.f16769d = str2;
        this.f16771f = pVar;
        this.f16772g = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f16766a;
        Object obj4 = this.f16772g;
        o13.h hVar = this.f16771f;
        Object obj5 = this.f16770e;
        Object obj6 = this.f16769d;
        Object obj7 = this.f16768c;
        switch (i14) {
            case 0:
                String str = (String) obj7;
                a2.j jVar = (a2.j) obj5;
                String str2 = (String) obj6;
                e23.p pVar = (e23.p) hVar;
                m4.q qVar = (m4.q) obj4;
                e23.p<? super p3.m, ? super Integer, Unit> pVar2 = (e23.p) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t0 t0Var = t0.f16792a;
                pVar2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.r(pVar2) ? 4 : 2;
                }
                int i15 = iIntValue;
                if (mVar.n(i15 & 1, (i15 & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    wg wgVar = wg.f90137a;
                    x5.r0.f188941a.getClass();
                    nb0.b bVar = x5.r0.a.f188943b;
                    k2.a aVar = j92.h.f97941a.f87991b;
                    g6.f.a aVar2 = g6.f.f75994b;
                    l2 l2VarA = c2.l.a(0);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                    long jA2 = zl.a.a(mVar);
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
                    long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
                    long jB = sn.a.b(mVar);
                    long jE = ds.e0.e(mVar);
                    long jB2 = sn.a.b(mVar);
                    long jB3 = sn.a.b(mVar);
                    long jB4 = sn.a.b(mVar);
                    o4.d0.f128823b.getClass();
                    long j8 = o4.d0.f128831j;
                    wgVar.getClass();
                    long j14 = this.f16767b;
                    sg sgVarC = wg.c(jA, jA2, j14, j14, jE, j8, j8, jB, jB2, jB3, jB4, jX, jX2, mVar, 1743152844);
                    z3.e eVarC = z3.f.c(-1961294103, new as.p(str2, 1), mVar);
                    d.f16510a.getClass();
                    wgVar.b(str, pVar2, true, true, bVar, jVar, false, null, eVarC, d.f16511b, z3.f.c(-2063043080, new a3.e(str, 20, pVar, qVar), mVar), null, null, null, aVar, sgVarC, l2VarA, null, mVar, ((i15 << 3) & 112) | 905997696, 102236166, 145600);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) obj7;
                jb0.c cVar = (jb0.c) obj6;
                e23.a aVar3 = (e23.a) obj5;
                e23.a aVar4 = (e23.a) hVar;
                e23.a aVar5 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarQ = x2.q(c2.l.y(aVar6, eVar.f97923h), 200);
                    boolean zB = mVar2.B(lVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new fb0.d(lVar, 22);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fb0.d(lVar, 22);
                            mVar2.K(objQ);
                        }
                    }
                    ib0.e.a(x80.c.a(rVarQ, (e23.l) objQ), cVar, this.f16767b, mVar2, 0);
                    h4.r rVarA = c2.l.A(x2.f(aVar6, 1.0f), 0.0f, eVar.f97920e, 1);
                    c2.j jVar2 = c2.j.f22691a;
                    float f14 = eVar.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    ib0.w.d(u2Var, jb0.b.f98103c, aVar3, mVar2, 54);
                    ib0.w.d(u2Var, jb0.b.f98104d, aVar4, mVar2, 54);
                    ib0.w.d(u2Var, jb0.b.f98105e, aVar5, mVar2, 54);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s0(e23.l lVar, jb0.c cVar, long j8, e23.a aVar, e23.a aVar2, e23.a aVar3) {
        this.f16768c = lVar;
        this.f16769d = cVar;
        this.f16767b = j8;
        this.f16770e = aVar;
        this.f16771f = aVar2;
        this.f16772g = aVar3;
    }
}
