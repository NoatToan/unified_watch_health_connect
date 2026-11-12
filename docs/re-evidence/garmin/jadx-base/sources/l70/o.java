package l70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lj70/k$d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivityTrendDismissedPrompts$2$1", f = "DashboardRepositoryImpl.kt", l = {523}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super j70.k.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f110751b;

    public o(t13.d<? super o> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(dVar);
        oVar.f110751b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super j70.k.d> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f110751b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110750a;
        if (i14 == 0) {
            o13.r.b(obj);
            j70.k.d dVar = new j70.k.d(null, 1, null);
            this.f110751b = null;
            this.f110750a = 1;
            if (jVar.emit(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
