package com.nimbusds.jose.jwk;

import com.miui.circulate.device.api.Constant;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.IntegerOverflowException;
import defpackage.jqd;
import defpackage.npd;
import defpackage.y73;
import java.net.URI;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class OctetSequenceKey extends JWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Base64URL f10422k;

    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OCT, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (base64URL == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.f10422k = base64URL;
    }

    public static OctetSequenceKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof SecretKey) {
                return new a((SecretKey) key).b(str).c(keyStore).a();
            }
            return null;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new JOSEException("Couldn't retrieve secret key (bad pin?): " + e.getMessage(), e);
        }
    }

    public static OctetSequenceKey parse(String str) throws ParseException {
        return parse(npd.m(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.f10422k, ((OctetSequenceKey) obj).f10422k);
        }
        return false;
    }

    public Base64URL getKeyValue() {
        return this.f10422k;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(Constant.KeyValue.KEY_COLUMN, this.f10422k.toString());
        linkedHashMap.put("kty", getKeyType().toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10422k);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return y73.e(this.f10422k.decode());
        } catch (IntegerOverflowException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }

    public byte[] toByteArray() {
        return getKeyValue().decode();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put(Constant.KeyValue.KEY_COLUMN, this.f10422k.toString());
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetSequenceKey toPublicJWK() {
        return null;
    }

    public SecretKey toSecretKey() {
        return toSecretKey("NONE");
    }

    public static OctetSequenceKey parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.OCT.equals(jqd.d(map))) {
            throw new ParseException("The key type \"kty\" must be oct", 0);
        }
        try {
            return new OctetSequenceKey(npd.a(map, Constant.KeyValue.KEY_COLUMN), jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), null);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public SecretKey toSecretKey(String str) {
        return new SecretKeySpec(toByteArray(), str);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Base64URL f10423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public KeyUse f10424b;
        public Set<KeyOperation> c;
        public Algorithm d;
        public String e;
        public URI f;

        @Deprecated
        public Base64URL g;
        public Base64URL h;
        public List<Base64> i;
        public KeyStore j;

        public a(Base64URL base64URL) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The key value must not be null");
            }
            this.f10423a = base64URL;
        }

        public OctetSequenceKey a() {
            try {
                return new OctetSequenceKey(this.f10423a, this.f10424b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        public a b(String str) {
            this.e = str;
            return this;
        }

        public a c(KeyStore keyStore) {
            this.j = keyStore;
            return this;
        }

        public a(byte[] bArr) {
            this(Base64URL.encode(bArr));
            if (bArr.length == 0) {
                throw new IllegalArgumentException("The key must have a positive length");
            }
        }

        public a(SecretKey secretKey) {
            this(secretKey.getEncoded());
        }
    }
}
