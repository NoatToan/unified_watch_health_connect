package io.jsonwebtoken.security;

import defpackage.yyf;
import io.jsonwebtoken.Identifiable;
import java.security.Key;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes46.dex */
public interface KeyAlgorithm<E extends Key, D extends Key> extends Identifiable {
    SecretKey getDecryptionKey(DecryptionKeyRequest<D> decryptionKeyRequest) throws yyf;

    KeyResult getEncryptionKey(KeyRequest<E> keyRequest) throws yyf;
}
