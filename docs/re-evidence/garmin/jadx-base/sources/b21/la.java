package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$9$1$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class la extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.o0 f15025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Integer> f15027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(u21.o0 o0Var, lc.v vVar, p3.x3<Integer> x3Var, t13.d<? super la> dVar) {
        super(2, dVar);
        this.f15025a = o0Var;
        this.f15026b = vVar;
        this.f15027c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new la(this.f15025a, this.f15026b, this.f15027c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((la) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<Integer> x3Var = this.f15027c;
        if (x3Var.getF182175a() != null) {
            Integer f182175a = x3Var.getF182175a();
            u21.o0 o0Var = this.f15025a;
            o0Var.f168061f = true;
            float f14 = ((s21.x) o0Var.f168062g.getValue()).f156200i;
            o13.p<l01.a, Integer> pVarD4 = o0Var.D4();
            l01.a aVar2 = pVarD4.f128594a;
            Integer num = pVarD4.f128595b;
            l01.i iVarE4 = o0Var.E4();
            u21.h1 h1Var = o0Var.f168056a;
            int i14 = h1Var.f167990c;
            int i15 = h1Var.f167991d;
            v21.f.f175333a.getClass();
            o0Var.A4(i14, i15, v21.f.p(f14), h1Var.f167989b, fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString(), iVarE4, aVar2, num, f182175a);
            this.f15026b.a().f(null, "caloriesGoalResult");
        }
        return Unit.INSTANCE;
    }
}
