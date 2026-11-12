package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt___URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULong implements Comparable<ULong> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m1053andVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j & j2);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m1054boximpl(long j) {
        return new ULong(j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1055compareTo7apg3OU(long j, byte b2) {
        return Long.compareUnsigned(j, m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m1056compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(m1112unboximpl(), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1058compareToWZ4Q5Ns(long j, int i) {
        return Long.compareUnsigned(j, m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1059compareToxj2QHRw(long j, short s) {
        return Long.compareUnsigned(j, m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1060constructorimpl(long j) {
        return j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m1061decsVKNKU(long j) {
        return m1060constructorimpl(j - 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m1062div7apg3OU(long j, byte b2) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1063divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m1239ulongDivideeb3DHEI(j, j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m1064divWZ4Q5Ns(long j, int i) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m1065divxj2QHRw(long j, short s) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1066equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m1112unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1067equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m1068floorDiv7apg3OU(long j, byte b2) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1069floorDivVKZWuLQ(long j, long j2) {
        return Long.divideUnsigned(j, j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m1070floorDivWZ4Q5Ns(long j, int i) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m1071floorDivxj2QHRw(long j, short s) {
        return Long.divideUnsigned(j, m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1072hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m1073incsVKNKU(long j) {
        return m1060constructorimpl(j + 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m1074invsVKNKU(long j) {
        return m1060constructorimpl(~j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m1075minus7apg3OU(long j, byte b2) {
        return m1060constructorimpl(j - m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1076minusVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j - j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1077minusWZ4Q5Ns(long j, int i) {
        return m1060constructorimpl(j - m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m1078minusxj2QHRw(long j, short s) {
        return m1060constructorimpl(j - m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1079mod7apg3OU(long j, byte b2) {
        return UByte.m904constructorimpl((byte) Long.remainderUnsigned(j, m1060constructorimpl(((long) b2) & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1080modVKZWuLQ(long j, long j2) {
        return Long.remainderUnsigned(j, j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1081modWZ4Q5Ns(long j, int i) {
        return UInt.m981constructorimpl((int) Long.remainderUnsigned(j, m1060constructorimpl(((long) i) & 4294967295L)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1082modxj2QHRw(long j, short s) {
        return UShort.m1167constructorimpl((short) Long.remainderUnsigned(j, m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m1083orVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j | j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m1084plus7apg3OU(long j, byte b2) {
        return m1060constructorimpl(j + m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1085plusVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j + j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1086plusWZ4Q5Ns(long j, int i) {
        return m1060constructorimpl(j + m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m1087plusxj2QHRw(long j, short s) {
        return m1060constructorimpl(j + m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1088rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1089rangeUntilVKZWuLQ(long j, long j2) {
        return URangesKt___URangesKt.m2171untileb3DHEI(j, j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m1090rem7apg3OU(long j, byte b2) {
        return Long.remainderUnsigned(j, m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1091remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m1240ulongRemaindereb3DHEI(j, j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m1092remWZ4Q5Ns(long j, int i) {
        return Long.remainderUnsigned(j, m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m1093remxj2QHRw(long j, short s) {
        return Long.remainderUnsigned(j, m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m1094shlsVKNKU(long j, int i) {
        return m1060constructorimpl(j << i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m1095shrsVKNKU(long j, int i) {
        return m1060constructorimpl(j >>> i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m1096times7apg3OU(long j, byte b2) {
        return m1060constructorimpl(j * m1060constructorimpl(((long) b2) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1097timesVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j * j2);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m1098timesWZ4Q5Ns(long j, int i) {
        return m1060constructorimpl(j * m1060constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m1099timesxj2QHRw(long j, short s) {
        return m1060constructorimpl(j * m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1100toByteimpl(long j) {
        return (byte) j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1101toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1102toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m1103toIntimpl(long j) {
        return (int) j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m1104toLongimpl(long j) {
        return j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m1105toShortimpl(long j) {
        return (short) j;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1106toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1107toUBytew2LRezQ(long j) {
        return UByte.m904constructorimpl((byte) j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1108toUIntpVg5ArA(long j) {
        return UInt.m981constructorimpl((int) j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1109toULongsVKNKU(long j) {
        return j;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1110toUShortMh2AYeg(long j) {
        return UShort.m1167constructorimpl((short) j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m1111xorVKZWuLQ(long j, long j2) {
        return m1060constructorimpl(j ^ j2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m1112unboximpl(), uLong.m1112unboximpl());
    }

    public boolean equals(Object obj) {
        return m1066equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1072hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m1106toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1112unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m1057compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }
}
