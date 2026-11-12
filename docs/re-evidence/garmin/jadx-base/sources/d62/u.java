package d62;

import c62.l2;
import g02.r0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld62/u;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, c62.t> {
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(c62.t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(2065146439);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            l2 f48582f = eVar.getF48582f();
            if (f48582f.f24802a) {
                o0VarE.C(1666166635);
                r0.c(f48582f.f24803b, f48582f.f24804c, false, null, null, null, o0VarE, 384, 120);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1666335771);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, tVar, eVar, i14, 13);
        }
    }
}
