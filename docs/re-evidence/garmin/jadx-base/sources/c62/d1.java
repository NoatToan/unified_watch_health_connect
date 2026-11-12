package c62;

import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc62/d1;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lr52/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, r52.d> {
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(r52.d dVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        u4.d dVarA;
        dVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(560863955);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVarO = eVar.o();
            if (gVarO instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.b) {
                s62.a.f157643a.getClass();
                dVarA = v62.o.a(t62.b.f162798a);
            } else if (!(gVarO instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a)) {
                lc.u0.r();
                return;
            } else {
                s62.a.f157643a.getClass();
                dVarA = v62.o1.a(t62.b.f162798a);
            }
            dVar.a(dVarA);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, dVar, eVar, i14, 17);
        }
    }
}
