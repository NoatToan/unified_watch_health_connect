package v41;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.UpdateStatsUseCase$updateGoalPace$1", f = "UpdateStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f175598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f175599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, long j8, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f175598a = g0Var;
        this.f175599b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f175598a, this.f175599b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        u41.b bVar;
        boolean z14;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVarB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z1<u41.b> z1Var = this.f175598a.f175605c;
        do {
            value = z1Var.getValue();
            bVar = value;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = bVar.f168609a;
            aVar2.f39760b.getClass();
            double d14 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g() ? 1000.0d : 1609.344d;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar2.f39760b;
            double d15 = bVar2.f39770g;
            long j8 = (long) (this.f175599b * (d15 / d14));
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, null, null, j8, d15 / (j8 >= 1 ? j8 : 1L), false, null, null, null, 260607);
            z14 = true;
            aVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar2, null, bVarB, 1);
            if (!bVar.f168622n && aVar2.f39760b.f39773j == j8) {
                z14 = false;
            }
        } while (!z1Var.b(value, u41.b.a(bVar, aVarB, null, null, 0, 0, null, null, null, null, null, null, false, false, z14, 8190)));
        return Unit.INSTANCE;
    }
}
