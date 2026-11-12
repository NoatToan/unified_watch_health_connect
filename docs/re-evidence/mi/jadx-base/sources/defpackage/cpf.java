package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class cpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00 f14596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qlh f14597b;

    public cpf(h00 h00Var, qlh qlhVar) {
        this.f14596a = h00Var;
        this.f14597b = qlhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cpf) {
            cpf cpfVar = (cpf) obj;
            if (cpfVar.f14596a != this.f14596a) {
                return false;
            }
            qlh qlhVar = cpfVar.f14597b;
            qlh qlhVar2 = this.f14597b;
            if (qlhVar == qlhVar2) {
                return true;
            }
            if (qlhVar != null && qlhVar2 != null) {
                return qlhVar.equals(qlhVar2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = System.identityHashCode(this.f14596a);
        qlh qlhVar = this.f14597b;
        return qlhVar != null ? iIdentityHashCode + ((qlhVar.hashCode() + 41) * 41) : iIdentityHashCode;
    }
}
