package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class AtomicLongMap<K> implements Serializable {

    @LazyInit
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>() { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k14, long j8) {
        AtomicLong atomicLongPutIfAbsent;
        long j14;
        long j15;
        do {
            atomicLongPutIfAbsent = this.map.get(k14);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k14, new AtomicLong(j8))) == null) {
                break;
            }
            do {
                j14 = atomicLongPutIfAbsent.get();
                if (j14 != 0) {
                    j15 = j14 + j8;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j14, j15));
            return j15;
        } while (!this.map.replace(k14, atomicLongPutIfAbsent, new AtomicLong(j8)));
        return j8;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k14) {
        return addAndGet(k14, -1L);
    }

    public long get(K k14) {
        AtomicLong atomicLong = this.map.get(k14);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k14, long j8) {
        AtomicLong atomicLongPutIfAbsent;
        long j14;
        do {
            atomicLongPutIfAbsent = this.map.get(k14);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k14, new AtomicLong(j8))) == null) {
                return 0L;
            }
            do {
                j14 = atomicLongPutIfAbsent.get();
                if (j14 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j14, j14 + j8));
            return j14;
        } while (!this.map.replace(k14, atomicLongPutIfAbsent, new AtomicLong(j8)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k14) {
        return getAndAdd(k14, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k14) {
        return getAndAdd(k14, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k14) {
        return addAndGet(k14, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k14, long j8) {
        AtomicLong atomicLongPutIfAbsent;
        long j14;
        do {
            atomicLongPutIfAbsent = this.map.get(k14);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k14, new AtomicLong(j8))) == null) {
                return 0L;
            }
            do {
                j14 = atomicLongPutIfAbsent.get();
                if (j14 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j14, j8));
            return j14;
        } while (!this.map.replace(k14, atomicLongPutIfAbsent, new AtomicLong(j8)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long putIfAbsent(K k14, long j8) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(k14);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k14, new AtomicLong(j8))) == null) {
                return 0L;
            }
            long j14 = atomicLongPutIfAbsent.get();
            if (j14 != 0) {
                return j14;
            }
        } while (!this.map.replace(k14, atomicLongPutIfAbsent, new AtomicLong(j8)));
        return 0L;
    }

    public boolean remove(K k14, long j8) {
        AtomicLong atomicLong = this.map.get(k14);
        if (atomicLong == null) {
            return false;
        }
        long j14 = atomicLong.get();
        if (j14 != j8) {
            return false;
        }
        if (j14 != 0 && !atomicLong.compareAndSet(j14, 0L)) {
            return false;
        }
        this.map.remove(k14, atomicLong);
        return true;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean removeIfZero(K k14) {
        return remove(k14, 0L);
    }

    public boolean replace(K k14, long j8, long j14) {
        if (j8 == 0) {
            return putIfAbsent(k14, j14) == 0;
        }
        AtomicLong atomicLong = this.map.get(k14);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j8, j14);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += it.next().get();
        }
        return j8;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }

    @CanIgnoreReturnValue
    public long remove(K k14) {
        long j8;
        AtomicLong atomicLong = this.map.get(k14);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j8 = atomicLong.get();
            if (j8 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j8, 0L));
        this.map.remove(k14, atomicLong);
        return j8;
    }
}
