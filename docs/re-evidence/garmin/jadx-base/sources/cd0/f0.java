package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class f0 extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f26794x = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                f0 f0Var = f0.this;
                f0Var.f26817e.g();
                f0Var.G(null);
                bd0.h0 h0Var = f0Var.f26816d;
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
    public final void B(byte[] bArr) {
        i2.a(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26765k = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        J(bArr, false);
    }

    @Override // cd0.c
    public final void D(int i14) {
        i2.a(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", ".handleSyncFinished()");
        super.D(i14);
        if (i14 == 0) {
            try {
                L(this.f26794x);
            } catch (DeviceInfoDTONullException e4) {
                i2.f(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", "handleSyncFinished: " + e4.getMessage());
            }
        }
    }

    @Override // cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        i2.a(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", ".handleHandshakeCompleted()");
        super.d(dVar, z14);
        K();
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.c
    public void o(byte[] bArr) {
        i2.a(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", ".checkForFirmwareUpdate()");
        try {
            L(this.f26794x);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "OutdoorBondedDeviceSetupStrategy", "checkForFirmwareUpdate: " + e4.getMessage());
        }
    }
}
