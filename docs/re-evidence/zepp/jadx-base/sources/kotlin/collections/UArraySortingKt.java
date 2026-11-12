package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    private static final int a(long[] jArr, int i, int i2) {
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.ulongCompare(ULongArray.m3918getsVKNKU(jArr, i), jM3918getsVKNKU) < 0) {
                i++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m3918getsVKNKU(jArr, i2), jM3918getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                ULongArray.m3923setk8EXiF4(jArr, i, ULongArray.m3918getsVKNKU(jArr, i2));
                ULongArray.m3923setk8EXiF4(jArr, i2, jM3918getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    private static final int b(byte[] bArr, int i, int i2) {
        int i3;
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM3868getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m3868getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m3868getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                UByteArray.m3873setVurrAj0(bArr, i, UByteArray.m3868getw2LRezQ(bArr, i2));
                UByteArray.m3873setVurrAj0(bArr, i2, bM3868getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    private static final int c(short[] sArr, int i, int i2) {
        int i3;
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM3943getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM3943getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m3943getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                UShortArray.m3948set01HTLdE(sArr, i, UShortArray.m3943getMh2AYeg(sArr, i2));
                UShortArray.m3948set01HTLdE(sArr, i2, sM3943getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    private static final int d(int[] iArr, int i, int i2) {
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.uintCompare(UIntArray.m3893getpVg5ArA(iArr, i), iM3893getpVg5ArA) < 0) {
                i++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m3893getpVg5ArA(iArr, i2), iM3893getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                UIntArray.m3898setVXSXFK8(iArr, i, UIntArray.m3893getpVg5ArA(iArr, i2));
                UIntArray.m3898setVXSXFK8(iArr, i2, iM3893getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    private static final void e(long[] jArr, int i, int i2) {
        int iA = a(jArr, i, i2);
        int i3 = iA - 1;
        if (i < i3) {
            e(jArr, i, i3);
        }
        if (iA < i2) {
            e(jArr, iA, i2);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void f(byte[] bArr, int i, int i2) {
        int iB = b(bArr, i, i2);
        int i3 = iB - 1;
        if (i < i3) {
            f(bArr, i, i3);
        }
        if (iB < i2) {
            f(bArr, iB, i2);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void g(short[] sArr, int i, int i2) {
        int iC = c(sArr, i, i2);
        int i3 = iC - 1;
        if (i < i3) {
            g(sArr, i, i3);
        }
        if (iC < i2) {
            g(sArr, iC, i2);
        }
    }

    @ExperimentalUnsignedTypes
    private static final void h(int[] iArr, int i, int i2) {
        int iD = d(iArr, i, i2);
        int i3 = iD - 1;
        if (i < i3) {
            h(iArr, i, i3);
        }
        if (iD < i2) {
            h(iArr, iD, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m3968sortArraynroSd4(@NotNull long[] jArr, int i, int i2) {
        e(jArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m3969sortArray4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        f(bArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m3970sortArrayAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        g(sArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m3971sortArrayoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        h(iArr, i, i2 - 1);
    }
}
