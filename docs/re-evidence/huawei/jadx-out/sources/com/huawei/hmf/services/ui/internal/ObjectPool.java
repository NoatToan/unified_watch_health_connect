package com.huawei.hmf.services.ui.internal;

import android.util.LongSparseArray;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes33.dex */
class ObjectPool {
    private final LongSparseArray<Object> pool = new LongSparseArray<>();
    private static final ObjectPool instance = new ObjectPool();
    private static final AtomicLong UNIQUE_ID = new AtomicLong(0);

    private ObjectPool() {
    }

    public static ObjectPool getInstance() {
        return instance;
    }

    public Long add(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("value cannot be null.");
        }
        long andIncrement = UNIQUE_ID.getAndIncrement();
        Long lValueOf = Long.valueOf(andIncrement);
        LongSparseArray<Object> longSparseArray = this.pool;
        lValueOf.getClass();
        longSparseArray.put(andIncrement, obj);
        return lValueOf;
    }

    public Object get(Long l) {
        return this.pool.get(l.longValue());
    }

    public void remove(Long l) {
        this.pool.remove(l.longValue());
    }
}
