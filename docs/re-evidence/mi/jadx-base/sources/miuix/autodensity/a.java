package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.qr5;
import defpackage.rkr;
import defpackage.tc8;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    protected HashMap<Integer, ComponentCallbacksC1032a> mModifier;
    protected DisplayManager mDisplayManager = null;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: miuix.autodensity.a$a, reason: collision with other inner class name */
    public class ComponentCallbacksC1032a implements DisplayManager.DisplayListener, ComponentCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<Activity> f26613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<View.OnAttachStateChangeListener> f26614b = null;
        public final a c;

        public ComponentCallbacksC1032a(Activity activity, a aVar) {
            this.f26613a = null;
            this.f26613a = new WeakReference<>(activity);
            this.c = aVar;
        }

        public void a() {
            WeakReference<Activity> weakReference = this.f26613a;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference<View.OnAttachStateChangeListener> weakReference2 = this.f26614b;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
        }

        public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f26614b = new WeakReference<>(onAttachStateChangeListener);
        }

        public void b(Activity activity) {
            View.OnAttachStateChangeListener onAttachStateChangeListener;
            WeakReference<View.OnAttachStateChangeListener> weakReference = this.f26614b;
            if (weakReference == null || (onAttachStateChangeListener = weakReference.get()) == null) {
                return;
            }
            activity.getWindow().getDecorView().removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            WeakReference<Activity> weakReference = this.f26613a;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                this.c.processBeforeActivityConfigChanged(activity, configuration);
            } else {
                a.this.unregisterDisplayListener(this);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            WeakReference<Activity> weakReference = this.f26613a;
            Activity activity = weakReference == null ? null : weakReference.get();
            if (activity != null) {
                this.c.processOnActivityDisplayChanged(i, activity);
            } else {
                a.this.unregisterDisplayListener(this);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static class b implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f26615a;

        public b(a aVar) {
            this.f26615a = aVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.f26615a.processOnActivityCreated(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f26615a.processOnActivityDestroyed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public abstract boolean isEnableProcessInActivity(Activity activity);

    public void onDensityChangedBeforeActivityConfigChanged(Activity activity, Configuration configuration, rkr rkrVar) {
        tc8.A(configuration, rkrVar);
        tc8.y(activity, rkrVar);
        tc8.q(activity);
        tc8.s(rkrVar);
    }

    public void onDensityChangedOnActivityCreated(Activity activity) {
        registerCallback(activity);
    }

    public void onDensityChangedOnActivityDisplayChanged(int i, Activity activity) {
    }

    public void onDensityChangedOnAppConfigChanged(Application application) {
    }

    public void onRegisterDensityCallback(Object obj) {
    }

    public abstract void prepareInApplication(Application application);

    public abstract void processBeforeActivityConfigChanged(Activity activity, Configuration configuration);

    public abstract void processOnActivityCreated(Activity activity);

    public abstract void processOnActivityDestroyed(Activity activity);

    public abstract void processOnActivityDisplayChanged(int i, Activity activity);

    public abstract void processOnAppConfigChanged(Application application, Configuration configuration);

    public void registerCallback(Activity activity) {
        if (this.mDisplayManager == null) {
            this.mDisplayManager = (DisplayManager) activity.getApplication().getSystemService("display");
        }
        if (this.mModifier == null) {
            this.mModifier = new HashMap<>();
        }
        int iHashCode = activity.hashCode();
        if (this.mModifier.get(Integer.valueOf(iHashCode)) == null) {
            ComponentCallbacksC1032a componentCallbacksC1032a = new ComponentCallbacksC1032a(activity, this);
            this.mModifier.put(Integer.valueOf(iHashCode), componentCallbacksC1032a);
            this.mDisplayManager.registerDisplayListener(componentCallbacksC1032a, this.mUiHandler);
            activity.getApplication().registerComponentCallbacks(componentCallbacksC1032a);
            activity.registerComponentCallbacks(componentCallbacksC1032a);
        }
    }

    public void unregisterCallback(Activity activity) {
        if (this.mModifier != null) {
            int iHashCode = activity.hashCode();
            ComponentCallbacksC1032a componentCallbacksC1032a = this.mModifier.get(Integer.valueOf(iHashCode));
            qr5.d("unregisterCallback obj: " + componentCallbacksC1032a);
            if (componentCallbacksC1032a != null) {
                unregisterDisplayListener(componentCallbacksC1032a);
                activity.getApplication().unregisterComponentCallbacks(componentCallbacksC1032a);
                activity.unregisterComponentCallbacks(componentCallbacksC1032a);
                componentCallbacksC1032a.b(activity);
                componentCallbacksC1032a.a();
            }
            this.mModifier.remove(Integer.valueOf(iHashCode));
        }
    }

    public void unregisterDisplayListener(ComponentCallbacksC1032a componentCallbacksC1032a) {
        DisplayManager displayManager = this.mDisplayManager;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(componentCallbacksC1032a);
        }
    }
}
