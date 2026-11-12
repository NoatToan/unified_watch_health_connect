package b21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$12$3$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f11.f f15163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.m f15164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(f11.f fVar, f11.m mVar, lc.v vVar, p3.x3<Boolean> x3Var, t13.d<? super q1> dVar) {
        super(2, dVar);
        this.f15163a = fVar;
        this.f15164b = mVar;
        this.f15165c = vVar;
        this.f15166d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q1(this.f15163a, this.f15164b, this.f15165c, this.f15166d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        d11.i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f15166d.getF182175a(), Boolean.TRUE)) {
            f11.m mVar = this.f15164b;
            List<d11.f> list = mVar.f68014a;
            mVar.f68014a = j53.l.b();
            f11.f fVar = this.f15163a;
            fVar.getClass();
            list.getClass();
            r53.p2 p2Var = fVar.f67921f;
            do {
                value = p2Var.getValue();
                iVar = (d11.i) value;
            } while (!p2Var.b(value, d11.i.a(iVar, null, null, i53.a.j(list), null, d11.e.a(iVar.f57084f, false, false, false, false, false, false, false, 123), null, false, false, false, false, null, 4055)));
            this.f15165c.a().f(null, "recipeIngredientsUpdatedResult");
        }
        return Unit.INSTANCE;
    }
}
