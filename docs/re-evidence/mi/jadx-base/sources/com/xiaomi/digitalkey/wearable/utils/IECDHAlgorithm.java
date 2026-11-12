package com.xiaomi.digitalkey.wearable.utils;

import java.io.IOException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes7.dex */
public interface IECDHAlgorithm {
    public static final String ALGORITHM_ECDH = "ECDH";
    public static final String KEY_STORE = "AndroidKeyStore";

    byte[] generateSharedSecret(PublicKey publicKey) throws IOException;

    ECPublicKey getPublicKey() throws IOException;
}
