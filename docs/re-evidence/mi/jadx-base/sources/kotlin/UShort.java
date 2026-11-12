package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UShort implements Comparable<UShort> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m1160andxj2QHRw(short s, short s2) {
        return m1167constructorimpl((short) (s & s2));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m1161boximpl(short s) {
        return new UShort(s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1162compareTo7apg3OU(short s, byte b2) {
        return Intrinsics.compare(s & MAX_VALUE, b2 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m1163compareToVKZWuLQ(short s, long j) {
        return Long.compareUnsigned(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1164compareToWZ4Q5Ns(short s, int i) {
        return Integer.compareUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m1165compareToxj2QHRw(short s) {
        return Intrinsics.compare(m1217unboximpl() & MAX_VALUE, s & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1167constructorimpl(short s) {
        return s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m1168decMh2AYeg(short s) {
        return m1167constructorimpl((short) (s - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m1169div7apg3OU(short s, byte b2) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1170divVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m1171divWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m1172divxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1173equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m1217unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1174equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m1175floorDiv7apg3OU(short s, byte b2) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1176floorDivVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m1177floorDivWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m1178floorDivxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1179hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m1180incMh2AYeg(short s) {
        return m1167constructorimpl((short) (s + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m1181invMh2AYeg(short s) {
        return m1167constructorimpl((short) (~s));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m1182minus7apg3OU(short s, byte b2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) - UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1183minusVKZWuLQ(short s, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1184minusWZ4Q5Ns(short s, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) - i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m1185minusxj2QHRw(short s, short s2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) - UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1186mod7apg3OU(short s, byte b2) {
        return UByte.m904constructorimpl((byte) Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(b2 & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1187modVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1188modWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1189modxj2QHRw(short s, short s2) {
        return m1167constructorimpl((short) Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m1190orxj2QHRw(short s, short s2) {
        return m1167constructorimpl((short) (s | s2));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1191plus7apg3OU(short s, byte b2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) + UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1192plusVKZWuLQ(short s, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1193plusWZ4Q5Ns(short s, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) + i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1194plusxj2QHRw(short s, short s2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) + UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m1195rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m1196rangeUntilxj2QHRw(short s, short s2) {
        return URangesKt___URangesKt.m2169untilJ1ME1BU(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1197rem7apg3OU(short s, byte b2) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1198remVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1199remWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1200remxj2QHRw(short s, short s2) {
        return Integer.remainderUnsigned(UInt.m981constructorimpl(s & MAX_VALUE), UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1201times7apg3OU(short s, byte b2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) * UInt.m981constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1202timesVKZWuLQ(short s, long j) {
        return ULong.m1060constructorimpl(ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1203timesWZ4Q5Ns(short s, int i) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) * i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1204timesxj2QHRw(short s, short s2) {
        return UInt.m981constructorimpl(UInt.m981constructorimpl(s & MAX_VALUE) * UInt.m981constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1205toByteimpl(short s) {
        return (byte) s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1206toDoubleimpl(short s) {
        return UnsignedKt.uintToDouble(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1207toFloatimpl(short s) {
        return (float) UnsignedKt.uintToDouble(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m1208toIntimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m1209toLongimpl(short s) {
        return ((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m1210toShortimpl(short s) {
        return s;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1211toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1212toUBytew2LRezQ(short s) {
        return UByte.m904constructorimpl((byte) s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1213toUIntpVg5ArA(short s) {
        return UInt.m981constructorimpl(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1214toULongsVKNKU(short s) {
        return ULong.m1060constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1215toUShortMh2AYeg(short s) {
        return s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m1216xorxj2QHRw(short s, short s2) {
        return m1167constructorimpl((short) (s ^ s2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m1217unboximpl() & MAX_VALUE, uShort.m1217unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m1173equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1179hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m1211toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m1217unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m1166compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare(s & MAX_VALUE, s2 & MAX_VALUE);
    }
}
