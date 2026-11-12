package com.nimbusds.jose;

import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.text.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JOSEObject implements Serializable {
    public static final String MIME_TYPE_COMPACT = "application/jose; charset=UTF-8";

    @Deprecated
    public static final String MIME_TYPE_JS = "application/jose+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private Base64URL[] parsedParts;
    private Payload payload;

    public JOSEObject() {
        this.payload = null;
        this.parsedParts = null;
    }

    public static JOSEObject parse(String str) throws ParseException {
        try {
            Algorithm algorithm = Header.parseAlgorithm(JSONObjectUtils.parse(split(str)[0].decodeToString()));
            if (algorithm.equals(Algorithm.NONE)) {
                return PlainObject.parse(str);
            }
            if (algorithm instanceof JWSAlgorithm) {
                return JWSObject.parse(str);
            }
            if (algorithm instanceof JWEAlgorithm) {
                return JWEObject.parse(str);
            }
            a.y(algorithm, "Unexpected algorithm type: ");
            return null;
        } catch (ParseException e4) {
            a.A(e4.getMessage(), "Invalid unsecured/JWS/JWE header: ");
            return null;
        }
    }

    public static Base64URL[] split(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(".");
        if (iIndexOf == -1) {
            p.i(0, "Invalid serialized unsecured/JWS/JWE object: Missing part delimiters");
            return null;
        }
        int i14 = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(".", i14);
        if (iIndexOf2 == -1) {
            p.i(0, "Invalid serialized unsecured/JWS/JWE object: Missing second delimiter");
            return null;
        }
        int i15 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(".", i15);
        if (iIndexOf3 == -1) {
            return new Base64URL[]{new Base64URL(strTrim.substring(0, iIndexOf)), new Base64URL(strTrim.substring(i14, iIndexOf2)), new Base64URL(strTrim.substring(i15))};
        }
        int i16 = iIndexOf3 + 1;
        int iIndexOf4 = strTrim.indexOf(".", i16);
        if (iIndexOf4 == -1) {
            p.i(0, "Invalid serialized JWE object: Missing fourth delimiter");
            return null;
        }
        if (iIndexOf4 == -1 || strTrim.indexOf(".", iIndexOf4 + 1) == -1) {
            return new Base64URL[]{new Base64URL(strTrim.substring(0, iIndexOf)), new Base64URL(strTrim.substring(i14, iIndexOf2)), new Base64URL(strTrim.substring(i15, iIndexOf3)), new Base64URL(strTrim.substring(i16, iIndexOf4)), new Base64URL(strTrim.substring(iIndexOf4 + 1))};
        }
        p.i(0, "Invalid serialized unsecured/JWS/JWE object: Too many part delimiters");
        return null;
    }

    public abstract Header getHeader();

    public Base64URL[] getParsedParts() {
        return this.parsedParts;
    }

    public String getParsedString() {
        if (this.parsedParts == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        for (Base64URL base64URL : this.parsedParts) {
            if (sb3.length() > 0) {
                sb3.append('.');
            }
            if (base64URL != null) {
                sb3.append(base64URL);
            }
        }
        return sb3.toString();
    }

    public Payload getPayload() {
        return this.payload;
    }

    public abstract String serialize();

    public void setParsedParts(Base64URL... base64URLArr) {
        this.parsedParts = base64URLArr;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public JOSEObject(Payload payload) {
        this.payload = payload;
    }
}
