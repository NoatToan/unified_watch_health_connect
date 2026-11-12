package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lcm implements nb4, tqf, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g00 f24907a;

    public lcm(g00 g00Var) {
        this.f24907a = g00Var;
    }

    public static h00 a(g00 g00Var, qlh qlhVar, ConfigValueType configValueType, qlh qlhVar2) {
        try {
            String strB = qlhVar.b();
            qlh qlhVarJ = qlhVar.j();
            return qlhVarJ == null ? d(g00Var, strB, configValueType, qlhVar2) : a((g00) d(g00Var, strB, ConfigValueType.OBJECT, qlhVar2.m(0, qlhVar2.e() - qlhVarJ.e())), qlhVarJ, configValueType, qlhVar2);
        } catch (ConfigException.NotResolved e) {
            throw vb4.k(qlhVar, e);
        }
    }

    public static h00 d(g00 g00Var, String str, ConfigValueType configValueType, qlh qlhVar) {
        h00 h00VarO0 = g00Var.o0(str, qlhVar);
        if (h00VarO0 == null) {
            throw new ConfigException.Missing(qlhVar.k());
        }
        if (configValueType != null) {
            h00VarO0 = sx5.a(h00VarO0, configValueType);
        }
        if (h00VarO0.valueType() == ConfigValueType.NULL) {
            throw new ConfigException.Null(h00VarO0.g(), qlhVar.k(), configValueType != null ? configValueType.name() : null);
        }
        if (configValueType == null || h00VarO0.valueType() == configValueType) {
            return h00VarO0;
        }
        throw new ConfigException.WrongType(h00VarO0.g(), qlhVar.k(), configValueType.name(), h00VarO0.valueType().name());
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.nb4
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public lcm e(fc4 fc4Var) {
        return this.f24907a.d0(fc4Var).r();
    }

    public h00 b(qlh qlhVar, ConfigValueType configValueType, qlh qlhVar2) {
        return a(this.f24907a, qlhVar, configValueType, qlhVar2);
    }

    public h00 c(String str, ConfigValueType configValueType) {
        qlh qlhVarG = qlh.g(str);
        return b(qlhVarG, configValueType, qlhVarG);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lcm) {
            return this.f24907a.equals(((lcm) obj).f24907a);
        }
        return false;
    }

    @Override // defpackage.nb4
    public List<String> f(String str) {
        return i(str, ConfigValueType.STRING);
    }

    @Override // defpackage.nb4
    public boolean getBoolean(String str) {
        return ((Boolean) c(str, ConfigValueType.BOOLEAN).x()).booleanValue();
    }

    @Override // defpackage.nb4
    public double getDouble(String str) {
        return o(str).doubleValue();
    }

    @Override // defpackage.nb4
    public int getInt(String str) {
        return h(str).h0(str);
    }

    @Override // defpackage.nb4
    public String getString(String str) {
        return (String) c(str, ConfigValueType.STRING).x();
    }

    public final hc4 h(String str) {
        return (hc4) c(str, ConfigValueType.NUMBER);
    }

    public final int hashCode() {
        return this.f24907a.hashCode() * 41;
    }

    public final <T> List<T> i(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        for (h00 h00VarA : n(str)) {
            if (configValueType != null) {
                h00VarA = sx5.a(h00VarA, configValueType);
            }
            if (h00VarA.valueType() != configValueType) {
                throw new ConfigException.WrongType(h00VarA.g(), str, "list of " + configValueType.name(), "list of " + h00VarA.valueType().name());
            }
            arrayList.add(h00VarA.x());
        }
        return arrayList;
    }

    @Override // defpackage.nb4
    public List<? extends nb4> j(String str) {
        List<ic4> listP = p(str);
        ArrayList arrayList = new ArrayList();
        Iterator<ic4> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().r());
        }
        return arrayList;
    }

    public final <T extends rc4> List<T> k(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        for (h00 h00VarA : n(str)) {
            if (configValueType != null) {
                h00VarA = sx5.a(h00VarA, configValueType);
            }
            if (h00VarA.valueType() != configValueType) {
                throw new ConfigException.WrongType(h00VarA.g(), str, "list of " + configValueType.name(), "list of " + h00VarA.valueType().name());
            }
            arrayList.add(h00VarA);
        }
        return arrayList;
    }

    public dc4 n(String str) {
        return (dc4) c(str, ConfigValueType.LIST);
    }

    public Number o(String str) {
        return h(str).x();
    }

    public List<ic4> p(String str) {
        return k(str, ConfigValueType.OBJECT);
    }

    @Override // defpackage.nb4
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public lcm resolve() {
        return m(pc4.a());
    }

    @Override // defpackage.nb4
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public lcm m(pc4 pc4Var) {
        return u(this, pc4Var);
    }

    public String toString() {
        return "Config(" + this.f24907a.toString() + ")";
    }

    public lcm u(nb4 nb4Var, pc4 pc4Var) {
        h00 h00VarD = eqk.d(this.f24907a, ((lcm) nb4Var).f24907a, pc4Var);
        return h00VarD == this.f24907a ? this : new lcm((g00) h00VarD);
    }

    @Override // defpackage.nb4
    public boolean v(String str) {
        qlh qlhVarG = qlh.g(str);
        try {
            h00 h00VarQ0 = this.f24907a.q0(qlhVarG);
            return (h00VarQ0 == null || h00VarQ0.valueType() == ConfigValueType.NULL) ? false : true;
        } catch (ConfigException.NotResolved e) {
            throw vb4.k(qlhVarG, e);
        }
    }

    @Override // defpackage.nb4
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public g00 w() {
        return this.f24907a;
    }

    @Override // defpackage.tqf
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g00 t() {
        return this.f24907a;
    }
}
