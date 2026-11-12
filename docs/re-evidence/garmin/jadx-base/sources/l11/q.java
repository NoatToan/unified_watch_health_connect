package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.MealDetailsViewModel$setFavorite$1", f = "MealDetailsViewModel.kt", l = {242}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f108228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b11.a.b f108229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, boolean z14, b11.a.b bVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f108227c = nVar;
        this.f108228d = z14;
        this.f108229e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f108227c, this.f108228d, this.f108229e, dVar);
        qVar.f108226b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        m mVar;
        b0 b0Var = (b0) this.f108226b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108225a;
        boolean z14 = this.f108228d;
        n nVar = this.f108227c;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = nVar.f108197h;
            long j8 = nVar.f108190a;
            this.f108226b = b0Var;
            this.f108225a = 1;
            obj = gVar.K0(j8, z14, this);
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to mark meal as favorite. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            nVar.f108201l.setValue(n.b.c.f108205a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            b11.a.b bVarD = b11.a.b.d(this.f108229e, null, this.f108228d, null, null, 509);
            p2 p2Var = nVar.f108199j;
            do {
                value = p2Var.getValue();
                mVar = (m) value;
            } while (!p2Var.b(value, mVar != null ? m.a(mVar, l.a(mVar.f108184a, bVarD, null, 30)) : null));
            nVar.f108201l.k(null, new n.b.h(nVar.f108190a, z14));
        }
        return Unit.INSTANCE;
    }
}
