package p13;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp13/y0;", "T", "Lp13/c;", "", "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class y0<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f134966b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010*\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/y0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ListIterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f134967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0<T> f134968b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(y0<? extends T> y0Var, int i14) {
            this.f134968b = y0Var;
            this.f134967a = y0Var.f134966b.listIterator(e0.I(i14, y0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f134967a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f134967a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f134967a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return x.j(this.f134968b) - this.f134967a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f134967a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return x.j(this.f134968b) - this.f134967a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(List<? extends T> list) {
        list.getClass();
        this.f134966b = list;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f134966b.size();
    }

    @Override // java.util.List
    public final T get(int i14) {
        return this.f134966b.get(e0.H(i14, this));
    }

    @Override // p13.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<T> listIterator(int i14) {
        return new a(this, i14);
    }
}
