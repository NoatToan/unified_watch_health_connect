package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Preconditions;
import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.google.common.primitives.Ints;
import com.huawei.hms.framework.common.ExceptionCode;
import java.math.RoundingMode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class apn {
    static final byte[] e = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f659b = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f658a = {3, 31, TypedValues.AttributesType.TYPE_PATH_ROTATE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f660c = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] d = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean d(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    static int e(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* JADX INFO: renamed from: apn$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            e = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int b(int i, RoundingMode roundingMode) {
        apr.a("x", i);
        switch (AnonymousClass2.e[roundingMode.ordinal()]) {
            case 1:
                apr.e(d(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + e((-1257966797) >>> iNumberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(int i, int i2, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (AnonymousClass2.e[roundingMode.ordinal()]) {
            case 1:
                apr.e(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                return i3 + i5;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                return i3 + i5;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                return i3 + i5;
            default:
                throw new AssertionError();
        }
    }

    public static int d(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        apr.b(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int a(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        int i3 = (int) j;
        apr.b(j == ((long) i3), "checkedMultiply", i, i2);
        return i3;
    }

    public static int b(int i, int i2) {
        return Ints.a(((long) i) + ((long) i2));
    }

    public static int c(int i, int i2) {
        return Ints.a(((long) i) * ((long) i2));
    }
}
