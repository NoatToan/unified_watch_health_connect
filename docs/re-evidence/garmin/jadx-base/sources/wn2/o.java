package wn2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel$permanentDelete$1", f = "FelicaConsoleViewModel.kt", l = {507}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f186388b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f186388b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186387a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar2 = this.f186388b;
            g gVar = new g(aVar2, 2);
            int i15 = w03.b.f181178a;
            z03.d dVar = new z03.d(gVar);
            h hVar = new h(aVar2, 2);
            this.f186387a = 1;
            if (aVar2.x4(dVar, "PermanentDeleteCard", hVar, this) == aVar) {
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
