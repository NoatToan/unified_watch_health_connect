package a71;

import h4.r;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1787b;

    public /* synthetic */ m(e eVar, int i14) {
        this.f1786a = i14;
        this.f1787b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1786a;
        e eVar = this.f1787b;
        Object[] objArr = 0;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-131341193, new m(eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    g6.f.a aVar = g6.f.f75994b;
                    x0Var.e(c2.l.y(r.S, 16), z3.f.c(-283355522, new n((Object) eVar, (int) (objArr == true ? 1 : 0)), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
