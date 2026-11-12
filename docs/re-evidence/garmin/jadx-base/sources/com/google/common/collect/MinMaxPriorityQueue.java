package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;

    @VisibleForTesting
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    public class Heap {
        final Ordering<E> ordering;

        @Weak
        MinMaxPriorityQueue<E>.Heap otherHeap;

        public Heap(Ordering<E> ordering) {
            this.ordering = ordering;
        }

        private int getGrandparentIndex(int i14) {
            return getParentIndex(getParentIndex(i14));
        }

        private int getLeftChildIndex(int i14) {
            return (i14 * 2) + 1;
        }

        private int getParentIndex(int i14) {
            return (i14 - 1) / 2;
        }

        private int getRightChildIndex(int i14) {
            return (i14 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i14) {
            if (getLeftChildIndex(i14) < MinMaxPriorityQueue.this.size && compareElements(i14, getLeftChildIndex(i14)) > 0) {
                return false;
            }
            if (getRightChildIndex(i14) < MinMaxPriorityQueue.this.size && compareElements(i14, getRightChildIndex(i14)) > 0) {
                return false;
            }
            if (i14 <= 0 || compareElements(i14, getParentIndex(i14)) <= 0) {
                return i14 <= 2 || compareElements(getGrandparentIndex(i14), i14) <= 0;
            }
            return false;
        }

        public void bubbleUp(int i14, E e4) {
            Heap heap;
            int iCrossOverUp = crossOverUp(i14, e4);
            if (iCrossOverUp == i14) {
                iCrossOverUp = i14;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(iCrossOverUp, e4);
        }

        @CanIgnoreReturnValue
        public int bubbleUpAlternatingLevels(int i14, E e4) {
            while (i14 > 2) {
                int grandparentIndex = getGrandparentIndex(i14);
                Object objElementData = MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare((E) objElementData, e4) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.queue[i14] = objElementData;
                i14 = grandparentIndex;
            }
            MinMaxPriorityQueue.this.queue[i14] = e4;
            return i14;
        }

        public int compareElements(int i14, int i15) {
            return this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(i14), (E) MinMaxPriorityQueue.this.elementData(i15));
        }

        public int crossOver(int i14, E e4) {
            int iFindMinChild = findMinChild(i14);
            if (iFindMinChild <= 0 || this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(iFindMinChild), e4) >= 0) {
                return crossOverUp(i14, e4);
            }
            MinMaxPriorityQueue.this.queue[i14] = MinMaxPriorityQueue.this.elementData(iFindMinChild);
            MinMaxPriorityQueue.this.queue[iFindMinChild] = e4;
            return iFindMinChild;
        }

        public int crossOverUp(int i14, E e4) {
            int rightChildIndex;
            if (i14 == 0) {
                MinMaxPriorityQueue.this.queue[0] = e4;
                return 0;
            }
            int parentIndex = getParentIndex(i14);
            Object objElementData = MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData2 = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData2, (E) objElementData) < 0) {
                    parentIndex = rightChildIndex;
                    objElementData = objElementData2;
                }
            }
            int iCompare = this.ordering.compare((E) objElementData, e4);
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (iCompare >= 0) {
                minMaxPriorityQueue.queue[i14] = e4;
                return i14;
            }
            minMaxPriorityQueue.queue[i14] = objElementData;
            MinMaxPriorityQueue.this.queue[parentIndex] = e4;
            return parentIndex;
        }

        public int fillHoleAt(int i14) {
            while (true) {
                int iFindMinGrandChild = findMinGrandChild(i14);
                if (iFindMinGrandChild <= 0) {
                    return i14;
                }
                MinMaxPriorityQueue.this.queue[i14] = MinMaxPriorityQueue.this.elementData(iFindMinGrandChild);
                i14 = iFindMinGrandChild;
            }
        }

        public int findMin(int i14, int i15) {
            if (i14 >= MinMaxPriorityQueue.this.size) {
                return -1;
            }
            Preconditions.checkState(i14 > 0);
            int iMin = Math.min(i14, MinMaxPriorityQueue.this.size - i15) + i15;
            for (int i16 = i14 + 1; i16 < iMin; i16++) {
                if (compareElements(i16, i14) < 0) {
                    i14 = i16;
                }
            }
            return i14;
        }

        public int findMinChild(int i14) {
            return findMin(getLeftChildIndex(i14), 2);
        }

        public int findMinGrandChild(int i14) {
            int leftChildIndex = getLeftChildIndex(i14);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        public int swapWithConceptuallyLastElement(E e4) {
            int rightChildIndex;
            int parentIndex = getParentIndex(MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData, e4) < 0) {
                    MinMaxPriorityQueue.this.queue[rightChildIndex] = e4;
                    MinMaxPriorityQueue.this.queue[MinMaxPriorityQueue.this.size] = objElementData;
                    return rightChildIndex;
                }
            }
            return MinMaxPriorityQueue.this.size;
        }

        public MoveDesc<E> tryCrossOverAndBubbleUp(int i14, int i15, E e4) {
            int iCrossOver = crossOver(i15, e4);
            if (iCrossOver == i15) {
                return null;
            }
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            Object objElementData = iCrossOver < i14 ? minMaxPriorityQueue.elementData(i14) : minMaxPriorityQueue.elementData(getParentIndex(i14));
            if (this.otherHeap.bubbleUpAlternatingLevels(iCrossOver, e4) < i14) {
                return new MoveDesc<>(e4, objElementData);
            }
            return null;
        }
    }

    public static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        public MoveDesc(E e4, E e14) {
            this.toTrickle = e4;
            this.replaced = e14;
        }
    }

    public class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private Queue<E> forgetMeNot;
        private E lastFromForgetMeNot;
        private int nextCursor;
        private List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = MinMaxPriorityQueue.this.modCount;
        }

        private void checkModCount() {
            if (MinMaxPriorityQueue.this.modCount == this.expectedModCount) {
                return;
            }
            org.apache.commons.lang3.e.h();
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e4) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e4) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i14) {
            if (this.nextCursor < i14) {
                if (this.skipMe != null) {
                    while (i14 < MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, MinMaxPriorityQueue.this.elementData(i14))) {
                        i14++;
                    }
                }
                this.nextCursor = i14;
            }
        }

        private boolean removeExact(Object obj) {
            for (int i14 = 0; i14 < MinMaxPriorityQueue.this.size; i14++) {
                if (MinMaxPriorityQueue.this.queue[i14] == obj) {
                    MinMaxPriorityQueue.this.removeAt(i14);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            return this.nextCursor < MinMaxPriorityQueue.this.size() || !((queue = this.forgetMeNot) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size()) {
                int i14 = this.nextCursor;
                this.cursor = i14;
                this.canRemove = true;
                return (E) MinMaxPriorityQueue.this.elementData(i14);
            }
            if (this.forgetMeNot != null) {
                this.cursor = MinMaxPriorityQueue.this.size();
                E ePoll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = ePoll;
                if (ePoll != null) {
                    this.canRemove = true;
                    return ePoll;
                }
            }
            n23.j.s("iterator moved past last element in queue.");
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor >= MinMaxPriorityQueue.this.size()) {
                E e4 = this.lastFromForgetMeNot;
                Objects.requireNonNull(e4);
                Preconditions.checkState(removeExact(e4));
                this.lastFromForgetMeNot = null;
                return;
            }
            MoveDesc<E> moveDescRemoveAt = MinMaxPriorityQueue.this.removeAt(this.cursor);
            if (moveDescRemoveAt != null) {
                if (this.forgetMeNot == null || this.skipMe == null) {
                    this.forgetMeNot = new ArrayDeque();
                    this.skipMe = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.skipMe, moveDescRemoveAt.toTrickle)) {
                    this.forgetMeNot.add(moveDescRemoveAt.toTrickle);
                }
                if (!foundAndRemovedExactReference(this.forgetMeNot, moveDescRemoveAt.replaced)) {
                    this.skipMe.add(moveDescRemoveAt.replaced);
                }
            }
            this.cursor--;
            this.nextCursor--;
        }
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i14) {
        Ordering ordering = builder.ordering();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(ordering);
        this.minHeap = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((Builder) builder).maximumSize;
        this.queue = new Object[i14];
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int i14, int i15) {
        return Math.min(i14 - 1, i15) + 1;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    public static Builder<Comparable> expectedSize(int i14) {
        return new Builder(Ordering.natural()).expectedSize(i14);
    }

    private MoveDesc<E> fillHole(int i14, E e4) {
        MinMaxPriorityQueue<E>.Heap heapHeapForIndex = heapForIndex(i14);
        int iFillHoleAt = heapHeapForIndex.fillHoleAt(i14);
        int iBubbleUpAlternatingLevels = heapHeapForIndex.bubbleUpAlternatingLevels(iFillHoleAt, e4);
        if (iBubbleUpAlternatingLevels == iFillHoleAt) {
            return heapHeapForIndex.tryCrossOverAndBubbleUp(i14, iFillHoleAt, e4);
        }
        if (iBubbleUpAlternatingLevels < i14) {
            return new MoveDesc<>(e4, elementData(i14));
        }
        return null;
    }

    private int getMaxElementIndex() {
        int i14 = this.size;
        if (i14 != 1) {
            return (i14 == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.queue;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i14) {
        return isEvenLevel(i14) ? this.minHeap : this.maxHeap;
    }

    @VisibleForTesting
    public static int initialQueueSize(int i14, int i15, Iterable<?> iterable) {
        if (i14 == -1) {
            i14 = 11;
        }
        if (iterable instanceof Collection) {
            i14 = Math.max(i14, ((Collection) iterable).size());
        }
        return capAtMaximumSize(i14, i15);
    }

    @VisibleForTesting
    public static boolean isEvenLevel(int i14) {
        int i15 = ~(~(i14 + 1));
        Preconditions.checkState(i15 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i15) > (i15 & ODD_POWERS_OF_TWO);
    }

    public static Builder<Comparable> maximumSize(int i14) {
        return new Builder(Ordering.natural()).maximumSize(i14);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    private E removeAndGet(int i14) {
        E eElementData = elementData(i14);
        removeAt(i14);
        return eElementData;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e4) {
        offer(e4);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            offer(it.next());
            z14 = true;
        }
        return z14;
    }

    @VisibleForTesting
    public int capacity() {
        return this.queue.length;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i14 = 0; i14 < this.size; i14++) {
            this.queue[i14] = null;
        }
        this.size = 0;
    }

    public Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    public E elementData(int i14) {
        E e4 = (E) this.queue[i14];
        Objects.requireNonNull(e4);
        return e4;
    }

    @VisibleForTesting
    public boolean isIntact() {
        for (int i14 = 1; i14 < this.size; i14++) {
            if (!heapForIndex(i14).verifyIndex(i14)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e4) {
        Preconditions.checkNotNull(e4);
        this.modCount++;
        int i14 = this.size;
        this.size = i14 + 1;
        growIfNeeded();
        heapForIndex(i14).bubbleUp(i14, e4);
        return this.size <= this.maximumSize || pollLast() != e4;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public MoveDesc<E> removeAt(int i14) {
        Preconditions.checkPositionIndex(i14, this.size);
        this.modCount++;
        int i15 = this.size - 1;
        this.size = i15;
        if (i15 == i14) {
            this.queue[i15] = null;
            return null;
        }
        E eElementData = elementData(i15);
        int iSwapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(eElementData);
        if (iSwapWithConceptuallyLastElement == i14) {
            this.queue[this.size] = null;
            return null;
        }
        E eElementData2 = elementData(this.size);
        this.queue[this.size] = null;
        MoveDesc<E> moveDescFillHole = fillHole(i14, eElementData2);
        if (iSwapWithConceptuallyLastElement < i14) {
            return moveDescFillHole == null ? new MoveDesc<>(eElementData, eElementData2) : new MoveDesc<>(eElementData, moveDescFillHole.replaced);
        }
        return moveDescFillHole;
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (!isEmpty()) {
            return removeAndGet(getMaxElementIndex());
        }
        c22.t.g();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public Object[] toArray() {
        int i14 = this.size;
        Object[] objArr = new Object[i14];
        System.arraycopy(this.queue, 0, objArr, 0, i14);
        return objArr;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }

    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        private Builder(Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> ordering() {
            return Ordering.from(this.comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i14) {
            Preconditions.checkArgument(i14 >= 0);
            this.expectedSize = i14;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i14) {
            Preconditions.checkArgument(i14 > 0);
            this.maximumSize = i14;
            return this;
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.EMPTY_SET);
        }
    }
}
