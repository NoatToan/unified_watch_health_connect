package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class kn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f24001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f24002b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f24003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f24004b;

        public a(d dVar, Object obj) {
            this.f24003a = dVar;
            this.f24004b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24003a.f24009a = this.f24004b;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f24005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f24006b;

        public b(Application application, d dVar) {
            this.f24005a = application;
            this.f24006b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24005a.unregisterActivityLifecycleCallbacks(this.f24006b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f24007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f24008b;

        public c(Object obj, Object obj2) {
            this.f24007a = obj;
            this.f24008b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = kn0.d;
                if (method != null) {
                    method.invoke(this.f24007a, this.f24008b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    kn0.e.invoke(this.f24007a, this.f24008b, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f24010b;
        public final int c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;

        public d(Activity activity) {
            this.f24010b = activity;
            this.c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f24010b == activity) {
                this.f24010b = null;
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.e || this.f || this.d || !kn0.h(this.f24009a, this.c, activity)) {
                return;
            }
            this.f = true;
            this.f24009a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f24010b == activity) {
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f24001a = clsA;
        f24002b = b();
        c = f();
        d = d(clsA);
        e = c(clsA);
        f = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new c(f24002b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = c.get(activity);
            if (obj2 == null || (obj = f24002b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            g.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
