package g4;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg4/e;", "", "a", "value", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f75736b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75737c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75738a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f75738a == ((e) obj).f75738a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75738a);
    }

    public final String toString() {
        return e0.i("ComposeStackTraceMode(value=", this.f75738a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg4/e$a;", "", "<init>", "()V", "", "isMinified", "Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
