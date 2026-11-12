package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class q6r<K, V> extends WeakReference<V> implements w0e<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f31184a;

    public q6r(K k2, V v, ReferenceQueue<? super V> referenceQueue) {
        super(v, referenceQueue);
        this.f31184a = k2;
    }

    @Override // defpackage.w0e
    public K key() {
        return this.f31184a;
    }
}
