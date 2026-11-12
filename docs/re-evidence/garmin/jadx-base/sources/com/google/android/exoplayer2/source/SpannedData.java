package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* JADX INFO: loaded from: classes14.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final Consumer<V> removeCallback;
    private final SparseArray<V> spans;

    public SpannedData(Consumer<V> consumer) {
        this.spans = new SparseArray<>();
        this.removeCallback = consumer;
        this.memoizedReadIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Object obj) {
    }

    public void appendSpan(int i14, V v14) {
        if (this.memoizedReadIndex == -1) {
            Assertions.checkState(this.spans.size() == 0);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            SparseArray<V> sparseArray = this.spans;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.checkArgument(i14 >= iKeyAt);
            if (iKeyAt == i14) {
                Consumer<V> consumer = this.removeCallback;
                SparseArray<V> sparseArray2 = this.spans;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i14, v14);
    }

    public void clear() {
        for (int i14 = 0; i14 < this.spans.size(); i14++) {
            this.removeCallback.accept(this.spans.valueAt(i14));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public void discardFrom(int i14) {
        for (int size = this.spans.size() - 1; size >= 0 && i14 < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        this.memoizedReadIndex = this.spans.size() > 0 ? Math.min(this.memoizedReadIndex, this.spans.size() - 1) : -1;
    }

    public void discardTo(int i14) {
        int i15 = 0;
        while (i15 < this.spans.size() - 1) {
            int i16 = i15 + 1;
            if (i14 < this.spans.keyAt(i16)) {
                return;
            }
            this.removeCallback.accept(this.spans.valueAt(i15));
            this.spans.removeAt(i15);
            int i17 = this.memoizedReadIndex;
            if (i17 > 0) {
                this.memoizedReadIndex = i17 - 1;
            }
            i15 = i16;
        }
    }

    public V get(int i14) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i15 = this.memoizedReadIndex;
            if (i15 <= 0 || i14 >= this.spans.keyAt(i15)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i14 >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public V getEndValue() {
        SparseArray<V> sparseArray = this.spans;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean isEmpty() {
        return this.spans.size() == 0;
    }

    public SpannedData() {
        this(new k(1));
    }
}
