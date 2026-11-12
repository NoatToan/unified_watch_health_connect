package jy0;

import i3.ef;
import i3.ff;
import i3.hf;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f101673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f101674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f101676e;

    public /* synthetic */ a0(int i14, e23.l lVar, p1 p1Var, boolean z14, boolean z15) {
        this.f101672a = i14;
        this.f101673b = z14;
        this.f101674c = lVar;
        this.f101675d = z15;
        this.f101676e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f101672a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f101676e;
        e23.l lVar = this.f101674c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ef efVarA = d92.c.a(ff.f88115a, mVar);
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a11.b0(lVar, p1Var, 15);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.b0(lVar, p1Var, 15);
                            mVar.K(objQ);
                        }
                    }
                    hf.a(this.f101673b, (e23.l) objQ, null, this.f101675d, efVarA, mVar, 0, 76);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ef efVarA2 = d92.c.a(ff.f88115a, mVar2);
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new oy0.c(lVar, p1Var, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new oy0.c(lVar, p1Var, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    hf.a(this.f101673b, (e23.l) objQ2, null, this.f101675d, efVarA2, mVar2, 0, 76);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
