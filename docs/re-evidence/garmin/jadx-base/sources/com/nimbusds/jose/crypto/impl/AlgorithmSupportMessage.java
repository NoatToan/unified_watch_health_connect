package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmSupportMessage {
    private AlgorithmSupportMessage() {
    }

    private static String itemize(Collection collection) {
        StringBuilder sb3 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i14 = 0; i14 < array.length; i14++) {
            if (i14 != 0) {
                if (i14 < array.length - 1) {
                    sb3.append(", ");
                } else if (i14 == array.length - 1) {
                    sb3.append(" or ");
                }
            }
            sb3.append(array[i14].toString());
        }
        return sb3.toString();
    }

    public static String unsupportedEllipticCurve(Curve curve, Collection<Curve> collection) {
        return "Unsupported elliptic curve " + curve + ", must be " + itemize(collection);
    }

    public static String unsupportedEncryptionMethod(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + itemize(collection);
    }

    public static String unsupportedJWEAlgorithm(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + itemize(collection);
    }

    public static String unsupportedJWSAlgorithm(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + itemize(collection);
    }
}
