package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pb4 extends h00 implements taq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h00> f30188b;

    public pb4(jc4 jc4Var, List<h00> list) {
        super(jc4Var);
        this.f30188b = list;
        if (list.size() < 2) {
            throw new ConfigException.BugOrBroken("Created concatenation with less than 2 items: " + this);
        }
        boolean z = false;
        for (h00 h00Var : list) {
            if (h00Var instanceof pb4) {
                throw new ConfigException.BugOrBroken("ConfigConcatenation should never be nested: " + this);
            }
            if (h00Var instanceof taq) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        throw new ConfigException.BugOrBroken("Created concatenation without an unmergeable in it: " + this);
    }

    public static h00 g0(List<h00> list) {
        List<h00> listH0 = h0(list);
        if (listH0.isEmpty()) {
            return null;
        }
        return listH0.size() == 1 ? listH0.get(0) : new pb4(ocm.l(listH0), listH0);
    }

    public static List<h00> h0(List<h00> list) {
        if (list.size() < 2) {
            return list;
        }
        ArrayList<h00> arrayList = new ArrayList(list.size());
        for (h00 h00Var : list) {
            if (h00Var instanceof pb4) {
                arrayList.addAll(((pb4) h00Var).f30188b);
            } else {
                arrayList.add(h00Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (h00 h00Var2 : arrayList) {
            if (arrayList2.isEmpty()) {
                arrayList2.add(h00Var2);
            } else {
                i0(arrayList2, h00Var2);
            }
        }
        return arrayList2;
    }

    public static void i0(ArrayList<h00> arrayList, h00 h00Var) {
        h00 qc4Var;
        h00 h00VarA = arrayList.get(arrayList.size() - 1);
        if ((h00VarA instanceof ic4) && (h00Var instanceof mcm)) {
            h00VarA = sx5.a(h00VarA, ConfigValueType.LIST);
        } else if ((h00VarA instanceof mcm) && (h00Var instanceof ic4)) {
            h00Var = sx5.a(h00Var, ConfigValueType.LIST);
        }
        if ((h00VarA instanceof ic4) && (h00Var instanceof ic4)) {
            qc4Var = h00Var.e(h00VarA);
        } else if ((h00VarA instanceof mcm) && (h00Var instanceof mcm)) {
            qc4Var = ((mcm) h00VarA).j0((mcm) h00Var);
        } else {
            if ((h00VarA instanceof pb4) || (h00Var instanceof pb4)) {
                throw new ConfigException.BugOrBroken("unflattened ConfigConcatenation");
            }
            if ((h00VarA instanceof taq) || (h00Var instanceof taq)) {
                qc4Var = null;
            } else {
                String strC0 = h00VarA.c0();
                String strC1 = h00Var.c0();
                if (strC0 == null || strC1 == null) {
                    throw new ConfigException.WrongType(h00VarA.g(), "Cannot concatenate object or list with a non-object-or-list, " + h00VarA + " and " + h00Var + " are not compatible");
                }
                qc4Var = new qc4(ocm.j(h00VarA.g(), h00Var.g()), strC0 + strC1);
            }
        }
        if (qc4Var == null) {
            arrayList.add(h00Var);
        } else {
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(qc4Var);
        }
    }

    @Override // defpackage.h00
    public boolean C() {
        return false;
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        Iterator<h00> it = this.f30188b.iterator();
        while (it.hasNext()) {
            it.next().W(sb, i, z, oc4Var);
        }
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.UNRESOLVED;
    }

    @Override // defpackage.h00
    public h00 a0(eqk eqkVar) throws h00.c {
        ArrayList arrayList = new ArrayList(this.f30188b.size());
        Iterator<h00> it = this.f30188b.iterator();
        while (it.hasNext()) {
            h00 h00VarC = eqkVar.j().c(it.next());
            if (h00VarC != null) {
                arrayList.add(h00VarC);
            }
        }
        List<h00> listH0 = h0(arrayList);
        if (listH0.size() > 1 && eqkVar.b().b()) {
            return new pb4(g(), listH0);
        }
        if (listH0.size() == 1) {
            return listH0.get(0);
        }
        throw new ConfigException.BugOrBroken("Resolved list should always join to exactly one value, not " + listH0);
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof pb4) && z(obj) && this.f30188b.equals(((pb4) obj).f30188b);
    }

    @Override // defpackage.h00
    public int hashCode() {
        return this.f30188b.hashCode();
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public pb4 T(jc4 jc4Var) {
        return new pb4(jc4Var, this.f30188b);
    }

    public final ConfigException.NotResolved k0() {
        return new ConfigException.NotResolved("need to Config#resolve(), see the API docs for Config#resolve(); substitution not resolved: " + this);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public pb4 V(qlh qlhVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<h00> it = this.f30188b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().V(qlhVar));
        }
        return new pb4(g(), arrayList);
    }

    @Override // defpackage.taq
    public Collection<pb4> o() {
        return Collections.singleton(this);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        throw k0();
    }

    @Override // defpackage.rc4
    public Object x() {
        throw k0();
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof pb4;
    }
}
