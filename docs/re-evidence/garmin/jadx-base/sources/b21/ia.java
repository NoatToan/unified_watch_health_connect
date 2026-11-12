package b21;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$5$1$2$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ia extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.j0 f14754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f14755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.u> f14756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(lc.m0 m0Var, u21.j0 j0Var, e23.a<Unit> aVar, p3.x3<s21.u> x3Var, t13.d<? super ia> dVar) {
        super(2, dVar);
        this.f14753a = m0Var;
        this.f14754b = j0Var;
        this.f14755c = aVar;
        this.f14756d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ia(this.f14753a, this.f14754b, this.f14755c, this.f14756d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ia) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j1 j1VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<s21.u> x3Var = this.f14756d;
        if (x3Var.getF182175a().f156178c) {
            lc.v vVarF = this.f14753a.f();
            if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                l01.d dVar = x3Var.getF182175a().f156182g;
                String str = dVar != null ? dVar.f107844a : null;
                u21.j0 j0Var = this.f14754b;
                j0Var.getClass();
                v21.f fVar = v21.f.f175333a;
                r53.p2 p2Var = j0Var.f168016d;
                Map<String, String> map = ((s21.u) p2Var.getValue()).f156181f;
                String str2 = ((s21.u) p2Var.getValue()).f156179d;
                fVar.getClass();
                j1VarA.f(new o13.p(str, v21.f.k(str2, map)), "regionAndLanguageResult");
            }
            this.f14755c.invoke();
        }
        return Unit.INSTANCE;
    }
}
