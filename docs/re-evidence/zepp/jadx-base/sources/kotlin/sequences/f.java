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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
class f {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence<UByte> sequence) {
        Iterator<UByte> it2 = sequence.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(it2.next().m3860unboximpl() & 255));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence<UInt> sequence) {
        Iterator<UInt> it2 = sequence.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + it2.next().m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence<ULong> sequence) {
        Iterator<ULong> it2 = sequence.iterator();
        long jM3905constructorimpl = 0;
        while (it2.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + it2.next().m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence<UShort> sequence) {
        Iterator<UShort> it2 = sequence.iterator();
        int iM3880constructorimpl = 0;
        while (it2.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(it2.next().m3935unboximpl() & UShort.MAX_VALUE));
        }
        return iM3880constructorimpl;
    }
}
