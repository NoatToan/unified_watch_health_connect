package u1;

import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu1/l0;", "Lh5/x0;", "Lu1/n0;", "La2/j;", "interactionSource", "<init>", "(La2/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l0 extends h5.x0<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.j f167597a;

    public l0(a2.j jVar) {
        this.f167597a = jVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new n0(this.f167597a, 0, null, 6, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return p005kotlin.jvm.internal.s.g(this.f167597a, ((l0) obj).f167597a);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        a2.j jVar = this.f167597a;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "focusable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Boolean.TRUE, "enabled");
        v3Var.c(this.f167597a, "interactionSource");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((n0) cVar).Z1(this.f167597a);
    }
}
