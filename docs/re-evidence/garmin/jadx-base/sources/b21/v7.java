package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$6$1$3$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<q21.p> f15325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.r f15326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q21.k f15327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(p3.x3<q21.p> x3Var, q21.r rVar, q21.k kVar, t13.d<? super v7> dVar) {
        super(2, dVar);
        this.f15325a = x3Var;
        this.f15326b = rVar;
        this.f15327c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v7(this.f15325a, this.f15326b, this.f15327c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Integer num = this.f15325a.getF182175a().f142271c;
        if (num != null) {
            this.f15326b.y4(num.intValue());
            r53.p2 p2Var = this.f15327c.f142251g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q21.p.a((q21.p) value, false, null, false, false, false, null, null, null, 507)));
        }
        return Unit.INSTANCE;
    }
}
