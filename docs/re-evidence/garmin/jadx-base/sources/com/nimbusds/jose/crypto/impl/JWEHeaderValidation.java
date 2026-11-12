package com.nimbusds.jose.crypto.impl;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;

/* JADX INFO: loaded from: classes3.dex */
public class JWEHeaderValidation {
    private JWEHeaderValidation() {
    }

    public static JWEAlgorithm getAlgorithmAndEnsureNotNull(JWEHeader jWEHeader) throws JOSEException {
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (algorithm != null) {
            return algorithm;
        }
        p.p("The algorithm \"alg\" header parameter must not be null");
        return null;
    }
}
