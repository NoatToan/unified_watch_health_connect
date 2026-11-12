package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xe extends re implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f39035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39036b;

    public xe() {
        this.f39035a = new Vector();
        this.f39036b = false;
    }

    public static xe q(ff ffVar, boolean z) {
        if (z) {
            if (ffVar.t()) {
                return (xe) ffVar.q();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        re reVarQ = ffVar.q();
        if (ffVar.t()) {
            return ffVar instanceof lu1 ? new hu1(reVarQ) : new ni5(reVarQ);
        }
        if (reVarQ instanceof xe) {
            return (xe) reVarQ;
        }
        if (reVarQ instanceof te) {
            te teVar = (te) reVarQ;
            return ffVar instanceof lu1 ? new hu1(teVar.v()) : new ni5(teVar.v());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + ffVar.getClass().getName());
    }

    public static xe r(Object obj) {
        if (obj == null || (obj instanceof xe)) {
            return (xe) obj;
        }
        if (obj instanceof ze) {
            return r(((ze) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return r(re.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof hd) {
            re aSN1Primitive = ((hd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof xe) {
                return (xe) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private hd t(Enumeration enumeration) {
        hd hdVar = (hd) enumeration.nextElement();
        return hdVar == null ? mg5.f26130a : hdVar;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (!(reVar instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) reVar;
        if (size() != xeVar.size()) {
            return false;
        }
        Enumeration enumerationV = v();
        Enumeration enumerationV2 = xeVar.v();
        while (enumerationV.hasMoreElements()) {
            hd hdVarT = t(enumerationV);
            hd hdVarT2 = t(enumerationV2);
            re aSN1Primitive = hdVarT.toASN1Primitive();
            re aSN1Primitive2 = hdVarT2.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        Enumeration enumerationV = v();
        int size = size();
        while (enumerationV.hasMoreElements()) {
            size = (size * 17) ^ t(enumerationV).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<hd> iterator() {
        return new vj1.a(z());
    }

    @Override // defpackage.re
    public boolean k() {
        return true;
    }

    @Override // defpackage.re
    public re l() {
        if (this.f39036b) {
            ch5 ch5Var = new ch5();
            ch5Var.f39035a = this.f39035a;
            return ch5Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f39035a.size(); i++) {
            vector.addElement(this.f39035a.elementAt(i));
        }
        ch5 ch5Var2 = new ch5();
        ch5Var2.f39035a = vector;
        ch5Var2.x();
        return ch5Var2;
    }

    @Override // defpackage.re
    public re m() {
        ni5 ni5Var = new ni5();
        ni5Var.f39035a = this.f39035a;
        return ni5Var;
    }

    public final byte[] o(hd hdVar) {
        try {
            return hdVar.toASN1Primitive().f(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public int size() {
        return this.f39035a.size();
    }

    public String toString() {
        return this.f39035a.toString();
    }

    public hd u(int i) {
        return (hd) this.f39035a.elementAt(i);
    }

    public Enumeration v() {
        return this.f39035a.elements();
    }

    public final boolean w(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != iMin; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return (b2 & 255) < (b3 & 255);
            }
        }
        return iMin == bArr.length;
    }

    public void x() {
        if (this.f39036b) {
            return;
        }
        this.f39036b = true;
        if (this.f39035a.size() > 1) {
            int size = this.f39035a.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] bArrO = o((hd) this.f39035a.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] bArrO2 = o((hd) this.f39035a.elementAt(i3));
                    if (w(bArrO, bArrO2)) {
                        bArrO = bArrO2;
                    } else {
                        Object objElementAt = this.f39035a.elementAt(i2);
                        Vector vector = this.f39035a;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.f39035a.setElementAt(objElementAt, i3);
                        z = true;
                        i = i2;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    public hd[] z() {
        hd[] hdVarArr = new hd[size()];
        for (int i = 0; i != size(); i++) {
            hdVarArr[i] = u(i);
        }
        return hdVarArr;
    }

    public xe(hd hdVar) {
        Vector vector = new Vector();
        this.f39035a = vector;
        this.f39036b = false;
        vector.addElement(hdVar);
    }

    public xe(jd jdVar, boolean z) {
        this.f39035a = new Vector();
        this.f39036b = false;
        for (int i = 0; i != jdVar.c(); i++) {
            this.f39035a.addElement(jdVar.b(i));
        }
        if (z) {
            x();
        }
    }

    public xe(hd[] hdVarArr, boolean z) {
        this.f39035a = new Vector();
        this.f39036b = false;
        for (int i = 0; i != hdVarArr.length; i++) {
            this.f39035a.addElement(hdVarArr[i]);
        }
        if (z) {
            x();
        }
    }
}
