package r1;

import com.google.firebase.perf.util.Constants;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lr1/s0;", "Lh5/x0;", "Lr1/t1;", "Ls1/t1;", "Lr1/r0;", "transition", "Ls1/t1$a;", "Lg6/m;", "Ls1/o;", "sizeAnimation", "Lg6/k;", "offsetAnimation", "slideAnimation", "Lr1/u1;", "enter", "Lr1/w1;", "exit", "Lkotlin/Function0;", "", Constants.ENABLE_DISABLE, "Lr1/b2;", "graphicsLayerBlock", "<init>", "(Ls1/t1;Ls1/t1$a;Ls1/t1$a;Ls1/t1$a;Lr1/u1;Lr1/w1;Le23/a;Lr1/b2;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s0 extends h5.x0<t1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.t1<r0> f149228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.t1<r0>.a<g6.m, s1.o> f149229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.t1<r0>.a<g6.k, s1.o> f149230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1.t1<r0>.a<g6.k, s1.o> f149231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f149232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f149233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Boolean> f149234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f149235h;

    public s0(s1.t1<r0> t1Var, s1.t1<r0>.a<g6.m, s1.o> aVar, s1.t1<r0>.a<g6.k, s1.o> aVar2, s1.t1<r0>.a<g6.k, s1.o> aVar3, u1 u1Var, w1 w1Var, e23.a<Boolean> aVar4, b2 b2Var) {
        this.f149228a = t1Var;
        this.f149229b = aVar;
        this.f149230c = aVar2;
        this.f149231d = aVar3;
        this.f149232e = u1Var;
        this.f149233f = w1Var;
        this.f149234g = aVar4;
        this.f149235h = b2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new t1(this.f149228a, this.f149229b, this.f149230c, this.f149231d, this.f149232e, this.f149233f, this.f149234g, this.f149235h);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p005kotlin.jvm.internal.s.g(s0Var.f149228a, this.f149228a) && p005kotlin.jvm.internal.s.g(s0Var.f149229b, this.f149229b) && p005kotlin.jvm.internal.s.g(s0Var.f149230c, this.f149230c) && p005kotlin.jvm.internal.s.g(s0Var.f149231d, this.f149231d) && p005kotlin.jvm.internal.s.g(s0Var.f149232e, this.f149232e) && p005kotlin.jvm.internal.s.g(s0Var.f149233f, this.f149233f) && s0Var.f149234g == this.f149234g && p005kotlin.jvm.internal.s.g(s0Var.f149235h, this.f149235h);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f149228a.hashCode() * 31;
        s1.t1<r0>.a<g6.m, s1.o> aVar = this.f149229b;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        s1.t1<r0>.a<g6.k, s1.o> aVar2 = this.f149230c;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        s1.t1<r0>.a<g6.k, s1.o> aVar3 = this.f149231d;
        return this.f149235h.hashCode() + q6.f.f((this.f149233f.hashCode() + ((this.f149232e.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f149234g);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "enterExitTransition";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f149228a, "transition");
        v3Var.c(this.f149229b, "sizeAnimation");
        v3Var.c(this.f149230c, "offsetAnimation");
        v3Var.c(this.f149231d, "slideAnimation");
        v3Var.c(this.f149232e, "enter");
        v3Var.c(this.f149233f, "exit");
        v3Var.c(this.f149235h, "graphicsLayerBlock");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        t1 t1Var = (t1) cVar;
        t1Var.f149249a = this.f149228a;
        t1Var.f149250b = this.f149229b;
        t1Var.f149251c = this.f149230c;
        t1Var.f149252d = this.f149231d;
        t1Var.f149253e = this.f149232e;
        t1Var.f149254f = this.f149233f;
        t1Var.f149255g = this.f149234g;
        t1Var.f149256h = this.f149235h;
    }
}
