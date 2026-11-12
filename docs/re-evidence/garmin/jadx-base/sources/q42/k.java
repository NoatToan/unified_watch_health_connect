package q42;

import android.util.Log;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightGoalViewModel$fetchWeightGoal$1", f = "WeightGoalViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f142656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f142656b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f142656b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142655a;
        i iVar = this.f142656b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = iVar.f142648b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, true, 2)));
            al0.a aVar2 = iVar.f142647a;
            b63.o.Companion companion = b63.o.INSTANCE;
            fz0.c cVarA = fz0.d.a(g22.l.d(companion));
            fz0.c cVarA2 = fz0.d.a(g22.l.d(companion));
            this.f142655a = 1;
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
            p2 p2Var2 = iVar.f142650d;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, (zk0.e) h0.d0(((zk0.g) ((v2.b) v2Var).f47386a).b())));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            o72.t.k(Log.e("WeightGoalViewModel", "Error saving weight goal to GC [" + ((v2.a) v2Var).f47385c + "]."));
        }
        p2 p2Var3 = iVar.f142648b;
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, f.a((f) value2, false, 2)));
        return Unit.INSTANCE;
    }
}
