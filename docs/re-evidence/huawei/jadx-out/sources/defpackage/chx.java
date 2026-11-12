package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public class chx extends SSLSocketFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SSLSocketFactory f1616c;

    public chx() {
        cib.b("HuaweiOpenSSLSocketFactory", "init HuaweiOpenSSLSocketFactory");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, new TrustManager[]{new chu()}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            if (socketFactory == null) {
                cib.d("HuaweiOpenSSLSocketFactory", "socketFactory is null error!");
            }
            this.f1616c = socketFactory;
        } catch (KeyManagementException e) {
            cib.d("HuaweiOpenSSLSocketFactory", "sslContext init failed." + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            cib.d("HuaweiOpenSSLSocketFactory", "get SSLContext instance failed. " + e2.getMessage());
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket();
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket(inetAddress, i, inetAddress2, i2);
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket(inetAddress, i);
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket(socket, str, i, z);
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket(str, i, inetAddress, i2);
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f1616c.createSocket(str, i);
        b(socketCreateSocket);
        return socketCreateSocket;
    }

    private void b(Socket socket) {
        cib.b("HuaweiOpenSSLSocketFactory", "enter setEnableSafeCipherSuites");
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            if (enabledCipherSuites == null || enabledCipherSuites.length == 0) {
                cib.d("HuaweiOpenSSLSocketFactory", "Current enabled cipherSuites is invalid!");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                if (chy.f1617a.contains(str)) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            return;
        }
        cib.d("HuaweiOpenSSLSocketFactory", "socket is not instanceof SSLSocket");
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f1616c.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f1616c.getSupportedCipherSuites();
    }
}
