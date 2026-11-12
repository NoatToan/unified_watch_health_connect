package ls0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupViewModel$fetchNotEditedTrips$1", f = "TripSetupViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e f114700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f114700b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f114700b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g3<List<yr0.o>> g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114699a;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar = this.f114700b;
        if (i14 == 0) {
            o13.r.b(obj);
            eVar.f37111i.j(g3.a.c(g3.f35298f));
            zr0.a aVar2 = eVar.f37105c;
            this.f114699a = 1;
            obj = aVar2.f(this);
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
        y0<g3<List<yr0.o>>> y0Var = eVar.f37111i;
        if (v2Var instanceof v2.b) {
            g3.a aVar3 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar3.getClass();
            g3VarA = g3.a.d(t7);
        } else {
            g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
        }
        y0Var.j(g3VarA);
        return Unit.INSTANCE;
    }
}
