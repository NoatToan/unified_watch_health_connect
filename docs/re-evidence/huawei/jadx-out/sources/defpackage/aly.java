package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aly {
    public static boolean d(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    public static int e(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int c(@CheckForNull Object obj) {
        return e(obj == null ? 0 : obj.hashCode());
    }

    public static int a(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
