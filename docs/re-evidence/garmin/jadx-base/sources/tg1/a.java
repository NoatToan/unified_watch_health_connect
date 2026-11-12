package tg1;

import i3.ve;
import o53.b0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg1.d f164498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pg1.d f164499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pg1.d f164500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f164501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f164502f;

    public /* synthetic */ a(sg1.d dVar, pg1.d dVar2, pg1.d dVar3, e23.l lVar, b0 b0Var, int i14) {
        this.f164497a = i14;
        this.f164498b = dVar;
        this.f164499c = dVar2;
        this.f164500d = dVar3;
        this.f164501e = lVar;
        this.f164502f = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f164497a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    sg1.d dVar = this.f164498b;
                    boolean z14 = dVar.f159211a;
                    pg1.d dVar2 = this.f164499c;
                    if (!z14) {
                        dVar2.invoke(Boolean.FALSE);
                    }
                    if (dVar.f159211a) {
                        mVar.C(1224281444);
                        mVar.f();
                        dVar2.invoke(Boolean.TRUE);
                    } else if (dVar.f159212b) {
                        mVar.C(1224391184);
                        g.f164513a.getClass();
                        p004k6.g.b(null, 0L, null, null, g.f164514b, mVar, 24576, 15);
                        mVar.f();
                    } else if (dVar.f159213c.isEmpty()) {
                        mVar.C(1224707539);
                        e.b(mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(1224798865);
                        boolean zR = mVar.r(dVar);
                        pg1.d dVar3 = this.f164500d;
                        boolean zB = zR | mVar.B(dVar3);
                        e23.l lVar = this.f164501e;
                        boolean zB2 = zB | mVar.B(lVar);
                        b0 b0Var = this.f164502f;
                        boolean zR2 = zB2 | mVar.r(b0Var);
                        Object objQ = mVar.q();
                        if (zR2) {
                            t42.l lVar2 = new t42.l(dVar, dVar3, lVar, b0Var, 4);
                            mVar.K(lVar2);
                            objQ = lVar2;
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                t42.l lVar3 = new t42.l(dVar, dVar3, lVar, b0Var, 4);
                                mVar.K(lVar3);
                                objQ = lVar3;
                            }
                        }
                        e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 511);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, z3.f.c(-294642309, new a(this.f164498b, this.f164499c, this.f164500d, this.f164501e, this.f164502f, 0), mVar2), mVar2, 12582912, 123);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
