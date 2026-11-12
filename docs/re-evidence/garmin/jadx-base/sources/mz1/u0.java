package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getItpPlanDetails$1", f = "EventDetailsViewModel.kt", l = {1375, 1382}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.a f121940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f121942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f121943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(e0 e0Var, long j8, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f121943d = e0Var;
        this.f121944e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f121943d, this.f121944e, dVar);
        u0Var.f121942c = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        o53.b0 b0Var = (o53.b0) this.f121942c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121941b;
        e0 e0Var = this.f121943d;
        if (i14 == 0) {
            o13.r.b(obj);
            ax1.i iVarE4 = e0Var.E4();
            this.f121942c = b0Var;
            this.f121941b = 1;
            iVarE4.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(iVarE4, new ax1.l(iVarE4, this.f121944e, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f121940a;
            o13.r.b(obj);
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "Error fetching itp plan details ", StringUtils.SPACE);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "EventDetailsViewModel", strH);
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (!(v2Var2 instanceof v2.b)) {
            if (!(v2Var2 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var2;
            Integer num = aVar3.f47384b;
            this.f121942c = b0Var;
            this.f121940a = aVar3;
            this.f121941b = 2;
            if (e0.X4(e0Var, num, this) != aVar) {
                v2Var = v2Var2;
                String strH2 = f3.h(((v2.a) v2Var).f47383a, "Error fetching itp plan details ", StringUtils.SPACE);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "EventDetailsViewModel", strH2);
            }
            return aVar;
        }
        T t7 = ((v2.b) v2Var2).f47386a;
        String trainingPlanName = ((ww1.i) t7).getTrainingPlanName();
        if (trainingPlanName == null) {
            trainingPlanName = "";
        }
        e0Var.getClass();
        e0Var.f204400q = trainingPlanName;
        e0Var.t5().m(t7);
        return Unit.INSTANCE;
    }
}
