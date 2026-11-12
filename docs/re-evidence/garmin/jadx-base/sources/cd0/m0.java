package cd0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class m0 extends l {

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                m0.this.r();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public m0() {
        super("VivoactiveSetupStrategy", false);
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
            i2.f(a2.DEVICES, "VivoactiveSetupStrategy", "handleSyncFinished: " + e4.getMessage());
        }
    }

    @Override // cd0.l, cd0.c, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, z14);
        if (i.h(dVar.getF92746j())) {
            return;
        }
        rd2.h hVarD = rd2.h.d();
        long f172494b = dVar.getF92746j();
        hVarD.getClass();
        rd2.h.g(f172494b, 3, false);
    }

    @Override // cd0.l, cd0.i
    public final void i() {
        i2.a(a2.DEVICES, "VivoactiveSetupStrategy", ".requestSync()");
        p.b(this.f26815c, "VivoactiveSetupStrategy");
    }

    @Override // cd0.i
    public final void m() {
        n();
    }

    @Override // cd0.l, cd0.c
    public final void s(int i14, boolean z14, Runnable runnable, Intent intent) {
        if (i14 == 0) {
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "VivoactiveSetupStrategy", ".exitFlow(): Flow cancelled. Calling device mgr to send FINISHED_CANCELED to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_CANCELED, this.f26814b.getF143511a());
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2Var, "VivoactiveSetupStrategy", ".exitFlow(): Calling disconnect device and asking GDI to forget the invitation.");
            r();
            aVar.getClass();
            i2.a.b(a2Var, "VivoactiveSetupStrategy", ".exitFlow(): Calling util to update BLE connection candidates.");
            ed0.a.k("VivoactiveSetupStrategy");
        }
        p(z14);
        if (this.f26816d != null) {
            i2.a(a2.DEVICES, "VivoactiveSetupStrategy", ".exitFlow(): Calling setup listener to exit flow.");
            this.f26816d.O(i14, null, null);
        } else if (i14 == -1) {
            i2.a(a2.DEVICES, "VivoactiveSetupStrategy", ".exitFlow(): Calling device mgr to send FINISHED_WITH_SUCCESS to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, this.f26814b.getF143511a());
        }
    }
}
