package org.greenrobot.greendao.identityscope;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.internal.LongHashMap;

/* JADX INFO: loaded from: classes23.dex */
public class IdentityScopeLong<T> implements IdentityScope<Long, T> {
    private final LongHashMap<Reference<T>> a = new LongHashMap<>();
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

    public T get2(long j) {
        this.b.lock();
        try {
            Reference<T> reference = this.a.get(j);
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

    public T get2NoLock(long j) {
        Reference<T> reference = this.a.get(j);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void lock() {
        this.b.lock();
    }

    public void put2(long j, T t) {
        this.b.lock();
        try {
            this.a.put(j, new WeakReference(t));
        } finally {
            this.b.unlock();
        }
    }

    public void put2NoLock(long j, T t) {
        this.a.put(j, new WeakReference(t));
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void reserveRoom(int i) {
        this.a.reserveRoom(i);
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void unlock() {
        this.b.unlock();
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public boolean detach(Long l, T t) {
        boolean z;
        this.b.lock();
        try {
            if (get(l) != t || t == null) {
                z = false;
            } else {
                remove(l);
                z = true;
            }
            return z;
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T get(Long l) {
        return get2(l.longValue());
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T getNoLock(Long l) {
        return get2NoLock(l.longValue());
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void put(Long l, T t) {
        put2(l.longValue(), t);
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void putNoLock(Long l, T t) {
        put2NoLock(l.longValue(), t);
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(Long l) {
        this.b.lock();
        try {
            this.a.remove(l.longValue());
        } finally {
            this.b.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(Iterable<Long> iterable) {
        this.b.lock();
        try {
            Iterator<Long> it2 = iterable.iterator();
            while (it2.hasNext()) {
                this.a.remove(it2.next().longValue());
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }
}
