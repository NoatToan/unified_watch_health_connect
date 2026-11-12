package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$16$2$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ba extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.i> f14553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(p3.x3<u21.i> x3Var, lc.m0 m0Var, t13.d<? super ba> dVar) {
        super(2, dVar);
        this.f14553a = x3Var;
        this.f14554b = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ba(this.f14553a, this.f14554b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ba) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.o oVar = this.f14553a.getF182175a().f168004e;
        if (oVar != null) {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            k23.d dVarB = t0Var.b(l4.r0.class);
            lc.m0 m0Var = this.f14554b;
            m0Var.c(dVarB).a().f(oVar, "micronutrientsSettingsResult");
            m0Var.o(t0Var.b(l4.r0.class), false);
        }
        return Unit.INSTANCE;
    }
}
