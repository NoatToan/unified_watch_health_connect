package wn2;

import o53.b0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel$executeUseCase$result$1", f = "FelicaConsoleViewModel.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q03.r<Object> f186377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q03.r<Object> rVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f186377b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f186377b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186376a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f186376a = 1;
            Object objF = a0.f(this.f186377b, this);
            return objF == aVar ? aVar : objF;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
