package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.ECDSAKeyProvider;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Base64;

/* JADX INFO: loaded from: classes21.dex */
public class qv extends Algorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qw f46894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ECDSAKeyProvider f46895b;
    private final int d;

    qv(qw qwVar, String str, String str2, int i, ECDSAKeyProvider eCDSAKeyProvider) throws IllegalArgumentException {
        super(str, str2);
        if (eCDSAKeyProvider == null) {
            throw new IllegalArgumentException("The Key Provider cannot be null.");
        }
        this.f46895b = eCDSAKeyProvider;
        this.f46894a = qwVar;
        this.d = i;
    }

    public qv(String str, String str2, int i, ECDSAKeyProvider eCDSAKeyProvider) throws IllegalArgumentException {
        this(new qw(), str, str2, i, eCDSAKeyProvider);
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public void verify(DecodedJWT decodedJWT) throws rc {
        try {
            byte[] bArrDecode = Base64.getUrlDecoder().decode(decodedJWT.getSignature());
            ECPublicKey publicKeyById = this.f46895b.getPublicKeyById(decodedJWT.getKeyId());
            if (publicKeyById == null) {
                throw new IllegalStateException("The given Public Key is null.");
            }
            d(bArrDecode, publicKeyById);
            if (!this.f46894a.d(getDescription(), publicKeyById, decodedJWT.getHeader(), decodedJWT.getPayload(), a(bArrDecode))) {
                throw new rc(this);
            }
        } catch (IllegalArgumentException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rc(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr, byte[] bArr2) throws rg {
        try {
            ECPrivateKey privateKey = this.f46895b.getPrivateKey();
            if (privateKey == null) {
                throw new IllegalStateException("The given Private Key is null.");
            }
            return c(this.f46894a.e(getDescription(), privateKey, bArr, bArr2));
        } catch (IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rg(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public byte[] sign(byte[] bArr) throws rg {
        try {
            ECPrivateKey privateKey = this.f46895b.getPrivateKey();
            if (privateKey == null) {
                throw new IllegalStateException("The given Private Key is null.");
            }
            return c(this.f46894a.a(getDescription(), privateKey, bArr));
        } catch (IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new rg(this, e);
        }
    }

    @Override // com.auth0.jwt.algorithms.Algorithm
    public String getSigningKeyId() {
        return this.f46895b.getPrivateKeyId();
    }

    byte[] c(byte[] bArr) throws SignatureException {
        if (bArr[0] == 48) {
            int length = bArr.length;
            int i = this.d;
            int i2 = i * 2;
            if (length != i2) {
                byte[] bArr2 = new byte[i2];
                int i3 = bArr[1] == -127 ? 2 : 1;
                if ((bArr[i3] & 255) != bArr.length - (i3 + 1)) {
                    throw new SignatureException("Invalid DER signature format.");
                }
                int i4 = i3 + 3;
                int i5 = bArr[i3 + 2];
                if (i5 > i + 1) {
                    throw new SignatureException("Invalid DER signature format.");
                }
                int i6 = i - i5;
                System.arraycopy(bArr, Math.max(-i6, 0) + i4, bArr2, Math.max(i6, 0), Math.min(i6, 0) + i5);
                int i7 = i4 + i5 + 1;
                byte b2 = bArr[i7];
                int i8 = this.d;
                if (b2 > i8 + 1) {
                    throw new SignatureException("Invalid DER signature format.");
                }
                int i9 = i8 - b2;
                System.arraycopy(bArr, i7 + 1 + Math.max(-i9, 0), bArr2, this.d + Math.max(i9, 0), b2 + Math.min(i9, 0));
                return bArr2;
            }
        }
        throw new SignatureException("Invalid DER signature format.");
    }

    void d(byte[] bArr, ECPublicKey eCPublicKey) throws SignatureException {
        if (bArr.length != this.d * 2) {
            throw new SignatureException("Invalid JOSE signature format.");
        }
        if (e(bArr)) {
            throw new SignatureException("Invalid signature format.");
        }
        int i = this.d;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        if (e(bArr2)) {
            throw new SignatureException("Invalid signature format.");
        }
        int i2 = this.d;
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i2, bArr3, 0, i2);
        if (e(bArr3)) {
            throw new SignatureException("Invalid signature format.");
        }
        int iB = b(bArr, 0, this.d);
        int iB2 = b(bArr, this.d, bArr.length);
        int i3 = this.d;
        if ((i3 - iB) + 4 + (i3 - iB2) > 255) {
            throw new SignatureException("Invalid JOSE signature format.");
        }
        BigInteger order = eCPublicKey.getParams().getOrder();
        BigInteger bigInteger = new BigInteger(1, bArr2);
        BigInteger bigInteger2 = new BigInteger(1, bArr3);
        if (order.compareTo(bigInteger) < 1) {
            throw new SignatureException("Invalid signature format.");
        }
        if (order.compareTo(bigInteger2) < 1) {
            throw new SignatureException("Invalid signature format.");
        }
    }

    byte[] a(byte[] bArr) throws SignatureException {
        byte[] bArr2;
        int i;
        int iB = b(bArr, 0, this.d);
        int iB2 = b(bArr, this.d, bArr.length);
        int i2 = this.d;
        int i3 = i2 - iB;
        int i4 = i2 - iB2;
        int i5 = i3 + 4 + i4;
        int i6 = 1;
        if (i5 > 127) {
            bArr2 = new byte[i5 + 3];
            bArr2[1] = -127;
            i6 = 2;
        } else {
            bArr2 = new byte[i5 + 2];
        }
        bArr2[0] = 48;
        bArr2[i6] = (byte) (i5 & 255);
        bArr2[i6 + 1] = 2;
        int i7 = i6 + 3;
        bArr2[i6 + 2] = (byte) i3;
        if (iB < 0) {
            int i8 = i6 + 4;
            bArr2[i7] = 0;
            System.arraycopy(bArr, 0, bArr2, i8, i2);
            i = i8 + this.d;
        } else {
            int iMin = Math.min(i2, i3);
            System.arraycopy(bArr, iB, bArr2, i7, iMin);
            i = i7 + iMin;
        }
        bArr2[i] = 2;
        int i9 = i + 2;
        bArr2[i + 1] = (byte) i4;
        if (iB2 < 0) {
            bArr2[i9] = 0;
            int i10 = this.d;
            System.arraycopy(bArr, i10, bArr2, i + 3, i10);
            return bArr2;
        }
        int i11 = this.d;
        System.arraycopy(bArr, iB2 + i11, bArr2, i9, Math.min(i11, i4));
        return bArr2;
    }

    private boolean e(byte[] bArr) {
        for (byte b2 : bArr) {
            if (b2 != 0) {
                return false;
            }
        }
        return true;
    }

    private int b(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i + i4;
            if (i3 >= i2 || bArr[i3] != 0) {
                break;
            }
            i4++;
        }
        return (bArr[i3] & 255) > 127 ? i4 - 1 : i4;
    }

    public static ECDSAKeyProvider c(final ECPublicKey eCPublicKey, final ECPrivateKey eCPrivateKey) {
        if (eCPublicKey == null && eCPrivateKey == null) {
            throw new IllegalArgumentException("Both provided Keys cannot be null.");
        }
        return new ECDSAKeyProvider() { // from class: qv.2
            @Override // com.auth0.jwt.interfaces.KeyProvider
            public String getPrivateKeyId() {
                return null;
            }

            @Override // com.auth0.jwt.interfaces.KeyProvider
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ECPublicKey getPublicKeyById(String str) {
                return eCPublicKey;
            }

            @Override // com.auth0.jwt.interfaces.KeyProvider
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ECPrivateKey getPrivateKey() {
                return eCPrivateKey;
            }
        };
    }
}
