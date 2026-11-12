package y8;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ly8/t;", "", "<init>", "()V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class t {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly8/t$a;", "Ly8/t;", "Ly8/s;", "exerciseRoute", "<init>", "(Ly8/s;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f194974a;

        public a(s sVar) {
            sVar.getClass();
            this.f194974a = sVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f194974a, ((a) obj).f194974a);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Data(exerciseRoute=" + this.f194974a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/t$b;", "Ly8/t;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends t {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoData";
        }
    }
}
