package zy1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.k;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$removeActivePlanAndUpdatePriority$1", f = "EventDashBoardViewModel.kt", l = {501}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f207524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f207525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f207525c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f207525c, dVar);
        iVar.f207524b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f207524b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207523a;
        d dVar = this.f207525c;
        if (i14 == 0) {
            r.b(obj);
            int i15 = d.Q0;
            dVar.b5().j(g3.a.c(g3.f35298f));
            this.f207524b = b0Var;
            this.f207523a = 1;
            obj = d.Y4(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            k kVar = dVar.P;
            if (kVar != null) {
                dVar.f5(kVar);
            } else {
                List<k> list = dVar.T;
                if (list != null) {
                    dVar.d5(list);
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error while removing the training plan ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPriorityViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
