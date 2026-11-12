package defpackage;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class rh5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f32537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f32538b;
    public vd c;
    public vd d;
    public di5 e;

    public rh5(se seVar) {
        if (seVar.size() < 3 || seVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
        Enumeration enumerationU = seVar.u();
        this.f32537a = vd.o(enumerationU.nextElement());
        this.f32538b = vd.o(enumerationU.nextElement());
        this.c = vd.o(enumerationU.nextElement());
        gd gdVarI = i(enumerationU);
        if (gdVarI != null && (gdVarI instanceof vd)) {
            this.d = vd.o(gdVarI);
            gdVarI = i(enumerationU);
        }
        if (gdVarI != null) {
            this.e = di5.g(gdVarI.toASN1Primitive());
        }
    }

    public static rh5 h(Object obj) {
        if (obj == null || (obj instanceof rh5)) {
            return (rh5) obj;
        }
        if (obj instanceof se) {
            return new rh5((se) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static gd i(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (gd) enumeration.nextElement();
        }
        return null;
    }

    public vd g() {
        return this.f32538b;
    }

    public vd j() {
        return this.f32537a;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f32537a);
        idVar.a(this.f32538b);
        idVar.a(this.c);
        vd vdVar = this.d;
        if (vdVar != null) {
            idVar.a(vdVar);
        }
        di5 di5Var = this.e;
        if (di5Var != null) {
            idVar.a(di5Var);
        }
        return new xg5(idVar);
    }
}
