package hz0;

import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.newsfeed.d f86481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f86482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.newsfeed.d.j f86483d;

    public /* synthetic */ u(com.garmin.android.apps.connectmobile.newsfeed.d dVar, List list, com.garmin.android.apps.connectmobile.newsfeed.d.j jVar, int i14) {
        this.f86480a = i14;
        this.f86481b = dVar;
        this.f86482c = list;
        this.f86483d = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f86480a;
        com.garmin.android.apps.connectmobile.newsfeed.d.j jVar = this.f86483d;
        List list = this.f86482c;
        com.garmin.android.apps.connectmobile.newsfeed.d dVar = this.f86481b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(290388999, new u(dVar, list, jVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                float f15 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    dVar.f(i53.a.e(list), jVar, mVar, li0.d0.f112647j);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
