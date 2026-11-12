package f62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h f69369b;

    public /* synthetic */ y0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h hVar, int i14) {
        this.f69368a = i14;
        this.f69369b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f69368a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h hVar = this.f69369b;
        switch (i14) {
            case 0:
                l52.j jVar = (l52.j) obj;
                int i15 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.f49027c;
                jVar.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var.f48217c = m52.d.WARM_UP;
                j0Var.f48232q = m52.g.NONE;
                j0Var.f48227l = m52.a.f116648d;
                j0Var.H0 = "CARDIO";
                l52.l.c(jVar, j0Var);
                a1.b(jVar, new y0(hVar, 1));
                break;
            case 1:
                l52.j jVar2 = (l52.j) obj;
                int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.f49027c;
                jVar2.getClass();
                l52.l.d(jVar2, hVar.a());
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.i(jVar2);
                break;
            case 2:
                l52.j jVar3 = (l52.j) obj;
                int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.f49027c;
                jVar3.getClass();
                a1.b(jVar3, new y0(hVar, 3));
                break;
            default:
                l52.j jVar4 = (l52.j) obj;
                int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.f49027c;
                jVar4.getClass();
                l52.l.d(jVar4, hVar.a());
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.i(jVar4);
                break;
        }
        return Unit.INSTANCE;
    }
}
