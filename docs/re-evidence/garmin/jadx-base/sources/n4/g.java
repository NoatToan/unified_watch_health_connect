package n4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ln4/g;", "", "a", "packedValue", "", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f123559b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f123560c = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123561a;

    private /* synthetic */ g(long j8) {
        this.f123561a = j8;
    }

    public static final /* synthetic */ g a(long j8) {
        return new g(j8);
    }

    public static final long b(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final boolean c(long j8, long j14) {
        return j8 == j14;
    }

    public static final float d(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final float e(long j8) {
        return Math.max(Float.intBitsToFloat((int) ((j8 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j8 & 2147483647L)));
    }

    public static final float f(long j8) {
        return Math.min(Float.intBitsToFloat((int) ((j8 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j8 & 2147483647L)));
    }

    public static final float g(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final boolean h(long j8) {
        return (j8 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j8 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j8 & 4294967295L)) <= 0.0f);
    }

    public static String i(long j8) {
        if (j8 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + gl1.d.d0(Float.intBitsToFloat((int) (j8 >> 32))) + ", " + gl1.d.d0(Float.intBitsToFloat((int) (j8 & 4294967295L))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f123561a == ((g) obj).f123561a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f123561a);
    }

    public final String toString() {
        return i(this.f123561a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/g$a;", "", "<init>", "()V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
