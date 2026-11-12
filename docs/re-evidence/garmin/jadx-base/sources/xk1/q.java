package xk1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListViewModel$getAvailablePowerZones$1", f = "PowerZonesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f191283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f191283a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f191283a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f191283a;
        uk1.j jVar = pVar.f191278c;
        p.b bVar = pVar.f191279d;
        jVar.getClass();
        bVar.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.b(jVar), bVar);
        return Unit.INSTANCE;
    }
}
