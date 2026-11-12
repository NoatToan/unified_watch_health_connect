package com.nimbusds.jose.util;

import b71.i;
import com.mapbox.maps.p;
import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMParser;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertChainUtils {
    private X509CertChainUtils() {
    }

    public static List<X509Certificate> parse(List<Base64> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (list.get(i14) != null) {
                try {
                    linkedList.add(X509CertUtils.parseWithException(list.get(i14).decode()));
                } catch (CertificateException e4) {
                    StringBuilder sbI = i.i(i14, "Invalid X.509 certificate at position ", ": ");
                    sbI.append(e4.getMessage());
                    throw new ParseException(sbI.toString(), 0);
                }
            }
        }
        return linkedList;
    }

    public static List<UUID> store(KeyStore keyStore, List<X509Certificate> list) throws KeyStoreException {
        LinkedList linkedList = new LinkedList();
        for (X509Certificate x509Certificate : list) {
            UUID uuidRandomUUID = UUID.randomUUID();
            keyStore.setCertificateEntry(uuidRandomUUID.toString(), x509Certificate);
            linkedList.add(uuidRandomUUID);
        }
        return linkedList;
    }

    public static List<Base64> toBase64List(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object obj = list.get(i14);
            if (obj == null) {
                p.i(0, e0.f(i14, "The X.509 certificate at position ", " must not be null"));
                return null;
            }
            if (!(obj instanceof String)) {
                p.i(0, e0.f(i14, "The X.509 certificate at position ", " must be encoded as a Base64 string"));
                return null;
            }
            linkedList.add(new Base64((String) obj));
        }
        return linkedList;
    }

    public static List<X509Certificate> parse(File file) {
        return parse(new String(Files.readAllBytes(file.toPath()), StandardCharset.UTF_8));
    }

    public static List<X509Certificate> parse(String str) {
        Object object;
        PEMParser pEMParser = new PEMParser(new StringReader(str));
        LinkedList linkedList = new LinkedList();
        do {
            object = pEMParser.readObject();
            if (object instanceof X509CertificateHolder) {
                linkedList.add(X509CertUtils.parseWithException(((X509CertificateHolder) object).getEncoded()));
            }
        } while (object != null);
        return linkedList;
    }
}
