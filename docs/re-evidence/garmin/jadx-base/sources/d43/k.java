package d43;

import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends g<o13.p<? extends x33.b, ? extends x33.f>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.b f57484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x33.f f57485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x33.b bVar, x33.f fVar) {
        super(new o13.p(bVar, fVar));
        bVar.getClass();
        fVar.getClass();
        this.f57484b = bVar;
        this.f57485c = fVar;
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        v0 v0VarP;
        x33.b bVar = this.f57484b;
        t23.e eVarA = t23.u.a(c0Var, bVar);
        if (eVarA != null) {
            int i14 = b43.i.f15728a;
            if (!b43.i.l(eVarA, t23.f.ENUM_CLASS)) {
                eVarA = null;
            }
            if (eVarA != null && (v0VarP = eVarA.p()) != null) {
                return v0VarP;
            }
        }
        r43.k kVar = r43.k.C;
        String string = bVar.toString();
        String str = this.f57485c.f188605a;
        str.getClass();
        return r43.l.c(kVar, string, str);
    }

    @Override // d43.g
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f57484b.f());
        sb3.append('.');
        sb3.append(this.f57485c);
        return sb3.toString();
    }
}
