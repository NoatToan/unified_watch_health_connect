package f5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lf5/f2;", "", "a", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f68942b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68943a;

    static {
        new a(null);
        Float.floatToRawIntBits(Float.NaN);
        Float.floatToRawIntBits(Float.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2) {
            return this.f68943a == ((f2) obj).f68943a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68943a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScaleFactor(");
        long j8 = this.f68943a;
        sb3.append(Float.intBitsToFloat((int) (j8 >> 32)));
        sb3.append(", ");
        sb3.append(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/f2$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
