package wb2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f183902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.b f183904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceProfile f183905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f183906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0 f183907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f183908g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f183909h = j.ALWAYS_SHOW_PROGRESS;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f183910i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f183911j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f183912k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f183913l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f183914m = new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES, new SynchronousQueue());

    /* JADX INFO: renamed from: wb2.a$a, reason: collision with other inner class name */
    public class RunnableC3410a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Observable f183915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f183916b;

        public RunnableC3410a(Observable observable, Object obj) {
            this.f183915a = observable;
            this.f183916b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.o(this.f183915a, this.f183916b);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183918a;

        static {
            int[] iArr = new int[y.b.values().length];
            f183918a = iArr;
            try {
                iArr[y.b.FULL_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183918a[y.b.DEFERRED_FILE_UPLOAD_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(y.b bVar, DeviceProfile deviceProfile, Context context, g0 g0Var) {
        this.f183904c = bVar;
        this.f183905d = deviceProfile;
        this.f183906e = context;
        this.f183907f = g0Var;
        int i14 = b.f183918a[bVar.ordinal()];
        if (i14 == 1) {
            this.f183903b = "FullSyncStrategy";
        } else if (i14 != 2) {
            this.f183903b = "DeviceSyncStrategy";
        } else {
            this.f183903b = "DeferredFileSyncStrategy";
        }
        String strL = l();
        int i15 = gt2.c.f79010a;
        this.f183902a = gt2.b.f79005a.i(strL);
    }

    public static String s(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= 100) {
            return str;
        }
        int iIndexOf = str.indexOf("Reason=");
        if (iIndexOf > 0) {
            try {
                String strSubstring = str.substring(iIndexOf);
                return str.substring(0, 100 - strSubstring.length()) + "... " + strSubstring;
            } catch (Throwable unused) {
            }
        }
        return str.substring(0, 100).concat("...");
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        bundle2.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", k());
        bundle2.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        if (h() != null) {
            bundle2.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", h().name());
        }
        bundle2.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_DEVICE_SYNC_FINISH_TIME", this.f183913l);
        String strL = l();
        Context context = this.f183906e;
        oa2.b.b(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED", strL, bundle2);
        r.f().getClass();
        if (r.f184103h.get()) {
            oa2.b.c(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED", l(), bundle2);
        } else {
            oa2.b.a(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED", l(), bundle2);
        }
    }

    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", k());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_BITMASK", g());
        if (h() != null) {
            bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", h().name());
        }
        String strL = l();
        Context context = this.f183906e;
        oa2.b.b(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED", strL, bundle);
        r.f().getClass();
        if (r.f184103h.get()) {
            oa2.b.c(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED", l(), bundle);
        } else {
            oa2.b.a(context, "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED", l(), bundle);
        }
    }

    public void c(Bundle bundle) {
        String str;
        xb2.a aVar = ec2.e.f63798f;
        if (!ec2.e.e() || aVar == null) {
            return;
        }
        String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", "");
        h hVar = h.DEFAULT;
        try {
            h hVarValueOf = h.valueOf(string);
            if (hVarValueOf != null) {
                hVar = hVarValueOf;
            }
        } catch (Exception unused) {
        }
        switch (f.f183992a[hVar.ordinal()]) {
            case 1:
            case 2:
                str = h.T;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = h.Y;
                break;
            default:
                str = h.X;
                break;
        }
        byte b14 = (byte) h().f184038a;
        k0 k0Var = new k0((b14 == ((byte) j.ALWAYS_SHOW_PROGRESS.f184038a) || b14 == ((byte) j.SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND.f184038a)) ? 2 : 1, g());
        if (this.f183905d != null) {
            long j8 = j();
            String deviceFullName = this.f183905d.getDeviceFullName();
            int f172497e = this.f183905d.getF172497e();
            int f172495c = this.f183905d.getF172495c();
            k0Var.f184047b = j8;
            k0Var.f184048c = deviceFullName;
            k0Var.f184049d = f172497e;
            k0Var.f184050e = f172495c;
        }
        aVar.a(k0Var, bundle);
        int i14 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS");
        if (i14 == 1) {
            String string2 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TYPE");
            String string3 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL");
            String string4 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TRACE");
            if (v.a.ERROR_PRIOR_TO_EXECUTE.name().equals(string2)) {
                if (!((n0) this.f183907f).h(k())) {
                    v.a.REMOTE_DEVICE_DISCONNECTED.name();
                }
            }
            k0Var.a(str, fb1.c.n("SYNC UPLOAD_", string), string3, string4);
        } else if (i14 == 2) {
            k0Var.a(str, fb1.c.n("SYNC UPLOAD_", string), "NOT_STARTED", "NOT_STARTED");
        }
        int i15 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS");
        if (i15 == 1) {
            String string5 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TYPE");
            String string6 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_DETAIL");
            String string7 = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TRACE");
            if (v.a.ERROR_PRIOR_TO_EXECUTE.name().equals(string5)) {
                if (!((n0) this.f183907f).h(k())) {
                    v.a.REMOTE_DEVICE_DISCONNECTED.name();
                }
            }
            k0Var.a(str, fb1.c.n("SYNC DOWNLOAD_", string), string6, string7);
        } else if (i15 == 2) {
            k0Var.a(str, fb1.c.n("SYNC DOWNLOAD_", string), "NOT_STARTED", "NOT_STARTED");
        }
        int i16 = bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_STATUS");
        if (i16 == 1) {
            bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_TYPE");
            k0Var.a(str, fb1.c.n("SYNC TIME_", string), bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_DETAIL"), bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_TRACE"));
        } else if (i16 == 2) {
            k0Var.a(str, fb1.c.n("SYNC TIME_", string), "NOT_STARTED", "NOT_STARTED");
        }
        aVar.c(k0Var, bundle);
        this.f183902a.debug("Analytic event:" + k0Var.f184048c + StringUtils.SPACE + k0Var.f184051f + " [" + k0Var.f184052g + "] [" + k0Var.f184053h + "] [" + k0Var.f184054i + "]");
        aVar.d(k0Var);
    }

    public abstract x d();

    public abstract Bundle e();

    public abstract a0 f();

    public long g() {
        return 0L;
    }

    public final j h() {
        j jVar = this.f183909h;
        return jVar != null ? jVar : j.ALWAYS_SHOW_PROGRESS;
    }

    public final String i() {
        DeviceProfile deviceProfile = this.f183905d;
        return deviceProfile != null ? deviceProfile.getDeviceFullName() : String.valueOf(j());
    }

    public final long j() {
        DeviceProfile deviceProfile = this.f183905d;
        if (deviceProfile != null) {
            return deviceProfile.getF172494b();
        }
        return -1L;
    }

    public final String k() {
        DeviceProfile deviceProfile = this.f183905d;
        if (deviceProfile != null) {
            return deviceProfile.getMacAddress();
        }
        return null;
    }

    public final String l() {
        return h0.b(j(), this.f183903b, null);
    }

    public abstract boolean m();

    public abstract void n(Intent intent);

    public abstract void o(Observable observable, Object obj);

    public abstract void p(long j8, j jVar, String str);

    public abstract void q(long j8, j jVar, String str, String str2);

    public final void r(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.f183914m;
        try {
            if (!threadPoolExecutor.isShutdown() && threadPoolExecutor.getActiveCount() != threadPoolExecutor.getMaximumPoolSize()) {
                threadPoolExecutor.submit(runnable);
                return;
            }
        } catch (RejectedExecutionException unused) {
        }
        new Thread(runnable, "SYNC_" + getClass().getSimpleName() + "_" + Long.toHexString(System.currentTimeMillis())).start();
    }

    public final void t() {
        try {
            c cVar = this.f183911j;
            if (cVar != null) {
                this.f183906e.unregisterReceiver(cVar);
                this.f183911j = null;
            }
        } catch (Exception e4) {
            this.f183902a.error("Unregister global broadcast receiver error: ", (Throwable) e4);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        r(new RunnableC3410a(observable, obj));
    }

    public final class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: wb2.a$c$a, reason: collision with other inner class name */
        public class RunnableC3411a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Intent f183920a;

            public RunnableC3411a(Intent intent) {
                this.f183920a = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.n(this.f183920a);
            }
        }

        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            DeviceProfile deviceProfile = (DeviceProfile) intent.getParcelableExtra("com.garmin.android.lib.connectdevicesync.EXTRA_SYNC_DEVICE_PROFILE");
            String macAddress = deviceProfile != null ? deviceProfile.getMacAddress() : intent.getStringExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
            if (macAddress != null) {
                a aVar = a.this;
                if (macAddress.equalsIgnoreCase(aVar.k())) {
                    aVar.r(new RunnableC3411a(intent));
                }
            }
        }

        public /* synthetic */ c(d0 d0Var) {
            this();
        }
    }
}
