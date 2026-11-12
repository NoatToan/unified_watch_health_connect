package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public interface ShuffleOrder {

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i14) {
            this.length = i14;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i14, int i15) {
            return new UnshuffledShuffleOrder(this.length + i15);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i14, int i15) {
            return new UnshuffledShuffleOrder((this.length - i15) + i14);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int i14 = this.length;
            if (i14 > 0) {
                return i14 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i14) {
            int i15 = i14 + 1;
            if (i15 < this.length) {
                return i15;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i14) {
            int i15 = i14 - 1;
            if (i15 >= 0) {
                return i15;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i14, int i15);

    ShuffleOrder cloneAndRemove(int i14, int i15);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i14);

    int getPreviousIndex(int i14);

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                this.indexInShuffled[iArr[i14]] = i14;
            }
        }

        private static int[] createShuffledList(int i14, Random random) {
            int[] iArr = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                int iNextInt = random.nextInt(i16);
                iArr[i15] = iArr[iNextInt];
                iArr[iNextInt] = i15;
                i15 = i16;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i14, int i15) {
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            int i16 = 0;
            int i17 = 0;
            while (i17 < i15) {
                iArr[i17] = this.random.nextInt(this.shuffled.length + 1);
                int i18 = i17 + 1;
                int iNextInt = this.random.nextInt(i18);
                iArr2[i17] = iArr2[iNextInt];
                iArr2[iNextInt] = i17 + i14;
                i17 = i18;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i15];
            int i19 = 0;
            int i24 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i16 >= iArr4.length + i15) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
                if (i19 >= i15 || i24 != iArr[i19]) {
                    int i25 = i24 + 1;
                    int i26 = iArr4[i24];
                    iArr3[i16] = i26;
                    if (i26 >= i14) {
                        iArr3[i16] = i26 + i15;
                    }
                    i24 = i25;
                } else {
                    iArr3[i16] = iArr2[i19];
                    i19++;
                }
                i16++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i14, int i15) {
            int i16 = i15 - i14;
            int[] iArr = new int[this.shuffled.length - i16];
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i17 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
                int i19 = iArr2[i17];
                if (i19 < i14 || i19 >= i15) {
                    int i24 = i17 - i18;
                    if (i19 >= i14) {
                        i19 -= i16;
                    }
                    iArr[i24] = i19;
                } else {
                    i18++;
                }
                i17++;
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i14) {
            int i15 = this.indexInShuffled[i14] + 1;
            int[] iArr = this.shuffled;
            if (i15 < iArr.length) {
                return iArr[i15];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i14) {
            int i15 = this.indexInShuffled[i14] - 1;
            if (i15 >= 0) {
                return this.shuffled[i15];
            }
            return -1;
        }

        public DefaultShuffleOrder(int i14, long j8) {
            this(i14, new Random(j8));
        }

        public DefaultShuffleOrder(int[] iArr, long j8) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j8));
        }

        private DefaultShuffleOrder(int i14, Random random) {
            this(createShuffledList(i14, random), random);
        }

        public DefaultShuffleOrder(int i14) {
            this(i14, new Random());
        }
    }
}
