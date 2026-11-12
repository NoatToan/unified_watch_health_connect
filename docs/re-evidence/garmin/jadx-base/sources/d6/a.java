package d6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/a;", "", "a", "multiplier", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1234a f57703b = new C1234a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57704a;

    private /* synthetic */ a(float f14) {
        this.f57704a = f14;
    }

    public static final /* synthetic */ a a(float f14) {
        return new a(f14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f57704a, ((a) obj).f57704a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57704a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f57704a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/a$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1234a {
        public /* synthetic */ C1234a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1234a() {
        }
    }
}
