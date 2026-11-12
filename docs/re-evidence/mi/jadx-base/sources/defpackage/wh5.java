package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class wh5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f37969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f37970b;
    public wd c;

    public wh5(te teVar) {
        Enumeration enumerationU = teVar.u();
        this.f37969a = wd.o(enumerationU.nextElement());
        this.f37970b = wd.o(enumerationU.nextElement());
        this.c = enumerationU.hasMoreElements() ? (wd) enumerationU.nextElement() : null;
    }

    public static wh5 h(Object obj) {
        if (obj instanceof wh5) {
            return (wh5) obj;
        }
        if (obj != null) {
            return new wh5(te.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.f37970b.q();
    }

    public BigInteger i() {
        wd wdVar = this.c;
        if (wdVar == null) {
            return null;
        }
        return wdVar.q();
    }

    public BigInteger j() {
        return this.f37969a.q();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f37969a);
        jdVar.a(this.f37970b);
        if (i() != null) {
            jdVar.a(this.c);
        }
        return new yg5(jdVar);
    }

    public wh5(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f37969a = new wd(bigInteger);
        this.f37970b = new wd(bigInteger2);
        this.c = i != 0 ? new wd(i) : null;
    }
}
