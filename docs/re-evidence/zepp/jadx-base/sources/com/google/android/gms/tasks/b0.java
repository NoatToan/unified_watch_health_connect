package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends LifecycleCallback {
    private final List<WeakReference<w<?>>> a;

    private b0(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.a = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static b0 a(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        b0 b0Var = (b0) fragment.getCallbackOrNull("TaskOnStopCallback", b0.class);
        return b0Var == null ? new b0(fragment) : b0Var;
    }

    public final <T> void b(w<T> wVar) {
        synchronized (this.a) {
            this.a.add(new WeakReference<>(wVar));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        synchronized (this.a) {
            Iterator<WeakReference<w<?>>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                w<?> wVar = it2.next().get();
                if (wVar != null) {
                    wVar.zzc();
                }
            }
            this.a.clear();
        }
    }
}
