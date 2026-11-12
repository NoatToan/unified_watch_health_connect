package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class rno extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s51 f32728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wf5 f32729b;

    public rno(s51 s51Var, gd gdVar) throws IOException {
        this.f32729b = new wf5(gdVar);
        this.f32728a = s51Var;
    }

    public static rno i(Object obj) {
        if (obj instanceof rno) {
            return (rno) obj;
        }
        if (obj != null) {
            return new rno(se.q(obj));
        }
        return null;
    }

    public s51 g() {
        return this.f32728a;
    }

    public s51 h() {
        return this.f32728a;
    }

    public wf5 j() {
        return this.f32729b;
    }

    public pe k() throws IOException {
        return new rd(this.f32729b.t()).s();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f32728a);
        idVar.a(this.f32729b);
        return new xg5(idVar);
    }

    public rno(s51 s51Var, byte[] bArr) {
        this.f32729b = new wf5(bArr);
        this.f32728a = s51Var;
    }

    public rno(se seVar) {
        if (seVar.size() == 2) {
            Enumeration enumerationU = seVar.u();
            this.f32728a = s51.h(enumerationU.nextElement());
            this.f32729b = wf5.v(enumerationU.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
    }
}
