package kotlin.sequences;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
class USequencesKt___USequencesKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence<UByte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UByte> it = sequence.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(it.next().m954unboximpl() & 255));
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence<UInt> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UInt> it = sequence.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + it.next().m1033unboximpl());
        }
        return iM981constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence<ULong> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<ULong> it = sequence.iterator();
        long jM1060constructorimpl = 0;
        while (it.hasNext()) {
            jM1060constructorimpl = ULong.m1060constructorimpl(jM1060constructorimpl + it.next().m1112unboximpl());
        }
        return jM1060constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence<UShort> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UShort> it = sequence.iterator();
        int iM981constructorimpl = 0;
        while (it.hasNext()) {
            iM981constructorimpl = UInt.m981constructorimpl(iM981constructorimpl + UInt.m981constructorimpl(it.next().m1217unboximpl() & UShort.MAX_VALUE));
        }
        return iM981constructorimpl;
    }
}
