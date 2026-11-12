package y2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ly2/a;", "", "a", "packedValue", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3621a f194040b = new C3621a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f194041c = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194042a;

    public static long a(float f14, float f15) {
        return (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    public static String b(long j8) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j8 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j8 & 4294967295L)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f194042a == ((a) obj).f194042a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f194042a);
    }

    public final String toString() {
        return b(this.f194042a);
    }

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly2/a$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C3621a {
        public /* synthetic */ C3621a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3621a() {
        }
    }
}
