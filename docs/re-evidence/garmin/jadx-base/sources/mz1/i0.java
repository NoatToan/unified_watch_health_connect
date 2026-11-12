package mz1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$fetchCyclingEventStrategyData$1", f = "EventDetailsViewModel.kt", l = {1063}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f121782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg0.k f121783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e0 e0Var, fg0.k kVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f121782b = e0Var;
        this.f121783c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f121782b, this.f121783c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121781a;
        e0 e0Var = this.f121782b;
        if (i14 == 0) {
            o13.r.b(obj);
            e0Var.T0.k(null, g3.a.c(g3.f35298f));
            qy1.d dVar = new qy1.d((sa1.m) e0Var.f204389f.getValue(), new qy1.i(), new qy1.b(e0Var.F4()));
            this.f121781a = 1;
            obj = dVar.a(this.f121783c, this);
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
            p2 p2Var = e0Var.T0;
            g3.a aVar2 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar2.getClass();
            p2Var.k(null, g3.a.d(t7));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            e0Var.T0.k(null, g3.a.a(g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, aVar3.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
