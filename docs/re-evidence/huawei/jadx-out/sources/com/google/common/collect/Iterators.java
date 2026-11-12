package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import com.huawei.operation.utils.Constants;
import defpackage.ale;
import defpackage.ams;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Iterators {
    public static <T> UnmodifiableIterator<T> e() {
        return b();
    }

    static <T> UnmodifiableListIterator<T> b() {
        return (UnmodifiableListIterator<T>) e.f4408a;
    }

    enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ale.b(false);
        }
    }

    static <T> Iterator<T> a() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> i(final Iterator<? extends T> it) {
        Preconditions.checkNotNull(it);
        if (it instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) it;
        }
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.5
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it.next();
            }
        };
    }

    public static int j(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.a(j);
    }

    public static boolean b(Iterator<?> it, @CheckForNull Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean i(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static String h(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    @ParametricNullness
    public static <T> T c(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> Iterator<T> c(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Iterator<T> f4397c = Iterators.a();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4397c.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.f4397c.hasNext()) {
                    Iterator<T> it = iterable.iterator();
                    this.f4397c = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.f4397c.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f4397c.remove();
            }
        };
    }

    private static <I extends Iterator<?>> Iterator<I> c(final I... iArr) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f4399b = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4399b < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator it = (Iterator) java.util.Objects.requireNonNull(iArr[this.f4399b]);
                Iterator[] itArr = iArr;
                int i = this.f4399b;
                itArr[i] = null;
                this.f4399b = i + 1;
                return it;
            }
        };
    }

    public static <T> Iterator<T> d(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return e(c(it, it2));
    }

    public static <T> Iterator<T> e(Iterator<? extends Iterator<? extends T>> it) {
        return new d(it);
    }

    public static <T> UnmodifiableIterator<T> b(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.4
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected T computeNext() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (predicate.apply(t)) {
                        return t;
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> boolean e(Iterator<T> it, Predicate<? super T> predicate) {
        return d(it, predicate) != -1;
    }

    public static <T> boolean c(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    @ParametricNullness
    public static <T> T a(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> Optional<T> h(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> int d(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> b(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it) { // from class: com.google.common.collect.Iterators.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            protected T transform(@ParametricNullness F f) {
                return (T) function.apply(f);
            }
        };
    }

    @ParametricNullness
    public static <T> T e(Iterator<T> it, int i) {
        b(i);
        int iA = a((Iterator<?>) it, i);
        if (!it.hasNext()) {
            throw new IndexOutOfBoundsException("position (" + i + ") must be less than the number of elements that remained (" + iA + Constants.RIGHT_BRACKET_ONLY);
        }
        return it.next();
    }

    static void b(int i) {
        if (i >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must not be negative");
    }

    @ParametricNullness
    public static <T> T e(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? it.next() : t;
    }

    @ParametricNullness
    public static <T> T b(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T a(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? (T) b((Iterator) it) : t;
    }

    public static int a(Iterator<?> it, int i) {
        Preconditions.checkNotNull(it);
        int i2 = 0;
        Preconditions.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> Iterator<T> b(final Iterator<T> it, final int i) {
        Preconditions.checkNotNull(it);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int e;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e < i && it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.e++;
                return (T) it.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }
        };
    }

    @CheckForNull
    static <T> T g(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static void d(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> c(T... tArr) {
        return b(tArr, 0);
    }

    static <T> UnmodifiableListIterator<T> b(T[] tArr, int i) {
        if (tArr.length == 0) {
            Preconditions.checkPositionIndex(i, tArr.length);
            return b();
        }
        return new e(tArr, i);
    }

    static final class e<T> extends AbstractIndexedListIterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final UnmodifiableListIterator<Object> f4408a = new e(new Object[0], 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T[] f4409b;

        e(T[] tArr, int i) {
            super(tArr.length, i);
            this.f4409b = tArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        protected T get(int i) {
            return this.f4409b[i];
        }
    }

    public static <T> UnmodifiableIterator<T> b(@ParametricNullness T t) {
        return new b(t);
    }

    static final class b<T> extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f4403a = new Object();
        private Object e;

        b(T t) {
            this.e = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e != f4403a;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            T t = (T) this.e;
            Object obj = f4403a;
            if (t == obj) {
                throw new NoSuchElementException();
            }
            this.e = obj;
            return t;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class c<E> implements PeekingIterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private E f4405b;
        private final Iterator<? extends E> d;

        public c(Iterator<? extends E> it) {
            this.d = (Iterator) Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4404a || this.d.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.f4404a) {
                return this.d.next();
            }
            E e = (E) ams.e(this.f4405b);
            this.f4404a = false;
            this.f4405b = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.f4404a, "Can't remove after you've peeked at next");
            this.d.remove();
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.f4404a) {
                this.f4405b = this.d.next();
                this.f4404a = true;
            }
            return (E) ams.e(this.f4405b);
        }
    }

    public static <T> PeekingIterator<T> a(Iterator<? extends T> it) {
        if (it instanceof c) {
            return (c) it;
        }
        return new c(it);
    }

    static class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<? extends T> f4406a = Iterators.e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> f4407b;

        @CheckForNull
        private Deque<Iterator<? extends Iterator<? extends T>>> d;

        @CheckForNull
        private Iterator<? extends T> e;

        d(Iterator<? extends Iterator<? extends T>> it) {
            this.f4407b = (Iterator) Preconditions.checkNotNull(it);
        }

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> c() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f4407b;
                if (it == null || !it.hasNext()) {
                    Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                    if (deque == null || deque.isEmpty()) {
                        return null;
                    }
                    this.f4407b = this.d.removeFirst();
                } else {
                    return this.f4407b;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.f4406a)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itC = c();
                this.f4407b = itC;
                if (itC == null) {
                    return false;
                }
                Iterator<? extends T> next = itC.next();
                this.f4406a = next;
                if (next instanceof d) {
                    d dVar = (d) next;
                    this.f4406a = dVar.f4406a;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.f4407b);
                    if (dVar.d != null) {
                        while (!dVar.d.isEmpty()) {
                            this.d.addFirst(dVar.d.removeLast());
                        }
                    }
                    this.f4407b = dVar.f4407b;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f4406a;
                this.e = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.e;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.e = null;
        }
    }
}
