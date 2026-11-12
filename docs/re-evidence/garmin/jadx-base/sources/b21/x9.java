package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$13$1$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.e0> f15398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(lc.m0 m0Var, p3.x3<u21.e0> x3Var, t13.d<? super x9> dVar) {
        super(2, dVar);
        this.f15397a = m0Var;
        this.f15398b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x9(this.f15397a, this.f15398b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<u21.e0> x3Var = this.f15398b;
        if (x3Var.getF182175a().f167941d) {
            lc.m0 m0Var = this.f15397a;
            lc.v vVarF = m0Var.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(x3Var.getF182175a().f167938a, "caloriesGoalResult");
            }
            m0Var.n();
        }
        return Unit.INSTANCE;
    }
}
