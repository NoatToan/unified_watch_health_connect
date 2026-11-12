package n40;

import e23.p;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.c f123565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f123566c;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.courses.model.c cVar, e23.l lVar) {
        this.f123564a = 0;
        this.f123565b = cVar;
        this.f123566c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f123564a;
        e23.l lVar = this.f123566c;
        com.garmin.android.apps.connectmobile.courses.model.c cVar = this.f123565b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d.b(cVar, lVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                d.a(cVar, lVar, mVar, p0.t(1));
                break;
            default:
                num.getClass();
                d.b(cVar, lVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.courses.model.c cVar, e23.l lVar, int i14, int i15) {
        this.f123564a = i15;
        this.f123565b = cVar;
        this.f123566c = lVar;
    }
}
