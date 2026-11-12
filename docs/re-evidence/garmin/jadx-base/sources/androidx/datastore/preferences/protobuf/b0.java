package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f6676e;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, b0> f6677a;

        private b(Map.Entry<K, b0> entry) {
            this.f6677a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f6677a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            b0 value = this.f6677a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(value.f6676e);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof q0)) {
                vb.h.s("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            b0 value = this.f6677a.getValue();
            q0 q0Var = value.f6686c;
            value.f6684a = null;
            value.f6687d = null;
            value.f6686c = (q0) obj;
            return q0Var;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f6678a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f6678a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6678a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f6678a.next();
            return next.getValue() instanceof b0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f6678a.remove();
        }
    }

    public b0(q0 q0Var, o oVar, h hVar) {
        super(oVar, hVar);
        this.f6676e = q0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean equals(Object obj) {
        return a(this.f6676e).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int hashCode() {
        return a(this.f6676e).hashCode();
    }

    public final String toString() {
        return a(this.f6676e).toString();
    }
}
