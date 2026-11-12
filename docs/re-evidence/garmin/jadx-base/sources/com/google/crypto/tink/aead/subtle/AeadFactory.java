package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public interface AeadFactory {
    Aead createAead(byte[] bArr);

    int getKeySizeInBytes();
}
