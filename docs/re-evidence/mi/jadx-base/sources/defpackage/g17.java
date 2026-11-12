package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class g17 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd f18456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd f18457b;
    public final wd c;
    public final wd d;
    public final dnq e;

    public g17(te teVar) {
        if (teVar.size() < 3 || teVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
        Enumeration enumerationU = teVar.u();
        this.f18456a = wd.o(enumerationU.nextElement());
        this.f18457b = wd.o(enumerationU.nextElement());
        this.c = wd.o(enumerationU.nextElement());
        hd hdVarJ = j(enumerationU);
        if (hdVarJ == null || !(hdVarJ instanceof wd)) {
            this.d = null;
        } else {
            this.d = wd.o(hdVarJ);
            hdVarJ = j(enumerationU);
        }
        if (hdVarJ != null) {
            this.e = dnq.g(hdVarJ.toASN1Primitive());
        } else {
            this.e = null;
        }
    }

    public static g17 h(Object obj) {
        if (obj instanceof g17) {
            return (g17) obj;
        }
        if (obj != null) {
            return new g17(te.q(obj));
        }
        return null;
    }

    private static hd j(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (hd) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger g() {
        return this.f18457b.q();
    }

    public BigInteger i() {
        wd wdVar = this.d;
        if (wdVar == null) {
            return null;
        }
        return wdVar.q();
    }

    public BigInteger k() {
        return this.f18456a.q();
    }

    public BigInteger l() {
        return this.c.q();
    }

    public dnq m() {
        return this.e;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f18456a);
        jdVar.a(this.f18457b);
        jdVar.a(this.c);
        wd wdVar = this.d;
        if (wdVar != null) {
            jdVar.a(wdVar);
        }
        dnq dnqVar = this.e;
        if (dnqVar != null) {
            jdVar.a(dnqVar);
        }
        return new yg5(jdVar);
    }
}
