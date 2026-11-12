package b63;

import com.google.android.exoplayer2.C;
import i3.e5;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final f a(int i14, int i15, int i16, int i17, int i18, long j8, int i19) {
        long jB = b(i14, i15);
        long j14 = 60;
        long j15 = ((((long) i17) * j14) + ((long) i18)) * j14;
        long j16 = 1000000000;
        long j17 = (j8 / j16) + j15 + ((long) i19);
        try {
            long j18 = j8 % j16;
            if (j17 > 0 && j18 < 0) {
                j17--;
                j18 += C.NANOS_PER_SECOND;
            } else if (j17 < 0 && j18 > 0) {
                j17++;
                j18 -= C.NANOS_PER_SECOND;
            }
            long jAddExact = Math.addExact(Math.multiplyExact(j17, C.NANOS_PER_SECOND), j18);
            return jAddExact != 0 ? new g(jB, i16, jAddExact) : new d(jB, i16);
        } catch (ArithmeticException unused) {
            StringBuilder sbJ = e5.j(i17, i18, "The total number of nanoseconds in ", " hours, ", " minutes, ");
            sbJ.append(i19);
            sbJ.append(" seconds, and ");
            sbJ.append(j8);
            sbJ.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbJ.toString());
        }
    }

    public static final long b(int i14, int i15) {
        long j8 = 12;
        long j14 = (((long) i14) * j8) + ((long) i15);
        long j15 = j14 / j8;
        if (-2147483648L <= j15 && j15 <= 2147483647L) {
            return j14;
        }
        vb.h.x(am.j.g(i14, i15, "The total number of years in ", " years and ", " months overflows an Int"));
        return 0L;
    }
}
