package z33;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, i> f202206a;

        private b(Map.Entry<K, i> entry) {
            this.f202206a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f202206a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            i value = this.f202206a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof n)) {
                vb.h.s("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            i value = this.f202206a.getValue();
            n nVar = value.f202208a;
            value.f202208a = (n) obj;
            return nVar;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f202207a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f202207a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202207a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f202207a.next();
            return next.getValue() instanceof i ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f202207a.remove();
        }
    }

    public final n a() {
        if (this.f202208a == null) {
            synchronized (this) {
                if (this.f202208a == null) {
                    try {
                        this.f202208a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f202208a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
