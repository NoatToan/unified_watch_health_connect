package com.garmin.android.lib.connectdevicesync;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bc2.g;
import com.garmin.device.datatypes.DeviceProfile;
import da2.d;
import ec2.e;
import java.io.File;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;
import wb2.b0;
import wb2.g0;
import wb2.h0;
import wb2.j;
import wb2.k;
import wb2.n0;
import wb2.o;
import wb2.p;
import wb2.r;
import wb2.s;
import wb2.x;
import wb2.y;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceSyncService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f49910d = LoggerFactory.getLogger("SYNC#DeviceSyncService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f49911a = new HandlerThread("SYNC_SyncDispatchThread", 10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f49912b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f49913c = new a(this, 0);

    public static boolean a(DeviceSyncService deviceSyncService, int i14) {
        String[] packagesForUid = deviceSyncService.getApplicationContext().getPackageManager().getPackagesForUid(i14);
        if (packagesForUid == null) {
            h.q("PackageManager.getPackagesForUid should not return null here!");
            return false;
        }
        if (packagesForUid.length > 1) {
            h.z("Shared UID is not allowed!");
            return false;
        }
        boolean zEquals = deviceSyncService.getApplicationContext().getPackageName().equals(packagesForUid[0]);
        dc2.a aVarC = c();
        return zEquals || (aVarC != null && aVarC.h(i14));
    }

    public static g0 b() {
        g0 g0VarE = r.f().e();
        return g0VarE == null ? n0.g() : g0VarE;
    }

    public static dc2.a c() {
        if (e.e()) {
            return (dc2.a) e.b();
        }
        f49910d.warn("Attempting to getServiceConfig without initializing library");
        return null;
    }

    public static void d(long j8, long j14, Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            h.s("macAddress is empty");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) DeviceSyncService.class);
        intent.setAction("com.garmin.android.lib.sync.DeviceSyncService.ACTION_REQUEST_SYNC");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j8);
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", str);
        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_DOWNLOAD_BIT_MASK", j14);
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_SOFTWARE_UPDATE_MODE", "Normal");
        dc2.a aVarC = c();
        if (aVarC != null) {
            aVarC.f(context, intent);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f49913c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dc2.a aVarC;
        f49910d.info("Creating DeviceSyncService...");
        super.onCreate();
        this.f49911a.start();
        this.f49912b = new b(this, this.f49911a.getLooper(), 0);
        Context applicationContext = getApplicationContext();
        try {
            if (e.e() && (aVarC = c()) != null && d.c(applicationContext).f58887b == null) {
                aVarC.c(applicationContext);
            }
            g0 g0VarB = b();
            if (g0VarB != null) {
                ((n0) g0VarB).f184071a = getApplicationContext();
                if (r.f().e() == null) {
                    r rVarF = r.f();
                    rVarF.getClass();
                    r.f184099d.info("Updating gdi proxy " + g0VarB);
                    synchronized (r.f184100e) {
                        rVarF.f184106c = (n0) g0VarB;
                    }
                }
            }
        } catch (Exception e4) {
            f49910d.error("Failed to initialize gdi proxy", (Throwable) e4);
        }
        d.c(getApplicationContext()).f58886a.b(r.f());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f49910d.info("Destroying DeviceSyncService...");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        if (intent == null) {
            return 2;
        }
        this.f49912b.sendMessage(this.f49912b.obtainMessage(0, intent));
        return 2;
    }

    public final class a extends com.garmin.android.lib.connectdevicesync.a.AbstractBinderC0990a {

        /* JADX INFO: renamed from: com.garmin.android.lib.connectdevicesync.DeviceSyncService$a$a, reason: collision with other inner class name */
        public class C0989a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f49915a;

            public C0989a(a aVar, o oVar) {
                this.f49915a = oVar;
            }
        }

        private a() {
        }

        @Override // com.garmin.android.lib.connectdevicesync.a
        public final boolean A() {
            if (!DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid())) {
                return false;
            }
            Iterator<wb2.a> it = r.f().f184104a.f184213b.values().iterator();
            while (it.hasNext()) {
                if (it.next().m()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.garmin.android.lib.connectdevicesync.a
        public final boolean V(String str) {
            if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid())) {
                return r.f().i(str);
            }
            return false;
        }

        @Override // com.garmin.android.lib.connectdevicesync.a
        public final void i(o oVar) {
            if (oVar != null) {
                g.a(DeviceSyncService.this).f17444f = new C0989a(this, oVar);
            }
        }

        @Override // com.garmin.android.lib.connectdevicesync.a
        public final void terminate() {
            int callingUid = Binder.getCallingUid();
            DeviceSyncService deviceSyncService = DeviceSyncService.this;
            if (DeviceSyncService.a(deviceSyncService, callingUid)) {
                r.f().getClass();
                g gVarA = g.a(r.d());
                gVarA.f17442d.g();
                gVarA.f17441c.g();
                bc2.a aVar = gVarA.f17443e;
                if (aVar != null) {
                    aVar.b();
                }
                Context contextD = r.d();
                int i14 = b0.F;
                File file = new File(contextD.getFilesDir(), "/uploads");
                if (file.exists()) {
                    dz2.d.b(file);
                }
                b0.Y(contextD);
                Context contextD2 = r.d();
                int i15 = p.T;
                File file2 = new File(contextD2.getFilesDir(), "/downloads");
                if (file2.exists()) {
                    dz2.d.b(file2);
                }
                new File(contextD2.getFilesDir(), "/downloads").mkdirs();
                deviceSyncService.stopSelf();
            }
        }

        @Override // com.garmin.android.lib.connectdevicesync.a
        public final x z(String str) {
            wb2.a aVarB;
            if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid()) && (aVarB = r.f().f184104a.b(str)) != null) {
                return aVarB.d();
            }
            return null;
        }

        public /* synthetic */ a(DeviceSyncService deviceSyncService, int i14) {
            this();
        }
    }

    public class b extends Handler {
        private b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            long longExtra;
            String stringExtra;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            Intent intent = (Intent) obj;
            Logger logger = DeviceSyncService.f49910d;
            DeviceSyncService.this.getClass();
            Logger logger2 = DeviceSyncService.f49910d;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            DeviceProfile deviceProfile = (DeviceProfile) intent.getParcelableExtra("com.garmin.android.lib.connectdevicesync.EXTRA_SYNC_DEVICE_PROFILE");
            if (deviceProfile != null) {
                longExtra = deviceProfile.getF92746j();
                stringExtra = deviceProfile.getMacAddress();
            } else {
                longExtra = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L);
                stringExtra = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            }
            String str = stringExtra;
            long j8 = longExtra;
            if (j8 == -1) {
                logger2.error(h0.a(j8) + "Invalid remote device ID [" + j8 + "] for .processIntent(). Did you forget to set Gdi.Broadcasts.EXTRA_REMOTE_DEVICE_UNIT_ID in the intent?");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                logger2.error(h0.a(j8).concat("Empty mac address for .processIntent()."));
                return;
            }
            action.getClass();
            if (action.equals("com.garmin.android.lib.sync.DeviceSyncService.ACTION_REQUEST_SYNC")) {
                logger2.debug(h0.a(j8).concat("ACTION_REQUEST_SYNC!"));
                long longExtra2 = intent.getLongExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_DOWNLOAD_BIT_MASK", -1L);
                if (longExtra2 <= -1) {
                    longExtra2 = ((n0) DeviceSyncService.b()).f(str);
                }
                long j14 = longExtra2;
                j jVarA = j.a(intent.getStringExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_PROGRESS_VISIBILITY_POLICY"), j.ALWAYS_SHOW_PROGRESS);
                String stringExtra2 = intent.getStringExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_SYNC_REQUEST_ORIGIN");
                if (stringExtra2 == null) {
                    stringExtra2 = "REQUEST_SYNC";
                }
                String str2 = stringExtra2;
                String stringExtra3 = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.EXTRA_SOFTWARE_UPDATE_MODE");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getBooleanExtra("com.garmin.android.lib.connectdevicesync.EXTRA_SUPPRESS_SOFTWARE_DOWNLOAD", false) ? "Block" : "Normal";
                }
                r.f().h(DeviceSyncService.b(), j8, str, j14, jVarA, str2, stringExtra3);
                return;
            }
            if (!action.equals("com.garmin.android.lib.sync.DeviceSyncService.ACTION_REQUEST_REAL_TIME_SYNC_UPLOAD")) {
                logger2.error(h0.a(j8) + "Fix me developer! Action [" + action + "] not being handled in .processIntent()");
                return;
            }
            logger2.debug(h0.a(j8).concat("ACTION_REQUEST_REAL_TIME_SYNC_UPLOAD!"));
            String stringExtra4 = intent.getStringExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DIR");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_NAMES");
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DATA_TYPES");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DATA_SUB_TYPES");
            j jVarA2 = j.a(intent.getStringExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_PROGRESS_VISIBILITY_POLICY"), j.ALWAYS_SHOW_PROGRESS);
            r rVarF = r.f();
            g0 g0VarB = DeviceSyncService.b();
            rVarF.getClass();
            n0 n0Var = (n0) g0VarB;
            DeviceProfile deviceProfileE = n0Var.e(str);
            ch.qos.logback.classic.Logger logger3 = r.f184099d;
            if (!((il2.e) e.b()).p()) {
                logger3.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Invalid user token.");
                rVarF.c(j8, deviceProfileE.getMacAddress(), k.DENIED_INVALID_USER_CREDENTIAL.name());
                return;
            }
            if (deviceProfileE == null) {
                logger3.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Remote device not connected.");
                rVarF.c(j8, deviceProfileE.getMacAddress(), k.DENIED_DEVICE_NOT_CONNECTED.name());
                return;
            }
            if (!n0Var.h(deviceProfileE.getMacAddress())) {
                logger3.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Handshake is not completed.");
                rVarF.c(j8, deviceProfileE.getMacAddress(), k.DENIED_DEVICE_HANDSHAKE_NOT_COMPLETED.name());
                return;
            }
            if (hy2.b.a(((il2.e) e.b()).n())) {
                wb2.a aVarG = rVarF.g(y.b.DEFERRED_FILE_UPLOAD_SYNC, deviceProfileE, n0Var);
                if (aVarG.m()) {
                    rVarF.c(j8, str, k.DENIED_SYNC_CURRENTLY_IN_PROGRESS.name());
                    return;
                } else {
                    rVarF.j(new s(rVarF, aVarG, stringExtra4, stringArrayExtra, byteArrayExtra, byteArrayExtra2, jVarA2, "REQUEST_REAL_TIME_SYNC_UPLOAD", j8));
                    return;
                }
            }
            logger3.warn(h0.a(j8) + "Unable to execute sync request for device [" + j8 + "]: Sync Service is not available");
        }

        public /* synthetic */ b(DeviceSyncService deviceSyncService, Looper looper, int i14) {
            this(looper);
        }
    }
}
