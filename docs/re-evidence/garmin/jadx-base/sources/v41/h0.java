package v41;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.UpdateStatsUseCase$updatePacingStrategy$1", f = "UpdateStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f175612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f175613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(float f14, g0 g0Var, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f175612a = f14;
        this.f175613b = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f175612a, this.f175613b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        u41.b bVar;
        boolean z14;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVarB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.PACE_PRO;
        StringBuilder sb3 = new StringBuilder("Updated pacing strategy to ");
        float f14 = this.f175612a;
        sb3.append(f14);
        String string = sb3.toString();
        aVar2.getClass();
        i2.a.a(a2Var, string);
        z1<u41.b> z1Var = this.f175613b.f175605c;
        do {
            value = z1Var.getValue();
            bVar = value;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar3 = bVar.f168609a;
            double d14 = f14;
            z1<u41.b> z1Var2 = z1Var;
            z14 = true;
            aVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar3, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar3.f39760b, null, null, null, null, 0.0d, null, new Double(d14), 0L, 0.0d, false, null, null, null, 261887), 1);
            if (!bVar.f168622n && p005kotlin.jvm.internal.s.c(bVar.f168609a.f39760b.f39772i, d14)) {
                z14 = false;
            }
            z1Var = z1Var2;
        } while (!z1Var.b(value, u41.b.a(bVar, aVarB, null, null, 0, 0, null, null, null, null, null, null, false, false, z14, 8190)));
        return Unit.INSTANCE;
    }
}
