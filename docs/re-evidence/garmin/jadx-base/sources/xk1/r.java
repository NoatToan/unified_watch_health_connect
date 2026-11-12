package xk1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListViewModel$getDeviceRegistrationDetails$1", f = "PowerZonesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj0.j f191284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj0.f f191285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f191286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lj0.j jVar, lj0.f fVar, String[] strArr, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f191284a = jVar;
        this.f191285b = fVar;
        this.f191286c = strArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f191284a, this.f191285b, this.f191286c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f191284a.b(new lj0.i(this.f191285b, this.f191286c));
        return Unit.INSTANCE;
    }
}
