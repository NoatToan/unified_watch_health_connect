package q5;

import e23.r;
import java.util.Arrays;
import org.apache.commons.io.FileUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5/c;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f142825a = new long[192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f142826b = new long[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142827c;

    public final void a(int i14, int i15, int i16, int i17, int i18, int i19, boolean z14, boolean z15, boolean z16, int i24) {
        long[] jArr = this.f142825a;
        int i25 = this.f142827c;
        int i26 = i25 + 3;
        this.f142827c = i26;
        int length = jArr.length;
        if (length <= i26) {
            int iMax = Math.max(length * 2, i26);
            this.f142825a = Arrays.copyOf(jArr, iMax);
            this.f142826b = Arrays.copyOf(this.f142826b, iMax);
        }
        long[] jArr2 = this.f142825a;
        jArr2[i25] = (((long) i15) << 32) | (((long) i16) & 4294967295L);
        jArr2[i25 + 1] = (((long) i17) << 32) | (((long) i18) & 4294967295L);
        int i27 = i19 & 33554431;
        jArr2[i25 + 2] = ((z16 ? 1L : 0L) << 63) | ((z15 ? 1L : 0L) << 62) | ((z14 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i27) << 25) | ((long) (i14 & 33554431));
        if (i19 < 0) {
            return;
        }
        for (int i28 = i24 != -1 ? i24 : i25 - 3; i28 >= 0; i28 -= 3) {
            int i29 = i28 + 2;
            long j8 = jArr2[i29];
            if ((((int) j8) & 33554431) == i27) {
                jArr2[i29] = (j8 & d.f142828a) | (((long) Math.min((i25 - i28) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public final void c(int i14, boolean z14) {
        int i15 = i14 & 33554431;
        long[] jArr = this.f142825a;
        int i16 = this.f142827c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j8 = jArr[i18];
            if ((((int) j8) & 33554431) == i15) {
                long j14 = z14 ? 1L : 0L;
                jArr[i18] = (j14 * Long.MIN_VALUE) | (8070450532247928831L & j8) | (FileUtils.ONE_EB * j14);
                return;
            }
        }
    }

    public final void d(int i14, int i15, long j8) {
        int i16;
        char c14;
        char c15;
        long[] jArr = this.f142825a;
        long[] jArr2 = this.f142826b;
        jArr2[0] = j8;
        int i17 = 1;
        while (i17 > 0) {
            i17--;
            long j14 = jArr2[i17];
            int i18 = 33554431;
            int i19 = ((int) j14) & 33554431;
            char c16 = 25;
            int i24 = ((int) (j14 >> 25)) & 33554431;
            char c17 = '2';
            int i25 = ((int) (j14 >> 50)) & 1023;
            int i26 = i25 == 1023 ? this.f142827c : (i25 * 3) + i24;
            if (i24 < 0) {
                return;
            }
            while (i24 < jArr.length - 2 && i24 < i26) {
                int i27 = i24 + 2;
                long j15 = jArr[i27];
                if ((((int) (j15 >> c16)) & i18) == i19) {
                    long j16 = jArr[i24];
                    int i28 = i24 + 1;
                    i16 = i18;
                    c14 = c16;
                    long j17 = jArr[i28];
                    c15 = c17;
                    jArr[i24] = (((long) (((int) j16) + i15)) & 4294967295L) | (((long) (((int) (j16 >> 32)) + i14)) << 32);
                    jArr[i28] = (((long) (((int) j17) + i15)) & 4294967295L) | (((long) (((int) (j17 >> 32)) + i14)) << 32);
                    jArr[i27] = (((j15 >> 63) & 1) << 60) | j15;
                    if ((((int) (j15 >> c15)) & 1023) > 0) {
                        jArr2[i17] = (d.f142829b & j15) | (((long) ((i24 + 3) & i16)) << c14);
                        i17++;
                    }
                } else {
                    i16 = i18;
                    c14 = c16;
                    c15 = c17;
                }
                i24 += 3;
                i18 = i16;
                c16 = c14;
                c17 = c15;
            }
        }
    }

    public final void e(int i14, r rVar) {
        int i15 = i14 & 33554431;
        long[] jArr = this.f142825a;
        int i16 = this.f142827c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            if ((((int) jArr[i17 + 2]) & 33554431) == i15) {
                long j8 = jArr[i17];
                long j14 = jArr[i17 + 1];
                rVar.invoke(Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8), Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) j14));
                return;
            }
        }
    }
}
