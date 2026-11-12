package org.bouncycastle.asn1.x509;

import defpackage.de;
import defpackage.hd;
import defpackage.jd;
import defpackage.re;
import defpackage.t51;
import defpackage.te;
import defpackage.xf5;
import defpackage.yg5;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class SubjectPublicKeyInfo extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t51 f29498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xf5 f29499b;

    public SubjectPublicKeyInfo(te teVar) {
        if (teVar.size() == 2) {
            Enumeration enumerationU = teVar.u();
            this.f29498a = t51.h(enumerationU.nextElement());
            this.f29499b = xf5.v(enumerationU.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
    }

    public static SubjectPublicKeyInfo i(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(te.q(obj));
        }
        return null;
    }

    public t51 g() {
        return this.f29498a;
    }

    public t51 h() {
        return this.f29498a;
    }

    public xf5 j() {
        return this.f29499b;
    }

    public re k() throws IOException {
        return re.j(this.f29499b.t());
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f29498a);
        jdVar.a(this.f29499b);
        return new yg5(jdVar);
    }

    public SubjectPublicKeyInfo(t51 t51Var, hd hdVar) throws IOException {
        this.f29499b = new xf5(hdVar);
        this.f29498a = t51Var;
    }

    public SubjectPublicKeyInfo(t51 t51Var, byte[] bArr) {
        this.f29499b = new xf5(bArr);
        this.f29498a = t51Var;
    }
}
