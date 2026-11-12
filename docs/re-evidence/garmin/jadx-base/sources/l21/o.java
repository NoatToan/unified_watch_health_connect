package l21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.MyFoodsTabScreenKt$MyFoodsTabScreen$7$1", f = "MyFoodsTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m21.e f109153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<g01.n> f109154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m21.e eVar, zc.d<g01.n> dVar, e23.a<Unit> aVar, t13.d<? super o> dVar2) {
        super(2, dVar2);
        this.f109153a = eVar;
        this.f109154b = dVar;
        this.f109155c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f109153a, this.f109154b, this.f109155c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f109153a.f116097n.get(k21.a.MY_FOODS), Boolean.TRUE)) {
            zc.d<g01.n> dVar = this.f109154b;
            if (dVar != null) {
                dVar.e();
            }
            this.f109155c.invoke();
        }
        return Unit.INSTANCE;
    }
}
