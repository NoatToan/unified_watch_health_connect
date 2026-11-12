package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$8$1$3$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.s> f15443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.r f15444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.t f15445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(p3.x3<u21.s> x3Var, q21.r rVar, u21.t tVar, t13.d<? super z7> dVar) {
        super(2, dVar);
        this.f15443a = x3Var;
        this.f15444b = rVar;
        this.f15445c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z7(this.f15443a, this.f15444b, this.f15445c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Integer num = this.f15443a.getF182175a().f168127p;
        if (num != null) {
            this.f15444b.y4(num.intValue());
            this.f15445c.B4();
        }
        return Unit.INSTANCE;
    }
}
