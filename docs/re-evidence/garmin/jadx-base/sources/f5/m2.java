package f5;

import ch.qos.logback.core.CoreConstants;
import okhttp3.internal.ws.WebSocketProtocol;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lf5/m2;", "", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69008a;

    public static final boolean a(long j8, long j14) {
        return j8 == j14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m2) {
            return this.f69008a == ((m2) obj).f69008a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69008a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ValueInsets(");
        long j8 = this.f69008a;
        sb3.append((int) ((j8 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb3.append(", ");
        sb3.append((int) ((j8 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb3.append(", ");
        sb3.append((int) ((j8 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb3.append(", ");
        return ds.e0.j(sb3, (int) (j8 & WebSocketProtocol.PAYLOAD_SHORT_MAX), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
