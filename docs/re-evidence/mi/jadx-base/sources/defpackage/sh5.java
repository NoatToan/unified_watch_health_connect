package defpackage;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class sh5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f33631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f33632b;
    public wd c;
    public wd d;
    public ei5 e;

    public sh5(te teVar) {
        if (teVar.size() < 3 || teVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
        Enumeration enumerationU = teVar.u();
        this.f33631a = wd.o(enumerationU.nextElement());
        this.f33632b = wd.o(enumerationU.nextElement());
        this.c = wd.o(enumerationU.nextElement());
        hd hdVarI = i(enumerationU);
        if (hdVarI != null && (hdVarI instanceof wd)) {
            this.d = wd.o(hdVarI);
            hdVarI = i(enumerationU);
        }
        if (hdVarI != null) {
            this.e = ei5.g(hdVarI.toASN1Primitive());
        }
    }

    public static sh5 h(Object obj) {
        if (obj == null || (obj instanceof sh5)) {
            return (sh5) obj;
        }
        if (obj instanceof te) {
            return new sh5((te) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static hd i(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (hd) enumeration.nextElement();
        }
        return null;
    }

    public wd g() {
        return this.f33632b;
    }

    public wd j() {
        return this.f33631a;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f33631a);
        jdVar.a(this.f33632b);
        jdVar.a(this.c);
        wd wdVar = this.d;
        if (wdVar != null) {
            jdVar.a(wdVar);
        }
        ei5 ei5Var = this.e;
        if (ei5Var != null) {
            jdVar.a(ei5Var);
        }
        return new yg5(jdVar);
    }
}
