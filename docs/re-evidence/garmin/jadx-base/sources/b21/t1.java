package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$2$1$1$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l11.a f15246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(l11.a aVar, lc.m0 m0Var, lc.v vVar, p3.x3<Boolean> x3Var, t13.d<? super t1> dVar) {
        super(2, dVar);
        this.f15246a = aVar;
        this.f15247b = m0Var;
        this.f15248c = vVar;
        this.f15249d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t1(this.f15246a, this.f15247b, this.f15248c, this.f15249d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j1 j1VarA;
        b11.i.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Boolean f182175a = this.f15249d.getF182175a();
        Boolean bool = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(f182175a, bool)) {
            l11.a aVar3 = this.f15246a;
            l11.a.b bVar = (l11.a.b) aVar3.f108064m.getValue();
            if (bVar != null && (aVar = bVar.f108075a) != null) {
                if (!(aVar3.f108055d instanceof l11.a.c.C2073a)) {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.NUTRITION;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.p(a2Var, "FoodDetailsViewModel", "Food details can only be refreshed in Add mode");
                } else if (aVar.f14301g.f14257e != g01.u.GARMIN) {
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.NUTRITION;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.p(a2Var2, "FoodDetailsViewModel", "Food details can only be refreshed for custom foods");
                } else {
                    ge1.b.T(androidx.lifecycle.v1.a(aVar3), null, null, new l11.f(aVar3, aVar, null), 3);
                }
            }
            lc.v vVarF = this.f15247b.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                j1VarA.f(bool, "foodUpdatedResult");
            }
        }
        this.f15248c.a().f(null, "foodUpdatedResult");
        return Unit.INSTANCE;
    }
}
