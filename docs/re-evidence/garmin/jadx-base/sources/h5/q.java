package h5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lh5/q;", "", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81935a;

    public static final int a(long j8, long j14) {
        boolean zD = d(j8);
        if (zD != d(j14)) {
            return zD ? -1 : 1;
        }
        int iSignum = (int) Math.signum(b(j8) - b(j14));
        if (Math.min(b(j8), b(j14)) >= 0.0f && c(j8) != c(j14)) {
            return c(j8) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float b(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final boolean c(long j8) {
        return (j8 & 2) != 0;
    }

    public static final boolean d(long j8) {
        return (j8 & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f81935a == ((q) obj).f81935a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81935a);
    }

    public final String toString() {
        return "DistanceAndFlags(packedValue=" + this.f81935a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
