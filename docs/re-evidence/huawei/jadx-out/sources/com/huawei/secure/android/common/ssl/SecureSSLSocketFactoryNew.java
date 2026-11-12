package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class SecureSSLSocketFactoryNew extends SSLSocketFactory {
    private static final String i = "SSLFNew";
    private static volatile SecureSSLSocketFactoryNew j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SSLContext f22869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SSLSocket f22870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f22871c;
    protected String[] d;
    protected X509TrustManager e;
    protected String[] f;
    protected String[] g;
    protected String[] h;

    @Deprecated
    public SecureSSLSocketFactoryNew(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f22869a = null;
        this.f22870b = null;
        this.f22869a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f22869a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, null);
    }

    private void a(Socket socket) {
        boolean enabledProtocols;
        boolean whiteListCipherSuites = false;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.h)) {
            enabledProtocols = false;
        } else {
            d.c(i, "set protocols");
            enabledProtocols = SSLUtil.setEnabledProtocols((SSLSocket) socket, this.h);
        }
        if (!com.huawei.secure.android.common.ssl.util.a.a(this.g) || !com.huawei.secure.android.common.ssl.util.a.a(this.f)) {
            d.c(i, "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            whiteListCipherSuites = !com.huawei.secure.android.common.ssl.util.a.a(this.g) ? SSLUtil.setWhiteListCipherSuites(sSLSocket, this.g) : SSLUtil.setBlackListCipherSuites(sSLSocket, this.f);
        }
        if (!enabledProtocols) {
            d.c(i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (whiteListCipherSuites) {
            return;
        }
        d.c(i, "set default cipher");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    public static SecureSSLSocketFactoryNew getInstance(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureSSLSocketFactoryNew.class) {
                if (j == null) {
                    j = new SecureSSLSocketFactoryNew(context, (SecureRandom) null);
                }
            }
        }
        if (j.f22871c == null && context != null) {
            j.setContext(context);
        }
        d.a(i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) throws IOException {
        d.c(i, "createSocket: host , port");
        Socket socketCreateSocket = this.f22869a.getSocketFactory().createSocket(str, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22870b = sSLSocket;
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
        return this.f22871c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getProtocols() {
        return this.h;
    }

    public SSLContext getSslContext() {
        return this.f22869a;
    }

    public SSLSocket getSslSocket() {
        return this.f22870b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
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
        this.f22871c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f22869a = sSLContext;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException {
        return createSocket(str, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        d.c(i, "createSocket");
        Socket socketCreateSocket = this.f22869a.getSocketFactory().createSocket(socket, str, i2, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22870b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public static SecureSSLSocketFactoryNew getInstance(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SecureSSLSocketFactoryNew.class) {
                if (j == null) {
                    j = new SecureSSLSocketFactoryNew(context, secureRandom);
                }
            }
        }
        if (j.f22871c == null && context != null) {
            j.setContext(context);
        }
        d.a(i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return j;
    }

    public SecureSSLSocketFactoryNew(InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f22869a = null;
        this.f22870b = null;
        this.f22869a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f22869a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, secureRandom);
    }

    private SecureSSLSocketFactoryNew(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, NullPointerException {
        this.f22869a = null;
        this.f22870b = null;
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager secureX509SingleInstance = SecureX509SingleInstance.getInstance(context);
        this.e = secureX509SingleInstance;
        this.f22869a.init(null, new X509TrustManager[]{secureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactoryNew(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f22869a = null;
        this.f22870b = null;
        this.f22869a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22869a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SecureSSLSocketFactoryNew(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f22869a = null;
        this.f22870b = null;
        this.f22869a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22869a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
