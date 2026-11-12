package com.nimbusds.jwt;

import com.mapbox.maps.p;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.Header;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.text.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public final class JWTParser {
    private JWTParser() {
    }

    public static JWT parse(String str) throws ParseException {
        int iIndexOf = str.indexOf(".");
        if (iIndexOf == -1) {
            p.i(0, "Invalid JWT serialization: Missing dot delimiter(s)");
            return null;
        }
        try {
            Algorithm algorithm = Header.parseAlgorithm(JSONObjectUtils.parse(new Base64URL(str.substring(0, iIndexOf)).decodeToString()));
            if (algorithm.equals(Algorithm.NONE)) {
                return PlainJWT.parse(str);
            }
            if (algorithm instanceof JWSAlgorithm) {
                return SignedJWT.parse(str);
            }
            if (algorithm instanceof JWEAlgorithm) {
                return EncryptedJWT.parse(str);
            }
            a.y(algorithm, "Unexpected algorithm type: ");
            return null;
        } catch (ParseException e4) {
            a.A(e4.getMessage(), "Invalid unsecured/JWS/JWE header: ");
            return null;
        }
    }
}
