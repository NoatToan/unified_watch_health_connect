package z3;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lz3/a;", "", "a", "value", "Lz3/b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f202077b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f202078a;

    static {
        new C3765a(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return s.g(this.f202078a, ((a) obj).f202078a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f202078a.hashCode();
    }

    public final String toString() {
        int i14 = this.f202078a.get();
        StringBuilder sb3 = new StringBuilder("AtomicAwaitersCount(version = ");
        sb3.append((i14 >>> 27) & 15);
        sb3.append(", count = ");
        return e0.j(sb3, i14 & 134217727, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: renamed from: z3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz3/a$a;", "", "<init>", "()V", "", "VERSION_BITS", "I", "COUNT_BITS", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3765a {
        public /* synthetic */ C3765a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3765a() {
        }
    }
}
