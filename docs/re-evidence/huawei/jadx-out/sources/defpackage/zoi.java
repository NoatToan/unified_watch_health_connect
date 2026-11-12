package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import lib.android.paypal.com.magnessdk.log.a;

/* JADX INFO: loaded from: classes46.dex */
final class zoi extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TrustManager[] f54388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocketFactory f54389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SSLContext f54390c;
    private TrustManager[] e;

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f54389b.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f54389b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return c(this.f54389b.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return c(this.f54389b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return c(this.f54389b.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return c(this.f54389b.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return c(this.f54389b.createSocket(str, i));
    }

    private TrustManager[] a() {
        if (this.e == null) {
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                for (Certificate certificate : CertificateFactory.getInstance("X.509").generateCertificates(zof.d())) {
                    if (certificate instanceof X509Certificate) {
                        keyStore.setCertificateEntry(((X509Certificate) certificate).getSubjectDN().getName(), certificate);
                    }
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                this.f54388a = trustManagerFactory.getTrustManagers();
            } catch (Exception e) {
                a.e((Class<?>) zoi.class, 3, e);
            }
            this.e = this.f54388a;
        }
        return this.e;
    }

    static zoi c() {
        return new zoi();
    }

    private Socket c(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            ArrayList arrayList = new ArrayList(Arrays.asList(sSLSocket.getSupportedProtocols()));
            arrayList.retainAll(Arrays.asList("TLSv1.2", "TLSv1.1", "TLSv1"));
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        return socket;
    }

    private zoi() {
        try {
            this.f54390c = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArrA = a();
            this.f54388a = trustManagerArrA;
            this.f54390c.init(null, trustManagerArrA, null);
            this.f54389b = this.f54390c.getSocketFactory();
        } catch (Exception e) {
            a.e((Class<?>) zoi.class, 3, e);
        }
    }
}
