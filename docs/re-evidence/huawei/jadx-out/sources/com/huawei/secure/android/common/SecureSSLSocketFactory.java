package com.huawei.secure.android.common;

import android.content.Context;
import com.huawei.secure.android.common.ssl.SSLUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class SecureSSLSocketFactory extends SSLSocketFactory {
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SecureSSLSocketFactory f22725c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f22726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22727b;

    private SecureSSLSocketFactory(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f22726a = null;
        this.f22727b = context;
        this.f22726a = SSLUtil.setSSLContext();
        this.f22726a.init(null, new X509TrustManager[]{new SecureX509TrustManager(this.f22727b)}, secureRandom);
    }

    private void a(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLUtil.setEnabledProtocols(sSLSocket);
        SSLUtil.setEnableSafeCipherSuites(sSLSocket);
    }

    @Deprecated
    public static SecureSSLSocketFactory getInstance(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        if (f22725c == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f22725c == null) {
                    f22725c = new SecureSSLSocketFactory(context, (SecureRandom) null);
                }
            }
        }
        return f22725c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f22726a.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f22726a.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Deprecated
    public static SecureSSLSocketFactory getInstance(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        if (f22725c == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f22725c == null) {
                    f22725c = new SecureSSLSocketFactory(context, secureRandom);
                }
            }
        }
        return f22725c;
    }

    @Deprecated
    public SecureSSLSocketFactory(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f22726a = null;
        this.f22726a = SSLUtil.setSSLContext();
        this.f22726a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, null);
    }

    @Deprecated
    public SecureSSLSocketFactory(InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f22726a = null;
        this.f22726a = SSLUtil.setSSLContext();
        this.f22726a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, secureRandom);
    }
}
