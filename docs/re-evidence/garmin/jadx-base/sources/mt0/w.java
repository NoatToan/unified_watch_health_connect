package mt0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f120897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.g f120898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f120899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f120900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f120901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f120902g;

    public /* synthetic */ w(u4.d dVar, com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar, int i14, String str, String str2, e23.a aVar, int i15) {
        this.f120896a = i15;
        this.f120897b = dVar;
        this.f120898c = gVar;
        this.f120899d = i14;
        this.f120900e = str;
        this.f120901f = str2;
        this.f120902g = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f120896a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(2067786750, new w(this.f120897b, this.f120898c, this.f120899d, this.f120900e, this.f120901f, this.f120902g, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    b82.n.d(this.f120897b, this.f120898c.getString(this.f120899d), this.f120900e, null, this.f120901f, this.f120902g, null, null, mVar2, 0, 200);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
