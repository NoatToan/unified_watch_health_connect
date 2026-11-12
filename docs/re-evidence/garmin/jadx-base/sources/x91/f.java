package x91;

import i3.fe;
import l72.d3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f189607b;

    public /* synthetic */ f(fe feVar, int i14) {
        this.f189606a = i14;
        this.f189607b = feVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189606a;
        fe feVar = this.f189607b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d3.b(feVar, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d3.b(feVar, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d3.b(feVar, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d3.b(feVar, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d3.b(feVar, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    d3.b(feVar, c2.l.D(h4.r.S), mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
