package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public interface DeterministicAead {
    byte[] decryptDeterministically(byte[] bArr, byte[] bArr2);

    byte[] encryptDeterministically(byte[] bArr, byte[] bArr2);
}
