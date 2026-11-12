package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class q extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f26839x = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                q qVar = q.this;
                qVar.f26817e.g();
                qVar.G(null);
                bd0.h0 h0Var = qVar.f26816d;
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
            bd0.h0 h0Var = q.this.f26816d;
            if (h0Var != null) {
                h0Var.u();
            }
        }

        @Override // bd0.x.c
        public final void b(yl2.e eVar) {
            bd0.h0 h0Var = q.this.f26816d;
            if (h0Var != null) {
                h0Var.p(eVar);
            }
        }

        @Override // bd0.x.c
        public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
            q qVar = q.this;
            bd0.h0 h0Var = qVar.f26816d;
            if (h0Var != null) {
                h0Var.a0();
            }
            qVar.K();
        }
    }

    @Override // cd0.c
    public final void D(int i14) {
        super.D(i14);
        if (i14 == 0) {
            try {
                L(this.f26839x);
            } catch (DeviceInfoDTONullException e4) {
                i2.f(a2.DEVICES, "EdgeBLESetupStrategy", "handleSyncFinished: " + e4.getMessage());
            }
        }
    }

    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        super.J(bArr, false);
    }

    @Override // cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        this.f26762h = new bd0.x(dVar.getF92746j(), new b());
        i2.a(a2.DEVICES, "EdgeBLESetupStrategy", ".handleHandshakeCompleted() -- running DeviceRegistrationStatusChecker...");
        this.f26762h.a();
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }
}
