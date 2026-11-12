package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Iterators;
import com.google.common.collect.ParametricNullness;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class alf {
    public static <E> Collection<E> a(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof c) {
            return ((c) collection).a(predicate);
        }
        return new c((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    public static boolean a(Collection<?> collection, @CheckForNull Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean c(Collection<?> collection, @CheckForNull Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static class c<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Predicate<? super E> f500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<E> f501c;

        public c(Collection<E> collection, Predicate<? super E> predicate) {
            this.f501c = collection;
            this.f500b = predicate;
        }

        c<E> a(Predicate<? super E> predicate) {
            return new c<>(this.f501c, Predicates.and(this.f500b, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness E e) {
            Preconditions.checkArgument(this.f500b.apply(e));
            return this.f501c.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(this.f500b.apply(it.next()));
            }
            return this.f501c.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            amn.e((Iterable) this.f501c, (Predicate) this.f500b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (alf.a((Collection<?>) this.f501c, obj)) {
                return this.f500b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return alf.a((Collection<?>) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !amn.b((Iterable) this.f501c, (Predicate) this.f500b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.b(this.f501c.iterator(), this.f500b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            return contains(obj) && this.f501c.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f501c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f500b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f501c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f500b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f501c.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f500b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return aml.a(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) aml.a(iterator()).toArray(tArr);
        }
    }

    public static <F, T> Collection<T> c(Collection<F> collection, Function<? super F, T> function) {
        return new d(collection, function);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class d<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Function<? super F, ? extends T> f502b;
        final Collection<F> e;

        d(Collection<F> collection, Function<? super F, ? extends T> function) {
            this.e = (Collection) Preconditions.checkNotNull(collection);
            this.f502b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.e.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.b(this.e.iterator(), this.f502b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.e.size();
        }
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static String a(Collection<?> collection) {
        StringBuilder sbC = c(collection.size());
        sbC.append('[');
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbC.append(", ");
            }
            if (obj == collection) {
                sbC.append("(this Collection)");
            } else {
                sbC.append(obj);
            }
            z = false;
        }
        sbC.append(']');
        return sbC.toString();
    }

    public static StringBuilder c(int i) {
        ale.b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }
}
