package org.conscrypt;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import o2.c;
import org.apache.commons.lang3.e;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class ConscryptEngine extends AbstractConscryptEngine implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING;
    private static final SSLEngineResult NEED_UNWRAP_CLOSED;
    private static final SSLEngineResult NEED_UNWRAP_OK;
    private static final SSLEngineResult NEED_WRAP_CLOSED;
    private static final SSLEngineResult NEED_WRAP_OK;
    private static BufferAllocator defaultBufferAllocator;
    private ActiveSession activeSession;
    private BufferAllocator bufferAllocator;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private boolean handshakeFinished;
    private HandshakeListener handshakeListener;
    private ByteBuffer lazyDirectBuffer;
    private int maxSealOverhead;
    private final NativeSsl.BioWrapper networkBio;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;

    static {
        SSLEngineResult.Status status = SSLEngineResult.Status.OK;
        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        NEED_UNWRAP_OK = new SSLEngineResult(status, handshakeStatus, 0, 0);
        SSLEngineResult.Status status2 = SSLEngineResult.Status.CLOSED;
        NEED_UNWRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus, 0, 0);
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
        NEED_WRAP_OK = new SSLEngineResult(status, handshakeStatus2, 0, 0);
        NEED_WRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus2, 0, 0);
        CLOSED_NOT_HANDSHAKING = new SSLEngineResult(status2, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        defaultBufferAllocator = null;
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl, PeerInfoProvider peerInfoProvider, SSLParametersImpl.AliasChooser aliasChooser) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = (PeerInfoProvider) Preconditions.checkNotNull(peerInfoProvider, "peerInfoProvider");
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this, aliasChooser);
        this.ssl = nativeSslNewSsl;
        this.networkBio = nativeSslNewSsl.newBio();
    }

    private void beginHandshakeInternal() throws SSLHandshakeException {
        NativeSslSession cachedSession;
        int i14 = this.state;
        if (i14 == 0) {
            h.z("Client/server mode must be set before handshake");
            return;
        }
        if (i14 != 1) {
            if (i14 == 6 || i14 == 7 || i14 == 8) {
                throw new SSLHandshakeException("Engine has already been closed");
            }
            return;
        }
        transitionTo(2);
        try {
            try {
                this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                if (getUseClientMode() && (cachedSession = clientSessionContext().getCachedSession(getHostname(), getPeerPort(), this.sslParameters)) != null) {
                    cachedSession.offerToResume(this.ssl);
                }
                this.maxSealOverhead = this.ssl.getMaxSealOverhead();
                handshake();
            } catch (IOException e4) {
                if (e4.getMessage().contains("unexpected CCS")) {
                    Platform.logEvent("ssl_unexpected_ccs: host=" + getPeerHost());
                }
                closeAll();
                throw SSLUtils.toSSLHandshakeException(e4);
            }
        } catch (Throwable th3) {
            closeAndFreeResources();
            throw th3;
        }
    }

    private static int calcDstsLength(ByteBuffer[] byteBufferArr, int i14, int i15) {
        int iRemaining = 0;
        for (int i16 = 0; i16 < byteBufferArr.length; i16++) {
            ByteBuffer byteBuffer = byteBufferArr[i16];
            Preconditions.checkArgument(byteBuffer != null, "dsts[%d] is null", Integer.valueOf(i16));
            if (byteBuffer.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            if (i16 >= i14 && i16 < i14 + i15) {
                iRemaining += byteBuffer.remaining();
            }
        }
        return iRemaining;
    }

    private static long calcSrcsLength(ByteBuffer[] byteBufferArr, int i14, int i15) {
        long jRemaining = 0;
        while (i14 < i15) {
            ByteBuffer byteBuffer = byteBufferArr[i14];
            if (byteBuffer == null) {
                h.s(e0.f(i14, "srcs[", "] is null"));
                return 0L;
            }
            jRemaining += (long) byteBuffer.remaining();
            i14++;
        }
        return jRemaining;
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeAll() {
        closeOutbound();
        closeInbound();
    }

    private void closeAndFreeResources() {
        transitionTo(8);
        NativeSsl nativeSsl = this.ssl;
        if (nativeSsl != null) {
            nativeSsl.close();
        }
        NativeSsl.BioWrapper bioWrapper = this.networkBio;
        if (bioWrapper != null) {
            bioWrapper.close();
        }
    }

    private SSLException convertException(Throwable th3) {
        return ((th3 instanceof SSLHandshakeException) || !this.handshakeFinished) ? SSLUtils.toSSLHandshakeException(th3) : SSLUtils.toSSLException(th3);
    }

    private long directByteBufferAddress(ByteBuffer byteBuffer, int i14) {
        return NativeCrypto.getDirectBufferAddress(byteBuffer) + ((long) i14);
    }

    private void finishHandshake() {
        this.handshakeFinished = true;
        HandshakeListener handshakeListener = this.handshakeListener;
        if (handshakeListener != null) {
            handshakeListener.onHandshakeFinished();
        }
    }

    private void freeIfDone() {
        if (isInboundDone() && isOutboundDone()) {
            closeAndFreeResources();
        }
    }

    public static BufferAllocator getDefaultBufferAllocator() {
        return defaultBufferAllocator;
    }

    private SSLEngineResult.Status getEngineStatus() {
        int i14 = this.state;
        return (i14 == 6 || i14 == 7 || i14 == 8) ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatusInternal() {
        if (this.handshakeFinished) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        switch (this.state) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            case 2:
                return pendingStatus(pendingOutboundEncryptedBytes());
            case 3:
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            default:
                e.i(this.state, "Unexpected engine state: ");
                return null;
        }
    }

    private ByteBuffer getOrCreateLazyDirectBuffer() {
        if (this.lazyDirectBuffer == null) {
            this.lazyDirectBuffer = ByteBuffer.allocateDirect(Math.max(16384, 16709));
        }
        this.lazyDirectBuffer.clear();
        return this.lazyDirectBuffer;
    }

    private SSLEngineResult.HandshakeStatus handshake() throws SSLHandshakeException {
        try {
            try {
                int iDoHandshake = this.ssl.doHandshake();
                if (iDoHandshake == 2) {
                    return pendingStatus(pendingOutboundEncryptedBytes());
                }
                if (iDoHandshake == 3) {
                    return SSLEngineResult.HandshakeStatus.NEED_WRAP;
                }
                this.activeSession.onPeerCertificateAvailable(getPeerHost(), getPeerPort());
                finishHandshake();
                return SSLEngineResult.HandshakeStatus.FINISHED;
            } catch (IOException e4) {
                closeAll();
                throw e4;
            }
        } catch (Exception e14) {
            throw SSLUtils.toSSLHandshakeException(e14);
        }
    }

    private boolean isHandshakeStarted() {
        int i14 = this.state;
        return (i14 == 0 || i14 == 1) ? false : true;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) {
        return (this.handshakeFinished || handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) ? handshakeStatus : handshake();
    }

    private SSLEngineResult newResult(int i14, int i15, SSLEngineResult.HandshakeStatus handshakeStatus) {
        SSLEngineResult.Status engineStatus = getEngineStatus();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatusInternal();
        }
        return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i14, i15);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine, SSLParametersImpl.AliasChooser aliasChooser) {
        try {
            return NativeSsl.newInstance(sSLParametersImpl, conscryptEngine, aliasChooser, conscryptEngine);
        } catch (SSLException e4) {
            c.p(e4);
            return null;
        }
    }

    private SSLException newSslExceptionWithMessage(String str) {
        return !this.handshakeFinished ? new SSLException(str) : new SSLHandshakeException(str);
    }

    private int pendingInboundCleartextBytes() {
        return this.ssl.getPendingReadableBytes();
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i14) {
        return i14 > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    private ConscryptSession provideAfterHandshakeSession() {
        return this.state < 2 ? SSLNullSession.getNullSession() : provideSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession nullSession;
        synchronized (this.ssl) {
            try {
                nullSession = this.state == 2 ? this.activeSession : SSLNullSession.getNullSession();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return nullSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideSession() {
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 == 8) {
                    ConscryptSession nullSession = this.closedSession;
                    if (nullSession == null) {
                        nullSession = SSLNullSession.getNullSession();
                    }
                    return nullSession;
                }
                if (i14 < 3) {
                    return SSLNullSession.getNullSession();
                }
                return this.activeSession;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private int readEncryptedData(ByteBuffer byteBuffer, int i14) throws SSLException {
        try {
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < i14) {
                return 0;
            }
            int iMin = Math.min(i14, byteBuffer.limit() - iPosition);
            if (!byteBuffer.isDirect()) {
                return readEncryptedDataHeap(byteBuffer, iMin);
            }
            int encryptedDataDirect = readEncryptedDataDirect(byteBuffer, iPosition, iMin);
            if (encryptedDataDirect <= 0) {
                return encryptedDataDirect;
            }
            byteBuffer.position(iPosition + encryptedDataDirect);
            return encryptedDataDirect;
        } catch (Exception e4) {
            throw convertException(e4);
        }
    }

    private int readEncryptedDataDirect(ByteBuffer byteBuffer, int i14, int i15) {
        return this.networkBio.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i14), i15);
    }

    private int readEncryptedDataHeap(ByteBuffer byteBuffer, int i14) {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBufferAllocateDirectBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBufferAllocateDirectBuffer = bufferAllocator.allocateDirectBuffer(i14);
                orCreateLazyDirectBuffer = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int encryptedDataDirect = readEncryptedDataDirect(orCreateLazyDirectBuffer, 0, Math.min(i14, orCreateLazyDirectBuffer.remaining()));
            if (encryptedDataDirect > 0) {
                orCreateLazyDirectBuffer.position(encryptedDataDirect);
                orCreateLazyDirectBuffer.flip();
                byteBuffer.put(orCreateLazyDirectBuffer);
            }
            return encryptedDataDirect;
        } finally {
            if (allocatedBufferAllocateDirectBuffer != null) {
                allocatedBufferAllocateDirectBuffer.release();
            }
        }
    }

    private SSLEngineResult readPendingBytesFromBIO(ByteBuffer byteBuffer, int i14, int i15, SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        try {
            int iPendingOutboundEncryptedBytes = pendingOutboundEncryptedBytes();
            if (iPendingOutboundEncryptedBytes <= 0) {
                return null;
            }
            if (byteBuffer.remaining() < iPendingOutboundEncryptedBytes) {
                SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                    handshakeStatus = getHandshakeStatus(iPendingOutboundEncryptedBytes);
                }
                return new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i14, i15);
            }
            int encryptedData = readEncryptedData(byteBuffer, iPendingOutboundEncryptedBytes);
            if (encryptedData <= 0) {
                NativeCrypto.SSL_clear_error();
            } else {
                i15 += encryptedData;
                iPendingOutboundEncryptedBytes -= encryptedData;
            }
            SSLEngineResult.Status engineStatus = getEngineStatus();
            if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                handshakeStatus = getHandshakeStatus(iPendingOutboundEncryptedBytes);
            }
            return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i14, i15);
        } catch (Exception e4) {
            throw convertException(e4);
        }
    }

    private int readPlaintextData(ByteBuffer byteBuffer) throws SSLException {
        try {
            int iPosition = byteBuffer.position();
            int iMin = Math.min(16709, byteBuffer.limit() - iPosition);
            if (!byteBuffer.isDirect()) {
                return readPlaintextDataHeap(byteBuffer, iMin);
            }
            int plaintextDataDirect = readPlaintextDataDirect(byteBuffer, iPosition, iMin);
            if (plaintextDataDirect <= 0) {
                return plaintextDataDirect;
            }
            byteBuffer.position(iPosition + plaintextDataDirect);
            return plaintextDataDirect;
        } catch (CertificateException e4) {
            throw convertException(e4);
        }
    }

    private int readPlaintextDataDirect(ByteBuffer byteBuffer, int i14, int i15) {
        return this.ssl.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i14), i15);
    }

    private int readPlaintextDataHeap(ByteBuffer byteBuffer, int i14) {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBufferAllocateDirectBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBufferAllocateDirectBuffer = bufferAllocator.allocateDirectBuffer(i14);
                orCreateLazyDirectBuffer = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int plaintextDataDirect = readPlaintextDataDirect(orCreateLazyDirectBuffer, 0, Math.min(i14, orCreateLazyDirectBuffer.remaining()));
            if (plaintextDataDirect > 0) {
                orCreateLazyDirectBuffer.position(plaintextDataDirect);
                orCreateLazyDirectBuffer.flip();
                byteBuffer.put(orCreateLazyDirectBuffer);
            }
            return plaintextDataDirect;
        } finally {
            if (allocatedBufferAllocateDirectBuffer != null) {
                allocatedBufferAllocateDirectBuffer.release();
            }
        }
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    private void sendSSLShutdown() {
        try {
            this.ssl.shutdown();
        } catch (IOException unused) {
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
        defaultBufferAllocator = bufferAllocator;
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void transitionTo(int i14) {
        int i15;
        if (i14 == 2) {
            this.handshakeFinished = false;
            this.activeSession = new ActiveSession(this.ssl, this.sslParameters.getSessionContext());
        } else if (i14 == 8 && !this.ssl.isClosed() && (i15 = this.state) >= 2 && i15 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i14;
    }

    private int writeEncryptedData(ByteBuffer byteBuffer, int i14) throws SSLException {
        try {
            int iPosition = byteBuffer.position();
            int iWriteEncryptedDataDirect = byteBuffer.isDirect() ? writeEncryptedDataDirect(byteBuffer, iPosition, i14) : writeEncryptedDataHeap(byteBuffer, iPosition, i14);
            if (iWriteEncryptedDataDirect > 0) {
                byteBuffer.position(iPosition + iWriteEncryptedDataDirect);
            }
            return iWriteEncryptedDataDirect;
        } catch (IOException e4) {
            closeAll();
            throw new SSLException(e4);
        }
    }

    private int writeEncryptedDataDirect(ByteBuffer byteBuffer, int i14, int i15) {
        return this.networkBio.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i14), i15);
    }

    private int writeEncryptedDataHeap(ByteBuffer byteBuffer, int i14, int i15) {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBufferAllocateDirectBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBufferAllocateDirectBuffer = bufferAllocator.allocateDirectBuffer(i15);
                orCreateLazyDirectBuffer = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int iLimit = byteBuffer.limit();
            int iMin = Math.min(Math.min(iLimit - i14, i15), orCreateLazyDirectBuffer.remaining());
            byteBuffer.limit(i14 + iMin);
            orCreateLazyDirectBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            byteBuffer.position(i14);
            int iWriteEncryptedDataDirect = writeEncryptedDataDirect(orCreateLazyDirectBuffer, 0, iMin);
            byteBuffer.position(i14);
            return iWriteEncryptedDataDirect;
        } finally {
            if (allocatedBufferAllocateDirectBuffer != null) {
                allocatedBufferAllocateDirectBuffer.release();
            }
        }
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i14) throws SSLException {
        try {
            int iPosition = byteBuffer.position();
            int iWritePlaintextDataDirect = byteBuffer.isDirect() ? writePlaintextDataDirect(byteBuffer, iPosition, i14) : writePlaintextDataHeap(byteBuffer, iPosition, i14);
            if (iWritePlaintextDataDirect > 0) {
                byteBuffer.position(iPosition + iWritePlaintextDataDirect);
            }
            return iWritePlaintextDataDirect;
        } catch (Exception e4) {
            throw convertException(e4);
        }
    }

    private int writePlaintextDataDirect(ByteBuffer byteBuffer, int i14, int i15) {
        return this.ssl.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i14), i15);
    }

    private int writePlaintextDataHeap(ByteBuffer byteBuffer, int i14, int i15) {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBufferAllocateDirectBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBufferAllocateDirectBuffer = bufferAllocator.allocateDirectBuffer(i15);
                orCreateLazyDirectBuffer = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int iLimit = byteBuffer.limit();
            int iMin = Math.min(i15, orCreateLazyDirectBuffer.remaining());
            byteBuffer.limit(i14 + iMin);
            orCreateLazyDirectBuffer.put(byteBuffer);
            orCreateLazyDirectBuffer.flip();
            byteBuffer.limit(iLimit);
            byteBuffer.position(i14);
            return writePlaintextDataDirect(orCreateLazyDirectBuffer, 0, iMin);
        } finally {
            if (allocatedBufferAllocateDirectBuffer != null) {
                allocatedBufferAllocateDirectBuffer.release();
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() {
        synchronized (this.ssl) {
            beginHandshakeInternal();
        }
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager instanceof X509ExtendedKeyManager ? ((X509ExtendedKeyManager) x509KeyManager).chooseEngineClientAlias(strArr, x500PrincipalArr, this) : x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, null);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager instanceof X509ExtendedKeyManager ? ((X509ExtendedKeyManager) x509KeyManager).chooseEngineServerAlias(str, null, this) : x509KeyManager.chooseServerAlias(str, null, null);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() {
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 != 8 && i14 != 6) {
                    if (isHandshakeStarted()) {
                        if (this.state == 7) {
                            transitionTo(8);
                        } else {
                            transitionTo(6);
                        }
                        freeIfDone();
                    } else {
                        closeAndFreeResources();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 != 8 && i14 != 7) {
                    if (isHandshakeStarted()) {
                        if (this.state == 6) {
                            transitionTo(8);
                        } else {
                            transitionTo(7);
                        }
                        sendSSLShutdown();
                        freeIfDone();
                    } else {
                        closeAndFreeResources();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i14) {
        synchronized (this.ssl) {
            int i15 = this.state;
            if (i15 >= 3 && i15 != 8) {
                return this.ssl.exportKeyingMaterial(str, bArr, i14);
            }
            return null;
        }
    }

    public void finalize() throws Throwable {
        try {
            closeAndFreeResources();
        } finally {
            super.finalize();
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getApplicationProtocol() {
        return provideAfterHandshakeSession().getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] getChannelId() {
        byte[] tlsChannelId;
        synchronized (this.ssl) {
            try {
                if (getUseClientMode()) {
                    throw new IllegalStateException("Not allowed in client mode");
                }
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Channel ID is only available after handshake completes");
                }
                tlsChannelId = this.ssl.getTlsChannelId();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return tlsChannelId;
    }

    @Override // javax.net.ssl.SSLEngine
    public Runnable getDelegatedTask() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getHandshakeApplicationProtocol() {
        String applicationProtocol;
        synchronized (this.ssl) {
            try {
                applicationProtocol = this.state >= 2 ? getApplicationProtocol() : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return applicationProtocol;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        SSLEngineResult.HandshakeStatus handshakeStatusInternal;
        synchronized (this.ssl) {
            handshakeStatusInternal = getHandshakeStatusInternal();
        }
        return handshakeStatusInternal;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public String getHostname() {
        String str = this.peerHostname;
        return str != null ? str : this.peerInfoProvider.getHostname();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getPeerHost() {
        String str = this.peerHostname;
        return str != null ? str : this.peerInfoProvider.getHostnameOrIP();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public int getPeerPort() {
        return this.peerInfoProvider.getPort();
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLSession getSession() {
        return this.externalSession;
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLSession handshakeSession() {
        synchronized (this.ssl) {
            try {
                if (this.state != 2) {
                    return null;
                }
                return Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.2
                    @Override // org.conscrypt.ExternalSession.Provider
                    public ConscryptSession provideSession() {
                        return ConscryptEngine.this.provideHandshakeSession();
                    }
                }));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
        boolean z14;
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 != 8 && i14 != 6 && !this.ssl.wasShutdownReceived()) {
                    z14 = false;
                } else if (pendingInboundCleartextBytes() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
        boolean z14;
        synchronized (this.ssl) {
            try {
                int i14 = this.state;
                if (i14 != 8 && i14 != 7 && !this.ssl.wasShutdownSent()) {
                    z14 = false;
                } else if (pendingOutboundEncryptedBytes() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public int maxSealOverhead() {
        return this.maxSealOverhead;
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onNewSessionEstablished(long j8) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j8);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j8), this.activeSession));
        } catch (Exception unused) {
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onSSLStateChange(int i14, int i15) {
        synchronized (this.ssl) {
            try {
                if (i14 == 16) {
                    transitionTo(2);
                } else if (i14 == 32) {
                    int i16 = this.state;
                    if (i16 != 2 && i16 != 4) {
                        throw new IllegalStateException("Completed handshake while in mode " + this.state);
                    }
                    transitionTo(3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public int pendingOutboundEncryptedBytes() {
        return this.networkBio.getPendingWrittenBytes();
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
    public void serverCertificateRequested() {
        synchronized (this.ssl) {
            this.ssl.configureServerCertificate();
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public long serverSessionRequested(byte[] bArr) {
        return 0L;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setBufferAllocator(BufferAllocator bufferAllocator) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not set buffer allocator after the initial handshake has begun.");
                }
                this.bufferAllocator = bufferAllocator;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setChannelIdEnabled(boolean z14) {
        synchronized (this.ssl) {
            try {
                if (getUseClientMode()) {
                    throw new IllegalStateException("Not allowed in client mode");
                }
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
                }
                this.sslParameters.channelIdEnabled = z14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (!getUseClientMode()) {
            h.z("Not allowed in server mode");
            return;
        }
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
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
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean z14) {
        this.sslParameters.setEnableSessionCreation(z14);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setHandshakeListener(HandshakeListener handshakeListener) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Handshake listener must be set before starting the handshake.");
                }
                this.handshakeListener = handshakeListener;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        this.peerHostname = str;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean z14) {
        this.sslParameters.setNeedClientAuth(z14);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean z14) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalArgumentException("Can not change mode after handshake: state == " + this.state);
                }
                transitionTo(1);
                this.sslParameters.setUseClientMode(z14);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setUseSessionTickets(boolean z14) {
        this.sslParameters.setUseSessionTickets(z14);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean z14) {
        this.sslParameters.setWantClientAuth(z14);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i14, int i15, ByteBuffer[] byteBufferArr2, int i16, int i17) {
        int encryptedPacketLength;
        int i18;
        int i19;
        boolean z14 = true;
        int i24 = 0;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBufferArr2 != null, "dsts is null");
        int i25 = i15 + i14;
        Preconditions.checkPositionIndexes(i14, i25, byteBufferArr.length);
        int i26 = i16 + i17;
        Preconditions.checkPositionIndexes(i16, i26, byteBufferArr2.length);
        int iCalcDstsLength = calcDstsLength(byteBufferArr2, i16, i17);
        long jCalcSrcsLength = calcSrcsLength(byteBufferArr, i14, i25);
        synchronized (this.ssl) {
            try {
                int i27 = this.state;
                if (i27 == 0) {
                    throw new IllegalStateException("Client/server mode must be set before calling unwrap");
                }
                if (i27 == 1) {
                    beginHandshakeInternal();
                } else if (i27 == 6 || i27 == 8) {
                    freeIfDone();
                    return new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                }
                SSLEngineResult.HandshakeStatus handshakeStatusInternal = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                if (!this.handshakeFinished) {
                    handshakeStatusInternal = handshake();
                    if (handshakeStatusInternal == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                        return NEED_WRAP_OK;
                    }
                    if (this.state == 8) {
                        return NEED_WRAP_CLOSED;
                    }
                }
                if (pendingInboundCleartextBytes() > 0) {
                    z14 = false;
                }
                if (jCalcSrcsLength <= 0 || !z14) {
                    if (z14) {
                        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                    }
                    encryptedPacketLength = 0;
                } else {
                    if (jCalcSrcsLength < 5) {
                        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                    }
                    encryptedPacketLength = SSLUtils.getEncryptedPacketLength(byteBufferArr, i14);
                    if (encryptedPacketLength < 0) {
                        throw new SSLException("Unable to parse TLS packet header");
                    }
                    if (jCalcSrcsLength < encryptedPacketLength) {
                        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                    }
                }
                if (encryptedPacketLength <= 0 || i14 >= i25) {
                    i18 = 0;
                    break;
                }
                i18 = 0;
                do {
                    ByteBuffer byteBuffer = byteBufferArr[i14];
                    int iRemaining = byteBuffer.remaining();
                    if (iRemaining != 0) {
                        int iWriteEncryptedData = writeEncryptedData(byteBuffer, Math.min(encryptedPacketLength, iRemaining));
                        if (iWriteEncryptedData <= 0) {
                            NativeCrypto.SSL_clear_error();
                            break;
                        }
                        i18 += iWriteEncryptedData;
                        encryptedPacketLength -= iWriteEncryptedData;
                        if (encryptedPacketLength == 0 || iWriteEncryptedData != iRemaining) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        i14++;
                    }
                } while (i14 < i25);
                try {
                    if (iCalcDstsLength > 0) {
                        i19 = 0;
                        while (i16 < i26) {
                            try {
                                ByteBuffer byteBuffer2 = byteBufferArr2[i16];
                                if (byteBuffer2.hasRemaining()) {
                                    int plaintextData = readPlaintextData(byteBuffer2);
                                    if (plaintextData <= 0) {
                                        if (plaintextData == -6) {
                                            closeAll();
                                            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, pendingOutboundEncryptedBytes() > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, i18, i19);
                                        }
                                        if (plaintextData != -3 && plaintextData != -2) {
                                            closeAll();
                                            throw newSslExceptionWithMessage("SSL_read");
                                        }
                                        return newResult(i18, i19, handshakeStatusInternal);
                                    }
                                    i19 += plaintextData;
                                    if (byteBuffer2.hasRemaining()) {
                                        break;
                                    }
                                }
                                i16++;
                            } catch (InterruptedIOException unused) {
                                i24 = i19;
                                return newResult(i18, i24, handshakeStatusInternal);
                            }
                        }
                    } else {
                        try {
                            this.ssl.forceRead();
                            i19 = 0;
                        } catch (InterruptedIOException unused2) {
                            return newResult(i18, i24, handshakeStatusInternal);
                        }
                    }
                    if ((this.handshakeFinished ? pendingInboundCleartextBytes() : 0) <= 0) {
                        return newResult(i18, i19, handshakeStatusInternal);
                    }
                    SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                    if (handshakeStatusInternal != SSLEngineResult.HandshakeStatus.FINISHED) {
                        handshakeStatusInternal = getHandshakeStatusInternal();
                    }
                    return new SSLEngineResult(status, mayFinishHandshake(handshakeStatusInternal), i18, i19);
                } catch (IOException e4) {
                    closeAll();
                    throw convertException(e4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] x509CertificateArrDecodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager == null) {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                    this.activeSession.onPeerCertificatesReceived(getPeerHost(), getPeerPort(), x509CertificateArrDecodeX509CertificateChain);
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

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i14, int i15, ByteBuffer byteBuffer) {
        int iBytesProduced;
        int iWritePlaintextData;
        SSLEngineResult pendingBytesFromBIO;
        boolean z14 = true;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBuffer != null, "dst is null");
        int i16 = i14 + i15;
        Preconditions.checkPositionIndexes(i14, i16, byteBufferArr.length);
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (i14 != 0 || i15 != byteBufferArr.length) {
            byteBufferArr = (ByteBuffer[]) Arrays.copyOfRange(byteBufferArr, i14, i16);
        }
        BufferUtils.checkNotNull(byteBufferArr);
        synchronized (this.ssl) {
            try {
                int i17 = this.state;
                if (i17 == 0) {
                    throw new IllegalStateException("Client/server mode must be set before calling wrap");
                }
                if (i17 == 1) {
                    beginHandshakeInternal();
                } else if (i17 == 7 || i17 == 8) {
                    SSLEngineResult pendingBytesFromBIO2 = readPendingBytesFromBIO(byteBuffer, 0, 0, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING);
                    if (pendingBytesFromBIO2 == null) {
                        return new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                    }
                    freeIfDone();
                    return pendingBytesFromBIO2;
                }
                SSLEngineResult.HandshakeStatus handshakeStatusHandshake = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                if (!this.handshakeFinished) {
                    handshakeStatusHandshake = handshake();
                    if (handshakeStatusHandshake == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                        return NEED_UNWRAP_OK;
                    }
                    if (this.state == 8) {
                        return NEED_UNWRAP_CLOSED;
                    }
                }
                int iMin = (int) Math.min(BufferUtils.remaining(byteBufferArr), 16384L);
                if (byteBuffer.remaining() < SSLUtils.calculateOutNetBufSize(iMin)) {
                    return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatusInternal(), 0, 0);
                }
                if (iMin > 0) {
                    ByteBuffer bufferLargerThan = BufferUtils.getBufferLargerThan(byteBufferArr, 16384);
                    if (bufferLargerThan == null) {
                        bufferLargerThan = BufferUtils.copyNoConsume(byteBufferArr, getOrCreateLazyDirectBuffer(), 16384);
                    } else {
                        z14 = false;
                    }
                    iWritePlaintextData = writePlaintextData(bufferLargerThan, Math.min(16384, bufferLargerThan.remaining()));
                    if (iWritePlaintextData <= 0) {
                        int error = this.ssl.getError(iWritePlaintextData);
                        if (error == 2) {
                            SSLEngineResult pendingBytesFromBIO3 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatusHandshake);
                            if (pendingBytesFromBIO3 == null) {
                                pendingBytesFromBIO3 = new SSLEngineResult(getEngineStatus(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
                            }
                            return pendingBytesFromBIO3;
                        }
                        if (error == 3) {
                            SSLEngineResult pendingBytesFromBIO4 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatusHandshake);
                            if (pendingBytesFromBIO4 == null) {
                                pendingBytesFromBIO4 = NEED_WRAP_CLOSED;
                            }
                            return pendingBytesFromBIO4;
                        }
                        if (error != 6) {
                            closeAll();
                            throw newSslExceptionWithMessage("SSL_write: error " + error);
                        }
                        closeAll();
                        SSLEngineResult pendingBytesFromBIO5 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatusHandshake);
                        if (pendingBytesFromBIO5 == null) {
                            pendingBytesFromBIO5 = CLOSED_NOT_HANDSHAKING;
                        }
                        return pendingBytesFromBIO5;
                    }
                    if (z14) {
                        BufferUtils.consume(byteBufferArr, iWritePlaintextData);
                    }
                    SSLEngineResult pendingBytesFromBIO6 = readPendingBytesFromBIO(byteBuffer, iWritePlaintextData, 0, handshakeStatusHandshake);
                    if (pendingBytesFromBIO6 == null) {
                        iBytesProduced = 0;
                    } else {
                        if (pendingBytesFromBIO6.getStatus() != SSLEngineResult.Status.OK) {
                            return pendingBytesFromBIO6;
                        }
                        iBytesProduced = pendingBytesFromBIO6.bytesProduced();
                    }
                } else {
                    iBytesProduced = 0;
                    iWritePlaintextData = 0;
                }
                return (iWritePlaintextData != 0 || (pendingBytesFromBIO = readPendingBytesFromBIO(byteBuffer, 0, iBytesProduced, handshakeStatusHandshake)) == null) ? newResult(iWritePlaintextData, iBytesProduced, handshakeStatusHandshake) : pendingBytesFromBIO;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i14) {
        return !this.handshakeFinished ? pendingStatus(i14) : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptEngine(String str, int i14, SSLParametersImpl sSLParametersImpl) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.forHostAndPort(str, i14);
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this, this);
        this.ssl = nativeSslNewSsl;
        this.networkBio = nativeSslNewSsl.newBio();
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.nullProvider();
        NativeSsl nativeSslNewSsl = newSsl(sSLParametersImpl, this, this);
        this.ssl = nativeSslNewSsl;
        this.networkBio = nativeSslNewSsl.newBio();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult sSLEngineResultWrap;
        synchronized (this.ssl) {
            try {
                try {
                    sSLEngineResultWrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
                    resetSingleSrcBuffer();
                } catch (Throwable th3) {
                    resetSingleSrcBuffer();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sSLEngineResultWrap;
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        SSLEngineResult sSLEngineResultUnwrap;
        synchronized (this.ssl) {
            try {
                try {
                    sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
                    resetSingleSrcBuffer();
                } catch (Throwable th3) {
                    resetSingleSrcBuffer();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sSLEngineResultUnwrap;
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i14, int i15) {
        SSLEngineResult sSLEngineResultUnwrap;
        synchronized (this.ssl) {
            try {
                try {
                    sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i14, i15);
                    resetSingleSrcBuffer();
                } catch (Throwable th3) {
                    resetSingleSrcBuffer();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sSLEngineResultUnwrap;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBufferArr2 != null, "dsts is null");
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult sSLEngineResultUnwrap;
        synchronized (this.ssl) {
            try {
                try {
                    sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
                    resetSingleSrcBuffer();
                    resetSingleDstBuffer();
                } catch (Throwable th3) {
                    resetSingleSrcBuffer();
                    resetSingleDstBuffer();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sSLEngineResultUnwrap;
    }
}
