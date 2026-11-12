package fz1;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d f74000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f74001c;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar, p1 p1Var, int i14) {
        this.f73999a = i14;
        this.f74000b = dVar;
        this.f74001c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14;
        int i15 = this.f73999a;
        p1 p1Var = this.f74001c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar = this.f74000b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                r rVar = (r) p1Var.getF182175a();
                i14 = rVar != null ? com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.b.f46017b[rVar.ordinal()] : -1;
                if (i14 == 1) {
                    dVar.w6();
                } else if (i14 == 2) {
                    dVar.y6();
                } else if (i14 == 3) {
                    dVar.z6();
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                r rVar2 = (r) p1Var.getF182175a();
                i14 = rVar2 != null ? com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.b.f46017b[rVar2.ordinal()] : -1;
                if (i14 == 1) {
                    dVar.w6();
                } else if (i14 == 2) {
                    dVar.y6();
                } else if (i14 == 3) {
                    dVar.z6();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
