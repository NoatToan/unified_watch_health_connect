package com.nimbusds.jose;

import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import com.nimbusds.jwt.SignedJWT;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Map;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class Payload implements Serializable {
    private static final long serialVersionUID = 1;
    private final Base64URL base64URL;
    private final byte[] bytes;
    private final Map<String, Object> jsonObject;
    private final JWSObject jwsObject;
    private final Origin origin;
    private final SignedJWT signedJWT;
    private final String string;

    public enum Origin {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public Payload(JWSObject jWSObject) {
        if (jWSObject.getState() == JWSObject.State.UNSIGNED) {
            h.s("The JWS object must be signed");
            throw null;
        }
        this.jsonObject = null;
        this.string = null;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = jWSObject;
        this.signedJWT = null;
        this.origin = Origin.JWS_OBJECT;
    }

    private static String byteArrayToString(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, StandardCharset.UTF_8);
        }
        return null;
    }

    private static byte[] stringToByteArray(String str) {
        if (str != null) {
            return str.getBytes(StandardCharset.UTF_8);
        }
        return null;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public Base64URL toBase64URL() {
        Base64URL base64URL = this.base64URL;
        return base64URL != null ? base64URL : Base64URL.encode(toBytes());
    }

    public byte[] toBytes() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return bArr;
        }
        Base64URL base64URL = this.base64URL;
        return base64URL != null ? base64URL.decode() : stringToByteArray(toString());
    }

    public Map<String, Object> toJSONObject() {
        Map<String, Object> map = this.jsonObject;
        if (map != null) {
            return map;
        }
        String string = toString();
        if (string == null) {
            return null;
        }
        try {
            return JSONObjectUtils.parse(string);
        } catch (ParseException unused) {
            return null;
        }
    }

    public JWSObject toJWSObject() {
        JWSObject jWSObject = this.jwsObject;
        if (jWSObject != null) {
            return jWSObject;
        }
        try {
            return JWSObject.parse(toString());
        } catch (ParseException unused) {
            return null;
        }
    }

    public SignedJWT toSignedJWT() {
        SignedJWT signedJWT = this.signedJWT;
        if (signedJWT != null) {
            return signedJWT;
        }
        try {
            return SignedJWT.parse(toString());
        } catch (ParseException unused) {
            return null;
        }
    }

    public String toString() {
        String str = this.string;
        if (str != null) {
            return str;
        }
        JWSObject jWSObject = this.jwsObject;
        if (jWSObject != null) {
            String parsedString = jWSObject.getParsedString();
            JWSObject jWSObject2 = this.jwsObject;
            return parsedString != null ? jWSObject2.getParsedString() : jWSObject2.serialize();
        }
        Map<String, Object> map = this.jsonObject;
        if (map != null) {
            return JSONObjectUtils.toJSONString(map);
        }
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return byteArrayToString(bArr);
        }
        Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return base64URL.decodeToString();
        }
        return null;
    }

    public <T> T toType(PayloadTransformer<T> payloadTransformer) {
        return payloadTransformer.transform(this);
    }

    public Payload(String str) {
        this.jsonObject = null;
        Objects.requireNonNull(str, "The string must not be null");
        this.string = str;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = Origin.STRING;
    }

    public Payload(byte[] bArr) {
        this.jsonObject = null;
        this.string = null;
        Objects.requireNonNull(bArr, "The byte array must not be null");
        this.bytes = bArr;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = Origin.BYTE_ARRAY;
    }

    public Payload(Base64URL base64URL) {
        this.jsonObject = null;
        this.string = null;
        this.bytes = null;
        Objects.requireNonNull(base64URL, "The Base64URL-encoded object must not be null");
        this.base64URL = base64URL;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = Origin.BASE64URL;
    }

    public Payload(Map<String, Object> map) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        this.jsonObject = mapNewJSONObject;
        Objects.requireNonNull(map, "The JSON object must not be null");
        mapNewJSONObject.putAll(map);
        this.string = null;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = Origin.JSON;
    }

    public Payload(SignedJWT signedJWT) {
        if (signedJWT.getState() != JWSObject.State.UNSIGNED) {
            this.jsonObject = null;
            this.string = null;
            this.bytes = null;
            this.base64URL = null;
            this.signedJWT = signedJWT;
            this.jwsObject = signedJWT;
            this.origin = Origin.SIGNED_JWT;
            return;
        }
        h.s("The JWT must be signed");
        throw null;
    }
}
