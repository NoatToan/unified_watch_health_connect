package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$9$1$2$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d8 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.o> f14613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.r f14614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.p f14615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(p3.x3<u21.o> x3Var, q21.r rVar, u21.p pVar, t13.d<? super d8> dVar) {
        super(2, dVar);
        this.f14613a = x3Var;
        this.f14614b = rVar;
        this.f14615c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d8(this.f14613a, this.f14614b, this.f14615c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d8) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Integer num = this.f14613a.getF182175a().f168053g;
        if (num != null) {
            this.f14614b.y4(num.intValue());
            r53.p2 p2Var = this.f14615c.f168092k;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u21.o.a((u21.o) value, null, false, false, false, false, null, 63)));
        }
        return Unit.INSTANCE;
    }
}
