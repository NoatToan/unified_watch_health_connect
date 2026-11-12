package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.nimbusds.jose.jwk.JWKParameterNames;

/* JADX INFO: loaded from: classes8.dex */
public class r extends i {
    @Override // cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "handleHandshakeCompleted");
        super.d(dVar, false);
        boolean z15 = !zb0.u0.n(String.valueOf(dVar.getF92744h()), zb0.u0.f203747j, zb0.u0.f203762l) || dVar.getF92745i() >= 323;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("supportsGarminDeviceXMLReading [", "]", z15);
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, strG);
        if (!z15) {
            i();
            return;
        }
        aVar.getClass();
        i2.a.b(a2Var, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "handleHandshakeCompleted: requesting garmindevice.xml");
        this.f26818f.d(dVar.getF92746j());
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
        super.e(dVar);
        if (i.h(dVar.getF92746j())) {
            return;
        }
        rd2.h hVarD = rd2.h.d();
        long f172494b = dVar.getF92746j();
        hVarD.getClass();
        rd2.h.g(f172494b, 3, true);
    }

    @Override // cd0.i
    public final void k() {
        i2.a(a2.DEVICES, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "saveAutoUploadPermissionAsOn");
        if (!g(1)) {
            super.k();
        } else if (f(1)) {
            super.k();
        } else {
            j();
        }
    }

    @Override // cd0.i
    public final void m() {
        i2.a(a2.DEVICES, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "saveWeatherPermissionAsOff");
        if (g(2)) {
            if (f(2)) {
                n();
                return;
            } else {
                super.m();
                return;
            }
        }
        if (zb0.u0.n(String.valueOf(this.f26815c.getF92744h()), zb0.u0.f203813t)) {
            n();
        } else {
            super.m();
        }
    }
}
