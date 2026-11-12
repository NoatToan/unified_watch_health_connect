package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface t {
    a cloneAndClear();

    a cloneAndInsert(int i14, int i15);

    a cloneAndRemove(int i14, int i15);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i14);

    int getPreviousIndex(int i14);

    public static class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f9650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f9651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f9652c;

        private a(int[] iArr, Random random) {
            this.f9651b = iArr;
            this.f9650a = random;
            this.f9652c = new int[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                this.f9652c[iArr[i14]] = i14;
            }
        }

        @Override // androidx.media3.exoplayer.source.t
        public final a cloneAndClear() {
            return new a(0, new Random(this.f9650a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.t
        public final a cloneAndInsert(int i14, int i15) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            int i16 = 0;
            while (true) {
                iArr = this.f9651b;
                random = this.f9650a;
                if (i16 >= i15) {
                    break;
                }
                iArr2[i16] = random.nextInt(iArr.length + 1);
                int i17 = i16 + 1;
                int iNextInt = random.nextInt(i17);
                iArr3[i16] = iArr3[iNextInt];
                iArr3[iNextInt] = i16 + i14;
                i16 = i17;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i15];
            int i18 = 0;
            int i19 = 0;
            for (int i24 = 0; i24 < iArr.length + i15; i24++) {
                if (i18 >= i15 || i19 != iArr2[i18]) {
                    int i25 = i19 + 1;
                    int i26 = iArr[i19];
                    iArr4[i24] = i26;
                    if (i26 >= i14) {
                        iArr4[i24] = i26 + i15;
                    }
                    i19 = i25;
                } else {
                    iArr4[i24] = iArr3[i18];
                    i18++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.t
        public final a cloneAndRemove(int i14, int i15) {
            int i16 = i15 - i14;
            int[] iArr = this.f9651b;
            int[] iArr2 = new int[iArr.length - i16];
            int i17 = 0;
            for (int i18 = 0; i18 < iArr.length; i18++) {
                int i19 = iArr[i18];
                if (i19 < i14 || i19 >= i15) {
                    int i24 = i18 - i17;
                    if (i19 >= i14) {
                        i19 -= i16;
                    }
                    iArr2[i24] = i19;
                } else {
                    i17++;
                }
            }
            return new a(iArr2, new Random(this.f9650a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.t
        public final int getFirstIndex() {
            int[] iArr = this.f9651b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.t
        public final int getLastIndex() {
            int[] iArr = this.f9651b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.t
        public final int getLength() {
            return this.f9651b.length;
        }

        @Override // androidx.media3.exoplayer.source.t
        public final int getNextIndex(int i14) {
            int i15 = this.f9652c[i14] + 1;
            int[] iArr = this.f9651b;
            if (i15 < iArr.length) {
                return iArr[i15];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.t
        public final int getPreviousIndex(int i14) {
            int i15 = this.f9652c[i14] - 1;
            if (i15 >= 0) {
                return this.f9651b[i15];
            }
            return -1;
        }

        public a(int i14, long j8) {
            this(i14, new Random(j8));
        }

        public a(int[] iArr, long j8) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j8));
        }

        public a(int i14) {
            this(i14, new Random());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private a(int i14, Random random) {
            int[] iArr = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                int iNextInt = random.nextInt(i16);
                iArr[i15] = iArr[iNextInt];
                iArr[iNextInt] = i15;
                i15 = i16;
            }
            this(iArr, random);
        }
    }
}
