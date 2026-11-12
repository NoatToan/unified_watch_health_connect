package com.nimbusds.jose.crypto.utils;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes3.dex */
public class ECChecks {
    private ECChecks() {
    }

    public static boolean isPointOnCurve(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a14 = curve.getA();
        BigInteger b14 = curve.getB();
        BigInteger p14 = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p14).equals(bigInteger.pow(3).add(a14.multiply(bigInteger)).add(b14).mod(p14));
    }

    public static boolean isPointOnCurve(ECPublicKey eCPublicKey, ECParameterSpec eCParameterSpec) {
        ECPoint w14 = eCPublicKey.getW();
        return isPointOnCurve(w14.getAffineX(), w14.getAffineY(), eCParameterSpec);
    }

    public static boolean isPointOnCurve(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        return isPointOnCurve(eCPublicKey, eCPrivateKey.getParams());
    }
}
