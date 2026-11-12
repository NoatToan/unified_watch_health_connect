package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class b3<K, V> extends ForwardingMap<K, V> {
    private final Map<K, V> a;

    @MonotonicNonNullDecl
    private Set<Map.Entry<K, V>> b;

    public final class b extends Maps.s<K, V> {

        public class a extends x2<K, Map.Entry<K, V>> {

            /* JADX INFO: renamed from: com.google.common.collect.b3$b$a$a, reason: collision with other inner class name */
            public class C0193a extends f<K, V> {
                public final /* synthetic */ Object a;

                public C0193a(Object obj) {
                    this.a = obj;
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                public K getKey() {
                    return (K) this.a;
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                public V getValue() {
                    return b3.this.get(this.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.f, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) b3.this.put(this.a, v);
                }
            }

            public a(Iterator it2) {
                super(it2);
            }

            @Override // com.google.common.collect.x2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(K k) {
                return new C0193a(k);
            }
        }

        private b() {
        }

        @Override // com.google.common.collect.Maps.s
        public Map<K, V> d() {
            return b3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(b3.this.keySet().iterator());
        }
    }

    private b3(Map<K, V> map) {
        this.a = map;
    }

    public static <K, V> b3<K, V> e(Map<K, V> map) {
        return new b3<>(map);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.b;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
        return this.a;
    }
}
