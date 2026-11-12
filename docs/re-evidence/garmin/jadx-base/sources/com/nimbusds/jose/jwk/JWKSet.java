package com.nimbusds.jose.jwk;

import b71.i;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.IOUtils;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class JWKSet implements Serializable {
    public static final String MIME_TYPE = "application/jwk-set+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private final Map<String, Object> customMembers;
    private final List<JWK> keys;

    public JWKSet(List<JWK> list, Map<String, Object> map) {
        Objects.requireNonNull(list, "The JWK list must not be null");
        this.keys = Collections.unmodifiableList(list);
        this.customMembers = Collections.unmodifiableMap(map);
    }

    public static JWKSet load(KeyStore keyStore, PasswordLookup passwordLookup) throws KeyStoreException {
        ECKey eCKeyLoad;
        LinkedList linkedList = new LinkedList();
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            String strNextElement = enumerationAliases.nextElement();
            char[] charArray = passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(strNextElement);
            Certificate certificate = keyStore.getCertificate(strNextElement);
            if (certificate != null) {
                if (certificate.getPublicKey() instanceof RSAPublicKey) {
                    try {
                        RSAKey rSAKeyLoad = RSAKey.load(keyStore, strNextElement, charArray);
                        if (rSAKeyLoad != null) {
                            linkedList.add(rSAKeyLoad);
                        }
                    } catch (JOSEException unused) {
                    }
                } else if ((certificate.getPublicKey() instanceof ECPublicKey) && (eCKeyLoad = ECKey.load(keyStore, strNextElement, charArray)) != null) {
                    linkedList.add(eCKeyLoad);
                }
            }
        }
        Enumeration<String> enumerationAliases2 = keyStore.aliases();
        while (enumerationAliases2.hasMoreElements()) {
            String strNextElement2 = enumerationAliases2.nextElement();
            try {
                OctetSequenceKey octetSequenceKeyLoad = OctetSequenceKey.load(keyStore, strNextElement2, passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(strNextElement2));
                if (octetSequenceKeyLoad != null) {
                    linkedList.add(octetSequenceKeyLoad);
                }
            } catch (JOSEException unused2) {
            }
        }
        return new JWKSet(linkedList);
    }

    public static JWKSet parse(Map<String, Object> map) throws ParseException {
        List<Object> jSONArray = JSONObjectUtils.getJSONArray(map, UserMetadata.KEYDATA_FILENAME);
        if (jSONArray == null) {
            p.i(0, "Missing required \"keys\" member");
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i14 = 0; i14 < jSONArray.size(); i14++) {
            try {
                linkedList.add(JWK.parse((Map<String, Object>) jSONArray.get(i14)));
            } catch (ClassCastException unused) {
                p.i(0, "The \"keys\" JSON array must contain JSON objects only");
                return null;
            } catch (ParseException e4) {
                if (e4.getMessage() == null || !e4.getMessage().startsWith("Unsupported key type")) {
                    StringBuilder sbI = i.i(i14, "Invalid JWK at position ", ": ");
                    sbI.append(e4.getMessage());
                    throw new ParseException(sbI.toString(), 0);
                }
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().equals(UserMetadata.KEYDATA_FILENAME)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return new JWKSet(linkedList, map2);
    }

    public boolean containsJWK(JWK jwk) {
        Base64URL base64URLComputeThumbprint = jwk.computeThumbprint();
        Iterator<JWK> it = getKeys().iterator();
        while (it.hasNext()) {
            if (base64URLComputeThumbprint.equals(it.next().computeThumbprint())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNonPublicKeys() {
        Iterator<JWK> it = getKeys().iterator();
        while (it.hasNext()) {
            if (it.next().isPrivate()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWKSet)) {
            return false;
        }
        JWKSet jWKSet = (JWKSet) obj;
        return getKeys().equals(jWKSet.getKeys()) && this.customMembers.equals(jWKSet.customMembers);
    }

    public JWKSet filter(JWKMatcher jWKMatcher) {
        LinkedList linkedList = new LinkedList();
        for (JWK jwk : this.keys) {
            if (jWKMatcher.matches(jwk)) {
                linkedList.add(jwk);
            }
        }
        return new JWKSet(linkedList, this.customMembers);
    }

    public Map<String, Object> getAdditionalMembers() {
        return this.customMembers;
    }

    public JWK getKeyByKeyId(String str) {
        for (JWK jwk : getKeys()) {
            if (jwk.getKeyID() != null && jwk.getKeyID().equals(str)) {
                return jwk;
            }
        }
        return null;
    }

    public List<JWK> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return Objects.hash(getKeys(), this.customMembers);
    }

    public boolean isEmpty() {
        return this.keys.isEmpty();
    }

    public int size() {
        return this.keys.size();
    }

    public Map<String, Object> toJSONObject(boolean z14) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        mapNewJSONObject.putAll(this.customMembers);
        List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
        for (JWK jwk : this.keys) {
            if (z14) {
                JWK publicJWK = jwk.toPublicJWK();
                if (publicJWK != null) {
                    listNewJSONArray.add(publicJWK.toJSONObject());
                }
            } else {
                listNewJSONArray.add(jwk.toJSONObject());
            }
        }
        mapNewJSONObject.put(UserMetadata.KEYDATA_FILENAME, listNewJSONArray);
        return mapNewJSONObject;
    }

    public JWKSet toPublicJWKSet() {
        LinkedList linkedList = new LinkedList();
        Iterator<JWK> it = this.keys.iterator();
        while (it.hasNext()) {
            JWK publicJWK = it.next().toPublicJWK();
            if (publicJWK != null) {
                linkedList.add(publicJWK);
            }
        }
        return new JWKSet(linkedList, this.customMembers);
    }

    public String toString(boolean z14) {
        return JSONObjectUtils.toJSONString(toJSONObject(z14));
    }

    public String toString() {
        return toString(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWKSet(JWK jwk) {
        this((List<JWK>) Collections.singletonList(jwk));
        Objects.requireNonNull(jwk, "The JWK must not be null");
    }

    public JWKSet(List<JWK> list) {
        this(list, Collections.EMPTY_MAP);
    }

    public JWKSet() {
        this((List<JWK>) Collections.EMPTY_LIST);
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(true);
    }

    public static JWKSet load(File file) {
        return parse(IOUtils.readFileToString(file, StandardCharset.UTF_8));
    }

    public static JWKSet load(URL url, int i14, int i15, int i16) {
        return load(url, i14, i15, i16, null);
    }

    public static JWKSet load(URL url, int i14, int i15, int i16, Proxy proxy) {
        DefaultResourceRetriever defaultResourceRetriever = new DefaultResourceRetriever(i14, i15, i16);
        defaultResourceRetriever.setProxy(proxy);
        return parse(defaultResourceRetriever.retrieveResource(url).getContent());
    }

    public static JWKSet load(URL url) {
        return load(url, 0, 0, 0);
    }

    public static JWKSet load(InputStream inputStream) {
        return parse(IOUtils.readInputStreamToString(inputStream, StandardCharset.UTF_8));
    }

    public static JWKSet parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}
