package p3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/b0;", "T", "Lp3/c4;", "Lkotlin/Function1;", "Lp3/u;", "compute", "<init>", "(Le23/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b0<T> implements c4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<u, T> f135042a;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(e23.l<? super u, ? extends T> lVar) {
        this.f135042a = lVar;
    }

    @Override // p3.c4
    public final T a(i2 i2Var) {
        return this.f135042a.invoke(i2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && p005kotlin.jvm.internal.s.g(this.f135042a, ((b0) obj).f135042a);
    }

    public final int hashCode() {
        return this.f135042a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f135042a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
