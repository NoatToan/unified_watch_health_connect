package r1;

import ch.qos.logback.core.CoreConstants;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr1/s2;", "Lh5/x0;", "Lr1/v2;", "Ls1/t1;", "Lr1/r0;", "transition", "Ls1/t1$a;", "Lo4/d0;", "Ls1/q;", "veilAnimation", "Lr1/u1;", "enter", "Lr1/w1;", "exit", "<init>", "(Ls1/t1;Ls1/t1$a;Lr1/u1;Lr1/w1;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class s2 extends h5.x0<v2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.t1<r0> f149237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.t1<r0>.a<o4.d0, s1.q> f149238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f149239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f149240d;

    public s2(s1.t1<r0> t1Var, s1.t1<r0>.a<o4.d0, s1.q> aVar, u1 u1Var, w1 w1Var) {
        this.f149237a = t1Var;
        this.f149238b = aVar;
        this.f149239c = u1Var;
        this.f149240d = w1Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v2(this.f149237a, this.f149238b, this.f149239c, this.f149240d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return p005kotlin.jvm.internal.s.g(this.f149237a, s2Var.f149237a) && p005kotlin.jvm.internal.s.g(this.f149238b, s2Var.f149238b) && p005kotlin.jvm.internal.s.g(this.f149239c, s2Var.f149239c) && p005kotlin.jvm.internal.s.g(this.f149240d, s2Var.f149240d);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f149240d.hashCode() + ((this.f149239c.hashCode() + ((this.f149238b.hashCode() + (this.f149237a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "veil";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f149237a, "transition");
        v3Var.c(this.f149238b, "veilAnimation");
        v3Var.c(this.f149239c, "enter");
        v3Var.c(this.f149240d, "exit");
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.f149237a + ", veilAnimation=" + this.f149238b + ", enter=" + this.f149239c + ", exit=" + this.f149240d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        v2 v2Var = (v2) cVar;
        v2Var.getClass();
        v2Var.f149296a = this.f149238b;
        v2Var.f149297b = this.f149239c;
        v2Var.f149298c = this.f149240d;
    }
}
