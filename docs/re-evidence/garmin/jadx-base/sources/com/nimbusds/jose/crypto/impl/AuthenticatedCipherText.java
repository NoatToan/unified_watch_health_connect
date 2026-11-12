package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.shaded.jcip.Immutable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class AuthenticatedCipherText {
    private final byte[] authenticationTag;
    private final byte[] cipherText;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr);
        this.cipherText = bArr;
        Objects.requireNonNull(bArr2);
        this.authenticationTag = bArr2;
    }

    public byte[] getAuthenticationTag() {
        return this.authenticationTag;
    }

    public byte[] getCipherText() {
        return this.cipherText;
    }
}
