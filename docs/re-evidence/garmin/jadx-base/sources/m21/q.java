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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$deleteRecipe$1", f = "FoodSearchViewModel.kt", l = {725}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f116162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.a.c f116163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g gVar, b11.a.c cVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f116162c = gVar;
        this.f116163d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f116162c, this.f116163d, dVar);
        qVar.f116161b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f116161b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116160a;
        b11.a.c cVar = this.f116163d;
        g gVar = this.f116162c;
        if (i14 == 0) {
            o13.r.b(obj);
            v01.w wVar = gVar.f116115h;
            String str = cVar.f14238e.f14253a;
            this.f116161b = b0Var;
            this.f116160a = 1;
            obj = ge1.b.e0(wVar.f174573c, new v01.v(wVar, str, null), this);
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
            a.c cVar2 = new a.c(cVar.f14238e.f14253a);
            int i15 = g.f116107v;
            gVar.D4(cVar2);
            gVar.Q4(((e) gVar.f116124q.getValue()).f116093j);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete recipe. exception=");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", strD);
            g.A4(gVar);
        }
        return Unit.INSTANCE;
    }
}
