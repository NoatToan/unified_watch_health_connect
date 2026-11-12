package is0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsViewModel$deleteTrip$1", f = "ManageTripsViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f94928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f94929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js0.g f94930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Long l14, js0.g gVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f94928b = iVar;
        this.f94929c = l14;
        this.f94930d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f94928b, this.f94929c, this.f94930d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94927a;
        Long l14 = this.f94929c;
        i iVar = this.f94928b;
        if (i14 == 0) {
            r.b(obj);
            iVar.f94935c.j(g3.a.c(g3.f35298f));
            zr0.a aVar2 = iVar.f94933a;
            long jLongValue = l14.longValue();
            this.f94927a = 1;
            obj = aVar2.c(jLongValue, this);
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
            y0<g3<o13.p<js0.g, Long>>> y0Var = iVar.f94935c;
            g3.a aVar3 = g3.f35298f;
            o13.p pVar = new o13.p(this.f94930d, l14);
            aVar3.getClass();
            y0Var.j(g3.a.d(pVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            iVar.f94935c.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
