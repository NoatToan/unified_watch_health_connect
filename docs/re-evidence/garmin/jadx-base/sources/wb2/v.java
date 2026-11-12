package wb2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import i3.e5;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v extends Observable implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f184159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f184161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f184162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<b> f184163e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<String, t0> f184164f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Vector<String> f184165g = new Vector<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f184166h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f184167i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f184168j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f184169k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f184170l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference<c> f184171m = new AtomicReference<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f184172n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f184173o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f184174p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f184175q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DeviceProfile f184176r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wb2.b f184177t = new wb2.b();

    public enum a {
        AUTO_UPLOAD_FALSE("The Auto Upload option is set to FALSE for this remote device"),
        /* JADX INFO: Fake field, exist only in values array */
        NO_SERVER_ENDPOINTS("Unable to get the server endpoints for this remote device"),
        NO_SUPPORTED_ITEM_UPLOADABLE("No supported items by this remote device is uploadable"),
        INVALID_DOWNLOAD_BIT_MASK("Invalid download bit mask"),
        NO_DOWNLOADABLE_ITEM_FOUND("No downloadable items found for the supplied bit mask"),
        NO_FAILURE_INFO_AVAILABLE("No failure information available"),
        NO_ITEM_TO_PROCESS("No item to process"),
        REMOTE_DEVICE_NOT_AVAILABLE("Software update interrupted to have normal sync"),
        REMOTE_DEVICE_DISCONNECTED("Remote device disconnected"),
        UNABLE_TO_COMPLETE_OPERATION("Unable to complete operation"),
        /* JADX INFO: Fake field, exist only in values array */
        UNABLE_TO_COMPLETE_OPERATION_2("Unable to complete operation for device %d"),
        INVALID_USER_CREDENTIAL("Invalid user credential"),
        TIMED_OUT_WAITING_FOR_RESPONSE("Timed out waiting for response"),
        SYNC_CANCELLED("Sync cancelled"),
        ERROR_PRIOR_TO_EXECUTE("ERROR PRIOR TO EXECUTE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f184192a;

        a(String str) {
            this.f184192a = str;
        }
    }

    public enum b {
        PREPARING,
        PREPARED,
        EXECUTING,
        EXECUTED
    }

    public enum c {
        SUCCESSFUL,
        SUCCESSFUL_NOTHING_TO_DO,
        FAILED_SERVER_EXCEPTION,
        FAILED_REMOTE_DEVICE_EXCEPTION,
        FAILED_INTERNAL_EXCEPTION,
        FAILED_SYNC_CANCELLED
    }

    public v(Context context, String str, g0 g0Var) {
        this.f184160b = str;
        this.f184161c = context;
        String strR = r();
        int i14 = gt2.c.f79010a;
        this.f184159a = gt2.b.f79005a.i(strR);
        this.f184162d = g0Var;
    }

    public static boolean B(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static void J(Bundle bundle, boolean z14, h hVar) {
        if (bundle.getInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", 0) != 1) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", !z14 ? 1 : 0);
            if (hVar != null) {
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", hVar.name());
            }
        }
    }

    public static String e(String str, String str2) {
        if (str != null) {
            return str2 != null ? e5.g(str, ": ", str2) : str;
        }
        return str2 != null ? str2 : a.NO_FAILURE_INFO_AVAILABLE.f184192a;
    }

    public static Throwable n(Exception exc) {
        boolean z14 = false;
        Exception cause = exc;
        Throwable th3 = exc;
        while (true) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                return th3;
            }
            if (cause2 == cause) {
                n23.j.w("Loop in causal chain detected.", cause2);
                return null;
            }
            if (z14) {
                cause = cause.getCause();
            }
            z14 = !z14;
            th3 = cause2;
            cause = cause;
        }
    }

    public void A(DeviceProfile deviceProfile) {
        S();
        synchronized (this) {
            this.f184176r = deviceProfile;
        }
    }

    public final boolean C() {
        return this.f184171m.get() == c.FAILED_SYNC_CANCELLED;
    }

    public final boolean D() {
        c cVar = this.f184171m.get();
        return cVar == c.FAILED_INTERNAL_EXCEPTION || cVar == c.FAILED_REMOTE_DEVICE_EXCEPTION || cVar == c.FAILED_SERVER_EXCEPTION || cVar == c.FAILED_SYNC_CANCELLED;
    }

    public boolean E() {
        return this.f184163e.get() == b.EXECUTED;
    }

    public final boolean F() {
        b bVar = this.f184163e.get();
        return bVar == b.PREPARING || bVar == b.PREPARED || bVar == b.EXECUTING;
    }

    public final boolean G() {
        return this.f184171m.get() == c.SUCCESSFUL_NOTHING_TO_DO;
    }

    public final boolean H() {
        return this.f184163e != null;
    }

    public final boolean I() {
        return this.f184171m.get() == c.SUCCESSFUL;
    }

    public final synchronized void K(c cVar, h hVar, String str, String str2, String str3) {
        try {
            Q(cVar);
            this.f184172n = hVar;
            this.f184173o = str;
            this.f184174p = str2;
            this.f184175q = str3;
            ArrayList arrayList = new ArrayList();
            if (this.f184165g.size() > 1) {
                for (int i14 = 1; i14 < this.f184165g.size(); i14++) {
                    t0 t0Var = this.f184164f.get(this.f184165g.elementAt(i14));
                    if (t0Var != null) {
                        arrayList.add(!TextUtils.isEmpty(t0Var.f184151k) ? t0Var.f184151k : Long.toString(t0Var.f184152l));
                    }
                }
            }
            this.f184177t.e(e(this.f184173o, this.f184174p), arrayList);
            d();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void L(Exception exc, String str) {
        Throwable thN = n(exc);
        String simpleName = thN.getClass().getSimpleName();
        StringWriter stringWriter = new StringWriter();
        thN.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        StringBuilder sbI = sn.a.i(str, ":");
        sbI.append(exc.getMessage());
        K(c.FAILED_INTERNAL_EXCEPTION, h.INTERNAL_EXCEPTION, simpleName, sbI.toString(), string);
        w(simpleName);
    }

    public final void M() {
        if (F()) {
            K(c.FAILED_REMOTE_DEVICE_EXCEPTION, h.REMOTE_DEVICE_EXCEPTION, a.UNABLE_TO_COMPLETE_OPERATION.f184192a, a.REMOTE_DEVICE_DISCONNECTED.f184192a, null);
            u();
            P(b.EXECUTED);
        }
    }

    public final void N(h hVar, Exception exc) {
        Throwable thN = n(exc);
        String simpleName = thN.getClass().getSimpleName();
        StringWriter stringWriter = new StringWriter();
        thN.printStackTrace(new PrintWriter(stringWriter));
        O(hVar, simpleName, "download:" + exc.getMessage(), stringWriter.toString());
    }

    public final void O(h hVar, String str, String str2, String str3) {
        K(c.FAILED_SERVER_EXCEPTION, hVar, str, str2, str3);
        this.f184159a.error("processServerException: " + hVar + StringUtils.SPACE + str + StringUtils.SPACE + str2 + "\n" + str3);
        w(str);
    }

    public final void P(b bVar) {
        this.f184163e.set(bVar);
    }

    public final void Q(c cVar) {
        this.f184171m.set(cVar);
    }

    public final synchronized void R(int i14) {
        this.f184169k = i14;
    }

    public final synchronized void S() {
        P(null);
        this.f184166h = -1L;
        this.f184167i = -1L;
        this.f184168j = -1L;
        this.f184169k = -1;
        this.f184170l = -1;
        Q(null);
        this.f184172n = null;
        this.f184173o = null;
        this.f184174p = null;
        this.f184175q = null;
        this.f184176r = null;
        x();
    }

    public final void T() {
        r();
        this.f184159a.debug("terminate: begin");
        synchronized (this) {
            S();
            this.f184165g.clear();
            this.f184164f.clear();
        }
        this.f184159a.debug("terminate: end");
    }

    @Override // wb2.f0
    public void cancel() {
        boolean zF = F();
        Logger logger = this.f184159a;
        if (!zF) {
            P(null);
            logger.debug("processCancellation: isSyncInProgress=false, setCurrentState(null)");
            return;
        }
        logger.debug("processCancellation: isSyncInProgress=true");
        K(c.FAILED_SYNC_CANCELLED, h.SYNC_CANCELLED, a.UNABLE_TO_COMPLETE_OPERATION.f184192a, a.SYNC_CANCELLED.f184192a, null);
        v();
    }

    public final void d() {
        ConcurrentHashMap<String, t0> concurrentHashMap;
        Vector<String> vector = this.f184165g;
        Iterator<String> it = vector.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = this.f184164f;
            if (!zHasNext) {
                break;
            } else {
                concurrentHashMap.remove(it.next());
            }
        }
        vector.clear();
        HashSet<String> hashSet = new HashSet();
        if (concurrentHashMap.size() > 0) {
            hashSet.addAll(concurrentHashMap.keySet());
        }
        for (String str : hashSet) {
            t0 t0Var = concurrentHashMap.get(str);
            if (t0Var != null && !t0Var.f184150j) {
                concurrentHashMap.remove(str);
            }
        }
    }

    public final synchronized int f() {
        return this.f184170l;
    }

    public final synchronized long g() {
        return this.f184167i;
    }

    public final t0 h() {
        String strFirstElement;
        Vector<String> vector = this.f184165g;
        if (vector.isEmpty() || (strFirstElement = vector.firstElement()) == null) {
            return null;
        }
        return this.f184164f.get(strFirstElement);
    }

    public final String i() {
        return m() != null ? m().getDeviceFullName() : String.valueOf(j());
    }

    public final long j() {
        if (m() != null) {
            return m().getF92746j();
        }
        return -1L;
    }

    public final String k() {
        DeviceProfile deviceProfileM = m();
        if (deviceProfileM != null) {
            return String.format(Locale.ENGLISH, "[device information] unit id: %1$d, product number: %2$d, software version: %3$d, device name: %4$s", Long.valueOf(deviceProfileM.getF92746j()), Integer.valueOf(deviceProfileM.getF92744h()), Integer.valueOf(deviceProfileM.getF92745i()), deviceProfileM.getDeviceFullName());
        }
        return null;
    }

    public final String l() {
        if (m() != null) {
            return m().getMacAddress();
        }
        return null;
    }

    public final synchronized DeviceProfile m() {
        return this.f184176r;
    }

    public final String o() {
        String str = this.f184174p;
        return str != null ? str : a.NO_FAILURE_INFO_AVAILABLE.f184192a;
    }

    public final String p() {
        String str = this.f184175q;
        if (str == null) {
            return null;
        }
        int length = str.length();
        String str2 = this.f184175q;
        return length > 3000 ? str2.substring(0, 2997).concat("...") : str2;
    }

    public final String q() {
        String str = this.f184173o;
        return str != null ? str : a.NO_FAILURE_INFO_AVAILABLE.f184192a;
    }

    public final String r() {
        return h0.b(j(), this.f184160b, null);
    }

    public final synchronized int s() {
        return this.f184169k;
    }

    public final synchronized long t() {
        return this.f184166h;
    }

    public void u() {
    }

    public void v() {
    }

    public abstract void w(String str);

    public void x() {
    }

    public final synchronized void y(long j8) {
        this.f184166h += j8;
    }

    public final synchronized void z() {
        this.f184166h = 0L;
        this.f184167i = 0L;
        this.f184168j = 0L;
        this.f184169k = 0;
        this.f184170l = 0;
        Q(null);
        this.f184172n = null;
        this.f184173o = null;
        this.f184174p = null;
        this.f184175q = null;
    }
}
