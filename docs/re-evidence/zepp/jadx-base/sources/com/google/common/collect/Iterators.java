package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Iterators {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Enumeration a;

        public a(Enumeration enumeration) {
            this.a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.a.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> implements Enumeration<T> {
        public final /* synthetic */ Iterator a;

        public b(Iterator it2) {
            this.a = it2;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a.hasNext();
        }

        @Override // java.util.Enumeration
        public T nextElement() {
            return (T) this.a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class c<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator a;

        public c(Iterator it2) {
            this.a = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class d<T> implements Iterator<T> {
        public Iterator<T> a = Iterators.h();
        public final /* synthetic */ Iterable b;

        public d(Iterable iterable) {
            this.b = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() || this.b.iterator().hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.a.hasNext()) {
                Iterator<T> it2 = this.b.iterator();
                this.a = it2;
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class e<T> extends UnmodifiableIterator<T> {
        public int a = 0;
        public final /* synthetic */ Object[] b;

        public e(Object[] objArr) {
            this.b = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.length;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = this.b;
            int i = this.a;
            T t = (T) objArr[i];
            objArr[i] = null;
            this.a = i + 1;
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class f<T> extends UnmodifiableIterator<List<T>> {
        public final /* synthetic */ Iterator a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        public f(Iterator it2, int i, boolean z) {
            this.a = it2;
            this.b = i;
            this.c = z;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.b];
            int i = 0;
            while (i < this.b && this.a.hasNext()) {
                objArr[i] = this.a.next();
                i++;
            }
            for (int i2 = i; i2 < this.b; i2++) {
                objArr[i2] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.c || i == this.b) ? listUnmodifiableList : listUnmodifiableList.subList(0, i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class g<T> extends AbstractIterator<T> {
        public final /* synthetic */ Iterator c;
        public final /* synthetic */ Predicate d;

        public g(Iterator it2, Predicate predicate) {
            this.c = it2;
            this.d = predicate;
        }

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
        public T computeNext() {
            while (this.c.hasNext()) {
                T t = (T) this.c.next();
                if (this.d.apply(t)) {
                    return t;
                }
            }
            return endOfData();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    public static class h<F, T> extends x2<F, T> {
        public final /* synthetic */ Function b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Iterator it2, Function function) {
            super(it2);
            this.b = function;
        }

        @Override // com.google.common.collect.x2
        public T a(F f) {
            return (T) this.b.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class i<T> implements Iterator<T> {
        private int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Iterator c;

        public i(int i, Iterator it2) {
            this.b = i;
            this.c = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b && this.c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.a++;
            return (T) this.c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.c.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class j<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator a;

        public j(Iterator it2) {
            this.a = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            T t = (T) this.a.next();
            this.a.remove();
            return t;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class k<T> extends UnmodifiableIterator<T> {
        public boolean a;
        public final /* synthetic */ Object b;

        public k(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.a) {
                throw new NoSuchElementException();
            }
            this.a = true;
            return (T) this.b;
        }
    }

    public static final class l<T> extends com.google.common.collect.b<T> {
        public static final UnmodifiableListIterator<Object> e = new l(new Object[0], 0, 0, 0);
        private final T[] c;
        private final int d;

        public l(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.c = tArr;
            this.d = i;
        }

        @Override // com.google.common.collect.b
        public T a(int i) {
            return this.c[this.d + i];
        }
    }

    public static class m<T> implements Iterator<T> {

        @NullableDecl
        private Iterator<? extends T> a;
        private Iterator<? extends T> b = Iterators.f();
        private Iterator<? extends Iterator<? extends T>> c;

        @NullableDecl
        private Deque<Iterator<? extends Iterator<? extends T>>> d;

        public m(Iterator<? extends Iterator<? extends T>> it2) {
            this.c = (Iterator) Preconditions.checkNotNull(it2);
        }

        @NullableDecl
        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it2 = this.c;
                if (it2 != null && it2.hasNext()) {
                    return this.c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.c = this.d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.b = next;
                if (next instanceof m) {
                    m mVar = (m) next;
                    this.b = mVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (mVar.d != null) {
                        while (!mVar.d.isEmpty()) {
                            this.d.addFirst(mVar.d.removeLast());
                        }
                    }
                    this.c = mVar.c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it2 = this.b;
            this.a = it2;
            return it2.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.a != null);
            this.a.remove();
            this.a = null;
        }
    }

    public enum n implements Iterator<Object> {
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
            u.e(false);
        }
    }

    public static class o<T> extends UnmodifiableIterator<T> {
        public final Queue<PeekingIterator<T>> a;

        public class a implements Comparator<PeekingIterator<T>> {
            public final /* synthetic */ Comparator a;

            public a(Comparator comparator) {
                this.a = comparator;
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(PeekingIterator<T> peekingIterator, PeekingIterator<T> peekingIterator2) {
                return this.a.compare(peekingIterator.peek(), peekingIterator2.peek());
            }
        }

        public o(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.a = new PriorityQueue(2, new a(comparator));
            for (Iterator<? extends T> it2 : iterable) {
                if (it2.hasNext()) {
                    this.a.add(Iterators.peekingIterator(it2));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.a.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.a.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    public static class p<E> implements PeekingIterator<E> {
        private final Iterator<? extends E> a;
        private boolean b;

        @NullableDecl
        private E c;

        public p(Iterator<? extends E> it2) {
            this.a = (Iterator) Preconditions.checkNotNull(it2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b || this.a.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public E next() {
            if (!this.b) {
                return this.a.next();
            }
            E e = this.c;
            this.b = false;
            this.c = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator
        public E peek() {
            if (!this.b) {
                this.c = this.a.next();
                this.b = true;
            }
            return this.c;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.b, "Can't remove after you've peeked at next");
            this.a.remove();
        }
    }

    private Iterators() {
    }

    public static <T> ListIterator<T> a(Iterator<T> it2) {
        return (ListIterator) it2;
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it2);
        boolean zAdd = false;
        while (it2.hasNext()) {
            zAdd |= collection.add(it2.next());
        }
        return zAdd;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it2, int i2) {
        Preconditions.checkNotNull(it2);
        int i3 = 0;
        Preconditions.checkArgument(i2 >= 0, "numberToAdvance must be nonnegative");
        while (i3 < i2 && it2.hasNext()) {
            it2.next();
            i3++;
        }
        return i3;
    }

    public static <T> boolean all(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            if (!predicate.apply(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it2, Predicate<? super T> predicate) {
        return indexOf(it2, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it2) {
        Preconditions.checkNotNull(it2);
        return new b(it2);
    }

    public static void b(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i2 + ") must not be negative");
    }

    public static void c(Iterator<?> it2) {
        Preconditions.checkNotNull(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(e(it2, it3));
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it2) {
        Preconditions.checkNotNull(it2);
        return new j(it2);
    }

    public static boolean contains(Iterator<?> it2, @NullableDecl Object obj) {
        if (obj == null) {
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it2.hasNext()) {
            if (obj.equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new d(iterable);
    }

    public static <T> Iterator<T> d(Iterator<? extends T>... itArr) {
        for (Iterator it2 : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it2);
        }
        return concat(e(itArr));
    }

    private static <T> Iterator<T> e(T... tArr) {
        return new e(tArr);
    }

    public static boolean elementsEqual(Iterator<?> it2, Iterator<?> it3) {
        while (it2.hasNext()) {
            if (!it3.hasNext() || !Objects.equal(it2.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    public static <T> UnmodifiableIterator<T> f() {
        return g();
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        return new g(it2, predicate);
    }

    public static <T> T find(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return i(tArr, 0, tArr.length, 0);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new a(enumeration);
    }

    public static int frequency(Iterator<?> it2, @NullableDecl Object obj) {
        int i2 = 0;
        while (contains(it2, obj)) {
            i2++;
        }
        return i2;
    }

    public static <T> UnmodifiableListIterator<T> g() {
        return (UnmodifiableListIterator<T>) l.e;
    }

    public static <T> T get(Iterator<T> it2, int i2) {
        b(i2);
        int iAdvance = advance(it2, i2);
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new IndexOutOfBoundsException("position (" + i2 + ") must be less than the number of elements that remained (" + iAdvance + ")");
    }

    public static <T> T getLast(Iterator<T> it2) {
        T next;
        do {
            next = it2.next();
        } while (it2.hasNext());
        return next;
    }

    @NullableDecl
    public static <T> T getNext(Iterator<? extends T> it2, @NullableDecl T t) {
        return it2.hasNext() ? it2.next() : t;
    }

    @CanIgnoreReturnValue
    public static <T> T getOnlyElement(Iterator<T> it2) {
        T next = it2.next();
        if (!it2.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it2.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it2.next());
        }
        if (it2.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> Iterator<T> h() {
        return n.INSTANCE;
    }

    public static <T> UnmodifiableListIterator<T> i(T[] tArr, int i2, int i3, int i4) {
        Preconditions.checkArgument(i3 >= 0);
        Preconditions.checkPositionIndexes(i2, i2 + i3, tArr.length);
        Preconditions.checkPositionIndex(i4, i3);
        return i3 == 0 ? g() : new l(tArr, i2, i3, i4);
    }

    public static <T> int indexOf(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i2 = 0;
        while (it2.hasNext()) {
            if (predicate.apply(it2.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static <T> UnmodifiableIterator<List<T>> j(Iterator<T> it2, int i2, boolean z) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkArgument(i2 > 0);
        return new f(it2, i2, z);
    }

    @NullableDecl
    public static <T> T k(Iterator<T> it2) {
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        it2.remove();
        return next;
    }

    public static <T> Iterator<T> limit(Iterator<T> it2, int i2) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkArgument(i2 >= 0, "limit is negative");
        return new i(i2, it2);
    }

    @Beta
    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new o(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it2, int i2) {
        return j(it2, i2, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it2, int i2) {
        return j(it2, i2, false);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it2) {
        return it2 instanceof p ? (p) it2 : new p(it2);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it2, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it2.hasNext()) {
            if (predicate.apply(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it2, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@NullableDecl T t) {
        return new k(t);
    }

    public static int size(Iterator<?> it2) {
        long j2 = 0;
        while (it2.hasNext()) {
            it2.next();
            j2++;
        }
        return Ints.saturatedCast(j2);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it2, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it2), cls);
    }

    public static String toString(Iterator<?> it2) {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (it2.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it2.next());
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it2, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new h(it2, function);
    }

    public static <T> Optional<T> tryFind(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it2);
        return it2 instanceof UnmodifiableIterator ? (UnmodifiableIterator) it2 : new c(it2);
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @NullableDecl
    public static <T> T getLast(Iterator<? extends T> it2, @NullableDecl T t) {
        return it2.hasNext() ? (T) getLast(it2) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(e(it2, it3, it4));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it2, Class<T> cls) {
        return filter(it2, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    @NullableDecl
    public static <T> T get(Iterator<? extends T> it2, int i2, @NullableDecl T t) {
        b(i2);
        advance(it2, i2);
        return (T) getNext(it2, t);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @NullableDecl
    public static <T> T find(Iterator<? extends T> it2, Predicate<? super T> predicate, @NullableDecl T t) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4, Iterator<? extends T> it5) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        Preconditions.checkNotNull(it5);
        return concat(e(it2, it3, it4, it5));
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public static <T> T getOnlyElement(Iterator<? extends T> it2, @NullableDecl T t) {
        return it2.hasNext() ? (T) getOnlyElement(it2) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return d((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it2) {
        return new m(it2);
    }
}
