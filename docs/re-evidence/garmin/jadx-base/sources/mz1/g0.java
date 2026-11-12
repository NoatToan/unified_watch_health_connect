package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$earnSharingIsCaringBadge$1", f = "EventDetailsViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f121763c = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f121763c, dVar);
        g0Var.f121762b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121762b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121761a;
        if (i14 == 0) {
            o13.r.b(obj);
            e0 e0Var = this.f121763c;
            zf0.d dVar = e0Var.f204384a;
            fg0.b bVar = new fg0.b(new Integer(e0Var.P));
            this.f121762b = b0Var;
            this.f121761a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.k(dVar, bVar, null), this);
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
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.k(a2Var, "EventDetailsViewModel", "event share badge successful");
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "event share badge not successful: ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "EventDetailsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
