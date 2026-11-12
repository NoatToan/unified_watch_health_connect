package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$9$1$4$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oa extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3 f15115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.o0 f15116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(p3.x3 x3Var, u21.o0 o0Var, lc.v vVar, t13.d<? super oa> dVar) {
        super(2, dVar);
        this.f15115a = x3Var;
        this.f15116b = o0Var;
        this.f15117c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new oa(this.f15115a, this.f15116b, this.f15117c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((oa) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.o oVar = (s21.o) this.f15115a.getF182175a();
        if (oVar != null) {
            u21.o0 o0Var = this.f15116b;
            o0Var.getClass();
            r53.p2 p2Var = o0Var.f168062g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, null, null, null, null, null, 0.0f, false, oVar, 6143)));
            this.f15117c.a().f(null, "micronutrientsSettingsResult");
        }
        return Unit.INSTANCE;
    }
}
