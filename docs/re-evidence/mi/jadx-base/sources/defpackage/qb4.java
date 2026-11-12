package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qb4 extends h00 implements taq, dlk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h00> f31306b;

    public class a extends gqk {
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        @Override // defpackage.gqk
        public h00 a(eqk eqkVar) throws h00.c {
            return qb4.h0(eqkVar, qb4.this.f31306b, this.c);
        }
    }

    public qb4(jc4 jc4Var, List<h00> list) {
        super(jc4Var);
        this.f31306b = list;
        if (list.isEmpty()) {
            throw new ConfigException.BugOrBroken("creating empty delayed merge value");
        }
        for (h00 h00Var : list) {
            if ((h00Var instanceof qb4) || (h00Var instanceof rb4)) {
                throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
            }
        }
    }

    public static h00 h0(eqk eqkVar, List<h00> list, int i) throws h00.c {
        List<h00> listSubList = list.subList(i, list.size());
        if (listSubList.isEmpty()) {
            throw new h00.c(eqkVar);
        }
        h00 h00VarE = null;
        for (h00 h00Var : listSubList) {
            h00VarE = h00VarE == null ? h00Var : h00VarE.e(h00Var);
        }
        return h00VarE;
    }

    public static void m0(List<h00> list, StringBuilder sb, int i, boolean z, String str, oc4 oc4Var) {
        boolean zB = oc4Var.b();
        if (zB) {
            sb.append("# unresolved merge of " + list.size() + " values follows (\n");
            if (str == null) {
                h00.E(sb, i, oc4Var);
                sb.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
                h00.E(sb, i, oc4Var);
                sb.append("# the HOCON format has no way to list multiple root objects in a single file\n");
            }
        }
        ArrayList<h00> arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        int i2 = 0;
        for (h00 h00Var : arrayList) {
            if (zB) {
                h00.E(sb, i, oc4Var);
                if (str != null) {
                    sb.append("#     unmerged value " + i2 + " for key " + wb4.e(str) + " from ");
                } else {
                    sb.append("#     unmerged value " + i2 + " from ");
                }
                i2++;
                sb.append(h00Var.g().a());
                sb.append("\n");
                for (String str2 : h00Var.g().f()) {
                    h00.E(sb, i, oc4Var);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            h00.E(sb, i, oc4Var);
            if (str != null) {
                sb.append(wb4.e(str));
                if (oc4Var.c()) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            }
            h00Var.W(sb, i, z, oc4Var);
            sb.append(",");
            if (oc4Var.c()) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (oc4Var.c()) {
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        if (zB) {
            h00.E(sb, i, oc4Var);
            sb.append("# ) end of unresolved merge\n");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h00 n0(dlk dlkVar, List<h00> list, eqk eqkVar) throws h00.c {
        boolean z;
        h00 h00VarE = null;
        int i = 0;
        for (h00 h00Var : list) {
            if (h00Var instanceof dlk) {
                throw new ConfigException.BugOrBroken("A delayed merge should not contain another one: " + dlkVar);
            }
            if (h00Var instanceof taq) {
                eqkVar.g().c((h00) dlkVar, dlkVar.q(i + 1));
                z = true;
            } else {
                z = false;
            }
            try {
                h00 h00VarC = eqkVar.c(h00Var);
                if (z) {
                    eqkVar.g().f((h00) dlkVar);
                }
                if (h00VarC != null) {
                    h00VarE = h00VarE == null ? h00VarC : h00VarE.e(h00VarC);
                }
                i++;
            } catch (Throwable th) {
                if (z) {
                    eqkVar.g().f((h00) dlkVar);
                }
                throw th;
            }
        }
        return h00VarE;
    }

    public static boolean o0(List<h00> list) {
        return list.get(list.size() - 1).C();
    }

    @Override // defpackage.h00
    public boolean C() {
        return o0(this.f31306b);
    }

    @Override // defpackage.h00
    public h00 T(jc4 jc4Var) {
        return new qb4(jc4Var, this.f31306b);
    }

    @Override // defpackage.h00
    public void X(StringBuilder sb, int i, boolean z, String str, oc4 oc4Var) {
        m0(this.f31306b, sb, i, z, str, oc4Var);
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.UNRESOLVED;
    }

    @Override // defpackage.h00
    public h00 a0(eqk eqkVar) throws h00.c {
        return n0(this, this.f31306b, eqkVar);
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof qb4) && z(obj) && this.f31306b.equals(((qb4) obj).f31306b);
    }

    @Override // defpackage.h00
    public int hashCode() {
        return this.f31306b.hashCode();
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public qb4 F(h00 h00Var) {
        return (qb4) G(this.f31306b, h00Var);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final qb4 H(g00 g00Var) {
        return (qb4) I(this.f31306b, g00Var);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final qb4 L(taq taqVar) {
        return (qb4) P(this.f31306b, taqVar);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public qb4 V(qlh qlhVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<h00> it = this.f31306b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().V(qlhVar));
        }
        return new qb4(g(), arrayList);
    }

    @Override // defpackage.taq
    public Collection<h00> o() {
        return this.f31306b;
    }

    @Override // defpackage.dlk
    public gqk q(int i) {
        return new a(i);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // defpackage.rc4
    public Object x() {
        throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof qb4;
    }
}
