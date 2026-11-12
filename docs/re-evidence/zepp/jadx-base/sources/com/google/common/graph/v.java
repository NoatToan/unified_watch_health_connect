package com.google.common.graph;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
class v<K, V> extends u<K, V> {

    @NullableDecl
    private transient a<K, V> c;

    @NullableDecl
    private transient a<K, V> d;

    public static final class a<K, V> {
        public final K a;
        public final V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }
    }

    public v(Map<K, V> map) {
        super(map);
    }

    private void l(a<K, V> aVar) {
        this.d = this.c;
        this.c = aVar;
    }

    private void m(K k, V v) {
        l(new a<>(k, v));
    }

    @Override // com.google.common.graph.u
    public void d() {
        super.d();
        this.c = null;
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.u
    public V f(@NullableDecl Object obj) {
        V vG = g(obj);
        if (vG != null) {
            return vG;
        }
        V vH = h(obj);
        if (vH != null) {
            m(obj, vH);
        }
        return vH;
    }

    @Override // com.google.common.graph.u
    public V g(@NullableDecl Object obj) {
        V v = (V) super.g(obj);
        if (v != null) {
            return v;
        }
        a<K, V> aVar = this.c;
        if (aVar != null && aVar.a == obj) {
            return aVar.b;
        }
        a<K, V> aVar2 = this.d;
        if (aVar2 == null || aVar2.a != obj) {
            return null;
        }
        l(aVar2);
        return aVar2.b;
    }
}
