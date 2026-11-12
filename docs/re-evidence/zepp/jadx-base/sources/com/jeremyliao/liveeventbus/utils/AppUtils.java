package com.jeremyliao.liveeventbus.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.FileProvider;
import com.squareup.picasso.u;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public final class AppUtils {
    private static final String a = "com.blankj.utilcode.util.PermissionUtils$PermissionActivity";
    private static final a b = new a();

    @SuppressLint({"StaticFieldLeak"})
    private static Application c;

    public static final class FileProvider4UtilCode extends FileProvider {
        @Override // androidx.core.content.FileProvider, android.content.ContentProvider
        public boolean onCreate() {
            AppUtils.init(getContext());
            return true;
        }
    }

    public interface OnActivityDestroyedListener {
        void onActivityDestroyed(Activity activity);
    }

    public interface OnAppStatusChangedListener {
        void onBackground();

        void onForeground();
    }

    public static class a implements Application.ActivityLifecycleCallbacks {
        public final LinkedList<Activity> a = new LinkedList<>();
        public final Map<Object, OnAppStatusChangedListener> b = new HashMap();
        public final Map<Activity, Set<OnActivityDestroyedListener>> c = new HashMap();
        private int d = 0;
        private int e = 0;
        private boolean f = false;

        private void c(Activity activity) {
            Iterator<Map.Entry<Activity, Set<OnActivityDestroyedListener>>> it2 = this.c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Activity, Set<OnActivityDestroyedListener>> next = it2.next();
                if (next.getKey() == activity) {
                    Iterator<OnActivityDestroyedListener> it3 = next.getValue().iterator();
                    while (it3.hasNext()) {
                        it3.next().onActivityDestroyed(activity);
                    }
                    it2.remove();
                }
            }
        }

        private static void d(Activity activity) {
            InputMethodManager inputMethodManager;
            if (activity == null || (inputMethodManager = (InputMethodManager) AppUtils.getApp().getSystemService("input_method")) == null) {
                return;
            }
            String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
            for (int i = 0; i < 4; i++) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                    if (declaredField != null) {
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField.get(inputMethodManager);
                        if ((obj instanceof View) && ((View) obj).getRootView() == activity.getWindow().getDecorView().getRootView()) {
                            declaredField.set(inputMethodManager, null);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        private Activity f() {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mActivityList");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(objInvoke);
                if (map == null) {
                    return null;
                }
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField(u.F);
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        return (Activity) declaredField3.get(obj);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
            return null;
        }

        private void g(boolean z) {
            OnAppStatusChangedListener next;
            if (this.b.isEmpty()) {
                return;
            }
            Iterator<OnAppStatusChangedListener> it2 = this.b.values().iterator();
            while (it2.hasNext() && (next = it2.next()) != null) {
                if (z) {
                    next.onForeground();
                } else {
                    next.onBackground();
                }
            }
        }

        private void j(Activity activity) {
            if (AppUtils.a.equals(activity.getClass().getName())) {
                return;
            }
            if (!this.a.contains(activity)) {
                this.a.addLast(activity);
            } else {
                if (this.a.getLast().equals(activity)) {
                    return;
                }
                this.a.remove(activity);
                this.a.addLast(activity);
            }
        }

        public void a(Activity activity, OnActivityDestroyedListener onActivityDestroyedListener) {
            Set<OnActivityDestroyedListener> hashSet;
            if (activity == null || onActivityDestroyedListener == null) {
                return;
            }
            if (this.c.containsKey(activity)) {
                hashSet = this.c.get(activity);
                if (hashSet.contains(onActivityDestroyedListener)) {
                    return;
                }
            } else {
                hashSet = new HashSet<>();
                this.c.put(activity, hashSet);
            }
            hashSet.add(onActivityDestroyedListener);
        }

        public void b(Object obj, OnAppStatusChangedListener onAppStatusChangedListener) {
            this.b.put(obj, onAppStatusChangedListener);
        }

        public Activity e() {
            Activity last;
            if (!this.a.isEmpty() && (last = this.a.getLast()) != null) {
                return last;
            }
            Activity activityF = f();
            if (activityF != null) {
                j(activityF);
            }
            return activityF;
        }

        public void h(Activity activity) {
            if (activity == null) {
                return;
            }
            this.c.remove(activity);
        }

        public void i(Object obj) {
            this.b.remove(obj);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.a.remove(activity);
            c(activity);
            d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            j(activity);
            if (this.f) {
                this.f = false;
                g(true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!this.f) {
                j(activity);
            }
            int i = this.e;
            if (i < 0) {
                this.e = i + 1;
            } else {
                this.d++;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.isChangingConfigurations()) {
                this.e--;
                return;
            }
            int i = this.d - 1;
            this.d = i;
            if (i <= 0) {
                this.f = true;
                g(false);
            }
        }
    }

    private AppUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static a a() {
        return b;
    }

    public static LinkedList<Activity> b() {
        return b.a;
    }

    private static Application c() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("u should init first");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            throw new NullPointerException("u should init first");
        }
    }

    public static Context d() {
        if (!e()) {
            return getApp();
        }
        Activity activityE = b.e();
        return activityE == null ? getApp() : activityE;
    }

    public static boolean e() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) getApp().getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    return runningAppProcessInfo.processName.equals(getApp().getPackageName());
                }
            }
        }
        return false;
    }

    public static Application getApp() {
        Application application = c;
        if (application != null) {
            return application;
        }
        Application applicationC = c();
        init(applicationC);
        return applicationC;
    }

    public static void init(Context context) {
        if (context == null) {
            init(c());
        } else {
            init((Application) context.getApplicationContext());
        }
    }

    public static void init(Application application) {
        if (c == null) {
            if (application == null) {
                c = c();
            } else {
                c = application;
            }
            c.registerActivityLifecycleCallbacks(b);
            return;
        }
        if (application == null || application.getClass() == c.getClass()) {
            return;
        }
        Application application2 = c;
        a aVar = b;
        application2.unregisterActivityLifecycleCallbacks(aVar);
        aVar.a.clear();
        c = application;
        application.registerActivityLifecycleCallbacks(aVar);
    }
}
