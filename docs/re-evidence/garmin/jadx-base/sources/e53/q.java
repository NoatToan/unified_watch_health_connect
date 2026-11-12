package e53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le53/q;", "T", "", "value", "Le53/c;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/j;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f63129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63130b;

    private q(T t7, long j8) {
        this.f63129a = t7;
        this.f63130b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (s.g(this.f63129a, qVar.f63129a)) {
                long j8 = qVar.f63130b;
                c.a aVar = c.f63094b;
                return this.f63130b == j8;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t7 = this.f63129a;
        int iHashCode = t7 == null ? 0 : t7.hashCode();
        c.a aVar = c.f63094b;
        return Long.hashCode(this.f63130b) + (iHashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.f63129a + ", duration=" + ((Object) c.k(this.f63130b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ q(Object obj, long j8, p005kotlin.jvm.internal.j jVar) {
        this(obj, j8);
    }
}
