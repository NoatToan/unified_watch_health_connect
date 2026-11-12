package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class xhe {

    public static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<F> f39127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dua<? super F, ? extends T> f39128b;

        /* JADX INFO: renamed from: xhe$a$a, reason: collision with other inner class name */
        public class C1147a extends qyp<F, T> {
            public C1147a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.pyp
            public T a(F f) {
                return a.this.f39128b.apply(f);
            }
        }

        public a(List<F> list, dua<? super F, ? extends T> duaVar) {
            this.f39127a = (List) c6i.o(list);
            this.f39128b = (dua) c6i.o(duaVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f39127a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.f39128b.apply(this.f39127a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f39127a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C1147a(this.f39127a.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f39128b.apply(this.f39127a.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f39127a.size();
        }
    }

    public static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<F> f39130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dua<? super F, ? extends T> f39131b;

        public class a extends qyp<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.pyp
            public T a(F f) {
                return b.this.f39131b.apply(f);
            }
        }

        public b(List<F> list, dua<? super F, ? extends T> duaVar) {
            this.f39130a = (List) c6i.o(list);
            this.f39131b = (dua) c6i.o(duaVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f39130a.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.f39130a.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f39130a.size();
        }
    }

    public static int a(int i) {
        d44.b(i, "arraySize");
        return ahd.j(((long) i) + 5 + ((long) (i / 10)));
    }

    public static boolean b(List<?> list, Object obj) {
        if (obj == c6i.o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return epd.g(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!j4h.a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (j4h.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (j4h.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> h(Iterable<? extends E> iterable) {
        c6i.o(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : i(iterable.iterator());
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> arrayListG = g();
        epd.a(arrayListG, it);
        return arrayListG;
    }

    public static <E> ArrayList<E> j(int i) {
        d44.b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> k(int i) {
        return new ArrayList<>(a(i));
    }

    public static <F, T> List<T> l(List<F> list, dua<? super F, ? extends T> duaVar) {
        return list instanceof RandomAccess ? new a(list, duaVar) : new b(list, duaVar);
    }
}
