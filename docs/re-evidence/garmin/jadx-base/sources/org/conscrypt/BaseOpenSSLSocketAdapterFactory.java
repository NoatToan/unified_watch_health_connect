package org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseOpenSSLSocketAdapterFactory extends SSLSocketFactory {
    private final OpenSSLSocketFactoryImpl delegate;

    public BaseOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        this.delegate = openSSLSocketFactoryImpl;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public abstract Socket wrap(OpenSSLSocketImpl openSSLSocketImpl);

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i14));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14, InetAddress inetAddress, int i15) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i14, inetAddress, i15));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i14));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i14, inetAddress2, i15));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i14, boolean z14) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(socket, str, i14, z14));
    }
}
