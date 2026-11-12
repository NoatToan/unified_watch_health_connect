package fz1;

import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b f73986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gz1.a f73987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f73988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f73989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f73990f;

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar, gz1.a aVar, p1 p1Var, p1 p1Var2, int i14, int i15) {
        this.f73985a = i15;
        this.f73986b = bVar;
        this.f73987c = aVar;
        this.f73988d = p1Var;
        this.f73989e = p1Var2;
        this.f73990f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73985a;
        int i15 = this.f73990f;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                this.f73986b.y6(this.f73987c, this.f73988d, this.f73989e, mVar, p0.t(i15 | 1));
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                this.f73986b.A6(this.f73987c, this.f73988d, this.f73989e, mVar2, p0.t(i15 | 1));
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                this.f73986b.u6(this.f73987c, this.f73988d, this.f73989e, mVar3, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
