package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class ModelToResourceClassCache {
    private final AtomicReference<MultiClassKey> a = new AtomicReference<>();
    private final ArrayMap<MultiClassKey, List<Class<?>>> b = new ArrayMap<>();

    public void clear() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    @Nullable
    public List<Class<?>> get(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        List<Class<?>> list;
        MultiClassKey andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2);
        } else {
            andSet.set(cls, cls2);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void put(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new MultiClassKey(cls, cls2), list);
        }
    }
}
