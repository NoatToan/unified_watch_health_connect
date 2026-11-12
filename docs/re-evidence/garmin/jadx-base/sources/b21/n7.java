package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$2$1$2$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<o13.p<String, String>> f15067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.r f15068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(p3.x3<o13.p<String, String>> x3Var, q21.r rVar, lc.v vVar, t13.d<? super n7> dVar) {
        super(2, dVar);
        this.f15067a = x3Var;
        this.f15068b = rVar;
        this.f15069c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n7(this.f15067a, this.f15068b, this.f15069c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o13.p<String, String> f182175a = this.f15067a.getF182175a();
        if (f182175a != null) {
            String str = f182175a.f128594a;
            String str2 = f182175a.f128595b;
            q21.r rVar = this.f15068b;
            rVar.getClass();
            str.getClass();
            str2.getClass();
            l01.k kVar = rVar.f142293f;
            rVar.x4(kVar != null ? l01.k.a(kVar, str, str2, null, null, null, 259071) : null);
            r53.p2 p2Var = rVar.f142291d;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            this.f15069c.a().f(null, "regionAndLanguageResult");
        }
        return Unit.INSTANCE;
    }
}
