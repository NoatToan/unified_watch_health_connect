package kotlin.text;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "UStringsKt")
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m4311toStringJSWoG40(long j, int i) {
        return UnsignedKt.ulongToString(j, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m4312toStringLxnNnR4(byte b, int i) {
        return Integer.toString(b & 255, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m4313toStringV7xB4Y4(int i, int i2) {
        return Long.toString(((long) i) & 4294967295L, a.checkRadix(i2));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m4314toStringolVBNx4(short s, int i) {
        return Integer.toString(s & UShort.MAX_VALUE, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String str) {
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m3860unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str) {
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String str) {
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m3885unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str) {
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String str) {
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m3910unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str) {
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String str) {
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m3935unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str) {
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String str, int i) {
        UByte uByteOrNull = toUByteOrNull(str, i);
        if (uByteOrNull != null) {
            return uByteOrNull.m3860unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str, int i) {
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM3885unboximpl = uIntOrNull.m3885unboximpl();
        if (UnsignedKt.uintCompare(iM3885unboximpl, UInt.m3880constructorimpl(255)) > 0) {
            return null;
        }
        return UByte.m3854boximpl(UByte.m3855constructorimpl((byte) iM3885unboximpl));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String str, int i) {
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return uIntOrNull.m3885unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str, int i) {
        a.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = 1;
        if (Intrinsics.compare((int) cCharAt, 48) >= 0) {
            i3 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iM3880constructorimpl = UInt.m3880constructorimpl(i);
        int iM3954uintDivideJ1ME1BU = 119304647;
        while (i3 < length) {
            int i4 = i3 + 1;
            int iDigitOf = a.digitOf(str.charAt(i3), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (UnsignedKt.uintCompare(i2, iM3954uintDivideJ1ME1BU) > 0) {
                if (iM3954uintDivideJ1ME1BU == 119304647) {
                    iM3954uintDivideJ1ME1BU = UnsignedKt.m3954uintDivideJ1ME1BU(-1, iM3880constructorimpl);
                    if (UnsignedKt.uintCompare(i2, iM3954uintDivideJ1ME1BU) > 0) {
                    }
                }
                return null;
            }
            int iM3880constructorimpl2 = UInt.m3880constructorimpl(i2 * iM3880constructorimpl);
            int iM3880constructorimpl3 = UInt.m3880constructorimpl(UInt.m3880constructorimpl(iDigitOf) + iM3880constructorimpl2);
            if (UnsignedKt.uintCompare(iM3880constructorimpl3, iM3880constructorimpl2) < 0) {
                return null;
            }
            i2 = iM3880constructorimpl3;
            i3 = i4;
        }
        return UInt.m3879boximpl(i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String str, int i) {
        ULong uLongOrNull = toULongOrNull(str, i);
        if (uLongOrNull != null) {
            return uLongOrNull.m3910unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str, int i) {
        a.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j = -1;
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long jM3905constructorimpl = ULong.m3905constructorimpl(i);
        long j2 = 0;
        long jM3956ulongDivideeb3DHEI = 512409557603043100L;
        while (i2 < length) {
            int i3 = i2 + 1;
            int iDigitOf = a.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (UnsignedKt.ulongCompare(j2, jM3956ulongDivideeb3DHEI) > 0) {
                if (jM3956ulongDivideeb3DHEI == 512409557603043100L) {
                    jM3956ulongDivideeb3DHEI = UnsignedKt.m3956ulongDivideeb3DHEI(j, jM3905constructorimpl);
                    if (UnsignedKt.ulongCompare(j2, jM3956ulongDivideeb3DHEI) > 0) {
                    }
                }
                return null;
            }
            long jM3905constructorimpl2 = ULong.m3905constructorimpl(j2 * jM3905constructorimpl);
            long jM3905constructorimpl3 = ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) UInt.m3880constructorimpl(iDigitOf)) & 4294967295L) + jM3905constructorimpl2);
            if (UnsignedKt.ulongCompare(jM3905constructorimpl3, jM3905constructorimpl2) < 0) {
                return null;
            }
            j2 = jM3905constructorimpl3;
            i2 = i3;
            j = -1;
        }
        return ULong.m3904boximpl(j2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String str, int i) {
        UShort uShortOrNull = toUShortOrNull(str, i);
        if (uShortOrNull != null) {
            return uShortOrNull.m3935unboximpl();
        }
        l.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str, int i) {
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM3885unboximpl = uIntOrNull.m3885unboximpl();
        if (UnsignedKt.uintCompare(iM3885unboximpl, UInt.m3880constructorimpl(65535)) > 0) {
            return null;
        }
        return UShort.m3929boximpl(UShort.m3930constructorimpl((short) iM3885unboximpl));
    }
}
