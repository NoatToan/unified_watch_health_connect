package cd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f26765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f26766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f26767m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pm2.a f26773s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bm2.a f26761g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bd0.x f26762h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bd0.v f26763i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26764j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f26768n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bd0.s f26769o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bd0.j0 f26770p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bd0.k0 f26771q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b f26772r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26774t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f26775u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26776v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f26777w = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            c cVar2 = c.this;
            com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = cVar2.f26772r;
            if (interfaceC0995b != null) {
                interfaceC0995b.onComplete(j8, cVar);
            }
            if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
                cVar2.f26817e.Q();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = c.this.f26772r;
            if (interfaceC0995b != null) {
                interfaceC0995b.onResults(j8, eVar, obj);
            }
        }
    }

    public class b implements bd0.j0.a {
        public b() {
        }

        @Override // bd0.j0.a
        public final void a() {
            i2.d("AbstractDeviceSetupStrategy", ".handlePairingPasskeyRequired() > onTimerExpired(): User let prompt countdown timer expire. Exiting flow.");
            c.this.s(0, false, null, null);
        }

        @Override // bd0.j0.a
        public final void b(String str) {
            c cVar = c.this;
            bm2.a aVar = cVar.f26761g;
            aVar.f18889d = str;
            l80.b bVar = cVar.f26818f;
            int iP = bVar.p(aVar.f18886a, str);
            if (iP == 0) {
                return;
            }
            bVar.getClass();
            if (iP == -131) {
                cVar.x();
                return;
            }
            bVar.getClass();
            if (iP == -132) {
                cVar.x();
                return;
            }
            if (iP == 2) {
                cVar.y();
                return;
            }
            i2.f(a2.DEVICES, "AbstractDeviceSetupStrategy", "Fix me developer! handlePairingPasskeyRequired(): I'm not handling status [" + iP + "] returned by authenticateDevice()!");
            cVar.x();
        }

        @Override // bd0.j0.a
        public final void onCancel() {
            i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handlePairingPasskeyRequired() > onCancel(): User pressed the prompt's cancel button. Exiting flow.");
            c.this.s(0, false, null, null);
        }
    }

    /* JADX INFO: renamed from: cd0.c$c, reason: collision with other inner class name */
    public class C0411c implements bd0.v.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f26780a;

        public C0411c(byte[] bArr) {
            this.f26780a = bArr;
        }

        @Override // bd0.v.c
        public final void a() {
            bd0.h0 h0Var = c.this.f26816d;
            if (h0Var != null) {
                h0Var.G();
            }
        }

        @Override // bd0.v.c
        public final void b(yl2.e eVar) {
            c.this.z(eVar);
        }

        @Override // bd0.v.c
        public final void c() {
            c cVar = c.this;
            bd0.h0 h0Var = cVar.f26816d;
            if (h0Var != null) {
                h0Var.r();
            }
            cVar.o(this.f26780a);
        }
    }

    public class d implements bd0.s.c {
        public d() {
        }

        @Override // bd0.s.c
        public final void a() {
            bd0.h0 h0Var = c.this.f26816d;
            if (h0Var != null) {
                h0Var.N();
            }
        }

        @Override // bd0.s.c
        public final void b(bd0.b0 b0Var) {
            c cVar = c.this;
            bd0.h0 h0Var = cVar.f26816d;
            if (h0Var != null) {
                h0Var.L(i.a.f26819a[b0Var.ordinal()] != 1 ? yl2.e.OTHER_FATAL : yl2.e.NO_INTERNET_CONNECTION);
            }
            cVar.i();
        }

        @Override // bd0.s.c
        public final void c(lj0.e.a aVar) {
            c cVar = c.this;
            bd0.h0 h0Var = cVar.f26816d;
            if (h0Var != null) {
                h0Var.I();
            }
            cVar.i();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26783a;

        static {
            int[] iArr = new int[la2.i.values().length];
            f26783a = iArr;
            try {
                iArr[la2.i.BLE_CONNECTION_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26783a[la2.i.BLE_CONNECT_GATT_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void A(String str) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "AbstractDeviceSetupStrategy", ".handleDeviceXMLDownloadFailure()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.Z();
        }
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, c(), yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES, TextUtils.isEmpty(str) ? "Failed to download device xml" : "Failed to download device xml: ".concat(str));
        i2.f36769a.getClass();
        i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "  >> .handleDeviceXMLDownloadFailure() - sent milestone PAIRING FAILED to device.");
    }

    public void B(byte[] bArr) {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleDeviceXMLDownloadSuccess()");
        this.f26765k = bArr;
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.w();
        }
        J(bArr, true);
    }

    public final void C(Intent intent) {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handlePairingPasskeyRequired()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.n();
        }
        bd0.j0 j0Var = this.f26770p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26771q;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f26770p = new bd0.j0(this.f26813a, this.f26814b.getProductDisplayName(), intent.getIntExtra("com.garmin.android.gdi.EXTRA_PAIRING_PASSKEY_TIMEOUT", 30), new b());
    }

    public void D(int i14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "AbstractDeviceSetupStrategy", ".handleSyncFinished()");
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
            i2.a.f(a2Var, "AbstractDeviceSetupStrategy", strF);
            return;
        }
        bd0.h0 h0Var2 = this.f26816d;
        if (h0Var2 != null) {
            h0Var2.g(false);
        }
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, c(), yl2.e.SYNC_FAILURE, "Sync failed.");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "AbstractDeviceSetupStrategy", ".handleSyncFinished() -- sent milestone PAIRING FINISHED FAILURE to device.");
        rd2.i iVar = rd2.f.a().f152047c;
        long jC = c();
        iVar.getClass();
        rd2.i.d(jC);
        r();
    }

    public final void E(boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "AbstractDeviceSetupStrategy", ".handleWasFactoryResetCommandReceivedByDevice()");
        this.f26764j = z14;
        bd0.h0 h0Var = this.f26816d;
        if (!z14) {
            if (h0Var != null) {
                h0Var.T();
            }
            i2.a(a2Var, "AbstractDeviceSetupStrategy", ".resetDevice()");
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
        if (!this.f26761g.b()) {
            q();
            return;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, "AbstractDeviceSetupStrategy", ".handleWasFactoryResetCommandReceivedByDevice() > GDIAuth[yes], wasReceivedByGarminDevice[yes]");
        aVar.getClass();
        i2.a.b(a2Var, "AbstractDeviceSetupStrategy", ".handleWasFactoryResetCommandReceivedByDevice() > Calling GFDIService.connectAuthenticatedDevice()");
        this.f26818f.o(this.f26761g.f18886a, this.f26768n, this.f26766l, this.f26767m);
    }

    public final void F(Context context, com.garmin.android.apps.connectmobile.devices.model.l lVar, bd0.h0 h0Var, bm2.a aVar) {
        this.f26813a = context;
        this.f26814b = lVar;
        this.f26816d = h0Var;
        this.f26761g = aVar;
        this.f26774t = 0;
        this.f26775u = SystemClock.elapsedRealtime();
    }

    public void G(Intent intent) {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".notifySetupSuccessful()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.d();
            this.f26816d.S(new a0.h(10, this, intent));
        }
    }

    public void H(boolean z14) {
    }

    public final void I() {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".promptResetDevice()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.D();
        }
    }

    public void J(byte[] bArr, boolean z14) {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".registerDevice()");
        if (bArr == null) {
            z(yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES);
            return;
        }
        bm2.d dVar = this.f26815c;
        if (dVar == null) {
            z(yl2.e.DEVICE_INFO_OBJ_NULL);
            return;
        }
        bd0.v vVar = new bd0.v(this.f26814b.I(), c(), this.f26815c.getF172495c(), new C0411c(bArr), this.f26817e, zb0.u0.r(Integer.toString(dVar.getF172495c())));
        this.f26763i = vVar;
        vVar.a(hb2.h.c(this.f26813a), bArr, z14);
    }

    public final void K() {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".retrieveDeviceXML()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.P();
        }
        this.f26818f.d(c());
    }

    public final void L(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b) {
        if (this.f26815c == null) {
            i2.f(a2.DEVICES, "AbstractDeviceSetupStrategy", ".saveDeviceToLocalDatabase() -- mDeviceInfoDTO is null");
            throw new DeviceInfoDTONullException();
        }
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".saveDeviceToLocalDatabase()");
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(Integer.toString(this.f26815c.getF172495c()));
        String str = u0Var != null ? u0Var.f203858e : null;
        this.f26772r = interfaceC0995b;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f26814b;
        String applicationKey = lVar != null ? lVar.getApplicationKey() : null;
        dm2.f fVarN = dm2.f.N();
        Context context = this.f26813a;
        bm2.d dVar = this.f26815c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26817e.getClass();
        fVarN.O(this.f26777w, context, dVar, applicationKey, jCurrentTimeMillis, 11657, this.f26765k, str, this.f26766l, this.f26767m, this.f26768n, true);
    }

    public final boolean M(String str) {
        if (la2.i.AUTHENTICATION_EXCEPTION.name().equals(str)) {
            return false;
        }
        bm2.a aVar = this.f26761g;
        return this.f26774t < ((aVar == null || !oa2.a.c(aVar.f18886a)) ? 3 : 4) && SystemClock.elapsedRealtime() < this.f26775u + 60000;
    }

    @Override // cd0.i
    public void d(bm2.d dVar, boolean z14) {
        this.f26776v.set(false);
        super.d(dVar, z14);
    }

    public void o(byte[] bArr) {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".checkForFirmwareUpdate()");
        bd0.s sVar = new bd0.s(c(), bArr, new d());
        this.f26769o = sVar;
        sVar.a();
    }

    public final void p(boolean z14) {
        lj0.j jVar;
        lj0.j jVar2;
        lj0.j jVar3;
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "AbstractDeviceSetupStrategy", ".cleanupBeforeNavigatingAway()");
        bd0.j0 j0Var = this.f26770p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26771q;
        if (k0Var != null) {
            k0Var.a();
        }
        pm2.a aVar = this.f26773s;
        if (aVar != null) {
            aVar.b(this.f26813a);
        }
        bd0.x xVar = this.f26762h;
        if (xVar != null && (jVar3 = xVar.f17633c) != null && jVar3.d()) {
            xVar.f17633c.a();
        }
        bd0.v vVar = this.f26763i;
        if (vVar != null && (jVar2 = vVar.f17623d) != null && jVar2.d()) {
            vVar.f17623d.a();
        }
        bd0.s sVar = this.f26769o;
        if (sVar != null && (jVar = sVar.f17606e) != null && jVar.d()) {
            sVar.f17606e.a();
        }
        this.f26818f.j();
        if (z14) {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "cancelSync is not yet implemented");
            r();
        }
        this.f26764j = false;
    }

    public final void q() {
        this.f26774t++;
        if (this.f26773s == null) {
            pm2.a aVar = new pm2.a(this.f26816d);
            this.f26773s = aVar;
            aVar.a(this.f26813a);
        }
        bm2.a aVar2 = this.f26761g;
        if (aVar2 == null) {
            return;
        }
        ((f12.b) KoinJavaComponent.get(f12.b.class)).f();
        cd0.a aVar3 = new cd0.a(this);
        Logger logger = km2.b.f105626a;
        vm2.a aVar4 = vm2.a.f178815a;
        j1.v vVar = new j1.v(aVar3, 2);
        aVar4.getClass();
        vm2.a.b(aVar2, vVar, true);
    }

    public final void r() {
        new Thread(new cd0.b(this, 0)).start();
        if (this.f26816d != null) {
            ((Activity) this.f26813a).runOnUiThread(new cd0.b(this, 1));
        }
    }

    public void s(int i14, boolean z14, Runnable runnable, Intent intent) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "AbstractDeviceSetupStrategy", ".exitFlow()");
        if (i14 == 0) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "  >> .exitFlow() - flow cancelled.");
            aVar.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "  >> .exitFlow() - sending milestone PAIRING CANCELED to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_CANCELED, c());
            aVar.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "  >> .exitFlow() - calling disconnect device, asking GDI to forget the invitation.");
            r();
            ed0.a.k("AbstractDeviceSetupStrategy");
            aVar.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", "  >> .exitFlow() - sent GFDI fresh BLE connection candidates.");
        }
        p(z14);
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.O(i14, runnable, intent);
        } else if (i14 == -1) {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", ".exitFlow() -- sending milestone PAIRING FINISHED SUCCESS to device.");
            hk0.a.f().k(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, c());
        }
    }

    public int t() {
        return R.string.pairing_generic_instructions_1;
    }

    public String u() {
        return null;
    }

    public int v() {
        return R.string.pairing_generic_instructions_2_a;
    }

    public String w() {
        return null;
    }

    public final void x() {
        i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleDeviceAuthenticateFailure()");
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.c();
        }
        bd0.j0 j0Var = this.f26770p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26771q;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f26771q = new bd0.k0(this.f26813a, this.f26814b.getProductDisplayName(), new cd0.a(this));
    }

    public final void y() {
        lj0.j jVar;
        Context context = this.f26813a;
        Toast.makeText(context, context.getString(R.string.dialog_title_device_disconnected_a), 0).show();
        bd0.j0 j0Var = this.f26770p;
        if (j0Var != null) {
            j0Var.a();
        }
        bd0.k0 k0Var = this.f26771q;
        if (k0Var != null) {
            k0Var.a();
        }
        bd0.x xVar = this.f26762h;
        if (xVar == null || (jVar = xVar.f17633c) == null || !jVar.d()) {
            return;
        }
        xVar.f17633c.a();
    }

    public final void z(yl2.e eVar) {
        new Thread(new ab.j(29, this, eVar)).start();
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.d0(eVar);
        }
        r();
        if (yl2.e.INVALID_UNIT_ID == eVar) {
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "AbstractDeviceSetupStrategy", ".handleDeviceRegistrationFailure(): invalid unit ID");
            if (this.f26815c != null) {
                dm2.f.N().M(null, this.f26813a, c(), b());
            }
            i2.f36769a.getClass();
            i2.a.b(a2Var, "AbstractDeviceSetupStrategy", ".promptInvalidUnitID()");
            new bd0.l0(this.f26813a, new cd0.a(this));
        }
    }
}
