package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UByte implements Comparable<UByte> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b2) {
        this.data = b2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m897and7apg3OU(byte b2, byte b3) {
        return m904constructorimpl((byte) (b2 & b3));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m898boximpl(byte b2) {
        return new UByte(b2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m899compareTo7apg3OU(byte b2) {
        return Intrinsics.compare(m954unboximpl() & 255, b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m901compareToVKZWuLQ(byte b2, long j) {
        return Long.compareUnsigned(ULong.m1060constructorimpl(((long) b2) & 255), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m902compareToWZ4Q5Ns(byte b2, int i) {
        return Integer.compareUnsigned(UInt.m981constructorimpl(b2 & 255), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m903compareToxj2QHRw(byte b2, short s) {
        return Intrinsics.compare(b2 & 255, s & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m904constructorimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m905decw2LRezQ(byte b2) {
        return m904constructorimpl((byte) (b2 - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m906div7apg3OU(byte b2, byte b3) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m907divVKZWuLQ(byte b2, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) b2) & 255), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m908divWZ4Q5Ns(byte b2, int i) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m909divxj2QHRw(byte b2, short s) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m910equalsimpl(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).m954unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m911equalsimpl0(byte b2, byte b3) {
        return b2 == b3;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m912floorDiv7apg3OU(byte b2, byte b3) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m913floorDivVKZWuLQ(byte b2, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) b2) & 255), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m914floorDivWZ4Q5Ns(byte b2, int i) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m915floorDivxj2QHRw(byte b2, short s) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m916hashCodeimpl(byte b2) {
        return Byte.hashCode(b2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m917incw2LRezQ(byte b2) {
        return m904constructorimpl((byte) (b2 + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m918invw2LRezQ(byte b2) {
        return m904constructorimpl((byte) (~b2));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m919minus7apg3OU(byte b2, byte b3) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) - UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m920minusVKZWuLQ(byte b2, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) b2) & 255) - j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m921minusWZ4Q5Ns(byte b2, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) - i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m922minusxj2QHRw(byte b2, short s) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) - UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m923mod7apg3OU(byte b2, byte b3) {
        return m904constructorimpl((byte) Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m924modVKZWuLQ(byte b2, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) b2) & 255), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m925modWZ4Q5Ns(byte b2, int i) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m926modxj2QHRw(byte b2, short s) {
        return UShort.m1167constructorimpl((short) Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m927or7apg3OU(byte b2, byte b3) {
        return m904constructorimpl((byte) (b2 | b3));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m928plus7apg3OU(byte b2, byte b3) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) + UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m929plusVKZWuLQ(byte b2, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) b2) & 255) + j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m930plusWZ4Q5Ns(byte b2, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) + i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m931plusxj2QHRw(byte b2, short s) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) + UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m932rangeTo7apg3OU(byte b2, byte b3) {
        return new UIntRange(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m933rangeUntil7apg3OU(byte b2, byte b3) {
        return URangesKt___URangesKt.m2169untilJ1ME1BU(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m934rem7apg3OU(byte b2, byte b3) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m935remVKZWuLQ(byte b2, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) b2) & 255), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m936remWZ4Q5Ns(byte b2, int i) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m937remxj2QHRw(byte b2, short s) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(b2 & 255), UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m938times7apg3OU(byte b2, byte b3) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) * UInt.m981constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m939timesVKZWuLQ(byte b2, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) b2) & 255) * j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m940timesWZ4Q5Ns(byte b2, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) * i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m941timesxj2QHRw(byte b2, short s) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(b2 & 255) * UInt.m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m942toByteimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m943toDoubleimpl(byte b2) {
        return UnsignedKt.uintToDouble(b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m944toFloatimpl(byte b2) {
        return (float) UnsignedKt.uintToDouble(b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m945toIntimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m946toLongimpl(byte b2) {
        return ((long) b2) & 255;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m947toShortimpl(byte b2) {
        return (short) (b2 & 255);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m948toStringimpl(byte b2) {
        return String.valueOf(b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m949toUBytew2LRezQ(byte b2) {
        return b2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m950toUIntpVg5ArA(byte b2) {
        return UInt.m981constructorimpl(b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m951toULongsVKNKU(byte b2) {
        return ULong.m1060constructorimpl(((long) b2) & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m952toUShortMh2AYeg(byte b2) {
        return UShort.m1167constructorimpl((short) (b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m953xor7apg3OU(byte b2, byte b3) {
        return m904constructorimpl((byte) (b2 ^ b3));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m954unboximpl() & 255, uByte.m954unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m910equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m916hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m948toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m954unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m900compareTo7apg3OU(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255);
    }
}
