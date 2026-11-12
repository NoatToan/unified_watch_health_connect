package vy0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.navigation.more.b f180761b;

    public /* synthetic */ o(com.garmin.android.apps.connectmobile.navigation.more.b bVar, int i14) {
        this.f180760a = i14;
        this.f180761b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180760a;
        com.garmin.android.apps.connectmobile.navigation.more.b bVar = this.f180761b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ty0.j f39397b = bVar.getF39397b();
                    if (f39397b == null || !f39397b.getF166936b()) {
                        mVar.C(346017767);
                    } else {
                        mVar.C(-404480536);
                        i.a(mVar, 0);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ty0.j f39397b2 = bVar.getF39397b();
                    if (f39397b2 != null ? f39397b2.getF166936b() : false) {
                        mVar.C(1134346605);
                        i.a(mVar, 0);
                    } else {
                        mVar.C(805018882);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
