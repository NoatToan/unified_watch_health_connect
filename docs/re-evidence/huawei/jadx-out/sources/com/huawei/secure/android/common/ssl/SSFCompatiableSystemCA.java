package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
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
public class SSFCompatiableSystemCA extends SSLSocketFactory {
    private static final String i = "SSFCompatiableSystemCA";
    private static volatile SSFCompatiableSystemCA j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f22856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22857c;
    private String[] d;
    private X509TrustManager e;
    private String[] f;
    private String[] g;
    private String[] h;

    private SSFCompatiableSystemCA(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, NullPointerException {
        this.f22855a = null;
        this.f22856b = null;
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager sSFSecureX509SingleInstance = SSFSecureX509SingleInstance.getInstance(context);
        this.e = sSFSecureX509SingleInstance;
        this.f22855a.init(null, new X509TrustManager[]{sSFSecureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        d.c(i, "ssfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            j = new SSFCompatiableSystemCA(x509TrustManager);
        } catch (KeyManagementException unused) {
            d.b(i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            d.b(i, "NoSuchAlgorithmException");
        }
        d.a(i, "SSF system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public static SSFCompatiableSystemCA getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SSFCompatiableSystemCA.class) {
                if (j == null) {
                    j = new SSFCompatiableSystemCA(context, (SecureRandom) null);
                }
            }
        }
        if (j.f22857c == null && context != null) {
            j.setContext(context);
        }
        return j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) throws IOException {
        d.c(i, "createSocket: host , port");
        Socket socketCreateSocket = this.f22855a.getSocketFactory().createSocket(str, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22856b = sSLSocket;
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
        return this.f22857c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getProtocols() {
        return this.h;
    }

    public SSLContext getSslContext() {
        return this.f22855a;
    }

    public SSLSocket getSslSocket() {
        return this.f22856b;
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
        this.f22857c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f22855a = sSLContext;
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
        d.c(i, "createSocket: s , host , port , autoClose");
        Socket socketCreateSocket = this.f22855a.getSocketFactory().createSocket(socket, str, i2, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f22856b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public static SSFCompatiableSystemCA getInstance(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (j == null) {
            synchronized (SSFCompatiableSystemCA.class) {
                if (j == null) {
                    j = new SSFCompatiableSystemCA(context, secureRandom);
                }
            }
        }
        if (j.f22857c == null && context != null) {
            j.setContext(context);
        }
        return j;
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        d.c(i, "ssfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            j = new SSFCompatiableSystemCA(x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            d.b(i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            d.b(i, "NoSuchAlgorithmException");
        }
        d.a(i, "SSF system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public SSFCompatiableSystemCA(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f22855a = null;
        this.f22856b = null;
        this.f22855a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22855a.init(null, new X509TrustManager[]{x509TrustManager}, null);
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

    public SSFCompatiableSystemCA(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f22855a = null;
        this.f22856b = null;
        this.f22855a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f22855a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }
}
