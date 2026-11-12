package l21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.FavoritesTabScreenKt$FavoritesTabScreen$5$1", f = "FavoritesTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m21.e f109079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<g01.n> f109080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m21.e eVar, zc.d<g01.n> dVar, e23.a<Unit> aVar, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f109079a = eVar;
        this.f109080b = dVar;
        this.f109081c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f109079a, this.f109080b, this.f109081c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f109079a.f116097n.get(k21.a.FAVORITES), Boolean.TRUE)) {
            zc.d<g01.n> dVar = this.f109080b;
            if (dVar != null) {
                dVar.e();
            }
            this.f109081c.invoke();
        }
        return Unit.INSTANCE;
    }
}
