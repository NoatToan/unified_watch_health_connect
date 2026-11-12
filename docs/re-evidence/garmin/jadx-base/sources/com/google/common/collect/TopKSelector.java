package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f53491k;
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i14) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f53491k = i14;
        Preconditions.checkArgument(i14 >= 0, "k (%s) must be >= 0", i14);
        Preconditions.checkArgument(i14 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i14);
        this.buffer = (T[]) new Object[IntMath.checkedMultiply(i14, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public static <T> TopKSelector<T> greatest(int i14, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i14);
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i14) {
        return least(i14, Ordering.natural());
    }

    private int partition(int i14, int i15, int i16) {
        Object objUncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.buffer[i16]);
        T[] tArr = this.buffer;
        tArr[i16] = tArr[i15];
        int i17 = i14;
        while (i14 < i15) {
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i14]), objUncheckedCastNullableTToT) < 0) {
                swap(i17, i14);
                i17++;
            }
            i14++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i15] = tArr2[i17];
        tArr2[i17] = objUncheckedCastNullableTToT;
        return i17;
    }

    private void swap(int i14, int i15) {
        T[] tArr = this.buffer;
        T t7 = tArr[i14];
        tArr[i14] = tArr[i15];
        tArr[i15] = t7;
    }

    private void trim() {
        int i14 = (this.f53491k * 2) - 1;
        int iLog2 = IntMath.log2(i14, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        while (iMax < i14) {
            int iPartition = partition(iMax, i14, ((iMax + i14) + 1) >>> 1);
            int i17 = this.f53491k;
            if (iPartition <= i17) {
                if (iPartition >= i17) {
                    break;
                }
                iMax = Math.max(iPartition, iMax + 1);
                i16 = iPartition;
            } else {
                i14 = iPartition - 1;
            }
            i15++;
            if (i15 >= iLog2) {
                Arrays.sort(this.buffer, iMax, i14 + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.f53491k;
        this.threshold = (T) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i16]);
        while (true) {
            i16++;
            if (i16 >= this.f53491k) {
                return;
            }
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i16]), (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i16];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopKSelector<T> combine(TopKSelector<T> topKSelector) {
        for (int i14 = 0; i14 < topKSelector.bufferSize; i14++) {
            offer(NullnessCasts.uncheckedCastNullableTToT(topKSelector.buffer[i14]));
        }
        return this;
    }

    public void offer(@ParametricNullness T t7) {
        int i14 = this.f53491k;
        if (i14 == 0) {
            return;
        }
        int i15 = this.bufferSize;
        if (i15 == 0) {
            this.buffer[0] = t7;
            this.threshold = t7;
            this.bufferSize = 1;
            return;
        }
        if (i15 < i14) {
            T[] tArr = this.buffer;
            this.bufferSize = i15 + 1;
            tArr[i15] = t7;
            if (this.comparator.compare(t7, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = t7;
                return;
            }
            return;
        }
        if (this.comparator.compare(t7, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
            T[] tArr2 = this.buffer;
            int i16 = this.bufferSize;
            int i17 = i16 + 1;
            this.bufferSize = i17;
            tArr2[i16] = t7;
            if (i17 == this.f53491k * 2) {
                trim();
            }
        }
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }

    public List<T> topK() {
        T[] tArr = this.buffer;
        Arrays.sort(tArr, 0, this.bufferSize, this.comparator);
        int i14 = this.bufferSize;
        int i15 = this.f53491k;
        if (i14 > i15) {
            T[] tArr2 = this.buffer;
            Arrays.fill(tArr2, i15, tArr2.length, (Object) null);
            int i16 = this.f53491k;
            this.bufferSize = i16;
            this.threshold = this.buffer[i16 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.bufferSize)));
    }

    public static <T> TopKSelector<T> least(int i14, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i14);
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i14) {
        return greatest(i14, Ordering.natural());
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }
}
