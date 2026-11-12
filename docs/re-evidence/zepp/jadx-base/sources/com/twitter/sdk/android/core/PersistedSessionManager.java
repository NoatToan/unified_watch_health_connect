package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreStrategy;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes18.dex */
public class PersistedSessionManager<T extends Session> implements SessionManager<T> {
    private static final int i = 1;
    private final PreferenceStore a;
    private final SerializationStrategy<T> b;
    private final ConcurrentHashMap<Long, T> c;
    private final ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> d;
    private final PreferenceStoreStrategy<T> e;
    private final AtomicReference<T> f;
    private final String g;
    private volatile boolean h;

    public PersistedSessionManager(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, String str, String str2) {
        this(preferenceStore, serializationStrategy, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new PreferenceStoreStrategy(preferenceStore, serializationStrategy, str), str2);
    }

    private void b(long j, T t, boolean z) {
        this.c.put(Long.valueOf(j), t);
        PreferenceStoreStrategy<T> preferenceStoreStrategy = this.d.get(Long.valueOf(j));
        if (preferenceStoreStrategy == null) {
            preferenceStoreStrategy = new PreferenceStoreStrategy<>(this.a, this.b, a(j));
            this.d.putIfAbsent(Long.valueOf(j), preferenceStoreStrategy);
        }
        preferenceStoreStrategy.save(t);
        T t2 = this.f.get();
        if (t2 == null || t2.getId() == j || z) {
            synchronized (this) {
                this.f.compareAndSet(t2, t);
                this.e.save(t);
            }
        }
    }

    private void d() {
        T tRestore = this.e.restore();
        if (tRestore != null) {
            b(tRestore.getId(), tRestore, false);
        }
    }

    private synchronized void e() {
        if (this.h) {
            d();
            g();
            this.h = false;
        }
    }

    private void g() {
        T tDeserialize;
        for (Map.Entry<String, ?> entry : this.a.get().getAll().entrySet()) {
            if (c(entry.getKey()) && (tDeserialize = this.b.deserialize((String) entry.getValue())) != null) {
                b(tDeserialize.getId(), tDeserialize, false);
            }
        }
    }

    public String a(long j) {
        return this.g + "_" + j;
    }

    public boolean c(String str) {
        return str.startsWith(this.g);
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public void clearActiveSession() {
        f();
        if (this.f.get() != null) {
            clearSession(this.f.get().getId());
        }
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public void clearSession(long j) {
        f();
        if (this.f.get() != null && this.f.get().getId() == j) {
            synchronized (this) {
                this.f.set(null);
                this.e.clear();
            }
        }
        this.c.remove(Long.valueOf(j));
        PreferenceStoreStrategy<T> preferenceStoreStrategyRemove = this.d.remove(Long.valueOf(j));
        if (preferenceStoreStrategyRemove != null) {
            preferenceStoreStrategyRemove.clear();
        }
    }

    public void f() {
        if (this.h) {
            e();
        }
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public T getActiveSession() {
        f();
        return this.f.get();
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public T getSession(long j) {
        f();
        return this.c.get(Long.valueOf(j));
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public Map<Long, T> getSessionMap() {
        f();
        return Collections.unmodifiableMap(this.c);
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public void setActiveSession(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Session must not be null!");
        }
        f();
        b(t.getId(), t, true);
    }

    @Override // com.twitter.sdk.android.core.SessionManager
    public void setSession(long j, T t) {
        if (t == null) {
            throw new IllegalArgumentException("Session must not be null!");
        }
        f();
        b(j, t, false);
    }

    public PersistedSessionManager(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> concurrentHashMap2, PreferenceStoreStrategy<T> preferenceStoreStrategy, String str) {
        this.h = true;
        this.a = preferenceStore;
        this.b = serializationStrategy;
        this.c = concurrentHashMap;
        this.d = concurrentHashMap2;
        this.e = preferenceStoreStrategy;
        this.f = new AtomicReference<>();
        this.g = str;
    }
}
