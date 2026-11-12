package xr;

import g02.a1;
import i3.ve;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f192017b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f192016a = i14;
        this.f192017b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f192016a;
        r rVar = this.f192017b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(665426834, new q(rVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ve.a(null, null, p6.b.a(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, z3.f.c(-1223099561, new q(rVar, i15), mVar2), mVar2, 12582912, 123);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    a1.a(null, rVar.f192018a.getIntValue(), 0.0f, (e23.l) rVar.f192019b.getF182175a(), mVar3, 0, 5);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
