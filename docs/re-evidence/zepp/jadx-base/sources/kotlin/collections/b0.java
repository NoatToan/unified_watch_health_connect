package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
class b0 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Iterator<UByte> it2 = iterable.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(it2.next().m3860unboximpl() & 255));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Iterator<UInt> it2 = iterable.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + it2.next().m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Iterator<ULong> it2 = iterable.iterator();
        long jM3905constructorimpl = 0;
        while (it2.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + it2.next().m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Iterator<UShort> it2 = iterable.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(it2.next().m3935unboximpl() & UShort.MAX_VALUE));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        byte[] bArrM3862constructorimpl = UByteArray.m3862constructorimpl(collection.size());
        Iterator<UByte> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UByteArray.m3873setVurrAj0(bArrM3862constructorimpl, i, it2.next().m3860unboximpl());
            i++;
        }
        return bArrM3862constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        int[] iArrM3887constructorimpl = UIntArray.m3887constructorimpl(collection.size());
        Iterator<UInt> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UIntArray.m3898setVXSXFK8(iArrM3887constructorimpl, i, it2.next().m3885unboximpl());
            i++;
        }
        return iArrM3887constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        long[] jArrM3912constructorimpl = ULongArray.m3912constructorimpl(collection.size());
        Iterator<ULong> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ULongArray.m3923setk8EXiF4(jArrM3912constructorimpl, i, it2.next().m3910unboximpl());
            i++;
        }
        return jArrM3912constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        short[] sArrM3937constructorimpl = UShortArray.m3937constructorimpl(collection.size());
        Iterator<UShort> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            UShortArray.m3948set01HTLdE(sArrM3937constructorimpl, i, it2.next().m3935unboximpl());
            i++;
        }
        return sArrM3937constructorimpl;
    }
}
