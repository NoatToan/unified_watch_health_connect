package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class vi5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f36916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f36917b;
    public wd c;

    public vi5(te teVar) {
        if (teVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
        Enumeration enumerationU = teVar.u();
        this.f36916a = wd.o(enumerationU.nextElement());
        this.f36917b = wd.o(enumerationU.nextElement());
        this.c = wd.o(enumerationU.nextElement());
    }

    public static vi5 h(Object obj) {
        if (obj instanceof vi5) {
            return (vi5) obj;
        }
        if (obj != null) {
            return new vi5(te.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.c.q();
    }

    public BigInteger i() {
        return this.f36916a.q();
    }

    public BigInteger j() {
        return this.f36917b.q();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f36916a);
        jdVar.a(this.f36917b);
        jdVar.a(this.c);
        return new yg5(jdVar);
    }

    public vi5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f36916a = new wd(bigInteger);
        this.f36917b = new wd(bigInteger2);
        this.c = new wd(bigInteger3);
    }
}
