package com.xiaomi.smarthome.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UpdateWatcher<T> {
    protected static final String TAG = "UpdateWatcher";
    protected List<Watcher<T>> mUpdateListener;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registUpdateListener$0(LifecycleOwner lifecycleOwner, Watcher watcher, LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            unregistUpdateListener(watcher);
        }
    }

    public boolean dispatchUpdate(T t) {
        return dispatchUpdate(t, false);
    }

    public boolean dispatchUpdateAndClear(T t) {
        return dispatchUpdate(t, true);
    }

    public void registUpdateListener(final LifecycleOwner lifecycleOwner, final Watcher<T> watcher) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: lcq
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    this.f24911a.lambda$registUpdateListener$0(lifecycleOwner, watcher, lifecycleOwner2, event);
                }
            });
        }
        registUpdateListener(watcher);
    }

    public void unregistUpdateListener(Watcher<T> watcher) {
        if (this.mUpdateListener != null) {
            synchronized (this) {
                try {
                    List<Watcher<T>> list = this.mUpdateListener;
                    if (list != null) {
                        list.remove(watcher);
                        if (this.mUpdateListener.size() == 0) {
                            this.mUpdateListener = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean dispatchUpdate(T t, boolean z) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = null;
                if (this.mUpdateListener != null) {
                    ArrayList arrayList2 = new ArrayList(this.mUpdateListener);
                    if (z) {
                        this.mUpdateListener = null;
                    }
                    arrayList = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Watcher) it.next()).accept(t);
        }
        return true;
    }

    public void registUpdateListener(Watcher<T> watcher) {
        if (watcher == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.mUpdateListener == null) {
                    this.mUpdateListener = new ArrayList();
                }
                this.mUpdateListener.add(watcher);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
