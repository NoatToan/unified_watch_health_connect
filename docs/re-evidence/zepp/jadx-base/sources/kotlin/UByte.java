package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
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
    private final byte a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UByte(byte b) {
        this.a = b;
    }

    @InlineOnly
    private static final int A(byte b, byte b2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) + UInt.m3880constructorimpl(b2 & 255));
    }

    @InlineOnly
    private static final long B(byte b, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) b) & 255) + j);
    }

    @InlineOnly
    private static final int C(byte b, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) + i);
    }

    @InlineOnly
    private static final int D(byte b, short s) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) + UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final UIntRange E(byte b, byte b2) {
        return new UIntRange(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(b2 & 255), null);
    }

    @InlineOnly
    private static final int F(byte b, byte b2) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(b2 & 255));
    }

    @InlineOnly
    private static final long G(byte b, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) b) & 255), j);
    }

    @InlineOnly
    private static final int H(byte b, int i) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), i);
    }

    @InlineOnly
    private static final int I(byte b, short s) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int J(byte b, byte b2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) * UInt.m3880constructorimpl(b2 & 255));
    }

    @InlineOnly
    private static final long K(byte b, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) b) & 255) * j);
    }

    @InlineOnly
    private static final int L(byte b, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) * i);
    }

    @InlineOnly
    private static final int M(byte b, short s) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) * UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final byte N(byte b) {
        return b;
    }

    @InlineOnly
    private static final double O(byte b) {
        return b & 255;
    }

    @InlineOnly
    private static final float P(byte b) {
        return b & 255;
    }

    @InlineOnly
    private static final int Q(byte b) {
        return b & 255;
    }

    @InlineOnly
    private static final long R(byte b) {
        return ((long) b) & 255;
    }

    @InlineOnly
    private static final short S(byte b) {
        return (short) (b & 255);
    }

    @InlineOnly
    private static final byte T(byte b) {
        return b;
    }

    @InlineOnly
    private static final int U(byte b) {
        return UInt.m3880constructorimpl(b & 255);
    }

    @InlineOnly
    private static final long V(byte b) {
        return ULong.m3905constructorimpl(((long) b) & 255);
    }

    @InlineOnly
    private static final short W(byte b) {
        return UShort.m3930constructorimpl((short) (b & 255));
    }

    @InlineOnly
    private static final byte X(byte b, byte b2) {
        return m3855constructorimpl((byte) (b ^ b2));
    }

    @InlineOnly
    private static final byte a(byte b, byte b2) {
        return m3855constructorimpl((byte) (b & b2));
    }

    @InlineOnly
    private int b(byte b) {
        return Intrinsics.compare(m3860unboximpl() & 255, b & 255);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m3854boximpl(byte b) {
        return new UByte(b);
    }

    @InlineOnly
    private static int c(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255);
    }

    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m3855constructorimpl(byte b) {
        return b;
    }

    @InlineOnly
    private static final int d(byte b, long j) {
        return UnsignedKt.ulongCompare(ULong.m3905constructorimpl(((long) b) & 255), j);
    }

    @InlineOnly
    private static final int e(byte b, int i) {
        return UnsignedKt.uintCompare(UInt.m3880constructorimpl(b & 255), i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3856equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).m3860unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3857equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    @InlineOnly
    private static final int f(byte b, short s) {
        return Intrinsics.compare(b & 255, s & UShort.MAX_VALUE);
    }

    @InlineOnly
    private static final byte g(byte b) {
        return m3855constructorimpl((byte) (b - 1));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final int h(byte b, byte b2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(b2 & 255));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3858hashCodeimpl(byte b) {
        return b;
    }

    @InlineOnly
    private static final long i(byte b, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) b) & 255), j);
    }

    @InlineOnly
    private static final int j(byte b, int i) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), i);
    }

    @InlineOnly
    private static final int k(byte b, short s) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int l(byte b, byte b2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(b2 & 255));
    }

    @InlineOnly
    private static final long m(byte b, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) b) & 255), j);
    }

    @InlineOnly
    private static final int n(byte b, int i) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), i);
    }

    @InlineOnly
    private static final int o(byte b, short s) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final byte p(byte b) {
        return m3855constructorimpl((byte) (b + 1));
    }

    @InlineOnly
    private static final byte q(byte b) {
        return m3855constructorimpl((byte) (~b));
    }

    @InlineOnly
    private static final int r(byte b, byte b2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) - UInt.m3880constructorimpl(b2 & 255));
    }

    @InlineOnly
    private static final long s(byte b, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) b) & 255) - j);
    }

    @InlineOnly
    private static final int t(byte b, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) - i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3859toStringimpl(byte b) {
        return String.valueOf(b & 255);
    }

    @InlineOnly
    private static final int u(byte b, short s) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(b & 255) - UInt.m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final byte v(byte b, byte b2) {
        return m3855constructorimpl((byte) UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(b2 & 255)));
    }

    @InlineOnly
    private static final long w(byte b, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) b) & 255), j);
    }

    @InlineOnly
    private static final int x(byte b, int i) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), i);
    }

    @InlineOnly
    private static final short y(byte b, short s) {
        return UShort.m3930constructorimpl((short) UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(b & 255), UInt.m3880constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    private static final byte z(byte b, byte b2) {
        return m3855constructorimpl((byte) (b | b2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m3860unboximpl() & 255, uByte.m3860unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m3856equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m3858hashCodeimpl(this.a);
    }

    @NotNull
    public String toString() {
        return m3859toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m3860unboximpl() {
        return this.a;
    }
}
