package z33;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class t extends AbstractList<String> implements RandomAccess, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f202245a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<String> f202246a;

        public a(t tVar, int i14) {
            this.f202246a = tVar.f202245a.listIterator(i14);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f202246a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f202246a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f202246a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f202246a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f202246a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f202246a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<String> f202247a;

        public b(t tVar) {
            this.f202247a = tVar.f202245a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202247a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f202247a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t(l lVar) {
        this.f202245a = lVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        return (String) this.f202245a.get(i14);
    }

    @Override // z33.l
    public final c getByteString(int i14) {
        return this.f202245a.getByteString(i14);
    }

    @Override // z33.l
    public final List<?> getUnderlyingElements() {
        return this.f202245a.getUnderlyingElements();
    }

    @Override // z33.l
    public final t getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i14) {
        return new a(this, i14);
    }

    @Override // z33.l
    public final void n2(m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f202245a.size();
    }
}
