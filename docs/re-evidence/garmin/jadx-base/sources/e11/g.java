package e11;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.a0 f61885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f61886c;

    public /* synthetic */ g(c2.a0 a0Var, boolean z14, int i14) {
        this.f61884a = i14;
        this.f61885b = a0Var;
        this.f61886c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f61884a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    b.f61856a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, b.f61857b, mVar, 1572864, 30);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b.f61856a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, b.f61858c, mVar2, 1572864, 30);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    b.f61856a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, b.f61859d, mVar3, 1572864, 30);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    c.f61863a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, c.f61864b, mVar4, 1572864, 30);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d.f61868a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, d.f61869b, mVar5, 1572864, 30);
                } else {
                    mVar5.e();
                }
                break;
            default:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    fz1.a.f73974a.getClass();
                    r1.c0.c(this.f61885b, this.f61886c, null, null, null, null, fz1.a.f73975b, mVar6, 1572864, 30);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
