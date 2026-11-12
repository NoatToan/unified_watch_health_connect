package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "UNumbersKt")
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m1132countLeadingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfLeadingZeros(b2 & 255) - 24;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m1133countLeadingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1134countLeadingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m1135countLeadingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m1136countOneBits7apg3OU(byte b2) {
        return Integer.bitCount(UInt.m981constructorimpl(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m1137countOneBitsVKZWuLQ(long j) {
        return Long.bitCount(j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1138countOneBitsWZ4Q5Ns(int i) {
        return Integer.bitCount(i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m1139countOneBitsxj2QHRw(short s) {
        return Integer.bitCount(UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m1140countTrailingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfTrailingZeros(b2 | 256);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m1141countTrailingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m1142countTrailingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m1143countTrailingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m1144rotateLeftJSWoG40(long j, int i) {
        return ULong.m1060constructorimpl(Long.rotateLeft(j, i));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m1145rotateLeftLxnNnR4(byte b2, int i) {
        return UByte.m904constructorimpl(NumbersKt__NumbersKt.rotateLeft(b2, i));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m1146rotateLeftV7xB4Y4(int i, int i2) {
        return UInt.m981constructorimpl(Integer.rotateLeft(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m1147rotateLeftolVBNx4(short s, int i) {
        return UShort.m1167constructorimpl(NumbersKt__NumbersKt.rotateLeft(s, i));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m1148rotateRightJSWoG40(long j, int i) {
        return ULong.m1060constructorimpl(Long.rotateRight(j, i));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m1149rotateRightLxnNnR4(byte b2, int i) {
        return UByte.m904constructorimpl(NumbersKt__NumbersKt.rotateRight(b2, i));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m1150rotateRightV7xB4Y4(int i, int i2) {
        return UInt.m981constructorimpl(Integer.rotateRight(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m1151rotateRightolVBNx4(short s, int i) {
        return UShort.m1167constructorimpl(NumbersKt__NumbersKt.rotateRight(s, i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m1152takeHighestOneBit7apg3OU(byte b2) {
        return UByte.m904constructorimpl((byte) Integer.highestOneBit(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m1153takeHighestOneBitVKZWuLQ(long j) {
        return ULong.m1060constructorimpl(Long.highestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m1154takeHighestOneBitWZ4Q5Ns(int i) {
        return UInt.m981constructorimpl(Integer.highestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m1155takeHighestOneBitxj2QHRw(short s) {
        return UShort.m1167constructorimpl((short) Integer.highestOneBit(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m1156takeLowestOneBit7apg3OU(byte b2) {
        return UByte.m904constructorimpl((byte) Integer.lowestOneBit(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m1157takeLowestOneBitVKZWuLQ(long j) {
        return ULong.m1060constructorimpl(Long.lowestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m1158takeLowestOneBitWZ4Q5Ns(int i) {
        return UInt.m981constructorimpl(Integer.lowestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m1159takeLowestOneBitxj2QHRw(short s) {
        return UShort.m1167constructorimpl((short) Integer.lowestOneBit(s & UShort.MAX_VALUE));
    }
}
