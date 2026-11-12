package ls0;

import android.location.Location;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupViewModel$getCurrentLocation$1", f = "TripSetupViewModel.kt", l = {201}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e f114705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f114705c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f114705c, dVar);
        b0Var.f114704b = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f114704b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114703a;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar = this.f114705c;
        if (i14 == 0) {
            o13.r.b(obj);
            mv0.e eVar2 = eVar.f37106d;
            this.f114704b = b0Var;
            this.f114703a = 1;
            obj = eVar2.d("TripSetupViewModel", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
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
        Location location = (Location) obj;
        if (location != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.JET_LAG, "TripSetupViewModel", "[getCurrentLocation] location=" + location);
            int i15 = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.f37102n;
            eVar.C4(location);
        } else {
            a2 a2Var = a2.JET_LAG;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TripSetupViewModel", "[getCurrentLocation] no location");
            int i16 = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.f37102n;
            eVar.getClass();
            i2.a.b(a2Var, "TripSetupViewModel", "[updateCurrentLocationUnavailable] no location");
            eVar.f37110h = null;
            eVar.f37113k.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
