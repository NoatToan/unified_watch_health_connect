package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class o9j extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f28897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f28898b;

    public o9j(te teVar) {
        if (teVar.size() == 2) {
            Enumeration enumerationU = teVar.u();
            this.f28897a = wd.o(enumerationU.nextElement()).q();
            this.f28898b = wd.o(enumerationU.nextElement()).q();
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
    }

    public static o9j g(Object obj) {
        if (obj instanceof o9j) {
            return (o9j) obj;
        }
        if (obj != null) {
            return new o9j(te.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        return this.f28897a;
    }

    public BigInteger i() {
        return this.f28898b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(h()));
        jdVar.a(new wd(i()));
        return new yg5(jdVar);
    }

    public o9j(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f28897a = bigInteger;
        this.f28898b = bigInteger2;
    }
}
