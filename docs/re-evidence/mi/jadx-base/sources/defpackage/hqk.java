package defpackage;

import com.typesafe.config.ConfigException;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g00 f20346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<h00, gqk> f20347b = new IdentityHashMap();

    public hqk(g00 g00Var) {
        this.f20346a = g00Var;
    }

    public static h00 a(g00 g00Var, eqk eqkVar, roo rooVar) throws h00.c {
        return g00Var.r0(rooVar.c(), eqkVar);
    }

    public h00 b(eqk eqkVar, roo rooVar, int i) throws h00.c {
        eqkVar.h(rooVar);
        try {
            h00 h00VarA = a(this.f20346a, eqkVar, rooVar);
            if (h00VarA == null) {
                roo rooVarA = rooVar.a(rooVar.c().l(i));
                eqkVar.k();
                eqkVar.h(rooVarA);
                if (i > 0) {
                    h00VarA = a(this.f20346a, eqkVar, rooVarA);
                }
                if (h00VarA == null && eqkVar.b().c()) {
                    h00VarA = a(vb4.h(), eqkVar, rooVarA);
                }
            }
            if (h00VarA != null) {
                h00VarA = eqkVar.c(h00VarA);
            }
            return h00VarA;
        } finally {
            eqkVar.k();
        }
    }

    public void c(h00 h00Var, gqk gqkVar) {
        if (this.f20347b.put(h00Var, gqkVar) == null) {
            return;
        }
        throw new ConfigException.BugOrBroken("should not have replaced the same value twice: " + h00Var);
    }

    public final h00 d(eqk eqkVar, h00 h00Var) throws h00.c {
        gqk gqkVar = this.f20347b.get(h00Var);
        return gqkVar == null ? h00Var : gqkVar.b(eqkVar);
    }

    public h00 e(eqk eqkVar, h00 h00Var) throws h00.c {
        h00 h00VarD = d(eqkVar, h00Var);
        return h00VarD != h00Var ? eqkVar.c(h00VarD) : h00Var.a0(eqkVar);
    }

    public void f(h00 h00Var) {
        if (this.f20347b.remove(h00Var) != null) {
            return;
        }
        throw new ConfigException.BugOrBroken("unreplace() without replace(): " + h00Var);
    }
}
