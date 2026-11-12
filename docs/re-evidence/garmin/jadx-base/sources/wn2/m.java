package wn2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel$getCardUsageHistory$1", f = "FelicaConsoleViewModel.kt", l = {552}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f186381b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f186381b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186380a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar2 = this.f186381b;
            g gVar = new g(aVar2, 1);
            int i15 = w03.b.f181178a;
            e13.b bVar = new e13.b(gVar);
            this.f186380a = 1;
            if (aVar2.y4(bVar, "GetCardUsageHistory", new wl.a(7), this) == aVar) {
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
