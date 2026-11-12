package h81;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f82422b;

    public /* synthetic */ g(h hVar, int i14) {
        this.f82421a = i14;
        this.f82422b = hVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f82421a;
        h hVar = this.f82422b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = h.f82423h;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    hVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = h.f82423h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    e.c(hVar.f82424f, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = h.f82423h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    e.c(hVar.f82424f, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = h.f82423h;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i19 = ((iIntValue4 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-801595412, new fe1.a(rVar, 17), mVar4), mVar4, i19);
                    rVar.a(z3.f.c(-279223261, new g80.e(17, rVar, hVar), mVar4), mVar4, i19);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
