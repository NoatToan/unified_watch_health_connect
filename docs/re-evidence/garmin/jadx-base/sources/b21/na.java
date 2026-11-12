package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$9$1$3$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class na extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.h> f15080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.o0 f15081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(p3.x3<s21.h> x3Var, u21.o0 o0Var, lc.v vVar, t13.d<? super na> dVar) {
        super(2, dVar);
        this.f15080a = x3Var;
        this.f15081b = o0Var;
        this.f15082c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new na(this.f15080a, this.f15081b, this.f15082c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((na) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.h f182175a = this.f15080a.getF182175a();
        if (f182175a != null) {
            u21.o0 o0Var = this.f15081b;
            u21.h1 h1Var = o0Var.f168056a;
            r53.p2 p2Var = o0Var.f168062g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.x.a((s21.x) value, null, new s21.g(new s21.f(f182175a.f156119a, f182175a.f156120b), new s21.f(f182175a.f156121c, f182175a.f156122d), new s21.f(f182175a.f156123e, f182175a.f156124f)), null, null, null, null, null, 0.0f, false, null, 8187)));
            float f14 = ((s21.x) p2Var.getValue()).f156200i;
            o13.p<l01.a, Integer> pVarD4 = o0Var.D4();
            l01.a aVar2 = pVarD4.f128594a;
            Integer num = pVarD4.f128595b;
            Integer numG4 = o0Var.G4();
            l01.i iVarE4 = o0Var.E4();
            int i14 = h1Var.f167990c;
            int i15 = h1Var.f167991d;
            v21.f.f175333a.getClass();
            o0Var.A4(i14, i15, v21.f.p(f14), h1Var.f167989b, fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString(), iVarE4, aVar2, num, numG4);
            this.f15082c.a().f(null, "macrosGoalsResult");
        }
        return Unit.INSTANCE;
    }
}
