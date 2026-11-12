package org.greenrobot.greendao.identityscope;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes23.dex */
public class IdentityScopeObject<K, T> implements IdentityScope<K, T> {
    private final HashMap<K, Reference<T>> a = new HashMap<>();
    private final ReentrantLock b = new ReentrantLock();

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void clear() {
        this.b.lock();
        try {
            this.a.clear();
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public boolean detach(K k, T t) {
        boolean z;
        this.b.lock();
        try {
            if (get(k) != t || t == null) {
                z = false;
            } else {
                remove(k);
                z = true;
            }
            return z;
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T get(K k) {
        this.b.lock();
        try {
            Reference<T> reference = this.a.get(k);
            this.b.unlock();
            if (reference != null) {
                return reference.get();
            }
            return null;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T getNoLock(K k) {
        Reference<T> reference = this.a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void lock() {
        this.b.lock();
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void put(K k, T t) {
        this.b.lock();
        try {
            this.a.put(k, new WeakReference(t));
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void putNoLock(K k, T t) {
        this.a.put(k, new WeakReference(t));
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(K k) {
        this.b.lock();
        try {
            this.a.remove(k);
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void reserveRoom(int i) {
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void unlock() {
        this.b.unlock();
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(Iterable<K> iterable) {
        this.b.lock();
        try {
            Iterator<K> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.a.remove(it2.next());
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }
}
