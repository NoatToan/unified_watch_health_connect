package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.BksUtil;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class SecureX509TrustManager implements X509TrustManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22874c = "SX509TM";
    public static final String d = "hmsrootcas.bks";
    private static final String e = "";
    private static final String f = "X509";
    private static final String g = "bks";
    private static final String h = "AndroidCAStore";
    private static final String i = "Huawei CBG Mobile Equipment CA";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<X509TrustManager> f22875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X509Certificate[] f22876b;

    public SecureX509TrustManager(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    private void a() {
        d.c(f22874c, "loadSystemCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance(h);
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f);
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f22875a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            d.b(f22874c, "loadSystemCA: exception : " + e2.getMessage());
        }
        d.a(f22874c, "loadSystemCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        d.c(f22874c, "checkClientTrusted: ");
        Iterator<X509TrustManager> it = this.f22875a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e2) {
                d.b(f22874c, "checkServerTrusted CertificateException" + e2.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        setChain(x509CertificateArr);
        d.c(f22874c, "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (x509CertificateArr.length >= 2) {
            String strA = a(x509CertificateArr[x509CertificateArr.length - 1].getSubjectX500Principal().getName());
            String strA2 = a(x509CertificateArr[x509CertificateArr.length - 2].getSubjectX500Principal().getName());
            if (i.equals(strA) || i.equals(strA2)) {
                throw new CertificateException("Invalid CN, name is Huawei CBG Mobile Equipment CA");
            }
        }
        int size = this.f22875a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                d.c(f22874c, "check server i=" + i2);
                X509TrustManager x509TrustManager = this.f22875a.get(i2);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    d.c(f22874c, "client root ca size=" + acceptedIssuers.length);
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                d.c(f22874c, "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e2) {
                d.b(f22874c, "checkServerTrusted error :" + e2.getMessage() + " , time : " + i2);
                if (i2 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        d.b(f22874c, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e2;
                }
            }
        }
        d.a(f22874c, "checkServerTrusted: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f22875a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e2) {
            d.b(f22874c, "getAcceptedIssuers exception : " + e2.getMessage());
            return new X509Certificate[0];
        }
    }

    public X509Certificate[] getChain() {
        return this.f22876b;
    }

    public List<X509TrustManager> getX509TrustManagers() {
        return this.f22875a;
    }

    public void setChain(X509Certificate[] x509CertificateArr) {
        this.f22876b = x509CertificateArr;
    }

    public void setX509TrustManagers(List<X509TrustManager> list) {
        this.f22875a = list;
    }

    public SecureX509TrustManager(Context context, boolean z) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, IllegalArgumentException {
        this.f22875a = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        ContextUtil.setContext(context);
        a(context);
        if (z) {
            a();
        }
        if (this.f22875a.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private void a(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        d.c(f22874c, "loadBksCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        InputStream filesBksIS = BksUtil.getFilesBksIS(context);
        if (filesBksIS != null) {
            try {
                d.c(f22874c, "get bks not from assets");
                a(filesBksIS);
                if (filesBksIS == null) {
                    d.c(f22874c, " get bks from assets ");
                    a(context.getAssets().open("hmsrootcas.bks"));
                }
            } catch (IOException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                d.b(f22874c, "loadBksCA: exception : " + e2.getMessage());
            }
        } else if (filesBksIS == null) {
            d.c(f22874c, " get bks from assets ");
            a(context.getAssets().open("hmsrootcas.bks"));
        }
        d.a(f22874c, "loadBksCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    private void a(InputStream inputStream) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f);
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f22875a.add((X509TrustManager) trustManager);
                }
            }
            com.huawei.secure.android.common.ssl.util.c.a(inputStream);
        } catch (Throwable th) {
            com.huawei.secure.android.common.ssl.util.c.a(inputStream);
            throw th;
        }
    }

    public SecureX509TrustManager(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f22875a = new ArrayList();
        a(inputStream, str);
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f);
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, str.toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f22875a.add((X509TrustManager) trustManager);
                        }
                    }
                    com.huawei.secure.android.common.ssl.util.c.a(inputStream);
                } catch (Throwable th) {
                    com.huawei.secure.android.common.ssl.util.c.a(inputStream);
                    throw th;
                }
            } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                d.b(f22874c, "loadInputStream: exception : " + e2.getMessage());
                com.huawei.secure.android.common.ssl.util.c.a(inputStream);
            }
            d.a(f22874c, "loadInputStream: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            return;
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    private String a(String str) {
        try {
            for (String str2 : str.split(",")) {
                String strTrim = str2.trim();
                if (strTrim.startsWith("CN=")) {
                    return strTrim.substring(3);
                }
            }
            return "";
        } catch (Exception e2) {
            d.b(f22874c, "parse subjectDN is error, error message is " + e2.getMessage());
            return "";
        }
    }

    public SecureX509TrustManager(String str) throws IllegalArgumentException, FileNotFoundException {
        this(str, false);
    }

    public SecureX509TrustManager(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        this.f22875a = new ArrayList();
        try {
            fileInputStream = new FileInputStream(str);
            try {
                a(fileInputStream, "");
                com.huawei.secure.android.common.ssl.util.c.a((InputStream) fileInputStream);
                if (z) {
                    a();
                }
            } catch (Throwable th) {
                th = th;
                com.huawei.secure.android.common.ssl.util.c.a((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public SecureX509TrustManager(InputStream inputStream, String str, boolean z) throws IllegalArgumentException {
        this.f22875a = new ArrayList();
        a(inputStream, str);
        if (z) {
            a();
        }
    }
}
