package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$4$1$1$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x11.g f15101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<x11.f> f15103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(x11.g gVar, lc.m0 m0Var, p3.x3<x11.f> x3Var, t13.d<? super o5> dVar) {
        super(2, dVar);
        this.f15101a = gVar;
        this.f15102b = m0Var;
        this.f15103c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o5(this.f15101a, this.f15102b, this.f15103c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        v11.a aVar2 = this.f15103c.getF182175a().f188410f;
        if (aVar2 != null) {
            r53.p2 p2Var = this.f15101a.f188419g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, x11.f.a((x11.f) value, null, null, null, false, null, false, 223)));
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            k23.d dVarB = t0Var.b(l4.m.class);
            lc.m0 m0Var = this.f15102b;
            m0Var.c(dVarB).a().f(aVar2, "imageRecognitionFoodLoggedResult");
            m0Var.o(t0Var.b(l4.m.class), false);
        }
        return Unit.INSTANCE;
    }
}
