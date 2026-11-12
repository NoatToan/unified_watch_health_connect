package org.eclipse.californium.scandium.dtls;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.aacr;
import defpackage.aacx;
import defpackage.zzm;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.elements.util.JceNames;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public final class SignatureAndHashAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<SignatureAndHashAlgorithm> f44563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SignatureAndHashAlgorithm f44564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SignatureAndHashAlgorithm f44565c;
    public static final SignatureAndHashAlgorithm d;
    public static final SignatureAndHashAlgorithm e;
    public static final SignatureAndHashAlgorithm f;
    public static final SignatureAndHashAlgorithm h;
    private final int g;
    private final HashAlgorithm i;
    private final String j;
    private final SignatureAlgorithm k;
    private final boolean l;
    private final int n;

    static {
        zzm.d();
        f44565c = new SignatureAndHashAlgorithm(HashAlgorithm.SHA1, SignatureAlgorithm.ECDSA);
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = new SignatureAndHashAlgorithm(HashAlgorithm.SHA256, SignatureAlgorithm.ECDSA);
        e = signatureAndHashAlgorithm;
        h = new SignatureAndHashAlgorithm(HashAlgorithm.SHA384, SignatureAlgorithm.ECDSA);
        SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = new SignatureAndHashAlgorithm(HashAlgorithm.SHA256, SignatureAlgorithm.RSA);
        f = signatureAndHashAlgorithm2;
        f44564b = new SignatureAndHashAlgorithm(HashAlgorithm.INTRINSIC, SignatureAlgorithm.ED25519);
        d = new SignatureAndHashAlgorithm(HashAlgorithm.INTRINSIC, SignatureAlgorithm.ED448);
        f44563a = Collections.unmodifiableList(Arrays.asList(signatureAndHashAlgorithm, signatureAndHashAlgorithm2));
    }

    public enum HashAlgorithm {
        NONE(0, false),
        MD5(1, false),
        SHA1(2, false),
        SHA224(3, false),
        SHA256(4, true),
        SHA384(5, true),
        SHA512(6, true),
        INTRINSIC(8, true);

        private final int code;
        private final boolean recommended;

        HashAlgorithm(int i, boolean z) {
            this.code = i;
            this.recommended = z;
        }

        public static HashAlgorithm getAlgorithmByCode(int i) {
            switch (i) {
                case 0:
                    return NONE;
                case 1:
                    return MD5;
                case 2:
                    return SHA1;
                case 3:
                    return SHA224;
                case 4:
                    return SHA256;
                case 5:
                    return SHA384;
                case 6:
                    return SHA512;
                case 7:
                default:
                    return null;
                case 8:
                    return INTRINSIC;
            }
        }

        public int getCode() {
            return this.code;
        }

        public boolean isRecommended() {
            return this.recommended;
        }
    }

    public enum SignatureAlgorithm {
        ANONYMOUS(0, null),
        RSA(1, CipherSuite.CertificateKeyAlgorithm.RSA),
        DSA(2, CipherSuite.CertificateKeyAlgorithm.DSA),
        ECDSA(3, CipherSuite.CertificateKeyAlgorithm.EC, JceNames.EC, false),
        ED25519(7, CipherSuite.CertificateKeyAlgorithm.EC, JceNames.OID_ED25519, true),
        ED448(8, CipherSuite.CertificateKeyAlgorithm.EC, JceNames.OID_ED448, true);

        private final CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm;
        private final int code;
        private final boolean isIntrinsic;
        private final String keyAlgorithm;

        SignatureAlgorithm(int i, CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
            this.code = i;
            this.certificateKeyAlgorithm = certificateKeyAlgorithm;
            this.keyAlgorithm = name();
            this.isIntrinsic = false;
        }

        SignatureAlgorithm(int i, CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm, String str, boolean z) {
            this.code = i;
            this.certificateKeyAlgorithm = certificateKeyAlgorithm;
            this.keyAlgorithm = str;
            this.isIntrinsic = z;
        }

        public static SignatureAlgorithm getAlgorithmByCode(int i) {
            if (i == 0) {
                return ANONYMOUS;
            }
            if (i == 1) {
                return RSA;
            }
            if (i == 2) {
                return DSA;
            }
            if (i == 3) {
                return ECDSA;
            }
            if (i == 7) {
                return ED25519;
            }
            if (i != 8) {
                return null;
            }
            return ED448;
        }

        public int getCode() {
            return this.code;
        }

        public boolean isSupported(String str) {
            String strE;
            if (this.keyAlgorithm.equalsIgnoreCase(str)) {
                return zzm.b(str);
            }
            SignatureAlgorithm signatureAlgorithm = ED25519;
            if ((signatureAlgorithm != this && ED448 != this) || (strE = zzm.e(str, null)) == null) {
                return false;
            }
            if (signatureAlgorithm == this) {
                if (JceNames.OID_ED25519 == strE || JceNames.EDDSA == strE) {
                    return zzm.b(JceNames.ED25519);
                }
                return false;
            }
            if (JceNames.OID_ED448 == strE || JceNames.EDDSA == strE) {
                return zzm.b(JceNames.ED448);
            }
            return false;
        }

        public boolean isSupported(CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
            return this.certificateKeyAlgorithm == certificateKeyAlgorithm;
        }

        public boolean isIntrinsic() {
            return this.isIntrinsic;
        }

        public static SignatureAlgorithm intrinsicValueOf(String str) {
            String strE = zzm.e(str, null);
            if (strE != null) {
                for (SignatureAlgorithm signatureAlgorithm : values()) {
                    if (signatureAlgorithm.isIntrinsic && signatureAlgorithm.isSupported(strE)) {
                        return signatureAlgorithm;
                    }
                }
                throw new IllegalArgumentException(str + " is no supported intrinsic algorithm!");
            }
            throw new IllegalArgumentException(str + " is unknown intrinsic algorithm!");
        }
    }

    public static aacr d(String str) {
        if (str == null) {
            str = "UNKNOWN";
        }
        return (aacr) aacr.f130a.c(str);
    }

    public static SignatureAndHashAlgorithm a(String str) {
        HashAlgorithm hashAlgorithmValueOf;
        SignatureAlgorithm signatureAlgorithmIntrinsicValueOf;
        int iIndexOf = str.indexOf(JsonPOJOBuilder.DEFAULT_WITH_PREFIX);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf("WITH");
        }
        if (iIndexOf > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 4, str.length());
            signatureAlgorithmIntrinsicValueOf = null;
            try {
                hashAlgorithmValueOf = HashAlgorithm.valueOf(strSubstring);
            } catch (IllegalArgumentException unused) {
                hashAlgorithmValueOf = null;
            }
            try {
                signatureAlgorithmIntrinsicValueOf = SignatureAlgorithm.valueOf(strSubstring2);
            } catch (IllegalArgumentException unused2) {
            }
            if (hashAlgorithmValueOf == null && signatureAlgorithmIntrinsicValueOf == null) {
                throw new IllegalArgumentException(str + " is unknown!");
            }
            if (hashAlgorithmValueOf == null) {
                throw new IllegalArgumentException(str + " uses a unknown hash-algorithm!");
            }
            if (signatureAlgorithmIntrinsicValueOf == null) {
                throw new IllegalArgumentException(str + " uses a unknown signature-algorithm!");
            }
        } else {
            hashAlgorithmValueOf = HashAlgorithm.INTRINSIC;
            signatureAlgorithmIntrinsicValueOf = SignatureAlgorithm.intrinsicValueOf(str);
        }
        return new SignatureAndHashAlgorithm(hashAlgorithmValueOf, signatureAlgorithmIntrinsicValueOf);
    }

    public static void e(List<SignatureAndHashAlgorithm> list, PublicKey publicKey) {
        if (publicKey == null) {
            throw new NullPointerException("Public key must not be null!");
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithmA = a(f44563a, publicKey);
        if (signatureAndHashAlgorithmA != null) {
            aacx.c(list, signatureAndHashAlgorithmA);
            return;
        }
        if (list == null) {
            throw new NullPointerException("The defaults list must not be null!");
        }
        if (a(list, publicKey) != null) {
            return;
        }
        boolean z = false;
        for (SignatureAlgorithm signatureAlgorithm : SignatureAlgorithm.values()) {
            if (signatureAlgorithm.isSupported(publicKey.getAlgorithm())) {
                if (signatureAlgorithm.isIntrinsic()) {
                    SignatureAndHashAlgorithm signatureAndHashAlgorithm = new SignatureAndHashAlgorithm(HashAlgorithm.INTRINSIC, signatureAlgorithm);
                    if (signatureAndHashAlgorithm.c(publicKey)) {
                        aacx.c(list, signatureAndHashAlgorithm);
                        return;
                    }
                } else {
                    for (HashAlgorithm hashAlgorithm : HashAlgorithm.values()) {
                        if (hashAlgorithm != HashAlgorithm.INTRINSIC && hashAlgorithm.isRecommended()) {
                            SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = new SignatureAndHashAlgorithm(hashAlgorithm, signatureAlgorithm);
                            if (signatureAndHashAlgorithm2.c(publicKey)) {
                                aacx.c(list, signatureAndHashAlgorithm2);
                                return;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException(publicKey.getAlgorithm() + " public key is not supported!");
        }
        throw new IllegalArgumentException(publicKey.getAlgorithm() + " is not supported!");
    }

    public static List<SignatureAndHashAlgorithm> a(List<SignatureAndHashAlgorithm> list, List<SignatureAndHashAlgorithm> list2) {
        ArrayList arrayList = new ArrayList();
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : list) {
            if (list2.contains(signatureAndHashAlgorithm)) {
                aacx.c(arrayList, signatureAndHashAlgorithm);
            }
        }
        return arrayList;
    }

    public static SignatureAndHashAlgorithm a(List<SignatureAndHashAlgorithm> list, PublicKey publicKey) {
        if (publicKey == null) {
            throw new NullPointerException("Public key must not be null!");
        }
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : list) {
            if (signatureAndHashAlgorithm.c(publicKey)) {
                return signatureAndHashAlgorithm;
            }
        }
        return null;
    }

    public static List<SignatureAndHashAlgorithm> c(List<SignatureAndHashAlgorithm> list, List<CipherSuite.CertificateKeyAlgorithm> list2) {
        ArrayList arrayList = new ArrayList();
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : list) {
            Iterator<CipherSuite.CertificateKeyAlgorithm> it = list2.iterator();
            while (it.hasNext()) {
                if (signatureAndHashAlgorithm.d(it.next())) {
                    arrayList.add(signatureAndHashAlgorithm);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static boolean d(List<SignatureAndHashAlgorithm> list, CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
        Iterator<SignatureAndHashAlgorithm> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d(certificateKeyAlgorithm)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(List<SignatureAndHashAlgorithm> list, List<X509Certificate> list2) {
        Iterator<X509Certificate> it = list2.iterator();
        while (it.hasNext()) {
            if (!a(list, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(List<SignatureAndHashAlgorithm> list, X509Certificate x509Certificate) {
        String sigAlgName = x509Certificate.getSigAlgName();
        String strE = zzm.e(sigAlgName, null);
        if (strE != null) {
            if (SignatureAlgorithm.ED25519.isSupported(strE)) {
                return list.contains(f44564b);
            }
            if (SignatureAlgorithm.ED448.isSupported(strE)) {
                return list.contains(d);
            }
            return false;
        }
        Iterator<SignatureAndHashAlgorithm> it = list.iterator();
        while (it.hasNext()) {
            if (sigAlgName.equalsIgnoreCase(it.next().e())) {
                return true;
            }
        }
        return false;
    }

    public SignatureAndHashAlgorithm(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm) {
        if (hashAlgorithm == null) {
            throw new NullPointerException("Hash Algorithm must not be null!");
        }
        if (signatureAlgorithm == null) {
            throw new NullPointerException("Signature Algorithm must not be null!");
        }
        this.i = hashAlgorithm;
        this.k = signatureAlgorithm;
        this.g = hashAlgorithm.getCode();
        this.n = signatureAlgorithm.getCode();
        String strI = i();
        this.j = strI;
        this.l = strI != null && d(strI).a();
    }

    public SignatureAndHashAlgorithm(int i, int i2) {
        this.g = i;
        this.n = i2;
        this.k = SignatureAlgorithm.getAlgorithmByCode(i2);
        this.i = HashAlgorithm.getAlgorithmByCode(i);
        String strI = i();
        this.j = strI;
        this.l = strI != null && d(strI).a();
    }

    private String i() {
        if (this.i == null || this.k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.i != HashAlgorithm.INTRINSIC) {
            sb.append(this.i);
            sb.append(JsonPOJOBuilder.DEFAULT_WITH_PREFIX);
        }
        sb.append(this.k);
        return sb.toString();
    }

    public SignatureAlgorithm b() {
        return this.k;
    }

    public HashAlgorithm c() {
        return this.i;
    }

    public String e() {
        return this.j;
    }

    public boolean d() {
        HashAlgorithm hashAlgorithm;
        return (this.k == null || (hashAlgorithm = this.i) == null || !hashAlgorithm.isRecommended()) ? false : true;
    }

    public boolean g() {
        return this.l;
    }

    public boolean d(CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
        if (this.l) {
            return this.k.isSupported(certificateKeyAlgorithm);
        }
        return false;
    }

    public boolean c(PublicKey publicKey) {
        Signature signatureC;
        if (!this.l || !this.k.isSupported(publicKey.getAlgorithm()) || (signatureC = a().c()) == null) {
            return false;
        }
        try {
            signatureC.initVerify(publicKey);
            return true;
        } catch (InvalidKeyException unused) {
            return false;
        }
    }

    public String toString() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        HashAlgorithm hashAlgorithm = this.i;
        if (hashAlgorithm != null) {
            sb.append(hashAlgorithm);
        } else {
            sb.append(String.format("0x%02x", Integer.valueOf(this.g)));
        }
        sb.append(JsonPOJOBuilder.DEFAULT_WITH_PREFIX);
        SignatureAlgorithm signatureAlgorithm = this.k;
        if (signatureAlgorithm != null) {
            sb.append(signatureAlgorithm);
        } else {
            sb.append(String.format("0x%02x", Integer.valueOf(this.n)));
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) obj;
        return this.n == signatureAndHashAlgorithm.n && this.g == signatureAndHashAlgorithm.g;
    }

    public int hashCode() {
        return (this.g * 256) + this.n;
    }

    public aacr a() {
        return d(e());
    }
}
