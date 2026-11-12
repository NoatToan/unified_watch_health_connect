package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
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
    private final int a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UInt(int i) {
        this.a = i;
    }

    @InlineOnly
    private static final int A(int i, byte b) {
        return m3880constructorimpl(i + m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long B(int i, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) i) & 4294967295L) + j);
    }

    @InlineOnly
    private static final int C(int i, int i2) {
        return m3880constructorimpl(i + i2);
    }

    @InlineOnly
    private static final int D(int i, short s) {
        return m3880constructorimpl(i + m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final UIntRange E(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    @InlineOnly
    private static final int F(int i, byte b) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(i, m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long G(int i, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    private static final int H(int i, int i2) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(i, i2);
    }

    @InlineOnly
    private static final int I(int i, short s) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(i, m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int J(int i, int i2) {
        return m3880constructorimpl(i << i2);
    }

    @InlineOnly
    private static final int K(int i, int i2) {
        return m3880constructorimpl(i >>> i2);
    }

    @InlineOnly
    private static final int L(int i, byte b) {
        return m3880constructorimpl(i * m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long M(int i, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) i) & 4294967295L) * j);
    }

    @InlineOnly
    private static final int N(int i, int i2) {
        return m3880constructorimpl(i * i2);
    }

    @InlineOnly
    private static final int O(int i, short s) {
        return m3880constructorimpl(i * m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final byte P(int i) {
        return (byte) i;
    }

    @InlineOnly
    private static final double Q(int i) {
        return UnsignedKt.uintToDouble(i);
    }

    @InlineOnly
    private static final float R(int i) {
        return (float) UnsignedKt.uintToDouble(i);
    }

    @InlineOnly
    private static final int S(int i) {
        return i;
    }

    @InlineOnly
    private static final long T(int i) {
        return ((long) i) & 4294967295L;
    }

    @InlineOnly
    private static final short U(int i) {
        return (short) i;
    }

    @InlineOnly
    private static final byte V(int i) {
        return UByte.m3855constructorimpl((byte) i);
    }

    @InlineOnly
    private static final int W(int i) {
        return i;
    }

    @InlineOnly
    private static final long X(int i) {
        return ULong.m3905constructorimpl(((long) i) & 4294967295L);
    }

    @InlineOnly
    private static final short Y(int i) {
        return UShort.m3930constructorimpl((short) i);
    }

    @InlineOnly
    private static final int Z(int i, int i2) {
        return m3880constructorimpl(i ^ i2);
    }

    @InlineOnly
    private static final int a(int i, int i2) {
        return m3880constructorimpl(i & i2);
    }

    @InlineOnly
    private static final int b(int i, byte b) {
        return UnsignedKt.uintCompare(i, m3880constructorimpl(b & 255));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m3879boximpl(int i) {
        return new UInt(i);
    }

    @InlineOnly
    private static final int c(int i, long j) {
        return UnsignedKt.ulongCompare(ULong.m3905constructorimpl(((long) i) & 4294967295L), j);
    }

    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3880constructorimpl(int i) {
        return i;
    }

    @InlineOnly
    private int d(int i) {
        return UnsignedKt.uintCompare(m3885unboximpl(), i);
    }

    @InlineOnly
    private static int e(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3881equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m3885unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3882equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @InlineOnly
    private static final int f(int i, short s) {
        return UnsignedKt.uintCompare(i, m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int g(int i) {
        return m3880constructorimpl(i - 1);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final int h(int i, byte b) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, m3880constructorimpl(b & 255));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3883hashCodeimpl(int i) {
        return i;
    }

    @InlineOnly
    private static final long i(int i, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    private static final int j(int i, int i2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, i2);
    }

    @InlineOnly
    private static final int k(int i, short s) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int l(int i, byte b) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long m(int i, long j) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(ULong.m3905constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    private static final int n(int i, int i2) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, i2);
    }

    @InlineOnly
    private static final int o(int i, short s) {
        return UnsignedKt.m3954uintDivideJ1ME1BU(i, m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final int p(int i) {
        return m3880constructorimpl(i + 1);
    }

    @InlineOnly
    private static final int q(int i) {
        return m3880constructorimpl(~i);
    }

    @InlineOnly
    private static final int r(int i, byte b) {
        return m3880constructorimpl(i - m3880constructorimpl(b & 255));
    }

    @InlineOnly
    private static final long s(int i, long j) {
        return ULong.m3905constructorimpl(ULong.m3905constructorimpl(((long) i) & 4294967295L) - j);
    }

    @InlineOnly
    private static final int t(int i, int i2) {
        return m3880constructorimpl(i - i2);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3884toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @InlineOnly
    private static final int u(int i, short s) {
        return m3880constructorimpl(i - m3880constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    private static final byte v(int i, byte b) {
        return UByte.m3855constructorimpl((byte) UnsignedKt.m3955uintRemainderJ1ME1BU(i, m3880constructorimpl(b & 255)));
    }

    @InlineOnly
    private static final long w(int i, long j) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(ULong.m3905constructorimpl(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    private static final int x(int i, int i2) {
        return UnsignedKt.m3955uintRemainderJ1ME1BU(i, i2);
    }

    @InlineOnly
    private static final short y(int i, short s) {
        return UShort.m3930constructorimpl((short) UnsignedKt.m3955uintRemainderJ1ME1BU(i, m3880constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    private static final int z(int i, int i2) {
        return m3880constructorimpl(i | i2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m3885unboximpl(), uInt.m3885unboximpl());
    }

    public boolean equals(Object obj) {
        return m3881equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m3883hashCodeimpl(this.a);
    }

    @NotNull
    public String toString() {
        return m3884toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3885unboximpl() {
        return this.a;
    }
}
