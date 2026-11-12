package g11;

import e23.q;
import g21.u;
import h4.r;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f74867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f74868c;

    public /* synthetic */ n(Integer num, u uVar, int i14) {
        this.f74866a = i14;
        this.f74867b = num;
        this.f74868c = uVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Float fValueOf;
        int i14 = this.f74866a;
        u uVar = this.f74868c;
        Integer num = this.f74867b;
        switch (i14) {
            case 0:
                r rVar = (r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    fValueOf = num != null ? Float.valueOf(num.intValue()) : null;
                    f02.u.f67749a.getClass();
                    z01.b.a(rVar, fValueOf, f02.u.b(mVar), f02.u.d(mVar), Float.valueOf(uVar.f75500b), mVar, iIntValue & 14);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    fValueOf = num != null ? Float.valueOf(num.intValue()) : null;
                    f02.u.f67749a.getClass();
                    z01.b.a(rVar2, fValueOf, f02.u.b(mVar2), f02.u.d(mVar2), Float.valueOf(uVar.f75500b), mVar2, iIntValue2 & 14);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
