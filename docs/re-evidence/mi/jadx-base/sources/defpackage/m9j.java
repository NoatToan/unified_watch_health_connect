package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class m9j extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f25918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f25919b;
    public BigInteger c;
    public BigInteger d;
    public BigInteger e;
    public BigInteger f;
    public BigInteger g;
    public BigInteger h;
    public BigInteger i;
    public te j;

    public m9j(te teVar) {
        this.j = null;
        Enumeration enumerationU = teVar.u();
        BigInteger bigIntegerR = ((wd) enumerationU.nextElement()).r();
        if (bigIntegerR.intValue() != 0 && bigIntegerR.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f25918a = bigIntegerR;
        this.f25919b = ((wd) enumerationU.nextElement()).r();
        this.c = ((wd) enumerationU.nextElement()).r();
        this.d = ((wd) enumerationU.nextElement()).r();
        this.e = ((wd) enumerationU.nextElement()).r();
        this.f = ((wd) enumerationU.nextElement()).r();
        this.g = ((wd) enumerationU.nextElement()).r();
        this.h = ((wd) enumerationU.nextElement()).r();
        this.i = ((wd) enumerationU.nextElement()).r();
        if (enumerationU.hasMoreElements()) {
            this.j = (te) enumerationU.nextElement();
        }
    }

    public static m9j j(Object obj) {
        if (obj instanceof m9j) {
            return (m9j) obj;
        }
        if (obj != null) {
            return new m9j(te.q(obj));
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
        return this.f25919b;
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

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f25918a));
        jdVar.a(new wd(k()));
        jdVar.a(new wd(q()));
        jdVar.a(new wd(o()));
        jdVar.a(new wd(l()));
        jdVar.a(new wd(m()));
        jdVar.a(new wd(h()));
        jdVar.a(new wd(i()));
        jdVar.a(new wd(g()));
        te teVar = this.j;
        if (teVar != null) {
            jdVar.a(teVar);
        }
        return new yg5(jdVar);
    }

    public m9j(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.j = null;
        this.f25918a = BigInteger.valueOf(0L);
        this.f25919b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = bigInteger5;
        this.g = bigInteger6;
        this.h = bigInteger7;
        this.i = bigInteger8;
    }
}
