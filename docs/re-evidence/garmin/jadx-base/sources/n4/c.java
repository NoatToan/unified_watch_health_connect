package n4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ln4/c;", "", "a", "packedValue", "", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f123541b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f123542c = 9187343241974906880L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f123543d = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123544a;

    private /* synthetic */ c(long j8) {
        this.f123544a = j8;
    }

    public static final /* synthetic */ c a(long j8) {
        return new c(j8);
    }

    public static long b(float f14, long j8, int i14) {
        float fIntBitsToFloat = (i14 & 1) != 0 ? Float.intBitsToFloat((int) (j8 >> 32)) : 0.0f;
        if ((i14 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
    }

    public static final long c(float f14, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) / f14;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) / f14)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final boolean d(long j8, long j14) {
        return j8 == j14;
    }

    public static final float e(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float f(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public static final float g(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float h(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final long i(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long j(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long k(float f14, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * f14;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) * f14)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String l(long j8) {
        if ((9223372034707292159L & j8) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + gl1.d.d0(Float.intBitsToFloat((int) (j8 >> 32))) + ", " + gl1.d.d0(Float.intBitsToFloat((int) (j8 & 4294967295L))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f123544a == ((c) obj).f123544a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f123544a);
    }

    public final String toString() {
        return l(this.f123544a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/c$a;", "", "<init>", "()V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
