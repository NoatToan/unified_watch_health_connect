package yr1;

import android.os.Handler;
import android.text.TextUtils;
import androidx.room.a0;
import c22.u1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import p1.z;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f199070e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z<Long> f199071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z<Runnable> f199072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z<Boolean> f199073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f199074d;

    public class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            long f92746j = bVar.f111632a.getF92746j();
            c.this.f199071a.f(f92746j, Long.valueOf(System.currentTimeMillis() + 15000));
            i2.a(a2.SYNC, "DeviceSyncController", "Received onDeviceConnected unitId " + f92746j);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            long f92746j = hVar.f111673a.getF92746j();
            i2.a(a2.SYNC, "DeviceSyncController", "Received onDeviceDisconnected unitId " + f92746j);
            c cVar = c.this;
            cVar.f199071a.g(f92746j);
            cVar.f199073c.g(f92746j);
            z<Runnable> zVar = cVar.f199072b;
            Runnable runnableB = zVar.b(f92746j);
            if (runnableB != null) {
                cVar.f199074d.removeCallbacks(runnableB);
            }
            zVar.g(f92746j);
        }
    }

    public class b extends wf0.a {
        public b() {
        }

        @Override // wf0.a
        public final void deviceSyncFinished(pi2.i iVar) {
            long j8 = iVar.getEventData().getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID");
            c.this.f199073c.g(j8);
            i2.a(a2.SYNC, "DeviceSyncController", "Received deviceSyncFinished unitId " + j8);
        }

        @Override // wf0.a
        public final void deviceSyncStarted(pi2.j jVar) {
            long j8 = jVar.getEventData().getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID");
            try {
                c.this.f199073c.f(j8, Boolean.valueOf(wb2.j.valueOf(jVar.getEventData().getString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY")) == wb2.j.INVISIBLE));
                i2.a(a2.SYNC, "DeviceSyncController", "Received deviceSyncStarted unitId " + j8);
            } catch (Exception unused) {
                i2.h("Caught an error getting the ProgressVisibility value, ignoring unitId " + j8);
            }
        }

        @Override // wf0.a
        public final void deviceSyncTransferProgressUpdated(pi2.k kVar) {
            long j8 = kVar.getEventData().getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID");
            boolean z14 = kVar.getEventData().getBoolean("com.garmin.android.lib.connectdevicesync.EXTRA_PROCESSING_SOFTWARE_UPDATE");
            a2 a2Var = a2.SYNC;
            i2.a(a2Var, "DeviceSyncController", "Received deviceSyncTransferProgressUpdated unitId " + j8);
            if (z14) {
                c cVar = c.this;
                cVar.getClass();
                z<Runnable> zVar = cVar.f199072b;
                if (c.b(j8)) {
                    return;
                }
                cVar.f199071a.f(j8, Long.valueOf(System.currentTimeMillis()));
                Runnable runnableB = zVar.b(j8);
                if (runnableB != null) {
                    String strE = org.apache.commons.lang3.e.e(j8, "Cancelling delayed sync and syncing now unitId ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DeviceSyncController", strE);
                    cVar.f199074d.removeCallbacks(runnableB);
                    zVar.g(j8);
                    cVar.f199073c.g(j8);
                    cVar.c(j8, false);
                }
            }
        }
    }

    private c() {
        a aVar = new a();
        b bVar = new b();
        this.f199071a = new z<>();
        this.f199072b = new z<>();
        this.f199073c = new z<>();
        this.f199074d = new Handler();
        da2.d.b().f58886a.b(aVar);
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(bVar);
    }

    public static c a() {
        if (f199070e == null) {
            f199070e = new c();
        }
        return f199070e;
    }

    public static boolean b(long j8) {
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            return u0.g(fVarI.getProductNumber());
        }
        return false;
    }

    public final void c(long j8, boolean z14) {
        a2 a2Var = a2.SYNC;
        i2.a(a2Var, "DeviceSyncController", "syncNow  unitId " + j8 + " userInitiated " + z14);
        Boolean boolB = this.f199073c.b(j8);
        if ((boolB != null && boolB != Boolean.TRUE) || b(j8)) {
            String strF = a0.f(j8, "syncNow  unitId ", " Syncing but not a silent sync so bailing");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSyncController", strF);
            return;
        }
        if (z14 && km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, j8)) {
            String strF2 = a0.f(j8, "syncNow  unitId ", " Initiating syncNow request");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSyncController", strF2);
            e.e(null, j8, "DeviceSyncController");
            return;
        }
        String strF3 = a0.f(j8, "syncNow  unitId ", " Initiating foreground sync event");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSyncController", strF3);
        hk0.a aVarF = hk0.a.f();
        aVarF.getClass();
        String strA = u1.a(j8);
        if (TextUtils.isEmpty(strA)) {
            aVarF.c("setApplicationVisibility");
            return;
        }
        ea2.a aVar = (ea2.a) hk0.s.a().getCapability(strA, ea2.a.class);
        if (aVar != null) {
            aVar.setApplicationVisibility(true);
        }
    }
}
