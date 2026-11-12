package rx.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Subscription;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class IndexedRingBuffer<E> implements Subscription {
    public static final int e;
    private final a<E> a = new a<>();
    private final b b = new b();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();

    public static final class a<E> {
        public final AtomicReferenceArray<E> a = new AtomicReferenceArray<>(IndexedRingBuffer.e);
        public final AtomicReference<a<E>> b = new AtomicReference<>();

        public a<E> a() {
            if (this.b.get() != null) {
                return this.b.get();
            }
            a<E> aVar = new a<>();
            return this.b.compareAndSet(null, aVar) ? aVar : this.b.get();
        }
    }

    public static class b {
        private final AtomicIntegerArray a = new AtomicIntegerArray(IndexedRingBuffer.e);
        private final AtomicReference<b> b = new AtomicReference<>();

        public int a(int i, int i2) {
            return this.a.getAndSet(i, i2);
        }

        public b b() {
            if (this.b.get() != null) {
                return this.b.get();
            }
            b bVar = new b();
            return this.b.compareAndSet(null, bVar) ? bVar : this.b.get();
        }

        public void c(int i, int i2) {
            this.a.set(i, i2);
        }
    }

    static {
        int i = PlatformDependent.isAndroid() ? 8 : 128;
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e2) {
                System.err.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e2.getMessage());
            }
        }
        e = i;
    }

    private int a(Func1<? super E, Boolean> func1, int i, int i2) {
        a<E> aVar;
        int i3 = this.c.get();
        a<E> aVar2 = this.a;
        int i4 = e;
        if (i >= i4) {
            a<E> aVarB = b(i);
            i %= i4;
            aVar = aVarB;
        } else {
            aVar = aVar2;
        }
        loop0: while (aVar != null) {
            while (i < e) {
                if (i >= i3 || i >= i2) {
                    break loop0;
                }
                E e2 = aVar.a.get(i);
                if (e2 != null && !func1.call(e2).booleanValue()) {
                    return i;
                }
                i++;
                i++;
            }
            aVar = aVar.b.get();
            i = 0;
        }
        return i;
    }

    private a<E> b(int i) {
        int i2 = e;
        if (i < i2) {
            return this.a;
        }
        int i3 = i / i2;
        a<E> aVarA = this.a;
        for (int i4 = 0; i4 < i3; i4++) {
            aVarA = aVarA.a();
        }
        return aVarA;
    }

    private synchronized int c() {
        int andIncrement;
        int iD = d();
        if (iD >= 0) {
            int i = e;
            if (iD < i) {
                andIncrement = this.b.a(iD, -1);
            } else {
                andIncrement = e(iD).a(iD % i, -1);
            }
            if (andIncrement == this.c.get()) {
                this.c.getAndIncrement();
            }
        } else {
            andIncrement = this.c.getAndIncrement();
        }
        return andIncrement;
    }

    private synchronized int d() {
        int i;
        int i2;
        do {
            i = this.d.get();
            if (i <= 0) {
                return -1;
            }
            i2 = i - 1;
        } while (!this.d.compareAndSet(i, i2));
        return i2;
    }

    private b e(int i) {
        int i2 = e;
        if (i < i2) {
            return this.b;
        }
        int i3 = i / i2;
        b bVarB = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            bVarB = bVarB.b();
        }
        return bVarB;
    }

    private synchronized void f(int i) {
        int andIncrement = this.d.getAndIncrement();
        int i2 = e;
        if (andIncrement < i2) {
            this.b.c(andIncrement, i);
        } else {
            e(andIncrement).c(andIncrement % i2, i);
        }
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return new IndexedRingBuffer<>();
    }

    public int add(E e2) {
        int iC = c();
        int i = e;
        if (iC < i) {
            this.a.a.set(iC, e2);
            return iC;
        }
        b(iC).a.set(iC % i, e2);
        return iC;
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public void releaseToPool() {
        int i = this.c.get();
        int i2 = 0;
        loop0: for (a<E> aVar = this.a; aVar != null; aVar = aVar.b.get()) {
            int i3 = 0;
            while (i3 < e) {
                if (i2 >= i) {
                    break loop0;
                }
                aVar.a.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.c.set(0);
        this.d.set(0);
    }

    public E remove(int i) {
        E andSet;
        int i2 = e;
        if (i < i2) {
            andSet = this.a.a.getAndSet(i, null);
        } else {
            andSet = b(i).a.getAndSet(i % i2, null);
        }
        f(i);
        return andSet;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i) {
        int iA = a(func1, i, this.c.get());
        if (i > 0 && iA == this.c.get()) {
            return a(func1, 0, i);
        }
        if (iA == this.c.get()) {
            return 0;
        }
        return iA;
    }
}
