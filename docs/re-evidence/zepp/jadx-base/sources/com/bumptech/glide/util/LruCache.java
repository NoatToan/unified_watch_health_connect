package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<T, Y> {
    private final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public LruCache(long j) {
        this.b = j;
        this.c = j;
    }

    private void a() {
        trimToSize(this.c);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(@NonNull T t) {
        return this.a.containsKey(t);
    }

    @Nullable
    public synchronized Y get(@NonNull T t) {
        return this.a.get(t);
    }

    public synchronized int getCount() {
        return this.a.size();
    }

    public synchronized long getCurrentSize() {
        return this.d;
    }

    public synchronized long getMaxSize() {
        return this.c;
    }

    public int getSize(@Nullable Y y) {
        return 1;
    }

    public void onItemEvicted(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    public synchronized Y put(@NonNull T t, @Nullable Y y) {
        long size = getSize(y);
        if (size >= this.c) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.d += size;
        }
        Y yPut = this.a.put(t, y);
        if (yPut != null) {
            this.d -= (long) getSize(yPut);
            if (!yPut.equals(y)) {
                onItemEvicted(t, yPut);
            }
        }
        a();
        return yPut;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t) {
        Y yRemove;
        yRemove = this.a.remove(t);
        if (yRemove != null) {
            this.d -= (long) getSize(yRemove);
        }
        return yRemove;
    }

    public synchronized void setSizeMultiplier(float f) {
        try {
            if (f < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.c = Math.round(this.b * f);
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void trimToSize(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, Y>> it2 = this.a.entrySet().iterator();
            Map.Entry<T, Y> next = it2.next();
            Y value = next.getValue();
            this.d -= (long) getSize(value);
            T key = next.getKey();
            it2.remove();
            onItemEvicted(key, value);
        }
    }
}
