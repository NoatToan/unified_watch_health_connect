package defpackage;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class eqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hqk f16967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fqk f16968b;
    public final pc4 c;
    public final qlh d;
    public final List<roo> e;

    public eqk(hqk hqkVar, fqk fqkVar, pc4 pc4Var, qlh qlhVar, List<roo> list) {
        this.f16967a = hqkVar;
        this.f16968b = fqkVar;
        this.c = pc4Var;
        this.d = qlhVar;
        this.e = list;
    }

    public static h00 d(h00 h00Var, g00 g00Var, pc4 pc4Var) {
        try {
            return new eqk(g00Var, pc4Var, null).c(h00Var);
        } catch (h00.c e) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", e);
        }
    }

    public boolean a() {
        return this.d != null;
    }

    public pc4 b() {
        return this.c;
    }

    public h00 c(h00 h00Var) throws h00.c {
        cpf cpfVar = null;
        cpf cpfVar2 = new cpf(h00Var, null);
        h00 h00VarA = this.f16968b.a(cpfVar2);
        if (h00VarA == null && a()) {
            cpfVar = new cpf(h00Var, f());
            h00VarA = this.f16968b.a(cpfVar);
        }
        if (h00VarA != null) {
            return h00VarA;
        }
        h00 h00VarE = this.f16967a.e(this, h00Var);
        if (h00VarE == null || h00VarE.Z() == iqk.RESOLVED) {
            this.f16968b.b(cpfVar2, h00VarE);
        } else if (a()) {
            if (cpfVar == null) {
                throw new ConfigException.BugOrBroken("restrictedKey should not be null here");
            }
            this.f16968b.b(cpfVar, h00VarE);
        } else {
            if (!b().b()) {
                throw new ConfigException.BugOrBroken("resolveSubstitutions() did not give us a resolved object");
            }
            this.f16968b.b(cpfVar2, h00VarE);
        }
        return h00VarE;
    }

    public eqk e(qlh qlhVar) {
        return qlhVar == this.d ? this : new eqk(this.f16967a, this.f16968b, this.c, qlhVar, this.e);
    }

    public qlh f() {
        return this.d;
    }

    public hqk g() {
        return this.f16967a;
    }

    public void h(roo rooVar) {
        this.e.add(rooVar);
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        Iterator<roo> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public eqk j() {
        return e(null);
    }

    public void k() {
        List<roo> list = this.e;
        list.remove(list.size() - 1);
    }

    public eqk(g00 g00Var, pc4 pc4Var, qlh qlhVar) {
        this(new hqk(g00Var), new fqk(), pc4Var, qlhVar, new ArrayList());
    }
}
