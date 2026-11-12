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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(it.next().m954unboximpl() & 255));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + it.next().m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long jM1060constructorimpl = 0;
        while (it.hasNext()) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + it.next().m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(it.next().m1217unboximpl() & UShort.MAX_VALUE));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrM956constructorimpl = UByteArray.m956constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UByteArray.m967setVurrAj0(bArrM956constructorimpl, i, it.next().m954unboximpl());
            i++;
        }
        return bArrM956constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrM1035constructorimpl = UIntArray.m1035constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UIntArray.m1046setVXSXFK8(iArrM1035constructorimpl, i, it.next().m1033unboximpl());
            i++;
        }
        return iArrM1035constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM1114constructorimpl = ULongArray.m1114constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ULongArray.m1125setk8EXiF4(jArrM1114constructorimpl, i, it.next().m1112unboximpl());
            i++;
        }
        return jArrM1114constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrM1219constructorimpl = UShortArray.m1219constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UShortArray.m1230set01HTLdE(sArrM1219constructorimpl, i, it.next().m1217unboximpl());
            i++;
        }
        return sArrM1219constructorimpl;
    }
}
