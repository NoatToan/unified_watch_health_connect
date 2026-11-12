package cn.hutool.core.lang;

import cn.hutool.core.lang.SimpleCache;
import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class SimpleCache<K, V> implements Iterable<Map.Entry<K, V>>, Serializable {
    private static final long serialVersionUID = 1;
    private final Map<K, V> cache;
    protected final Map<K, Lock> keyLockMap;
    private final ReentrantReadWriteLock lock;

    public SimpleCache() {
        this(new WeakHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$get$0(Object obj) {
        return new ReentrantLock();
    }

    public void clear() {
        this.lock.writeLock().lock();
        try {
            this.cache.clear();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public V get(K k2) {
        this.lock.readLock().lock();
        try {
            return this.cache.get(k2);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.cache.entrySet().iterator();
    }

    public V put(K k2, V v) {
        this.lock.writeLock().lock();
        try {
            this.cache.put(k2, v);
            return v;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public V remove(K k2) {
        this.lock.writeLock().lock();
        try {
            return this.cache.remove(k2);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public SimpleCache(Map<K, V> map) {
        this.lock = new ReentrantReadWriteLock();
        this.keyLockMap = new ConcurrentHashMap();
        this.cache = map;
    }

    public V get(K k2, Func0<V> func0) {
        V vCall;
        V v = get(k2);
        if (v != null || func0 == null) {
            return v;
        }
        Lock lockComputeIfAbsent = this.keyLockMap.computeIfAbsent(k2, new Function() { // from class: hcm
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SimpleCache.lambda$get$0(obj);
            }
        });
        lockComputeIfAbsent.lock();
        try {
            V v2 = this.cache.get(k2);
            if (v2 == null) {
                try {
                    vCall = func0.call();
                    put(k2, vCall);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                vCall = v2;
            }
            lockComputeIfAbsent.unlock();
            this.keyLockMap.remove(k2);
            return vCall;
        } catch (Throwable th) {
            lockComputeIfAbsent.unlock();
            this.keyLockMap.remove(k2);
            throw th;
        }
    }
}
