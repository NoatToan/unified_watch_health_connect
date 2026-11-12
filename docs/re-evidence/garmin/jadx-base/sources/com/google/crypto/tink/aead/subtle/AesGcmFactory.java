package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import tn.k;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class AesGcmFactory implements AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int i14) {
        this.keySizeInBytes = validateAesKeySize(i14);
    }

    private static int validateAesKeySize(int i14) throws InvalidAlgorithmParameterException {
        if (i14 == 16 || i14 == 32) {
            return i14;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", Integer.valueOf(i14)));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public Aead createAead(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == getKeySizeInBytes()) {
            return new AesGcmJce(bArr);
        }
        throw new GeneralSecurityException(k.e(getKeySizeInBytes(), bArr.length, "Symmetric key has incorrect length; expected ", ", but got "));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
        return this.keySizeInBytes;
    }
}
