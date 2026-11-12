package t11;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f161733b;

    public /* synthetic */ h(j jVar, int i14) {
        this.f161732a = i14;
        this.f161733b = jVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f161732a;
        j jVar = this.f161733b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = j.f161736f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    jVar.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = j.f161736f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = ((iIntValue2 << 3) & 112) | 6;
                    rVar.k(z3.f.c(2128109100, new sm1.j(rVar, 28), mVar2), mVar2, i17);
                    rVar.a(z3.f.c(835254869, new a1(29, rVar, jVar), mVar2), mVar2, i17);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
