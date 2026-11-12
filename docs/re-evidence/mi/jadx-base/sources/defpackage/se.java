package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class se extends pe implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f33552a;

    public se() {
        this.f33552a = new Vector();
    }

    public static se o(ef efVar, boolean z) {
        if (z) {
            if (efVar.r()) {
                return q(efVar.o().toASN1Primitive());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (efVar.r()) {
            return efVar instanceof ku1 ? new cu1(efVar.o()) : new ki5(efVar.o());
        }
        if (efVar.o() instanceof se) {
            return (se) efVar.o();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + efVar.getClass().getName());
    }

    public static se q(Object obj) {
        if (obj == null || (obj instanceof se)) {
            return (se) obj;
        }
        if (obj instanceof ue) {
            return q(((ue) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return q(pe.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof gd) {
            pe aSN1Primitive = ((gd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof se) {
                return (se) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (!(peVar instanceof se)) {
            return false;
        }
        se seVar = (se) peVar;
        if (size() != seVar.size()) {
            return false;
        }
        Enumeration enumerationU = u();
        Enumeration enumerationU2 = seVar.u();
        while (enumerationU.hasMoreElements()) {
            gd gdVarR = r(enumerationU);
            gd gdVarR2 = r(enumerationU2);
            pe aSN1Primitive = gdVarR.toASN1Primitive();
            pe aSN1Primitive2 = gdVarR2.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        Enumeration enumerationU = u();
        int size = size();
        while (enumerationU.hasMoreElements()) {
            size = (size * 17) ^ r(enumerationU).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<gd> iterator() {
        return new wj1.a(v());
    }

    @Override // defpackage.pe
    public boolean k() {
        return true;
    }

    @Override // defpackage.pe
    public pe l() {
        xg5 xg5Var = new xg5();
        xg5Var.f33552a = this.f33552a;
        return xg5Var;
    }

    @Override // defpackage.pe
    public pe m() {
        ki5 ki5Var = new ki5();
        ki5Var.f33552a = this.f33552a;
        return ki5Var;
    }

    public final gd r(Enumeration enumeration) {
        return (gd) enumeration.nextElement();
    }

    public int size() {
        return this.f33552a.size();
    }

    public gd t(int i) {
        return (gd) this.f33552a.elementAt(i);
    }

    public String toString() {
        return this.f33552a.toString();
    }

    public Enumeration u() {
        return this.f33552a.elements();
    }

    public gd[] v() {
        gd[] gdVarArr = new gd[size()];
        for (int i = 0; i != size(); i++) {
            gdVarArr[i] = t(i);
        }
        return gdVarArr;
    }

    public se(gd gdVar) {
        Vector vector = new Vector();
        this.f33552a = vector;
        vector.addElement(gdVar);
    }

    public se(id idVar) {
        this.f33552a = new Vector();
        for (int i = 0; i != idVar.c(); i++) {
            this.f33552a.addElement(idVar.b(i));
        }
    }

    public se(gd[] gdVarArr) {
        this.f33552a = new Vector();
        for (int i = 0; i != gdVarArr.length; i++) {
            this.f33552a.addElement(gdVarArr[i]);
        }
    }
}
