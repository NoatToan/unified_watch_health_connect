package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/n1;", "Lh5/x0;", "Lf5/o1;", "Lkotlin/Function1;", "Lg6/m;", "", "onSizeChanged", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n1 extends h5.x0<o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<g6.m, Unit> f69011a;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(e23.l<? super g6.m, Unit> lVar) {
        this.f69011a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o1(this.f69011a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return this.f69011a == ((n1) obj).f69011a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f69011a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "onSizeChanged";
        m2Var.f91343c.c(this.f69011a, "onSizeChanged");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o1 o1Var = (o1) cVar;
        o1Var.f69012a = this.f69011a;
        long j8 = Integer.MIN_VALUE;
        g6.m.a aVar = g6.m.f76012b;
        o1Var.f69014c = (j8 & 4294967295L) | (j8 << 32);
    }
}
