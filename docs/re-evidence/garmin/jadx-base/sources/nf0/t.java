package nf0;

import android.location.Location;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$isEcgEnabledAtLocation$1", f = "OnboardingViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f125853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Location f125854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Boolean>> f125855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, Location location, y0<g3<Boolean>> y0Var, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f125853c = oVar;
        this.f125854d = location;
        this.f125855e = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f125853c, this.f125854d, this.f125855e, dVar);
        tVar.f125852b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar;
        o53.b0 b0Var = (o53.b0) this.f125852b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125851a;
        Location location = this.f125854d;
        if (i14 == 0) {
            o13.r.b(obj);
            o oVar = this.f125853c;
            ff0.i iVar = oVar.f125784a;
            long j8 = oVar.f125821c;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            this.f125852b = b0Var;
            this.f125851a = 1;
            tVar = this;
            obj = iVar.g(j8, latitude, longitude, tVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            tVar = this;
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<Boolean>> y0Var = tVar.f125855e;
        if (z14) {
            boolean zEqualsIgnoreCase = d53.u.v((String) ((v2.b) v2Var).f47386a, "\"", "", false).equalsIgnoreCase("SUPPORTED");
            double latitude2 = location.getLatitude();
            double longitude2 = location.getLongitude();
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("[isEcgEnabledAtCurrentLocation] (lat=", latitude2, ",long=");
            sbA.append(longitude2);
            sbA.append("): ");
            sbA.append(zEqualsIgnoreCase);
            String string = sbA.toString();
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingViewModel", string);
            g3.a aVar2 = g3.f35298f;
            Boolean boolValueOf = Boolean.valueOf(zEqualsIgnoreCase);
            aVar2.getClass();
            y0Var.j(g3.a.d(boolValueOf));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
