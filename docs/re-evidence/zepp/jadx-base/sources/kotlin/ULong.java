package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
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
    private final long a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ ULong(long j) {
        this.a = j;
    }

    @InlineOnly
    private static final long A(long j, byte b) {
        return m3905constructorimpl(j + m3905constructorimpl(((long) b) & 255));
    }

    @InlineOnly
    private static final long B(long j, long j2) {
        return m3905constructorimpl(j + j2);
    }

    @InlineOnly
    private static final long C(long j, int i) {
        return m3905constructorimpl(j + m3905constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    private static final long D(long j, short s) {
        return m3905constructorimpl(j + m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final ULongRange E(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    @InlineOnly
    private static final long F(long j, byte b) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) b) & 255));
    }

    @InlineOnly
    private static final long G(long j, long j2) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(j, j2);
    }

    @InlineOnly
    private static final long H(long j, int i) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    private static final long I(long j, short s) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final long J(long j, int i) {
        return m3905constructorimpl(j << i);
    }

    @InlineOnly
    private static final long K(long j, int i) {
        return m3905constructorimpl(j >>> i);
    }

    @InlineOnly
    private static final long L(long j, byte b) {
        return m3905constructorimpl(j * m3905constructorimpl(((long) b) & 255));
    }

    @InlineOnly
    private static final long M(long j, long j2) {
        return m3905constructorimpl(j * j2);
    }

    @InlineOnly
    private static final long N(long j, int i) {
        return m3905constructorimpl(j * m3905constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    private static final long O(long j, short s) {
        return m3905constructorimpl(j * m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final byte P(long j) {
        return (byte) j;
    }

    @InlineOnly
    private static final double Q(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    private static final float R(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    private static final int S(long j) {
        return (int) j;
    }

    @InlineOnly
    private static final long T(long j) {
        return j;
    }

    @InlineOnly
    private static final short U(long j) {
        return (short) j;
    }

    @InlineOnly
    private static final byte V(long j) {
        return UByte.m3855constructorimpl((byte) j);
    }

    @InlineOnly
    private static final int W(long j) {
        return UInt.m3880constructorimpl((int) j);
    }

    @InlineOnly
    private static final long X(long j) {
        return j;
    }

    @InlineOnly
    private static final short Y(long j) {
        return UShort.m3930constructorimpl((short) j);
    }

    @InlineOnly
    private static final long Z(long j, long j2) {
        return m3905constructorimpl(j ^ j2);
    }

    @InlineOnly
    private static final long a(long j, long j2) {
        return m3905constructorimpl(j & j2);
    }

    @InlineOnly
    private static final int b(long j, byte b) {
        return UnsignedKt.ulongCompare(j, m3905constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m3904boximpl(long j) {
        return new ULong(j);
    }

    @InlineOnly
    private int c(long j) {
        return UnsignedKt.ulongCompare(m3910unboximpl(), j);
    }

    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3905constructorimpl(long j) {
        return j;
    }

    @InlineOnly
    private static int d(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }

    @InlineOnly
    private static final int e(long j, int i) {
        return UnsignedKt.ulongCompare(j, m3905constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3906equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m3910unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3907equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @InlineOnly
    private static final int f(long j, short s) {
        return UnsignedKt.ulongCompare(j, m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final long g(long j) {
        return m3905constructorimpl(j - 1);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final long h(long j, byte b) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3908hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @InlineOnly
    private static final long i(long j, long j2) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, j2);
    }

    @InlineOnly
    private static final long j(long j, int i) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    private static final long k(long j, short s) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final long l(long j, byte b) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) b) & 255));
    }

    @InlineOnly
    private static final long m(long j, long j2) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, j2);
    }

    @InlineOnly
    private static final long n(long j, int i) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) i) & 4294967295L));
    }

    @InlineOnly
    private static final long o(long j, short s) {
        return UnsignedKt.m3956ulongDivideeb3DHEI(j, m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final long p(long j) {
        return m3905constructorimpl(j + 1);
    }

    @InlineOnly
    private static final long q(long j) {
        return m3905constructorimpl(~j);
    }

    @InlineOnly
    private static final long r(long j, byte b) {
        return m3905constructorimpl(j - m3905constructorimpl(((long) b) & 255));
    }

    @InlineOnly
    private static final long s(long j, long j2) {
        return m3905constructorimpl(j - j2);
    }

    @InlineOnly
    private static final long t(long j, int i) {
        return m3905constructorimpl(j - m3905constructorimpl(((long) i) & 4294967295L));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3909toStringimpl(long j) {
        return UnsignedKt.ulongToString(j);
    }

    @InlineOnly
    private static final long u(long j, short s) {
        return m3905constructorimpl(j - m3905constructorimpl(((long) s) & WebSocketProtocol.s));
    }

    @InlineOnly
    private static final byte v(long j, byte b) {
        return UByte.m3855constructorimpl((byte) UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) b) & 255)));
    }

    @InlineOnly
    private static final long w(long j, long j2) {
        return UnsignedKt.m3957ulongRemaindereb3DHEI(j, j2);
    }

    @InlineOnly
    private static final int x(long j, int i) {
        return UInt.m3880constructorimpl((int) UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) i) & 4294967295L)));
    }

    @InlineOnly
    private static final short y(long j, short s) {
        return UShort.m3930constructorimpl((short) UnsignedKt.m3957ulongRemaindereb3DHEI(j, m3905constructorimpl(((long) s) & WebSocketProtocol.s)));
    }

    @InlineOnly
    private static final long z(long j, long j2) {
        return m3905constructorimpl(j | j2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m3910unboximpl(), uLong.m3910unboximpl());
    }

    public boolean equals(Object obj) {
        return m3906equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m3908hashCodeimpl(this.a);
    }

    @NotNull
    public String toString() {
        return m3909toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3910unboximpl() {
        return this.a;
    }
}
