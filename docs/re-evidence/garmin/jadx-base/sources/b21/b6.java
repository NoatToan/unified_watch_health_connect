package b21;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$9$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b6 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f14537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.b> f14538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m21.g f14539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b6(lc.v vVar, p3.x3<? extends b11.b> x3Var, m21.g gVar, t13.d<? super b6> dVar) {
        super(2, dVar);
        this.f14537a = vVar;
        this.f14538b = x3Var;
        this.f14539c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b6(this.f14537a, this.f14538b, this.f14539c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b6) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c22.c3 c3VarB;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.b f182175a = this.f14538b.getF182175a();
        if (f182175a != null) {
            m21.g gVar = this.f14539c;
            gVar.M4();
            int i14 = m21.g.b.f116129c[f182175a.ordinal()];
            if (i14 == 1) {
                c3VarB = c22.i.b(R.string.saved_to_my_foods);
            } else if (i14 == 2) {
                c22.x0.f23314a.getClass();
                c3VarB = c22.g2.b(c22.x0.Ge);
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                c3VarB = c22.i.b(R.string.saved_to_my_meals);
            }
            m21.d dVar = new m21.d(new b11.u.a(c3VarB, null, 2, null), null, 2, null);
            r53.p2 p2Var = gVar.f116124q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, m21.e.a((m21.e) value, null, false, false, null, dVar, false, null, null, false, false, null, null, false, null, null, null, 1048539)));
        }
        this.f14537a.a().f(null, "customConsumableCreatedResultKey");
        return Unit.INSTANCE;
    }
}
