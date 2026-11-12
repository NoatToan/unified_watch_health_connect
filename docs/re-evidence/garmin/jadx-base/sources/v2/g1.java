package v2;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/g1;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f174993a = new int[30];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174994b;

    public static long b(int i14, int i15, int i16, int i17, boolean z14) {
        int i18 = z14 ? i16 : i17;
        if (z14) {
            i16 = i17;
        }
        if (i14 < i15) {
            return og.a.l(i14, i14);
        }
        if (i14 == i15) {
            return i18 == 0 ? og.a.l(i15, i16 + i15) : og.a.l(i15, i15);
        }
        if (i14 < i15 + i18) {
            return i16 == 0 ? og.a.l(i15, i15) : og.a.l(i15, i16 + i15);
        }
        int i19 = (i14 - i18) + i16;
        return og.a.l(i19, i19);
    }

    public final long a(int i14, boolean z14) {
        int iMin;
        int iMax;
        int[] iArr = this.f174993a;
        int i15 = this.f174994b;
        if (i15 < 0) {
            iMin = i14;
            iMax = iMin;
        } else if (z14) {
            int iMax2 = i14;
            int i16 = 0;
            int i17 = iMax2;
            while (i16 < i15) {
                int i18 = i16 * 3;
                int i19 = iArr[i18];
                int i24 = iArr[i18 + 1];
                int i25 = iArr[i18 + 2];
                long jB = b(i17, i19, i24, i25, z14);
                long jB2 = b(iMax2, i19, i24, i25, z14);
                s5.w0.a aVar = s5.w0.f157315b;
                int iMin2 = Math.min((int) (jB >> 32), (int) (jB2 >> 32));
                iMax2 = Math.max((int) (jB & 4294967295L), (int) (jB2 & 4294967295L));
                i16++;
                i17 = iMin2;
            }
            iMin = i17;
            iMax = iMax2;
        } else {
            iMax = i14;
            iMin = iMax;
            for (int i26 = i15 - 1; -1 < i26; i26--) {
                int i27 = i26 * 3;
                int i28 = iArr[i27];
                int i29 = iArr[i27 + 1];
                int i30 = iArr[i27 + 2];
                long jB3 = b(iMin, i28, i29, i30, z14);
                long jB4 = b(iMax, i28, i29, i30, z14);
                s5.w0.a aVar2 = s5.w0.f157315b;
                iMin = Math.min((int) (jB3 >> 32), (int) (jB4 >> 32));
                iMax = Math.max((int) (jB3 & 4294967295L), (int) (jB4 & 4294967295L));
            }
        }
        return og.a.l(iMin, iMax);
    }

    public final void c(int i14, int i15, int i16) {
        if (i16 < 0) {
            b2.e.a("Expected newLen to be ≥ 0, was " + i16);
        }
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(iMin, i15) - iMin;
        if (iMax >= 2 || iMax != i16) {
            int i17 = this.f174994b + 1;
            int[] iArr = this.f174993a;
            if (i17 > iArr.length / 3) {
                this.f174993a = Arrays.copyOf(this.f174993a, Math.max(i17 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.f174993a;
            int i18 = this.f174994b * 3;
            iArr2[i18] = iMin;
            iArr2[i18 + 1] = iMax;
            iArr2[i18 + 2] = i16;
            this.f174994b = i17;
        }
    }
}
