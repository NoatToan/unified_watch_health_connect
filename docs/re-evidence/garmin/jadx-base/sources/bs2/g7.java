package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class g7 extends sc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7 f20153b;

    public g7(yc ycVar, e7 e7Var) {
        this.f20153b = new h7(ycVar, e7Var);
    }

    @Override // bs2.sc
    public final String c() {
        rc rcVarG;
        pw pwVarH;
        h7 h7Var = this.f20153b;
        bk bkVar = h7Var.f20178a;
        if (bkVar == null || h7Var.f20179b == null || (rcVarG = bkVar.g(3)) == null || !((pwVarH = rcVarG.h(65535)) == null || pwVarH.c(bkVar))) {
            return null;
        }
        pw pwVarH2 = rcVarG.h(65535);
        Object objJ = rcVarG.j(pwVarH2);
        int i14 = pwVarH2 == null ? rcVarG.i() : pwVarH2.f20410a;
        if (objJ == null || sd.f20500t.get(Integer.valueOf(i14)).equals(objJ)) {
            return null;
        }
        return objJ.toString();
    }

    @Override // bs2.sc
    public final double e() {
        h7 h7Var = this.f20153b;
        yc ycVar = h7Var.f20178a;
        return (ycVar == null || h7Var.f20179b == null || ycVar.r() == null || h7Var.f20178a.r().equals(sd.f20484d)) ? (short) 0 : h7Var.f20178a.r().byteValue();
    }

    @Override // bs2.sc
    public final double f() {
        h7 h7Var = this.f20153b;
        yc ycVar = h7Var.f20178a;
        return (ycVar == null || h7Var.f20179b == null || ycVar.k(6) == null || h7Var.f20178a.k(6).equals(sd.f20485e)) ? (short) 1 : h7Var.f20178a.k(6).shortValue();
    }

    @Override // bs2.sc
    public final pw h(int i14) {
        return null;
    }

    @Override // bs2.sc
    public final int i() {
        return this.f20153b.f20181d;
    }

    public g7(h7 h7Var) {
        this.f20153b = h7Var;
    }

    public g7(g7 g7Var) {
        super(g7Var);
        this.f20153b = g7Var.f20153b;
    }
}
