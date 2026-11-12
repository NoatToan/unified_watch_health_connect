package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class dn0 {
    public static final dn0 c = new dn0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList<Activity> f15705a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15706b = false;

    public class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15707a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15708b = false;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            dn0.this.f15705a.addFirst(activity);
            if (dn0.this.f15705a.size() > 100) {
                dn0.this.f15705a.removeLast();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            dn0.this.f15705a.remove(activity);
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
            int i = this.f15707a + 1;
            this.f15707a = i;
            if (i != 1 || this.f15708b) {
                return;
            }
            dn0.this.f15706b = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean zIsChangingConfigurations = activity.isChangingConfigurations();
            this.f15708b = zIsChangingConfigurations;
            int i = this.f15707a - 1;
            this.f15707a = i;
            if (i != 0 || zIsChangingConfigurations) {
                return;
            }
            dn0.this.f15706b = false;
        }
    }

    public static dn0 d() {
        return c;
    }

    public void c() {
        LinkedList<Activity> linkedList = this.f15705a;
        if (linkedList != null) {
            Iterator<Activity> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
            this.f15705a.clear();
        }
    }

    public void e(Application application) {
        this.f15705a = new LinkedList<>();
        application.registerActivityLifecycleCallbacks(new a());
    }

    public boolean f() {
        return this.f15706b;
    }
}
