package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class ActivityLifecycleManager {
    private final a a;

    public static abstract class Callbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static class a {
        private final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        /* JADX INFO: renamed from: com.twitter.sdk.android.core.internal.ActivityLifecycleManager$a$a, reason: collision with other inner class name */
        public class C0760a implements Application.ActivityLifecycleCallbacks {
            public final /* synthetic */ Callbacks a;

            public C0760a(Callbacks callbacks) {
                this.a = callbacks;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.a.onActivityCreated(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                this.a.onActivityDestroyed(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                this.a.onActivityPaused(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                this.a.onActivityResumed(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.a.onActivitySaveInstanceState(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                this.a.onActivityStarted(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                this.a.onActivityStopped(activity);
            }
        }

        public a(Application application) {
            this.b = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            Iterator<Application.ActivityLifecycleCallbacks> it2 = this.a.iterator();
            while (it2.hasNext()) {
                this.b.unregisterActivityLifecycleCallbacks(it2.next());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(Callbacks callbacks) {
            if (this.b == null) {
                return false;
            }
            C0760a c0760a = new C0760a(callbacks);
            this.b.registerActivityLifecycleCallbacks(c0760a);
            this.a.add(c0760a);
            return true;
        }
    }

    public ActivityLifecycleManager(Context context) {
        this.a = new a((Application) context.getApplicationContext());
    }

    public boolean registerCallbacks(Callbacks callbacks) {
        a aVar = this.a;
        return aVar != null && aVar.d(callbacks);
    }

    public void resetCallbacks() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
