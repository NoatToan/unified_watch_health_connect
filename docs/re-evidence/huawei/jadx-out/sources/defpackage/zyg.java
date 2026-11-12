package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import org.eclipse.californium.elements.auth.AbstractExtensiblePrincipal;

/* JADX INFO: loaded from: classes20.dex */
public class zyg extends AbstractExtensiblePrincipal<zyg> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54769b;
    private final PublicKey e;

    public zyg(PublicKey publicKey) {
        this(publicKey, null);
    }

    private zyg(PublicKey publicKey, zyj zyjVar) {
        super(zyjVar);
        if (publicKey == null) {
            throw new NullPointerException("Public key must not be null");
        }
        this.e = publicKey;
        b(publicKey.getEncoded());
    }

    public zyg(byte[] bArr) throws GeneralSecurityException {
        this(bArr, null, null);
    }

    private zyg(byte[] bArr, String str, zyj zyjVar) throws GeneralSecurityException {
        super(zyjVar);
        if (bArr == null) {
            throw new NullPointerException("SubjectPublicKeyInfo must not be null");
        }
        try {
            String strJ = zza.j(bArr);
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
            try {
                if (str != null) {
                    if (strJ != null) {
                        if (!zzm.c(strJ, str)) {
                            throw new GeneralSecurityException(String.format("Provided key algorithm %s doesn't match %s!", str, strJ));
                        }
                    }
                    this.e = zza.b(str).generatePublic(x509EncodedKeySpec);
                    b(bArr);
                    return;
                }
                if (strJ == null) {
                    throw new GeneralSecurityException("Key algorithm could not be determined!");
                }
                this.e = zza.b(str).generatePublic(x509EncodedKeySpec);
                b(bArr);
                return;
            } catch (RuntimeException e) {
                throw new GeneralSecurityException(e.getMessage());
            }
            str = strJ;
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException(e2.getMessage());
        }
    }

    @Override // org.eclipse.californium.elements.auth.ExtensiblePrincipal
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zyg amend(zyj zyjVar) {
        return new zyg(this.e, zyjVar);
    }

    private void b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            this.f54769b = "ni:///sha-256;" + zzb.b(messageDigest.digest(), 81);
        } catch (IOException | NoSuchAlgorithmException unused) {
        }
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.f54769b;
    }

    public final PublicKey a() {
        return this.e;
    }

    public final byte[] d() {
        return this.e.getEncoded();
    }

    @Override // java.security.Principal
    public String toString() {
        return "RawPublicKey Identity [" + this.f54769b + "]";
    }

    @Override // java.security.Principal
    public int hashCode() {
        if (this.e == null) {
            return 0;
        }
        return Arrays.hashCode(d());
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zyg zygVar = (zyg) obj;
        if (this.e == null) {
            return zygVar.e == null;
        }
        return Arrays.equals(d(), zygVar.d());
    }
}
