package org.conscrypt;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
class ConscryptFileDescriptorSocket extends OpenSSLSocketImpl implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.PSKCallbacks, SSLParametersImpl.AliasChooser {
    private static final boolean DBG_STATE = false;
    private final ActiveSession activeSession;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private final Object guard;
    private int handshakeTimeoutMilliseconds;

    /* JADX INFO: renamed from: is, reason: collision with root package name */
    private SSLInputStream f133485is;

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private SSLOutputStream f133486os;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;
    private int writeTimeoutMilliseconds;

    public ConscryptFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    private void assertReadableOrWriteableState() {
        int i14 = this.state;
        if (i14 == 5 || i14 == 4) {
            return;
        }
        throw new AssertionError("Invalid state: " + this.state);
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeUnderlyingSocket() throws IOException {
        super.close();
    }

    private void free() {
        if (this.ssl.isClosed()) {
            return;
        }
        this.ssl.close();
        Platform.closeGuardClose(this.guard);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        return NativeSsl.newInstance(sSLParametersImpl, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket);
    }

    private ConscryptSession provideAfterHandshakeSession() {
        return this.state < 2 ? SSLNullSession.getNullSession() : provideSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession nullSession;
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                nullSession = (i14 < 2 || i14 >= 5) ? SSLNullSession.getNullSession() : this.activeSession;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return nullSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
    public ConscryptSession provideSession() {
        synchronized (this.ssl) {
            int i14 = this.state;
            if (i14 == 8) {
                ConscryptSession nullSession = this.closedSession;
                if (nullSession == null) {
                    nullSession = SSLNullSession.getNullSession();
                }
                return nullSession;
            }
            boolean z14 = true;
            boolean z15 = i14 >= 5;
            if (z15) {
                z14 = z15;
            } else {
                try {
                    if (isConnected()) {
                        waitForHandshake();
                    } else {
                        z14 = z15;
                    }
                } catch (IOException unused) {
                }
            }
            z15 = z14;
            return !z15 ? SSLNullSession.getNullSession() : this.activeSession;
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    private void shutdownAndFreeSslNative() throws IOException {
        try {
            Platform.blockGuardOnNetwork();
            this.ssl.shutdown(Platform.getFileDescriptor(this.socket));
        } catch (IOException unused) {
        } finally {
            free();
            closeUnderlyingSocket();
        }
    }

    private void transitionTo(int i14) {
        int i15;
        if (i14 == 8 && !this.ssl.isClosed() && (i15 = this.state) >= 2 && i15 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i14;
    }

    private void waitForHandshake() throws SocketException {
        int i14;
        startHandshake();
        synchronized (this.ssl) {
            while (true) {
                i14 = this.state;
                if (i14 == 5 || i14 == 4 || i14 == 8) {
                    break;
                }
                try {
                    this.ssl.wait();
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted waiting for handshake", e4);
                }
            }
            if (i14 == 8) {
                throw new SocketException("Socket is closed");
            }
        }
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        NativeSsl nativeSsl = this.ssl;
        if (nativeSsl == null) {
            return;
        }
        synchronized (nativeSsl) {
            try {
                int i14 = this.state;
                if (i14 == 8) {
                    return;
                }
                transitionTo(8);
                if (i14 == 0) {
                    free();
                    closeUnderlyingSocket();
                    this.ssl.notifyAll();
                    return;
                }
                if (i14 != 5 && i14 != 4) {
                    this.ssl.interrupt();
                    this.ssl.notifyAll();
                    return;
                }
                this.ssl.notifyAll();
                SSLInputStream sSLInputStream = this.f133485is;
                SSLOutputStream sSLOutputStream = this.f133486os;
                if (sSLInputStream != null || sSLOutputStream != null) {
                    this.ssl.interrupt();
                }
                if (sSLInputStream != null) {
                    sSLInputStream.awaitPendingOps();
                }
                if (sSLOutputStream != null) {
                    sSLOutputStream.awaitPendingOps();
                }
                shutdownAndFreeSslNative();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i14) {
        synchronized (this.ssl) {
            int i15 = this.state;
            if (i15 >= 3 && i15 != 8) {
                return this.ssl.exportKeyingMaterial(str, bArr, i14);
            }
            return null;
        }
    }

    public final void finalize() throws Throwable {
        try {
            Object obj = this.guard;
            if (obj != null) {
                Platform.closeGuardWarnIfOpen(obj);
            }
            NativeSsl nativeSsl = this.ssl;
            if (nativeSsl != null) {
                synchronized (nativeSsl) {
                    transitionTo(8);
                }
            }
            super.finalize();
        } catch (Throwable th3) {
            super.finalize();
            throw th3;
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final SSLSession getActiveSession() {
        return this.activeSession;
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
        return provideAfterHandshakeSession().getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() {
        if (getUseClientMode()) {
            h.z("Client mode");
            return null;
        }
        synchronized (this.ssl) {
            if (this.state != 5) {
                throw new IllegalStateException("Channel ID is only available after handshake completes");
            }
        }
        return this.ssl.getTlsChannelId();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
        String applicationProtocol;
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                applicationProtocol = (i14 < 2 || i14 >= 5) ? null : getApplicationProtocol();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return applicationProtocol;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 < 2 || i14 >= 5) {
                    return null;
                }
                return Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.2
                    @Override // org.conscrypt.ExternalSession.Provider
                    public ConscryptSession provideSession() {
                        return ConscryptFileDescriptorSocket.this.provideHandshakeSession();
                    }
                }));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() throws SocketException {
        SSLInputStream sSLInputStream;
        checkOpen();
        synchronized (this.ssl) {
            try {
                if (this.state == 8) {
                    throw new SocketException("Socket is closed.");
                }
                if (this.f133485is == null) {
                    this.f133485is = new SSLInputStream();
                }
                sSLInputStream = this.f133485is;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        waitForHandshake();
        return sSLInputStream;
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() throws SocketException {
        SSLOutputStream sSLOutputStream;
        checkOpen();
        synchronized (this.ssl) {
            try {
                if (this.state == 8) {
                    throw new SocketException("Socket is closed.");
                }
                if (this.f133486os == null) {
                    this.f133486os = new SSLOutputStream();
                }
                sSLOutputStream = this.f133486os;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        waitForHandshake();
        return sSLOutputStream;
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        return this.externalSession;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final int getSoWriteTimeout() {
        return this.writeTimeoutMilliseconds;
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onNewSessionEstablished(long j8) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j8);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j8), this.activeSession));
        } catch (Exception unused) {
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onSSLStateChange(int i14, int i15) {
        if (i14 != 32) {
            return;
        }
        synchronized (this.ssl) {
            try {
                if (this.state == 8) {
                    return;
                }
                transitionTo(5);
                notifyHandshakeCompletedListeners();
                synchronized (this.ssl) {
                    this.ssl.notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int selectApplicationProtocol(byte[] bArr) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelector = this.sslParameters.getApplicationProtocolSelector();
        if (applicationProtocolSelector == null) {
            return 3;
        }
        return applicationProtocolSelector.selectApplicationProtocol(bArr);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void serverCertificateRequested() {
        synchronized (this.ssl) {
            this.ssl.configureServerCertificate();
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final long serverSessionRequested(byte[] bArr) {
        return 0L;
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z14) {
        if (getUseClientMode()) {
            h.z("Client mode");
            return;
        }
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
            }
        }
        this.sslParameters.channelIdEnabled = z14;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (!getUseClientMode()) {
            h.z("Server mode");
            return;
        }
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
            }
        }
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (privateKey == null) {
            sSLParametersImpl.channelIdEnabled = false;
            this.channelIdPrivateKey = null;
            return;
        }
        sSLParametersImpl.channelIdEnabled = true;
        try {
            ECParameterSpec params = privateKey instanceof ECKey ? ((ECKey) privateKey).getParams() : null;
            if (params == null) {
                params = OpenSSLECGroupContext.getCurveByName("prime256v1").getECParameterSpec();
            }
            this.channelIdPrivateKey = OpenSSLKey.fromECPrivateKeyForTLSStackOnly(privateKey, params);
        } catch (InvalidKeyException unused) {
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z14) {
        this.sslParameters.setEnableSessionCreation(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHandshakeTimeout(int i14) {
        this.handshakeTimeoutMilliseconds = i14;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        super.setHostname(str);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z14) {
        this.sslParameters.setNeedClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setSoWriteTimeout(int i14) {
        this.writeTimeoutMilliseconds = i14;
        Platform.setSocketWriteTimeout(this, i14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z14) {
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalArgumentException("Could not change the mode after the initial handshake has begun.");
            }
        }
        this.sslParameters.setUseClientMode(z14);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z14) {
        this.sslParameters.setUseSessionTickets(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z14) {
        this.sslParameters.setWantClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws SocketException {
        NativeSslSession cachedSession;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state == 0) {
                transitionTo(2);
                boolean z14 = true;
                try {
                    try {
                        Platform.closeGuardOpen(this.guard, "close");
                        this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                        if (getUseClientMode() && (cachedSession = clientSessionContext().getCachedSession(getHostnameOrIP(), getPort(), this.sslParameters)) != null) {
                            cachedSession.offerToResume(this.ssl);
                        }
                        int soTimeout = getSoTimeout();
                        int soWriteTimeout = getSoWriteTimeout();
                        int i14 = this.handshakeTimeoutMilliseconds;
                        if (i14 >= 0) {
                            setSoTimeout(i14);
                            setSoWriteTimeout(this.handshakeTimeoutMilliseconds);
                        }
                        synchronized (this.ssl) {
                            if (this.state == 8) {
                                synchronized (this.ssl) {
                                    transitionTo(8);
                                    this.ssl.notifyAll();
                                }
                                try {
                                    shutdownAndFreeSslNative();
                                    return;
                                } catch (IOException unused) {
                                    return;
                                }
                            }
                            try {
                                this.ssl.doHandshake(Platform.getFileDescriptor(this.socket), getSoTimeout());
                                this.activeSession.onPeerCertificateAvailable(getHostnameOrIP(), getPort());
                                synchronized (this.ssl) {
                                    if (this.state == 8) {
                                        synchronized (this.ssl) {
                                            transitionTo(8);
                                            this.ssl.notifyAll();
                                        }
                                        try {
                                            shutdownAndFreeSslNative();
                                            return;
                                        } catch (IOException unused2) {
                                            return;
                                        }
                                    }
                                    if (this.handshakeTimeoutMilliseconds >= 0) {
                                        setSoTimeout(soTimeout);
                                        setSoWriteTimeout(soWriteTimeout);
                                    }
                                    synchronized (this.ssl) {
                                        try {
                                            int i15 = this.state;
                                            if (i15 != 8) {
                                                z14 = false;
                                            }
                                            if (i15 == 2) {
                                                transitionTo(4);
                                            } else {
                                                transitionTo(5);
                                            }
                                            if (!z14) {
                                                this.ssl.notifyAll();
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    if (z14) {
                                        synchronized (this.ssl) {
                                            transitionTo(8);
                                            this.ssl.notifyAll();
                                        }
                                        try {
                                            shutdownAndFreeSslNative();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                            } catch (CertificateException e4) {
                                SSLHandshakeException sSLHandshakeException = new SSLHandshakeException(e4.getMessage());
                                sSLHandshakeException.initCause(e4);
                                throw sSLHandshakeException;
                            } catch (SSLException e14) {
                                synchronized (this.ssl) {
                                    if (this.state == 8) {
                                        synchronized (this.ssl) {
                                            transitionTo(8);
                                            this.ssl.notifyAll();
                                            try {
                                                shutdownAndFreeSslNative();
                                                return;
                                            } catch (IOException unused4) {
                                                return;
                                            }
                                        }
                                    }
                                    if (e14.getMessage().contains("unexpected CCS")) {
                                        Platform.logEvent("ssl_unexpected_ccs: host=" + getHostnameOrIP());
                                    }
                                    throw e14;
                                }
                            }
                        }
                    } catch (SSLProtocolException e15) {
                        throw ((SSLHandshakeException) new SSLHandshakeException("Handshake failed").initCause(e15));
                    }
                } catch (Throwable th4) {
                    if (1 != 0) {
                        synchronized (this.ssl) {
                            transitionTo(8);
                            this.ssl.notifyAll();
                            try {
                                shutdownAndFreeSslNative();
                            } catch (IOException unused5) {
                            }
                        }
                    }
                    throw th4;
                }
            }
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] x509CertificateArrDecodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager == null) {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                    this.activeSession.onPeerCertificatesReceived(getHostnameOrIP(), getPort(), x509CertificateArrDecodeX509CertificateChain);
                    if (getUseClientMode()) {
                        Platform.checkServerTrusted(x509TrustManager, x509CertificateArrDecodeX509CertificateChain, str, this);
                        return;
                    } else {
                        Platform.checkClientTrusted(x509TrustManager, x509CertificateArrDecodeX509CertificateChain, x509CertificateArrDecodeX509CertificateChain[0].getPublicKey().getAlgorithm(), this);
                        return;
                    }
                }
            } catch (CertificateException e4) {
                throw e4;
            } catch (Exception e14) {
                throw new CertificateException(e14);
            }
        }
        throw new CertificateException("Peer sent no certificate");
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptFileDescriptorSocket(String str, int i14, SSLParametersImpl sSLParametersImpl) {
        super(str, i14);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i14, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(String str, int i14, InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        super(str, i14, inetAddress, i15);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14, inetAddress2, i15);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(Socket socket, String str, int i14, boolean z14, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i14, z14);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.sslParameters = sSLParametersImpl;
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this);
        this.ssl = nativeSslNewSsl;
        this.activeSession = new ActiveSession(nativeSslNewSsl, sSLParametersImpl.getSessionContext());
    }

    public class SSLOutputStream extends OutputStream {
        private final Object writeLock = new Object();

        public SSLOutputStream() {
        }

        public void awaitPendingOps() {
            synchronized (this.writeLock) {
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) throws SocketException {
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i14, i15);
            if (i15 == 0) {
                return;
            }
            synchronized (this.writeLock) {
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
                ConscryptFileDescriptorSocket.this.ssl.write(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i14, i15, ConscryptFileDescriptorSocket.this.writeTimeoutMilliseconds);
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(int i14) throws IOException {
            write(new byte[]{(byte) (i14 & 255)});
        }
    }

    public class SSLInputStream extends InputStream {
        private final Object readLock = new Object();

        public SSLInputStream() {
        }

        @Override // java.io.InputStream
        public int available() {
            return ConscryptFileDescriptorSocket.this.ssl.getPendingReadableBytes();
        }

        public void awaitPendingOps() {
            synchronized (this.readLock) {
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i14, int i15) throws SocketException {
            int i16;
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i14, i15);
            if (i15 == 0) {
                return 0;
            }
            synchronized (this.readLock) {
                try {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                    i16 = ConscryptFileDescriptorSocket.this.ssl.read(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i14, i15, ConscryptFileDescriptorSocket.this.getSoTimeout());
                    if (i16 == -1) {
                        synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                            try {
                                if (ConscryptFileDescriptorSocket.this.state == 8) {
                                    throw new SocketException("socket is closed");
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return i16;
        }

        @Override // java.io.InputStream
        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }
    }
}
