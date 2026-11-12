package jx0;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dx0.e f101475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww0.n f101476c;

    public /* synthetic */ i(dx0.e eVar, ww0.n nVar, int i14) {
        this.f101474a = i14;
        this.f101475b = eVar;
        this.f101476c = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f101474a;
        ww0.n nVar = this.f101476c;
        dx0.e eVar = this.f101475b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = h.b.f101462f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(557578525, new i(eVar, nVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = h.b.f101462f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    dx0.d.c(eVar, nVar, mVar2, ww0.n.f187619h << 3);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
