package p3;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/k0;", "T", "Lp3/c4;", "Lp3/p1;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lp3/p1;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k0<T> implements c4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1<T> f135136a;

    public k0(p1<T> p1Var) {
        this.f135136a = p1Var;
    }

    @Override // p3.c4
    public final T a(i2 i2Var) {
        return this.f135136a.getF182175a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && p005kotlin.jvm.internal.s.g(this.f135136a, ((k0) obj).f135136a);
    }

    public final int hashCode() {
        return this.f135136a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f135136a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
