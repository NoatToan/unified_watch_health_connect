package h5;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lh5/v;", "", "Lh4/r$c;", "<init>", "()V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements List<h4.r.c>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.q0<Object> f82000a = new p1.q0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.l0 f82001b = new p1.l0(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82002c = -1;

    public final long a() {
        long jE = ge1.b.e(false, false, Float.POSITIVE_INFINITY);
        int i14 = this.f82002c + 1;
        int i15 = this.f82000a.f134668b - 1;
        if (i14 > i15) {
            return jE;
        }
        while (true) {
            p1.l0 l0Var = this.f82001b;
            if (i14 < 0) {
                l0Var.getClass();
                break;
            }
            if (i14 >= l0Var.f134838b) {
                break;
            }
            long j8 = l0Var.f134837a[i14];
            if (q.a(j8, jE) < 0) {
                jE = j8;
            }
            if ((q.b(jE) < 0.0f && q.d(jE)) || i14 == i15) {
                return jE;
            }
            i14++;
        }
        org.apache.commons.lang3.e.v("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i14, h4.r.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends h4.r.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i14, int i15) {
        if (i14 >= i15) {
            return;
        }
        this.f82000a.m(i14, i15);
        p1.l0 l0Var = this.f82001b;
        if (i14 >= 0) {
            int i16 = l0Var.f134838b;
            if (i14 <= i16 && i15 >= 0 && i15 <= i16) {
                if (i15 < i14) {
                    vb.h.s("The end index must be < start index");
                    return;
                } else {
                    if (i15 != i14) {
                        if (i15 < i16) {
                            long[] jArr = l0Var.f134837a;
                            p13.s.g(jArr, jArr, i14, i15, i16);
                        }
                        l0Var.f134838b -= i15 - i14;
                        return;
                    }
                    return;
                }
            }
        } else {
            l0Var.getClass();
        }
        org.apache.commons.lang3.e.v("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f82002c = -1;
        this.f82000a.j();
        this.f82001b.f134838b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof h4.r.c) && indexOf((h4.r.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((h4.r.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final h4.r.c get(int i14) {
        Object objB = this.f82000a.b(i14);
        objB.getClass();
        return (h4.r.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof h4.r.c)) {
            return -1;
        }
        h4.r.c cVar = (h4.r.c) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i14 = 0;
            while (!p005kotlin.jvm.internal.s.g(this.f82000a.b(i14), cVar)) {
                if (i14 != size) {
                    i14++;
                }
            }
            return i14;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f82000a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<h4.r.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof h4.r.c)) {
            return -1;
        }
        h4.r.c cVar = (h4.r.c) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (p005kotlin.jvm.internal.s.g(this.f82000a.b(size), cVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<h4.r.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h4.r.c remove(int i14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<h4.r.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h4.r.c set(int i14, h4.r.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f82000a.f134668b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super h4.r.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<h4.r.c> subList(int i14, int i15) {
        return new b(i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh5/v$b;", "", "Lh4/r$c;", "", "minIndex", "maxIndex", "<init>", "(Lh5/v;II)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements List<h4.r.c>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82008b;

        public b(int i14, int i15) {
            this.f82007a = i14;
            this.f82008b = i15;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i14, h4.r.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i14, Collection<? extends h4.r.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof h4.r.c) && indexOf((h4.r.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((h4.r.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final h4.r.c get(int i14) {
            Object objB = v.this.f82000a.b(i14 + this.f82007a);
            objB.getClass();
            return (h4.r.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof h4.r.c)) {
                return -1;
            }
            h4.r.c cVar = (h4.r.c) obj;
            int i14 = this.f82007a;
            int i15 = this.f82008b;
            if (i14 <= i15) {
                int i16 = i14;
                while (!p005kotlin.jvm.internal.s.g(v.this.f82000a.b(i16), cVar)) {
                    if (i16 != i15) {
                        i16++;
                    }
                }
                return i16 - i14;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<h4.r.c> iterator() {
            int i14 = this.f82007a;
            return v.this.new a(i14, i14, this.f82008b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof h4.r.c)) {
                return -1;
            }
            h4.r.c cVar = (h4.r.c) obj;
            int i14 = this.f82008b;
            int i15 = this.f82007a;
            if (i15 <= i14) {
                while (!p005kotlin.jvm.internal.s.g(v.this.f82000a.b(i14), cVar)) {
                    if (i14 != i15) {
                        i14--;
                    }
                }
                return i14 - i15;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<h4.r.c> listIterator(int i14) {
            int i15 = this.f82007a;
            int i16 = this.f82008b;
            return v.this.new a(i14 + i15, i15, i16);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ h4.r.c remove(int i14) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<h4.r.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ h4.r.c set(int i14, h4.r.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f82008b - this.f82007a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super h4.r.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<h4.r.c> subList(int i14, int i15) {
            int i16 = this.f82007a;
            return v.this.new b(i14 + i16, i16 + i15);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return p005kotlin.jvm.internal.i.c(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends h4.r.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<h4.r.c> listIterator() {
            int i14 = this.f82007a;
            return v.this.new a(i14, i14, this.f82008b);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends h4.r.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<h4.r.c> listIterator(int i14) {
        return new a(this, i14, 0, 0, 6, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh5/v$a;", "", "Lh4/r$c;", "", FirebaseAnalytics.Param.INDEX, "minIndex", "maxIndex", "<init>", "(Lh5/v;III)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements ListIterator<h4.r.c>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82005c;

        public a(v vVar, int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
            this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? vVar.f82000a.f134668b : i16);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(h4.r.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f82003a < this.f82005c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f82003a > this.f82004b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            p1.q0<Object> q0Var = v.this.f82000a;
            int i14 = this.f82003a;
            this.f82003a = i14 + 1;
            Object objB = q0Var.b(i14);
            objB.getClass();
            return (h4.r.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f82003a - this.f82004b;
        }

        @Override // java.util.ListIterator
        public final h4.r.c previous() {
            p1.q0<Object> q0Var = v.this.f82000a;
            int i14 = this.f82003a - 1;
            this.f82003a = i14;
            Object objB = q0Var.b(i14);
            objB.getClass();
            return (h4.r.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f82003a - this.f82004b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(h4.r.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i14, int i15, int i16) {
            this.f82003a = i14;
            this.f82004b = i15;
            this.f82005c = i16;
        }
    }
}
