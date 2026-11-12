package cd0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class l extends c {
    public final a A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f26824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f26826z;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                l lVar = l.this;
                lVar.f26817e.g();
                lVar.G(null);
                bd0.h0 h0Var = lVar.f26816d;
                if (h0Var != null) {
                    h0Var.f();
                }
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public l(String str, boolean z14) {
        this.A = new a();
        this.f26824x = z14;
        i2.a(a2.DEVICES, "BaseHybridDeviceSetupStrategy", "constructor called from " + str);
    }

    @Override // cd0.c
    public final void H(boolean z14) {
        this.f26825y = z14;
        if (this.f26764j || !this.f26826z) {
            K();
        } else if (this.f26824x) {
            I();
        } else {
            K();
        }
    }

    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "BaseHybridDeviceSetupStrategy", ".registerDevice()");
        super.J(bArr, this.f26825y);
    }

    @Override // cd0.c, cd0.i
    public void d(bm2.d dVar, boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BaseHybridDeviceSetupStrategy", ".handleHandshakeCompleted()");
        super.d(dVar, z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BaseHybridDeviceSetupStrategy", ".checkRegistrationStatus()");
        bd0.x xVar = new bd0.x(this.f26815c.getF172494b(), new m(this));
        this.f26762h = xVar;
        xVar.a();
    }

    @Override // cd0.i
    public final void e(bm2.d dVar) {
    }

    @Override // cd0.i
    public void i() {
        i2.a(a2.DEVICES, "BaseHybridDeviceSetupStrategy", ".requestSync() -- overridden to prevent base class execution.");
        try {
            L(this.A);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "BaseHybridDeviceSetupStrategy", "requestSync: " + e4.getMessage());
        }
    }

    @Override // cd0.c
    public void s(int i14, boolean z14, Runnable runnable, Intent intent) {
        if (i14 == -1) {
            i2.a(a2.DEVICES, "BaseHybridDeviceSetupStrategy", ".exitFlow() -- adding sync runnable for BLEDeviceSetupActivity to execute before finishing.");
            runnable = new a0.c(this, 29);
        }
        super.s(i14, z14, runnable, intent);
    }

    public l() {
        this("BaseHybridDeviceSetupStrategy", false);
    }
}
