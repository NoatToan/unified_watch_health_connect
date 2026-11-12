package o62;

import com.garmin.android.apps.connectmobile.k1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i f129708b;

    public /* synthetic */ l0(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar, int i14) {
        this.f129707a = i14;
        this.f129708b = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar;
        switch (this.f129707a) {
            case 0:
                this.f129708b.f49699d.K4(true);
                break;
            case 1:
                this.f129708b.f49699d.I4(true);
                break;
            case 2:
                this.f129708b.f49699d.K4(false);
                break;
            case 3:
                this.f129708b.f49699d.I4(false);
                break;
            case 4:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar = this.f129708b;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar = iVar.f49699d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = iVar.f49697b;
                int i14 = (int) j0Var.f48229n;
                boolean z14 = j0Var.f48223i;
                bv.b.f21239a.getClass();
                bv.b.a();
                jVar.J4(new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.a(i14, k1.f37122a.C(), z14));
                break;
            case 5:
                this.f129708b.f49699d.J4(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.j.f49693a);
                break;
            case 6:
                this.f129708b.f49699d.J4(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.j.f49693a);
                break;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar2 = this.f129708b.f49699d;
                if (g22.n.d(jVar2.G4().H0) && g22.n.d(jVar2.G4().g())) {
                    eVar = new com.garmin.android.apps.connectmobile.repcounting.model.e();
                    com.garmin.android.apps.connectmobile.repcounting.model.b bVar = new com.garmin.android.apps.connectmobile.repcounting.model.b();
                    bVar.H(jVar2.G4().H0);
                    bVar.I(jVar2.G4().g());
                    bVar.M();
                    eVar.h0(new com.garmin.android.apps.connectmobile.repcounting.model.b[]{bVar});
                } else {
                    eVar = null;
                }
                jVar2.J4(new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.e(jVar2.B4().f49623b, eVar, k52.g.c(jVar2.f49701a)));
                break;
        }
        return Unit.INSTANCE;
    }
}
