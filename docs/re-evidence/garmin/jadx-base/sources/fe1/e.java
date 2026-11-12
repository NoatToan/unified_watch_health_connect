package fe1;

import e23.q;
import ew1.r1;
import h82.r;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f70540b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f70539a = i14;
        this.f70540b = gVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f70539a;
        g gVar = this.f70540b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                g.a aVar = g.f70543g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    gVar.h(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g.a aVar2 = g.f70543g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    gVar.i(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                g.a aVar3 = g.f70543g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    gVar.g(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                g.a aVar4 = g.f70543g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    gVar.j(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            default:
                r rVar = (r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                g.a aVar5 = g.f70543g;
                rVar.getClass();
                int i15 = 2;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i16 = ((iIntValue5 << 3) & 112) | 6;
                    rVar.k(z3.f.c(2133875776, new a(rVar, i15), mVar5), mVar5, i16);
                    rVar.a(z3.f.c(-165390153, new r1(12, rVar, gVar), mVar5), mVar5, i16);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
