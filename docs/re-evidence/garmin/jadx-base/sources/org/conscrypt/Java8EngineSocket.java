package org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
final class Java8EngineSocket extends ConscryptEngineSocket {
    private BiFunction<SSLSocket, List<String>, String> selector;

    public Java8EngineSocket(SSLParametersImpl sSLParametersImpl) {
        super(sSLParametersImpl);
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(final BiFunction<SSLSocket, List<String>, String> biFunction) {
        if (biFunction == null) {
            return null;
        }
        return new ApplicationProtocolSelector() { // from class: org.conscrypt.Java8EngineSocket.1
            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list) {
                return (String) biFunction.apply(sSLSocket, list);
            }

            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // javax.net.ssl.SSLSocket
    public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
        return this.selector;
    }

    @Override // javax.net.ssl.SSLSocket
    public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> biFunction) {
        this.selector = biFunction;
        setApplicationProtocolSelector(toApplicationProtocolSelector(biFunction));
    }

    public Java8EngineSocket(String str, int i14, SSLParametersImpl sSLParametersImpl) {
        super(str, i14, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i14, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14, sSLParametersImpl);
    }

    public Java8EngineSocket(String str, int i14, InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        super(str, i14, inetAddress, i15, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14, inetAddress2, i15, sSLParametersImpl);
    }

    public Java8EngineSocket(Socket socket, String str, int i14, boolean z14, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i14, z14, sSLParametersImpl);
    }
}
