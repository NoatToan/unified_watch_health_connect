package u1;

import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu1/d1;", "Lh5/x0;", "Lu1/e1;", "La2/i;", "interactionSource", "Lu1/f1;", "indication", "<init>", "(La2/i;Lu1/f1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d1 extends h5.x0<e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.i f167429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f167430b;

    public d1(a2.i iVar, f1 f1Var) {
        this.f167429a = iVar;
        this.f167430b = f1Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new e1(this.f167430b.a(this.f167429a));
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return p005kotlin.jvm.internal.s.g(this.f167429a, d1Var.f167429a) && p005kotlin.jvm.internal.s.g(this.f167430b, d1Var.f167430b);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f167430b.hashCode() + (this.f167429a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "indication";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167429a, "interactionSource");
        v3Var.c(this.f167430b, "indication");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        e1 e1Var = (e1) cVar;
        h5.j jVarA = this.f167430b.a(this.f167429a);
        e1Var.V1(e1Var.f167459c);
        e1Var.f167459c = jVarA;
        e1Var.U1(jVarA);
    }
}
