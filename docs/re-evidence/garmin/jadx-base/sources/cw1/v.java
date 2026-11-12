package cw1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f56230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f56231d;

    public /* synthetic */ v(i53.c cVar, String str, e23.l lVar, int i14) {
        this.f56228a = 4;
        this.f56230c = cVar;
        this.f56229b = str;
        this.f56231d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f56228a;
        e23.l lVar = this.f56231d;
        String str = this.f56229b;
        i53.c cVar = this.f56230c;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    b82.j.f16611a.a(0, this.f56231d, this.f56230c, this.f56229b, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                ik1.d.d(p3.p0.t(1), lVar, cVar, str, mVar);
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b82.j.f16611a.a(0, this.f56231d, this.f56230c, this.f56229b, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                int iIntValue3 = num.intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    b82.j.f16611a.a(0, this.f56231d, this.f56230c, this.f56229b, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                vd0.t0.d(p3.p0.t(1), lVar, cVar, str, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(String str, i53.c cVar, e23.l lVar, int i14) {
        this.f56228a = 1;
        this.f56229b = str;
        this.f56230c = cVar;
        this.f56231d = lVar;
    }

    public /* synthetic */ v(String str, i53.c cVar, e23.l lVar, int i14, byte b14) {
        this.f56228a = i14;
        this.f56229b = str;
        this.f56230c = cVar;
        this.f56231d = lVar;
    }
}
