package miuix.app;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.core.util.Consumer;
import com.mipay.sdk.Mipay;
import defpackage.n5g;
import defpackage.nti;
import defpackage.tc8;
import defpackage.tii;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Application extends android.app.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26288a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26289b = new Object();
    public b c;
    public a d;

    public static class a implements ComponentCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<ComponentCallbacks> f26290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f26291b;

        public a(Context context) {
            this.f26291b = context;
        }

        public final void b(Consumer<ComponentCallbacks> consumer) {
            synchronized (this) {
                List<ComponentCallbacks> list = this.f26290a;
                if (list != null && !list.isEmpty()) {
                    int size = this.f26290a.size();
                    ComponentCallbacks[] componentCallbacksArr = new ComponentCallbacks[size];
                    this.f26290a.toArray(componentCallbacksArr);
                    for (int i = 0; i < size; i++) {
                        consumer.accept(componentCallbacksArr[i]);
                    }
                }
            }
        }

        public void d(ComponentCallbacks componentCallbacks) {
            if (this.f26290a == null) {
                this.f26290a = new ArrayList();
            }
            this.f26290a.add(componentCallbacks);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(final Configuration configuration) {
            b(new Consumer() { // from class: qi1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((ComponentCallbacks) obj).onConfigurationChanged(configuration);
                }
            });
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            b(new Consumer() { // from class: pi1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((ComponentCallbacks) obj).onLowMemory();
                }
            });
        }
    }

    public static class b implements android.app.Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<android.app.Application.ActivityLifecycleCallbacks> f26292a = new ArrayList<>();

        public boolean a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            return this.f26292a.add(activityLifecycleCallbacks);
        }

        public final Object[] b() {
            Object[] array;
            synchronized (this.f26292a) {
                try {
                    array = this.f26292a.size() > 0 ? this.f26292a.toArray() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return array;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Object[] objArrB = b();
            if (objArrB != null) {
                for (Object obj : objArrB) {
                    ((android.app.Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
                }
            }
        }
    }

    public void c(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        synchronized (this.f26288a) {
            try {
                if (this.c == null) {
                    b bVar = new b();
                    this.c = bVar;
                    registerActivityLifecycleCallbacks(bVar);
                }
                this.c.a(activityLifecycleCallbacks);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(ComponentCallbacks componentCallbacks) {
        synchronized (this.f26289b) {
            try {
                if (this.d == null) {
                    a aVar = new a(this);
                    this.d = aVar;
                    registerComponentCallbacks(aVar);
                }
                this.d.d(componentCallbacks);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        n5g.d();
        tc8.q(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        tc8.m(this);
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 31) {
            Resources resources = getApplicationContext().getResources();
            if (resources.getInteger(nti.f28358a) == 2) {
                UiModeManager uiModeManager = (UiModeManager) getSystemService(Mipay.KEY_UI_MODE);
                uiModeManager.setApplicationNightMode(0);
                if (uiModeManager.getNightMode() == 1) {
                    if (!resources.getBoolean(tii.f34742b)) {
                        uiModeManager.setApplicationNightMode(2);
                    }
                } else if (resources.getBoolean(tii.f34741a)) {
                    uiModeManager.setApplicationNightMode(1);
                }
            }
        }
    }
}
