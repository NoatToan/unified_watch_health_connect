package rg0;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152588a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f152589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f152590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f152591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f152592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f152593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d f152594g;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5) {
        this.f152594g = dVar;
        this.f152589b = aVar;
        this.f152590c = aVar2;
        this.f152591d = aVar3;
        this.f152592e = aVar4;
        this.f152593f = aVar5;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f152588a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar = this.f152594g;
                    int i14 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c.b.f35034a[dVar.f35035a.f35049g.ordinal()];
                    int i15 = R.string.account_access;
                    if (i14 != 1) {
                        if (i14 == 2 || i14 == 3) {
                            i15 = R.string.authorized_viewer;
                        } else if (i14 != 4) {
                            u0.r();
                            return null;
                        }
                    }
                    z02.d.a(false, z3.f.c(1603432888, new at1.c(i15, this.f152589b, 12), mVar), null, null, null, z3.f.c(-677394892, new ob0.e(dVar, this.f152590c, this.f152591d, this.f152592e, this.f152593f), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c.a(this.f152589b, this.f152590c, this.f152591d, this.f152592e, this.f152593f, this.f152594g, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar, int i14) {
        this.f152589b = aVar;
        this.f152590c = aVar2;
        this.f152591d = aVar3;
        this.f152592e = aVar4;
        this.f152593f = aVar5;
        this.f152594g = dVar;
    }
}
