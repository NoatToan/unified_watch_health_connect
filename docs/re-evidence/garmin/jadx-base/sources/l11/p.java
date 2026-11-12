package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v01.l1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.MealDetailsViewModel$logMeal$1", f = "MealDetailsViewModel.kt", l = {212}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.u f108223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f108224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, b63.u uVar, l lVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f108222c = nVar;
        this.f108223d = uVar;
        this.f108224e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f108222c, this.f108223d, this.f108224e, dVar);
        pVar.f108221b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f108221b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108220a;
        l lVar = this.f108224e;
        n nVar = this.f108222c;
        if (i14 == 0) {
            o13.r.b(obj);
            nVar.f108201l.setValue(n.b.f.f108208a);
            n1 n1Var = nVar.f108196g;
            b11.a.b bVar = lVar.f108179a;
            Long l14 = bVar.f14227c;
            i01.e eVar = i01.e.ADD;
            i01.i iVar = nVar.f108193d;
            this.f108221b = b0Var;
            this.f108220a = 1;
            obj = ge1.b.e0(n1Var.f174480c, new l1(bVar, n1Var, this.f108223d, l14, eVar, iVar, null), this);
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log meal. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            nVar.f108201l.setValue(n.b.C2079b.f108204a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            nVar.f108201l.k(null, new n.b.g(this.f108223d, lVar.f108179a));
        }
        return Unit.INSTANCE;
    }
}
