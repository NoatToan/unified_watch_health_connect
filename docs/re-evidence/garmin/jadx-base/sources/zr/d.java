package zr;

import c2.t;
import e23.q;
import h4.r;
import nr.z;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f206710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f206711c;

    public /* synthetic */ d(r rVar, z zVar, int i14) {
        this.f206709a = i14;
        this.f206710b = rVar;
        this.f206711c = zVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f206709a;
        z zVar = this.f206711c;
        r rVar = this.f206710b;
        t tVar = (t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                tVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    h.d(rVar, zVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                tVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    h.d(rVar, zVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
