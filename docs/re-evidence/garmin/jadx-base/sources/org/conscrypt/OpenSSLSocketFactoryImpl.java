package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.KeyManagementException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class OpenSSLSocketFactoryImpl extends SSLSocketFactory {
    private static boolean useEngineSocketByDefault = SSLUtils.USE_ENGINE_SOCKET_BY_DEFAULT;
    private final IOException instantiationException;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    public OpenSSLSocketFactoryImpl() {
        IOException iOException;
        this.useEngineSocket = useEngineSocketByDefault;
        SSLParametersImpl sSLParametersImpl = null;
        try {
            iOException = null;
            sSLParametersImpl = SSLParametersImpl.getDefault();
        } catch (KeyManagementException e4) {
            iOException = new IOException("Delayed instantiation exception:", e4);
        }
        this.sslParameters = sSLParametersImpl;
        this.instantiationException = iOException;
    }

    private boolean hasFileDescriptor(Socket socket) {
        try {
            Platform.getFileDescriptor(socket);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static void setUseEngineSocketByDefault(boolean z14) {
        useEngineSocketByDefault = z14;
        SocketFactory socketFactory = SSLSocketFactory.getDefault();
        if (socketFactory instanceof OpenSSLSocketFactoryImpl) {
            ((OpenSSLSocketFactoryImpl) socketFactory).setUseEngineSocket(z14);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i14, boolean z14) throws SocketException {
        Preconditions.checkNotNull(socket, "socket");
        if (socket.isConnected()) {
            return (this.useEngineSocket || !hasFileDescriptor(socket)) ? Platform.createEngineSocket(socket, str, i14, z14, (SSLParametersImpl) this.sslParameters.clone()) : Platform.createFileDescriptorSocket(socket, str, i14, z14, (SSLParametersImpl) this.sslParameters.clone());
        }
        throw new SocketException("Socket is not connected.");
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public void setUseEngineSocket(boolean z14) {
        this.useEngineSocket = z14;
    }

    public OpenSSLSocketFactoryImpl(SSLParametersImpl sSLParametersImpl) {
        this.useEngineSocket = useEngineSocketByDefault;
        this.sslParameters = sSLParametersImpl;
        this.instantiationException = null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14) {
        boolean z14 = this.useEngineSocket;
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (z14) {
            return Platform.createEngineSocket(str, i14, (SSLParametersImpl) sSLParametersImpl.clone());
        }
        return Platform.createFileDescriptorSocket(str, i14, (SSLParametersImpl) sSLParametersImpl.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i14, InetAddress inetAddress, int i15) {
        boolean z14 = this.useEngineSocket;
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (z14) {
            return Platform.createEngineSocket(str, i14, inetAddress, i15, (SSLParametersImpl) sSLParametersImpl.clone());
        }
        return Platform.createFileDescriptorSocket(str, i14, inetAddress, i15, (SSLParametersImpl) sSLParametersImpl.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14) {
        boolean z14 = this.useEngineSocket;
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (z14) {
            return Platform.createEngineSocket(inetAddress, i14, (SSLParametersImpl) sSLParametersImpl.clone());
        }
        return Platform.createFileDescriptorSocket(inetAddress, i14, (SSLParametersImpl) sSLParametersImpl.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15) {
        boolean z14 = this.useEngineSocket;
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (z14) {
            return Platform.createEngineSocket(inetAddress, i14, inetAddress2, i15, (SSLParametersImpl) sSLParametersImpl.clone());
        }
        return Platform.createFileDescriptorSocket(inetAddress, i14, inetAddress2, i15, (SSLParametersImpl) sSLParametersImpl.clone());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        IOException iOException = this.instantiationException;
        if (iOException == null) {
            boolean z14 = this.useEngineSocket;
            SSLParametersImpl sSLParametersImpl = this.sslParameters;
            if (z14) {
                return Platform.createEngineSocket((SSLParametersImpl) sSLParametersImpl.clone());
            }
            return Platform.createFileDescriptorSocket((SSLParametersImpl) sSLParametersImpl.clone());
        }
        throw iOException;
    }
}
