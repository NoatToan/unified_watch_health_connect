package b5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lb5/z;", "", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15946a;

    private /* synthetic */ z(long j8) {
        this.f15946a = j8;
    }

    public static final /* synthetic */ z a(long j8) {
        return new z(j8);
    }

    public static final boolean b(long j8, long j14) {
        return j8 == j14;
    }

    public static String c(long j8) {
        return "PointerId(value=" + j8 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f15946a == ((z) obj).f15946a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15946a);
    }

    public final String toString() {
        return c(this.f15946a);
    }
}
