package ak0;

import i3.fe;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f3663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f3664c;

    public /* synthetic */ q(z3.e eVar, fe feVar, int i14) {
        this.f3662a = i14;
        this.f3663b = eVar;
        this.f3664c = feVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3662a;
        fe feVar = this.f3664c;
        z3.e eVar = this.f3663b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    eVar.invoke(feVar, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    eVar.invoke(feVar, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
