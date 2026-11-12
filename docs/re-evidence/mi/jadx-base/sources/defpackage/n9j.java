package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class n9j extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f27683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f27684b;

    public n9j(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f27683a = bigInteger;
        this.f27684b = bigInteger2;
    }

    public static n9j g(Object obj) {
        if (obj instanceof n9j) {
            return (n9j) obj;
        }
        if (obj != null) {
            return new n9j(se.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        return this.f27683a;
    }

    public BigInteger i() {
        return this.f27684b;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(h()));
        idVar.a(new vd(i()));
        return new xg5(idVar);
    }

    public n9j(se seVar) {
        if (seVar.size() == 2) {
            Enumeration enumerationU = seVar.u();
            this.f27683a = vd.o(enumerationU.nextElement()).q();
            this.f27684b = vd.o(enumerationU.nextElement()).q();
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
    }
}
