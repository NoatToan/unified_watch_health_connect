package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigurableSSLSocketFactory extends SocketFactory {
    private final SSLSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLSocketFactory sSLSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i14);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14, InetAddress inetAddress, int i15) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i14, inetAddress, i15);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i14);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i14, inetAddress2, i15);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }
}
