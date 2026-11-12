package org.conscrypt;

import am.j;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenSSLSignatureRawRSA extends SignatureSpi {
    private byte[] inputBuffer;
    private boolean inputIsTooLong;
    private int inputOffset;
    private OpenSSLKey key;

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof OpenSSLRSAPrivateKey) {
            this.key = ((OpenSSLRSAPrivateKey) privateKey).getOpenSSLKey();
        } else if (privateKey instanceof RSAPrivateCrtKey) {
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) privateKey);
        } else {
            if (!(privateKey instanceof RSAPrivateKey)) {
                e.q("Need RSA private key");
                return;
            }
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) privateKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof OpenSSLRSAPublicKey) {
            this.key = ((OpenSSLRSAPublicKey) publicKey).getOpenSSLKey();
        } else {
            if (!(publicKey instanceof RSAPublicKey)) {
                e.q("Need RSA public key");
                return;
            }
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) publicKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA private key");
        }
        if (this.inputIsTooLong) {
            StringBuilder sb3 = new StringBuilder("input length ");
            sb3.append(this.inputOffset);
            sb3.append(" != ");
            throw new SignatureException(j.q(sb3, this.inputBuffer.length, " (modulus size)"));
        }
        byte[] bArr = this.inputBuffer;
        byte[] bArr2 = new byte[bArr.length];
        try {
            try {
                NativeCrypto.RSA_private_encrypt(this.inputOffset, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                this.inputOffset = 0;
                return bArr2;
            } catch (Exception e4) {
                throw new SignatureException(e4);
            }
        } catch (Throwable th3) {
            this.inputOffset = 0;
            throw th3;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i14, int i15) {
        int i16 = this.inputOffset;
        int i17 = i16 + i15;
        this.inputOffset = i17;
        byte[] bArr2 = this.inputBuffer;
        if (i17 > bArr2.length) {
            this.inputIsTooLong = true;
        } else {
            System.arraycopy(bArr, i14, bArr2, i16, i15);
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA public key");
        }
        if (this.inputIsTooLong) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = this.inputBuffer;
        if (length > bArr2.length) {
            throw new SignatureException("Input signature length is too large: " + bArr.length + " > " + this.inputBuffer.length);
        }
        byte[] bArr3 = new byte[bArr2.length];
        try {
            try {
                try {
                    boolean z14 = true;
                    int iRSA_public_decrypt = NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr3, openSSLKey.getNativeRef(), 1);
                    if (iRSA_public_decrypt != this.inputOffset) {
                        z14 = false;
                    }
                    for (int i14 = 0; i14 < iRSA_public_decrypt; i14++) {
                        if (this.inputBuffer[i14] != bArr3[i14]) {
                            z14 = false;
                        }
                    }
                    this.inputOffset = 0;
                    return z14;
                } catch (Throwable th3) {
                    this.inputOffset = 0;
                    throw th3;
                }
            } catch (SignatureException e4) {
                throw e4;
            } catch (Exception unused) {
                this.inputOffset = 0;
                return false;
            }
        } catch (Exception e14) {
            throw new SignatureException(e14);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b14) {
        int i14 = this.inputOffset;
        int i15 = i14 + 1;
        this.inputOffset = i15;
        byte[] bArr = this.inputBuffer;
        if (i15 > bArr.length) {
            this.inputIsTooLong = true;
        } else {
            bArr[i14] = b14;
        }
    }
}
