package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ovr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29744a = "ovr";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f29745b = new Object();
    public static final List<WeakReference<Activity>> c = new LinkedList();

    public static void a(WeakReference<Activity> weakReference, String str) {
        synchronized (f29745b) {
            try {
                List<WeakReference<Activity>> list = c;
                if (list.size() >= 10) {
                    b(0);
                }
                list.add(weakReference);
                zxr.a(f29744a, " rn:" + list.size() + "\n url :  " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(int i) {
        Activity activity;
        if (c()) {
            List<WeakReference<Activity>> list = c;
            if (list.size() <= i || i < 0) {
                return;
            }
            WeakReference<Activity> weakReference = list.get(i);
            if (weakReference != null && (activity = weakReference.get()) != null && !activity.isDestroyed()) {
                activity.finish();
            }
            list.remove(i);
        }
    }

    public static boolean c() {
        i1d infoProvider = lwr.b().getInfoProvider();
        if (infoProvider != null) {
            return infoProvider.needRNPageCountControl();
        }
        return true;
    }

    public static void d(WeakReference<Activity> weakReference) {
        synchronized (f29745b) {
            try {
                List<WeakReference<Activity>> list = c;
                list.remove(weakReference);
                zxr.a(f29744a, " rn:" + list.size());
                if (list.size() <= 0) {
                    System.gc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
