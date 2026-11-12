package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class cpd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends iz9<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f14589b;
        public final /* synthetic */ h6i c;

        public a(Iterable iterable, h6i h6iVar) {
            this.f14589b = iterable;
            this.c = h6iVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return epd.k(this.f14589b.iterator(), this.c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends iz9<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f14590b;
        public final /* synthetic */ dua c;

        public b(Iterable iterable, dua duaVar) {
            this.f14590b = iterable;
            this.c = duaVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return epd.w(this.f14590b.iterator(), this.c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> extends iz9<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f14591b;
        public final /* synthetic */ int c;

        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f14592a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f14593b;

            public a(c cVar, Iterator it) {
                this.f14593b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f14593b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) this.f14593b.next();
                this.f14592a = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                d44.e(!this.f14592a);
                this.f14593b.remove();
            }
        }

        public c(Iterable iterable, int i) {
            this.f14591b = iterable;
            this.c = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f14591b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            epd.b(it, this.c);
            return new a(this, it);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : epd.a(collection, ((Iterable) c6i.o(iterable)).iterator());
    }

    public static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : xhe.i(iterable.iterator());
    }

    public static <T> Iterable<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return iz9.e(iterable, iterable2);
    }

    public static <T> Iterable<T> d(Iterable<T> iterable, h6i<? super T> h6iVar) {
        c6i.o(iterable);
        c6i.o(h6iVar);
        return new a(iterable, h6iVar);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t) {
        return (T) epd.m(iterable.iterator(), t);
    }

    public static <T> T f(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) epd.l(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) g(list);
    }

    public static <T> T g(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T h(Iterable<T> iterable) {
        return (T) epd.n(iterable.iterator());
    }

    public static boolean i(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> j(Iterable<T> iterable, int i) {
        c6i.o(iterable);
        c6i.e(i >= 0, "number to skip cannot be negative");
        return new c(iterable, i);
    }

    public static Object[] k(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    public static <T> T[] l(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) b(iterable).toArray(tArr);
    }

    public static String m(Iterable<?> iterable) {
        return epd.v(iterable.iterator());
    }

    public static <F, T> Iterable<T> n(Iterable<F> iterable, dua<? super F, ? extends T> duaVar) {
        c6i.o(iterable);
        c6i.o(duaVar);
        return new b(iterable, duaVar);
    }
}
