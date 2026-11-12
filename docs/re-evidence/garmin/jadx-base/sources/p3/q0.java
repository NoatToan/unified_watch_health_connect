package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/q0;", "Lg4/g;", "", "Lp3/o;", "composition", "<init>", "(Lp3/o;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 implements g4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f135224a;

    public q0(o oVar) {
        this.f135224a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return p005kotlin.jvm.internal.s.g(this.f135224a, ((q0) obj).f135224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f135224a.hashCode() * 31;
    }
}
