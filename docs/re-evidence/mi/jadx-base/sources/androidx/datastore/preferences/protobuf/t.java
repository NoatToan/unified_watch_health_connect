package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t extends u {
    public final b0 f;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, t> f2254a;

        public t a() {
            return this.f2254a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2254a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            t value = this.f2254a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof b0) {
                return this.f2254a.getValue().d((b0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, t> entry) {
            this.f2254a = entry;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f2255a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2255a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2255a.next();
            return next.getValue() instanceof t ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2255a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2255a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public b0 f() {
        return c(this.f);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
