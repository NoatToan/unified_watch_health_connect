package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ls5/w0;", "", "a", "packedValue", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f157315b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f157316c = og.a.l(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f157317a;

    private /* synthetic */ w0(long j8) {
        this.f157317a = j8;
    }

    public static final /* synthetic */ w0 a(long j8) {
        return new w0(j8);
    }

    public static final boolean b(long j8, long j14) {
        return (h(j8) <= h(j14)) & (g(j14) <= g(j8));
    }

    public static boolean c(long j8, Object obj) {
        return (obj instanceof w0) && j8 == ((w0) obj).f157317a;
    }

    public static final boolean d(long j8, long j14) {
        return j8 == j14;
    }

    public static final boolean e(long j8) {
        return ((int) (j8 >> 32)) == ((int) (j8 & 4294967295L));
    }

    public static final int f(long j8) {
        return g(j8) - h(j8);
    }

    public static final int g(long j8) {
        return Math.max((int) (j8 >> 32), (int) (j8 & 4294967295L));
    }

    public static final int h(long j8) {
        return Math.min((int) (j8 >> 32), (int) (j8 & 4294967295L));
    }

    public static final boolean i(long j8) {
        return ((int) (j8 >> 32)) > ((int) (j8 & 4294967295L));
    }

    public static String j(long j8) {
        StringBuilder sb3 = new StringBuilder("TextRange(");
        sb3.append((int) (j8 >> 32));
        sb3.append(", ");
        return ds.e0.j(sb3, (int) (j8 & 4294967295L), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean equals(Object obj) {
        return c(this.f157317a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f157317a);
    }

    public final String toString() {
        return j(this.f157317a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/w0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
