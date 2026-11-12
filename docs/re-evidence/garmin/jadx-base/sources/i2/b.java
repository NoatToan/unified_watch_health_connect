package i2;

import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li2/b;", "Lh5/x0;", "Li2/e;", "Li2/a;", "requester", "<init>", "(Li2/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b extends x0<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f87116a;

    public b(a aVar) {
        this.f87116a = aVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new e(this.f87116a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return s.g(this.f87116a, ((b) obj).f87116a);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f87116a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "bringIntoViewRequester";
        m2Var.f91343c.c(this.f87116a, "bringIntoViewRequester");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((e) cVar).U1(this.f87116a);
    }
}
