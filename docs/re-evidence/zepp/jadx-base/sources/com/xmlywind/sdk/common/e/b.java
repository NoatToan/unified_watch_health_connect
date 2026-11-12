package com.xmlywind.sdk.common.e;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.xmlywind.logger.SigmobLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes22.dex */
public class b extends SSLSocketFactory {
    private static final TrustManager[] b = {new X509TrustManager() { // from class: com.xmlywind.sdk.common.e.b.1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }};
    private SSLSocketFactory a;

    private b() {
    }

    public static b a() {
        NoSuchAlgorithmException e;
        SSLContext sSLContext;
        KeyManagementException e2;
        String message;
        b bVar = new b();
        try {
            sSLContext = SSLContext.getInstance("SSL");
            try {
                sSLContext.init(null, b, new SecureRandom());
            } catch (KeyManagementException e3) {
                e2 = e3;
                message = e2.getMessage();
                SigmobLog.e(message);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                message = e.getMessage();
                SigmobLog.e(message);
            }
        } catch (KeyManagementException e5) {
            e2 = e5;
            sSLContext = null;
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
            sSLContext = null;
        }
        if (sSLContext == null) {
            return null;
        }
        bVar.a = sSLContext.getSocketFactory();
        return bVar;
    }

    public static b a(int i) {
        b bVar = new b();
        bVar.a = SSLCertificateSocketFactory.getDefault(i, null);
        return bVar;
    }

    private static void a(SSLCertificateSocketFactory sSLCertificateSocketFactory, SSLSocket sSLSocket, String str) {
        com.xmlywind.sdk.common.utils.m.a.a(sSLCertificateSocketFactory);
        com.xmlywind.sdk.common.utils.m.a.a(sSLSocket);
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            return;
        }
        try {
            new com.xmlywind.sdk.common.utils.n.a(sSLSocket, "setHostname").a(String.class, str).a();
        } catch (Throwable unused) {
            SigmobLog.d("Unable to call setHostname() on the socket");
        }
    }

    private void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
    }

    private void a(Socket socket, String str) throws SocketException {
        com.xmlywind.sdk.common.utils.m.a.a(socket);
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        if (socket instanceof SSLSocket) {
            try {
                SSLSocket sSLSocket = (SSLSocket) socket;
                if (sSLSocketFactory instanceof SSLCertificateSocketFactory) {
                    a((SSLCertificateSocketFactory) sSLSocketFactory, sSLSocket, str);
                    a(sSLSocket, str);
                }
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
    }

    private static void a(SSLSocket sSLSocket, String str) throws IOException {
        com.xmlywind.sdk.common.utils.m.a.a(sSLSocket);
        sSLSocket.startHandshake();
        if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Server Name Identification failed.");
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws SocketException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws SocketException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(str, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws SocketException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(str, i, inetAddress, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws SocketException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(inetAddress, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        SSLSocketFactory sSLSocketFactory = this.a;
        if (sSLSocketFactory == null) {
            throw new SocketException("SSLSocketFactory was null. Unable to create socket.");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, str, i, z);
            a(socketCreateSocket);
            return socketCreateSocket;
        }
        if (z && socket != null) {
            socket.close();
        }
        Socket socketCreateSocket2 = this.a.createSocket(c.a(str), i);
        a(socketCreateSocket2);
        a(socketCreateSocket2, str);
        return socketCreateSocket2;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        SSLSocketFactory sSLSocketFactory = this.a;
        return sSLSocketFactory == null ? new String[0] : sSLSocketFactory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        SSLSocketFactory sSLSocketFactory = this.a;
        return sSLSocketFactory == null ? new String[0] : sSLSocketFactory.getSupportedCipherSuites();
    }
}
