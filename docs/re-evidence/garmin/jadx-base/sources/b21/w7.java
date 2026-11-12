package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$6$1$4$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q21.r f15359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.k f15360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f15361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<q21.p> f15362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(q21.r rVar, q21.k kVar, e23.a<Unit> aVar, p3.x3<q21.p> x3Var, t13.d<? super w7> dVar) {
        super(2, dVar);
        this.f15359a = rVar;
        this.f15360b = kVar;
        this.f15361c = aVar;
        this.f15362d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w7(this.f15359a, this.f15360b, this.f15361c, this.f15362d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<q21.p> x3Var = this.f15362d;
        if (x3Var.getF182175a().f142272d) {
            b63.v vVar = x3Var.getF182175a().f142276h.f156100a;
            b63.v vVar2 = x3Var.getF182175a().f142277i.f156100a;
            q21.r rVar = this.f15359a;
            d01.c cVar = rVar.f142289b;
            vVar.getClass();
            vVar2.getClass();
            l01.k kVar = rVar.f142293f;
            rVar.x4(kVar != null ? l01.k.a(kVar, null, null, vVar, vVar2, null, 249855) : null);
            r53.p2 p2Var = rVar.f142291d;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            l01.k kVar2 = rVar.f142293f;
            if (kVar2 != null) {
                cVar.a();
                cVar.d();
                cVar.f();
                cVar.k();
                rVar.z4(kVar2);
            }
            r53.p2 p2Var2 = this.f15360b.f142251g;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, q21.p.a((q21.p) value2, false, null, false, false, false, null, null, null, 503)));
            this.f15361c.invoke();
        }
        return Unit.INSTANCE;
    }
}
