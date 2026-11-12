package r1;

import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lr1/g2;", "Lh5/x0;", "Lr1/h2;", "Ls1/f0;", "Lg6/m;", "animationSpec", "Lh4/d;", "alignment", "Lkotlin/Function2;", "", "finishedListener", "<init>", "(Ls1/f0;Lh4/d;Le23/p;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class g2 extends h5.x0<h2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.f0<g6.m> f149088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.d f149089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<g6.m, g6.m, Unit> f149090c;

    /* JADX WARN: Multi-variable type inference failed */
    public g2(s1.f0<g6.m> f0Var, h4.d dVar, e23.p<? super g6.m, ? super g6.m, Unit> pVar) {
        this.f149088a = f0Var;
        this.f149089b = dVar;
        this.f149090c = pVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new h2(this.f149088a, this.f149089b, this.f149090c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return p005kotlin.jvm.internal.s.g(g2Var.f149088a, this.f149088a) && g2Var.f149090c == this.f149090c && p005kotlin.jvm.internal.s.g(g2Var.f149089b, this.f149089b);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f149089b.hashCode() + (this.f149088a.hashCode() * 31)) * 31;
        e23.p<g6.m, g6.m, Unit> pVar = this.f149090c;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "animateContentSize";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f149088a, "animationSpec");
        v3Var.c(this.f149089b, "alignment");
        v3Var.c(this.f149090c, "finishedListener");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        h2 h2Var = (h2) cVar;
        h2Var.f149100a = this.f149088a;
        h2Var.f149102c = this.f149090c;
        h2Var.f149101b = this.f149089b;
    }
}
