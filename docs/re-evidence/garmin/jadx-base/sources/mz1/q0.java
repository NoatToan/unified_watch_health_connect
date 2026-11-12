package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getEventAssociatedActivity$1", f = "EventDetailsViewModel.kt", l = {827}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f121904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e0 e0Var, long j8, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f121903c = e0Var;
        this.f121904d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q0 q0Var = new q0(this.f121903c, this.f121904d, dVar);
        q0Var.f121902b = obj;
        return q0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121902b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121901a;
        long j8 = this.f121904d;
        e0 e0Var = this.f121903c;
        if (i14 == 0) {
            o13.r.b(obj);
            hg0.b bVarB4 = e0Var.B4();
            this.f121902b = b0Var;
            this.f121901a = 1;
            bVarB4.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(bVarB4, new hg0.e(bVarB4, j8, null), this);
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
            int i15 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.B1.getValue()).j(((v2.b) v2Var).f47386a);
        } else {
            String strE = org.apache.commons.lang3.e.e(j8, "Error getting activitySummaryDTO for activityId ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", strE);
            int i16 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.B1.getValue()).j(null);
        }
        return Unit.INSTANCE;
    }
}
