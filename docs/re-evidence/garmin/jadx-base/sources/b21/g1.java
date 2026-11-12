package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$1$1$2$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i21.d f14682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<i21.c> f14684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i21.d dVar, lc.m0 m0Var, p3.x3<i21.c> x3Var, t13.d<? super g1> dVar2) {
        super(2, dVar2);
        this.f14682a = dVar;
        this.f14683b = m0Var;
        this.f14684c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g1(this.f14682a, this.f14683b, this.f14684c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f14684c.getF182175a().f87264s) {
            this.f14682a.E4();
            lc.y.l(this.f14683b, l4.n0.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
