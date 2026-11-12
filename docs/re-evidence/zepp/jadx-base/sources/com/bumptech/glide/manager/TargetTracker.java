package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetTracker implements LifecycleListener {
    private final Set<Target<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public void clear() {
        this.a.clear();
    }

    @NonNull
    public List<Target<?>> getAll() {
        return Util.getSnapshot(this.a);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            ((Target) it2.next()).onStop();
        }
    }

    public void track(@NonNull Target<?> target) {
        this.a.add(target);
    }

    public void untrack(@NonNull Target<?> target) {
        this.a.remove(target);
    }
}
