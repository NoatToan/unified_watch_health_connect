package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
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
    private final short a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UShort(short s) {
        this.a = s;
    }

    @InlineOnly
    private static final int A(short s, byte b) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) + UInt.m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long B(short s, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s) + j);
    }

    @InlineOnly
    private static final int C(short s, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) + i);
    }

    @InlineOnly
    private static final int D(short s, short s2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) + UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final UIntRange E(short s, short s2) {
        return new UIntRange(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(s2 & MAX_VALUE), null);
    }

    @InlineOnly
    private static final int F(short s, byte b) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long G(short s, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s), j);
    }

    @InlineOnly
    private static final int H(short s, int i) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    private static final int I(short s, short s2) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final int J(short s, byte b) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) * UInt.m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long K(short s, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s) * j);
    }

    @InlineOnly
    private static final int L(short s, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) * i);
    }

    @InlineOnly
    private static final int M(short s, short s2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) * UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final byte N(short s) {
        return (byte) s;
    }

    @InlineOnly
    private static final double O(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    private static final float P(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    private static final int Q(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    private static final long R(short s) {
        return ((long) s) & WebSocketProtocol.s;
    }

    @InlineOnly
    private static final short S(short s) {
        return s;
    }

    @InlineOnly
    private static final byte T(short s) {
        return UByte.m3855constructorimpl((byte) s);
    }

    @InlineOnly
    private static final int U(short s) {
        return UInt.m3880constructorimpl(s & MAX_VALUE);
    }

    @InlineOnly
    private static final long V(short s) {
        return ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s);
    }

    @InlineOnly
    private static final short W(short s) {
        return s;
    }

    @InlineOnly
    private static final short X(short s, short s2) {
        return m3930constructorimpl((short) (s ^ s2));
    }

    @InlineOnly
    private static final short a(short s, short s2) {
        return m3930constructorimpl((short) (s & s2));
    }

    @InlineOnly
    private static final int b(short s, byte b) {
        return Intrinsics.compare(s & MAX_VALUE, b & 255);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m3929boximpl(short s) {
        return new UShort(s);
    }

    @InlineOnly
    private static final int c(short s, long j) {
        return UnsignedKt.ulongCompare(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s), j);
    }

    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m3930constructorimpl(short s) {
        return s;
    }

    @InlineOnly
    private static final int d(short s, int i) {
        return UnsignedKt.uintCompare(UInt.m3880constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    private int e(short s) {
        return Intrinsics.compare(m3935unboximpl() & MAX_VALUE, s & MAX_VALUE);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3931equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m3935unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3932equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @InlineOnly
    private static int f(short s, short s2) {
        return Intrinsics.compare(s & MAX_VALUE, s2 & MAX_VALUE);
    }

    @InlineOnly
    private static final short g(short s) {
        return m3930constructorimpl((short) (s - 1));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final int h(short s, byte b) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(b & 255));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3933hashCodeimpl(short s) {
        return s;
    }

    @InlineOnly
    private static final long i(short s, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s), j);
    }

    @InlineOnly
    private static final int j(short s, int i) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    private static final int k(short s, short s2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final int l(short s, byte b) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long m(short s, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s), j);
    }

    @InlineOnly
    private static final int n(short s, int i) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    private static final int o(short s, short s2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final short p(short s) {
        return m3930constructorimpl((short) (s + 1));
    }

    @InlineOnly
    private static final short q(short s) {
        return m3930constructorimpl((short) (~s));
    }

    @InlineOnly
    private static final int r(short s, byte b) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) - UInt.m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long s(short s, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s) - j);
    }

    @InlineOnly
    private static final int t(short s, int i) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) - i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3934toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }

    @InlineOnly
    private static final int u(short s, short s2) {
        return UInt.m3880constructorimpl(UInt.m3880constructorimpl(s & MAX_VALUE) - UInt.m3880constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    private static final byte v(short s, byte b) {
        return UByte.m3855constructorimpl((byte) UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(b & 255)));
    }

    @InlineOnly
    private static final long w(short s, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) s) & WebSocketProtocol.s), j);
    }

    @InlineOnly
    private static final int x(short s, int i) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    private static final short y(short s, short s2) {
        return m3930constructorimpl((short) UnsignedKt.m3955uintRemainderJ1ME1BU(UInt.m3880constructorimpl(s & MAX_VALUE), UInt.m3880constructorimpl(s2 & MAX_VALUE)));
    }

    @InlineOnly
    private static final short z(short s, short s2) {
        return m3930constructorimpl((short) (s | s2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m3935unboximpl() & MAX_VALUE, uShort.m3935unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m3931equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m3933hashCodeimpl(this.a);
    }

    @NotNull
    public String toString() {
        return m3934toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m3935unboximpl() {
        return this.a;
    }
}
