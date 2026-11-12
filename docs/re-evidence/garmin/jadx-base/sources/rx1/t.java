package rx1;

import b82.k0;
import ds.e0;
import i3.eh;
import i3.sg;
import i3.wg;
import l72.i1;
import o4.d0;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.x1;
import s5.x0;
import x5.f0;
import x5.l0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f155022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f155023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f155024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f155025e;

    public /* synthetic */ t(m4.q qVar, l0 l0Var, Integer num, e23.l lVar, int i14) {
        this.f155021a = i14;
        this.f155022b = qVar;
        this.f155023c = l0Var;
        this.f155024d = num;
        this.f155025e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x00f3  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f155021a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    p3.v.a(u2.f201804a.c(new t2(d92.b.a(mVar).k().a(), d0.c(0.4f, d92.b.a(mVar).k().a(), 14), null)), z3.f.c(-767914679, new t(this.f155022b, this.f155023c, this.f155024d, this.f155025e, 1), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                    x5.v.f188954b.getClass();
                    int i14 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    int i15 = x5.p.f188926j;
                    x5.u.f188948b.getClass();
                    a2 a2Var = new a2(x5.u.f188952f, (Boolean) null, i14, i15, (f0) null, (Boolean) null, (z5.c) null, 114, (p005kotlin.jvm.internal.j) null);
                    m4.q qVar = this.f155022b;
                    boolean zR = mVar2.r(qVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new k0(qVar, 13);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k0(qVar, 13);
                            mVar2.K(objQ);
                        }
                    }
                    z1 z1Var = new z1((e23.l) objQ, null, null, null, null, null, 62, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    wg wgVar = wg.f90137a;
                    long jA = zl.a.a(mVar2);
                    long jA2 = zl.a.a(mVar2);
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar2);
                    long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar2);
                    long jB = sn.a.b(mVar2);
                    long jE = e0.e(mVar2);
                    long jB2 = sn.a.b(mVar2);
                    long jB3 = sn.a.b(mVar2);
                    long jB4 = sn.a.b(mVar2);
                    d0.f128823b.getClass();
                    long j8 = d0.f128831j;
                    wgVar.getClass();
                    sg sgVarC = wg.c(jA, jA2, j8, j8, jE, j8, j8, jB, jB2, jB3, jB4, jX, jX2, mVar2, 1743152844);
                    Integer num = this.f155024d;
                    boolean zB = mVar2.B(num);
                    e23.l lVar = this.f155025e;
                    boolean zB2 = zB | mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new i1(lVar, 2, num);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i1(lVar, 2, num);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    l0 l0Var = this.f155023c;
                    eh.b(l0Var, lVar2, rVarA, false, x0VarB, null, null, null, z3.f.c(-1281420176, new u(num, 0, l0Var, lVar), mVar2), null, false, null, a2Var, z1Var, false, 0, 0, null, null, sgVarC, mVar2, 805306752, 12582912, 0, 3964376);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
