package ty1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f167235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.d f167236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f167237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f167238e;

    public /* synthetic */ t(boolean z14, com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar, boolean z15, boolean z16, int i14) {
        this.f167234a = i14;
        this.f167235b = z14;
        this.f167236c = dVar;
        this.f167237d = z15;
        this.f167238e = z16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f167234a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(676140849, new t(this.f167235b, this.f167236c, this.f167237d, this.f167238e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = this.f167235b;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar = this.f167236c;
                    if (z14) {
                        mVar2.C(-484496926);
                        dVar.v6(mVar2, 0);
                        mVar2.f();
                    } else if (this.f167237d) {
                        mVar2.C(-484359038);
                        dVar.y6(mVar2, 0);
                        mVar2.f();
                    } else if (this.f167238e) {
                        mVar2.C(-484219104);
                        dVar.A6(mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-484119439);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
