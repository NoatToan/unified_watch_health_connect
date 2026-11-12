package hz0;

import li0.k0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86484a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ li0.d0 f86485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ li0.e f86486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f86487d;

    public /* synthetic */ v(li0.d0 d0Var, float f14, li0.e eVar) {
        this.f86485b = d0Var;
        this.f86487d = f14;
        this.f86486c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f86484a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    k0.h(this.f86485b, this.f86487d, this.f86486c, mVar, li0.d0.f112647j | (li0.f.f112658h << 6));
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                float f15 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    k0.g(this.f86485b, this.f86486c, this.f86487d, null, mVar2, li0.d0.f112647j | (li0.f.f112658h << 3), 8);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(li0.d0 d0Var, li0.e eVar, float f14) {
        this.f86485b = d0Var;
        this.f86486c = eVar;
        this.f86487d = f14;
    }
}
