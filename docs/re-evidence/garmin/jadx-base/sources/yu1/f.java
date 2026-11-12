package yu1;

import c2.t2;
import e23.q;
import l72.x0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fy1.f f199784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f199787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f199788f;

    public /* synthetic */ f(fy1.f fVar, String str, String str2, String str3, String str4, int i14) {
        this.f199783a = i14;
        this.f199784b = fVar;
        this.f199785c = str;
        this.f199786d = str2;
        this.f199787e = str3;
        this.f199788f = str4;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f199783a;
        String str = this.f199788f;
        String str2 = this.f199786d;
        fy1.f fVar = this.f199784b;
        t2 t2Var = (t2) obj;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String str3 = fVar.f73916a;
                    String str4 = fVar.f73918c;
                    b92.a aVarA = wz1.a.a(str2);
                    int i15 = b92.a.f16960b;
                    int i16 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.f(i16, 52, aVarA, t2Var, null, null, str3, this.f199785c, str4, null, mVar);
                    x0Var.f(i16, 52, wz1.a.a(str), t2Var, null, null, fVar.f73919d, this.f199787e, fVar.f73921f, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String str5 = fVar.f73916a;
                    String str6 = fVar.f73918c;
                    b92.a aVarA2 = wz1.a.a(str2);
                    int i17 = b92.a.f16960b;
                    int i18 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i18, 52, aVarA2, t2Var, null, null, str5, this.f199785c, str6, null, mVar2);
                    x0Var2.a(i18, 52, wz1.a.a(str), t2Var, null, null, fVar.f73919d, this.f199787e, fVar.f73921f, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    int i19 = iIntValue3;
                    x0 x0Var3 = x0.f111346a;
                    String str7 = fVar.f73916a;
                    String str8 = fVar.f73918c;
                    b92.a aVarA3 = wz1.a.a(str2);
                    int i24 = b92.a.f16960b;
                    int i25 = (i19 & 14) | (x0.f111348c << 24);
                    x0Var3.f(i25, 52, aVarA3, t2Var, null, null, str7, this.f199785c, str8, null, mVar3);
                    x0Var3.f(i25, 52, wz1.a.a(str), t2Var, null, null, fVar.f73919d, this.f199787e, fVar.f73921f, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
