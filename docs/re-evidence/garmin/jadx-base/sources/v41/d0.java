package v41;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.UpdateStatsUseCase$updateDistance$1", f = "UpdateStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t41.f f175587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f175588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n02.g f175589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f175590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(t41.f fVar, g0 g0Var, n02.g gVar, double d14, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f175587a = fVar;
        this.f175588b = g0Var;
        this.f175589c = gVar;
        this.f175590d = d14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f175587a, this.f175588b, this.f175589c, this.f175590d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        u41.b bVar;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVarB;
        boolean z14;
        u41.b value2;
        u41.b bVar2;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVarB2;
        boolean z15;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t41.f fVar = t41.f.OTHER;
        g0 g0Var = this.f175588b;
        t41.f fVar2 = this.f175587a;
        if (fVar2 != fVar) {
            z1<u41.b> z1Var = g0Var.f175605c;
            do {
                value2 = z1Var.getValue();
                bVar2 = value2;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = bVar2.f168609a;
                aVarB2 = com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar2, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar2.f39760b, null, null, null, g0Var.f175603a ? t41.a.KILOMETER : t41.a.MILE, fVar2.f162291b, null, null, 0L, 0.0d, false, null, null, null, 262047), 1);
                if (bVar2.f168622n) {
                    z15 = true;
                } else {
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar3 = bVar2.f168609a.f39760b;
                    bVar3.getClass();
                    t41.f.a aVar3 = t41.f.f162282c;
                    double d14 = bVar3.f39770g;
                    aVar3.getClass();
                    if (t41.f.a.b(d14) != fVar2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
            } while (!z1Var.b(value2, u41.b.a(bVar2, aVarB2, null, null, 0, 0, null, null, null, null, null, null, false, false, z15, 8190)));
            t41.f.a aVar4 = t41.f.f162282c;
            double d15 = fVar2.f162291b;
            aVar4.getClass();
            g0Var.a(t41.f.a.a(d15, false));
        } else {
            double d16 = this.f175590d;
            n02.g gVar = this.f175589c;
            double dB = gVar.b(d16);
            z1<u41.b> z1Var2 = g0Var.f175605c;
            do {
                value = z1Var2.getValue();
                bVar = value;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar5 = bVar.f168609a;
                aVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar5, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar5.f39760b, null, null, null, t41.b.a(gVar), dB, null, null, 0L, 0.0d, false, null, null, null, 262047), 1);
                if (bVar.f168622n) {
                    z14 = true;
                } else {
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar4 = bVar.f168609a.f39760b;
                    if (bVar4.f39770g == dB && bVar4.f39769f == t41.b.a(gVar)) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                }
            } while (!z1Var2.b(value, u41.b.a(bVar, aVarB, null, null, 0, 0, null, null, null, null, null, null, false, false, z14, 8190)));
            t41.f.f162282c.getClass();
            g0Var.a(t41.f.a.a(dB, true));
        }
        return Unit.INSTANCE;
    }
}
