package df;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldf/m;", "", "wrapped", "<init>", "(Ljava/lang/Object;)V", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f59413b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59414a;

    static {
        ue.u.b("NetworkRequestCompat");
    }

    public /* synthetic */ m(Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && p005kotlin.jvm.internal.s.g(this.f59414a, ((m) obj).f59414a);
    }

    public final int hashCode() {
        Object obj = this.f59414a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return wr.g.p(new StringBuilder("NetworkRequestCompat(wrapped="), this.f59414a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldf/m$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public m(Object obj) {
        this.f59414a = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        p005kotlin.jvm.internal.j jVar = null;
        this(jVar, 1, jVar);
    }
}
