package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C0210zaa> zack;

    public zaa(Activity activity) {
        this(C0210zaa.zaa(activity));
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0210zaa c0210zaa = this.zack.get();
        if (c0210zaa == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c0210zaa.zaa(runnable);
        return this;
    }

    @VisibleForTesting(otherwise = 2)
    private zaa(C0210zaa c0210zaa) {
        this.zack = new WeakReference<>(c0210zaa);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.zaa$zaa, reason: collision with other inner class name */
    @VisibleForTesting(otherwise = 2)
    public static class C0210zaa extends LifecycleCallback {
        private List<Runnable> zacl;

        private C0210zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zacl = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0210zaa zaa(Activity activity) {
            C0210zaa c0210zaa;
            synchronized (activity) {
                try {
                    LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                    c0210zaa = (C0210zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0210zaa.class);
                    if (c0210zaa == null) {
                        c0210zaa = new C0210zaa(fragment);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0210zaa;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zacl;
                this.zacl = new ArrayList();
            }
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void zaa(Runnable runnable) {
            this.zacl.add(runnable);
        }
    }
}
