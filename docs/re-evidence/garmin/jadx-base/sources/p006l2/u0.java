package p006l2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll2/u0;", "", "a", "value", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f108803b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108804a;

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return this.f108804a == ((u0) obj).f108804a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108804a);
    }

    public final String toString() {
        return e0.i("ContextMenuStrings(value=", this.f108804a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/u0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
