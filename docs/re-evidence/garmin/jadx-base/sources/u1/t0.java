package u1;

import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu1/t0;", "Lh5/x0;", "Lu1/x0;", "La2/j;", "interactionSource", "<init>", "(La2/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t0 extends h5.x0<x0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.j f167681a;

    public t0(a2.j jVar) {
        this.f167681a = jVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new x0(this.f167681a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && p005kotlin.jvm.internal.s.g(((t0) obj).f167681a, this.f167681a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f167681a.hashCode() * 31;
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "hoverable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167681a, "interactionSource");
        v3Var.c(Boolean.TRUE, "enabled");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        x0 x0Var = (x0) cVar;
        a2.j jVar = x0Var.f167713a;
        a2.j jVar2 = this.f167681a;
        if (p005kotlin.jvm.internal.s.g(jVar, jVar2)) {
            return;
        }
        x0Var.W1();
        x0Var.f167713a = jVar2;
    }
}
