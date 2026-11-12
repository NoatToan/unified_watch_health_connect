package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$9$1$2$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ma extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.o0 f15051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(u21.o0 o0Var, p3.x3<Boolean> x3Var, t13.d<? super ma> dVar) {
        super(2, dVar);
        this.f15051a = o0Var;
        this.f15052b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ma(this.f15051a, this.f15052b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ma) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f15052b.getF182175a() != null) {
            r53.p2 p2Var = this.f15051a.f168062g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, false, null, 8190)));
        }
        return Unit.INSTANCE;
    }
}
