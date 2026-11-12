package kotlin.experimental;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b2, byte b3) {
        return (byte) (b2 & b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b2) {
        return (byte) (~b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte b2, byte b3) {
        return (byte) (b2 | b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s, short s2) {
        return (short) (s & s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s) {
        return (short) (~s);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short s, short s2) {
        return (short) (s | s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s, short s2) {
        return (short) (s ^ s2);
    }
}
