package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$10$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<o13.p<String, Boolean>> f15196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m21.g f15197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(lc.v vVar, p3.x3<o13.p<String, Boolean>> x3Var, m21.g gVar, t13.d<? super r5> dVar) {
        super(2, dVar);
        this.f15195a = vVar;
        this.f15196b = x3Var;
        this.f15197c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r5(this.f15195a, this.f15196b, this.f15197c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<o13.p<String, Boolean>> x3Var = this.f15196b;
        o13.p<String, Boolean> f182175a = x3Var.getF182175a();
        String str = f182175a != null ? f182175a.f128594a : null;
        o13.p<String, Boolean> f182175a2 = x3Var.getF182175a();
        Boolean bool = f182175a2 != null ? f182175a2.f128595b : null;
        if (str != null && bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            m21.g gVar = this.f15197c;
            gVar.getClass();
            k21.a aVar2 = ((m21.e) gVar.f116124q.getValue()).f116093j;
            k21.a aVar3 = k21.a.FAVORITES;
            if (aVar2 == aVar3 && !zBooleanValue) {
                gVar.Q4(aVar2);
                gVar.D4(new m21.a.C2204a(str));
            } else if (aVar2 == aVar3 && zBooleanValue) {
                gVar.M4();
            } else {
                gVar.D4(new m21.a.d(str, zBooleanValue));
            }
        }
        this.f15195a.a().f(null, "foodFavoriteResult");
        return Unit.INSTANCE;
    }
}
