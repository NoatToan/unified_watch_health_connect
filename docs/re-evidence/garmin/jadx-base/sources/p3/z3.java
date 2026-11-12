package p3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp3/z3;", "T", "Lp3/c4;", "value", "<init>", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class z3<T> implements c4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f135394a;

    public z3(T t7) {
        this.f135394a = t7;
    }

    @Override // p3.c4
    public final T a(i2 i2Var) {
        return this.f135394a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3) && p005kotlin.jvm.internal.s.g(this.f135394a, ((z3) obj).f135394a);
    }

    public final int hashCode() {
        T t7 = this.f135394a;
        if (t7 == null) {
            return 0;
        }
        return t7.hashCode();
    }

    public final String toString() {
        return wr.g.p(new StringBuilder("StaticValueHolder(value="), this.f135394a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
