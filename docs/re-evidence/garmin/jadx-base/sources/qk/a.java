package qk;

import android.os.Environment;
import i3.e5;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import jk.j;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable<Long, C2735a[]> f145057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static FileHandler f145058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static FileHandler f145059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f145060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f145061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f145062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f145063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f145064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Hashtable<Object, Integer> f145065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j.g[] f145066j;

    /* JADX INFO: renamed from: qk.a$a, reason: collision with other inner class name */
    public static class C2735a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f145067a;

        public C2735a(Object obj, long j8, int i14) {
            this.f145067a = obj;
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        MISSED_LINK_BEACONS,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECTION_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        LINK_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        AUTH_PAIRING_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        AUTH_PASSTHROUGH_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        AUTH_SERIAL_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        AUTH_PASSKEY_RETRY,
        /* JADX INFO: Fake field, exist only in values array */
        DOWNLOAD_RETRY,
        UPLOAD_RETRY,
        NUMBER_OF_RETRY_BINS
    }

    static {
        new Hashtable();
        f145057a = new Hashtable<>();
        new SimpleDateFormat("kk:mm:ss.SSS", Locale.US);
        f145060d = Environment.getExternalStorageDirectory() + "/Log.txt";
        f145061e = Environment.getExternalStorageDirectory() + "/retries.txt";
        f145062f = Boolean.FALSE;
        int i14 = 0;
        f145063g = false;
        f145064h = Logger.getLogger(a.class.getName());
        f145065i = new Hashtable<>();
        f145066j = new j.g[]{j.g.CONNECTION_REQUESTED, j.g.LINK_START, j.g.LINK_PASS, j.g.AUTHENTICATION_START, j.g.AUTHENTICATE_PASS, j.g.AUTHENTICATE_REJECT, j.g.AUTHENTICATE_REJECT_BAD_PASSKEY, j.g.AUTHENTICATE_FAIL_NO_RESPONSE, j.g.AUTHENTICATE_FAIL_BAD_RESPONSE, j.g.UPLOAD_START, j.g.UPLOAD_FINISHED, j.g.DOWNLOAD_START, j.g.DOWNLOAD_FINISHED, j.g.DISCONNECT_REQUESTED, j.g.DISCONNECT_PASS, j.g.CONNECTION_LOST, j.g.TASK_INTERRUPTED, j.g.TASK_CRASH, j.g.TASK_TIMEOUT};
        while (true) {
            j.g[] gVarArr = f145066j;
            if (i14 >= gVarArr.length) {
                return;
            }
            j.g gVar = gVarArr[i14];
            if (gVar != null) {
                f145065i.put(gVar, Integer.valueOf(i14));
            }
            i14++;
        }
    }

    public static void a(Long l14, b bVar) {
        synchronized (f145062f) {
            try {
                if (f145063g) {
                    return;
                }
                if (!f145062f.booleanValue()) {
                    b();
                }
                Hashtable<Long, C2735a[]> hashtable = f145057a;
                synchronized (hashtable) {
                    try {
                        if (hashtable.containsKey(l14)) {
                            C2735a[] c2735aArr = hashtable.get(l14);
                            int iOrdinal = bVar.ordinal();
                            if (c2735aArr[iOrdinal] == null) {
                                c2735aArr[iOrdinal] = new C2735a(bVar, 1L, Integer.MIN_VALUE);
                            }
                        } else {
                            C2735a[] c2735aArr2 = new C2735a[b.NUMBER_OF_RETRY_BINS.ordinal()];
                            c2735aArr2[bVar.ordinal()] = new C2735a(bVar, 1L, Integer.MIN_VALUE);
                            hashtable.put(l14, c2735aArr2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void b() {
        j.g[] gVarArr;
        synchronized (f145062f) {
            try {
                if (f145062f.booleanValue()) {
                    return;
                }
                Logger logger = Logger.getLogger(a.class.getName());
                try {
                    f145058b = new FileHandler(f145060d, false);
                    f145059c = new FileHandler(f145061e, false);
                    FileHandler fileHandler = f145058b;
                    Level level = Level.INFO;
                    fileHandler.setFormatter(new c(level));
                    logger.addHandler(f145058b);
                    logger.setLevel(level);
                    f145059c.setFormatter(new c(Level.WARNING));
                    logger.addHandler(f145059c);
                    Logger logger2 = f145064h;
                    StringBuilder sbK = e5.k("DEVICE_ID,");
                    int i14 = 0;
                    while (true) {
                        gVarArr = f145066j;
                        if (i14 >= gVarArr.length) {
                            break;
                        }
                        sbK.append(gVarArr[i14].toString());
                        sbK.append(",RSSI,");
                        i14++;
                    }
                    if (gVarArr.length > 0) {
                        sbK.deleteCharAt(sbK.lastIndexOf(","));
                    }
                    logger2.info(sbK.toString());
                    StringBuilder sbK2 = e5.k("DEVICE_ID,");
                    for (b bVar : b.values()) {
                        if (!bVar.equals(b.NUMBER_OF_RETRY_BINS)) {
                            sbK2.append(bVar);
                            sbK2.append(",");
                        }
                    }
                    sbK2.deleteCharAt(sbK2.lastIndexOf(","));
                    logger2.warning(sbK2.toString());
                    f145062f = Boolean.TRUE;
                } catch (IOException unused) {
                    f145063g = true;
                } catch (SecurityException unused2) {
                    f145063g = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
