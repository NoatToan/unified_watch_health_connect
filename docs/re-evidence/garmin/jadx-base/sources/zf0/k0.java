package zf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$deleteEvent$1", f = "RaceAndEventBaseViewModel.kt", l = {396}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f204423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f204424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, long j8, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f204423c = j0Var;
        this.f204424d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f204423c, this.f204424d, dVar);
        k0Var.f204422b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f204422b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204421a;
        j0 j0Var = this.f204423c;
        if (i14 == 0) {
            o13.r.b(obj);
            d dVar = j0Var.f204384a;
            this.f204422b = b0Var;
            this.f204421a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new i(dVar, this.f204424d, null), this);
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
            androidx.lifecycle.y0<g3<gg0.d>> y0VarN4 = j0Var.N4();
            g3.a aVar2 = g3.f35298f;
            gg0.d dVar2 = gg0.d.DELETED;
            aVar2.getClass();
            y0VarN4.j(g3.a.d(dVar2));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strN = fb1.c.n("Error occurred while attempt to delete the event ", ((v2.a) v2Var).f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", strN);
            j0Var.N4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
