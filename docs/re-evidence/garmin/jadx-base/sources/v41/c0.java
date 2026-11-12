package v41;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.UpdateStatsUseCase$discardPreviousSplitEdits$1", f = "UpdateStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f175583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f175583a = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f175583a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        u41.b bVar;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z1<u41.b> z1Var = this.f175583a.f175605c;
        do {
            value = z1Var.getValue();
            bVar = value;
            aVar = bVar.f168609a;
        } while (!z1Var.b(value, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 245759), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, true, 8190)));
        return Unit.INSTANCE;
    }
}
