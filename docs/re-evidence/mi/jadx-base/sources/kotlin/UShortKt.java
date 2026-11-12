package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class UShortKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short toUShort(byte b2) {
        return UShort.m1167constructorimpl(b2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short toUShort(short s) {
        return UShort.m1167constructorimpl(s);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short toUShort(int i) {
        return UShort.m1167constructorimpl((short) i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short toUShort(long j) {
        return UShort.m1167constructorimpl((short) j);
    }
}
