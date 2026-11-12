package g6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/g;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f75998b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75999a;

    static {
        new a(null);
    }

    private /* synthetic */ g(long j8) {
        this.f75999a = j8;
    }

    public static final /* synthetic */ g a(long j8) {
        return new g(j8);
    }

    public static final float b(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        f.a aVar = f.f75994b;
        return fIntBitsToFloat;
    }

    public static final float c(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 & 4294967295L));
        f.a aVar = f.f75994b;
        return fIntBitsToFloat;
    }

    public static String d(long j8) {
        if (j8 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.d(b(j8))) + ", " + ((Object) f.d(c(j8))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f75999a == ((g) obj).f75999a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75999a);
    }

    public final String toString() {
        return d(this.f75999a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/g$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
