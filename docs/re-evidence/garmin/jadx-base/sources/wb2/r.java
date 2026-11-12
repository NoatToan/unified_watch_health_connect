package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class r implements vs2.e, la2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f184099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f184100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f184101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static r f184102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f184103h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f184104a = y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f184105b = new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES, new SynchronousQueue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f184106c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb2.a f184107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f184108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f184109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f184110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f184111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f184112f;

        public a(wb2.a aVar, long j8, long j14, j jVar, String str, String str2) {
            this.f184107a = aVar;
            this.f184108b = j8;
            this.f184109c = j14;
            this.f184110d = jVar;
            this.f184111e = str;
            this.f184112f = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f184107a.q(r.b(r.this, this.f184108b, this.f184109c), this.f184110d, this.f184111e, this.f184112f);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f184099d = gt2.b.f79005a.i("SYNC#DeviceSyncManager");
        f184100e = new byte[0];
        f184101f = new byte[0];
        f184103h = new AtomicBoolean(true);
    }

    private r() {
    }

    public static long b(r rVar, long j8, long j14) {
        rVar.getClass();
        Long lB = ((il2.e) ec2.e.b()).f94040b.b(j8);
        if (lB == null || lB.longValue() <= -1) {
            return j14;
        }
        long jLongValue = lB.longValue() & j14;
        if (jLongValue != j14) {
            StringBuilder sbK = ds.e0.k(j14, "filterDownloadBitMask original=", ", filtered=");
            sbK.append(jLongValue);
            f184099d.debug(sbK.toString());
        }
        return jLongValue;
    }

    public static Context d() {
        return ((il2.e) ec2.e.b()).m();
    }

    public static r f() {
        r rVar;
        synchronized (f184101f) {
            try {
                if (f184102g == null) {
                    f184102g = new r();
                }
                rVar = f184102g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return rVar;
    }

    @Override // vs2.e
    public final void a(rs2.c cVar, vs2.j jVar, Set<Integer> set, ws2.c cVar2) {
        String str;
        long f172494b = cVar.getF172494b();
        String f172493a = cVar.getF172493a();
        Logger logger = f184099d;
        if (f172494b == -1) {
            logger.error(h0.a(f172494b) + "Invalid remote device ID [" + f172494b + "] for .processIntent(). Did you forget to set Gdi.Broadcasts.EXTRA_REMOTE_DEVICE_UNIT_ID in the intent?");
            return;
        }
        if (TextUtils.isEmpty(f172493a)) {
            logger.error(h0.a(f172494b).concat("Empty mac address for .processIntent()."));
            return;
        }
        Iterator<Integer> it = set.iterator();
        long jIntValue = 0;
        while (it.hasNext()) {
            jIntValue |= 1 << it.next().intValue();
        }
        if (cVar2 == null) {
            logger.debug(h0.a(f172494b).concat("ACTION_ON_SYNC_REQUEST_MESSAGE_RECEIVED!"));
            j jVar2 = j.ALWAYS_SHOW_PROGRESS;
            if (vs2.j.MANUAL == jVar) {
                str = "5037_SYNC_REQUEST_MESSAGE__MANUAL";
            } else if (vs2.j.INVISIBLE == jVar) {
                jVar2 = j.INVISIBLE;
                str = "5037_SYNC_REQUEST_MESSAGE__INVISIBLE";
            } else if (vs2.j.VISIBLE_AS_NEEDED == jVar) {
                jVar2 = j.SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND;
                str = "5037_SYNC_REQUEST_MESSAGE__VISIBLE_IF_FILES";
            } else {
                str = null;
            }
            j jVar3 = jVar2;
            String str2 = str;
            n0 n0VarG = this.f184106c;
            if (n0VarG == null) {
                n0VarG = n0.g();
            }
            f().h(n0VarG, f172494b, f172493a, jIntValue, jVar3, str2, "Normal");
            return;
        }
        logger.debug(h0.a(f172494b).concat("ACTION_FILE_READY!"));
        Bundle bundle = new Bundle();
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_ITEM_ID", Integer.toString(cVar2.f186963a));
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_SIZE", cVar2.f186967e);
        bundle.putByte("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_TYPE", (byte) cVar2.f186964b);
        bundle.putByte("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_SUB_TYPE", (byte) cVar2.f186969g);
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_BIT_MASK", jIntValue);
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.ACTION_FILE_READY");
        intent.putExtras(bundle);
        n0 n0VarG2 = this.f184106c;
        if (n0VarG2 == null) {
            n0VarG2 = n0.g();
        }
        r rVarF = f();
        rVarF.getClass();
        DeviceProfile deviceProfileE = n0VarG2.e(f172493a);
        if (!rVarF.l(n0VarG2, f172494b, deviceProfileE) || !rVarF.k(f172494b, f172493a)) {
            n0VarG2.k(da2.j.FINISHED_WITH_FAILURE, f172493a);
        } else {
            wb2.a aVarG = rVarF.g(y.b.FULL_SYNC, deviceProfileE, n0VarG2);
            rVarF.j(!aVarG.m() ? new t(rVarF, aVarG, f172494b, jIntValue) : new u(rVarF, aVarG, intent));
        }
    }

    public final void c(long j8, String str, String str2) {
        f184099d.debug(h0.a(j8) + "broadcastSyncRequestDenied " + str2);
        Bundle bundle = new Bundle();
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j8);
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", str);
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_SYNC_REQUEST_STATUS", str2);
        if (((n0) e()).f(str) == 256) {
            bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", j.INVISIBLE.name());
        }
        f().getClass();
        if (f184103h.get()) {
            oa2.b.e(d(), "com.garmin.android.lib.connectdevicesync.ACTION_SYNC_REQUEST_DENIED", androidx.room.a0.f(j8, "SYNC#DeviceSyncManager[", "]"), null, bundle);
        } else {
            oa2.b.a(d(), "com.garmin.android.lib.connectdevicesync.ACTION_SYNC_REQUEST_DENIED", androidx.room.a0.f(j8, "SYNC#DeviceSyncManager[", "]"), bundle);
        }
    }

    public final g0 e() {
        synchronized (f184100e) {
            try {
                n0 n0Var = this.f184106c;
                if (n0Var != null) {
                    return n0Var;
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final wb2.a g(y.b bVar, DeviceProfile deviceProfile, g0 g0Var) {
        boolean zA = hy2.b.a(((il2.e) ec2.e.b()).n());
        y yVar = this.f184104a;
        Logger logger = f184099d;
        if (!zA) {
            logger.info("SYNC Service is not available");
            logger.debug(h0.a(deviceProfile.getF172494b()).concat("Creating new TimeSyncStrategy"));
            return yVar.c(y.b.TIME_SYNC, deviceProfile, d(), g0Var);
        }
        wb2.a aVarB = yVar.b(deviceProfile.getMacAddress());
        if (aVarB == null || aVarB.f183908g.get() || aVarB.f183904c != bVar) {
            wb2.a aVarC = yVar.c(bVar, deviceProfile, d(), g0Var);
            logger.debug(h0.a(deviceProfile.getF172494b()) + "Creating newStrategy=" + aVarC);
            return aVarC;
        }
        logger.debug(h0.a(deviceProfile.getF172494b()) + "Reusing currentStrategy=" + aVarB);
        aVarB.f183905d = deviceProfile;
        aVarB.f183907f = g0Var;
        return aVarB;
    }

    public final boolean h(g0 g0Var, long j8, String str, long j14, j jVar, String str2, String str3) {
        n0 n0Var = (n0) g0Var;
        DeviceProfile deviceProfileE = n0Var.e(str);
        if (!l(n0Var, j8, deviceProfileE)) {
            return false;
        }
        if (!k(j8, str)) {
            n0Var.k(da2.j.FINISHED_WITH_FAILURE, str);
            return false;
        }
        wb2.a aVarG = g(y.b.FULL_SYNC, deviceProfileE, n0Var);
        if (aVarG.m()) {
            c(j8, str, k.DENIED_SYNC_CURRENTLY_IN_PROGRESS.name());
            return false;
        }
        j(new a(aVarG, j8, j14, jVar, str2, str3));
        return true;
    }

    public final boolean i(String str) {
        wb2.a aVarB = this.f184104a.b(str);
        return aVarB != null && aVarB.m();
    }

    public final void j(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.f184105b;
        try {
            if (!threadPoolExecutor.isShutdown() && threadPoolExecutor.getActiveCount() != threadPoolExecutor.getMaximumPoolSize()) {
                threadPoolExecutor.submit(runnable);
                return;
            }
        } catch (RejectedExecutionException unused) {
        }
        new Thread(runnable, "SYNC_" + getClass().getSimpleName() + "_" + Long.toHexString(System.currentTimeMillis())).start();
    }

    public final boolean k(long j8, String str) {
        if (hb2.i.a(d())) {
            return true;
        }
        f184099d.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: No internet connectivity.");
        c(j8, str, k.DENIED_NO_INTERNET_CONNECTIVITY.name());
        return false;
    }

    public final boolean l(g0 g0Var, long j8, DeviceProfile deviceProfile) {
        boolean zE = ec2.e.e();
        Logger logger = f184099d;
        if (!zE) {
            logger.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: App has not initialized sync library.");
            return false;
        }
        if (!((il2.e) ec2.e.b()).p()) {
            logger.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Invalid user token.");
            c(j8, deviceProfile.getMacAddress(), k.DENIED_INVALID_USER_CREDENTIAL.name());
            return false;
        }
        if (deviceProfile == null) {
            logger.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Remote device not connected.");
            c(j8, null, k.DENIED_DEVICE_NOT_CONNECTED.name());
            return false;
        }
        if (!((n0) g0Var).h(deviceProfile.getMacAddress())) {
            logger.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Handshake is not completed.");
            c(j8, deviceProfile.getMacAddress(), k.DENIED_DEVICE_HANDSHAKE_NOT_COMPLETED.name());
            return false;
        }
        if (!((il2.e) ec2.e.b()).f94040b.g(j8, deviceProfile.getMacAddress())) {
            return true;
        }
        logger.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: App will do sync.");
        c(j8, deviceProfile.getMacAddress(), k.DENIED_APP_WILL_HANDLE_SYNC.name());
        return false;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        DeviceProfile deviceProfile = hVar.f111673a;
        f184099d.debug(h0.a(deviceProfile.getF172494b()).concat("ACTION_DEVICE_DISCONNECTED!"));
        r rVarF = f();
        rVarF.f184104a.f184213b.remove(deviceProfile.getMacAddress());
    }
}
