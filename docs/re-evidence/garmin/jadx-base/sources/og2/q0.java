package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Log2/q0;", "", "Log2/m0;", "creator", "Log2/t0;", "renderer", "<init>", "(Log2/m0;Log2/t0;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f132074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f132075b;

    public q0(m0 m0Var, t0 t0Var) {
        m0Var.getClass();
        t0Var.getClass();
        this.f132074a = m0Var;
        this.f132075b = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f132074a.equals(q0Var.f132074a) && this.f132075b.equals(q0Var.f132075b);
    }

    public final int hashCode() {
        return this.f132075b.hashCode() + (this.f132074a.hashCode() * 31);
    }

    public final String toString() {
        return "YAxisLabelsRenderer(creator=" + this.f132074a + ", renderer=" + this.f132075b + ")";
    }
}
