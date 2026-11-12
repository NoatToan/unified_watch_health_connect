package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class q0e {
    public static byte[] a(t51 t51Var, hd hdVar) {
        try {
            return b(new PrivateKeyInfo(t51Var, hdVar.toASN1Primitive()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.f(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] c(t51 t51Var, hd hdVar) {
        try {
            return d(new SubjectPublicKeyInfo(t51Var, hdVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.f(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }
}
