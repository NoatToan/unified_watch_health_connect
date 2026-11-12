package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] bArr);

    byte[] wrap(byte[] bArr);
}
