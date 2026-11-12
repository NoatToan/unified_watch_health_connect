package ml0;

import b82.k0;
import d53.w;
import i3.ba;
import i3.eh;
import i3.sg;
import o4.d0;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.v;
import p3.x1;
import s5.x0;
import x5.f0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.q f119211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f119212d;

    public /* synthetic */ f(String str, m4.q qVar, e23.l lVar, int i14) {
        this.f119209a = i14;
        this.f119210b = str;
        this.f119211c = qVar;
        this.f119212d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x010f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        z3.e eVarC;
        int i14 = this.f119209a;
        e23.l lVar = this.f119212d;
        m4.q qVar = this.f119211c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    v.a(u2.f201804a.c(new t2(d92.b.a(mVar).k().a(), d0.c(0.4f, d92.b.a(mVar).k().a(), 14), null)), z3.f.c(750240702, new f(this.f119210b, qVar, lVar, i15), mVar), mVar, 56);
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
                    String str = this.f119210b;
                    if (w.J(str)) {
                        mVar2.C(-587570448);
                        mVar2.f();
                        eVarC = null;
                    } else {
                        mVar2.C(-588108484);
                        eVarC = z3.f.c(-447962841, new b71.n(lVar, 12, (byte) 0), mVar2);
                        mVar2.f();
                    }
                    x5.v.f188954b.getClass();
                    int i16 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    a2 a2Var = new a2(0, (Boolean) null, i16, x5.p.f188922f, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    boolean zR = mVar2.r(qVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new k0(qVar, 8);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k0(qVar, 8);
                            mVar2.K(objQ);
                        }
                    }
                    z1 z1Var = new z1(null, null, null, null, (e23.l) objQ, null, 47, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    ba baVar = ba.f87580a;
                    d0.f128823b.getClass();
                    long j8 = d0.f128831j;
                    long jA = d92.b.a(mVar2).k().a();
                    baVar.getClass();
                    sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA, null, j8, j8, 0L, 0L, j8, j8, 0L, 0L, 0L, 0L, mVar2, 2147378943);
                    boolean zB = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new k11.n(lVar, 27);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k11.n(lVar, 27);
                            mVar2.K(objQ2);
                        }
                    }
                    b.f119197a.getClass();
                    eh.a(str, (e23.l) objQ2, rVarA, false, x0VarB, b.f119198b, b.f119199c, eVarC, null, a2Var, z1Var, true, 0, 0, null, null, sgVarC, mVar2, 113246592, 12779520, 3963992);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
