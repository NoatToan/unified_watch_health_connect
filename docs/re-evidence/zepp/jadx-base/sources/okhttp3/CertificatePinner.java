package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* JADX INFO: loaded from: classes23.dex */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final Set<a> a;

    @Nullable
    private final CertificateChainCleaner b;

    public static final class Builder {
        private final List<a> a = new ArrayList();

        public Builder add(String str, String... strArr) {
            Objects.requireNonNull(str, "pattern == null");
            for (String str2 : strArr) {
                this.a.add(new a(str, str2));
            }
            return this;
        }

        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.a), null);
        }
    }

    public static final class a {
        private static final String e = "*.";
        public final String a;
        public final String b;
        public final String c;
        public final ByteString d;

        public a(String str, String str2) {
            String strHost;
            this.a = str;
            if (str.startsWith(e)) {
                strHost = HttpUrl.get("http://" + str.substring(2)).host();
            } else {
                strHost = HttpUrl.get("http://" + str).host();
            }
            this.b = strHost;
            if (str2.startsWith("sha1/")) {
                this.c = "sha1/";
                this.d = ByteString.decodeBase64(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
                this.c = "sha256/";
                this.d = ByteString.decodeBase64(str2.substring(7));
            }
            if (this.d != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: " + str2);
        }

        public boolean a(String str) {
            if (!this.a.startsWith(e)) {
                return str.equals(this.b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 == this.b.length()) {
                String str2 = this.b;
                if (str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.c.equals(aVar.c) && this.d.equals(aVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return this.c + this.d.base64();
        }
    }

    public CertificatePinner(Set<a> set, @Nullable CertificateChainCleaner certificateChainCleaner) {
        this.a = set;
        this.b = certificateChainCleaner;
    }

    public static ByteString b(X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    public static ByteString c(X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    public static String pin(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + c((X509Certificate) certificate).base64();
    }

    public List<a> a(String str) {
        List<a> listEmptyList = Collections.emptyList();
        for (a aVar : this.a) {
            if (aVar.a(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                listEmptyList.add(aVar);
            }
        }
        return listEmptyList;
    }

    public void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<a> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        CertificateChainCleaner certificateChainCleaner = this.b;
        if (certificateChainCleaner != null) {
            list = certificateChainCleaner.clean(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listA.size();
            ByteString byteStringC = null;
            ByteString byteStringB = null;
            for (int i2 = 0; i2 < size2; i2++) {
                a aVar = listA.get(i2);
                if (aVar.c.equals("sha256/")) {
                    if (byteStringC == null) {
                        byteStringC = c(x509Certificate);
                    }
                    if (aVar.d.equals(byteStringC)) {
                        return;
                    }
                } else {
                    if (!aVar.c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + aVar.c);
                    }
                    if (byteStringB == null) {
                        byteStringB = b(x509Certificate);
                    }
                    if (aVar.d.equals(byteStringB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listA.size();
        for (int i4 = 0; i4 < size4; i4++) {
            a aVar2 = listA.get(i4);
            sb.append("\n    ");
            sb.append(aVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public CertificatePinner d(@Nullable CertificateChainCleaner certificateChainCleaner) {
        return Util.equal(this.b, certificateChainCleaner) ? this : new CertificatePinner(this.a, certificateChainCleaner);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Util.equal(this.b, certificatePinner.b) && this.a.equals(certificatePinner.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        CertificateChainCleaner certificateChainCleaner = this.b;
        return ((certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0) * 31) + this.a.hashCode();
    }

    public void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        check(str, Arrays.asList(certificateArr));
    }
}
