package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.j0;
import v01.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$fetchDetails$1", f = "FoodDetailsViewModel.kt", l = {256}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f108143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f108143c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f108143c, dVar);
        dVar2.f108142b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f108142b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108141a;
        a aVar2 = this.f108143c;
        if (i14 == 0) {
            o13.r.b(obj);
            aVar2.f108073x.setValue(a.d.i.f108105a);
            k0 k0Var = aVar2.f108057f;
            b63.u uVar = aVar2.f108052a;
            b11.m mVar = aVar2.f108053b;
            b11.k kVar = mVar.f14339b;
            boolean z14 = mVar.f14338a;
            a.c cVar = aVar2.f108055d;
            i01.i iVar = aVar2.f108056e;
            this.f108142b = b0Var;
            this.f108141a = 1;
            obj = ge1.b.e0(k0Var.f174450d, new j0(cVar, z14, uVar, kVar, k0Var, iVar, true, null), this);
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to load food details. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            aVar2.f108073x.setValue(a.d.g.f108103a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            if (aVar2.f108055d instanceof a.c.b) {
                aVar2.f108063l.setValue(((a.b) ((v2.b) v2Var).f47386a).f108075a);
            }
            p2 p2Var = aVar2.f108066o;
            T t7 = ((v2.b) v2Var).f47386a;
            a.b bVar = (a.b) t7;
            p2Var.setValue(oc.b.E(bVar.f108075a, bVar.f108078d, bVar.f108079e, aVar2.f108062k.a()));
            aVar2.f108064m.setValue(t7);
            aVar2.f108073x.setValue(a.d.h.f108104a);
        }
        return Unit.INSTANCE;
    }
}
