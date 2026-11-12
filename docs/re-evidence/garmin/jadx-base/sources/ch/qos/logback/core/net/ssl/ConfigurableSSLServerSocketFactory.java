package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigurableSSLServerSocketFactory extends ServerSocketFactory {
    private final SSLServerSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLServerSocketFactory sSLServerSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLServerSocketFactory;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i14) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i14);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i14, int i15) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i14, i15);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i14, int i15, InetAddress inetAddress) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i14, i15, inetAddress);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }
}
