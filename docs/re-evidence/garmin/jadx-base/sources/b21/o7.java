package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$2$1$3$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q21.q f15105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q21.r f15107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(q21.q qVar, lc.m0 m0Var, q21.r rVar, t13.d<? super o7> dVar) {
        super(2, dVar);
        this.f15105a = qVar;
        this.f15106b = m0Var;
        this.f15107c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o7(this.f15105a, this.f15106b, this.f15107c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l4 l4Var = this.f15105a.f142286i;
        if (l4Var != null) {
            lc.y.l(this.f15106b, l4Var);
            r53.p2 p2Var = this.f15107c.f142295h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q21.q.a((q21.q) value, false, false, null, null, false, null, false, false, null, 255)));
        }
        return Unit.INSTANCE;
    }
}
