package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class tvu<V> {
    private WeakReference<V> d;

    public void c(V v) {
        this.d = new WeakReference<>(v);
    }

    public void d() {
        WeakReference<V> weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
    }

    public V e() {
        WeakReference<V> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
