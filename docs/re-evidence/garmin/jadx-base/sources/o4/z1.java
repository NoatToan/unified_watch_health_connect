package o4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/z1;", "", "a", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f129046b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f129047c = l1.b(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f129048a;

    private /* synthetic */ z1(long j8) {
        this.f129048a = j8;
    }

    public static final /* synthetic */ z1 a(long j8) {
        return new z1(j8);
    }

    public static final boolean b(long j8, long j14) {
        return j8 == j14;
    }

    public static String c(long j8) {
        return "TransformOrigin(packedValue=" + j8 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z1) {
            return this.f129048a == ((z1) obj).f129048a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f129048a);
    }

    public final String toString() {
        return c(this.f129048a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/z1$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
