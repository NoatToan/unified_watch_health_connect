package t23;

import java.util.List;
import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f161999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f162000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162001c;

    public c(d1 d1Var, l lVar, int i14) {
        d1Var.getClass();
        lVar.getClass();
        this.f161999a = d1Var;
        this.f162000b = lVar;
        this.f162001c = i14;
    }

    @Override // t23.l
    public final <R, D> R K(n<R, D> nVar, D d14) {
        return (R) this.f161999a.K(nVar, d14);
    }

    @Override // t23.h, t23.l
    public final h a() {
        return this.f161999a.a();
    }

    @Override // t23.l
    public final l d() {
        return this.f162000b;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        return this.f161999a.getAnnotations();
    }

    @Override // t23.d1
    public final int getIndex() {
        return this.f161999a.getIndex() + this.f162001c;
    }

    @Override // t23.l
    public final x33.f getName() {
        x33.f name = this.f161999a.getName();
        name.getClass();
        return name;
    }

    @Override // t23.m
    public final y0 getSource() {
        y0 source = this.f161999a.getSource();
        source.getClass();
        return source;
    }

    @Override // t23.d1
    public final List<p43.n0> getUpperBounds() {
        List<p43.n0> upperBounds = this.f161999a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // t23.d1, t23.h
    public final p43.m1 h() {
        p43.m1 m1VarH = this.f161999a.h();
        m1VarH.getClass();
        return m1VarH;
    }

    @Override // t23.d1
    public final g2 m() {
        g2 g2VarM = this.f161999a.m();
        g2VarM.getClass();
        return g2VarM;
    }

    @Override // t23.d1
    public final o43.n o0() {
        o43.n nVarO0 = this.f161999a.o0();
        nVarO0.getClass();
        return nVarO0;
    }

    @Override // t23.h
    public final p43.v0 p() {
        p43.v0 v0VarP = this.f161999a.p();
        v0VarP.getClass();
        return v0VarP;
    }

    @Override // t23.d1
    public final boolean r() {
        return this.f161999a.r();
    }

    public final String toString() {
        return this.f161999a + "[inner-copy]";
    }

    @Override // t23.d1
    public final boolean u() {
        return true;
    }

    @Override // t23.l
    public final l a() {
        return this.f161999a.a();
    }

    @Override // t23.d1, t23.h, t23.l
    public final d1 a() {
        return this.f161999a.a();
    }
}
