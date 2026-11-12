package com.tencent.open.a;

import com.tencent.open.log.SLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes46.dex */
public class h extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f31017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrustManager[] f31018b;

    public h() throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagerArrB = b();
        this.f31018b = trustManagerArrB;
        sSLContext.init(null, trustManagerArrB, null);
        this.f31017a = sSLContext.getSocketFactory();
    }

    private TrustManager[] b() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return trustManagers;
            }
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "Unexpected default trust managers: " + Arrays.toString(trustManagers));
            return null;
        } catch (GeneralSecurityException unused) {
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "The system has no TLS. Just give up.");
            return null;
        }
    }

    public TrustManager a() {
        TrustManager[] trustManagerArr = this.f31018b;
        if (trustManagerArr == null || trustManagerArr.length <= 0) {
            return null;
        }
        return trustManagerArr[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return a(this.f31017a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return a(this.f31017a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a(this.f31017a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a(this.f31017a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return a(this.f31017a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f31017a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f31017a.getSupportedCipherSuites();
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
        return socket;
    }
}
