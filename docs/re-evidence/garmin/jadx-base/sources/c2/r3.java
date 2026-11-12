package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/r3;", "Lh5/x0;", "Lc2/v2$a;", "Lf5/a;", "alignmentLine", "<init>", "(Lf5/a;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r3 extends h5.x0<v2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.a f22863a;

    public r3(f5.a aVar) {
        this.f22863a = aVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v2.a(this.f22863a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        r3 r3Var = obj instanceof r3 ? (r3) obj : null;
        if (r3Var == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f22863a, r3Var.f22863a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22863a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "alignBy";
        m2Var.f91342b = this.f22863a;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((v2.a) cVar).f22906a = this.f22863a;
    }
}
