package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$8$1$2$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q21.r f15416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.t f15417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f15418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.s> f15419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(q21.r rVar, u21.t tVar, e23.a<Unit> aVar, p3.x3<u21.s> x3Var, t13.d<? super y7> dVar) {
        super(2, dVar);
        this.f15416a = rVar;
        this.f15417b = tVar;
        this.f15418c = aVar;
        this.f15419d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y7(this.f15416a, this.f15417b, this.f15418c, this.f15419d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<u21.s> x3Var = this.f15419d;
        if (x3Var.getF182175a().f168124m) {
            b63.v vVar = x3Var.getF182175a().f168119h.f156100a;
            b63.v vVar2 = x3Var.getF182175a().f168120i.f156100a;
            s21.c cVar = x3Var.getF182175a().f168114c;
            q21.r rVar = this.f15416a;
            d01.c cVar2 = rVar.f142289b;
            vVar.getClass();
            vVar2.getClass();
            cVar.getClass();
            l01.k kVar = rVar.f142293f;
            rVar.x4(kVar != null ? l01.k.a(kVar, null, null, vVar, vVar2, cVar.b(), 184319) : null);
            r53.p2 p2Var = rVar.f142291d;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            l01.k kVar2 = rVar.f142293f;
            if (kVar2 != null) {
                cVar2.a();
                cVar2.d();
                cVar2.f();
                cVar2.k();
                rVar.z4(kVar2);
            }
            this.f15417b.A4();
            this.f15418c.invoke();
        }
        return Unit.INSTANCE;
    }
}
