package io.jsonwebtoken.security;

import defpackage.yyf;
import io.jsonwebtoken.Identifiable;
import java.io.OutputStream;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes46.dex */
public interface AeadAlgorithm extends Identifiable, KeyLengthSupplier, KeyBuilderSupplier<SecretKey, SecretKeyBuilder> {
    void decrypt(DecryptAeadRequest decryptAeadRequest, OutputStream outputStream) throws yyf;

    void encrypt(AeadRequest aeadRequest, AeadResult aeadResult) throws yyf;
}
