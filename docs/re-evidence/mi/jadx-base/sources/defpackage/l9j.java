package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class l9j extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f24804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f24805b;
    public BigInteger c;
    public BigInteger d;
    public BigInteger e;
    public BigInteger f;
    public BigInteger g;
    public BigInteger h;
    public BigInteger i;
    public se j;

    public l9j(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.j = null;
        this.f24804a = BigInteger.valueOf(0L);
        this.f24805b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = bigInteger5;
        this.g = bigInteger6;
        this.h = bigInteger7;
        this.i = bigInteger8;
    }

    public static l9j j(Object obj) {
        if (obj instanceof l9j) {
            return (l9j) obj;
        }
        if (obj != null) {
            return new l9j(se.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.i;
    }

    public BigInteger h() {
        return this.g;
    }

    public BigInteger i() {
        return this.h;
    }

    public BigInteger k() {
        return this.f24805b;
    }

    public BigInteger l() {
        return this.e;
    }

    public BigInteger m() {
        return this.f;
    }

    public BigInteger o() {
        return this.d;
    }

    public BigInteger q() {
        return this.c;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(this.f24804a));
        idVar.a(new vd(k()));
        idVar.a(new vd(q()));
        idVar.a(new vd(o()));
        idVar.a(new vd(l()));
        idVar.a(new vd(m()));
        idVar.a(new vd(h()));
        idVar.a(new vd(i()));
        idVar.a(new vd(g()));
        se seVar = this.j;
        if (seVar != null) {
            idVar.a(seVar);
        }
        return new xg5(idVar);
    }

    public l9j(se seVar) {
        this.j = null;
        Enumeration enumerationU = seVar.u();
        BigInteger bigIntegerR = ((vd) enumerationU.nextElement()).r();
        if (bigIntegerR.intValue() != 0 && bigIntegerR.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f24804a = bigIntegerR;
        this.f24805b = ((vd) enumerationU.nextElement()).r();
        this.c = ((vd) enumerationU.nextElement()).r();
        this.d = ((vd) enumerationU.nextElement()).r();
        this.e = ((vd) enumerationU.nextElement()).r();
        this.f = ((vd) enumerationU.nextElement()).r();
        this.g = ((vd) enumerationU.nextElement()).r();
        this.h = ((vd) enumerationU.nextElement()).r();
        this.i = ((vd) enumerationU.nextElement()).r();
        if (enumerationU.hasMoreElements()) {
            this.j = (se) enumerationU.nextElement();
        }
    }
}
