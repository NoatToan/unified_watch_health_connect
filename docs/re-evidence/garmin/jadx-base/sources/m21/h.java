package m21;

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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$addFood$1", f = "FoodSearchViewModel.kt", l = {592}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f116137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.a f116138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f116139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, b11.a aVar, e23.a<Unit> aVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f116137c = gVar;
        this.f116138d = aVar;
        this.f116139e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f116137c, this.f116138d, this.f116139e, dVar);
        hVar.f116136b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f116136b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116135a;
        g gVar = this.f116137c;
        if (i14 == 0) {
            o13.r.b(obj);
            n1 n1Var = gVar.f116113f;
            b63.u uVar = gVar.f116109b;
            b11.l lVar = ((e) gVar.f116126t.f150540a.getValue()).f116101r;
            Long l14 = lVar != null ? new Long(lVar.f14331a) : null;
            this.f116136b = b0Var;
            this.f116135a = 1;
            obj = ge1.b.e0(n1Var.f174480c, new l1(this.f116138d, n1Var, uVar, l14, i01.e.ADD, i01.i.REGULAR_LOG, null), this);
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
            b11.b bVarB = this.f116138d.b();
            b11.l lVar2 = ((e) gVar.f116126t.f150540a.getValue()).f116101r;
            gVar.J4(lVar2 != null ? new Long(lVar2.f14331a) : null, bVarB);
            this.f116139e.invoke();
            gVar.f116125r = true;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log food. exception=");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", strD);
            g.A4(gVar);
        }
        return Unit.INSTANCE;
    }
}
