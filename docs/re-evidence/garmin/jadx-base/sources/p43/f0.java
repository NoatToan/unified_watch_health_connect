package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 extends f2 implements t43.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f135829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f135830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v0 v0Var, v0 v0Var2) {
        super(null);
        v0Var.getClass();
        v0Var2.getClass();
        this.f135829b = v0Var;
        this.f135830c = v0Var2;
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return M0().D0();
    }

    @Override // p43.n0
    public k1 E0() {
        return M0().E0();
    }

    @Override // p43.n0
    public final m1 F0() {
        return M0().F0();
    }

    @Override // p43.n0
    public boolean G0() {
        return M0().G0();
    }

    public abstract v0 M0();

    public abstract String N0(a43.w wVar, a43.w wVar2);

    @Override // p43.n0
    public i43.l i() {
        return M0().i();
    }

    public String toString() {
        return a43.n.f1166d.W(this);
    }
}
