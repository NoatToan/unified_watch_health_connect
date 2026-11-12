package defpackage;

import com.google.common.base.Objects;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class alk {
    public static int a(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int b(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int b(int i, int i2) {
        return i & i2;
    }

    public static int c(int i, int i2) {
        return i & (~i2);
    }

    public static int a(int i) {
        return Math.max(4, aly.a(i + 1, 1.0d));
    }

    public static Object c(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
        }
        if (i <= 256) {
            return new byte[i];
        }
        if (i <= 65536) {
            return new short[i];
        }
        return new int[i];
    }

    public static void b(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int b(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int b(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iC = aly.c(obj);
        int i2 = iC & i;
        int iB = b(obj3, i2);
        if (iB == 0) {
            return -1;
        }
        int iC2 = c(iC, i);
        int i3 = -1;
        while (true) {
            int i4 = iB - 1;
            int i5 = iArr[i4];
            if (c(i5, i) == iC2 && Objects.equal(obj, objArr[i4]) && (objArr2 == null || Objects.equal(obj2, objArr2[i4]))) {
                int iB2 = b(i5, i);
                if (i3 == -1) {
                    e(obj3, i2, iB2);
                    return i4;
                }
                iArr[i3] = a(iArr[i3], iB2, i);
                return i4;
            }
            int iB3 = b(i5, i);
            if (iB3 == 0) {
                return -1;
            }
            i3 = i4;
            iB = iB3;
        }
    }
}
