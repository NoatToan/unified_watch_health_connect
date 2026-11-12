package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$4$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<v11.a> f15350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m21.g f15351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i21.d f15352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.u f15353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(lc.v vVar, p3.x3<v11.a> x3Var, m21.g gVar, i21.d dVar, b63.u uVar, t13.d<? super w5> dVar2) {
        super(2, dVar2);
        this.f15349a = vVar;
        this.f15350b = x3Var;
        this.f15351c = gVar;
        this.f15352d = dVar;
        this.f15353e = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w5(this.f15349a, this.f15350b, this.f15351c, this.f15352d, this.f15353e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        v11.a f182175a = this.f15350b.getF182175a();
        if (f182175a != null) {
            b11.b bVar = f182175a.f174667b;
            this.f15351c.J4(f182175a.f174666a, bVar);
            this.f15352d.Q4(p13.w.c(this.f15353e.b()));
        }
        this.f15349a.a().f(null, "imageRecognitionFoodLoggedResult");
        return Unit.INSTANCE;
    }
}
