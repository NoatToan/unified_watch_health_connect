package b21;

import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$4$1$1$1", f = "NutritionSetupNav.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class ga extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.a0 f14699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f14700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(s21.a0 a0Var, fe feVar, String str, t13.d<? super ga> dVar) {
        super(2, dVar);
        this.f14699b = a0Var;
        this.f14700c = feVar;
        this.f14701d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ga(this.f14699b, this.f14700c, this.f14701d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ga) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14698a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f14699b.f156038c == null) {
                this.f14698a = 1;
                if (l72.d3.c(this.f14700c, this.f14701d, null, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
