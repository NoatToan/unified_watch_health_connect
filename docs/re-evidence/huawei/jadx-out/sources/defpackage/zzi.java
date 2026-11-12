package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54813c = aaex.a((Class<?>) zzi.class);
    private static final Pattern e = Pattern.compile("\\s{2,}");

    public static boolean e(X509Certificate x509Certificate, boolean z) {
        if (x509Certificate.getKeyUsage() != null && !x509Certificate.getKeyUsage()[0]) {
            f54813c.debug("certificate: {}, not for signing!", x509Certificate.getSubjectX500Principal());
            return false;
        }
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage != null && !extendedKeyUsage.isEmpty()) {
                f54813c.trace("certificate: {}", x509Certificate.getSubjectX500Principal());
                String str = z ? "1.3.6.1.5.5.7.3.2" : "1.3.6.1.5.5.7.3.1";
                boolean z2 = false;
                for (String str2 : extendedKeyUsage) {
                    f54813c.trace("   extkeyusage {}", str2);
                    if (str.equals(str2)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    f54813c.debug("certificate: {}, not for {}!", x509Certificate.getSubjectX500Principal(), z ? "client" : "server");
                    return false;
                }
            } else {
                f54813c.debug("certificate: {}, no extkeyusage!", x509Certificate.getSubjectX500Principal());
            }
        } catch (CertificateParsingException e2) {
            f54813c.warn("x509 certificate:", (Throwable) e2);
        }
        return true;
    }

    public static CertPath a(List<X509Certificate> list, int i) {
        if (list == null) {
            throw new NullPointerException("Certificate chain must not be null!");
        }
        if (i > list.size()) {
            throw new IllegalArgumentException("size must not be larger then certificate chain!");
        }
        try {
            if (!list.isEmpty()) {
                int size = list.size() - 1;
                X500Principal issuerX500Principal = null;
                for (int i2 = 0; i2 <= size; i2++) {
                    X509Certificate x509Certificate = list.get(i2);
                    Logger logger = f54813c;
                    logger.debug("Current Subject DN: {}", x509Certificate.getSubjectX500Principal().getName());
                    if (issuerX500Principal != null && !issuerX500Principal.equals(x509Certificate.getSubjectX500Principal())) {
                        logger.debug("Actual Issuer DN: {}", x509Certificate.getSubjectX500Principal().getName());
                        throw new IllegalArgumentException("Given certificates do not form a chain");
                    }
                    issuerX500Principal = x509Certificate.getIssuerX500Principal();
                    logger.debug("Expected Issuer DN: {}", issuerX500Principal.getName());
                    if (issuerX500Principal.equals(x509Certificate.getSubjectX500Principal()) && i2 != size) {
                        throw new IllegalArgumentException("Given certificates do not form a chain, root is not the last!");
                    }
                }
                if (i < list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i; i3++) {
                        arrayList.add(list.get(i3));
                    }
                    list = arrayList;
                }
            }
            return CertificateFactory.getInstance("X.509").generateCertPath(list);
        } catch (CertificateException e2) {
            throw new IllegalArgumentException("could not create X.509 certificate factory", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    public static CertPath c(List<X509Certificate> list, List<X500Principal> list2) {
        int i;
        if (list == null) {
            throw new NullPointerException("Certificate chain must not be null!");
        }
        int size = list.size();
        if (size > 0) {
            if (list2 == null || list2.isEmpty()) {
                i = size;
            } else {
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (list2.contains(list.get(i2).getIssuerX500Principal())) {
                        i = i2 + 1;
                        break;
                    }
                }
            }
            if (size <= 1 || i != size) {
                size = i;
            } else {
                size--;
                X509Certificate x509Certificate = list.get(size);
                if (!x509Certificate.getIssuerX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
                    size = i;
                }
            }
        }
        return a(list, size);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    public static CertPath e(boolean z, CertPath certPath, X509Certificate[] x509CertificateArr) throws GeneralSecurityException {
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        X509Certificate x509Certificate;
        boolean z5;
        int i;
        boolean z6;
        if (x509CertificateArr == null) {
            throw new CertPathValidatorException("certificates are not trusted!");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (!certificates.isEmpty()) {
            List<X509Certificate> listC = c(certificates);
            int size = listC.size();
            int i2 = size - 1;
            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i2);
            X509Certificate next = null;
            if (x509CertificateArr.length == 0) {
                if (i2 == 0) {
                    if (!x509Certificate2.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                        f54813c.debug("   trust all- single certificate {}", x509Certificate2.getSubjectX500Principal());
                        return certPath;
                    }
                    i2 = size;
                }
                str2 = "last";
                z4 = false;
                z3 = false;
            } else if (z) {
                int i3 = 1;
                while (true) {
                    if (i3 < size) {
                        x509Certificate = listC.get(i3);
                        if (!a(x509Certificate, x509CertificateArr)) {
                            i3++;
                        } else if (i2 > i3) {
                            i2 = i3;
                            z5 = true;
                            break;
                        }
                    } else {
                        x509Certificate = null;
                    }
                    z5 = false;
                    break;
                }
                if (x509Certificate == null) {
                    X509Certificate x509CertificateB = b(x509Certificate2, x509CertificateArr);
                    i = size;
                    z6 = x509CertificateB != null ? !x509Certificate2.equals(x509CertificateB) : z5;
                    x509Certificate2 = x509CertificateB;
                } else {
                    x509Certificate2 = x509Certificate;
                    i = i2;
                    z6 = z5;
                }
                if (x509Certificate2 == null) {
                    X509Certificate x509Certificate3 = listC.get(0);
                    if (!a(x509Certificate3, x509CertificateArr)) {
                        str2 = "anchor";
                        boolean z7 = z5;
                        z4 = z6;
                        i2 = i;
                        z3 = z7;
                    } else if (size > 1) {
                        x509Certificate2 = listC.get(1);
                        str2 = "node's issuer";
                        z3 = true;
                        z4 = z6;
                        i2 = 1;
                    } else {
                        f54813c.debug("   trust node - single certificate {}", x509Certificate3.getSubjectX500Principal());
                        return certPath;
                    }
                } else {
                    str2 = "anchor";
                    boolean z8 = z5;
                    z4 = z6;
                    i2 = i;
                    z3 = z8;
                }
            } else {
                X509Certificate x509CertificateB2 = b(x509Certificate2, x509CertificateArr);
                if (x509CertificateB2 == null && a(x509Certificate2, x509CertificateArr)) {
                    str = "last's subject";
                    z2 = false;
                } else {
                    str = "last's issuer";
                    z2 = !x509Certificate2.equals(x509CertificateB2);
                    x509Certificate2 = x509CertificateB2;
                }
                str2 = str;
                z3 = false;
                z4 = z2;
                i2 = size;
            }
            CertPath certPathA = a(listC, i2);
            HashSet hashSet = new HashSet();
            if (x509Certificate2 == null) {
                x509Certificate2 = x509CertificateArr[0];
            }
            hashSet.add(new TrustAnchor(x509Certificate2, null));
            Logger logger = f54813c;
            if (logger.isDebugEnabled()) {
                List<X509Certificate> listC2 = c(certPathA.getCertificates());
                logger.debug("verify: certificate path {} (orig. {})", Integer.valueOf(i2), Integer.valueOf(size));
                Iterator<X509Certificate> it = listC2.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    f54813c.debug("   cert : {}", next.getSubjectX500Principal());
                }
                if (next != null) {
                    f54813c.debug("   sign : {}", next.getIssuerX500Principal());
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    f54813c.debug("   trust: {}, {}", str2, ((TrustAnchor) it2.next()).getTrustedCert().getSubjectX500Principal());
                }
            }
            CertPathValidator certPathValidator = CertPathValidator.getInstance(CertPathValidator.getDefaultType());
            PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
            pKIXParameters.setRevocationEnabled(false);
            certPathValidator.validate(certPathA, pKIXParameters);
            if (zzm.b()) {
                zza.a(listC, x509Certificate2, i2);
            }
            if (z3 || z4) {
                if (!z4) {
                    return certPathA;
                }
                if (!z3) {
                    listC.add(x509Certificate2);
                }
                return a(listC, i2 + 1);
            }
        }
        return certPath;
    }

    public static List<X509Certificate> c(List<? extends Certificate> list) {
        if (list == null) {
            throw new NullPointerException("Certificates list must not be null!");
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Certificate certificate : list) {
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Given certificate is not X.509!" + certificate.getClass());
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public static List<X500Principal> b(List<X509Certificate> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                X500Principal subjectX500Principal = it.next().getSubjectX500Principal();
                if (!arrayList.contains(subjectX500Principal)) {
                    arrayList.add(subjectX500Principal);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static String c(X509Certificate x509Certificate) {
        return zza.b(x509Certificate.getSubjectX500Principal().getEncoded());
    }

    public static boolean d(X509Certificate x509Certificate, String str) {
        if (x509Certificate == null) {
            throw new NullPointerException("Certificate must not be null!");
        }
        if (str == null) {
            throw new NullPointerException("Destination must not be null!");
        }
        if (!zzp.c(str)) {
            throw new IllegalArgumentException("Destination " + str + " is no literal IP!");
        }
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                for (List<?> list : subjectAlternativeNames) {
                    if (((Integer) list.get(0)).intValue() == 7) {
                        String str2 = (String) list.get(1);
                        if (zzp.c(str2) && d(str2, str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (ClassCastException | IllegalArgumentException | CertificateParsingException unused) {
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Subject must not be null!");
        }
        if (str2 == null) {
            throw new NullPointerException("Destination must nit be null!");
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        try {
            return InetAddress.getByName(str).equals(InetAddress.getByName(str2));
        } catch (SecurityException | UnknownHostException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: IllegalArgumentException -> 0x005b, CertificateParsingException -> 0x0062, ClassCastException -> 0x0069, TryCatch #2 {ClassCastException -> 0x0069, IllegalArgumentException -> 0x005b, CertificateParsingException -> 0x0062, blocks: (B:6:0x0008, B:8:0x000f, B:9:0x0014, B:11:0x001a, B:13:0x002d, B:18:0x003e, B:20:0x0044), top: B:34:0x0008 }] */
    public static boolean a(X509Certificate x509Certificate, String str) {
        String strC;
        if (x509Certificate == null) {
            throw new NullPointerException("Certificate must not be null!");
        }
        if (str == null) {
            throw new NullPointerException("Destination must not be null!");
        }
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                boolean z = false;
                for (List<?> list : subjectAlternativeNames) {
                    if (((Integer) list.get(0)).intValue() == 2) {
                        if (str.equalsIgnoreCase((String) list.get(1))) {
                            return true;
                        }
                        z = true;
                    }
                }
                if (!z) {
                    strC = c(x509Certificate);
                    if (strC == null && str.equalsIgnoreCase(e.matcher(strC.trim()).replaceAll(" "))) {
                        return true;
                    }
                }
            } else {
                strC = c(x509Certificate);
                if (strC == null) {
                }
            }
        } catch (ClassCastException e2) {
            f54813c.debug("match", (Throwable) e2);
        } catch (IllegalArgumentException e3) {
            f54813c.debug("match", (Throwable) e3);
        } catch (CertificateParsingException e4) {
            f54813c.debug("match", (Throwable) e4);
        }
        return false;
    }

    private static X509Certificate b(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) {
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        X509Certificate x509Certificate2 = null;
        for (X509Certificate x509Certificate3 : x509CertificateArr) {
            if (x509Certificate3 != null && issuerX500Principal.equals(x509Certificate3.getSubjectX500Principal())) {
                if (x509Certificate2 != null && a(x509Certificate, x509Certificate2)) {
                    break;
                }
                x509Certificate2 = x509Certificate3;
            }
        }
        return x509Certificate2;
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.checkValidity();
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) throws CertificateEncodingException {
        for (X509Certificate x509Certificate2 : x509CertificateArr) {
            if (x509Certificate.equals(x509Certificate2)) {
                return true;
            }
        }
        return false;
    }
}
