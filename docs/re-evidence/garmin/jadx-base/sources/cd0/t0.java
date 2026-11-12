package cd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class t0 extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s0 f26852z = new s0(this);

    public class a implements bd0.x.c {
        public a() {
        }

        @Override // bd0.x.c
        public final void a() {
            bd0.h0 h0Var = t0.this.f26816d;
            if (h0Var != null) {
                h0Var.u();
            }
        }

        @Override // bd0.x.c
        public final void b(yl2.e eVar) {
            bd0.h0 h0Var = t0.this.f26816d;
            if (h0Var != null) {
                h0Var.p(eVar);
            }
        }

        @Override // bd0.x.c
        public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
            t0 t0Var = t0.this;
            bd0.h0 h0Var = t0Var.f26816d;
            if (h0Var != null) {
                h0Var.a0();
            }
            boolean z17 = jSONObject.optBoolean("thisDeviceAATOnOtherAccount") && !z14;
            t0Var.f26851y = z17;
            t0Var.f26850x = false;
            if (z15) {
                jSONObject.optString("currentAATName", t0Var.f26813a.getString(R.string.no_value));
                bd0.h0 h0Var2 = t0Var.f26816d;
                if (h0Var2 != null) {
                    h0Var2.M();
                    return;
                }
                return;
            }
            t0Var.f26850x = true;
            if (z17) {
                t0Var.I();
            } else {
                t0Var.K();
            }
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                t0.this.r();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    @Override // cd0.c
    public final void B(byte[] bArr) {
        i2.a(a2.DEVICES, "VivosmartHRSetupStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26765k = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        J(bArr, this.f26850x);
    }

    @Override // cd0.c
    public final void D(int i14) {
        super.D(i14);
        if (i14 != 0) {
            if (this.f26814b != null) {
                dm2.f.N().M(new b(), this.f26813a, c(), b());
                return;
            }
            return;
        }
        try {
            L(this.f26852z);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "VivosmartHRSetupStrategy", "handleSyncFinished: " + e4.getMessage());
        }
    }

    @Override // cd0.c
    public final void H(boolean z14) {
        this.f26850x = z14;
        if (!z14) {
            K();
        } else if (this.f26851y) {
            I();
        } else {
            K();
        }
    }

    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "VivosmartHRSetupStrategy", ".registerDevice()");
        super.J(bArr, z14);
    }

    @Override // cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        if (this.f26764j) {
            i2.a(a2.DEVICES, "VivosmartHRSetupStrategy", ".handleHandshakeCompleted() -- this is the first handshake complete event since device reset.");
            this.f26764j = false;
            K();
        } else {
            bd0.x xVar = new bd0.x(dVar.getF92746j(), new a());
            this.f26762h = xVar;
            xVar.a();
        }
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.i
    public final void m() {
        i2.a(a2.DEVICES, "VivosmartHRSetupStrategy", ".saveWeatherPermissionAsOff()");
        if (!g(2)) {
            n();
        } else if (f(2)) {
            n();
        } else {
            super.m();
        }
    }

    @Override // cd0.c
    public final int t() {
        return -1;
    }

    @Override // cd0.c
    public final String u() {
        return this.f26813a.getString(R.string.pairing_scanning_instructions_1_generic, this.f26814b.getProductDisplayName());
    }

    @Override // cd0.c
    public final int v() {
        return -1;
    }

    @Override // cd0.c
    public final String w() {
        return this.f26813a.getString(R.string.pairing_scanning_instructions_2_generic, this.f26814b.getProductDisplayName());
    }
}
