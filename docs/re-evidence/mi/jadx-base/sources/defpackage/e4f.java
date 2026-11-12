package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e4f {

    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f16251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16252b;

        public Map<K, V> a() {
            if (!this.f16252b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f16252b = false;
            return this.f16251a;
        }

        public b<K, V> b(K k2, V v) {
            if (!this.f16252b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f16251a.put(k2, v);
            return this;
        }

        public b() {
            this.f16251a = e4f.b();
            this.f16252b = true;
        }
    }

    public static <K, V> b<K, V> a() {
        return new b<>();
    }

    public static <K, V> HashMap<K, V> b() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> c() {
        return b();
    }

    public static <K, V> Map<K, V> d(K k2, V v) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        return mapC;
    }

    public static <K, V> Map<K, V> e(K k2, V v, K k3, V v2) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        return mapC;
    }

    public static <K, V> Map<K, V> f(K k2, V v, K k3, V v2, K k4, V v3) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        mapC.put(k4, v3);
        return mapC;
    }

    public static <K, V> Map<K, V> g(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        mapC.put(k4, v3);
        mapC.put(k5, v4);
        return mapC;
    }

    public static <K, V> Map<K, V> h(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        mapC.put(k4, v3);
        mapC.put(k5, v4);
        mapC.put(k6, v5);
        return mapC;
    }

    public static <K, V> Map<K, V> i(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        mapC.put(k4, v3);
        mapC.put(k5, v4);
        mapC.put(k6, v5);
        mapC.put(k7, v6);
        return mapC;
    }

    public static <K, V> Map<K, V> j(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7) {
        Map<K, V> mapC = c();
        mapC.put(k2, v);
        mapC.put(k3, v2);
        mapC.put(k4, v3);
        mapC.put(k5, v4);
        mapC.put(k6, v5);
        mapC.put(k7, v6);
        mapC.put(k8, v7);
        return mapC;
    }
}
