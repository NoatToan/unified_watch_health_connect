package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e0 extends f0 {
    public final q0 f;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, e0> f9631a;

        public e0 a() {
            return this.f9631a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f9631a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            e0 value = this.f9631a.getValue();
            if (value == null) {
                return null;
            }
            return value.g();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q0) {
                return this.f9631a.getValue().e((q0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, e0> entry) {
            this.f9631a = entry;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f9632a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f9632a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f9632a.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9632a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f9632a.remove();
        }
    }

    public e0(q0 q0Var, t tVar, ByteString byteString) {
        super(tVar, byteString);
        this.f = q0Var;
    }

    @Override // com.google.protobuf.f0
    public boolean equals(Object obj) {
        return g().equals(obj);
    }

    public q0 g() {
        return d(this.f);
    }

    @Override // com.google.protobuf.f0
    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return g().toString();
    }
}
