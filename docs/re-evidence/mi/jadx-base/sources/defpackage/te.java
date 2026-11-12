package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class te extends re implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f34611a;

    public te() {
        this.f34611a = new Vector();
    }

    public static te o(ff ffVar, boolean z) {
        if (z) {
            if (ffVar.t()) {
                return q(ffVar.q().toASN1Primitive());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        re reVarQ = ffVar.q();
        if (ffVar.t()) {
            return ffVar instanceof lu1 ? new du1(reVarQ) : new li5(reVarQ);
        }
        if (reVarQ instanceof te) {
            return (te) reVarQ;
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + ffVar.getClass().getName());
    }

    public static te q(Object obj) {
        if (obj == null || (obj instanceof te)) {
            return (te) obj;
        }
        if (obj instanceof ve) {
            return q(((ve) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return q(re.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof hd) {
            re aSN1Primitive = ((hd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof te) {
                return (te) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (!(reVar instanceof te)) {
            return false;
        }
        te teVar = (te) reVar;
        if (size() != teVar.size()) {
            return false;
        }
        Enumeration enumerationU = u();
        Enumeration enumerationU2 = teVar.u();
        while (enumerationU.hasMoreElements()) {
            hd hdVarR = r(enumerationU);
            hd hdVarR2 = r(enumerationU2);
            re aSN1Primitive = hdVarR.toASN1Primitive();
            re aSN1Primitive2 = hdVarR2.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        Enumeration enumerationU = u();
        int size = size();
        while (enumerationU.hasMoreElements()) {
            size = (size * 17) ^ r(enumerationU).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<hd> iterator() {
        return new vj1.a(v());
    }

    @Override // defpackage.re
    public boolean k() {
        return true;
    }

    @Override // defpackage.re
    public re l() {
        yg5 yg5Var = new yg5();
        yg5Var.f34611a = this.f34611a;
        return yg5Var;
    }

    @Override // defpackage.re
    public re m() {
        li5 li5Var = new li5();
        li5Var.f34611a = this.f34611a;
        return li5Var;
    }

    public final hd r(Enumeration enumeration) {
        return (hd) enumeration.nextElement();
    }

    public int size() {
        return this.f34611a.size();
    }

    public hd t(int i) {
        return (hd) this.f34611a.elementAt(i);
    }

    public String toString() {
        return this.f34611a.toString();
    }

    public Enumeration u() {
        return this.f34611a.elements();
    }

    public hd[] v() {
        hd[] hdVarArr = new hd[size()];
        for (int i = 0; i != size(); i++) {
            hdVarArr[i] = t(i);
        }
        return hdVarArr;
    }

    public te(hd hdVar) {
        Vector vector = new Vector();
        this.f34611a = vector;
        vector.addElement(hdVar);
    }

    public te(jd jdVar) {
        this.f34611a = new Vector();
        for (int i = 0; i != jdVar.c(); i++) {
            this.f34611a.addElement(jdVar.b(i));
        }
    }

    public te(hd[] hdVarArr) {
        this.f34611a = new Vector();
        for (int i = 0; i != hdVarArr.length; i++) {
            this.f34611a.addElement(hdVarArr[i]);
        }
    }
}
