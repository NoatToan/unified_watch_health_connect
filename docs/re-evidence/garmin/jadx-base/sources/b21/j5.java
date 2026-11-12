package b21;

import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$1$1$5$1", f = "NutritionSearchFoodNav.kt", l = {171}, m = "invokeSuspend", v = 2)
public final class j5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f14768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.e f14770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<x11.b> f14771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(fe feVar, String str, x11.e eVar, p3.x3<x11.b> x3Var, t13.d<? super j5> dVar) {
        super(2, dVar);
        this.f14768b = feVar;
        this.f14769c = str;
        this.f14770d = eVar;
        this.f14771e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j5(this.f14768b, this.f14769c, this.f14770d, this.f14771e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14767a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f14771e.getF182175a().f188384d) {
                this.f14767a = 1;
                if (l72.d3.c(this.f14768b, this.f14769c, null, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        r53.p2 p2Var = this.f14770d.f188402f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, false, false, false, false, false, null, null, 1015)));
        return Unit.INSTANCE;
    }
}
