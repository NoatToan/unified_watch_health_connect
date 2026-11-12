package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible(emulated = true)
abstract class d {
    private static final b c;
    private static final Logger d = Logger.getLogger(d.class.getName());
    private volatile Set<Throwable> a = null;
    private volatile int b;

    public static abstract class b {
        private b() {
        }

        public abstract void a(d dVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(d dVar);
    }

    public static final class c extends b {
        public final AtomicReferenceFieldUpdater<d, Set<Throwable>> a;
        public final AtomicIntegerFieldUpdater<d> b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.d.b
        public void a(d dVar, Set<Throwable> set, Set<Throwable> set2) {
            this.a.compareAndSet(dVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.d.b
        public int b(d dVar) {
            return this.b.decrementAndGet(dVar);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.d$d, reason: collision with other inner class name */
    public static final class C0242d extends b {
        private C0242d() {
            super();
        }

        @Override // com.google.common.util.concurrent.d.b
        public void a(d dVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (dVar) {
                if (dVar.a == set) {
                    dVar.a = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.d.b
        public int b(d dVar) {
            int i;
            synchronized (dVar) {
                d.d(dVar);
                i = dVar.b;
            }
            return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b c0242d;
        Throwable th = null;
        Object[] objArr = 0;
        try {
            c0242d = new c(AtomicReferenceFieldUpdater.newUpdater(d.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(d.class, "b"));
        } catch (Throwable th2) {
            c0242d = new C0242d();
            th = th2;
        }
        c = c0242d;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public d(int i) {
        this.b = i;
    }

    public static /* synthetic */ int d(d dVar) {
        int i = dVar.b;
        dVar.b = i - 1;
        return i;
    }

    public abstract void e(Set<Throwable> set);

    public final int f() {
        return c.b(this);
    }

    public final Set<Throwable> g() {
        Set<Throwable> set = this.a;
        if (set != null) {
            return set;
        }
        Set<Throwable> setNewConcurrentHashSet = Sets.newConcurrentHashSet();
        e(setNewConcurrentHashSet);
        c.a(this, null, setNewConcurrentHashSet);
        return this.a;
    }
}
