package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class amn {
    public static int b(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return Iterators.j(iterable.iterator());
    }

    public static boolean e(Iterable<? extends Object> iterable, @CheckForNull Object obj) {
        if (iterable instanceof Collection) {
            return alf.a((Collection<?>) iterable, obj);
        }
        return Iterators.b(iterable.iterator(), obj);
    }

    public static <T> boolean e(Iterable<T> iterable, Predicate<? super T> predicate) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return b((List) iterable, (Predicate) Preconditions.checkNotNull(predicate));
        }
        return Iterators.i(iterable.iterator(), predicate);
    }

    private static <T> boolean b(List<T> list, Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        a(list, predicate, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        a(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static <T> void a(List<T> list, Predicate<? super T> predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static String g(Iterable<?> iterable) {
        return Iterators.h(iterable.iterator());
    }

    @ParametricNullness
    public static <T> T c(Iterable<T> iterable) {
        return (T) Iterators.c(iterable.iterator());
    }

    public static <T> T[] e(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) a((Iterable) iterable, amu.e(cls, 0));
    }

    public static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) h(iterable).toArray(tArr);
    }

    public static Object[] e(Iterable<?> iterable) {
        return h(iterable).toArray();
    }

    private static <E> Collection<E> h(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return aml.a(iterable.iterator());
    }

    public static <T> boolean e(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return Iterators.a(collection, ((Iterable) Preconditions.checkNotNull(iterable)).iterator());
    }

    public static <T> Iterable<T> d(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: amn.3
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.c(iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return iterable.toString() + " (cycled)";
            }
        };
    }

    public static <T> Iterable<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return FluentIterable.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> d(final Iterable<T> iterable, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new FluentIterable<T>() { // from class: amn.2
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.b(iterable.iterator(), predicate);
            }
        };
    }

    public static <T> Iterable<T> b(Iterable<?> iterable, Class<T> cls) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(cls);
        return d(iterable, Predicates.instanceOf(cls));
    }

    public static <T> boolean b(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.e((Iterator) iterable.iterator(), (Predicate) predicate);
    }

    public static <T> boolean c(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.c(iterable.iterator(), predicate);
    }

    public static <T> Optional<T> a(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.h(iterable.iterator(), predicate);
    }

    public static <F, T> Iterable<T> d(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable<T>() { // from class: amn.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.b(iterable.iterator(), function);
            }
        };
    }

    @ParametricNullness
    public static <T> T e(Iterable<T> iterable, int i) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) Iterators.e(iterable.iterator(), i);
    }

    @ParametricNullness
    public static <T> T a(Iterable<? extends T> iterable, @ParametricNullness T t) {
        return (T) Iterators.e(iterable.iterator(), t);
    }

    @ParametricNullness
    public static <T> T a(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) b(list);
        }
        return (T) Iterators.b((Iterator) iterable.iterator());
    }

    @ParametricNullness
    public static <T> T b(Iterable<? extends T> iterable, @ParametricNullness T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) b(aml.c(iterable));
            }
        }
        return (T) Iterators.a(iterable.iterator(), t);
    }

    @ParametricNullness
    private static <T> T b(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Iterable<T> c(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i >= 0, "number to skip cannot be negative");
        return new FluentIterable<T>() { // from class: amn.4
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                final Iterator<T> it = iterable2.iterator();
                Iterators.a((Iterator<?>) it, i);
                return new Iterator<T>(this) { // from class: amn.4.1
                    boolean d = true;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    @ParametricNullness
                    public T next() {
                        T t = (T) it.next();
                        this.d = false;
                        return t;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        ale.b(!this.d);
                        it.remove();
                    }
                };
            }
        };
    }

    public static <T> Iterable<T> b(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new FluentIterable<T>() { // from class: amn.5
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.b(iterable.iterator(), i);
            }
        };
    }
}
