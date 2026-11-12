package f2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lf2/c;", "", "packedValue", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68178a;

    private /* synthetic */ c(long j8) {
        this.f68178a = j8;
    }

    public static final /* synthetic */ c a(long j8) {
        return new c(j8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f68178a == ((c) obj).f68178a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68178a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f68178a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
