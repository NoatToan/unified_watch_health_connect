package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
class a implements Lifecycle {
    private final Set<LifecycleListener> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    public void a() {
        this.c = true;
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((LifecycleListener) it2.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@NonNull LifecycleListener lifecycleListener) {
        this.a.add(lifecycleListener);
        if (this.c) {
            lifecycleListener.onDestroy();
        } else if (this.b) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    public void b() {
        this.b = true;
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((LifecycleListener) it2.next()).onStart();
        }
    }

    public void c() {
        this.b = false;
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((LifecycleListener) it2.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@NonNull LifecycleListener lifecycleListener) {
        this.a.remove(lifecycleListener);
    }
}
