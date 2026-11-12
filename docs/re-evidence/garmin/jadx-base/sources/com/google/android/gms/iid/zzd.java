package com.google.android.gms.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzd {
    public static KeyPair zzl() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e4) {
            h.q(e4);
            return null;
        }
    }
}
