package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uw9 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f36209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f36210b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;

        public b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f36209a = jArr;
            this.f36210b = iArr;
            this.c = i;
            this.d = jArr2;
            this.e = iArr2;
            this.f = j;
        }
    }

    public static b a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iL = 0;
        for (int i3 : iArr) {
            iL += wlq.l(i3, i2);
        }
        long[] jArr2 = new long[iL];
        int[] iArr2 = new int[iL];
        long[] jArr3 = new long[iL];
        int[] iArr3 = new int[iL];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}
