package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$15$2$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.c0 f15455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.a0> f15456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(lc.m0 m0Var, u21.c0 c0Var, p3.x3<u21.a0> x3Var, t13.d<? super z9> dVar) {
        super(2, dVar);
        this.f15454a = m0Var;
        this.f15455b = c0Var;
        this.f15456c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z9(this.f15454a, this.f15455b, this.f15456c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<u21.a0> x3Var = this.f15456c;
        if (x3Var.getF182175a().f167893c) {
            lc.m0 m0Var = this.f15454a;
            lc.v vVarF = m0Var.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(x3Var.getF182175a().f167892b, "micronutrientsSettingsResult");
            }
            r53.p2 p2Var = this.f15455b.f167916d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u21.a0.a((u21.a0) value, false, null, false, 3)));
            m0Var.n();
        }
        return Unit.INSTANCE;
    }
}
