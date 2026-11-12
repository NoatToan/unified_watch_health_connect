package defpackage;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, Semaphore> f40675a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40676b = new Object();

    public static boolean a(String str, String str2) {
        try {
            c(str, str2).tryAcquire(VibrateModeProgressBar.sLongToLong, TimeUnit.MILLISECONDS);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String b(String str, String str2) {
        return str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2;
    }

    public static Semaphore c(String str, String str2) {
        String strB = b(str, str2);
        HashMap<String, Semaphore> map = f40675a;
        Semaphore semaphore = map.get(strB);
        if (semaphore != null) {
            return semaphore;
        }
        Semaphore semaphore2 = new Semaphore(1);
        map.put(strB, semaphore2);
        return semaphore2;
    }

    public static boolean d(String str, String str2) {
        boolean zA;
        synchronized (f40676b) {
            try {
                zA = a(str, str2);
                if (Thread.currentThread().isInterrupted()) {
                    if (zA) {
                        f(str, str2);
                    }
                    zA = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zA;
    }

    public static void e() {
        synchronized (f40676b) {
            try {
                Set<Map.Entry<String, Semaphore>> setEntrySet = f40675a.entrySet();
                if (setEntrySet.size() > 0) {
                    Iterator<Map.Entry<String, Semaphore>> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().release();
                    }
                }
                f40675a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f40676b) {
            try {
                Semaphore semaphore = f40675a.get(b(str, str2));
                if (semaphore != null) {
                    semaphore.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
