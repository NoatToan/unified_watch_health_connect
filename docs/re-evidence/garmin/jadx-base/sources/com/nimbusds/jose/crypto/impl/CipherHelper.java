package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class CipherHelper {
    public static Cipher getInstance(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
