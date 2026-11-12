package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64URL;
import defpackage.evc;
import defpackage.kpd;
import defpackage.npd;
import defpackage.olh;
import defpackage.qw5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public class JWKSet implements Serializable {
    public static final String MIME_TYPE = "application/jwk-set+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private final Map<String, Object> customMembers;
    private final List<JWK> keys;

    public JWKSet() {
        this((List<JWK>) Collections.emptyList());
    }

    public static JWKSet load(InputStream inputStream) throws IOException, ParseException {
        return parse(evc.b(inputStream, StandardCharsets.UTF_8));
    }

    public static JWKSet parse(String str) throws ParseException {
        return parse(npd.m(str));
    }

    public boolean containsJWK(JWK jwk) throws JOSEException {
        Base64URL base64URLComputeThumbprint = jwk.computeThumbprint();
        Iterator<JWK> it = getKeys().iterator();
        while (it.hasNext()) {
            if (base64URLComputeThumbprint.equals(it.next().computeThumbprint())) {
                return true;
            }
        }
        return false;
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

    public Map<String, Object> toJSONObject() {
        return toJSONObject(true);
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

    public String toString(boolean z) {
        return npd.n(toJSONObject(z));
    }

    public JWKSet(JWK jwk) {
        this((List<JWK>) Collections.singletonList(jwk));
        if (jwk == null) {
            throw new IllegalArgumentException("The JWK must not be null");
        }
    }

    public static JWKSet load(File file) throws IOException, ParseException {
        return parse(evc.a(file, StandardCharsets.UTF_8));
    }

    public static JWKSet parse(Map<String, Object> map) throws ParseException {
        List<Object> listE = npd.e(map, "keys");
        if (listE == null) {
            throw new ParseException("Missing required \"keys\" member", 0);
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < listE.size(); i++) {
            try {
                linkedList.add(JWK.parse((Map<String, Object>) listE.get(i)));
            } catch (ClassCastException unused) {
                throw new ParseException("The \"keys\" JSON array must contain JSON objects only", 0);
            } catch (ParseException e) {
                if (e.getMessage() == null || !e.getMessage().startsWith("Unsupported key type")) {
                    throw new ParseException("Invalid JWK at position " + i + ": " + e.getMessage(), 0);
                }
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().equals("keys")) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return new JWKSet(linkedList, map2);
    }

    public Map<String, Object> toJSONObject(boolean z) {
        Map<String, Object> mapL = npd.l();
        mapL.putAll(this.customMembers);
        List<Object> listA = kpd.a();
        for (JWK jwk : this.keys) {
            if (z) {
                JWK publicJWK = jwk.toPublicJWK();
                if (publicJWK != null) {
                    listA.add(publicJWK.toJSONObject());
                }
            } else {
                listA.add(jwk.toJSONObject());
            }
        }
        mapL.put("keys", listA);
        return mapL;
    }

    public String toString() {
        return toString(true);
    }

    public static JWKSet load(URL url, int i, int i2, int i3) throws IOException, ParseException {
        return load(url, i, i2, i3, null);
    }

    public JWKSet(List<JWK> list) {
        this(list, Collections.emptyMap());
    }

    public static JWKSet load(URL url, int i, int i2, int i3, Proxy proxy) throws IOException, ParseException {
        qw5 qw5Var = new qw5(i, i2, i3);
        qw5Var.k(proxy);
        return parse(qw5Var.j(url).a());
    }

    public JWKSet(List<JWK> list, Map<String, Object> map) {
        if (list != null) {
            this.keys = Collections.unmodifiableList(list);
            this.customMembers = Collections.unmodifiableMap(map);
            return;
        }
        throw new IllegalArgumentException("The JWK list must not be null");
    }

    public static JWKSet load(URL url) throws IOException, ParseException {
        return load(url, 0, 0, 0);
    }

    public static JWKSet load(KeyStore keyStore, olh olhVar) throws KeyStoreException {
        ECKey eCKeyLoad;
        LinkedList linkedList = new LinkedList();
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            String strNextElement = enumerationAliases.nextElement();
            char[] charArray = olhVar == null ? "".toCharArray() : olhVar.a(strNextElement);
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
                OctetSequenceKey octetSequenceKeyLoad = OctetSequenceKey.load(keyStore, strNextElement2, olhVar == null ? "".toCharArray() : olhVar.a(strNextElement2));
                if (octetSequenceKeyLoad != null) {
                    linkedList.add(octetSequenceKeyLoad);
                }
            } catch (JOSEException unused2) {
            }
        }
        return new JWKSet(linkedList);
    }
}
