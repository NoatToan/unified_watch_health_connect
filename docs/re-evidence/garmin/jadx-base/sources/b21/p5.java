package b21;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$4$1$2$1", f = "NutritionSearchFoodNav.kt", l = {415}, m = "invokeSuspend", v = 2)
public final class p5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.g f15140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<x11.f> f15141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(fe feVar, Context context, x11.g gVar, p3.x3<x11.f> x3Var, t13.d<? super p5> dVar) {
        super(2, dVar);
        this.f15138b = feVar;
        this.f15139c = context;
        this.f15140d = gVar;
        this.f15141e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p5(this.f15138b, this.f15139c, this.f15140d, this.f15141e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15137a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f15141e.getF182175a().f188411g) {
                String string = this.f15139c.getString(R.string.generic_error_message);
                string.getClass();
                this.f15137a = 1;
                if (l72.d3.c(this.f15138b, string, null, this) == aVar) {
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
        r53.p2 p2Var = this.f15140d.f188419g;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, x11.f.a((x11.f) value, null, null, null, false, null, false, 191)));
        return Unit.INSTANCE;
    }
}
