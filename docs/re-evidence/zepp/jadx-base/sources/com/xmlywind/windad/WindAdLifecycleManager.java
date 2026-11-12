package com.xmlywind.windad;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityActive;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes22.dex */
public class WindAdLifecycleManager {
    private static WindAdLifecycleManager b;
    private String g;
    private long i;
    private String j;
    private int c = 0;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private Map<String, String> h = new HashMap();
    private final Set<WeakReference<LifecycleListener>> a = new HashSet();

    public WindAdLifecycleManager(Application application) {
        this.i = 0L;
        try {
            this.i = System.currentTimeMillis();
            this.j = UUID.randomUUID().toString();
            SigmobLog.i("session_start: " + this.i + ":" + this.j);
            PointEntityActive.ActiveTracking(PointCategory.SESSION_START, this.j, "0", String.valueOf(this.i));
            a(application);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = it2.next().get();
            if (lifecycleListener != null) {
                lifecycleListener.onCreate(activity);
            }
        }
    }

    private void a(Application application) {
        if (application == null) {
            SigmobLog.e("activityCallBack error, application is null");
        } else {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.xmlywind.windad.WindAdLifecycleManager.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    SigmobLog.d("onActivityCreated() called with: activity = [" + activity + "], savedInstanceState = [" + bundle + "]");
                    WindAdLifecycleManager.this.a(activity);
                    WindAdLifecycleManager.this.g = activity.getClass().getSimpleName();
                    WindAdLifecycleManager.this.h.put(WindAdLifecycleManager.this.g, WindAdLifecycleManager.this.g);
                    WindAdLifecycleManager.this.d = true;
                    WindAdLifecycleManager.this.e = false;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    SigmobLog.d("onActivityDestroyed() called with: activity = [" + activity + "]");
                    WindAdLifecycleManager.this.f(activity);
                    WindAdLifecycleManager.this.h.remove(activity.getClass().getSimpleName());
                    if (WindAdLifecycleManager.this.h.size() == 0 && WindAdLifecycleManager.this.d) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = (jCurrentTimeMillis - WindAdLifecycleManager.this.i) / 1000;
                        SigmobLog.i("onActivityDestroyed session_end: " + jCurrentTimeMillis + ":" + WindAdLifecycleManager.this.j + ":" + j);
                        PointEntityActive.ActiveTracking(PointCategory.SESSION_END, WindAdLifecycleManager.this.j, String.valueOf(j), String.valueOf(jCurrentTimeMillis));
                        WindAdLifecycleManager.this.i = System.currentTimeMillis();
                        WindAdLifecycleManager.this.d = false;
                    }
                    if (WindAdLifecycleManager.this.h.size() == 0) {
                        WindAdLifecycleManager.this.f = true;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    SigmobLog.d("onActivityPaused() called with: activity = [" + activity + "]");
                    WindAdLifecycleManager.this.c(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    SigmobLog.d("onActivityResumed() called with: activity = [" + activity + "]");
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.n().a(activity.getWindow().getDecorView().getRootWindowInsets());
                    }
                    WindAdLifecycleManager.this.d(activity);
                    WindAdLifecycleManager.this.e = !activity.getClass().getSimpleName().equals(WindAdLifecycleManager.this.g);
                    WindAdLifecycleManager.this.g = activity.getClass().getSimpleName();
                    if (!WindAdLifecycleManager.this.d || WindAdLifecycleManager.this.f) {
                        WindAdLifecycleManager.this.f = false;
                        WindAdLifecycleManager.this.j = UUID.randomUUID().toString();
                        WindAdLifecycleManager.this.i = System.currentTimeMillis();
                        WindAdLifecycleManager.this.d = true;
                        SigmobLog.i("onActivityResumed session_start: " + WindAdLifecycleManager.this.i + ":" + WindAdLifecycleManager.this.j);
                        PointEntityActive.ActiveTracking(PointCategory.SESSION_START, WindAdLifecycleManager.this.j, "0", String.valueOf(WindAdLifecycleManager.this.i));
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    SigmobLog.d("onActivitySaveInstanceState() called with: activity = [" + activity + "], outState = [" + bundle + "]");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    SigmobLog.d("onActivityStarted() called with: activity = [" + activity + "]");
                    WindAdLifecycleManager.this.b(activity);
                    WindAdLifecycleManager.c(WindAdLifecycleManager.this);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    SigmobLog.d("onActivityStopped() called with: activity = [" + activity + "]");
                    WindAdLifecycleManager.this.e(activity);
                    WindAdLifecycleManager.h(WindAdLifecycleManager.this);
                    if (activity.getClass().getSimpleName().equals(WindAdLifecycleManager.this.g)) {
                        if (!WindAdLifecycleManager.this.e || WindAdLifecycleManager.this.h.size() == 1) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = (jCurrentTimeMillis - WindAdLifecycleManager.this.i) / 1000;
                            SigmobLog.i("onActivityStopped session_end: " + jCurrentTimeMillis + ":" + WindAdLifecycleManager.this.j + ":" + j);
                            PointEntityActive.ActiveTracking(PointCategory.SESSION_END, WindAdLifecycleManager.this.j, String.valueOf(j), String.valueOf(jCurrentTimeMillis));
                            WindAdLifecycleManager.this.i = System.currentTimeMillis();
                            WindAdLifecycleManager.this.d = false;
                        }
                    }
                }
            });
        }
    }

    private boolean a(LifecycleListener lifecycleListener) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (it2.next().get() == lifecycleListener) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = it2.next().get();
            if (lifecycleListener != null) {
                lifecycleListener.onStart(activity);
            }
        }
    }

    public static /* synthetic */ int c(WindAdLifecycleManager windAdLifecycleManager) {
        int i = windAdLifecycleManager.c;
        windAdLifecycleManager.c = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = it2.next().get();
            if (lifecycleListener != null) {
                lifecycleListener.onPause(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = it2.next().get();
            if (lifecycleListener != null) {
                lifecycleListener.onResume(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity) {
        Iterator<WeakReference<LifecycleListener>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = it2.next().get();
            if (lifecycleListener != null) {
                lifecycleListener.onStop(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        Iterator it2 = new CopyOnWriteArraySet(this.a).iterator();
        while (it2.hasNext()) {
            LifecycleListener lifecycleListener = (LifecycleListener) ((WeakReference) it2.next()).get();
            if (lifecycleListener != null) {
                lifecycleListener.onDestroy(activity);
            }
        }
    }

    public static WindAdLifecycleManager getInstance() {
        return b;
    }

    public static /* synthetic */ int h(WindAdLifecycleManager windAdLifecycleManager) {
        int i = windAdLifecycleManager.c;
        windAdLifecycleManager.c = i - 1;
        return i;
    }

    public static void initialize(Application application) {
        if (b == null) {
            synchronized (WindAdLifecycleManager.class) {
                if (b == null && application != null) {
                    b = new WindAdLifecycleManager(application);
                }
            }
        }
    }

    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        if (lifecycleListener == null || this.a == null || !a(lifecycleListener)) {
            return;
        }
        this.a.add(new WeakReference<>(lifecycleListener));
    }

    public int getActivityCount() {
        return this.c;
    }

    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        if (lifecycleListener == null || this.a == null || !a(lifecycleListener)) {
            return;
        }
        this.a.remove(lifecycleListener);
    }
}
