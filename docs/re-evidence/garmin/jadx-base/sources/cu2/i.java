package cu2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.WeatherService$saveToCache$1", f = "WeatherService.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu2.h f55768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fu2.h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f55768a = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f55768a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            a aVar2 = h.f55761d;
            if (aVar2 != null) {
                fu2.h hVar = this.f55768a;
                hVar.getClass();
                synchronized (aVar2.f55734f) {
                    aVar2.f55733e = hVar;
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (Throwable th3) {
            h.f55758a.getClass();
            h.f().error("saveToCache", th3);
        }
        return Unit.INSTANCE;
    }
}
