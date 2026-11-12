package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.jqd;
import defpackage.npd;
import defpackage.y73;
import java.net.URI;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public class OctetKeyPair extends JWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448)));
    private static final long serialVersionUID = 1;
    private final Curve crv;
    private final Base64URL d;
    private final byte[] decodedD;
    private final byte[] decodedX;
    private final Base64URL x;

    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.x = base64URL;
        this.decodedX = base64URL.decode();
        this.d = null;
        this.decodedD = null;
    }

    public static OctetKeyPair parse(String str) throws ParseException {
        return parse(npd.m(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        return Objects.equals(this.crv, octetKeyPair.crv) && Objects.equals(this.x, octetKeyPair.x) && Arrays.equals(this.decodedX, octetKeyPair.decodedX) && Objects.equals(this.d, octetKeyPair.d) && Arrays.equals(this.decodedD, octetKeyPair.decodedD);
    }

    public Curve getCurve() {
        return this.crv;
    }

    public Base64URL getD() {
        return this.d;
    }

    public byte[] getDecodedD() {
        byte[] bArr = this.decodedD;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public byte[] getDecodedX() {
        return (byte[]) this.decodedX.clone();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.x.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.x;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.d) * 31) + Arrays.hashCode(this.decodedX)) * 31) + Arrays.hashCode(this.decodedD);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return this.d != null;
    }

    public boolean matches(X509Certificate x509Certificate) {
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        return y73.b(this.x.decode());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put(PluginDeviceInfo.FICONOFF, base64URL.toString());
        }
        return jSONObject;
    }

    public KeyPair toKeyPair() throws JOSEException {
        throw new JOSEException("Export to java.security.KeyPair not supported");
    }

    public PrivateKey toPrivateKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PrivateKey not supported");
    }

    public PublicKey toPublicKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PublicKey not supported");
    }

    public static OctetKeyPair parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.OKP.equals(jqd.d(map))) {
            throw new ParseException("The key type \"kty\" must be OKP", 0);
        }
        try {
            Curve curve = Curve.parse(npd.h(map, "crv"));
            Base64URL base64URLA = npd.a(map, "x");
            Base64URL base64URLA2 = npd.a(map, PluginDeviceInfo.FICONOFF);
            try {
                return base64URLA2 == null ? new OctetKeyPair(curve, base64URLA, jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), null) : new OctetKeyPair(curve, base64URLA, base64URLA2, jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetKeyPair toPublicJWK() {
        return new OctetKeyPair(getCurve(), getX(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve != null) {
            if (SUPPORTED_CURVES.contains(curve)) {
                this.crv = curve;
                if (base64URL != null) {
                    this.x = base64URL;
                    this.decodedX = base64URL.decode();
                    if (base64URL2 != null) {
                        this.d = base64URL2;
                        this.decodedD = base64URL2.decode();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
