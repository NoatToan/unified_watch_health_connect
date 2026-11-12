package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m1343partitionnroSd4(long[] jArr, int i, int i2) {
        long jM1120getsVKNKU = ULongArray.m1120getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(ULongArray.m1120getsVKNKU(jArr, i), jM1120getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m1120getsVKNKU(jArr, i2), jM1120getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM1120getsVKNKU2 = ULongArray.m1120getsVKNKU(jArr, i);
                ULongArray.m1125setk8EXiF4(jArr, i, ULongArray.m1120getsVKNKU(jArr, i2));
                ULongArray.m1125setk8EXiF4(jArr, i2, jM1120getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m1344partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM962getw2LRezQ = UByteArray.m962getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM962getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m962getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m962getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM962getw2LRezQ2 = UByteArray.m962getw2LRezQ(bArr, i);
                UByteArray.m967setVurrAj0(bArr, i, UByteArray.m962getw2LRezQ(bArr, i2));
                UByteArray.m967setVurrAj0(bArr, i2, bM962getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m1345partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM1225getMh2AYeg = UShortArray.m1225getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM1225getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM1225getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m1225getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM1225getMh2AYeg2 = UShortArray.m1225getMh2AYeg(sArr, i);
                UShortArray.m1230set01HTLdE(sArr, i, UShortArray.m1225getMh2AYeg(sArr, i2));
                UShortArray.m1230set01HTLdE(sArr, i2, sM1225getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m1346partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM1041getpVg5ArA = UIntArray.m1041getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(UIntArray.m1041getpVg5ArA(iArr, i), iM1041getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m1041getpVg5ArA(iArr, i2), iM1041getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM1041getpVg5ArA2 = UIntArray.m1041getpVg5ArA(iArr, i);
                UIntArray.m1046setVXSXFK8(iArr, i, UIntArray.m1041getpVg5ArA(iArr, i2));
                UIntArray.m1046setVXSXFK8(iArr, i2, iM1041getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m1347quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM1343partitionnroSd4 = m1343partitionnroSd4(jArr, i, i2);
        int i3 = iM1343partitionnroSd4 - 1;
        if (i < i3) {
            m1347quickSortnroSd4(jArr, i, i3);
        }
        if (iM1343partitionnroSd4 < i2) {
            m1347quickSortnroSd4(jArr, iM1343partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m1348quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM1344partition4UcCI2c = m1344partition4UcCI2c(bArr, i, i2);
        int i3 = iM1344partition4UcCI2c - 1;
        if (i < i3) {
            m1348quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM1344partition4UcCI2c < i2) {
            m1348quickSort4UcCI2c(bArr, iM1344partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m1349quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM1345partitionAa5vz7o = m1345partitionAa5vz7o(sArr, i, i2);
        int i3 = iM1345partitionAa5vz7o - 1;
        if (i < i3) {
            m1349quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM1345partitionAa5vz7o < i2) {
            m1349quickSortAa5vz7o(sArr, iM1345partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m1350quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM1346partitionoBK06Vg = m1346partitionoBK06Vg(iArr, i, i2);
        int i3 = iM1346partitionoBK06Vg - 1;
        if (i < i3) {
            m1350quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM1346partitionoBK06Vg < i2) {
            m1350quickSortoBK06Vg(iArr, iM1346partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m1351sortArraynroSd4(@NotNull long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1347quickSortnroSd4(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m1352sortArray4UcCI2c(@NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1348quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m1353sortArrayAa5vz7o(@NotNull short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1349quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m1354sortArrayoBK06Vg(@NotNull int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1350quickSortoBK06Vg(array, i, i2 - 1);
    }
}
