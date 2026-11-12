package cd0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.common.collect.ImmutableList;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26813a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f26814b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bm2.d f26815c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bd0.h0 f26816d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l80.a f26817e = (l80.a) KoinJavaComponent.get(l80.a.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l80.b f26818f = (l80.b) KoinJavaComponent.get(l80.b.class);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26819a;

        static {
            int[] iArr = new int[bd0.b0.values().length];
            f26819a = iArr;
            try {
                iArr[bd0.b0.NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static boolean h(long j8) {
        rd2.h.d().getClass();
        return rd2.h.f(3, j8) != -1;
    }

    public final void a(bm2.d dVar) {
        if (this.f26815c == null) {
            i2.f(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "checkForDeviceSoftwareUpdate: passed-in DeviceInfoDTO object is null, aborting");
            return;
        }
        a2 a2Var = a2.DEVICES;
        i2.f(a2Var, "AbstractHandshakeCompleteStrategy", "checkForDeviceSoftwareUpdate");
        long f172494b = dVar.getF172494b();
        rd2.f.a().f152045a.getClass();
        byte[] bArrJ = rd2.j.j(f172494b);
        if (bArrJ != null && bArrJ.length != 0) {
            this.f26817e.I(dVar, bArrJ);
        } else {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "AbstractHandshakeCompleteStrategy", "checkForDeviceSoftwareUpdate: deviceXMLBytes read from GCM database is either null or zero length, aborting");
        }
    }

    public final String b() {
        bm2.d dVar = this.f26815c;
        if (dVar != null && dVar.getF172495c() > 0) {
            return String.valueOf(this.f26815c.getF172495c());
        }
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f26814b;
        if (lVar == null) {
            return null;
        }
        String partNumberPartial = lVar.getPartNumberPartial();
        if (TextUtils.isEmpty(partNumberPartial)) {
            return null;
        }
        return partNumberPartial;
    }

    public final long c() {
        bm2.d dVar = this.f26815c;
        if (dVar != null && dVar.getF172494b() > 0) {
            return this.f26815c.getF172494b();
        }
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f26814b;
        if (lVar == null || lVar.getDeviceUnitId() <= 0) {
            return -1L;
        }
        return this.f26814b.getDeviceUnitId();
    }

    public void d(bm2.d dVar, boolean z14) {
        this.f26815c = dVar;
        if (z14) {
            i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "handleHandshakeCompleted: sending milestone STARTED to device");
            hk0.a.f().k(hk0.a.EnumC1667a.STARTED, dVar.getF172494b());
        } else {
            rd2.j jVar = rd2.f.a().f152045a;
            long f172494b = dVar.getF172494b();
            jVar.getClass();
            sd2.f fVarI = rd2.j.i(f172494b, null);
            if (fVarI != null) {
                String softwareVersion = fVarI.getSoftwareVersion();
                String strValueOf = String.valueOf(dVar.getF172497e());
                if (!TextUtils.equals(softwareVersion, strValueOf)) {
                    a2 a2Var = a2.DEVICES;
                    StringBuilder sbI = p6.b.i("handleHandshakeCompleted: Software updated from ", softwareVersion, " to ", strValueOf, " for ");
                    sbI.append(dVar.getF172496d());
                    sbI.append(", unitID [");
                    sbI.append(dVar.getF172494b());
                    sbI.append("], macAddress [");
                    sbI.append(dVar.f());
                    sbI.append("]");
                    i2.a(a2Var, "AbstractHandshakeCompleteStrategy", sbI.toString());
                    i2.d("AbstractHandshakeCompleteStrategy", "handleHandshakeCompleted: Refresh device service cache [success = " + ((l80.b) KoinJavaComponent.get(l80.b.class)).v(dVar.f()) + "] for " + dVar.getF172496d() + ", unitID [" + dVar.getF172494b() + "], macAddress [" + dVar.f() + "]");
                }
            }
        }
        e(this.f26815c);
        k();
        if (!g(2)) {
            if (zb0.u0.n(String.valueOf(this.f26815c.getF172495c()), zb0.u0.f203813t)) {
                n();
            } else {
                m();
            }
        }
        long jC = c();
        long f172494b2 = this.f26815c.getF172494b();
        l80.a aVar = this.f26817e;
        boolean zJ = aVar.j(f172494b2);
        ImmutableList immutableListL = aVar.L();
        if (km2.a.i(jC, immutableListL, SupportedCapability.LIVETRACK_AUTO_START.ordinal()) && km2.a.i(jC, immutableListL, SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal()) && this.f26815c != null) {
            i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveLiveTrackAutoStartPermission(" + zJ + ")");
            rd2.h.d().getClass();
            rd2.h.g(jC, 4, zJ);
        }
        sm2.g.d(dVar);
        bd0.h0 h0Var = this.f26816d;
        if (h0Var != null) {
            h0Var.Y();
        }
    }

    public void e(bm2.d dVar) {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "handshakeCompletedSaveDeviceToLocalDB");
        this.f26815c = dVar;
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(String.valueOf(dVar.getF172495c()));
        String str = u0Var != null ? u0Var.f203858e : null;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f26814b;
        String applicationKey = lVar != null ? lVar.getApplicationKey() : null;
        dm2.f fVarN = dm2.f.N();
        Context context = this.f26813a;
        bm2.d dVar2 = this.f26815c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26817e.getClass();
        fVarN.O(null, context, dVar2, applicationKey, jCurrentTimeMillis, 11657, null, str, null, null, null, false);
    }

    public final boolean f(int i14) {
        rd2.h hVarD = rd2.h.d();
        long jC = c();
        hVarD.getClass();
        return rd2.h.e(i14, jC);
    }

    public final boolean g(int i14) {
        rd2.h hVarD = rd2.h.d();
        long jC = c();
        hVarD.getClass();
        return rd2.h.f(i14, jC) != -1;
    }

    public void i() {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "requestSync");
        p.b(this.f26815c, "AbstractHandshakeCompleteStrategy");
    }

    public final void j() {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveAutoUploadPermissionAsOff");
        new Thread(new a0.a((Object) this, false, 4)).start();
    }

    public void k() {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveAutoUploadPermissionAsOn");
        new Thread(new a0.a((Object) this, true, 4)).start();
    }

    public final void l(boolean z14) {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveWeatherPermission(" + z14 + ")");
        rd2.h hVarD = rd2.h.d();
        long jC = c();
        hVarD.getClass();
        rd2.h.g(jC, 2, z14);
    }

    public void m() {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveWeatherPermissionAsOff");
        l(false);
    }

    public final void n() {
        i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveWeatherPermissionAsOn");
        l(true);
    }
}
