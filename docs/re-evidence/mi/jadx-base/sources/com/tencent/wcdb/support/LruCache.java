package com.tencent.wcdb.support;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k2, V v) {
        int iSizeOf = sizeOf(k2, v);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    public V create(K k2) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z, K k2, V v, V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final V get(K k2) {
        V vPut;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.map.get(k2);
                if (v != null) {
                    this.hitCount++;
                    return v;
                }
                this.missCount++;
                V vCreate = create(k2);
                if (vCreate == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.createCount++;
                        vPut = this.map.put(k2, vCreate);
                        if (vPut != null) {
                            this.map.put(k2, vPut);
                        } else {
                            this.size += safeSizeOf(k2, vCreate);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    entryRemoved(false, k2, vCreate, vPut);
                    return vPut;
                }
                trimToSize(this.maxSize);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final V put(K k2, V v) {
        V vPut;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k2, v);
                vPut = this.map.put(k2, v);
                if (vPut != null) {
                    this.size -= safeSizeOf(k2, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, k2, vPut, v);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final V remove(K k2) {
        V vRemove;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                vRemove = this.map.remove(k2);
                if (vRemove != null) {
                    this.size -= safeSizeOf(k2, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k2, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(K k2, V v) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    @SuppressLint({"DefaultLocale"})
    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.hitCount;
            i2 = this.missCount + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public void trimToSize(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i && !this.map.isEmpty()) {
                        Map.Entry<K, V> next = this.map.entrySet().iterator().hasNext() ? this.map.entrySet().iterator().next() : null;
                        if (next == null) {
                            return;
                        }
                        key = next.getKey();
                        value = next.getValue();
                        this.map.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
