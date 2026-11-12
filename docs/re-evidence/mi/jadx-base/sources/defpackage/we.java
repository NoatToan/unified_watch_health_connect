package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class we extends pe implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f37884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37885b;

    public we() {
        this.f37884a = new Vector();
        this.f37885b = false;
    }

    public static we q(ef efVar, boolean z) {
        if (z) {
            if (efVar.r()) {
                return (we) efVar.o();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (efVar.r()) {
            return efVar instanceof ku1 ? new gu1(efVar.o()) : new mi5(efVar.o());
        }
        if (efVar.o() instanceof we) {
            return (we) efVar.o();
        }
        if (efVar.o() instanceof se) {
            se seVar = (se) efVar.o();
            return efVar instanceof ku1 ? new gu1(seVar.v()) : new mi5(seVar.v());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + efVar.getClass().getName());
    }

    public static we r(Object obj) {
        if (obj == null || (obj instanceof we)) {
            return (we) obj;
        }
        if (obj instanceof ye) {
            return r(((ye) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return r(pe.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof gd) {
            pe aSN1Primitive = ((gd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof we) {
                return (we) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private gd t(Enumeration enumeration) {
        gd gdVar = (gd) enumeration.nextElement();
        return gdVar == null ? lg5.f25030a : gdVar;
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (!(peVar instanceof we)) {
            return false;
        }
        we weVar = (we) peVar;
        if (size() != weVar.size()) {
            return false;
        }
        Enumeration enumerationV = v();
        Enumeration enumerationV2 = weVar.v();
        while (enumerationV.hasMoreElements()) {
            gd gdVarT = t(enumerationV);
            gd gdVarT2 = t(enumerationV2);
            pe aSN1Primitive = gdVarT.toASN1Primitive();
            pe aSN1Primitive2 = gdVarT2.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        Enumeration enumerationV = v();
        int size = size();
        while (enumerationV.hasMoreElements()) {
            size = (size * 17) ^ t(enumerationV).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<gd> iterator() {
        return new wj1.a(z());
    }

    @Override // defpackage.pe
    public boolean k() {
        return true;
    }

    @Override // defpackage.pe
    public pe l() {
        if (this.f37885b) {
            bh5 bh5Var = new bh5();
            bh5Var.f37884a = this.f37884a;
            return bh5Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f37884a.size(); i++) {
            vector.addElement(this.f37884a.elementAt(i));
        }
        bh5 bh5Var2 = new bh5();
        bh5Var2.f37884a = vector;
        bh5Var2.x();
        return bh5Var2;
    }

    @Override // defpackage.pe
    public pe m() {
        mi5 mi5Var = new mi5();
        mi5Var.f37884a = this.f37884a;
        return mi5Var;
    }

    public final byte[] o(gd gdVar) {
        try {
            return gdVar.toASN1Primitive().f(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public int size() {
        return this.f37884a.size();
    }

    public String toString() {
        return this.f37884a.toString();
    }

    public gd u(int i) {
        return (gd) this.f37884a.elementAt(i);
    }

    public Enumeration v() {
        return this.f37884a.elements();
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
        if (this.f37885b) {
            return;
        }
        this.f37885b = true;
        if (this.f37884a.size() > 1) {
            int size = this.f37884a.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] bArrO = o((gd) this.f37884a.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] bArrO2 = o((gd) this.f37884a.elementAt(i3));
                    if (w(bArrO, bArrO2)) {
                        bArrO = bArrO2;
                    } else {
                        Object objElementAt = this.f37884a.elementAt(i2);
                        Vector vector = this.f37884a;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.f37884a.setElementAt(objElementAt, i3);
                        z = true;
                        i = i2;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    public gd[] z() {
        gd[] gdVarArr = new gd[size()];
        for (int i = 0; i != size(); i++) {
            gdVarArr[i] = u(i);
        }
        return gdVarArr;
    }

    public we(gd gdVar) {
        Vector vector = new Vector();
        this.f37884a = vector;
        this.f37885b = false;
        vector.addElement(gdVar);
    }

    public we(id idVar, boolean z) {
        this.f37884a = new Vector();
        this.f37885b = false;
        for (int i = 0; i != idVar.c(); i++) {
            this.f37884a.addElement(idVar.b(i));
        }
        if (z) {
            x();
        }
    }

    public we(gd[] gdVarArr, boolean z) {
        this.f37884a = new Vector();
        this.f37885b = false;
        for (int i = 0; i != gdVarArr.length; i++) {
            this.f37884a.addElement(gdVarArr[i]);
        }
        if (z) {
            x();
        }
    }
}
