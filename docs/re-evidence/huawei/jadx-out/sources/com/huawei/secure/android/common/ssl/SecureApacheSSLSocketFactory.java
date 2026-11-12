package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes3.dex */
public class SecureApacheSSLSocketFactory extends SSLSocketFactory {
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    private static final String i = "SecureApacheSSLSocketFactory";
    private static volatile SecureApacheSSLSocketFactory j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f22863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f22864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22865c;
    private String[] d;
    private X509TrustManager e;
    private String[] f;
    private String[] g;
    private String[] h;

    private SecureApacheSSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        super(keyStore);
        this.f22864b = null;
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        d.c(i, "sasf update socket factory trust manager");
        try {
            j = new SecureApacheSSLSocketFactory(null, x509TrustManager);
        } catch (IOException unused) {
            d.b(i, "IOException");
        } catch (KeyManagementException unused2) {
            d.b(i, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            d.b(i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            d.b(i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            d.b(i, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            d.b(i, "CertificateException");
        }
    }

    @Deprecated
    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (j == null) {
                    j = new SecureApacheSSLSocketFactory(keyStore, context, (SecureRandom) null);
                }
            }
        }
        return j;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        d.c(i, "createSocket: socket host port autoClose");
        Socket socketCreateSocket = this.f22863a.getSocketFactory().createSocket(socket, str, i2, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22864b = sSLSocket;
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
        return this.f22865c;
    }

    public String[] getProtocols() {
        return this.h;
    }

    public SSLContext getSslContext() {
        return this.f22863a;
    }

    public SSLSocket getSslSocket() {
        return this.f22864b;
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
        this.f22865c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f22863a = sSLContext;
    }

    public void setSslSocket(SSLSocket sSLSocket) {
        this.f22864b = sSLSocket;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.e = x509TrustManager;
    }

    private SecureApacheSSLSocketFactory(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException, NullPointerException {
        super(keyStore);
        this.f22864b = null;
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager secureX509SingleInstance = SecureX509SingleInstance.getInstance(context);
        this.e = secureX509SingleInstance;
        this.f22863a.init(null, new X509TrustManager[]{secureX509SingleInstance}, secureRandom);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        d.c(i, "createSocket: ");
        Socket socketCreateSocket = this.f22863a.getSocketFactory().createSocket();
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22864b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (j == null) {
                    j = new SecureApacheSSLSocketFactory(keyStore, context, secureRandom);
                }
            }
        }
        return j;
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        d.c(i, "sasf update socket factory trust manager");
        try {
            j = new SecureApacheSSLSocketFactory((KeyStore) null, x509TrustManager, secureRandom);
        } catch (IOException unused) {
            d.b(i, "IOException");
        } catch (KeyManagementException unused2) {
            d.b(i, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            d.b(i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            d.b(i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            d.b(i, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            d.b(i, "CertificateException");
        }
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f22864b = null;
        this.f22863a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f22863a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, null);
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

    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f22864b = null;
        this.f22863a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f22863a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, secureRandom);
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f22864b = null;
        this.f22863a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22863a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SecureApacheSSLSocketFactory(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f22864b = null;
        this.f22863a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22863a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
