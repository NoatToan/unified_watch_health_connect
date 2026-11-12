package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ex6 extends iz5 {
    public int m;

    public ex6(njr njrVar) {
        super(njrVar);
        if (njrVar instanceof sac) {
            this.e = iz5.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = iz5.a.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.iz5
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (fz5 fz5Var : this.f22242k) {
            fz5Var.a(fz5Var);
        }
    }
}
