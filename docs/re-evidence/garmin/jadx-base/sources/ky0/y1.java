package ky0;

import java.util.LinkedHashMap;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107766a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f107767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f107768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f107769d;

    public /* synthetic */ y1(String str, e23.l lVar, boolean z14) {
        this.f107767b = str;
        this.f107768c = lVar;
        this.f107769d = z14;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f107766a;
        boolean z14 = this.f107769d;
        e23.l lVar = this.f107768c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                z1.a(p3.p0.t(1), lVar, this.f107767b, (p3.m) obj, z14);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    int i15 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap = c0235a.f16962a;
                    String str = this.f107767b;
                    linkedHashMap.put("navigateIconDescription", str);
                    b92.a aVarB = c0235a.b();
                    boolean zB = mVar.B(lVar) | mVar.h(z14);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ad0.e(lVar, z14, 12);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 12);
                            mVar.K(objQ);
                        }
                    }
                    int i16 = b92.a.f16960b;
                    z02.f.a(0, 40, aVarB, (e23.a) objQ, null, str, mVar, dVarA);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y1(String str, boolean z14, e23.l lVar, int i14) {
        this.f107767b = str;
        this.f107769d = z14;
        this.f107768c = lVar;
    }
}
