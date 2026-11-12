package ih0;

import lc.y;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93472a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f93473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f93474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f93475d;

    public /* synthetic */ p(s sVar, e23.a aVar, y yVar) {
        this.f93473b = sVar;
        this.f93475d = aVar;
        this.f93474c = yVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93472a;
        e23.a aVar = this.f93475d;
        y yVar = this.f93474c;
        s sVar = this.f93473b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(2006427800, new q(0, aVar, yVar), mVar), null, null, null, z3.f.c(-1340751972, new gw1.c(sVar, 19, s9.c.c(sVar.f93487f, mVar), yVar), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.fitness_age.presentation.a.a(sVar, yVar, aVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(s sVar, y yVar, e23.a aVar, int i14) {
        this.f93473b = sVar;
        this.f93474c = yVar;
        this.f93475d = aVar;
    }
}
