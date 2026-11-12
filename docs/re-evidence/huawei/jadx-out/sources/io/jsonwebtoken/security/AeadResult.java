package io.jsonwebtoken.security;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes46.dex */
public interface AeadResult {
    OutputStream getOutputStream();

    AeadResult setIv(byte[] bArr);

    AeadResult setTag(byte[] bArr);
}
