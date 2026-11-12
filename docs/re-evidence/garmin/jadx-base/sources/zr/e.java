package zr;

import c2.t;
import e23.q;
import nr.z;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f206713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f206714c;

    public /* synthetic */ e(z zVar, Integer num, int i14) {
        this.f206712a = i14;
        this.f206713b = zVar;
        this.f206714c = num;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f206712a;
        Integer num = this.f206714c;
        z zVar = this.f206713b;
        t tVar = (t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    h.f(tVar, zVar, num, mVar, iIntValue & 14);
                } else {
                    mVar.e();
                }
                break;
            default:
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    h.f(tVar, zVar, num, mVar, iIntValue & 14);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
