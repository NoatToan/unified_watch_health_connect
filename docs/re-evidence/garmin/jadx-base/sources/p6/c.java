package p6;

import am.j;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<d> f136192e;

    public c(char[] cArr) {
        super(cArr);
        this.f136192e = new ArrayList<>();
    }

    @Override // p6.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f136192e.equals(((c) obj).f136192e);
        }
        return false;
    }

    public final void g(d dVar) {
        this.f136192e.add(dVar);
    }

    public final float getFloat(int i14) throws CLParsingException {
        d dVarI = i(i14);
        if (dVarI != null) {
            return dVarI.c();
        }
        throw new CLParsingException(j.h(i14, "no float at index "), this);
    }

    public final int getInt(int i14) throws CLParsingException {
        d dVarI = i(i14);
        if (dVarI != null) {
            return dVarI.d();
        }
        throw new CLParsingException(j.h(i14, "no int at index "), this);
    }

    @Override // p6.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = (c) super.a();
        ArrayList<d> arrayList = new ArrayList<>(this.f136192e.size());
        Iterator<d> it = this.f136192e.iterator();
        while (it.hasNext()) {
            d dVarClone = it.next().a();
            dVarClone.f136196d = cVar;
            arrayList.add(dVarClone);
        }
        cVar.f136192e = arrayList;
        return cVar;
    }

    @Override // p6.d
    public int hashCode() {
        return Objects.hash(this.f136192e, Integer.valueOf(super.hashCode()));
    }

    public final d i(int i14) throws CLParsingException {
        if (i14 < 0 || i14 >= this.f136192e.size()) {
            throw new CLParsingException(j.h(i14, "no element at index "), this);
        }
        return this.f136192e.get(i14);
    }

    public final d j(String str) throws CLParsingException {
        Iterator<d> it = this.f136192e.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.b().equals(str)) {
                if (eVar.f136192e.size() > 0) {
                    return eVar.f136192e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(j.m("no element for key <", str, ">"), this);
    }

    public final float l(String str) throws CLParsingException {
        d dVarJ = j(str);
        if (dVarJ != null) {
            return dVarJ.c();
        }
        StringBuilder sbL = hb.a.l("no float found for key <", str, ">, found [");
        sbL.append(dVarJ.e());
        sbL.append("] : ");
        sbL.append(dVarJ);
        throw new CLParsingException(sbL.toString(), this);
    }

    public final d m(int i14) {
        if (i14 < 0 || i14 >= this.f136192e.size()) {
            return null;
        }
        return this.f136192e.get(i14);
    }

    public final d n(String str) {
        Iterator<d> it = this.f136192e.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.b().equals(str)) {
                if (eVar.f136192e.size() <= 0) {
                    break;
                }
                return eVar.f136192e.get(0);
            }
        }
        return null;
    }

    public final String o(int i14) throws CLParsingException {
        d dVarI = i(i14);
        if (dVarI instanceof h) {
            return dVarI.b();
        }
        throw new CLParsingException(j.h(i14, "no string at index "), this);
    }

    public final String p(String str) throws CLParsingException {
        d dVarJ = j(str);
        if (dVarJ instanceof h) {
            return dVarJ.b();
        }
        StringBuilder sbI = b.i("no string found for key <", str, ">, found [", dVarJ != null ? dVarJ.e() : null, "] : ");
        sbI.append(dVarJ);
        throw new CLParsingException(sbI.toString(), this);
    }

    public final String q(String str) {
        d dVarN = n(str);
        if (dVarN instanceof h) {
            return dVarN.b();
        }
        return null;
    }

    public final boolean r(String str) {
        for (d dVar : this.f136192e) {
            if ((dVar instanceof e) && ((e) dVar).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<String> t() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (d dVar : this.f136192e) {
            if (dVar instanceof e) {
                arrayList.add(((e) dVar).b());
            }
        }
        return arrayList;
    }

    @Override // p6.d
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        for (d dVar : this.f136192e) {
            if (sb3.length() > 0) {
                sb3.append("; ");
            }
            sb3.append(dVar);
        }
        return super.toString() + " = <" + ((Object) sb3) + " >";
    }

    public final void u(String str, d dVar) {
        Iterator<d> it = this.f136192e.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.b().equals(str)) {
                int size = eVar.f136192e.size();
                ArrayList<d> arrayList = eVar.f136192e;
                if (size > 0) {
                    arrayList.set(0, dVar);
                    return;
                } else {
                    arrayList.add(dVar);
                    return;
                }
            }
        }
        e eVar2 = new e(str.toCharArray());
        eVar2.f136194b = 0L;
        eVar2.f(str.length() - 1);
        int size2 = eVar2.f136192e.size();
        ArrayList<d> arrayList2 = eVar2.f136192e;
        if (size2 > 0) {
            arrayList2.set(0, dVar);
        } else {
            arrayList2.add(dVar);
        }
        this.f136192e.add(eVar2);
    }
}
