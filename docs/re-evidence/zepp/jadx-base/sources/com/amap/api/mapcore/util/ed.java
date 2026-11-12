package com.amap.api.mapcore.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public class ed<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public ed(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int c(K k, V v) {
        int iB = b(v);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException("Negative size: " + k + SearchCriteria.EQ + v);
    }

    public final V a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.a.get(k);
            if (v != null) {
                this.f++;
                return v;
            }
            this.g++;
            return null;
        }
    }

    public int b(V v) {
        return 1;
    }

    public void b(K k, V v) {
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f;
        i2 = this.g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public final V a(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                this.d++;
                this.b += c(k, v);
                vPut = this.a.put(k, v);
                if (vPut != null) {
                    this.b -= c(k, vPut);
                }
            }
            if (vPut != null) {
                b(k, vPut);
            }
            a(this.c);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.b >= 0) {
                    this.a.isEmpty();
                }
                if (this.b <= i) {
                    return;
                }
                Map.Entry<K, V> next = null;
                Iterator<Map.Entry<K, V>> it2 = this.a.entrySet().iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                }
                if (next == null) {
                    return;
                }
                key = next.getKey();
                value = next.getValue();
                this.a.remove(key);
                this.b -= c(key, value);
                this.e++;
            }
            b(key, value);
        }
    }

    public final void a() {
        a(-1);
    }
}
