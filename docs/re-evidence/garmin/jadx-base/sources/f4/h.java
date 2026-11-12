package f4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4/h;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f68743b = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f68744c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f68745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68746e;

    public h() {
        int[] iArr = new int[16];
        int i14 = 0;
        while (i14 < 16) {
            int i15 = i14 + 1;
            iArr[i14] = i15;
            i14 = i15;
        }
        this.f68745d = iArr;
    }

    public final int a(long j8) {
        int i14 = this.f68742a + 1;
        long[] jArr = this.f68743b;
        int length = jArr.length;
        if (i14 > length) {
            int i15 = length * 2;
            long[] jArr2 = new long[i15];
            int[] iArr = new int[i15];
            p13.s.g(jArr, jArr2, 0, 0, jArr.length);
            p13.s.i(0, 0, 14, this.f68744c, iArr);
            this.f68743b = jArr2;
            this.f68744c = iArr;
        }
        int i16 = this.f68742a;
        this.f68742a = i16 + 1;
        int length2 = this.f68745d.length;
        if (this.f68746e >= length2) {
            int i17 = length2 * 2;
            int[] iArr2 = new int[i17];
            int i18 = 0;
            while (i18 < i17) {
                int i19 = i18 + 1;
                iArr2[i18] = i19;
                i18 = i19;
            }
            p13.s.i(0, 0, 14, this.f68745d, iArr2);
            this.f68745d = iArr2;
        }
        int i24 = this.f68746e;
        int[] iArr3 = this.f68745d;
        this.f68746e = iArr3[i24];
        long[] jArr3 = this.f68743b;
        jArr3[i16] = j8;
        this.f68744c[i16] = i24;
        iArr3[i24] = i16;
        while (i16 > 0) {
            int i25 = ((i16 + 1) >> 1) - 1;
            if (p005kotlin.jvm.internal.s.i(jArr3[i25], j8) <= 0) {
                break;
            }
            b(i25, i16);
            i16 = i25;
        }
        return i24;
    }

    public final void b(int i14, int i15) {
        long[] jArr = this.f68743b;
        int[] iArr = this.f68744c;
        int[] iArr2 = this.f68745d;
        long j8 = jArr[i14];
        jArr[i14] = jArr[i15];
        jArr[i15] = j8;
        int i16 = iArr[i14];
        int i17 = iArr[i15];
        iArr[i14] = i17;
        iArr[i15] = i16;
        iArr2[i17] = i14;
        iArr2[i16] = i15;
    }
}
