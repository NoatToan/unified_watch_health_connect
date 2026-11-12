package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;

/* JADX INFO: loaded from: classes21.dex */
public class qz extends Algorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RSAKeyProvider f47009a;
    private final qw e;

    qz(qw qwVar, String str, String str2, RSAKeyProvider rSAKeyProvider) throws IllegalArgumentException {
        super(str, str2);
        if (rSAKeyProvider == null) {
            throw new IllegalArgumentException("The Key Provider cannot be null.");
        }
        this.f47009a = rSAKeyProvider;
        this.e = qwVar;
    }

    public qz(String str, String str2, RSAKeyProvider rSAKeyProvider) throws IllegalArgumentException {
        this(new qw(), str, str2, rSAKeyProvider);
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public void verify(DecodedJWT decodedJWT) throws rc {
        try {
            byte[] bArrDecode = Base64.getUrlDecoder().decode(decodedJWT.getSignature());
            RSAPublicKey publicKeyById = this.f47009a.getPublicKeyById(decodedJWT.getKeyId());
            if (publicKeyById == null) {
                throw new IllegalStateException("The given Public Key is null.");
            }
            if (!this.e.d(getDescription(), publicKeyById, decodedJWT.getHeader(), decodedJWT.getPayload(), bArrDecode)) {
                throw new rc(this);
            }
        } catch (IllegalArgumentException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rc(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr, byte[] bArr2) throws rg {
        try {
            RSAPrivateKey privateKey = this.f47009a.getPrivateKey();
            if (privateKey == null) {
                throw new IllegalStateException("The given Private Key is null.");
            }
            return this.e.e(getDescription(), privateKey, bArr, bArr2);
        } catch (IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rg(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr) throws rg {
        try {
            RSAPrivateKey privateKey = this.f47009a.getPrivateKey();
            if (privateKey == null) {
                throw new IllegalStateException("The given Private Key is null.");
            }
            return this.e.a(getDescription(), privateKey, bArr);
        } catch (IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rg(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public String getSigningKeyId() {
        return this.f47009a.getPrivateKeyId();
    }

    public static RSAKeyProvider e(final RSAPublicKey rSAPublicKey, final RSAPrivateKey rSAPrivateKey) {
        if (rSAPublicKey == null && rSAPrivateKey == null) {
            throw new IllegalArgumentException("Both provided Keys cannot be null.");
        }
        return new RSAKeyProvider() { // from class: qz.1
            @Override // com.auth0.jwt.interfaces.KeyProvider
            public String getPrivateKeyId() {
                return null;
            }

            @Override // com.auth0.jwt.interfaces.KeyProvider
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RSAPublicKey getPublicKeyById(String str) {
                return rSAPublicKey;
            }

            @Override // com.auth0.jwt.interfaces.KeyProvider
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RSAPrivateKey getPrivateKey() {
                return rSAPrivateKey;
            }
        };
    }
}
