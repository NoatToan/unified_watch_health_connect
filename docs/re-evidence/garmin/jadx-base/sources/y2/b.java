package y2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ly2/b;", "", "a", "flag", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f194043b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f194044c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f194045d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f194046e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194047a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f194047a == ((b) obj).f194047a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f194047a);
    }

    public final String toString() {
        return "LayoutCacheOperation(flag=" + this.f194047a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly2/b$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
