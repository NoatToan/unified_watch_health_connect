package org.eclipse.californium.elements.util;

import defpackage.aaex;
import defpackage.zza;
import defpackage.zzi;
import defpackage.zzm;
import defpackage.zzq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class SslContextUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final KeyManager f44506b;
    private static final TrustManager e;

    @Deprecated
    public static final Logger d = aaex.a((Class<?>) SslContextUtil.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, b> f44505a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, InputStreamFactory> f44507c = new ConcurrentHashMap();

    public interface InputStreamFactory {
        InputStream create(String str) throws IOException;
    }

    public interface SimpleKeyStore {
        c load(InputStream inputStream) throws GeneralSecurityException, IOException;
    }

    static {
        TrustManager hVar;
        f44506b = new d();
        zzm.d();
        e();
        try {
            hVar = new a();
        } catch (NoClassDefFoundError unused) {
            hVar = new h();
        }
        e = hVar;
    }

    public static void e() {
        Map<String, b> map = f44505a;
        map.clear();
        map.put(".jks", new b("JKS"));
        map.put(".bks", new b("BKS"));
        map.put(".p12", new b("PKCS12"));
        b bVar = new b(new SimpleKeyStore() { // from class: org.eclipse.californium.elements.util.SslContextUtil.4
            @Override // org.eclipse.californium.elements.util.SslContextUtil.SimpleKeyStore
            public c load(InputStream inputStream) throws GeneralSecurityException, IOException {
                return SslContextUtil.d(inputStream);
            }
        });
        map.put(".pem", bVar);
        map.put(".crt", bVar);
        map.put("*", new b(KeyStore.getDefaultType()));
        Map<String, InputStreamFactory> map2 = f44507c;
        map2.clear();
        map2.put("classpath://", new e());
    }

    public static c d(InputStream inputStream) throws GeneralSecurityException, IOException {
        return b(new zzq(inputStream));
    }

    public static c b(zzq zzqVar) throws GeneralSecurityException, IOException {
        try {
            zza.b bVar = new zza.b();
            ArrayList<Certificate> arrayList = new ArrayList();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            while (true) {
                String strB = zzqVar.b();
                if (strB == null) {
                    if (bVar.b() != null || bVar.d() != null) {
                        List<? extends Certificate> certificates = certificateFactory.generateCertPath(arrayList).getCertificates();
                        c cVar = new c(bVar.b(), bVar.d(), (X509Certificate[]) certificates.toArray(new X509Certificate[certificates.size()]));
                        zzqVar.c();
                        return cVar;
                    }
                    if (arrayList.isEmpty()) {
                        c cVar2 = new c(null);
                        zzqVar.c();
                        return cVar2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Certificate certificate : arrayList) {
                        if (!arrayList2.contains(certificate)) {
                            arrayList2.add(certificate);
                        }
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        try {
                            List<? extends Certificate> certificates2 = certificateFactory.generateCertPath(arrayList).getCertificates();
                            c cVar3 = new c(null, null, (X509Certificate[]) certificates2.toArray(new X509Certificate[certificates2.size()]));
                            zzqVar.c();
                            return cVar3;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    c cVar4 = new c((Certificate[]) arrayList2.toArray(new Certificate[arrayList2.size()]));
                    zzqVar.c();
                    return cVar4;
                }
                byte[] bArrD = zzqVar.d();
                if (bArrD != null) {
                    if (strB.contains("CERTIFICATE")) {
                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrD)));
                    } else if (strB.contains("PRIVATE KEY")) {
                        zza.b bVarC = zza.c(bArrD);
                        if (bVarC == null) {
                            throw new GeneralSecurityException("private key type not supported!");
                        }
                        bVar.b(bVarC);
                    } else if (strB.contains("PUBLIC KEY")) {
                        PublicKey publicKeyI = zza.i(bArrD);
                        if (publicKeyI == null) {
                            throw new GeneralSecurityException("public key type not supported!");
                        }
                        bVar.b(publicKeyI);
                    } else {
                        d.warn("{} not supported, ignored!", strB);
                    }
                }
            }
        } catch (Throwable th) {
            zzqVar.c();
            throw th;
        }
    }

    public static X509Certificate[] c(Certificate[] certificateArr) {
        if (certificateArr == null || certificateArr.length == 0) {
            throw new IllegalArgumentException("certificates missing!");
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[certificateArr.length];
        for (int i = 0; certificateArr.length > i; i++) {
            Certificate certificate = certificateArr[i];
            if (certificate == null) {
                throw new IllegalArgumentException("[" + i + "] is null!");
            }
            try {
                x509CertificateArr[i] = (X509Certificate) certificate;
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("[" + i + "] is not a x509 certificate! Instead it's a " + certificateArr[i].getClass().getName());
            }
        }
        return x509CertificateArr;
    }

    public static void b(X509Certificate[] x509CertificateArr) {
        HashSet hashSet = new HashSet();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            if (!hashSet.add(x509Certificate)) {
                throw new IllegalArgumentException("Truststore contains certificates duplicates with subject: " + x509Certificate.getSubjectX500Principal());
            }
        }
    }

    static class e implements InputStreamFactory {
        private e() {
        }

        @Override // org.eclipse.californium.elements.util.SslContextUtil.InputStreamFactory
        public InputStream create(String str) throws IOException {
            InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(str.substring(12));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new IOException("'" + str + "' not found!");
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static class c implements Destroyable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509Certificate[] f44508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f44509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Certificate[] f44510c;
        private final PrivateKey d;
        private final PublicKey e;

        public c(PrivateKey privateKey, PublicKey publicKey, X509Certificate[] x509CertificateArr) {
            if (x509CertificateArr != null) {
                if (x509CertificateArr.length == 0) {
                    x509CertificateArr = null;
                } else if (publicKey != null) {
                    if (!publicKey.equals(x509CertificateArr[0].getPublicKey())) {
                        throw new IllegalArgumentException("public key doesn't match certificate!");
                    }
                } else {
                    publicKey = x509CertificateArr[0].getPublicKey();
                }
            }
            this.d = privateKey;
            this.f44508a = x509CertificateArr;
            this.e = publicKey;
            this.f44510c = null;
        }

        public c(Certificate[] certificateArr) {
            this.d = null;
            this.e = null;
            this.f44508a = null;
            this.f44510c = certificateArr;
        }

        public String toString() {
            if (this.d != null) {
                if (this.f44508a != null) {
                    return "private key + certificate chain";
                }
                if (this.e != null) {
                    return "private key + public key";
                }
                return "private key";
            }
            if (this.f44508a != null) {
                return "certificate chain";
            }
            if (this.e != null) {
                return "public key";
            }
            if (this.f44510c != null) {
                return "trusted certificates";
            }
            return "no credentials";
        }

        @Override // javax.security.auth.Destroyable
        public void destroy() throws DestroyFailedException {
            PrivateKey privateKey = this.d;
            if (privateKey instanceof Destroyable) {
                privateKey.destroy();
            }
            this.f44509b = true;
        }

        @Override // javax.security.auth.Destroyable
        public boolean isDestroyed() {
            if (this.f44509b) {
                return true;
            }
            return this.d == null && this.f44510c == null && this.e == null;
        }
    }

    public static class b {
        public final SimpleKeyStore d;
        public final String e;

        public b(String str) {
            if (str == null) {
                throw new NullPointerException("key store type must not be null!");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("key store type must not be empty!");
            }
            this.e = str;
            this.d = null;
        }

        public b(SimpleKeyStore simpleKeyStore) {
            if (simpleKeyStore == null) {
                throw new NullPointerException("simple key store must not be null!");
            }
            this.e = null;
            this.d = simpleKeyStore;
        }
    }

    static class d extends X509ExtendedKeyManager {
        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return null;
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
            return null;
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return null;
        }

        private d() {
        }
    }

    static class h implements X509TrustManager {
        private static final X509Certificate[] d = new X509Certificate[0];

        private h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(X509Certificate[] x509CertificateArr, boolean z) throws CertificateException {
            if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
                return;
            }
            SslContextUtil.d.debug("check certificate {} for {}", x509CertificateArr[0].getSubjectX500Principal(), z ? "client" : "server");
            if (!zzi.e(x509CertificateArr[0], z)) {
                SslContextUtil.d.debug("check certificate {} for {} failed on key-usage!", x509CertificateArr[0].getSubjectX500Principal(), z ? "client" : "server");
                throw new CertificateException("Key usage not proper for ".concat(z ? "client" : "server"));
            }
            SslContextUtil.d.trace("check certificate {} for {} succeeded on key-usage!", x509CertificateArr[0].getSubjectX500Principal(), z ? "client" : "server");
            try {
                zzi.e(true, zzi.c(Arrays.asList(x509CertificateArr), null), d);
                SslContextUtil.d.trace("check certificate {} [chain.length={}] for {} validated!", x509CertificateArr[0].getSubjectX500Principal(), Integer.valueOf(x509CertificateArr.length), z ? "client" : "server");
            } catch (GeneralSecurityException e) {
                SslContextUtil.d.debug("check certificate {} for {} failed on {}!", x509CertificateArr[0].getSubjectX500Principal(), z ? "client" : "server", e.getMessage());
                if (e instanceof CertificateException) {
                    throw ((CertificateException) e);
                }
                throw new CertificateException(e);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            e(x509CertificateArr, true);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            e(x509CertificateArr, false);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return d;
        }
    }

    static class a extends X509ExtendedTrustManager {
        private a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            h.e(x509CertificateArr, true);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            h.e(x509CertificateArr, false);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return h.d;
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            h.e(x509CertificateArr, true);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            h.e(x509CertificateArr, true);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            h.e(x509CertificateArr, false);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            h.e(x509CertificateArr, false);
        }
    }
}
