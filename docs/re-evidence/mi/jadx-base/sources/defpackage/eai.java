package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class eai extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ge f16448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s51 f16449b;
    public we c;

    public eai(s51 s51Var, gd gdVar) throws IOException {
        this(s51Var, gdVar, null);
    }

    public static eai h(Object obj) {
        if (obj instanceof eai) {
            return (eai) obj;
        }
        if (obj != null) {
            return new eai(se.q(obj));
        }
        return null;
    }

    public s51 g() {
        return this.f16449b;
    }

    public s51 i() {
        return this.f16449b;
    }

    public gd j() throws IOException {
        return pe.j(this.f16448a.r());
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(0L));
        idVar.a(this.f16449b);
        idVar.a(this.f16448a);
        if (this.c != null) {
            idVar.a(new hh5(false, 0, this.c));
        }
        return new xg5(idVar);
    }

    public eai(s51 s51Var, gd gdVar, we weVar) throws IOException {
        this.f16448a = new pg5(gdVar.toASN1Primitive().f(ASN1Encoding.DER));
        this.f16449b = s51Var;
        this.c = weVar;
    }

    public eai(se seVar) {
        Enumeration enumerationU = seVar.u();
        if (((vd) enumerationU.nextElement()).r().intValue() == 0) {
            this.f16449b = s51.h(enumerationU.nextElement());
            this.f16448a = ge.q(enumerationU.nextElement());
            if (enumerationU.hasMoreElements()) {
                this.c = we.q((ef) enumerationU.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }
}
