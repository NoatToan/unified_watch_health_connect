package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class UByteKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte toUByte(byte b2) {
        return UByte.m904constructorimpl(b2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte toUByte(short s) {
        return UByte.m904constructorimpl((byte) s);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte toUByte(int i) {
        return UByte.m904constructorimpl((byte) i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte toUByte(long j) {
        return UByte.m904constructorimpl((byte) j);
    }
}
