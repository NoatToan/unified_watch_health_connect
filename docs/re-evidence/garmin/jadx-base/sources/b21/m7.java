package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$2$1$1$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<String> f15045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.r f15046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j1 f15047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(p3.x3<String> x3Var, q21.r rVar, androidx.lifecycle.j1 j1Var, t13.d<? super m7> dVar) {
        super(2, dVar);
        this.f15045a = x3Var;
        this.f15046b = rVar;
        this.f15047c = j1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m7(this.f15045a, this.f15046b, this.f15047c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String f182175a = this.f15045a.getF182175a();
        if (f182175a != null) {
            n63.b.a aVar2 = n63.b.f123892d;
            aVar2.getClass();
            l01.k kVar = (l01.k) aVar2.c(l01.k.INSTANCE.serializer(), f182175a);
            q21.r rVar = this.f15046b;
            d01.c cVar = rVar.f142289b;
            kVar.getClass();
            if (!kVar.equals(rVar.f142293f)) {
                rVar.x4(kVar);
                r53.p2 p2Var = rVar.f142291d;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.TRUE));
                cVar.a();
                cVar.d();
                cVar.f();
                cVar.k();
                rVar.z4(kVar);
            }
            this.f15047c.e("editSetupUpdate");
        }
        return Unit.INSTANCE;
    }
}
