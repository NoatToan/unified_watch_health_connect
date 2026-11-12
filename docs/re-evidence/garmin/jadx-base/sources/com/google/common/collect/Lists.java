package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Lists {

    public static class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        public AbstractListWrapper(List<E> list) {
            this.backingList = (List) Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i14, @ParametricNullness E e4) {
            this.backingList.add(i14, e4);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i14, Collection<? extends E> collection) {
            return this.backingList.addAll(i14, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.backingList.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i14) {
            return this.backingList.get(i14);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i14) {
            return this.backingList.remove(i14);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i14, @ParametricNullness E e4) {
            return this.backingList.set(i14, e4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }
    }

    public static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        public CharSequenceAsList(CharSequence charSequence) {
            this.sequence = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Character.valueOf(this.sequence.charAt(i14));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.sequence.length();
        }
    }

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @J2ktIncompatible
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        public OnePlusArrayList(@ParametricNullness E e4, E[] eArr) {
            this.first = e4;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return i14 == 0 ? this.first : this.rest[i14 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 1);
        }
    }

    public static class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        public Partition(List<T> list, int i14) {
            this.list = list;
            this.size = i14;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            int i15 = this.size;
            int i16 = i14 * i15;
            return this.list.subList(i16, Math.min(i15 + i16, this.list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.list.size(), this.size, RoundingMode.CEILING);
        }
    }

    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        public RandomAccessListWrapper(List<E> list) {
            super(list);
        }
    }

    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        public RandomAccessPartition(List<T> list, int i14) {
            super(list, i14);
        }
    }

    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    public static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        public ReverseList(List<T> list) {
            this.forwardList = (List) Preconditions.checkNotNull(list);
        }

        private int reverseIndex(int i14) {
            int size = size();
            Preconditions.checkElementIndex(i14, size);
            return (size - 1) - i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int i14) {
            int size = size();
            Preconditions.checkPositionIndex(i14, size);
            return size - i14;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i14, @ParametricNullness T t7) {
            this.forwardList.add(reversePosition(i14), t7);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i14) {
            return this.forwardList.get(reverseIndex(i14));
        }

        public List<T> getForwardList() {
            return this.forwardList;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i14) {
            final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i14));
            return new ListIterator<T>(this) { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;
                final /* synthetic */ ReverseList this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.ListIterator
                public void add(@ParametricNullness T t7) {
                    listIterator.add(t7);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        this.canRemoveOrSet = true;
                        return (T) listIterator.previous();
                    }
                    c22.t.g();
                    return null;
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.this$0.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                @ParametricNullness
                public T previous() {
                    if (hasPrevious()) {
                        this.canRemoveOrSet = true;
                        return (T) listIterator.next();
                    }
                    c22.t.g();
                    return null;
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(@ParametricNullness T t7) {
                    Preconditions.checkState(this.canRemoveOrSet);
                    listIterator.set(t7);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i14) {
            return this.forwardList.remove(reverseIndex(i14));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i14, int i15) {
            subList(i14, i15).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i14, @ParametricNullness T t7) {
            return this.forwardList.set(reverseIndex(i14), t7);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            return Lists.reverse(this.forwardList.subList(reversePosition(i15), reversePosition(i14)));
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // java.util.List
        public Character get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Character.valueOf(this.string.charAt(i14));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            return Lists.charactersOf(this.string.substring(i14, i15));
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i14) {
            return this.function.apply(this.fromList.get(i14));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i14) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i14)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f14) {
                    return TransformingRandomAccessList.this.function.apply(f14);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i14) {
            return this.function.apply(this.fromList.remove(i14));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i14, int i15) {
            this.fromList.subList(i14, i15).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i14) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i14)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                @ParametricNullness
                public T transform(@ParametricNullness F f14) {
                    return TransformingSequentialList.this.function.apply(f14);
                }
            };
        }

        @Override // java.util.AbstractList
        public void removeRange(int i14, int i15) {
            this.fromList.subList(i14, i15).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @J2ktIncompatible
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        @ParametricNullness
        final E second;

        public TwoPlusArrayList(@ParametricNullness E e4, @ParametricNullness E e14, E[] eArr) {
            this.first = e4;
            this.second = e14;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i14) {
            if (i14 == 0) {
                return this.first;
            }
            if (i14 == 1) {
                return this.second;
            }
            Preconditions.checkElementIndex(i14, size());
            return this.rest[i14 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 2);
        }
    }

    private Lists() {
    }

    public static <E> boolean addAllImpl(List<E> list, int i14, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i14);
        Iterator<? extends E> it = iterable.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z14 = true;
        }
        return z14;
    }

    public static <E> List<E> asList(@ParametricNullness E e4, E[] eArr) {
        return new OnePlusArrayList(e4, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static <T> List<T> cast(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    @VisibleForTesting
    public static int computeArrayListCapacity(int i14) {
        CollectPreconditions.checkNonnegative(i14, "arraySize");
        return Ints.saturatedCast(((long) i14) + 5 + ((long) (i14 / 10)));
    }

    public static boolean equalsImpl(List<?> list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
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
            return Iterators.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i14 = 0; i14 < size; i14++) {
            if (!Objects.equal(list.get(i14), list2.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeImpl(List<?> list) {
        Iterator<?> it = list.iterator();
        int i14 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i14 = ~(~((i14 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i14;
    }

    public static int indexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int indexOfRandomAccess(List<?> list, Object obj) {
        int size = list.size();
        int i14 = 0;
        if (obj == null) {
            while (i14 < size) {
                if (list.get(i14) == null) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        while (i14 < size) {
            if (obj.equals(list.get(i14))) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int lastIndexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List<?> list, Object obj) {
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

    public static <E> ListIterator<E> listIteratorImpl(List<E> list, int i14) {
        return new AbstractListWrapper(list).listIterator(i14);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i14) {
        CollectPreconditions.checkNonnegative(i14, "initialArraySize");
        return new ArrayList<>(i14);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i14) {
        return new ArrayList<>(computeArrayListCapacity(i14));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        Iterables.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    public static <T> List<List<T>> partition(List<T> list, int i14) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(i14 > 0);
        return list instanceof RandomAccess ? new RandomAccessPartition(list, i14) : new Partition(list, i14);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).getForwardList();
        }
        return list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static <E> List<E> subListImpl(List<E> list, int i14, int i15) {
        return (list instanceof RandomAccess ? new RandomAccessListWrapper<E>(list) { // from class: com.google.common.collect.Lists.1

            @J2ktIncompatible
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i16) {
                return this.backingList.listIterator(i16);
            }
        } : new AbstractListWrapper<E>(list) { // from class: com.google.common.collect.Lists.2

            @J2ktIncompatible
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i16) {
                return this.backingList.listIterator(i16);
            }
        }).subList(i14, i15);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    public static <E> List<E> asList(@ParametricNullness E e4, @ParametricNullness E e14, E[] eArr) {
        return new TwoPlusArrayList(e4, e14, eArr);
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.create(list);
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(computeArrayListCapacity(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        Iterators.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }
}
