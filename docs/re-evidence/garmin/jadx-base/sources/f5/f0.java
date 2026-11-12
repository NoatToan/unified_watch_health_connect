package f5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf5/f0;", "Lh5/x0;", "Lf5/h0;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class f0 extends h5.x0<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f68940a;

    public f0(Object obj) {
        this.f68940a = obj;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new h0(this.f68940a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && p005kotlin.jvm.internal.s.g(this.f68940a, ((f0) obj).f68940a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f68940a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "layoutId";
        m2Var.f91342b = this.f68940a;
    }

    public final String toString() {
        return wr.g.p(new StringBuilder("LayoutIdElement(layoutId="), this.f68940a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((h0) cVar).f68955a = this.f68940a;
    }
}
