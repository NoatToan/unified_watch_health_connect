package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$11$1$1$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l11.n f15034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l11.n nVar, lc.m0 m0Var, lc.v vVar, p3.x3<Boolean> x3Var, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f15034a = nVar;
        this.f15035b = m0Var;
        this.f15036c = vVar;
        this.f15037d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f15034a, this.f15035b, this.f15036c, this.f15037d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Boolean f182175a = this.f15037d.getF182175a();
        Boolean bool = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(f182175a, bool)) {
            this.f15034a.x4();
            lc.v vVarF = this.f15035b.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(bool, "foodUpdatedResult");
            }
        }
        this.f15036c.a().f(null, "foodUpdatedResult");
        return Unit.INSTANCE;
    }
}
