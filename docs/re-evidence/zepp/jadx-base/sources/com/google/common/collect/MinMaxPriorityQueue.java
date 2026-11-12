package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int g = 1431655765;
    private static final int h = -1431655766;
    private static final int i = 11;
    private final MinMaxPriorityQueue<E>.b a;
    private final MinMaxPriorityQueue<E>.b b;

    @VisibleForTesting
    public final int c;
    private Object[] d;
    private int e;
    private int f;

    @Beta
    public static final class Builder<B> {
        private static final int d = -1;
        private final Comparator<B> a;
        private int b;
        private int c;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> c() {
            return Ordering.from(this.a);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.emptySet());
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i) {
            Preconditions.checkArgument(i >= 0);
            this.b = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i) {
            Preconditions.checkArgument(i > 0);
            this.c = i;
            return this;
        }

        private Builder(Comparator<B> comparator) {
            this.b = -1;
            this.c = Integer.MAX_VALUE;
            this.a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.l(this.b, this.c, iterable));
            Iterator<? extends T> it2 = iterable.iterator();
            while (it2.hasNext()) {
                minMaxPriorityQueue.offer(it2.next());
            }
            return minMaxPriorityQueue;
        }
    }

    public class b {
        public final Ordering<E> a;

        @Weak
        @MonotonicNonNullDecl
        public MinMaxPriorityQueue<E>.b b;

        public b(Ordering<E> ordering) {
            this.a = ordering;
        }

        private int k(int i) {
            return m(m(i));
        }

        private int l(int i) {
            return (i * 2) + 1;
        }

        private int m(int i) {
            return (i - 1) / 2;
        }

        private int n(int i) {
            return (i * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q(int i) {
            if (l(i) < MinMaxPriorityQueue.this.e && d(i, l(i)) > 0) {
                return false;
            }
            if (n(i) < MinMaxPriorityQueue.this.e && d(i, n(i)) > 0) {
                return false;
            }
            if (i <= 0 || d(i, m(i)) <= 0) {
                return i <= 2 || d(k(i), i) <= 0;
            }
            return false;
        }

        public void b(int i, E e) {
            b bVar;
            int iF = f(i, e);
            if (iF == i) {
                iF = i;
                bVar = this;
            } else {
                bVar = this.b;
            }
            bVar.c(iF, e);
        }

        @CanIgnoreReturnValue
        public int c(int i, E e) {
            while (i > 2) {
                int iK = k(i);
                Object objG = MinMaxPriorityQueue.this.g(iK);
                if (this.a.compare((E) objG, e) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.d[i] = objG;
                i = iK;
            }
            MinMaxPriorityQueue.this.d[i] = e;
            return i;
        }

        public int d(int i, int i2) {
            return this.a.compare((E) MinMaxPriorityQueue.this.g(i), (E) MinMaxPriorityQueue.this.g(i2));
        }

        public int e(int i, E e) {
            int i2 = i(i);
            if (i2 <= 0 || this.a.compare((E) MinMaxPriorityQueue.this.g(i2), e) >= 0) {
                return f(i, e);
            }
            MinMaxPriorityQueue.this.d[i] = MinMaxPriorityQueue.this.g(i2);
            MinMaxPriorityQueue.this.d[i2] = e;
            return i2;
        }

        public int f(int i, E e) {
            int iN;
            if (i == 0) {
                MinMaxPriorityQueue.this.d[0] = e;
                return 0;
            }
            int iM = m(i);
            Object objG = MinMaxPriorityQueue.this.g(iM);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= MinMaxPriorityQueue.this.e) {
                Object objG2 = MinMaxPriorityQueue.this.g(iN);
                if (this.a.compare((E) objG2, (E) objG) < 0) {
                    iM = iN;
                    objG = objG2;
                }
            }
            if (this.a.compare((E) objG, e) >= 0) {
                MinMaxPriorityQueue.this.d[i] = e;
                return i;
            }
            MinMaxPriorityQueue.this.d[i] = objG;
            MinMaxPriorityQueue.this.d[iM] = e;
            return iM;
        }

        public int g(int i) {
            while (true) {
                int iJ = j(i);
                if (iJ <= 0) {
                    return i;
                }
                MinMaxPriorityQueue.this.d[i] = MinMaxPriorityQueue.this.g(iJ);
                i = iJ;
            }
        }

        public int h(int i, int i2) {
            if (i >= MinMaxPriorityQueue.this.e) {
                return -1;
            }
            Preconditions.checkState(i > 0);
            int iMin = Math.min(i, MinMaxPriorityQueue.this.e - i2) + i2;
            for (int i3 = i + 1; i3 < iMin; i3++) {
                if (d(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        public int i(int i) {
            return h(l(i), 2);
        }

        public int j(int i) {
            int iL = l(i);
            if (iL < 0) {
                return -1;
            }
            return h(l(iL), 4);
        }

        public int o(E e) {
            int iN;
            int iM = m(MinMaxPriorityQueue.this.e);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= MinMaxPriorityQueue.this.e) {
                Object objG = MinMaxPriorityQueue.this.g(iN);
                if (this.a.compare((E) objG, e) < 0) {
                    MinMaxPriorityQueue.this.d[iN] = e;
                    MinMaxPriorityQueue.this.d[MinMaxPriorityQueue.this.e] = objG;
                    return iN;
                }
            }
            return MinMaxPriorityQueue.this.e;
        }

        public c<E> p(int i, int i2, E e) {
            int iE = e(i2, e);
            if (iE == i2) {
                return null;
            }
            Object objG = iE < i ? MinMaxPriorityQueue.this.g(i) : MinMaxPriorityQueue.this.g(m(i));
            if (this.b.c(iE, e) < i) {
                return new c<>(e, objG);
            }
            return null;
        }
    }

    public static class c<E> {
        public final E a;
        public final E b;

        public c(E e, E e2) {
            this.a = e;
            this.b = e2;
        }
    }

    public class d implements Iterator<E> {
        private int a;
        private int b;
        private int c;

        @MonotonicNonNullDecl
        private Queue<E> d;

        @MonotonicNonNullDecl
        private List<E> e;

        @NullableDecl
        private E f;
        private boolean g;

        private d() {
            this.a = -1;
            this.b = -1;
            this.c = MinMaxPriorityQueue.this.f;
        }

        private void a() {
            if (MinMaxPriorityQueue.this.f != this.c) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean b(Iterable<E> iterable, E e) {
            Iterator<E> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (it2.next() == e) {
                    it2.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void c(int i) {
            if (this.b < i) {
                if (this.e != null) {
                    while (i < MinMaxPriorityQueue.this.size() && b(this.e, MinMaxPriorityQueue.this.g(i))) {
                        i++;
                    }
                }
                this.b = i;
            }
        }

        private boolean d(Object obj) {
            for (int i = 0; i < MinMaxPriorityQueue.this.e; i++) {
                if (MinMaxPriorityQueue.this.d[i] == obj) {
                    MinMaxPriorityQueue.this.p(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            c(this.a + 1);
            if (this.b < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue<E> queue = this.d;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            c(this.a + 1);
            if (this.b < MinMaxPriorityQueue.this.size()) {
                int i = this.b;
                this.a = i;
                this.g = true;
                return (E) MinMaxPriorityQueue.this.g(i);
            }
            if (this.d != null) {
                this.a = MinMaxPriorityQueue.this.size();
                E ePoll = this.d.poll();
                this.f = ePoll;
                if (ePoll != null) {
                    this.g = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.g);
            a();
            this.g = false;
            this.c++;
            if (this.a >= MinMaxPriorityQueue.this.size()) {
                Preconditions.checkState(d(this.f));
                this.f = null;
                return;
            }
            c<E> cVarP = MinMaxPriorityQueue.this.p(this.a);
            if (cVarP != null) {
                if (this.d == null) {
                    this.d = new ArrayDeque();
                    this.e = new ArrayList(3);
                }
                if (!b(this.e, cVarP.a)) {
                    this.d.add(cVarP.a);
                }
                if (!b(this.d, cVarP.b)) {
                    this.e.add(cVarP.b);
                }
            }
            this.a--;
            this.b--;
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    private int d() {
        int length = this.d.length;
        return e(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.c);
    }

    private static int e(int i2, int i3) {
        return Math.min(i2 - 1, i3) + 1;
    }

    public static Builder<Comparable> expectedSize(int i2) {
        return new Builder(Ordering.natural()).expectedSize(i2);
    }

    private c<E> h(int i2, E e) {
        MinMaxPriorityQueue<E>.b bVarK = k(i2);
        int iG = bVarK.g(i2);
        int iC = bVarK.c(iG, e);
        if (iC == iG) {
            return bVarK.p(i2, iG, e);
        }
        if (iC < i2) {
            return new c<>(e, g(i2));
        }
        return null;
    }

    private int i() {
        int i2 = this.e;
        if (i2 != 1) {
            return (i2 == 2 || this.b.d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void j() {
        if (this.e > this.d.length) {
            Object[] objArr = new Object[d()];
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.d = objArr;
        }
    }

    private MinMaxPriorityQueue<E>.b k(int i2) {
        return m(i2) ? this.a : this.b;
    }

    @VisibleForTesting
    public static int l(int i2, int i3, Iterable<?> iterable) {
        if (i2 == -1) {
            i2 = 11;
        }
        if (iterable instanceof Collection) {
            i2 = Math.max(i2, ((Collection) iterable).size());
        }
        return e(i2, i3);
    }

    @VisibleForTesting
    public static boolean m(int i2) {
        int i3 = ~(~(i2 + 1));
        Preconditions.checkState(i3 > 0, "negative index");
        return (g & i3) > (i3 & h);
    }

    public static Builder<Comparable> maximumSize(int i2) {
        return new Builder(Ordering.natural()).maximumSize(i2);
    }

    private E o(int i2) {
        E eG = g(i2);
        p(i2);
        return eG;
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e) {
        offer(e);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            offer(it2.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i2 = 0; i2 < this.e; i2++) {
            this.d[i2] = null;
        }
        this.e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.a.a;
    }

    @VisibleForTesting
    public int f() {
        return this.d.length;
    }

    public E g(int i2) {
        return (E) this.d[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new d();
    }

    @VisibleForTesting
    public boolean n() {
        for (int i2 = 1; i2 < this.e; i2++) {
            if (!k(i2).q(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
        Preconditions.checkNotNull(e);
        this.f++;
        int i2 = this.e;
        this.e = i2 + 1;
        j();
        k(i2).b(i2, e);
        return this.e <= this.c || pollLast() != e;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public c<E> p(int i2) {
        Preconditions.checkPositionIndex(i2, this.e);
        this.f++;
        int i3 = this.e - 1;
        this.e = i3;
        if (i3 == i2) {
            this.d[i3] = null;
            return null;
        }
        E eG = g(i3);
        int iO = k(this.e).o(eG);
        if (iO == i2) {
            this.d[this.e] = null;
            return null;
        }
        E eG2 = g(this.e);
        this.d[this.e] = null;
        c<E> cVarH = h(i2, eG2);
        if (iO < i2) {
            return cVarH == null ? new c<>(eG, eG2) : new c<>(eG, cVarH.b);
        }
        return cVarH;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return g(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return g(i());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return o(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return o(i());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return o(i());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i2 = this.e;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.d, 0, objArr, 0, i2);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i2) {
        Ordering orderingC = builder.c();
        MinMaxPriorityQueue<E>.b bVar = new b(orderingC);
        this.a = bVar;
        MinMaxPriorityQueue<E>.b bVar2 = new b(orderingC.reverse());
        this.b = bVar2;
        bVar.b = bVar2;
        bVar2.b = bVar;
        this.c = ((Builder) builder).c;
        this.d = new Object[i2];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
