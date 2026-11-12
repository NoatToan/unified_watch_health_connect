package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class q38 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f31038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f31039b;

    public q38(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f31038a = new vd(bigInteger);
        this.f31039b = new vd(bigInteger2);
    }

    public static q38 h(Object obj) {
        if (obj instanceof q38) {
            return (q38) obj;
        }
        if (obj != null) {
            return new q38(se.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.f31039b.q();
    }

    public BigInteger i() {
        return this.f31038a.q();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f31038a);
        idVar.a(this.f31039b);
        return new xg5(idVar);
    }

    public q38(se seVar) {
        Enumeration enumerationU = seVar.u();
        this.f31038a = (vd) enumerationU.nextElement();
        this.f31039b = (vd) enumerationU.nextElement();
    }
}
