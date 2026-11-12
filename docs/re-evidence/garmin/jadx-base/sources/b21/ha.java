package b21;

import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$5$1$1$1", f = "NutritionSetupNav.kt", l = {231}, m = "invokeSuspend", v = 2)
public final class ha extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f14726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u21.j0 f14728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.u> f14729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(fe feVar, String str, u21.j0 j0Var, p3.x3<s21.u> x3Var, t13.d<? super ha> dVar) {
        super(2, dVar);
        this.f14726b = feVar;
        this.f14727c = str;
        this.f14728d = j0Var;
        this.f14729e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ha(this.f14726b, this.f14727c, this.f14728d, this.f14729e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ha) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14725a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f14729e.getF182175a().f156177b) {
                this.f14725a = 1;
                if (l72.d3.c(this.f14726b, this.f14727c, null, this) == aVar) {
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
        r53.p2 p2Var = this.f14728d.f168016d;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.u.a((s21.u) value, false, false, null, null, null, null, null, 253)));
        return Unit.INSTANCE;
    }
}
