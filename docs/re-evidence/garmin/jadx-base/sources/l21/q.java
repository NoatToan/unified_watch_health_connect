package l21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.MyMealsTabScreenKt$MyMealsTabScreen$7$1", f = "MyMealsTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m21.e f109156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<g01.n> f109157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m21.e eVar, zc.d<g01.n> dVar, e23.a<Unit> aVar, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f109156a = eVar;
        this.f109157b = dVar;
        this.f109158c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f109156a, this.f109157b, this.f109158c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f109156a.f116097n.get(k21.a.MY_MEALS), Boolean.TRUE)) {
            zc.d<g01.n> dVar = this.f109157b;
            if (dVar != null) {
                dVar.e();
            }
            this.f109158c.invoke();
        }
        return Unit.INSTANCE;
    }
}
