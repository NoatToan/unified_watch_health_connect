package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class vh5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f36893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f36894b;
    public vd c;

    public vh5(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f36893a = new vd(bigInteger);
        this.f36894b = new vd(bigInteger2);
        if (i != 0) {
            this.c = new vd(i);
        } else {
            this.c = null;
        }
    }

    public static vh5 h(Object obj) {
        if (obj instanceof vh5) {
            return (vh5) obj;
        }
        if (obj != null) {
            return new vh5(se.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.f36894b.q();
    }

    public BigInteger i() {
        vd vdVar = this.c;
        if (vdVar == null) {
            return null;
        }
        return vdVar.q();
    }

    public BigInteger j() {
        return this.f36893a.q();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f36893a);
        idVar.a(this.f36894b);
        if (i() != null) {
            idVar.a(this.c);
        }
        return new xg5(idVar);
    }

    public vh5(se seVar) {
        Enumeration enumerationU = seVar.u();
        this.f36893a = vd.o(enumerationU.nextElement());
        this.f36894b = vd.o(enumerationU.nextElement());
        if (enumerationU.hasMoreElements()) {
            this.c = (vd) enumerationU.nextElement();
        } else {
            this.c = null;
        }
    }
}
