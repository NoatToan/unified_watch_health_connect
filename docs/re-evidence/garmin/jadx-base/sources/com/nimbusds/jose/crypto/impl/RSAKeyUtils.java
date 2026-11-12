package com.nimbusds.jose.crypto.impl;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.RSAKey;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyUtils {
    public static int keyBitLength(PrivateKey privateKey) {
        if (!(privateKey instanceof RSAPrivateKey)) {
            return -1;
        }
        try {
            return ((RSAPrivateKey) privateKey).getModulus().bitLength();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static PrivateKey toRSAPrivateKey(RSAKey rSAKey) throws JOSEException {
        if (rSAKey.isPrivate()) {
            return rSAKey.toPrivateKey();
        }
        p.p("The RSA JWK doesn't contain a private part");
        return null;
    }
}
