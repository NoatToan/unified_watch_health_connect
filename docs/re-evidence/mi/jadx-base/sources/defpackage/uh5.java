package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uh5 extends cl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xh5 f35753b;

    public uh5(boolean z, xh5 xh5Var) {
        super(z);
        this.f35753b = xh5Var;
    }

    public xh5 b() {
        return this.f35753b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uh5)) {
            return false;
        }
        xh5 xh5Var = this.f35753b;
        xh5 xh5VarB = ((uh5) obj).b();
        if (xh5Var == null) {
            return xh5VarB == null;
        }
        return xh5Var.equals(xh5VarB);
    }

    public int hashCode() {
        int i = !a() ? 1 : 0;
        xh5 xh5Var = this.f35753b;
        return xh5Var != null ? i ^ xh5Var.hashCode() : i;
    }
}
