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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$deleteCustomFood$1", f = "FoodSearchViewModel.kt", l = {693}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f116154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.a.C0202a f116155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, b11.a.C0202a c0202a, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f116154c = gVar;
        this.f116155d = c0202a;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f116154c, this.f116155d, dVar);
        oVar.f116153b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f116153b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116152a;
        b11.a.C0202a c0202a = this.f116155d;
        g gVar = this.f116154c;
        if (i14 == 0) {
            o13.r.b(obj);
            v01.u uVar = gVar.f116114g;
            String str = c0202a.f14222e.f14253a;
            this.f116153b = b0Var;
            this.f116152a = 1;
            obj = ge1.b.e0(uVar.f174546c, new v01.t(uVar, str, null), this);
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
            a.C2204a c2204a = new a.C2204a(c0202a.f14222e.f14253a);
            int i15 = g.f116107v;
            gVar.D4(c2204a);
            gVar.Q4(((e) gVar.f116124q.getValue()).f116093j);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete custom food. exception=");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", strD);
            g.A4(gVar);
        }
        return Unit.INSTANCE;
    }
}
