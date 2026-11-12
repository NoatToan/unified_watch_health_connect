package g63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0001¨\u0006\u0004"}, d2 = {"Lg63/i;", "", "a", "value", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76142b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f76143a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return p005kotlin.jvm.internal.s.g(this.f76143a, ((i) obj).f76143a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f76143a.hashCode();
    }

    public final String toString() {
        return "ParseResult(value=" + this.f76143a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg63/i$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
