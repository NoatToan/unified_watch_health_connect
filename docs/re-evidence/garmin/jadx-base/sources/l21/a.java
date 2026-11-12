package l21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.AllTabScreenKt$AllTabScreen$8$1", f = "AllTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m21.e f109073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<g01.n> f109074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m21.e eVar, zc.d<g01.n> dVar, e23.a<Unit> aVar, t13.d<? super a> dVar2) {
        super(2, dVar2);
        this.f109073a = eVar;
        this.f109074b = dVar;
        this.f109075c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f109073a, this.f109074b, this.f109075c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f109073a.f116097n.get(k21.a.ALL), Boolean.TRUE)) {
            zc.d<g01.n> dVar = this.f109074b;
            if (dVar != null) {
                dVar.e();
            }
            this.f109075c.invoke();
        }
        return Unit.INSTANCE;
    }
}
