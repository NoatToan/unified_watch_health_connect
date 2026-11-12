package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UInt implements Comparable<UInt> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m974andWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i & i2);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m975boximpl(int i) {
        return new UInt(i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m976compareTo7apg3OU(int i, byte b2) {
        return Integer.compareUnsigned(i, m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m977compareToVKZWuLQ(int i, long j) {
        return Long.compareUnsigned(ULong.m1060constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m978compareToWZ4Q5Ns(int i) {
        return UnsignedKt.uintCompare(m1033unboximpl(), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m980compareToxj2QHRw(int i, short s) {
        return Integer.compareUnsigned(i, m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m981constructorimpl(int i) {
        return i;
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m982decpVg5ArA(int i) {
        return m981constructorimpl(i - 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m983div7apg3OU(int i, byte b2) {
        return Integer.divideUnsigned(i, m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m984divVKZWuLQ(int i, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m985divWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m1237uintDivideJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m986divxj2QHRw(int i, short s) {
        return Integer.divideUnsigned(i, m981constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m987equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m1033unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m988equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m989floorDiv7apg3OU(int i, byte b2) {
        return Integer.divideUnsigned(i, m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m990floorDivVKZWuLQ(int i, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m991floorDivWZ4Q5Ns(int i, int i2) {
        return Integer.divideUnsigned(i, i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m992floorDivxj2QHRw(int i, short s) {
        return Integer.divideUnsigned(i, m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m993hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m994incpVg5ArA(int i) {
        return m981constructorimpl(i + 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m995invpVg5ArA(int i) {
        return m981constructorimpl(~i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m996minus7apg3OU(int i, byte b2) {
        return m981constructorimpl(i - m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m997minusVKZWuLQ(int i, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) i) & 4294967295L) - j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m998minusWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i - i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m999minusxj2QHRw(int i, short s) {
        return m981constructorimpl(i - m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1000mod7apg3OU(int i, byte b2) {
        return UByte.m904constructorimpl((byte) Integer.remainderUnsigned(i, m981constructorimpl(b2 & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1001modVKZWuLQ(int i, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1002modWZ4Q5Ns(int i, int i2) {
        return Integer.remainderUnsigned(i, i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1003modxj2QHRw(int i, short s) {
        return UShort.m1167constructorimpl((short) Integer.remainderUnsigned(i, m981constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m1004orWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i | i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1005plus7apg3OU(int i, byte b2) {
        return m981constructorimpl(i + m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1006plusVKZWuLQ(int i, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) i) & 4294967295L) + j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1007plusWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i + i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1008plusxj2QHRw(int i, short s) {
        return m981constructorimpl(i + m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m1009rangeToWZ4Q5Ns(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m1010rangeUntilWZ4Q5Ns(int i, int i2) {
        return URangesKt___URangesKt.m2169untilJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1011rem7apg3OU(int i, byte b2) {
        return Integer.remainderUnsigned(i, m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1012remVKZWuLQ(int i, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1013remWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m1238uintRemainderJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1014remxj2QHRw(int i, short s) {
        return Integer.remainderUnsigned(i, m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m1015shlpVg5ArA(int i, int i2) {
        return m981constructorimpl(i << i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m1016shrpVg5ArA(int i, int i2) {
        return m981constructorimpl(i >>> i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1017times7apg3OU(int i, byte b2) {
        return m981constructorimpl(i * m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1018timesVKZWuLQ(int i, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) i) & 4294967295L) * j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1019timesWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i * i2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1020timesxj2QHRw(int i, short s) {
        return m981constructorimpl(i * m981constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1021toByteimpl(int i) {
        return (byte) i;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1022toDoubleimpl(int i) {
        return UnsignedKt.uintToDouble(i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1023toFloatimpl(int i) {
        return (float) UnsignedKt.uintToDouble(i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m1024toIntimpl(int i) {
        return i;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m1025toLongimpl(int i) {
        return ((long) i) & 4294967295L;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m1026toShortimpl(int i) {
        return (short) i;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1027toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1028toUBytew2LRezQ(int i) {
        return UByte.m904constructorimpl((byte) i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1029toUIntpVg5ArA(int i) {
        return i;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1030toULongsVKNKU(int i) {
        return ULong.m1060constructorimpl(((long) i) & 4294967295L);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1031toUShortMh2AYeg(int i) {
        return UShort.m1167constructorimpl((short) i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m1032xorWZ4Q5Ns(int i, int i2) {
        return m981constructorimpl(i ^ i2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m1033unboximpl(), uInt.m1033unboximpl());
    }

    public boolean equals(Object obj) {
        return m987equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m993hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m1027toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1033unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m979compareToWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2);
    }
}
