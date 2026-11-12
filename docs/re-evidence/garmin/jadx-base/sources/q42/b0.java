package q42;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$fetchWeightGoal$1", f = "WeightReportsViewModel.kt", l = {178}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f142602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f142602b = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f142602b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142601a;
        y yVar = this.f142602b;
        if (i14 == 0) {
            o13.r.b(obj);
            al0.a aVar2 = yVar.f142746b;
            b63.o.Companion companion = b63.o.INSTANCE;
            fz0.c cVarA = fz0.d.a(g22.l.d(companion));
            fz0.c cVarA2 = fz0.d.a(g22.l.d(companion));
            this.f142601a = 1;
            aVar2.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new al0.e(aVar2, cVarA, cVarA2, null), this);
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
            p2 p2Var = yVar.f142755k;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, f0.a((f0) value2, null, null, (zk0.g) ((v2.b) v2Var).f47386a, null, null, 59)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var2 = yVar.f142755k;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, f0.a((f0) value, null, null, null, null, null, 59)));
        }
        return Unit.INSTANCE;
    }
}
