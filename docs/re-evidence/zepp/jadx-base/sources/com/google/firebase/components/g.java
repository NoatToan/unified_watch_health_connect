package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
class g<T> implements Provider<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<Provider<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public g(Collection<Provider<T>> collection) {
        this.a.addAll(collection);
    }

    public static g<?> b(Collection<Provider<?>> collection) {
        return new g<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<Provider<T>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            this.b.add(it2.next().get());
        }
        this.a = null;
    }

    public synchronized void a(Provider<T> provider) {
        if (this.b == null) {
            this.a.add(provider);
        } else {
            this.b.add(provider.get());
        }
    }

    @Override // com.google.firebase.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
