package s1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Ls1/m1;", "", "value", "", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f155636a;

    public static long a(int i14) {
        n1.f155664b.getClass();
        return i14 * n1.f155665c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return this.f155636a == ((m1) obj).f155636a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f155636a);
    }

    public final String toString() {
        return "StartOffset(value=" + this.f155636a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
