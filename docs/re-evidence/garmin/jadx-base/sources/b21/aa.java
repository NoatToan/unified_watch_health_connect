package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$16$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aa extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.i> f14519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.l f14521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(p3.x3<u21.i> x3Var, lc.m0 m0Var, u21.l lVar, t13.d<? super aa> dVar) {
        super(2, dVar);
        this.f14519a = x3Var;
        this.f14520b = m0Var;
        this.f14521c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new aa(this.f14519a, this.f14520b, this.f14521c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((aa) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.o oVar = this.f14519a.getF182175a().f168003d;
        if (oVar != null) {
            lc.m0 m0Var = this.f14520b;
            lc.v vVarF = m0Var.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(oVar, "editMicronutrientsResult");
            }
            r53.p2 p2Var = this.f14521c.f168026b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 7)));
            m0Var.n();
        }
        return Unit.INSTANCE;
    }
}
