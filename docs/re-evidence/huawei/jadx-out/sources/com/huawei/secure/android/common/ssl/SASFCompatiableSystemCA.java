package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes42.dex */
public class SASFCompatiableSystemCA extends SSLSocketFactory {
    private static final String i = "SASFCompatiableSystemCA";
    private static volatile SASFCompatiableSystemCA j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f22852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f22853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22854c;
    private String[] d;
    private X509TrustManager e;
    private String[] f;
    private String[] g;
    private String[] h;

    private SASFCompatiableSystemCA(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        super(keyStore);
        this.f22853b = null;
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        d.c(i, "sasfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            j = new SASFCompatiableSystemCA(null, x509TrustManager);
        } catch (KeyManagementException unused) {
            d.b(i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            d.b(i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            d.b(i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            d.b(i, "UnrecoverableKeyException");
        }
        d.a(i, "sasf system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public static SASFCompatiableSystemCA getInstance(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (j == null) {
                    j = new SASFCompatiableSystemCA(keyStore, context, (SecureRandom) null);
                }
            }
        }
        return j;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        d.c(i, "createSocket: socket host port autoClose");
        Socket socketCreateSocket = this.f22852a.getSocketFactory().createSocket(socket, str, i2, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22853b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f22854c;
    }

    public String[] getProtocols() {
        return this.h;
    }

    public SSLContext getSslContext() {
        return this.f22852a;
    }

    public SSLSocket getSslSocket() {
        return this.f22853b;
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = this.d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f = strArr;
    }

    public void setContext(Context context) {
        this.f22854c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f22852a = sSLContext;
    }

    public void setSslSocket(SSLSocket sSLSocket) {
        this.f22853b = sSLSocket;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.e = x509TrustManager;
    }

    private SASFCompatiableSystemCA(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException, NullPointerException {
        super(keyStore);
        this.f22853b = null;
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager sSFSecureX509SingleInstance = SSFSecureX509SingleInstance.getInstance(context);
        this.e = sSFSecureX509SingleInstance;
        this.f22852a.init(null, new X509TrustManager[]{sSFSecureX509SingleInstance}, secureRandom);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        d.c(i, "createSocket: ");
        Socket socketCreateSocket = this.f22852a.getSocketFactory().createSocket();
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22853b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public static SASFCompatiableSystemCA getInstance(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (j == null) {
                    j = new SASFCompatiableSystemCA(keyStore, context, secureRandom);
                }
            }
        }
        return j;
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        d.c(i, "sasfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            j = new SASFCompatiableSystemCA((KeyStore) null, x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            d.b(i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            d.b(i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            d.b(i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            d.b(i, "UnrecoverableKeyException");
        }
        d.a(i, "sasf system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public SASFCompatiableSystemCA(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException, IllegalArgumentException {
        super(keyStore);
        this.f22853b = null;
        this.f22852a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22852a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    private void a(Socket socket) {
        boolean enabledProtocols;
        boolean blackListCipherSuites = false;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.h)) {
            enabledProtocols = false;
        } else {
            d.c(i, "set protocols");
            enabledProtocols = SSLUtil.setEnabledProtocols((SSLSocket) socket, this.h);
        }
        if (!com.huawei.secure.android.common.ssl.util.a.a(this.g) || !com.huawei.secure.android.common.ssl.util.a.a(this.f)) {
            d.c(i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.a.a(this.g)) {
                blackListCipherSuites = SSLUtil.setWhiteListCipherSuites(sSLSocket, this.g);
            } else {
                blackListCipherSuites = SSLUtil.setBlackListCipherSuites(sSLSocket, this.f);
            }
        }
        if (!enabledProtocols) {
            d.c(i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (blackListCipherSuites) {
            return;
        }
        d.c(i, "set default cipher suites");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    public SASFCompatiableSystemCA(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException, IllegalArgumentException {
        super(keyStore);
        this.f22853b = null;
        this.f22852a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22852a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
