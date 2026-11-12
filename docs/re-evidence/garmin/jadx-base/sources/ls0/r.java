package ls0;

import android.location.Location;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Locale;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightViewModel$getCurrentJetLagLocation$1", f = "TripFlightViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f114759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f114761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Location f114762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0<g3<yr0.n>> f114763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, Location location, y0<g3<yr0.n>> y0Var, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f114761c = qVar;
        this.f114762d = location;
        this.f114763e = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f114761c, this.f114762d, this.f114763e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        boolean z14;
        vo0.f fVarC;
        String utcOffset;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114760b;
        yr0.n nVar = null;
        if (i14 == 0) {
            o13.r.b(obj);
            String upperCase = c22.b0.b(null).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            boolean zEquals = upperCase.equals(Locale.CHINA.getCountry());
            q qVar = this.f114761c;
            uo0.b bVar = qVar.f114747d;
            Location location = this.f114762d;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Set setB = a1.b(uo0.h.TIME_ZONE);
            String strX4 = q.x4(qVar);
            this.f114759a = zEquals;
            this.f114760b = 1;
            rVar = this;
            Object objA = bVar.a(latitude, longitude, null, setB, strX4, rVar);
            if (objA == aVar) {
                return aVar;
            }
            z14 = zEquals;
            obj = objA;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f114759a;
            o13.r.b(obj);
            rVar = this;
        }
        v2 v2Var = (v2) obj;
        boolean z15 = v2Var instanceof v2.b;
        y0<g3<yr0.n>> y0Var = rVar.f114763e;
        if (z15) {
            if (z14) {
                to0.b bVar2 = to0.b.f165839a;
                vo0.f fVar = (vo0.f) ((v2.b) v2Var).f47386a;
                bVar2.getClass();
                fVarC = to0.b.c(fVar);
            } else {
                fVarC = (vo0.f) ((v2.b) v2Var).f47386a;
            }
            vo0.e eVar = (vo0.e) h0.d0(fVarC.b());
            if (eVar != null) {
                vo0.a address = eVar.getAddress();
                String city = address != null ? address.getCity() : null;
                vo0.a address2 = eVar.getAddress();
                String strK0 = h0.k0(p13.u.C(new String[]{city, address2 != null ? address2.getCountryName() : null}), ", ", null, null, null, 62);
                vo0.d dVar = eVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String();
                if (dVar == null || (utcOffset = dVar.getUtcOffset()) == null) {
                    utcOffset = "";
                }
                if (strK0.length() > 0 && utcOffset.length() > 0) {
                    nVar = new yr0.n(strK0, utcOffset);
                }
            }
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(nVar));
        } else {
            y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
