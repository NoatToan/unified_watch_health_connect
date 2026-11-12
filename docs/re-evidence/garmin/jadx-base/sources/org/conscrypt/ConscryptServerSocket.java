package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/* JADX INFO: loaded from: classes3.dex */
final class ConscryptServerSocket extends SSLServerSocket {
    private boolean channelIdEnabled;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    public ConscryptServerSocket(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
        boolean z14 = this.useEngineSocket;
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        AbstractConscryptSocket abstractConscryptSocketCreateEngineSocket = z14 ? Platform.createEngineSocket(sSLParametersImpl) : Platform.createFileDescriptorSocket(sSLParametersImpl);
        abstractConscryptSocketCreateEngineSocket.setChannelIdEnabled(this.channelIdEnabled);
        implAccept(abstractConscryptSocketCreateEngineSocket);
        return abstractConscryptSocketCreateEngineSocket;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public boolean isChannelIdEnabled() {
        return this.channelIdEnabled;
    }

    public void setChannelIdEnabled(boolean z14) {
        this.channelIdEnabled = z14;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnableSessionCreation(boolean z14) {
        this.sslParameters.setEnableSessionCreation(z14);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z14) {
        this.sslParameters.setNeedClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z14) {
        this.sslParameters.setUseClientMode(z14);
    }

    public ConscryptServerSocket setUseEngineSocket(boolean z14) {
        this.useEngineSocket = z14;
        return this;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z14) {
        this.sslParameters.setWantClientAuth(z14);
    }

    public ConscryptServerSocket(int i14, SSLParametersImpl sSLParametersImpl) {
        super(i14);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(int i14, int i15, SSLParametersImpl sSLParametersImpl) {
        super(i14, i15);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(int i14, int i15, InetAddress inetAddress, SSLParametersImpl sSLParametersImpl) {
        super(i14, i15, inetAddress);
        this.sslParameters = sSLParametersImpl;
    }
}
