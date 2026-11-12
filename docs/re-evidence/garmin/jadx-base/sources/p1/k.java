package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lp1/k;", "", "packedValue", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f134757a;

    private /* synthetic */ k(long j8) {
        this.f134757a = j8;
    }

    public static final /* synthetic */ k a(long j8) {
        return new k(j8);
    }

    public static long b(int i14, int i15) {
        return (((long) i15) & 4294967295L) | (((long) i14) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f134757a == ((k) obj).f134757a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f134757a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        long j8 = this.f134757a;
        sb3.append((int) (j8 >> 32));
        sb3.append(", ");
        return ds.e0.j(sb3, (int) (j8 & 4294967295L), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
