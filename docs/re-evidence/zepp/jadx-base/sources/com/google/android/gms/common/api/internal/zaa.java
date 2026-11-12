package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<a> a;

    @VisibleForTesting(otherwise = 2)
    public static class a extends LifecycleCallback {
        private List<Runnable> a;

        private a(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.a = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void c(Runnable runnable) {
            this.a.add(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a d(Activity activity) {
            a aVar;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                aVar = (a) fragment.getCallbackOrNull("LifecycleObserverOnStop", a.class);
                if (aVar == null) {
                    aVar = new a(fragment);
                }
            }
            return aVar;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.a;
                this.a = new ArrayList();
            }
            Iterator<Runnable> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        }
    }

    public zaa(Activity activity) {
        this(a.d(activity));
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        a aVar = this.a.get();
        if (aVar == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        aVar.c(runnable);
        return this;
    }

    @VisibleForTesting(otherwise = 2)
    private zaa(a aVar) {
        this.a = new WeakReference<>(aVar);
    }
}
