package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$12$1$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l4.f f15089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f11.f f15091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<d11.i> f15092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(l4.f fVar, lc.m0 m0Var, f11.f fVar2, p3.x3<d11.i> x3Var, t13.d<? super o1> dVar) {
        super(2, dVar);
        this.f15089a = fVar;
        this.f15090b = m0Var;
        this.f15091c = fVar2;
        this.f15092d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o1(this.f15089a, this.f15090b, this.f15091c, this.f15092d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f15092d.getF182175a().f57089k) {
            o13.p pVar = this.f15089a.f14875b != null ? new o13.p("recipeUpdatedResult", Boolean.TRUE) : new o13.p("customConsumableCreatedResultKey", b11.b.RECIPE);
            String str = (String) pVar.f128594a;
            lc.m0 m0Var = this.f15090b;
            lc.v vVarF = m0Var.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(pVar.f128595b, str);
            }
            this.f15091c.y4();
            m0Var.n();
        }
        return Unit.INSTANCE;
    }
}
