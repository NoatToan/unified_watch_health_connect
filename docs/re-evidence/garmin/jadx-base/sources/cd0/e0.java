package cd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class e0 extends cd0.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f26787x = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                e0 e0Var = e0.this;
                e0Var.f26817e.g();
                e0Var.G(null);
                bd0.h0 h0Var = e0Var.f26816d;
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
            bd0.h0 h0Var = e0.this.f26816d;
            if (h0Var != null) {
                h0Var.u();
            }
        }

        @Override // bd0.x.c
        public final void b(yl2.e eVar) {
            bd0.h0 h0Var = e0.this.f26816d;
            if (h0Var != null) {
                h0Var.p(eVar);
            }
        }

        @Override // bd0.x.c
        public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
            e0 e0Var = e0.this;
            bd0.h0 h0Var = e0Var.f26816d;
            if (h0Var != null) {
                h0Var.a0();
            }
            if (z16) {
                e0Var.I();
            } else {
                e0Var.K();
            }
        }
    }

    public class c implements bd0.v.c {
        public c() {
        }

        @Override // bd0.v.c
        public final void a() {
            bd0.h0 h0Var = e0.this.f26816d;
            if (h0Var != null) {
                h0Var.G();
            }
        }

        @Override // bd0.v.c
        public final void b(yl2.e eVar) {
            e0.this.z(eVar);
        }

        @Override // bd0.v.c
        public final void c() {
            e0 e0Var = e0.this;
            bd0.h0 h0Var = e0Var.f26816d;
            if (h0Var != null) {
                h0Var.r();
            }
            try {
                e0Var.L(e0Var.f26787x);
            } catch (DeviceInfoDTONullException e4) {
                i2.f(a2.DEVICES, "IndexSmartScale", "onDeviceRegistrationSucceeded: " + e4.getMessage());
            }
        }
    }

    @Override // cd0.c
    public final void A(String str) {
        i2.a(a2.DEVICES, "IndexSmartScale", ".handleDeviceXMLDownloadFailure()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.Z();
        }
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, this.f26814b.getF143511a(), yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES, TextUtils.isEmpty(str) ? "Failed to download device xml" : "Failed to download device xml: ".concat(str));
        try {
            Thread.sleep(1000L);
        } catch (Exception unused) {
        }
        K();
    }

    @Override // cd0.c
    public final void D(int i14) {
    }

    @Override // cd0.c
    public final void G(Intent intent) {
        i2.a(a2.DEVICES, "IndexSmartScale", ".notifySetupSuccessful()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.d();
        }
        Context context = this.f26813a;
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        new com.garmin.android.apps.connectmobile.devices.setup.d(this.f26813a, this.f26814b.getF143516f(), new bd0.e(this, 4));
    }

    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "IndexSmartScale", ".registerDevice()");
        bm2.d dVar = this.f26815c;
        if (dVar == null) {
            z(yl2.e.DEVICE_INFO_OBJ_NULL);
            return;
        }
        bd0.v vVar = new bd0.v(true, dVar.getF92746j(), this.f26815c.getF92744h(), new c(), this.f26817e, true);
        this.f26763i = vVar;
        vVar.a(hb2.h.c(this.f26813a), bArr, false);
    }

    @Override // cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        if (!this.f26764j) {
            bd0.x xVar = new bd0.x(dVar.getF92746j(), new b());
            this.f26762h = xVar;
            xVar.a();
        } else {
            i2.a(a2.DEVICES, "IndexSmartScale", ".handleHandshakeCompleted() -- this is the first handshake complete event since device reset.");
            this.f26764j = false;
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                i2.f(a2.DEVICES, "IndexSmartScale", ".handleHandshakeCompleted() -- Interrupted while waiting for handshake to complete.");
            }
            K();
        }
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.c
    public final int t() {
        return R.string.pairing_index_smart_scale_instructions_1_a;
    }

    @Override // cd0.c
    public final int v() {
        return -1;
    }
}
