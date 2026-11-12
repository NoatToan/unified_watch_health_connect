package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$5$1$2$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q21.r f15232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q21.b f15234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<q21.a> f15235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(q21.r rVar, lc.m0 m0Var, q21.b bVar, p3.x3<q21.a> x3Var, t13.d<? super s7> dVar) {
        super(2, dVar);
        this.f15232a = rVar;
        this.f15233b = m0Var;
        this.f15234c = bVar;
        this.f15235d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s7(this.f15232a, this.f15233b, this.f15234c, this.f15235d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<q21.a> x3Var = this.f15235d;
        if (x3Var.getF182175a().f142205d) {
            this.f15232a.f142294g = true;
            lc.m0 m0Var = this.f15233b;
            lc.v vVarF = m0Var.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(x3Var.getF182175a().f142203b, "mealGoalsResult");
            }
            r53.p2 p2Var = this.f15234c.f142215f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q21.a.a((q21.a) value, null, false, false, false, false, 55)));
            m0Var.n();
        }
        return Unit.INSTANCE;
    }
}
