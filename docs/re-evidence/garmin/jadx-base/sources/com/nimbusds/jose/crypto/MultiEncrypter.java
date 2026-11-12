package com.nimbusds.jose.crypto;

import com.google.firebase.messaging.l;
import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.UnprotectedHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
import com.nimbusds.jose.crypto.impl.JWEHeaderValidation;
import com.nimbusds.jose.crypto.impl.MultiCryptoProvider;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class MultiEncrypter extends MultiCryptoProvider implements JWEEncrypter {
    private static final String[] RECIPIENT_HEADER_PARAMS = {"kid", "alg", "x5u", "x5t", "x5t#S256", "x5c"};
    private final JWKSet keys;

    public MultiEncrypter(JWKSet jWKSet, SecretKey secretKey) {
        super(secretKey);
        for (JWK jwk : jWKSet.getKeys()) {
            KeyType keyType = jwk.getKeyType();
            if (jwk.getAlgorithm() == null) {
                h.s("Each JWK must specify a key encryption algorithm");
                throw null;
            }
            JWEAlgorithm jWEAlgorithm = JWEAlgorithm.parse(jwk.getAlgorithm().toString());
            if (JWEAlgorithm.DIR.equals(jWEAlgorithm) && KeyType.OCT.equals(keyType) && !jwk.toOctetSequenceKey().toSecretKey("AES").equals(secretKey)) {
                h.s("Bad CEK");
                throw null;
            }
            if (!KeyType.RSA.equals(keyType) || !RSACryptoProvider.SUPPORTED_ALGORITHMS.contains(jWEAlgorithm)) {
                if (!KeyType.EC.equals(keyType) || !ECDHCryptoProvider.SUPPORTED_ALGORITHMS.contains(jWEAlgorithm)) {
                    KeyType keyType2 = KeyType.OCT;
                    if (!keyType2.equals(keyType) || !AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(jWEAlgorithm)) {
                        if (!keyType2.equals(keyType) || !DirectCryptoProvider.SUPPORTED_ALGORITHMS.contains(jWEAlgorithm)) {
                            if (!KeyType.OKP.equals(keyType) || !ECDHCryptoProvider.SUPPORTED_ALGORITHMS.contains(jWEAlgorithm)) {
                                l.j(jWEAlgorithm, "Unsupported key encryption algorithm: ");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        this.keys = jWKSet;
    }

    private static SecretKey findDirectCEK(JWKSet jWKSet) {
        if (jWKSet == null) {
            return null;
        }
        for (JWK jwk : jWKSet.getKeys()) {
            if (JWEAlgorithm.DIR.equals(jwk.getAlgorithm()) && KeyType.OCT.equals(jwk.getKeyType())) {
                return jwk.toOctetSequenceKey().toSecretKey("AES");
            }
        }
        return null;
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws JOSEException {
        JWEEncrypter x25519Encrypter;
        if (bArr2 == null) {
            p.p("Missing JWE additional authenticated data (AAD)");
            return null;
        }
        SecretKey cek = getCEK(jWEHeader.getEncryptionMethod());
        Payload payload = new Payload(bArr);
        List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
        Base64URL base64URLEncode = null;
        Base64URL base64URL = null;
        Base64URL base64URL2 = null;
        Base64URL authenticationTag = null;
        for (JWK jwk : this.keys.getKeys()) {
            KeyType keyType = jwk.getKeyType();
            Map<String, Object> jSONObject = jwk.toJSONObject();
            UnprotectedHeader.Builder builder = new UnprotectedHeader.Builder();
            String[] strArr = RECIPIENT_HEADER_PARAMS;
            int length = strArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                String str = strArr[i15];
                if (jSONObject.containsKey(str)) {
                    builder.param(str, jSONObject.get(str));
                }
                i14 = i15 + 1;
                payload = payload;
            }
            Payload payload2 = payload;
            try {
                JWEHeader jWEHeader2 = (JWEHeader) jWEHeader.join(builder.build());
                JWEAlgorithm algorithmAndEnsureNotNull = JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader2);
                if (KeyType.RSA.equals(keyType) && RSACryptoProvider.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new RSAEncrypter(jwk.toRSAKey().toRSAPublicKey(), cek);
                } else if (KeyType.EC.equals(keyType) && ECDHCryptoProvider.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new ECDHEncrypter(jwk.toECKey().toECPublicKey(), cek);
                } else {
                    KeyType keyType2 = KeyType.OCT;
                    if (keyType2.equals(keyType) && AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                        x25519Encrypter = new AESEncrypter(jwk.toOctetSequenceKey().toSecretKey("AES"), cek);
                    } else if (keyType2.equals(keyType) && DirectCryptoProvider.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                        x25519Encrypter = new DirectEncrypter(jwk.toOctetSequenceKey().toSecretKey("AES"));
                    } else if (KeyType.OKP.equals(keyType) && ECDHCryptoProvider.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                        x25519Encrypter = new X25519Encrypter(jwk.toOctetKeyPair().toPublicJWK(), cek);
                    } else {
                        payload = payload2;
                    }
                }
                JWECryptoParts jWECryptoPartsEncrypt = x25519Encrypter.encrypt(jWEHeader2, payload2.toBytes(), bArr2);
                Map<String, Object> jSONObject2 = jWECryptoPartsEncrypt.getHeader().toJSONObject();
                Iterator<String> it = jWEHeader.getIncludedParams().iterator();
                while (it.hasNext()) {
                    jSONObject2.remove(it.next());
                }
                Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
                mapNewJSONObject.put("header", jSONObject2);
                if (!JWEAlgorithm.DIR.equals(algorithmAndEnsureNotNull)) {
                    mapNewJSONObject.put("encrypted_key", jWECryptoPartsEncrypt.getEncryptedKey().toString());
                }
                listNewJSONArray.add(mapNewJSONObject);
                if (listNewJSONArray.size() == 1) {
                    payload = new Payload("");
                    base64URLEncode = jWECryptoPartsEncrypt.getEncryptedKey();
                    Base64URL initializationVector = jWECryptoPartsEncrypt.getInitializationVector();
                    Base64URL cipherText = jWECryptoPartsEncrypt.getCipherText();
                    authenticationTag = jWECryptoPartsEncrypt.getAuthenticationTag();
                    base64URL = initializationVector;
                    base64URL2 = cipherText;
                } else {
                    payload = payload2;
                }
            } catch (Exception e4) {
                throw new JOSEException(e4.getMessage(), e4);
            }
        }
        if (listNewJSONArray.size() > 1) {
            Map<String, Object> mapNewJSONObject2 = JSONObjectUtils.newJSONObject();
            mapNewJSONObject2.put("recipients", listNewJSONArray);
            base64URLEncode = Base64URL.encode(JSONObjectUtils.toJSONString(mapNewJSONObject2));
        }
        return new JWECryptoParts(jWEHeader, base64URLEncode, base64URL, base64URL2, authenticationTag);
    }

    public MultiEncrypter(JWKSet jWKSet) {
        this(jWKSet, findDirectCEK(jWKSet));
    }

    @Deprecated
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) {
        return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader));
    }
}
