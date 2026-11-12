package defpackage;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h00 implements rc4, tqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ocm f19518a;

    public interface a {
        h00 a(String str, h00 h00Var) throws Exception;
    }

    public abstract class b implements a {
        public b() {
        }

        @Override // h00.a
        public final h00 a(String str, h00 h00Var) throws Exception {
            try {
                return b(str, h00Var);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new ConfigException.BugOrBroken("Unexpected exception", e2);
            }
        }

        public abstract h00 b(String str, h00 h00Var);
    }

    public static class c extends Exception {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19520a;

        public c(eqk eqkVar) {
            super("was not possible to resolve");
            this.f19520a = eqkVar.i();
        }

        public String a() {
            return this.f19520a;
        }
    }

    public h00(jc4 jc4Var) {
        this.f19518a = (ocm) jc4Var;
    }

    public static void E(StringBuilder sb, int i, oc4 oc4Var) {
        if (oc4Var.c()) {
            while (i > 0) {
                sb.append("    ");
                i--;
            }
        }
    }

    public h00 A(jc4 jc4Var, List<h00> list) {
        return new qb4(jc4Var, list);
    }

    public final h00 B(Collection<h00> collection, h00 h00Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(h00Var);
        return A(g00.j0(arrayList), arrayList);
    }

    public boolean C() {
        return Z() == iqk.RESOLVED;
    }

    public h00 F(h00 h00Var) {
        Y();
        return G(Collections.singletonList(this), h00Var);
    }

    public final h00 G(Collection<h00> collection, h00 h00Var) {
        Y();
        return Z() == iqk.RESOLVED ? e0() : B(collection, h00Var);
    }

    public h00 H(g00 g00Var) {
        Y();
        return I(Collections.singletonList(this), g00Var);
    }

    public final h00 I(Collection<h00> collection, g00 g00Var) {
        Y();
        if (this instanceof g00) {
            throw new ConfigException.BugOrBroken("Objects must reimplement mergedWithObject");
        }
        return G(collection, g00Var);
    }

    public h00 L(taq taqVar) {
        Y();
        return P(Collections.singletonList(this), taqVar);
    }

    public final h00 P(Collection<h00> collection, taq taqVar) {
        Y();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(taqVar.o());
        return A(g00.j0(arrayList), arrayList);
    }

    public abstract h00 T(jc4 jc4Var);

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public ocm g() {
        return this.f19518a;
    }

    public h00 V(qlh qlhVar) {
        return this;
    }

    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        sb.append(x().toString());
    }

    public void X(StringBuilder sb, int i, boolean z, String str, oc4 oc4Var) {
        if (str != null) {
            sb.append(oc4Var.d() ? wb4.e(str) : wb4.f(str));
            if (oc4Var.d()) {
                if (oc4Var.c()) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            } else if (!(this instanceof ic4)) {
                sb.append("=");
            } else if (oc4Var.c()) {
                sb.append(' ');
            }
        }
        W(sb, i, z, oc4Var);
    }

    public final void Y() {
        if (C()) {
            throw new ConfigException.BugOrBroken("method should not have been called with ignoresFallbacks=true " + getClass().getSimpleName());
        }
    }

    public iqk Z() {
        return iqk.RESOLVED;
    }

    public h00 a0(eqk eqkVar) throws c {
        return this;
    }

    @Override // defpackage.tqf
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public h00 t() {
        return this;
    }

    public String c0() {
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public h00 e(fc4 fc4Var) {
        if (C()) {
            return this;
        }
        rc4 rc4VarT = ((tqf) fc4Var).t();
        if (rc4VarT instanceof taq) {
            return L((taq) rc4VarT);
        }
        return rc4VarT instanceof g00 ? H((g00) rc4VarT) : F((h00) rc4VarT);
    }

    public h00 e0() {
        if (C()) {
            return this;
        }
        throw new ConfigException.BugOrBroken("value class doesn't implement forced fallback-ignoring " + this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rc4) || !z(obj)) {
            return false;
        }
        rc4 rc4Var = (rc4) obj;
        return valueType() == rc4Var.valueType() && wb4.a(x(), rc4Var.x());
    }

    public h00 f0(jc4 jc4Var) {
        return this.f19518a == jc4Var ? this : T(jc4Var);
    }

    public int hashCode() {
        Object objX = x();
        if (objX == null) {
            return 0;
        }
        return objX.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        X(sb, 0, true, null, oc4.a());
        return getClass().getSimpleName() + "(" + sb.toString() + ")";
    }

    public boolean z(Object obj) {
        return obj instanceof rc4;
    }
}
