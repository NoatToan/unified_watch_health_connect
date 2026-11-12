package u53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu53/b0;", "Lt13/g$b;", "Lu53/a0;", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b0 implements t13.g.b<a0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<?> f168720a;

    public b0(ThreadLocal<?> threadLocal) {
        this.f168720a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && p005kotlin.jvm.internal.s.g(this.f168720a, ((b0) obj).f168720a);
    }

    public final int hashCode() {
        return this.f168720a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f168720a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
