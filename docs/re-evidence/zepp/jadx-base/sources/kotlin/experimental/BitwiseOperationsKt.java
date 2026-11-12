package kotlin.experimental;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte a(byte b, byte b2) {
        return (byte) (b & b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short b(short s, short s2) {
        return (short) (s & s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte c(byte b) {
        return (byte) (~b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short d(short s) {
        return (short) (~s);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte e(byte b, byte b2) {
        return (byte) (b | b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short f(short s, short s2) {
        return (short) (s | s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte g(byte b, byte b2) {
        return (byte) (b ^ b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short h(short s, short s2) {
        return (short) (s ^ s2);
    }
}
