package vh;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lvh/p0;", "V", "", "<init>", "()V", "a", "b", "c", "Lvh/p0$a;", "Lvh/p0$c;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class p0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f178367a = new b(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvh/p0$a;", "Lvh/p0;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f178368b = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh/p0$c;", "V", "Lvh/p0;", "value", "<init>", "(Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class c<V> extends p0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f178369b;

        public c(V v14) {
            super(null);
            this.f178369b = v14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f178369b, ((c) obj).f178369b);
        }

        public final int hashCode() {
            V v14 = this.f178369b;
            if (v14 == null) {
                return 0;
            }
            return v14.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("Present(value="), this.f178369b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ p0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh/p0$b;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private p0() {
    }
}
