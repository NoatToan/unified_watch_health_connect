package io.netty.buffer;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes22.dex */
abstract class SizeClasses implements SizeClassesMetric {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INDEX_IDX = 0;
    private static final int LOG2DELTA_IDX = 2;
    private static final int LOG2GROUP_IDX = 1;
    private static final int LOG2_DELTA_LOOKUP_IDX = 6;
    private static final int LOG2_MAX_LOOKUP_SIZE = 12;
    public static final int LOG2_QUANTUM = 4;
    private static final int LOG2_SIZE_CLASS_GROUP = 2;
    private static final int NDELTA_IDX = 3;
    private static final int PAGESIZE_IDX = 4;
    private static final int SUBPAGE_IDX = 5;
    private static final byte no = 0;
    private static final byte yes = 1;
    public final int chunkSize;
    public final int directMemoryCacheAlignment;
    private int lookupMaxSize;
    public int nPSizes;
    public final int nSizes;
    public int nSubpages;
    private final int[] pageIdx2sizeTab;
    public final int pageShifts;
    public final int pageSize;
    private final int[] size2idxTab;
    private final short[][] sizeClasses;
    private final int[] sizeIdx2sizeTab;
    public int smallMaxSizeIdx;

    public SizeClasses(int i, int i2, int i3, int i4) {
        this.pageSize = i;
        this.pageShifts = i2;
        this.chunkSize = i3;
        this.directMemoryCacheAlignment = i4;
        this.sizeClasses = (short[][]) Array.newInstance((Class<?>) short.class, ((PoolThreadCache.log2(i3) + 1) - 4) << 2, 7);
        int iSizeClasses = sizeClasses();
        this.nSizes = iSizeClasses;
        int[] iArr = new int[iSizeClasses];
        this.sizeIdx2sizeTab = iArr;
        int[] iArr2 = new int[this.nPSizes];
        this.pageIdx2sizeTab = iArr2;
        idx2SizeTab(iArr, iArr2);
        int[] iArr3 = new int[this.lookupMaxSize >> 4];
        this.size2idxTab = iArr3;
        size2idxTab(iArr3);
    }

    private int alignSize(int i) {
        int i2 = this.directMemoryCacheAlignment;
        int i3 = (i2 - 1) & i;
        return i3 == 0 ? i : (i + i2) - i3;
    }

