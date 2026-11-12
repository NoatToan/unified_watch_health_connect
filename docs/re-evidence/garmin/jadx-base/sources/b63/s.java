package b63;

import java.util.Iterator;
import p005kotlin.Metadata;
import p13.q0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb63/s;", "", "Lb63/o;", "Lp13/q0;", "iterator", "<init>", "(Lp13/q0;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements Iterator<o>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f16214a;

    public s(q0 q0Var) {
        q0Var.getClass();
        this.f16214a = q0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16214a.hasNext();
    }

    @Override // java.util.Iterator
    public final o next() {
        o.Companion companion = o.INSTANCE;
        long jNextLong = this.f16214a.nextLong();
        companion.getClass();
        return o.Companion.a(jNextLong);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
