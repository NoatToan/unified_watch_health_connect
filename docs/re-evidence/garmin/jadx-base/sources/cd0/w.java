package cd0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class w extends l {

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                w.this.r();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public w() {
        super("Fenix3SetupStrategy", false);
    }

    public static /* synthetic */ void N(w wVar, bm2.d dVar, boolean z14) {
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
        super.d(dVar, z14);
        if (i.h(dVar.getF92746j())) {
            return;
        }
        rd2.h hVarD = rd2.h.d();
        long f172494b = dVar.getF92746j();
        hVarD.getClass();
        rd2.h.g(f172494b, 3, false);
    }

    @Override // cd0.c
    public final void D(int i14) {
        super.D(i14);
        if (i14 != 0) {
            if (this.f26814b != null) {
                dm2.f.N().M(new a(), this.f26813a, c(), b());
                return;
            }
            return;
        }
        try {
            L(this.A);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "Fenix3SetupStrategy", "handleSyncFinished: " + e4.getMessage());
        }
    }

    @Override // cd0.l, cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        i2.a(a2.DEVICES, "Fenix3SetupStrategy", "handleHandshakeCompleted: sending settings");
        sm2.g.d(dVar);
        new Thread(new v(this, dVar, z14, 0)).start();
    }

    @Override // cd0.l, cd0.i
    public final void i() {
        i2.a(a2.DEVICES, "Fenix3SetupStrategy", ".requestSync()");
        p.b(this.f26815c, "Fenix3SetupStrategy");
    }

    @Override // cd0.i
    public final void m() {
        n();
    }

    @Override // cd0.l, cd0.c
    public final void s(int i14, boolean z14, Runnable runnable, Intent intent) {
        if (i14 == 0) {
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "Fenix3SetupStrategy", ".exitFlow(): Flow cancelled. Calling device mgr to send FINISHED_CANCELED to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_CANCELED, this.f26814b.getF143511a());
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2Var, "Fenix3SetupStrategy", ".exitFlow(): Calling disconnect device, asking GDI to forget the invitation.");
            r();
            aVar.getClass();
            i2.a.b(a2Var, "Fenix3SetupStrategy", ".exitFlow(): Calling util to update BLE connection candidates.");
            ed0.a.k("Fenix3SetupStrategy");
        }
        p(z14);
        if (this.f26816d != null) {
            i2.a(a2.DEVICES, "Fenix3SetupStrategy", ".exitFlow(): Calling setup listener to exit flow.");
            this.f26816d.O(i14, null, null);
        } else if (i14 == -1) {
            i2.a(a2.DEVICES, "Fenix3SetupStrategy", ".exitFlow(): Calling device mgr to send FINISHED_WITH_SUCCESS to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, this.f26814b.getF143511a());
        }
    }
}
