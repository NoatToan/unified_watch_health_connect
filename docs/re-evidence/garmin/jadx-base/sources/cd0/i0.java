package cd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class i0 extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f26820x = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                i0 i0Var = i0.this;
                i0Var.f26817e.g();
                i0Var.G(null);
                bd0.h0 h0Var = i0Var.f26816d;
                if (h0Var != null) {
                    h0Var.f();
                }
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    @Override // cd0.c
    public final void D(int i14) {
        super.D(i14);
        if (i14 == 0) {
            try {
                L(this.f26820x);
            } catch (DeviceInfoDTONullException e4) {
                i2.f(a2.DEVICES, "TruSwingDevice", "handleSyncFinished: " + e4.getMessage());
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
        K();
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.c
    public final void o(byte[] bArr) {
        if (zb0.u0.n(this.f26814b.getF143517g(), zb0.u0.E5)) {
            new Thread(new h0(this, 0)).start();
        }
        super.o(bArr);
    }

    @Override // cd0.c
    public final int t() {
        return -1;
    }

    @Override // cd0.c
    public final String u() {
        Context context = this.f26813a;
        return context.getString(R.string.pairing_truswing_instructions_1, context.getString(R.string.os_name_android));
    }

    @Override // cd0.c
    public final int v() {
        return -1;
    }
}
