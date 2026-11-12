package cd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class u0 extends cd0.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f26857z = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                u0 u0Var = u0.this;
                u0Var.f26817e.g();
                u0Var.G(null);
                bd0.h0 h0Var = u0Var.f26816d;
                if (h0Var != null) {
                    h0Var.f();
                }
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class b implements bd0.x.c {
        public b() {
        }

        @Override // bd0.x.c
        public final void a() {
            bd0.h0 h0Var = u0.this.f26816d;
            if (h0Var != null) {
                h0Var.u();
            }
        }

        @Override // bd0.x.c
        public final void b(yl2.e eVar) {
            bd0.h0 h0Var = u0.this.f26816d;
            if (h0Var != null) {
                h0Var.p(eVar);
            }
        }

        @Override // bd0.x.c
        public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
            u0 u0Var = u0.this;
            bd0.h0 h0Var = u0Var.f26816d;
            if (h0Var != null) {
                h0Var.a0();
            }
            boolean z17 = jSONObject.optBoolean("thisDeviceAATOnOtherAccount") && !z14;
            u0Var.f26856y = z17;
            u0Var.f26855x = false;
            if (!z15) {
                u0Var.f26855x = true;
                if (z17) {
                    u0Var.I();
                    return;
                } else {
                    u0Var.K();
                    return;
                }
            }
            if (jSONObject.optString("deviceId").equals(jSONObject.optString("currentAATDeviceId"))) {
                if (u0Var.f26856y) {
                    u0Var.I();
                    return;
                } else {
                    u0Var.K();
                    return;
                }
            }
            jSONObject.optString("currentAATName", u0Var.f26813a.getString(R.string.no_value));
            bd0.h0 h0Var2 = u0Var.f26816d;
            if (h0Var2 != null) {
                h0Var2.M();
            }
        }
    }

    public class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                u0.this.r();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    @Override // cd0.c
    public final void B(byte[] bArr) {
        i2.a(a2.DEVICES, "VivosmartSetupStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26765k = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        J(bArr, this.f26855x);
    }

    @Override // cd0.c
    public final void D(int i14) {
        super.D(i14);
        if (i14 != 0) {
            if (this.f26814b != null) {
                dm2.f.N().M(new c(), this.f26813a, c(), b());
                return;
            }
            return;
        }
        try {
            L(this.f26857z);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "VivosmartSetupStrategy", "handleSyncFinished: " + e4.getMessage());
        }
    }

    @Override // cd0.c
    public final void H(boolean z14) {
        this.f26855x = z14;
        if (!z14) {
            K();
        } else if (this.f26856y) {
            I();
        } else {
            K();
        }
    }

    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "VivosmartSetupStrategy", ".registerDevice()");
        super.J(bArr, z14);
    }

    @Override // cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        if (this.f26764j) {
            i2.a(a2.DEVICES, "VivosmartSetupStrategy", ".handleHandshakeCompleted() -- this is the first handshake complete event since device reset.");
            this.f26764j = false;
            K();
        } else {
            bd0.x xVar = new bd0.x(dVar.getF92746j(), new b());
            this.f26762h = xVar;
            xVar.a();
        }
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.c
    public final int t() {
        return R.string.pairing_vivosmart_instructions_1;
    }

    @Override // cd0.c
    public final int v() {
        return R.string.pairing_vivosmart_instructions_2;
    }
}
