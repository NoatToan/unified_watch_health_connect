package b21;

import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$NutritionSetupGraphContainer$4$1", f = "NutritionSetupNav.kt", l = {1187}, m = "invokeSuspend", v = 2)
public final class t9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f15263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f15265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.a0> f15266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(fe feVar, String str, u21.u0 u0Var, p3.x3<s21.a0> x3Var, t13.d<? super t9> dVar) {
        super(2, dVar);
        this.f15263b = feVar;
        this.f15264c = str;
        this.f15265d = u0Var;
        this.f15266e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t9(this.f15263b, this.f15264c, this.f15265d, this.f15266e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15262a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f15266e.getF182175a().f156061z) {
                this.f15262a = 1;
                if (l72.d3.c(this.f15263b, this.f15264c, null, this) == aVar) {
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
        r53.p2 p2Var = this.f15265d.f168164o;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -33554433, 3)));
        return Unit.INSTANCE;
    }
}
