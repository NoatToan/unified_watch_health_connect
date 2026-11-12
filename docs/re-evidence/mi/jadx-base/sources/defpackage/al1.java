package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface al1 {
    PrivateKey a(PrivateKeyInfo privateKeyInfo) throws IOException;

    PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;
}
