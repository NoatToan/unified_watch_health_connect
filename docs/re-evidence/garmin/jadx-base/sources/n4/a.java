package n4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ln4/a;", "", "a", "packedValue", "", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2318a f123535b = new C2318a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123536a;

    public static final boolean a(long j8, long j14) {
        return j8 == j14;
    }

    public static String b(long j8) {
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.intBitsToFloat(i15)) {
            return "CornerRadius.circular(" + gl1.d.d0(Float.intBitsToFloat(i14)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "CornerRadius.elliptical(" + gl1.d.d0(Float.intBitsToFloat(i14)) + ", " + gl1.d.d0(Float.intBitsToFloat(i15)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f123536a == ((a) obj).f123536a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f123536a);
    }

    public final String toString() {
        return b(this.f123536a);
    }

    /* JADX INFO: renamed from: n4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/a$a;", "", "<init>", "()V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2318a {
        public /* synthetic */ C2318a(j jVar) {
            this();
        }

        private C2318a() {
        }
    }
}