    private void idx2SizeTab(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < this.nSizes; i2++) {
            short[] sArr = this.sizeClasses[i2];
            int i3 = (1 << sArr[1]) + (sArr[3] << sArr[2]);
            iArr[i2] = i3;
            if (sArr[4] == 1) {
                iArr2[i] = i3;
                i++;
            }
        }
    }

    private static int normalizeSizeCompute(int i) {
        int iLog2 = PoolThreadCache.log2((i << 1) - 1);
        int i2 = (1 << (iLog2 < 7 ? 4 : (iLog2 - 2) - 1)) - 1;
        return (i + i2) & (~i2);
    }

    private int pages2pageIdxCompute(int i, boolean z) {
        int i2 = i << this.pageShifts;
        if (i2 > this.chunkSize) {
            return this.nPSizes;
        }
        int iLog2 = PoolThreadCache.log2((i2 << 1) - 1);
        int i3 = this.pageShifts;
        int i4 = (iLog2 < i3 + 2 ? 0 : iLog2 - (i3 + 2)) << 2;
        int i5 = iLog2 < (i3 + 2) + 1 ? i3 : (iLog2 - 2) - 1;
        int i6 = i4 + ((((i2 - 1) & ((-1) << i5)) >> i5) & 3);
        return (!z || this.pageIdx2sizeTab[i6] <= (i << i3)) ? i6 : i6 - 1;
    }

    private void size2idxTab(int[] iArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i <= this.lookupMaxSize) {
            int i4 = 1 << (this.sizeClasses[i2][2] - 4);
            while (i <= this.lookupMaxSize) {
                int i5 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                int i6 = i3 + 1;
                iArr[i3] = i2;
                i4 = i5;
                i3 = i6;
                i = (i6 + 1) << 4;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    private int sizeClass(int i, int i2, int i3, int i4) {
        short s;
        int i5 = this.pageShifts;
        if (i3 >= i5) {
            s = 1;
        } else {
            int i6 = 1 << i5;
            int i7 = (1 << i2) + ((1 << i3) * i4);
            if (i7 == (i7 / i6) * i6) {
                s = 1;
            } else {
                s = 0;
            }
        }
        int iLog2 = i4 == 0 ? 0 : PoolThreadCache.log2(i4);
        boolean z = (1 << iLog2) < i4;
        int i8 = iLog2 + i3 == i2 ? i2 + 1 : i2;
        if (i8 == i2) {
            z = true;
        }
        short[] sArr = {(short) i, (short) i2, (short) i3, (short) i4, s, i8 < this.pageShifts + 2 ? (short) 1 : (short) 0, (short) ((i8 < 12 || (i8 == 12 && !z)) ? i3 : 0)};
        this.sizeClasses[i] = sArr;
        int i9 = (1 << i2) + (i4 << i3);
        if (sArr[4] == 1) {
            this.nPSizes++;
        }
        if (sArr[5] == 1) {
            this.nSubpages++;
            this.smallMaxSizeIdx = i;
        }
        if (sArr[6] != 0) {
            this.lookupMaxSize = i9;
        }
        return i9;
    }

    private int sizeClasses() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 4) {
            int i4 = i + 1;
            int iSizeClass = sizeClass(i2, 4, 4, i);
            i2++;
            i3 = iSizeClass;
            i = i4;
        }
        int i5 = 6;
        int i6 = 4;
        while (i3 < this.chunkSize) {
            int i7 = 1;
            while (i7 <= 4 && i3 < this.chunkSize) {
                int i8 = i2 + 1;
                int iSizeClass2 = sizeClass(i2, i5, i6, i7);
                i7++;
                i3 = iSizeClass2;
                i2 = i8;
            }
            i5++;
            i6++;
        }
        return i2;
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int normalizeSize(int i) {
        if (i == 0) {
            return this.sizeIdx2sizeTab[0];
        }
        if (this.directMemoryCacheAlignment > 0) {
            i = alignSize(i);
        }
        return i <= this.lookupMaxSize ? this.sizeIdx2sizeTab[this.size2idxTab[(i - 1) >> 4]] : normalizeSizeCompute(i);
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public long pageIdx2size(int i) {
        return this.pageIdx2sizeTab[i];
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public long pageIdx2sizeCompute(int i) {
        int i2 = i >> 2;
        int i3 = i & 3;
        long j = i2 == 0 ? 0L : (1 << ((this.pageShifts + 2) - 1)) << i2;
        if (i2 == 0) {
            i2 = 1;
        }
        return j + ((long) ((i3 + 1) << ((i2 + this.pageShifts) - 1)));
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int pages2pageIdx(int i) {
        return pages2pageIdxCompute(i, false);
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int pages2pageIdxFloor(int i) {
        return pages2pageIdxCompute(i, true);
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int size2SizeIdx(int i) {
        if (i == 0) {
            return 0;
        }
        if (i > this.chunkSize) {
            return this.nSizes;
        }
        if (this.directMemoryCacheAlignment > 0) {
            i = alignSize(i);
        }
        if (i <= this.lookupMaxSize) {
            return this.size2idxTab[(i - 1) >> 4];
        }
        int iLog2 = PoolThreadCache.log2((i << 1) - 1);
        int i2 = (iLog2 >= 7 ? iLog2 - 6 : 0) << 2;
        int i3 = iLog2 >= 7 ? (iLog2 - 2) - 1 : 4;
        return i2 + ((((i - 1) & ((-1) << i3)) >> i3) & 3);
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int sizeIdx2size(int i) {
        return this.sizeIdx2sizeTab[i];
    }

    @Override // io.netty.buffer.SizeClassesMetric
    public int sizeIdx2sizeCompute(int i) {
        int i2 = i >> 2;
        int i3 = i & 3;
        int i4 = i2 == 0 ? 0 : 32 << i2;
        if (i2 == 0) {
            i2 = 1;
        }
        return i4 + ((i3 + 1) << ((i2 + 4) - 1));
    }
}
