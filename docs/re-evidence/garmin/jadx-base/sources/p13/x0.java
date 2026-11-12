package p13;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp13/x0;", "T", "Lp13/f;", "", "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0<T> extends f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f134963a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010+\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/x0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ListIterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f134964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0<T> f134965b;

        public a(x0<T> x0Var, int i14) {
            this.f134965b = x0Var;
            this.f134964a = x0Var.f134963a.listIterator(e0.I(i14, x0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t7) {
            ListIterator<T> listIterator = this.f134964a;
            listIterator.add(t7);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f134964a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f134964a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f134964a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return x.j(this.f134965b) - this.f134964a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f134964a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return x.j(this.f134965b) - this.f134964a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f134964a.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t7) {
            this.f134964a.set(t7);
        }
    }

    public x0(List<T> list) {
        list.getClass();
        this.f134963a = list;
    }

    @Override // p13.f
    /* JADX INFO: renamed from: a */
    public final int getF97124f() {
        return this.f134963a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, T t7) {
        this.f134963a.add(e0.I(i14, this), t7);
    }

    @Override // p13.f
    public final T b(int i14) {
        return this.f134963a.remove(e0.H(i14, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f134963a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i14) {
        return this.f134963a.get(e0.H(i14, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i14, T t7) {
        return this.f134963a.set(e0.H(i14, this), t7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i14) {
        return new a(this, i14);
    }
}
