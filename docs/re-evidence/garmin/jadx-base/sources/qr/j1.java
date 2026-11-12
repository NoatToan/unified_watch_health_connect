package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/o;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityPowerCurve$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.o>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t tVar, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f146264b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j1 j1Var = new j1(this.f146264b, dVar);
        j1Var.f146263a = obj;
        return j1Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.o> v2Var, t13.d<? super Unit> dVar) {
        return ((j1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146263a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            T t7 = ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            if (t7 != 0) {
                t tVar = this.f146264b;
                r53.p2 p2Var = tVar.f146508c1;
                r53.p2 p2Var2 = tVar.f146508c1;
                ep.g gVar = (ep.g) p2Var.getValue();
                if (gVar == null) {
                    gVar = new ep.g(null, null, 3, null);
                }
                p2Var2.k(null, new ep.g((ps.o) t7, gVar.f64818b));
                ep.g gVar2 = (ep.g) p2Var2.getValue();
                if ((gVar2 != null ? gVar2.f64817a : null) != null) {
                    String str = tVar.A.f4358a;
                    am.z0 z0Var = am.z0.f4390a;
                    if (am.z0.b(am.x0.f4312o, str)) {
                        am.m mVar = tVar.f146507c;
                        mVar.getClass();
                        r53.c2 c2Var = new r53.c2(new am.i0(mVar, "cycling", null, null, null));
                        x53.c cVar = o53.s0.f129406a;
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new h3(tVar, null), r53.s.A(c2Var, x53.b.f189152a)), new i3(tVar, null)), new j3(null)), new k3(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                }
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching activity power curve: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
