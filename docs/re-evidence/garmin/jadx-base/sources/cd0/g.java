package cd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f26801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f26802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f26803n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bm2.a f26796g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bd0.x f26797h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bd0.v f26798i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bd0.s f26799j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26800k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f26804o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bd0.j0 f26805p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bd0.k0 f26806q = null;

    public class a implements bd0.j0.a {
        public a() {
        }

        @Override // bd0.j0.a
        public final void a() {
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handlePairingPasskeyRequired() > onTimerExpired(): User let prompt countdown timer expire. Exiting flow.");
            g.this.r(0, false, null, null);
        }

        @Override // bd0.j0.a
        public final void b(String str) {
            g gVar = g.this;
            bm2.a aVar = gVar.f26796g;
            aVar.f18889d = str;
            l80.b bVar = gVar.f26818f;
            int iP = bVar.p(aVar.f18886a, str);
            if (iP == 0) {
                return;
            }
            bVar.getClass();
            if (iP == -131) {
                gVar.G();
                return;
            }
            bVar.getClass();
            if (iP == -132) {
                gVar.G();
                return;
            }
            if (iP == 2) {
                gVar.H();
                return;
            }
            i2.f(a2.DEVICES, "DeviceSetupWizStrategy", "Fix me developer! handlePairingPasskeyRequired(): I'm not handling status [" + iP + "] returned by authenticateDevice()!");
            gVar.G();
        }

        @Override // bd0.j0.a
        public final void onCancel() {
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handlePairingPasskeyRequired() > onCancel(): User pressed the prompt's cancel button. Exiting flow.");
            g.this.r(0, false, null, null);
        }
    }

    public class b implements bd0.v.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f26808a;

        public b(byte[] bArr) {
            this.f26808a = bArr;
        }

        @Override // bd0.v.c
        public final void a() {
            bd0.h0 h0Var = g.this.f26816d;
            if (h0Var != null) {
                h0Var.G();
            }
        }

        @Override // bd0.v.c
        public final void b(yl2.e eVar) {
            g.this.I(eVar);
        }

        @Override // bd0.v.c
        public final void c() {
            g gVar = g.this;
            bd0.h0 h0Var = gVar.f26816d;
            if (h0Var != null) {
                h0Var.r();
            }
            gVar.getClass();
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".checkForFirmwareUpdate()");
            bd0.s sVar = new bd0.s(gVar.c(), this.f26808a, new h(gVar));
            gVar.f26799j = sVar;
            sVar.a();
        }
    }

    public int A() {
        return -1;
    }

    public int B() {
        return 2131231969;
    }

    public int C() {
        return -1;
    }

    public String D() {
        return this.f26813a.getString(R.string.msg_device_setup_how_to_pair, this.f26814b.getProductDisplayName());
    }

    public int E() {
        return 2131231969;
    }

    public String F() {
        return this.f26813a.getString(R.string.msg_setup_failed, this.f26814b.getProductDisplayName());
    }

    public final void G() {
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleDeviceAuthenticateFailure()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.c();
        }
        bd0.j0 j0Var = this.f26805p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26806q;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f26806q = new bd0.k0(this.f26813a, this.f26814b.getProductDisplayName(), new d(this));
    }

    public final void H() {
        lj0.j jVar;
        Context context = this.f26813a;
        Toast.makeText(context, context.getString(R.string.dialog_title_device_disconnected_a), 0).show();
        bd0.j0 j0Var = this.f26805p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26806q;
        if (k0Var != null) {
            k0Var.a();
        }
        bd0.x xVar = this.f26797h;
        if (xVar == null || (jVar = xVar.f17633c) == null || !jVar.d()) {
            return;
        }
        xVar.f17633c.a();
    }

    public final void I(yl2.e eVar) {
        new Thread(new f(0, this, eVar)).start();
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.d0(eVar);
        }
        q();
        if (yl2.e.INVALID_UNIT_ID == eVar) {
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "DeviceSetupWizStrategy", ".handleDeviceRegistrationFailure(): invalid unit ID");
            if (this.f26815c != null) {
                dm2.f.N().M(null, this.f26813a, c(), b());
            }
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", ".promptInvalidUnitID()");
            new bd0.l0(this.f26813a, new d(this));
        }
    }

    public final void J() {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "DeviceSetupWizStrategy", ".handleDeviceXMLDownloadFailure()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.Z();
        }
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, c(), yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES, "Failed to download device xml");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupWizStrategy", "  >> .handleDeviceXMLDownloadFailure() - sent milestone PAIRING FAILED to device.");
    }

    public void K(byte[] bArr) {
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26801l = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        P(bArr, true);
    }

    public final void L(Intent intent) {
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handlePairingPasskeyRequired()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.n();
        }
        bd0.j0 j0Var = this.f26805p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26806q;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f26805p = new bd0.j0(this.f26813a, this.f26814b.getProductDisplayName(), intent.getIntExtra("com.garmin.android.gdi.EXTRA_PAIRING_PASSKEY_TIMEOUT", 30), new a());
    }

    public void M(int i14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "DeviceSetupWizStrategy", ".handleSyncFinished()");
        if (i14 == 0) {
            bd0.h0 h0Var = this.f26816d;
            if (h0Var != null) {
                h0Var.g(true);
                return;
            }
            return;
        }
        if (i14 != 1) {
            String strF = v.e0.f(i14, "Fix me developer! I wasn't expecting I'd have to handle sync result [", "].");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "DeviceSetupWizStrategy", strF);
            return;
        }
        bd0.h0 h0Var2 = this.f26816d;
        if (h0Var2 != null) {
            h0Var2.g(false);
        }
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, c(), yl2.e.SYNC_FAILURE, "Sync Failed.");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupWizStrategy", ".handleSyncFinished() -- sent milestone PAIRING FINISHED FAILURE to device.");
        rd2.i iVar = rd2.f.a().f152047c;
        long jC = c();
        iVar.getClass();
        rd2.i.d(jC);
        q();
    }

    public final void N(boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "DeviceSetupWizStrategy", ".handleWasFactoryResetCommandReceivedByDevice()");
        this.f26800k = z14;
        bd0.h0 h0Var = this.f26816d;
        if (!z14) {
            if (h0Var != null) {
                h0Var.T();
            }
            i2.a(a2Var, "DeviceSetupWizStrategy", ".resetDevice()");
            bd0.h0 h0Var2 = this.f26816d;
            if (h0Var2 != null) {
                h0Var2.R();
            }
            hk0.a.f().h(c());
            return;
        }
        if (h0Var != null) {
            h0Var.V();
            this.f26816d.b0();
        }
        if (!this.f26796g.b()) {
            p();
            return;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, "DeviceSetupWizStrategy", ".handleWasFactoryResetCommandReceivedByDevice() > GDIAuth[yes], wasReceivedByGarminDevice[yes]");
        aVar.getClass();
        i2.a.b(a2Var, "DeviceSetupWizStrategy", ".handleWasFactoryResetCommandReceivedByDevice() > Calling GFDIService.connectAuthenticatedDevice()");
        this.f26818f.o(this.f26796g.f18886a, this.f26804o, this.f26802m, this.f26803n);
    }

    public void O(boolean z14) {
    }

    public void P(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".registerDevice()");
        bm2.d dVar = this.f26815c;
        if (dVar == null) {
            I(yl2.e.DEVICE_INFO_OBJ_NULL);
            return;
        }
        bd0.v vVar = new bd0.v(this.f26814b.I(), c(), this.f26815c.getF92744h(), new b(bArr), this.f26817e, zb0.u0.r(Integer.toString(dVar.getF92744h())));
        this.f26798i = vVar;
        vVar.a(hb2.h.c(this.f26813a), bArr, z14);
    }

    public final void Q() {
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".retrieveDeviceXML()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.P();
        }
        this.f26818f.d(c());
    }

    public final void R(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b) {
        if (this.f26815c == null) {
            i2.f(a2.DEVICES, "DeviceSetupWizStrategy", ".saveDeviceToLocalDatabase() -- mDeviceInfoDTO is null");
            throw new DeviceInfoDTONullException();
        }
        i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".saveDeviceToLocalDatabase()");
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(Integer.toString(this.f26815c.getF92744h()));
        String str = u0Var != null ? u0Var.f203858e : null;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f26814b;
        String applicationKey = lVar != null ? lVar.getApplicationKey() : null;
        dm2.f fVarN = dm2.f.N();
        Context context = this.f26813a;
        bm2.d dVar = this.f26815c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26817e.getClass();
        fVarN.O(interfaceC0995b, context, dVar, applicationKey, jCurrentTimeMillis, 11657, this.f26801l, str, this.f26802m, this.f26803n, this.f26804o, true);
    }

    public void o(boolean z14) {
        lj0.j jVar;
        lj0.j jVar2;
        lj0.j jVar3;
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "DeviceSetupWizStrategy", ".cleanupBeforeNavigatingAway()");
        bd0.j0 j0Var = this.f26805p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26806q;
        if (k0Var != null) {
            k0Var.a();
        }
        bd0.x xVar = this.f26797h;
        if (xVar != null && (jVar3 = xVar.f17633c) != null && jVar3.d()) {
            xVar.f17633c.a();
        }
        bd0.v vVar = this.f26798i;
        if (vVar != null && (jVar2 = vVar.f17623d) != null && jVar2.d()) {
            vVar.f17623d.a();
        }
        bd0.s sVar = this.f26799j;
        if (sVar != null && (jVar = sVar.f17606e) != null && jVar.d()) {
            sVar.f17606e.a();
        }
        this.f26818f.j();
        if (z14) {
            i2.f36769a.getClass();
            i2.a.p(a2Var, "DeviceSetupWizStrategy", ".cancelSync() -- TODO: Ask Alfredo how to cancel sync upload and sync download.");
        }
        this.f26800k = false;
    }

    public void p() {
        bm2.a aVar = this.f26796g;
        if (aVar == null) {
            return;
        }
        ((f12.b) KoinJavaComponent.get(f12.b.class)).f();
        d dVar = new d(this);
        Logger logger = km2.b.f105626a;
        vm2.a aVar2 = vm2.a.f178815a;
        j1.v vVar = new j1.v(dVar, 2);
        aVar2.getClass();
        vm2.a.b(aVar, vVar, true);
    }

    public final void q() {
        new Thread(new e(this, 0)).start();
        if (this.f26816d != null) {
            ((Activity) this.f26813a).runOnUiThread(new e(this, 1));
        }
    }

    public final void r(int i14, boolean z14, Runnable runnable, Intent intent) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "DeviceSetupWizStrategy", ".exitFlow()");
        if (i14 == 0) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", "  >> .exitFlow() - flow cancelled.");
            aVar.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", "  >> .exitFlow() - sending milestone PAIRING CANCELED to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_CANCELED, c());
            aVar.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", "  >> .exitFlow() - calling disconnect device, asking GDI to forget the invitation.");
            q();
            ed0.a.k("DeviceSetupWizStrategy");
            aVar.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", "  >> .exitFlow() - sent GFDI fresh BLE connection candidates.");
        }
        o(z14);
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.O(i14, runnable, null);
        } else if (i14 == -1) {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupWizStrategy", ".exitFlow() -- sending milestone PAIRING FINISHED SUCCESS to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, c());
        }
    }

    public String s() {
        return this.f26813a.getString(R.string.msg_device_setup_device_not_found, this.f26814b.getProductDisplayName());
    }

    public int t() {
        return -1;
    }

    public int u() {
        return -1;
    }

    public int v() {
        return 2131231969;
    }

    public Fragment w() {
        return null;
    }

    public int x() {
        return 2131231969;
    }

    public String y() {
        return this.f26813a.getString(R.string.msg_device_setup_in_progress, this.f26814b.getProductDisplayName());
    }

    public int z() {
        return 2131231969;
    }
}
