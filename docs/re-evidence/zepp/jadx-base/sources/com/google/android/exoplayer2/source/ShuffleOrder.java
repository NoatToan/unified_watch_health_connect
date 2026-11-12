package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final Random a;
        private final int[] b;
        private final int[] c;

        public DefaultShuffleOrder(int length) {
            this(length, new Random());
        }

        private static int[] a(int length, Random random) {
            int[] iArr = new int[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                int iNextInt = random.nextInt(i2);
                iArr[i] = iArr[iNextInt];
                iArr[iNextInt] = i;
                i = i2;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount) {
            int[] iArr = new int[insertionCount];
            int[] iArr2 = new int[insertionCount];
            int i = 0;
            int i2 = 0;
            while (i2 < insertionCount) {
                iArr[i2] = this.a.nextInt(this.b.length + 1);
                int i3 = i2 + 1;
                int iNextInt = this.a.nextInt(i3);
                iArr2[i2] = iArr2[iNextInt];
                iArr2[iNextInt] = i2 + insertionIndex;
                i2 = i3;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + insertionCount];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i >= iArr4.length + insertionCount) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.a.nextLong()));
                }
                if (i4 >= insertionCount || i5 != iArr[i4]) {
                    int i6 = i5 + 1;
                    iArr3[i] = iArr4[i5];
                    if (iArr3[i] >= insertionIndex) {
                        iArr3[i] = iArr3[i] + insertionCount;
                    }
                    i5 = i6;
                } else {
                    iArr3[i] = iArr2[i4];
                    i4++;
                }
                i++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive) {
            int i = indexToExclusive - indexFrom;
            int[] iArr = new int[this.b.length - i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i2 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.a.nextLong()));
                }
                if (iArr2[i2] < indexFrom || iArr2[i2] >= indexToExclusive) {
                    iArr[i2 - i3] = iArr2[i2] >= indexFrom ? iArr2[i2] - i : iArr2[i2];
                } else {
                    i3++;
                }
                i2++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.b.length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int index) {
            int i = this.c[index] + 1;
            int[] iArr = this.b;
            if (i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int index) {
            int i = this.c[index] - 1;
            if (i >= 0) {
                return this.b[i];
            }
            return -1;
        }

        public DefaultShuffleOrder(int length, long randomSeed) {
            this(length, new Random(randomSeed));
        }

        public DefaultShuffleOrder(int[] shuffledIndices, long randomSeed) {
            this(Arrays.copyOf(shuffledIndices, shuffledIndices.length), new Random(randomSeed));
        }

        private DefaultShuffleOrder(int length, Random random) {
            this(a(length, random), random);
        }

        private DefaultShuffleOrder(int[] shuffled, Random random) {
            this.b = shuffled;
            this.a = random;
            this.c = new int[shuffled.length];
            for (int i = 0; i < shuffled.length; i++) {
                this.c[shuffled[i]] = i;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int a;

        public UnshuffledShuffleOrder(int length) {
            this.a = length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount) {
            return new UnshuffledShuffleOrder(this.a + insertionCount);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive) {
            return new UnshuffledShuffleOrder((this.a - indexToExclusive) + indexFrom);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            return this.a > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int i = this.a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.a;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int index) {
            int i = index + 1;
            if (i < this.a) {
                return i;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int index) {
            int i = index - 1;
            if (i >= 0) {
                return i;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount);

    ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int index);

    int getPreviousIndex(int index);
}
