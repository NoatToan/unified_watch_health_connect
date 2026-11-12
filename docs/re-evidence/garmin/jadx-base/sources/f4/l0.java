package f4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p3.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf4/l0;", "T", "", "Lf4/s;", "parentList", "", "fromIndex", "toIndex", "<init>", "(Lf4/s;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0<T> implements List<T>, f23.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s<T> f68784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68787d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010+\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"f4/l0$a", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ListIterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0 f68788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0<T> f68789b;

        public a(p0 p0Var, l0<T> l0Var) {
            this.f68788a = p0Var;
            this.f68789b = l0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f68788a.f105807a < this.f68789b.f68787d - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f68788a.f105807a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            p0 p0Var = this.f68788a;
            int i14 = p0Var.f105807a + 1;
            l0<T> l0Var = this.f68789b;
            t.a(i14, l0Var.f68787d);
            p0Var.f105807a = i14;
            return l0Var.get(i14);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f68788a.f105807a + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            p0 p0Var = this.f68788a;
            int i14 = p0Var.f105807a;
            l0<T> l0Var = this.f68789b;
            t.a(i14, l0Var.f68787d);
            p0Var.f105807a = i14 - 1;
            return l0Var.get(i14);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f68788a.f105807a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public l0(s<T> sVar, int i14, int i15) {
        this.f68784a = sVar;
        this.f68785b = i14;
        this.f68786c = t.e(sVar);
        this.f68787d = i15 - i14;
    }

    public final void a() {
        if (t.e(this.f68784a) == this.f68786c) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t7) {
        a();
        int i14 = this.f68785b + this.f68787d;
        s<T> sVar = this.f68784a;
        sVar.add(i14, t7);
        this.f68787d++;
        this.f68786c = t.e(sVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends T> collection) {
        a();
        int i15 = i14 + this.f68785b;
        s<T> sVar = this.f68784a;
        boolean zAddAll = sVar.addAll(i15, collection);
        if (zAddAll) {
            this.f68787d = collection.size() + this.f68787d;
            this.f68786c = t.e(sVar);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f68787d > 0) {
            a();
            int i14 = this.f68787d;
            int i15 = this.f68785b;
            s<T> sVar = this.f68784a;
            sVar.b(i15, i14 + i15);
            this.f68787d = 0;
            this.f68786c = t.e(sVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i14) {
        a();
        t.a(i14, this.f68787d);
        return this.f68784a.get(this.f68785b + i14);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i14 = this.f68787d;
        int i15 = this.f68785b;
        Iterator<Integer> it = j23.t.o(i15, i14 + i15).iterator();
        while (it.hasNext()) {
            int iNextInt = ((p13.p0) it).nextInt();
            if (p005kotlin.jvm.internal.s.g(obj, this.f68784a.get(iNextInt))) {
                return iNextInt - i15;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f68787d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i14 = this.f68787d;
        int i15 = this.f68785b;
        for (int i16 = (i14 + i15) - 1; i16 >= i15; i16--) {
            if (p005kotlin.jvm.internal.s.g(obj, this.f68784a.get(i16))) {
                return i16 - i15;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i14) {
        a();
        p0 p0Var = new p0();
        p0Var.f105807a = i14 - 1;
        return new a(p0Var, this);
    }

    @Override // java.util.List
    public final T remove(int i14) {
        a();
        int i15 = this.f68785b + i14;
        s<T> sVar = this.f68784a;
        T tRemove = sVar.remove(i15);
        this.f68787d--;
        this.f68786c = t.e(sVar);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z14 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z14) {
                    z14 = true;
                }
            }
            return z14;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i14;
        u3.c<? extends T> cVar;
        f fVarI;
        boolean zB;
        a();
        s<T> sVar = this.f68784a;
        int i15 = this.f68785b;
        int i16 = this.f68787d + i15;
        int size = sVar.size();
        do {
            synchronized (t.f68805a) {
                a0 a0Var = sVar.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            v3.f fVarBuilder = cVar.builder();
            fVarBuilder.subList(i15, i16).retainAll(collection);
            u3.c cVarC = fVarBuilder.c();
            if (p005kotlin.jvm.internal.s.g(cVarC, cVar)) {
                break;
            }
            a0 a0Var3 = sVar.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = t.b((a0) l.v(a0Var3, sVar, fVarI), i14, cVarC, true);
            }
            l.m(fVarI, sVar);
        } while (!zB);
        int size2 = size - sVar.size();
        if (size2 > 0) {
            this.f68786c = t.e(this.f68784a);
            this.f68787d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i14, T t7) {
        t.a(i14, this.f68787d);
        a();
        int i15 = i14 + this.f68785b;
        s<T> sVar = this.f68784a;
        T t14 = sVar.set(i15, t7);
        this.f68786c = t.e(sVar);
        return t14;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f68787d;
    }

    @Override // java.util.List
    public final List<T> subList(int i14, int i15) {
        if (!(i14 >= 0 && i14 <= i15 && i15 <= this.f68787d)) {
            j2.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i16 = this.f68785b;
        return new l0(this.f68784a, i14 + i16, i15 + i16);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i14, T t7) {
        a();
        int i15 = this.f68785b + i14;
        s<T> sVar = this.f68784a;
        sVar.add(i15, t7);
        this.f68787d++;
        this.f68786c = t.e(sVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.f68787d, collection);
    }
}
