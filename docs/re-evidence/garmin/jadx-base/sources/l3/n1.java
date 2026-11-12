package l3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll3/n1;", "", "a", "value", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f109367b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109368a;

    static {
        new a(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            return this.f109368a == ((n1) obj).f109368a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109368a);
    }

    public final String toString() {
        return ds.e0.i("Strings(value=", this.f109368a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/n1$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
