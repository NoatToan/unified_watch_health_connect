package h5;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/x;", "", "", "initialCapacity", "<init>", "(I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f82012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82013b;

    public x(int i14) {
        this.f82012a = new int[i14];
    }

    public final void a(int i14, int i15, int i16) {
        int i17 = this.f82013b;
        int[] iArrCopyOf = this.f82012a;
        int i18 = i17 + 3;
        if (i18 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f82012a = iArrCopyOf;
        }
        iArrCopyOf[i17] = i14 + i16;
        iArrCopyOf[i17 + 1] = i15 + i16;
        iArrCopyOf[i17 + 2] = i16;
        this.f82013b = i18;
    }

    public final void b(int i14, int i15, int i16, int i17) {
        int i18 = this.f82013b;
        int[] iArrCopyOf = this.f82012a;
        int i19 = i18 + 4;
        if (i19 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f82012a = iArrCopyOf;
        }
        iArrCopyOf[i18] = i14;
        iArrCopyOf[i18 + 1] = i15;
        iArrCopyOf[i18 + 2] = i16;
        iArrCopyOf[i18 + 3] = i17;
        this.f82013b = i19;
    }

    public final void c(int i14, int i15) {
        if (i14 < i15) {
            int i16 = i14 - 3;
            for (int i17 = i14; i17 < i15; i17 += 3) {
                int[] iArr = this.f82012a;
                int i18 = iArr[i17];
                int i19 = iArr[i15];
                if (i18 < i19 || (i18 == i19 && iArr[i17 + 1] <= iArr[i15 + 1])) {
                    i16 += 3;
                    d(i16, i17);
                }
            }
            d(i16 + 3, i15);
            c(i14, i16);
            c(i16 + 6, i15);
        }
    }

    public final void d(int i14, int i15) {
        int[] iArr = this.f82012a;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
        int i17 = i14 + 1;
        int i18 = i15 + 1;
        int i19 = iArr[i17];
        iArr[i17] = iArr[i18];
        iArr[i18] = i19;
        int i24 = i14 + 2;
        int i25 = i15 + 2;
        int i26 = iArr[i24];
        iArr[i24] = iArr[i25];
        iArr[i25] = i26;
    }
}
