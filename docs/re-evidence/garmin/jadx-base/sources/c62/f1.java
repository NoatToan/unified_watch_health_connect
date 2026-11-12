package c62;

import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc62/f1;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "Lw52/v0;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "repeatNode", "<init>", "(Ll52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t>, w52.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f24736a;

    public f1(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        aVar.getClass();
        this.f24736a = aVar;
    }

    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-1401101799);
        if ((i14 & 384) == 0) {
            i15 = ((i14 & 512) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 256 : 128) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 129) != 128)) {
            p3.x1 x1Var = p3.n.f135158a;
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar = this.f24736a;
            w52.u.a(aVar.getDepth(), 384, 1, null, o0VarE, z3.f.c(1977202693, new c42.c0(5, this, (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()), o0VarE));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, tVar, eVar, i14, 19);
        }
    }
}
