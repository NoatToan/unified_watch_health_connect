package com.service.mi.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f10603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0336a f10604b = new C0336a();

    /* JADX INFO: renamed from: com.service.mi.common.util.a$a, reason: collision with other inner class name */
    public static class C0336a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedList<Activity> f10605a = new LinkedList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<Object, b> f10606b = new HashMap<>();
        public int c = 0;
        public int d = 0;

        public final void a(boolean z) {
            b next;
            if (this.f10606b.isEmpty()) {
                return;
            }
            Iterator<b> it = this.f10606b.values().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (z) {
                    next.a();
                } else {
                    next.b();
                }
            }
        }

        public final void b(Activity activity) {
            if (activity.getClass() == PermissionUtils.PermissionActivity.class) {
                return;
            }
            if (!this.f10605a.contains(activity)) {
                this.f10605a.addLast(activity);
            } else {
                if (this.f10605a.getLast().equals(activity)) {
                    return;
                }
                this.f10605a.remove(activity);
                this.f10605a.addLast(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f10605a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            b(activity);
            if (this.c <= 0) {
                a(true);
            }
            int i = this.d;
            if (i < 0) {
                this.d = i + 1;
            } else {
                this.c++;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.isChangingConfigurations()) {
                this.d--;
                return;
            }
            int i = this.c - 1;
            this.c = i;
            if (i <= 0) {
                a(false);
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    public static Application a() {
        Application application = f10603a;
        if (application != null) {
            return application;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke == null) {
                throw new NullPointerException("u should init first");
            }
            b((Application) objInvoke);
            return f10603a;
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

    public static void b(Application application) {
        if (f10603a == null) {
            f10603a = application;
            application.registerActivityLifecycleCallbacks(f10604b);
        }
    }

    public static void c(Context context) {
        b((Application) context.getApplicationContext());
    }
}
