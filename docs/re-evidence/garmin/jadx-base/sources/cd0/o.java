package cd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class o extends g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26835s;

    public class a implements bd0.x.c {
        public a() {
        }

        @Override // bd0.x.c
        public final void a() {
            bd0.h0 h0Var = o.this.f26816d;
            if (h0Var != null) {
                h0Var.u();
            }
        }

        @Override // bd0.x.c
        public final void b(yl2.e eVar) {
            bd0.h0 h0Var = o.this.f26816d;
            if (h0Var != null) {
                h0Var.p(eVar);
            }
        }

        @Override // bd0.x.c
        public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
            o oVar = o.this;
            bd0.h0 h0Var = oVar.f26816d;
            if (h0Var != null) {
                h0Var.a0();
            }
            boolean z17 = jSONObject.optBoolean("thisDeviceAATOnOtherAccount") && !z14;
            oVar.f26835s = z17;
            oVar.f26834r = false;
            if (!z15) {
                if (!z17) {
                    oVar.Q();
                    return;
                }
                bd0.h0 h0Var2 = oVar.f26816d;
                if (h0Var2 != null) {
                    h0Var2.D();
                    return;
                }
                return;
            }
            if (!jSONObject.optString("deviceId").equals(jSONObject.optString("currentAATDeviceId"))) {
                jSONObject.optString("currentAATName", oVar.f26813a.getString(R.string.no_value));
                bd0.h0 h0Var3 = oVar.f26816d;
                if (h0Var3 != null) {
                    h0Var3.M();
                    return;
                }
                return;
            }
            if (!oVar.f26835s) {
                oVar.Q();
                return;
            }
            bd0.h0 h0Var4 = oVar.f26816d;
            if (h0Var4 != null) {
                h0Var4.D();
            }
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                o oVar = o.this;
                oVar.f26817e.g();
                bd0.h0 h0Var = oVar.f26816d;
                if (h0Var != null) {
                    h0Var.f();
                }
                i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".notifySetupSuccessful()");
                bd0.h0 h0Var2 = oVar.f26816d;
                if (h0Var2 != null) {
                    h0Var2.d();
                }
                oVar.r(-1, false, null, null);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                o.this.q();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    @Override // cd0.g
    public final void K(byte[] bArr) {
        i2.a(a2.DEVICES, "BaseVivoWizardSetupStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26801l = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        P(bArr, this.f26834r);
    }

    @Override // cd0.g
    public final void M(int i14) {
        if (this.f26801l == null) {
            return;
        }
        super.M(i14);
        if (i14 != 0) {
            if (this.f26814b != null) {
                dm2.f.N().M(new c(), this.f26813a, c(), b());
                return;
            }
            return;
        }
        try {
            R(new b());
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "BaseVivoWizardSetupStrategy", "handleSyncFinished: " + e4.getMessage());
        }
    }

    @Override // cd0.g
    public final void O(boolean z14) {
        this.f26834r = z14;
        if (!z14) {
            bd0.h0 h0Var = this.f26816d;
            if (h0Var != null) {
                h0Var.D();
                return;
            }
            return;
        }
        if (!this.f26835s) {
            Q();
            return;
        }
        bd0.h0 h0Var2 = this.f26816d;
        if (h0Var2 != null) {
            h0Var2.D();
        }
    }

    @Override // cd0.g
    public final void P(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "BaseVivoWizardSetupStrategy", ".registerDevice()");
        super.P(bArr, z14);
    }

    @Override // cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        if (this.f26800k) {
            i2.a(a2.DEVICES, "BaseVivoWizardSetupStrategy", ".handleHandshakeCompleted() -- this is the first handshake complete event since device reset.");
            this.f26800k = false;
            Q();
        } else {
            bd0.x xVar = new bd0.x(dVar.getF172494b(), new a());
            this.f26797h = xVar;
            xVar.a();
        }
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.i
    public final void i() {
        i2.a(a2.DEVICES, "BaseVivoWizardSetupStrategy", ".requestSync()");
        dd0.i.f59167a.getClass();
        dd0.i.a();
        super.i();
    }

    @Override // cd0.g
    public final void o(boolean z14) {
        super.o(z14);
        dd0.i.f59167a.getClass();
        dd0.i.a();
    }

    @Override // cd0.g
    public final void p() {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BaseVivoWizardSetupStrategy", ".connectDevice()");
        dd0.i iVar = dd0.i.f59167a;
        String str = this.f26796g.f18886a;
        iVar.getClass();
        i2.f36769a.getClass();
        i2.a.a(a2Var, ".startVivoDevicePairing()");
        dd0.i.f59168b = str;
        super.p();
    }
}
