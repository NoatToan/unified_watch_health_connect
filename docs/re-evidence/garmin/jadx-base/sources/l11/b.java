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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$deleteCustomFood$1", f = "FoodDetailsViewModel.kt", l = {462}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f108133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.b f108134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, a.b bVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f108133c = aVar;
        this.f108134d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f108133c, this.f108134d, dVar);
        bVar.f108132b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f108132b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108131a;
        a aVar2 = this.f108133c;
        if (i14 == 0) {
            o13.r.b(obj);
            aVar2.f108073x.setValue(a.d.i.f108105a);
            v01.u uVar = aVar2.f108060i;
            String str = this.f108134d.f108075a.f14301g.f14253a;
            this.f108132b = b0Var;
            this.f108131a = 1;
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
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to delete custom food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            aVar2.f108073x.setValue(a.d.c.f108099a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar2.f108073x.setValue(a.d.C2075a.f108096a);
        }
        return Unit.INSTANCE;
    }
}
