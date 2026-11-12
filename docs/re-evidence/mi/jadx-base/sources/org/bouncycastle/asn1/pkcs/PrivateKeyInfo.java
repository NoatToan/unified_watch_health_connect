package org.bouncycastle.asn1.pkcs;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import defpackage.de;
import defpackage.ff;
import defpackage.hd;
import defpackage.he;
import defpackage.ih5;
import defpackage.jd;
import defpackage.qg5;
import defpackage.re;
import defpackage.t51;
import defpackage.te;
import defpackage.wd;
import defpackage.xe;
import defpackage.yg5;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class PrivateKeyInfo extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public he f29496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t51 f29497b;
    public xe c;

    public PrivateKeyInfo(te teVar) {
        Enumeration enumerationU = teVar.u();
        if (((wd) enumerationU.nextElement()).r().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.f29497b = t51.h(enumerationU.nextElement());
        this.f29496a = he.q(enumerationU.nextElement());
        if (enumerationU.hasMoreElements()) {
            this.c = xe.q((ff) enumerationU.nextElement(), false);
        }
    }

    public static PrivateKeyInfo h(Object obj) {
        if (obj instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new PrivateKeyInfo(te.q(obj));
        }
        return null;
    }

    public t51 g() {
        return this.f29497b;
    }

    public t51 i() {
        return this.f29497b;
    }

    public hd j() throws IOException {
        return re.j(this.f29496a.r());
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(0L));
        jdVar.a(this.f29497b);
        jdVar.a(this.f29496a);
        if (this.c != null) {
            jdVar.a(new ih5(false, 0, this.c));
        }
        return new yg5(jdVar);
    }

    public PrivateKeyInfo(t51 t51Var, hd hdVar) throws IOException {
        this(t51Var, hdVar, null);
    }

    public PrivateKeyInfo(t51 t51Var, hd hdVar, xe xeVar) throws IOException {
        this.f29496a = new qg5(hdVar.toASN1Primitive().f(ASN1Encoding.DER));
        this.f29497b = t51Var;
        this.c = xeVar;
    }
}
