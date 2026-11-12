package ug2;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mg2.g f170903b;

    public /* synthetic */ o(mg2.g gVar, int i14) {
        this.f170902a = i14;
        this.f170903b = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f170902a;
        mg2.g gVar = this.f170903b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    mg2.n.a(gVar, null, null, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    mg2.n.a(gVar, null, null, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    mg2.n.a(gVar, null, null, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
