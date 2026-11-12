package org.acra.builder;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.acra.ACRA;
import org.acra.collections.WeakStack;

/* JADX INFO: loaded from: classes23.dex */
public final class LastActivityManager {

    @NonNull
    private final WeakStack<Activity> a = new WeakStack<>();

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityCreated " + activity.getClass());
            }
            LastActivityManager.this.a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityDestroyed " + activity.getClass());
            }
            synchronized (LastActivityManager.this.a) {
                LastActivityManager.this.a.remove(activity);
                LastActivityManager.this.a.notify();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityPaused " + activity.getClass());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityResumed " + activity.getClass());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, Bundle bundle) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivitySaveInstanceState " + activity.getClass());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityStarted " + activity.getClass());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "onActivityStopped " + activity.getClass());
            }
        }
    }

    public LastActivityManager(@NonNull Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    public void clearLastActivities() {
        this.a.clear();
    }

    @NonNull
    public List<Activity> getLastActivities() {
        return new ArrayList(this.a);
    }

    @Nullable
    public Activity getLastActivity() {
        return this.a.peek();
    }

    public void waitForAllActivitiesDestroy(int i) {
        synchronized (this.a) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = jCurrentTimeMillis;
            while (!this.a.isEmpty()) {
                long j = i;
                if (jCurrentTimeMillis + j <= jCurrentTimeMillis2) {
                    break;
                }
                try {
                    this.a.wait((jCurrentTimeMillis - jCurrentTimeMillis2) + j);
                } catch (InterruptedException unused) {
                }
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
        }
    }
}
