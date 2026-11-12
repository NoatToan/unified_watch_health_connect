package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.PublicKeyVerify;
import java.security.GeneralSecurityException;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Ed25519Verify implements PublicKeyVerify {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final ImmutableByteArray publicKey;

    public Ed25519Verify(byte[] bArr) {
        if (bArr.length == 32) {
            this.publicKey = ImmutableByteArray.of(bArr);
        } else {
            h.s("Given public key's length is not 32.");
            throw null;
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            a.t("The length of the signature is not 64.");
        } else {
            if (Ed25519.verify(bArr2, bArr, this.publicKey.getBytes())) {
                return;
            }
            a.t("Signature check failed.");
        }
    }
}
