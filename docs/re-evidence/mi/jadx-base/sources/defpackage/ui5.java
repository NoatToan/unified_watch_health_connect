package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class ui5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f35782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f35783b;
    public vd c;

    public ui5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f35782a = new vd(bigInteger);
        this.f35783b = new vd(bigInteger2);
        this.c = new vd(bigInteger3);
    }

    public static ui5 h(Object obj) {
        if (obj instanceof ui5) {
            return (ui5) obj;
        }
        if (obj != null) {
            return new ui5(se.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.c.q();
    }

    public BigInteger i() {
        return this.f35782a.q();
    }

    public BigInteger j() {
        return this.f35783b.q();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f35782a);
        idVar.a(this.f35783b);
        idVar.a(this.c);
        return new xg5(idVar);
    }

    public ui5(se seVar) {
        if (seVar.size() == 3) {
            Enumeration enumerationU = seVar.u();
            this.f35782a = vd.o(enumerationU.nextElement());
            this.f35783b = vd.o(enumerationU.nextElement());
            this.c = vd.o(enumerationU.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
    }
}
