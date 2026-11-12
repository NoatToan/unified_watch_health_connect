package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class u97 extends s87 {
    public final h97 c;

    public u97(h97 h97Var, d87 d87Var) {
        super(false, d87Var);
        this.c = d(h97Var);
    }

    public h97 c() {
        return this.c;
    }

    public final h97 d(h97 h97Var) {
        if (h97Var == null) {
            throw new IllegalArgumentException("point has null value");
        }
        if (h97Var.t()) {
            throw new IllegalArgumentException("point at infinity");
        }
        h97 h97VarY = h97Var.y();
        if (h97VarY.v()) {
            return h97VarY;
        }
        throw new IllegalArgumentException("point not on curve");
    }
}
