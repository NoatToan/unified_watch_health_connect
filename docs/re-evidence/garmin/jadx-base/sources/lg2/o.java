package lg2;

import c2.t2;
import p005kotlin.Unit;
import p3.x1;
import r1.c0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f112350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f112351c;

    public /* synthetic */ o(t2 t2Var, boolean z14, int i14) {
        this.f112349a = i14;
        this.f112350b = t2Var;
        this.f112351c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112349a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i.f112327a.getClass();
                    c0.d(this.f112350b, this.f112351c, null, null, null, null, i.f112328b, mVar, 1572864, 30);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    j.f112330a.getClass();
                    c0.d(this.f112350b, this.f112351c, null, null, null, null, j.f112331b, mVar2, 1572864, 30);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    j.f112330a.getClass();
                    c0.d(this.f112350b, this.f112351c, null, null, null, null, j.f112332c, mVar3, 1572864, 30);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    j.f112330a.getClass();
                    c0.d(this.f112350b, this.f112351c, null, null, null, null, j.f112333d, mVar4, 1572864, 30);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
