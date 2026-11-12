package f62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69370a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f69371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.m f69372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f69373d;

    public /* synthetic */ z(com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m mVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar) {
        this.f69371b = pVar;
        this.f69372c = mVar;
        this.f69373d = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f69370a) {
            case 0:
                boolean zE = k52.g.e(this.f69373d.f49245a);
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar = this.f69372c.f49082a;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar = this.f69371b;
                if (zE) {
                    pVar.c0(aVar, false);
                } else {
                    pVar.s0(aVar);
                }
                break;
            default:
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f69372c.f49082a;
                this.f69371b.n1(this.f69373d.f49245a, aVar2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m mVar) {
        this.f69373d = qVar;
        this.f69371b = pVar;
        this.f69372c = mVar;
    }
}
