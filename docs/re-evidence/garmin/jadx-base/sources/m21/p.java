package m21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$deleteCustomMeal$1", f = "FoodSearchViewModel.kt", l = {709}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f116158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.a.b f116159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, b11.a.b bVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f116158c = gVar;
        this.f116159d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f116158c, this.f116159d, dVar);
        pVar.f116157b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f116157b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116156a;
        b11.a.b bVar = this.f116159d;
        g gVar = this.f116158c;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar2 = gVar.f116111d;
            long j8 = bVar.f14228d;
            this.f116157b = b0Var;
            this.f116156a = 1;
            obj = gVar2.b(j8, this);
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
        if (v2Var instanceof v2.b) {
            a.b bVar2 = new a.b(bVar.f14228d);
            int i15 = g.f116107v;
            gVar.D4(bVar2);
            gVar.Q4(((e) gVar.f116124q.getValue()).f116093j);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete custom meal. exception=");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", strD);
            g.A4(gVar);
        }
        return Unit.INSTANCE;
    }
}
