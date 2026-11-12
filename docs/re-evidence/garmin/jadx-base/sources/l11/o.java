package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.MealDetailsViewModel$deleteMeal$1", f = "MealDetailsViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f108219c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f108219c, dVar);
        oVar.f108218b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f108218b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108217a;
        n nVar = this.f108219c;
        if (i14 == 0) {
            o13.r.b(obj);
            nVar.f108201l.setValue(n.b.f.f108208a);
            m01.g gVar = nVar.f108197h;
            long j8 = nVar.f108190a;
            this.f108218b = b0Var;
            this.f108217a = 1;
            obj = gVar.b(j8, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete meal. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            nVar.f108201l.setValue(n.b.C2079b.f108204a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            nVar.f108201l.setValue(n.b.a.f108203a);
        }
        return Unit.INSTANCE;
    }
}
