package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i14) {
                return i14 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i14) {
                return i14;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i14) {
                return ~i14;
            }
        };

        public abstract int resultIndex(int i14);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14) {
                return i14;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14) {
                int size = list.size() - 1;
                while (i14 < size) {
                    int i15 = ((i14 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i15), e4) > 0) {
                        size = i15 - 1;
                    } else {
                        i14 = i15;
                    }
                }
                return i14;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14) {
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = (i15 + i14) >>> 1;
                    if (comparator.compare(list.get(i16), e4) < 0) {
                        i15 = i16 + 1;
                    } else {
                        i14 = i16;
                    }
                }
                return i15;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e4, list, i14) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e4, list, i14) - 1;
            }
        };

        public abstract <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e4, List<? extends E> list, int i14);
    }

    private SortedLists() {
    }

    public static <E> int binarySearch(List<? extends E> list, @ParametricNullness E e4, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(keyPresentBehavior);
        Preconditions.checkNotNull(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            int iCompare = comparator.compare(e4, list.get(i15));
            if (iCompare < 0) {
                size = i15 - 1;
            } else {
                if (iCompare <= 0) {
                    return i14 + keyPresentBehavior.resultIndex(comparator, e4, list.subList(i14, size + 1), i15 - i14);
                }
                i14 = i15 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i14);
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, K k14, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(k14);
        return binarySearch(list, function, k14, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @ParametricNullness K k14, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return binarySearch((List<? extends K>) Lists.transform(list, function), k14, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e4, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(e4);
        return binarySearch(list, e4, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }
}
