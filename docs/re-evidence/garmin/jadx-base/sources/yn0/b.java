package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in0.h.a f198139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198140c;

    public /* synthetic */ b(in0.h.a aVar, un0.a aVar2, int i14) {
        this.f198138a = i14;
        this.f198139b = aVar;
        this.f198140c = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198138a;
        un0.a aVar = this.f198140c;
        in0.h.a aVar2 = this.f198139b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i.d(aVar2, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    i.c(aVar2.f94451b.f94453a, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    k.f(aVar2, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l.d(aVar2, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    l.c(aVar2.f94451b.f94453a, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 5:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    m.d(aVar2, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 6:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    m.c(aVar2.f94451b.f94453a, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            case 7:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    n.d(aVar2, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    n.c(aVar2.f94451b.f94453a, aVar, mVar, un0.a.f172042b << 3);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
