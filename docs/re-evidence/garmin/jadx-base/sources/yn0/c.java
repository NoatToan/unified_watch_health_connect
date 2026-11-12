package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.h.a f198142b;

    public /* synthetic */ c(in0.h.a aVar, int i14) {
        this.f198141a = i14;
        this.f198142b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198141a;
        in0.h.a aVar = this.f198142b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    xn0.g.a(aVar.f94451b.f94454b, aVar.f94452c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    xn0.g.a(aVar.f94451b.f94454b, aVar.f94452c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    xn0.g.a(aVar.f94451b.f94454b, aVar.f94452c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    xn0.g.a(aVar.f94451b.f94454b, aVar.f94452c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    xn0.g.a(aVar.f94451b.f94454b, aVar.f94452c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
