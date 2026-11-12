package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m2113checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (Integer.compareUnsigned(i2, i) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m975boximpl(i), UInt.m975boximpl(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m2114checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (Long.compareUnsigned(j2, j) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m1054boximpl(j), ULong.m1054boximpl(j2)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random, int i) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m957constructorimpl(random.nextBytes(i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m2115nextUBytesEVgfTAA(@NotNull Random nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m2116nextUBytesWvrt4B4(@NotNull Random nextUBytes, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i, i2);
        return array;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m2117nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m963getSizeimpl(bArr);
        }
        return m2116nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m981constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m2118nextUInta8DCA5k(@NotNull Random nextUInt, int i, int i2) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m2113checkUIntRangeBoundsJ1ME1BU(i, i2);
        return UInt.m981constructorimpl(nextUInt.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m2119nextUIntqCasIEU(@NotNull Random nextUInt, int i) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m2118nextUInta8DCA5k(nextUInt, 0, i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m1060constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m2120nextULongV1Xi4fY(@NotNull Random nextULong, long j) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m2121nextULongjmpaWc(nextULong, 0L, j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m2121nextULongjmpaWc(@NotNull Random nextULong, long j, long j2) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m2114checkULongRangeBoundseb3DHEI(j, j2);
        return ULong.m1060constructorimpl(nextULong.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random, @NotNull UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (Integer.compareUnsigned(range.m2123getLastpVg5ArA(), -1) < 0) {
                return m2118nextUInta8DCA5k(random, range.m2122getFirstpVg5ArA(), UInt.m981constructorimpl(range.m2123getLastpVg5ArA() + 1));
            }
            return Integer.compareUnsigned(range.m2122getFirstpVg5ArA(), 0) > 0 ? UInt.m981constructorimpl(m2118nextUInta8DCA5k(random, UInt.m981constructorimpl(range.m2122getFirstpVg5ArA() - 1), range.m2123getLastpVg5ArA()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random, @NotNull ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.m2132getLastsVKNKU(), -1L) < 0) {
            return m2121nextULongjmpaWc(random, range.m2131getFirstsVKNKU(), ULong.m1060constructorimpl(range.m2132getLastsVKNKU() + ULong.m1060constructorimpl(((long) 1) & 4294967295L)));
        }
        if (Long.compareUnsigned(range.m2131getFirstsVKNKU(), 0L) <= 0) {
            return nextULong(random);
        }
        long j = ((long) 1) & 4294967295L;
        return ULong.m1060constructorimpl(m2121nextULongjmpaWc(random, ULong.m1060constructorimpl(range.m2131getFirstsVKNKU() - ULong.m1060constructorimpl(j)), range.m2132getLastsVKNKU()) + ULong.m1060constructorimpl(j));
    }
}
