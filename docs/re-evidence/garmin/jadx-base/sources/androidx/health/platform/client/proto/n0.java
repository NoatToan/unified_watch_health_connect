package androidx.health.platform.client.proto;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f7726e;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, n0> f7727a;

        private b(Map.Entry<K, n0> entry) {
            this.f7727a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f7727a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            n0 value = this.f7727a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(value.f7726e);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof c1)) {
                vb.h.s("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            n0 value = this.f7727a.getValue();
            c1 c1Var = value.f7737c;
            value.f7735a = null;
            value.f7738d = null;
            value.f7737c = (c1) obj;
            return c1Var;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f7728a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f7728a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7728a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f7728a.next();
            return next.getValue() instanceof n0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f7728a.remove();
        }
    }

    public n0(c1 c1Var, a0 a0Var, i iVar) {
        super(a0Var, iVar);
        this.f7726e = c1Var;
    }

    @Override // androidx.health.platform.client.proto.o0
    public final boolean equals(Object obj) {
        return a(this.f7726e).equals(obj);
    }

    @Override // androidx.health.platform.client.proto.o0
    public final int hashCode() {
        return a(this.f7726e).hashCode();
    }

    public final String toString() {
        return a(this.f7726e).toString();
    }
}
