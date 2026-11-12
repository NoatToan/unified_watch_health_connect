package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$7$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m21.g f15437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(m21.g gVar, lc.v vVar, p3.x3<Boolean> x3Var, t13.d<? super z5> dVar) {
        super(2, dVar);
        this.f15437a = gVar;
        this.f15438b = vVar;
        this.f15439c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z5(this.f15437a, this.f15438b, this.f15439c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f15439c.getF182175a(), Boolean.TRUE)) {
            this.f15437a.M4();
        }
        this.f15438b.a().f(null, "foodUpdatedResult");
        return Unit.INSTANCE;
    }
}
