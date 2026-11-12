package ch.qos.logback.core.net.ssl;

import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes7.dex */
public class SSLConfigurableSocket implements SSLConfigurable {
    private final SSLSocket delegate;

    public SSLConfigurableSocket(SSLSocket sSLSocket) {
        this.delegate = sSLSocket;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledCipherSuites(String[] strArr) {
        this.delegate.setEnabledCipherSuites(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledProtocols(String[] strArr) {
        this.delegate.setEnabledProtocols(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setNeedClientAuth(boolean z14) {
        this.delegate.setNeedClientAuth(z14);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setWantClientAuth(boolean z14) {
        this.delegate.setWantClientAuth(z14);
    }
}
