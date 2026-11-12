package g6;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/k;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76003b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f76004c = 9223372034707292159L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76005a;

    private /* synthetic */ k(long j8) {
        this.f76005a = j8;
    }

    public static final /* synthetic */ k a(long j8) {
        return new k(j8);
    }

    public static long b(int i14, int i15, int i16, long j8) {
        if ((i16 & 1) != 0) {
            i14 = (int) (j8 >> 32);
        }
        if ((i16 & 2) != 0) {
            i15 = (int) (j8 & 4294967295L);
        }
        return (((long) i15) & 4294967295L) | (((long) i14) << 32);
    }

    public static final boolean c(long j8, long j14) {
        return j8 == j14;
    }

    public static final long d(long j8, long j14) {
        return (((long) (((int) (j8 >> 32)) - ((int) (j14 >> 32)))) << 32) | (((long) (((int) (j8 & 4294967295L)) - ((int) (j14 & 4294967295L)))) & 4294967295L);
    }

    public static final long e(long j8, long j14) {
        return (((long) (((int) (j8 >> 32)) + ((int) (j14 >> 32)))) << 32) | (((long) (((int) (j8 & 4294967295L)) + ((int) (j14 & 4294967295L)))) & 4294967295L);
    }

    public static String f(long j8) {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append((int) (j8 >> 32));
        sb3.append(", ");
        return e0.j(sb3, (int) (j8 & 4294967295L), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f76005a == ((k) obj).f76005a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76005a);
    }

    public final String toString() {
        return f(this.f76005a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/k$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
