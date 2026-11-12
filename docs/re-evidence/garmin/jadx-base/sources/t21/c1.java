package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.screen.NutritionSetupScreenKt$NutritionSetupScreen$4$1", f = "NutritionSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f161850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f161851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f161850a = aVar;
        this.f161851b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c1(this.f161850a, this.f161851b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f161851b.getF182175a().booleanValue()) {
            this.f161850a.invoke();
        }
        return Unit.INSTANCE;
    }
}
