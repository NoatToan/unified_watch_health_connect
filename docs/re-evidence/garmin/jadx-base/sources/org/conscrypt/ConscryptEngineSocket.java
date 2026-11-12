package org.conscrypt;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
class ConscryptEngineSocket extends OpenSSLSocketImpl implements SSLParametersImpl.AliasChooser {
    private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocate(0);
    private BufferAllocator bufferAllocator;
    private final ConscryptEngine engine;
    private final Object handshakeLock;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private SSLInputStream f133484in;
    private SSLOutputStream out;
    private int state;
    private final Object stateLock;

    /* JADX INFO: renamed from: org.conscrypt.ConscryptEngineSocket$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$Status = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConscryptEngineSocket(SSLParametersImpl sSLParametersImpl) {
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandshake() throws IOException {
        boolean z14 = false;
        while (!z14) {
            try {
                int i14 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.engine.getHandshakeStatus().ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        this.out.writeInternal(EMPTY_BUFFER);
                        this.out.flushInternal();
                    } else {
                        if (i14 == 3) {
                            throw new IllegalStateException("Engine tasks are unsupported");
                        }
                        if (i14 != 4 && i14 != 5) {
                            throw new IllegalStateException("Unknown handshake status: " + this.engine.getHandshakeStatus());
                        }
                        z14 = true;
                    }
                } else if (this.f133484in.processDataFromSocket(EmptyArray.BYTE, 0, 0) < 0) {
                    throw SSLUtils.toSSLHandshakeException(new EOFException("connection closed"));
                }
            } catch (SSLException e4) {
                drainOutgoingQueue();
                close();
                throw e4;
            } catch (IOException e14) {
                close();
                throw e14;
            } catch (Exception e15) {
                close();
                throw SSLUtils.toSSLHandshakeException(e15);
            }
        }
    }

    private void drainOutgoingQueue() {
        while (this.engine.pendingOutboundEncryptedBytes() > 0) {
            try {
                this.out.writeInternal(EMPTY_BUFFER);
                this.out.flushInternal();
            } catch (IOException unused) {
                return;
            }
        }
    }

    private static X509TrustManager getDelegatingTrustManager(X509TrustManager x509TrustManager, final ConscryptEngineSocket conscryptEngineSocket) {
        if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
            return x509TrustManager;
        }
        final X509ExtendedTrustManager x509ExtendedTrustManager = (X509ExtendedTrustManager) x509TrustManager;
        return new X509ExtendedTrustManager() { // from class: org.conscrypt.ConscryptEngineSocket.2
            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return x509ExtendedTrustManager.getAcceptedIssuers();
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getUnderlyingInputStream() {
        return super.getInputStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getUnderlyingOutputStream() {
        return super.getOutputStream();
    }

    private static ConscryptEngine newEngine(SSLParametersImpl sSLParametersImpl, ConscryptEngineSocket conscryptEngineSocket) {
        ConscryptEngine conscryptEngine = new ConscryptEngine(Platform.supportsX509ExtendedTrustManager() ? sSLParametersImpl.cloneWithTrustManager(getDelegatingTrustManager(sSLParametersImpl.getX509TrustManager(), conscryptEngineSocket)) : sSLParametersImpl, conscryptEngineSocket.peerInfoProvider(), conscryptEngineSocket);
        conscryptEngine.setHandshakeListener(new HandshakeListener() { // from class: org.conscrypt.ConscryptEngineSocket.1
            @Override // org.conscrypt.HandshakeListener
            public void onHandshakeFinished() {
                ConscryptEngineSocket.this.onHandshakeFinished();
            }
        });
        conscryptEngine.setUseClientMode(sSLParametersImpl.getUseClientMode());
        return conscryptEngine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onHandshakeFinished() {
        boolean z14;
        synchronized (this.stateLock) {
            try {
                int i14 = this.state;
                if (i14 != 8) {
                    if (i14 == 2) {
                        this.state = 4;
                    } else if (i14 == 3) {
                        this.state = 5;
                    }
                    this.stateLock.notifyAll();
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            notifyHandshakeCompletedListeners();
        }
    }

    private void waitForHandshake() throws IOException {
        int i14;
        startHandshake();
        synchronized (this.stateLock) {
            while (true) {
                i14 = this.state;
                if (i14 == 5 || i14 == 4 || i14 == 8) {
                    break;
                }
                try {
                    this.stateLock.wait();
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

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.stateLock;
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                int i14 = this.state;
                if (i14 == 8) {
                    return;
                }
                this.state = 8;
                this.stateLock.notifyAll();
                try {
                    this.engine.closeInbound();
                    this.engine.closeOutbound();
                    if (i14 >= 2) {
                        drainOutgoingQueue();
                        this.engine.closeOutbound();
                    }
                    try {
                        super.close();
                        if (this.f133484in != null) {
                        }
                    } finally {
                        if (this.f133484in != null) {
                            this.f133484in.release();
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        super.close();
                        if (this.f133484in != null) {
                        }
                        throw th3;
                    } finally {
                        if (this.f133484in != null) {
                            this.f133484in.release();
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i14) {
        return this.engine.exportKeyingMaterial(str, bArr, i14);
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final SSLSession getActiveSession() {
        return this.engine.getSession();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
        return this.engine.getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final String[] getApplicationProtocols() {
        return this.engine.getApplicationProtocols();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() {
        return this.engine.getChannelId();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.engine.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.engine.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.engine.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
        return this.engine.getHandshakeApplicationProtocol();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        return this.engine.handshakeSession();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() throws IOException {
        checkOpen();
        waitForHandshake();
        return this.f133484in;
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.engine.getNeedClientAuth();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() throws IOException {
        checkOpen();
        waitForHandshake();
        return this.out;
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        return this.engine.getSSLParameters();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        if (isConnected()) {
            try {
                waitForHandshake();
            } catch (IOException unused) {
            }
        }
        return this.engine.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.engine.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.engine.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] getTlsUnique() {
        return this.engine.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.engine.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.engine.getWantClientAuth();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocols(String[] strArr) {
        this.engine.setApplicationProtocols(strArr);
    }

    public void setBufferAllocator(BufferAllocator bufferAllocator) {
        this.engine.setBufferAllocator(bufferAllocator);
        this.bufferAllocator = bufferAllocator;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z14) {
        this.engine.setChannelIdEnabled(z14);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.engine.setChannelIdPrivateKey(privateKey);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z14) {
        this.engine.setEnableSessionCreation(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.engine.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.engine.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public void setHandshakeTimeout(int i14) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
        this.engine.setHostname(str);
        super.setHostname(str);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z14) {
        this.engine.setNeedClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        this.engine.setSSLParameters(sSLParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z14) {
        this.engine.setUseClientMode(z14);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z14) {
        this.engine.setUseSessionTickets(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z14) {
        this.engine.setWantClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
        checkOpen();
        try {
            synchronized (this.handshakeLock) {
                synchronized (this.stateLock) {
                    if (this.state == 0) {
                        this.state = 2;
                        this.engine.beginHandshake();
                        this.f133484in = new SSLInputStream();
                        this.out = new SSLOutputStream();
                        doHandshake();
                    }
                }
            }
        } catch (SSLException e4) {
            close();
            throw e4;
        } catch (IOException e14) {
            close();
            throw e14;
        } catch (Exception e15) {
            close();
            throw SSLUtils.toSSLHandshakeException(e15);
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.engine.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public final class SSLOutputStream extends OutputStream {
        private OutputStream socketOutputStream;
        private final ByteBuffer target;
        private final int targetArrayOffset;
        private final Object writeLock = new Object();

        public SSLOutputStream() {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.target = byteBufferAllocate;
            this.targetArrayOffset = byteBufferAllocate.arrayOffset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void flushInternal() throws IOException {
            ConscryptEngineSocket.this.checkOpen();
            init();
            this.socketOutputStream.flush();
        }

        private void init() {
            if (this.socketOutputStream == null) {
                this.socketOutputStream = ConscryptEngineSocket.this.getUnderlyingOutputStream();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeInternal(ByteBuffer byteBuffer) throws IOException {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            int iRemaining = byteBuffer.remaining();
            do {
                this.target.clear();
                SSLEngineResult sSLEngineResultWrap = ConscryptEngineSocket.this.engine.wrap(byteBuffer, this.target);
                if (sSLEngineResultWrap.getStatus() != SSLEngineResult.Status.OK && sSLEngineResultWrap.getStatus() != SSLEngineResult.Status.CLOSED) {
                    throw new SSLException("Unexpected engine result " + sSLEngineResultWrap.getStatus());
                }
                if (this.target.position() != sSLEngineResultWrap.bytesProduced()) {
                    throw new SSLException("Engine bytesProduced " + sSLEngineResultWrap.bytesProduced() + " does not match bytes written " + this.target.position());
                }
                iRemaining -= sSLEngineResultWrap.bytesConsumed();
                if (iRemaining != byteBuffer.remaining()) {
                    throw new SSLException("Engine did not read the correct number of bytes");
                }
                if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.CLOSED && sSLEngineResultWrap.bytesProduced() == 0) {
                    if (iRemaining > 0) {
                        throw new SocketException("Socket closed");
                    }
                    return;
                } else {
                    this.target.flip();
                    writeToSocket();
                }
            } while (iRemaining > 0);
        }

        private void writeToSocket() throws IOException {
            this.socketOutputStream.write(this.target.array(), this.targetArrayOffset, this.target.limit());
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                flushInternal();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i14) throws IOException {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                write(new byte[]{(byte) i14});
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr));
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) throws IOException {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr, i14, i15));
            }
        }
    }

    public ConscryptEngineSocket(String str, int i14, SSLParametersImpl sSLParametersImpl) {
        super(str, i14);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i14, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(String str, int i14, InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        super(str, i14, inetAddress, i15);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i14, InetAddress inetAddress2, int i15, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i14, inetAddress2, i15);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public final class SSLInputStream extends InputStream {
        private final AllocatedBuffer allocatedBuffer;
        private final ByteBuffer fromEngine;
        private final ByteBuffer fromSocket;
        private final int fromSocketArrayOffset;
        private final Object readLock = new Object();
        private final byte[] singleByte = new byte[1];
        private InputStream socketInputStream;

        public SSLInputStream() {
            if (ConscryptEngineSocket.this.bufferAllocator != null) {
                AllocatedBuffer allocatedBufferAllocateDirectBuffer = ConscryptEngineSocket.this.bufferAllocator.allocateDirectBuffer(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
                this.allocatedBuffer = allocatedBufferAllocateDirectBuffer;
                this.fromEngine = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                this.allocatedBuffer = null;
                this.fromEngine = ByteBuffer.allocateDirect(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
            }
            this.fromEngine.flip();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.fromSocket = byteBufferAllocate;
            this.fromSocketArrayOffset = byteBufferAllocate.arrayOffset();
        }

        private void init() {
            if (this.socketInputStream == null) {
                this.socketInputStream = ConscryptEngineSocket.this.getUnderlyingInputStream();
            }
        }

        private boolean isHandshakeFinished() {
            boolean z14;
            synchronized (ConscryptEngineSocket.this.stateLock) {
                z14 = ConscryptEngineSocket.this.state >= 4;
            }
            return z14;
        }

        private boolean isHandshaking(SSLEngineResult.HandshakeStatus handshakeStatus) {
            int i14 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[handshakeStatus.ordinal()];
            return i14 == 1 || i14 == 2 || i14 == 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int processDataFromSocket(byte[] bArr, int i14, int i15) throws SocketException, SSLException {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            while (this.fromEngine.remaining() <= 0) {
                this.fromSocket.flip();
                this.fromEngine.clear();
                boolean zIsHandshaking = isHandshaking(ConscryptEngineSocket.this.engine.getHandshakeStatus());
                SSLEngineResult sSLEngineResultUnwrap = ConscryptEngineSocket.this.engine.unwrap(this.fromSocket, this.fromEngine);
                this.fromSocket.compact();
                this.fromEngine.flip();
                int i16 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[sSLEngineResultUnwrap.getStatus().ordinal()];
                boolean z14 = true;
                if (i16 == 1) {
                    if (sSLEngineResultUnwrap.bytesProduced() != 0) {
                    }
                    if (z14 && sSLEngineResultUnwrap.bytesProduced() == 0) {
                        return 0;
                    }
                    if (!z14 && readFromSocket() == -1) {
                        return -1;
                    }
                } else {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            return -1;
                        }
                        throw new SSLException("Unexpected engine result " + sSLEngineResultUnwrap.getStatus());
                    }
                    if (!zIsHandshaking && isHandshaking(sSLEngineResultUnwrap.getHandshakeStatus()) && isHandshakeFinished()) {
                        renegotiate();
                        return 0;
                    }
                }
                z14 = false;
                if (z14) {
                }
                if (!z14) {
                }
            }
            int iMin = Math.min(this.fromEngine.remaining(), i15);
            this.fromEngine.get(bArr, i14, iMin);
            return iMin;
        }

        private int readFromSocket() throws IOException {
            try {
                int iPosition = this.fromSocket.position();
                int i14 = this.socketInputStream.read(this.fromSocket.array(), this.fromSocketArrayOffset + iPosition, this.fromSocket.limit() - iPosition);
                if (i14 > 0) {
                    this.fromSocket.position(iPosition + i14);
                }
                return i14;
            } catch (EOFException unused) {
                return -1;
            }
        }

        private int readUntilDataAvailable(byte[] bArr, int i14, int i15) throws SocketException, SSLException {
            int iProcessDataFromSocket;
            do {
                iProcessDataFromSocket = processDataFromSocket(bArr, i14, i15);
            } while (iProcessDataFromSocket == 0);
            return iProcessDataFromSocket;
        }

        private void renegotiate() {
            synchronized (ConscryptEngineSocket.this.handshakeLock) {
                ConscryptEngineSocket.this.doHandshake();
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            int iRemaining;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                init();
                iRemaining = this.fromEngine.remaining();
            }
            return iRemaining;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                try {
                    int i14 = read(this.singleByte, 0, 1);
                    if (i14 == -1) {
                        return -1;
                    }
                    if (i14 == 1) {
                        return this.singleByte[0] & UnsignedBytes.MAX_VALUE;
                    }
                    throw new SSLException("read incorrect number of bytes " + i14);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void release() {
            synchronized (this.readLock) {
                try {
                    AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int i14;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                i14 = read(bArr, 0, bArr.length);
            }
            return i14;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i14, int i15) throws IOException {
            int untilDataAvailable;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                untilDataAvailable = readUntilDataAvailable(bArr, i14, i15);
            }
            return untilDataAvailable;
        }
    }

    public ConscryptEngineSocket(Socket socket, String str, int i14, boolean z14, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i14, z14);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }
}
