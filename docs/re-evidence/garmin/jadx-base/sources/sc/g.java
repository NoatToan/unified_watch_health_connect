package sc;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158450b;

    public /* synthetic */ g(h hVar, int i14) {
        this.f158449a = 0;
        this.f158450b = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f158449a;
        h hVar = this.f158450b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                hVar.a(mVar, p0.t(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    hVar.a(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    hVar.a(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                int iIntValue3 = num.intValue();
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    hVar.a(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue4 = num.intValue();
                if (mVar.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    hVar.a(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(h hVar, int i14, byte b14) {
        this.f158449a = i14;
        this.f158450b = hVar;
    }
}
