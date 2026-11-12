package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class f17 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f17283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd f17284b;
    public final vd c;
    public final vd d;
    public final cnq e;

    public f17(se seVar) {
        if (seVar.size() < 3 || seVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
        Enumeration enumerationU = seVar.u();
        this.f17283a = vd.o(enumerationU.nextElement());
        this.f17284b = vd.o(enumerationU.nextElement());
        this.c = vd.o(enumerationU.nextElement());
        gd gdVarI = i(enumerationU);
        if (gdVarI == null || !(gdVarI instanceof vd)) {
            this.d = null;
        } else {
            this.d = vd.o(gdVarI);
            gdVarI = i(enumerationU);
        }
        if (gdVarI != null) {
            this.e = cnq.g(gdVarI.toASN1Primitive());
        } else {
            this.e = null;
        }
    }

    public static f17 h(Object obj) {
        if (obj instanceof f17) {
            return (f17) obj;
        }
        if (obj != null) {
            return new f17(se.q(obj));
        }
        return null;
    }

    private static gd i(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (gd) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger g() {
        return this.f17284b.q();
    }

    public BigInteger j() {
        return this.f17283a.q();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f17283a);
        idVar.a(this.f17284b);
        idVar.a(this.c);
        vd vdVar = this.d;
        if (vdVar != null) {
            idVar.a(vdVar);
        }
        cnq cnqVar = this.e;
        if (cnqVar != null) {
            idVar.a(cnqVar);
        }
        return new xg5(idVar);
    }
}
