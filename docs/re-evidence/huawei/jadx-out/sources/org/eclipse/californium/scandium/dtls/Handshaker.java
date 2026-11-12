package org.eclipse.californium.scandium.dtls;

import defpackage.aaab;
import defpackage.aaac;
import defpackage.aaae;
import defpackage.aaag;
import defpackage.aaaj;
import defpackage.aaak;
import defpackage.aaam;
import defpackage.aaao;
import defpackage.aaap;
import defpackage.aaav;
import defpackage.aaaw;
import defpackage.aaay;
import defpackage.aaaz;
import defpackage.aaba;
import defpackage.aabb;
import defpackage.aabc;
import defpackage.aabn;
import defpackage.aabo;
import defpackage.aabp;
import defpackage.aabq;
import defpackage.aabr;
import defpackage.aacj;
import defpackage.aacw;
import defpackage.aadd;
import defpackage.aade;
import defpackage.aaex;
import defpackage.zxx;
import defpackage.zyg;
import defpackage.zyj;
import defpackage.zyk;
import defpackage.zyo;
import defpackage.zzg;
import defpackage.zzp;
import defpackage.zzy;
import defpackage.zzz;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.elements.auth.ExtensiblePrincipal;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.eclipse.californium.scandium.auth.ApplicationLevelInfoSupplier;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.PseudoRandomFunction;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore;
import org.eclipse.californium.scandium.dtls.x509.CertificateProvider;
import org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class Handshaker implements Destroyable {
    private final int additionalTimeoutForEcc;
    protected final AdvancedPskStore advancedPskStore;
    private ApplicationLevelInfoSupplier applicationLevelInfoSupplier;
    private final int backOffRetransmission;
    private Throwable cause;
    protected List<X509Certificate> certificateChain;
    protected boolean certificateIdentityAvailable;
    private boolean certificateIdentityPending;
    protected final CertificateProvider certificateIdentityProvider;
    private boolean certificateVerificationPending;
    protected final NewAdvancedCertificateVerifier certificateVerifier;
    private boolean changeCipherSuiteMessageExpected;
    protected aabn clientRandom;
    private aacw clientWriteIV;
    private SecretKey clientWriteKey;
    private SecretKey clientWriteMACKey;
    private final aaag connection;
    protected final ConnectionIdGenerator connectionIdGenerator;
    private final aaak context;
    private boolean contextEstablished;
    private Object customArgument;
    private int deferredIncomingRecordsSize;
    private boolean destroyed;
    private boolean eccExpected;
    private aaaz[] expectedStates;
    protected final ExtendedMasterSecretMode extendedMasterSecretMode;
    private long flightSendNanos;
    private volatile boolean generateClusterMacKeys;
    private boolean handshakeAborted;
    private boolean handshakeCompleted;
    private boolean handshakeFailed;
    private e inboundMessageBuffer;
    private final boolean ipv6;
    private SecretKey masterSecret;
    private byte[] masterSecretSeed;
    private final int maxDeferredProcessedIncomingRecordsSize;
    private final int maxDeferredProcessedOutgoingApplicationDataMessages;
    private final int maxFragmentedHandshakeMessageLength;
    private final int maxRetransmissionTimeout;
    private final int maxRetransmissions;
    private long nanosExpireTime;
    private final long nanosExpireTimeout;
    private int nextReceiveMessageSequence;
    private CertPath otherPeersCertPath;
    protected boolean otherPeersCertificateVerified;
    protected PublicKey otherPeersPublicKey;
    private boolean otherPeersSignatureVerified;
    private SecretKey otherSecret;
    private final InetSocketAddress peer;
    protected final Object peerToLog;
    protected PrivateKey privateKey;
    private boolean pskRequestPending;
    protected PublicKey publicKey;
    private aabo reassembledMessage;
    private final RecordLayer recordLayer;
    protected Integer recordSizeLimit;
    private final float retransmissionRandomFactor;
    private final int retransmissionTimeout;
    private final float retransmissionTimeoutScale;
    private Runnable retransmitFlight;
    private int sendMessageSequence;
    protected aabn serverRandom;
    private aacw serverWriteIV;
    private SecretKey serverWriteKey;
    private SecretKey serverWriteMACKey;
    protected final boolean sniEnabled;
    private boolean statesChanged;
    private int statesIndex;
    private ScheduledFuture<?> timeoutLastFlight;
    private final ScheduledExecutorService timer;
    private final boolean useEarlyStopRetransmission;
    private Boolean useMultiHandshakeMessagesRecord;
    private Boolean useMultiRecordMessages;
    protected final boolean useTruncatedCertificatePathForVerification;

    @Deprecated
    protected final Logger LOGGER = aaex.a(getClass());
    private final ReentrantLock recursionProtection = new ReentrantLock();
    protected int flightNumber = 0;
    private final List<zxx> deferredApplicationData = new ArrayList();
    private final List<aabr> nextEpochDeferredRecords = new ArrayList();
    private final AtomicReference<aaaj> pendingFlight = new AtomicReference<>();
    protected final List<HandshakeMessage> handshakeMessages = new ArrayList();
    private final Set<SessionListener> sessionListeners = new LinkedHashSet();

    protected abstract void doProcessMessage(HandshakeMessage handshakeMessage) throws aaay;

    protected abstract boolean isClient();

    public boolean isFullHandshake() {
        return true;
    }

    public boolean isProbing() {
        return false;
    }

    protected abstract void processCertificateIdentityAvailable() throws aaay;

    protected abstract void processCertificateVerified() throws aaay;

    protected abstract void processMasterSecret() throws aaay;

    public void resetProbing() {
    }

    public Handshaker(long j, int i, RecordLayer recordLayer, ScheduledExecutorService scheduledExecutorService, aaag aaagVar, zzy zzyVar) {
        this.sendMessageSequence = 0;
        this.nextReceiveMessageSequence = 0;
        if (recordLayer == null) {
            throw new NullPointerException("Record layer must not be null");
        }
        if (scheduledExecutorService == null) {
            throw new NullPointerException("Timer must not be null");
        }
        if (aaagVar == null) {
            throw new NullPointerException("Connection must not be null");
        }
        if (zzyVar == null) {
            throw new NullPointerException("Dtls Connector Config must not be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Initial message sequence number must not be negative");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Initial record sequence number must not be negative");
        }
        this.sendMessageSequence = i;
        this.nextReceiveMessageSequence = i;
        this.context = new aaak(j, ((Boolean) zzyVar.c(DtlsConfig.ay)).booleanValue());
        this.recordLayer = recordLayer;
        this.timer = scheduledExecutorService;
        this.connection = aaagVar;
        InetSocketAddress inetSocketAddressM = aaagVar.m();
        this.peer = inetSocketAddressM;
        this.peerToLog = zzp.e(inetSocketAddressM);
        this.connectionIdGenerator = zzyVar.h();
        int iB = zzyVar.b(DtlsConfig.ao, TimeUnit.MILLISECONDS);
        this.retransmissionTimeout = iB;
        int iB2 = zzyVar.b(DtlsConfig.ad, TimeUnit.MILLISECONDS);
        this.maxRetransmissionTimeout = iB2;
        int iB3 = zzyVar.b(DtlsConfig.f44543c, TimeUnit.MILLISECONDS);
        this.additionalTimeoutForEcc = iB3;
        float fFloatValue = ((Float) zzyVar.c(DtlsConfig.an)).floatValue();
        this.retransmissionRandomFactor = fFloatValue;
        float fFloatValue2 = ((Float) zzyVar.c(DtlsConfig.aq)).floatValue();
        this.retransmissionTimeoutScale = fFloatValue2;
        this.backOffRetransmission = zzyVar.g().intValue();
        this.maxRetransmissions = ((Integer) zzyVar.c(DtlsConfig.u)).intValue();
        this.recordSizeLimit = (Integer) zzyVar.c(DtlsConfig.ak);
        this.maxFragmentedHandshakeMessageLength = ((Integer) zzyVar.c(DtlsConfig.r)).intValue();
        this.useMultiRecordMessages = (Boolean) zzyVar.c(DtlsConfig.bj);
        this.useMultiHandshakeMessagesRecord = (Boolean) zzyVar.c(DtlsConfig.bm);
        this.maxDeferredProcessedOutgoingApplicationDataMessages = ((Integer) zzyVar.c(DtlsConfig.q)).intValue();
        this.maxDeferredProcessedIncomingRecordsSize = ((Integer) zzyVar.c(DtlsConfig.p)).intValue();
        this.sniEnabled = ((Boolean) zzyVar.c(DtlsConfig.bi)).booleanValue();
        this.extendedMasterSecretMode = (ExtendedMasterSecretMode) zzyVar.c(DtlsConfig.l);
        this.useTruncatedCertificatePathForVerification = ((Boolean) zzyVar.c(DtlsConfig.ba)).booleanValue();
        this.useEarlyStopRetransmission = ((Boolean) zzyVar.c(DtlsConfig.bd)).booleanValue();
        this.certificateIdentityProvider = zzyVar.i();
        this.certificateVerifier = zzyVar.b();
        this.advancedPskStore = zzyVar.c();
        this.applicationLevelInfoSupplier = zzyVar.e();
        this.inboundMessageBuffer = new e();
        this.ipv6 = aaagVar.m().getAddress() instanceof Inet6Address;
        int iRound = Math.round(iB * fFloatValue);
        int iMin = Math.min(CipherSuite.containsEccBasedCipherSuite(zzyVar.x()) ? iRound + iB3 : iRound, iB2);
        int iMin2 = Math.min(Math.round(iMin * fFloatValue2), iB2);
        for (int i2 = 0; i2 < this.maxRetransmissions; i2++) {
            iMin = aaaj.c(iMin, this.retransmissionTimeoutScale, this.maxRetransmissionTimeout);
            iMin2 += iMin;
        }
        this.nanosExpireTimeout = TimeUnit.MILLISECONDS.toNanos(iMin2);
        addSessionListener(aaagVar.q());
    }

    class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private aabr f44559c;
        private SortedSet<aabr> e;

        private e() {
            this.f44559c = null;
            this.e = new TreeSet(new Comparator<aabr>() { // from class: org.eclipse.californium.scandium.dtls.Handshaker.e.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(aabr aabrVar, aabr aabrVar2) {
                    return Handshaker.compareRecords(aabrVar, aabrVar2);
                }
            });
        }

        boolean d() {
            return this.e.isEmpty();
        }

        aabr a() {
            aabr aabrVar;
            if (Handshaker.this.isChangeCipherSpecMessageExpected() && (aabrVar = this.f44559c) != null) {
                this.f44559c = null;
                return aabrVar;
            }
            while (!this.e.isEmpty()) {
                aabr aabrVarFirst = this.e.first();
                int messageSeq = ((HandshakeMessage) aabrVarFirst.b()).getMessageSeq();
                if (messageSeq > Handshaker.this.nextReceiveMessageSequence) {
                    break;
                }
                Handshaker.this.removeDeferredProcessedRecord(aabrVarFirst, this.e);
                if (messageSeq == Handshaker.this.nextReceiveMessageSequence) {
                    return aabrVarFirst;
                }
            }
            return null;
        }

        aabr c(aabr aabrVar) {
            int iC = aabrVar.c();
            int iB = Handshaker.this.context.b();
            if (iC == iB) {
                DTLSMessage dTLSMessageB = aabrVar.b();
                int i = AnonymousClass2.f44552a[dTLSMessageB.getContentType().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        HandshakeMessage handshakeMessage = (HandshakeMessage) dTLSMessageB;
                        int messageSeq = handshakeMessage.getMessageSeq();
                        if (messageSeq != Handshaker.this.nextReceiveMessageSequence) {
                            if (messageSeq > Handshaker.this.nextReceiveMessageSequence) {
                                Handshaker.this.LOGGER.debug("Queued newer {} message from current epoch, message_seq [{}] > next_receive_seq [{}]", handshakeMessage.getMessageType(), Integer.valueOf(messageSeq), Integer.valueOf(Handshaker.this.nextReceiveMessageSequence));
                                Handshaker.this.addDeferredProcessedRecord(aabrVar, this.e);
                                return null;
                            }
                            Handshaker.this.LOGGER.debug("Discarding old {} message_seq [{}] < next_receive_seq [{}]", handshakeMessage.getMessageType(), Integer.valueOf(messageSeq), Integer.valueOf(Handshaker.this.nextReceiveMessageSequence));
                            return null;
                        }
                    } else {
                        Handshaker.this.LOGGER.info("Cannot process message of type [{}], discarding...", dTLSMessageB.getContentType());
                        return null;
                    }
                } else if (!Handshaker.this.isChangeCipherSpecMessageExpected()) {
                    if (this.f44559c == null) {
                        Handshaker.this.LOGGER.debug("Change Cipher Spec is not expected and therefore kept for later processing!");
                        this.f44559c = aabrVar;
                        return null;
                    }
                    Handshaker.this.LOGGER.debug("Change Cipher Spec is received again!");
                    return null;
                }
                return aabrVar;
            }
            throw new IllegalArgumentException("record epoch " + iC + " doesn't match dtls context " + iB);
        }
    }

    /* JADX INFO: renamed from: org.eclipse.californium.scandium.dtls.Handshaker$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44552a;

        static {
            int[] iArr = new int[ContentType.values().length];
            f44552a = iArr;
            try {
                iArr[ContentType.CHANGE_CIPHER_SPEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44552a[ContentType.HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareRecords(aabr aabrVar, aabr aabrVar2) {
        if (aabrVar.c() != aabrVar2.c()) {
            throw new IllegalArgumentException("records with different epoch! " + aabrVar.c() + " != " + aabrVar2.c());
        }
        HandshakeMessage handshakeMessage = (HandshakeMessage) aabrVar.b();
        HandshakeMessage handshakeMessage2 = (HandshakeMessage) aabrVar2.b();
        if (handshakeMessage.getMessageSeq() < handshakeMessage2.getMessageSeq()) {
            return -1;
        }
        if (handshakeMessage.getMessageSeq() > handshakeMessage2.getMessageSeq()) {
            return 1;
        }
        if (aabrVar.f() < aabrVar2.f()) {
            return -1;
        }
        return aabrVar.f() > aabrVar2.f() ? 1 : 0;
    }

    public boolean isInboundMessageProcessed() {
        return this.inboundMessageBuffer.d();
    }

    public final void processMessage(aabr aabrVar) throws aaay {
        int iB = this.context.b();
        if (iB != aabrVar.c()) {
            this.LOGGER.debug("Discarding {} message with wrong epoch received from peer [{}]:{}{}", aabrVar.g(), aabrVar.j(), zzp.c(), aabrVar);
            throw new IllegalArgumentException("processing record with wrong epoch! " + aabrVar.c() + " expected " + iB);
        }
        if (this.pendingFlight.get() != null && this.flightSendNanos - aabrVar.i() > 0) {
            this.LOGGER.debug("Discarding {} message received from peer [{}] before last flight was sent:{}{}", aabrVar.g(), aabrVar.j(), zzp.c(), aabrVar);
            return;
        }
        aabr aabrVarC = this.inboundMessageBuffer.c(aabrVar);
        if (aabrVarC != null) {
            processNextMessages(aabrVarC);
        }
    }

    private void processNextMessages(aabr aabrVar) throws aaay {
        if (this.recursionProtection.isHeldByCurrentThread()) {
            this.LOGGER.warn("Called from doProcessMessage, return immediately to process next message!", new Throwable("recursion-protection"));
            return;
        }
        try {
            int iB = this.context.b();
            if (aabrVar == null) {
                aabrVar = this.inboundMessageBuffer.a();
            }
            int i = 0;
            while (aabrVar != null) {
                if (this.useMultiRecordMessages == null && aabrVar.m()) {
                    this.useMultiRecordMessages = true;
                }
                DTLSMessage dTLSMessageB = aabrVar.b();
                if (dTLSMessageB.getContentType() == ContentType.CHANGE_CIPHER_SPEC) {
                    expectMessage(dTLSMessageB);
                    this.LOGGER.debug("Processing {} message from peer [{}]", dTLSMessageB.getContentType(), this.peerToLog);
                    setCurrentReadState();
                    this.statesIndex++;
                    this.LOGGER.debug("Processed {} message from peer [{}]", dTLSMessageB.getContentType(), this.peerToLog);
                } else if (dTLSMessageB.getContentType() == ContentType.HANDSHAKE) {
                    boolean zProcessNextHandshakeMessages = processNextHandshakeMessages(aabrVar.c(), i, (HandshakeMessage) dTLSMessageB);
                    this.context.e(aabrVar.c(), aabrVar.f());
                    if (!zProcessNextHandshakeMessages) {
                        break;
                    }
                } else {
                    throw new aaay(String.format("Received unexpected message type [%s], epoch %d from peer %s", dTLSMessageB.getContentType(), Integer.valueOf(aabrVar.c()), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
                }
                aabrVar = this.inboundMessageBuffer.a();
                if (iB < this.context.b()) {
                    if (aabrVar == null && !this.inboundMessageBuffer.d()) {
                        aabrVar = (aabr) this.inboundMessageBuffer.e.first();
                    }
                    if (aabrVar != null) {
                        HandshakeMessage handshakeMessage = (HandshakeMessage) aabrVar.b();
                        throw new aaay(String.format("Unexpected %s handshake message, epoch %d.%d/%d left from peer %s", handshakeMessage.getMessageType(), Integer.valueOf(aabrVar.c()), Long.valueOf(aabrVar.f()), Integer.valueOf(handshakeMessage.getMessageSeq()), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
                    }
                }
                i++;
            }
            if (iB < this.context.b()) {
                SerialExecutor serialExecutorH = this.connection.h();
                List<aabr> listTakeDeferredRecordsOfNextEpoch = takeDeferredRecordsOfNextEpoch();
                if (this.deferredIncomingRecordsSize > 0) {
                    throw new aaay(String.format("Received message of next epoch left from peer %s", this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
                }
                for (final aabr aabrVar2 : listTakeDeferredRecordsOfNextEpoch) {
                    if (serialExecutorH != null && !serialExecutorH.isShutdown()) {
                        try {
                            serialExecutorH.execute(new Runnable() { // from class: org.eclipse.californium.scandium.dtls.Handshaker.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    Handshaker.this.recordLayer.processRecord(aabrVar2, Handshaker.this.connection);
                                }
                            });
                        } catch (RejectedExecutionException e2) {
                            this.LOGGER.debug("Execution rejected while processing record [type: {}, peer: {}]", aabrVar2.g(), aabrVar2.j(), e2);
                            this.recordLayer.processRecord(aabrVar2, this.connection);
                        }
                    }
                    this.recordLayer.processRecord(aabrVar2, this.connection);
                }
            }
        } catch (RuntimeException e3) {
            this.LOGGER.warn("Cannot process handshake message from peer [{}] due to [{}]", this.peerToLog, e3.getMessage(), e3);
            throw new aaay("Cannot process handshake message, caused by " + e3.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR), e3);
        }
    }

    private boolean processNextHandshakeMessages(int i, int i2, HandshakeMessage handshakeMessage) throws aaay {
        if (this.recursionProtection.isHeldByCurrentThread()) {
            this.LOGGER.warn("Called from doProcessMessage, return immediately to process next message!", new Throwable("recursion-protection"));
            return false;
        }
        aaaj aaajVar = this.pendingFlight.get();
        if (aaajVar != null) {
            this.LOGGER.debug("response for flight {} started", Integer.valueOf(aaajVar.c()));
            aaajVar.o();
        }
        while (handshakeMessage != null) {
            expectMessage(handshakeMessage);
            if (handshakeMessage.getMessageType() == HandshakeType.FINISHED && i == 0) {
                this.LOGGER.debug("FINISH with epoch 0 from peer [{}]!", this.peerToLog);
                throw new aaay("FINISH with epoch 0!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
            }
            if ((handshakeMessage instanceof aaav) && (handshakeMessage = reassembleFragment((aaav) handshakeMessage)) == null) {
                break;
            }
            if (handshakeMessage instanceof aabc) {
                handshakeMessage = HandshakeMessage.fromGenericHandshakeMessage((aabc) handshakeMessage, getParameter());
            }
            if (this.timeoutLastFlight != null) {
                if (aaajVar == null) {
                    Throwable th = this.cause;
                    if (th != null) {
                        this.LOGGER.error("last flight missing, handshake already failed! {}", handshakeMessage, th);
                    } else if (i2 == 0) {
                        this.LOGGER.error("last flight missing, resend failed! {}", handshakeMessage);
                    } else {
                        this.LOGGER.error("last flight missing, resend for buffered message {} failed! {}", Integer.valueOf(i2), handshakeMessage);
                    }
                    return false;
                }
                this.LOGGER.debug("Received ({}) FINISHED message again, retransmitting last flight...", this.peerToLog);
                aaajVar.h();
                sendFlight(aaajVar);
                return false;
            }
            if (this.LOGGER.isDebugEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Processing %s message from peer [%s], seqn: [%d]", handshakeMessage.getMessageType(), this.peerToLog, Integer.valueOf(handshakeMessage.getMessageSeq())));
                if (this.LOGGER.isTraceEnabled()) {
                    sb.append(":");
                    sb.append(zzp.c());
                    sb.append(handshakeMessage);
                }
                this.LOGGER.debug(sb.toString());
            }
            if (i == 0) {
                this.handshakeMessages.add(handshakeMessage);
            }
            this.statesChanged = false;
            this.recursionProtection.lock();
            try {
                doProcessMessage(handshakeMessage);
                this.recursionProtection.unlock();
                this.LOGGER.debug("Processed {} message from peer [{}]", handshakeMessage.getMessageType(), this.peerToLog);
                if (this.timeoutLastFlight == null) {
                    this.nextReceiveMessageSequence++;
                    if (!this.statesChanged) {
                        this.statesIndex++;
                    }
                }
                handshakeMessage = handshakeMessage.getNextHandshakeMessage();
                if (this.useMultiHandshakeMessagesRecord == null && handshakeMessage != null) {
                    this.useMultiHandshakeMessagesRecord = true;
                }
            } catch (Throwable th2) {
                this.recursionProtection.unlock();
                throw th2;
            }
        }
        return true;
    }

    protected boolean isExpectedStates(aaaz[] aaazVarArr) {
        return this.expectedStates == aaazVarArr;
    }

    protected void setExpectedStates(aaaz[] aaazVarArr) {
        this.expectedStates = aaazVarArr;
        this.statesIndex = 0;
        this.statesChanged = true;
    }

    protected void expectMessage(DTLSMessage dTLSMessage) throws aaay {
        aaaz[] aaazVarArr = this.expectedStates;
        if (aaazVarArr == null) {
            this.LOGGER.warn("Cannot process {} message from peer [{}], not expected!", aaaz.d(dTLSMessage), this.peerToLog);
            throw new aaay("Cannot process " + aaaz.d(dTLSMessage) + " handshake message, not expected!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
        }
        if (aaazVarArr.length == 0) {
            return;
        }
        int i = this.statesIndex;
        if (i >= aaazVarArr.length) {
            this.LOGGER.warn("Cannot process {} message from peer [{}], no more expected!", aaaz.d(dTLSMessage), this.peerToLog);
            throw new aaay("Cannot process " + aaaz.d(dTLSMessage) + " handshake message, no more expected!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
        }
        aaaz aaazVar = aaazVarArr[i];
        boolean zB = aaazVar.b(dTLSMessage);
        if (!zB && aaazVar.a()) {
            int i2 = this.statesIndex;
            aaaz[] aaazVarArr2 = this.expectedStates;
            int i3 = i2 + 1;
            if (i3 < aaazVarArr2.length && aaazVarArr2[i3].b(dTLSMessage)) {
                this.statesIndex++;
                return;
            }
        }
        if (zB) {
            return;
        }
        aaaj aaajVar = this.pendingFlight.get();
        if (aaajVar != null && aaajVar.c(dTLSMessage)) {
            this.LOGGER.debug("Cannot process {} message from itself [{}]!", aaaz.d(dTLSMessage), this.peerToLog);
        } else {
            this.LOGGER.debug("Cannot process {} message from peer [{}], {} expected!", aaaz.d(dTLSMessage), this.peerToLog, aaazVar);
        }
        throw new aaay("Cannot process " + aaaz.d(dTLSMessage) + " handshake message, " + aaazVar + " expected!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
    }

    public void processAsyncHandshakeResult(aaba aabaVar) throws aaay {
        if (aabaVar instanceof aabq) {
            processPskSecretResult((aabq) aabaVar);
        } else if (aabaVar instanceof aaac) {
            processCertificateVerificationResult((aaac) aabaVar);
        } else if (aabaVar instanceof aaab) {
            processCertificateIdentityResult((aaab) aabaVar);
        }
        if (this.changeCipherSuiteMessageExpected) {
            processNextMessages(null);
        }
    }

    protected void processPskSecretResult(aabq aabqVar) throws aaay {
        zyk zykVar;
        if (!this.pskRequestPending) {
            throw new IllegalStateException("psk secret not pending!");
        }
        this.pskRequestPending = false;
        try {
            ensureUndestroyed();
            aaam session = getSession();
            String strJ = this.sniEnabled ? session.j() : null;
            aabp aabpVarB = aabqVar.b();
            SecretKey secretKeyD = aabqVar.d();
            if (secretKeyD != null) {
                if (strJ != null) {
                    this.LOGGER.trace("client [{}] uses PSK identity [{}] for server [{}]", this.peerToLog, aabpVarB, strJ);
                } else {
                    this.LOGGER.trace("client [{}] uses PSK identity [{}]", this.peerToLog, aabpVarB);
                }
                if (this.sniEnabled) {
                    zykVar = new zyk(strJ, aabpVarB.e());
                } else {
                    zykVar = new zyk(aabpVarB.e());
                }
                session.d(zykVar);
                if ("PSK".equals(secretKeyD.getAlgorithm())) {
                    Mac threadLocalPseudoRandomFunctionMac = session.a().getThreadLocalPseudoRandomFunctionMac();
                    SecretKey secretKeyD2 = PseudoRandomFunction.d(this.otherSecret, secretKeyD);
                    SecretKey secretKeyC = PseudoRandomFunction.c(threadLocalPseudoRandomFunctionMac, secretKeyD2, this.masterSecretSeed, session.q());
                    aadd.e(secretKeyD2);
                    aadd.e(secretKeyD);
                    secretKeyD = secretKeyC;
                }
                setCustomArgument(aabqVar);
                applyMasterSecret(secretKeyD);
                aadd.e(secretKeyD);
                processMasterSecret();
                aadd.e(this.otherSecret);
                this.otherSecret = null;
                return;
            }
            AlertMessage alertMessage = new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNKNOWN_PSK_IDENTITY);
            if (strJ != null) {
                throw new aaay(String.format("No pre-shared key found for [virtual host: %s, identity: %s]", strJ, aabpVarB), alertMessage);
            }
            throw new aaay(String.format("No pre-shared key found for [identity: %s]", aabpVarB), alertMessage);
        } catch (Throwable th) {
            aadd.e(this.otherSecret);
            this.otherSecret = null;
            throw th;
        }
    }

    protected void processCertificateVerificationResult(aaac aaacVar) throws aaay {
        if (!this.certificateVerificationPending) {
            throw new IllegalStateException("certificate verification not pending!");
        }
        ensureUndestroyed();
        this.certificateVerificationPending = false;
        this.LOGGER.debug("Process result of certificate verification.");
        if (aaacVar.c() != null) {
            this.otherPeersCertificateVerified = true;
            this.otherPeersCertPath = aaacVar.c();
            if (this.otherPeersSignatureVerified) {
                getSession().d(new zyo(this.otherPeersCertPath));
            }
            setCustomArgument(aaacVar);
            processCertificateVerified();
            return;
        }
        if (aaacVar.d() != null) {
            this.otherPeersCertificateVerified = true;
            if (this.otherPeersSignatureVerified) {
                getSession().d(new zyg(this.otherPeersPublicKey));
            }
            setCustomArgument(aaacVar);
            processCertificateVerified();
            return;
        }
        if (aaacVar.b() != null) {
            throw aaacVar.b();
        }
        throw new aaay("Bad Certificate", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
    }

    protected void processCertificateIdentityResult(aaab aaabVar) throws aaay {
        if (!this.certificateIdentityPending) {
            throw new IllegalStateException("certificate identity not pending!");
        }
        ensureUndestroyed();
        this.certificateIdentityPending = false;
        this.LOGGER.debug("Process result of certificate identity.");
        this.privateKey = aaabVar.d();
        this.publicKey = aaabVar.e();
        this.certificateChain = aaabVar.c();
        this.certificateIdentityAvailable = true;
        processCertificateIdentityAvailable();
    }

    protected void setCustomArgument(aaba aabaVar) {
        Object objJ = aabaVar.j();
        if (objJ != null) {
            this.customArgument = objJ;
        }
    }

    public boolean hasPendingApiCall() {
        return this.certificateIdentityPending || this.certificateVerificationPending || this.pskRequestPending;
    }

    protected boolean setOtherPeersSignatureVerified() {
        this.otherPeersSignatureVerified = true;
        if (this.otherPeersCertificateVerified) {
            if (this.otherPeersCertPath != null) {
                getSession().d(new zyo(this.otherPeersCertPath));
            } else if (this.otherPeersPublicKey != null) {
                getSession().d(new zyg(this.otherPeersPublicKey));
            }
        }
        return this.otherPeersCertificateVerified;
    }

    protected final MessageDigest getHandshakeMessageDigest() {
        MessageDigest threadLocalPseudoRandomFunctionMessageDigest = getSession().a().getThreadLocalPseudoRandomFunctionMessageDigest();
        int i = 0;
        for (HandshakeMessage handshakeMessage : this.handshakeMessages) {
            threadLocalPseudoRandomFunctionMessageDigest.update(handshakeMessage.toByteArray());
            this.LOGGER.trace("  [{}] - {}", Integer.valueOf(i), handshakeMessage.getMessageType());
            i++;
        }
        return threadLocalPseudoRandomFunctionMessageDigest;
    }

    protected final MessageDigest cloneMessageDigest(MessageDigest messageDigest) throws aaay {
        try {
            return (MessageDigest) messageDigest.clone();
        } catch (CloneNotSupportedException unused) {
            throw new aaay("Cannot create hash for second FINISHED message", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
        }
    }

    protected void applyMasterSecret(SecretKey secretKey) {
        ensureUndestroyed();
        this.masterSecret = aadd.d(secretKey);
        calculateKeys(secretKey);
        getSession().e(secretKey);
    }

    protected void resumeMasterSecret() {
        ensureUndestroyed();
        SecretKey secretKeyG = getSession().g();
        this.masterSecret = secretKeyG;
        calculateKeys(secretKeyG);
    }

    protected void calculateKeys(SecretKey secretKey) {
        ensureUndestroyed();
        CipherSuite cipherSuiteA = this.context.d().a();
        int macKeyLength = cipherSuiteA.getMacKeyLength();
        int encKeyLength = cipherSuiteA.getEncKeyLength();
        int fixedIvLength = cipherSuiteA.getFixedIvLength();
        int i = this.generateClusterMacKeys ? encKeyLength : 0;
        byte[] bArrC = PseudoRandomFunction.c(cipherSuiteA.getThreadLocalPseudoRandomFunctionMac(), secretKey, PseudoRandomFunction.Label.KEY_EXPANSION_LABEL, zzg.b(this.serverRandom, this.clientRandom), (macKeyLength + encKeyLength + fixedIvLength + i) * 2);
        this.clientWriteMACKey = aadd.e(bArrC, 0, macKeyLength, "Mac");
        this.serverWriteMACKey = aadd.e(bArrC, macKeyLength, macKeyLength, "Mac");
        int i2 = macKeyLength + macKeyLength;
        this.clientWriteKey = aadd.e(bArrC, i2, encKeyLength, "AES");
        int i3 = i2 + encKeyLength;
        this.serverWriteKey = aadd.e(bArrC, i3, encKeyLength, "AES");
        int i4 = i3 + encKeyLength;
        this.clientWriteIV = aadd.c(bArrC, i4, fixedIvLength);
        int i5 = i4 + fixedIvLength;
        this.serverWriteIV = aadd.c(bArrC, i5, fixedIvLength);
        if (this.generateClusterMacKeys) {
            SecretKey secretKeyE = aadd.e(bArrC, i5, i, "Mac");
            SecretKey secretKeyE2 = aadd.e(bArrC, i5 + i, i, "Mac");
            if (isClient()) {
                this.context.c(secretKeyE, secretKeyE2);
            } else {
                this.context.c(secretKeyE2, secretKeyE);
            }
            aadd.e(secretKeyE);
            aadd.e(secretKeyE2);
        }
        zzg.a(bArrC);
        this.context.b(this.clientRandom, this.serverRandom);
    }

    protected byte[] generateMasterSecretSeed() {
        if (getSession().q()) {
            MessageDigest threadLocalPseudoRandomFunctionMessageDigest = getSession().a().getThreadLocalPseudoRandomFunctionMessageDigest();
            int i = 0;
            for (HandshakeMessage handshakeMessage : this.handshakeMessages) {
                threadLocalPseudoRandomFunctionMessageDigest.update(handshakeMessage.toByteArray());
                this.LOGGER.trace("  [{}] - {}", Integer.valueOf(i), handshakeMessage.getMessageType());
                if (handshakeMessage.getMessageType() == HandshakeType.CLIENT_KEY_EXCHANGE) {
                    return threadLocalPseudoRandomFunctionMessageDigest.digest();
                }
                i++;
            }
            throw new IllegalArgumentException("client key exchange missing!");
        }
        return zzg.b(this.clientRandom, this.serverRandom);
    }

    protected void requestPskSecretResult(aabp aabpVar, SecretKey secretKey, byte[] bArr) throws aaay {
        if (bArr == null) {
            throw new NullPointerException("seed must not be null!");
        }
        aaam session = getSession();
        aade serverNames = getServerNames();
        String pseudoRandomFunctionMacName = session.a().getPseudoRandomFunctionMacName();
        this.pskRequestPending = true;
        this.masterSecretSeed = bArr;
        this.otherSecret = aadd.d(secretKey);
        aabq aabqVarRequestPskSecretResult = this.advancedPskStore.requestPskSecretResult(this.connection.c(), serverNames, aabpVar, pseudoRandomFunctionMacName, secretKey, this.masterSecretSeed, session.q());
        if (aabqVarRequestPskSecretResult != null) {
            processPskSecretResult(aabqVarRequestPskSecretResult);
        }
    }

    protected final void setCurrentReadState() {
        if (isClient()) {
            this.context.e(this.serverWriteKey, this.serverWriteIV, this.serverWriteMACKey);
        } else {
            this.context.e(this.clientWriteKey, this.clientWriteIV, this.clientWriteMACKey);
        }
    }

    protected final void setCurrentWriteState() {
        if (isClient()) {
            this.context.d(this.clientWriteKey, this.clientWriteIV, this.clientWriteMACKey);
        } else {
            this.context.d(this.serverWriteKey, this.serverWriteIV, this.serverWriteMACKey);
        }
    }

    protected final aaaw createFinishedMessage(byte[] bArr) {
        if (this.masterSecret == null) {
            throw new IllegalStateException("master secret not available!");
        }
        return new aaaw(getSession().a().getThreadLocalPseudoRandomFunctionMac(), this.masterSecret, isClient(), bArr);
    }

    protected final void verifyFinished(aaaw aaawVar, byte[] bArr) throws aaay {
        if (this.masterSecret == null) {
            throw new IllegalStateException("master secret not available!");
        }
        aaawVar.a(getSession().a().getThreadLocalPseudoRandomFunctionMac(), this.masterSecret, !isClient(), bArr);
    }

    public final boolean hasMasterSecret() {
        return this.masterSecret != null;
    }

    protected final void wrapMessage(aaaj aaajVar, HandshakeMessage handshakeMessage) {
        handshakeMessage.setMessageSeq(this.sendMessageSequence);
        this.sendMessageSequence++;
        int i = this.context.i();
        if (i == 0) {
            this.handshakeMessages.add(handshakeMessage);
        }
        aaajVar.b(i, handshakeMessage);
    }

    protected final void wrapMessage(aaaj aaajVar, ChangeCipherSpecMessage changeCipherSpecMessage) {
        aaajVar.b(this.context.i(), changeCipherSpecMessage);
    }

    protected aabc reassembleFragment(aaav aaavVar) throws aaay {
        this.LOGGER.debug("Processing {} message fragment ...", aaavVar.getMessageType());
        try {
            if (aaavVar.getMessageLength() > this.maxFragmentedHandshakeMessageLength) {
                throw new IllegalArgumentException("Fragmented message length exceeded (" + aaavVar.getMessageLength() + " > " + this.maxFragmentedHandshakeMessageLength + ")!");
            }
            int messageSeq = aaavVar.getMessageSeq();
            aabo aaboVar = this.reassembledMessage;
            if (aaboVar == null) {
                this.reassembledMessage = new aabo(aaavVar);
            } else {
                if (aaboVar.getMessageSeq() != messageSeq) {
                    throw new IllegalArgumentException("Current reassemble message has different seqn " + this.reassembledMessage.getMessageSeq() + " != " + messageSeq);
                }
                this.reassembledMessage.c(aaavVar);
            }
            if (!this.reassembledMessage.a()) {
                return null;
            }
            aabo aaboVar2 = this.reassembledMessage;
            this.LOGGER.debug("Successfully re-assembled {} message", aaboVar2.getMessageType());
            this.reassembledMessage = null;
            return aaboVar2;
        } catch (IllegalArgumentException e2) {
            throw new aaay(e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
    }

    aabb getParameter() {
        aaam session = getSession();
        return new aabb(session.i(), session.s());
    }

    public final aade getServerNames() {
        if (this.sniEnabled) {
            return getSession().m();
        }
        return null;
    }

    public final aaam getSession() {
        return this.context.d();
    }

    public final aaak getDtlsContext() {
        return this.context;
    }

    public final InetSocketAddress getPeerAddress() {
        return this.peer;
    }

    public final aaag getConnection() {
        return this.connection;
    }

    public aaaj createFlight() {
        return new aaaj(this.context, this.flightNumber, getPeerAddress());
    }

    public boolean supportsConnectionId() {
        return aaae.a(this.connectionIdGenerator);
    }

    public aaae getReadConnectionId() {
        if (aaae.c(this.connectionIdGenerator)) {
            return this.connection.c();
        }
        if (aaae.a(this.connectionIdGenerator)) {
            return aaae.f20c;
        }
        return null;
    }

    public aabn getClientRandom() {
        return this.clientRandom;
    }

    public aabn getServerRandom() {
        return this.serverRandom;
    }

    final int getNextReceiveMessageSequenceNumber() {
        return this.nextReceiveMessageSequence;
    }

    public void addApplicationDataForDeferredProcessing(zxx zxxVar) {
        if (this.deferredApplicationData.size() < this.maxDeferredProcessedOutgoingApplicationDataMessages) {
            this.deferredApplicationData.add(zxxVar);
        }
    }

    public void addRecordsOfNextEpochForDeferredProcessing(aabr aabrVar) {
        addDeferredProcessedRecord(aabrVar, this.nextEpochDeferredRecords);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean addDeferredProcessedRecord(aabr aabrVar, Collection<aabr> collection) {
        int iK = aabrVar.k();
        int i = this.deferredIncomingRecordsSize + iK;
        if (i < this.maxDeferredProcessedIncomingRecordsSize) {
            this.deferredIncomingRecordsSize = i;
            collection.add(aabrVar);
            return true;
        }
        this.LOGGER.debug("Dropped incoming record from peer [{}], limit of {} bytes exceeded by {}+{} bytes!", aabrVar.j(), Integer.valueOf(this.maxDeferredProcessedIncomingRecordsSize), Integer.valueOf(this.deferredIncomingRecordsSize), Integer.valueOf(iK));
        this.recordLayer.dropReceivedRecord(aabrVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeferredProcessedRecord(aabr aabrVar, Collection<aabr> collection) {
        if (collection.remove(aabrVar)) {
            int iK = aabrVar.k();
            int i = this.deferredIncomingRecordsSize;
            if (i < iK) {
                this.LOGGER.warn("deferred processed incoming records corrupted for peer [{}]! Removing {} bytes exceeds available {} bytes!", aabrVar.j(), Integer.valueOf(iK), Integer.valueOf(this.deferredIncomingRecordsSize));
                throw new IllegalArgumentException("deferred processing of incoming records corrupted!");
            }
            this.deferredIncomingRecordsSize = i - iK;
        }
    }

    public List<zxx> takeDeferredApplicationData() {
        ArrayList arrayList = new ArrayList(this.deferredApplicationData);
        this.deferredApplicationData.clear();
        return arrayList;
    }

    public List<aabr> takeDeferredRecordsOfNextEpoch() {
        ArrayList arrayList = new ArrayList(this.nextEpochDeferredRecords);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeDeferredProcessedRecord((aabr) it.next(), this.nextEpochDeferredRecords);
        }
        if (!this.nextEpochDeferredRecords.isEmpty()) {
            this.LOGGER.warn("{} left deferred records", Integer.valueOf(this.nextEpochDeferredRecords.size()));
            this.nextEpochDeferredRecords.clear();
        }
        return arrayList;
    }

    public void takeDeferredApplicationData(Handshaker handshaker) {
        this.deferredApplicationData.addAll(handshaker.takeDeferredApplicationData());
    }

    public void completePendingFlight() {
        this.retransmitFlight = null;
        aaaj aaajVar = this.pendingFlight.get();
        if (aaajVar != null) {
            aaajVar.n();
        }
    }

    public void sendLastFlight(aaaj aaajVar) {
        this.timeoutLastFlight = this.timer.schedule(new c(), this.nanosExpireTimeout, TimeUnit.NANOSECONDS);
        aaajVar.d(false);
        sendFlight(aaajVar);
    }

    public void sendFlight(aaaj aaajVar) {
        completePendingFlight();
        try {
            int iNextInt = this.retransmissionTimeout;
            float f = this.retransmissionRandomFactor - 1.0f;
            if (f > 0.0d) {
                iNextInt += aacj.e().nextInt(Math.round(iNextInt * f));
            }
            if (this.eccExpected) {
                iNextInt += this.additionalTimeoutForEcc;
                this.eccExpected = false;
            }
            int iMin = Math.min(iNextInt, this.maxRetransmissionTimeout);
            aaajVar.a(iMin);
            long jC = ClockUtil.c();
            this.flightSendNanos = jC;
            this.nanosExpireTime = this.nanosExpireTimeout + jC;
            int maxDatagramSize = this.recordLayer.getMaxDatagramSize(this.ipv6);
            List<DatagramPacket> listE = aaajVar.e(maxDatagramSize, getSession().b(), this.useMultiHandshakeMessagesRecord, this.useMultiRecordMessages, false);
            this.LOGGER.trace("Sending flight of {} message(s) to peer [{}] using {} datagram(s) of max. {} bytes and {} ms timeout.", Integer.valueOf(aaajVar.d()), this.peerToLog, Integer.valueOf(listE.size()), Integer.valueOf(maxDatagramSize), Integer.valueOf(iMin));
            this.recordLayer.sendFlight(listE);
            this.pendingFlight.set(aaajVar);
            if (aaajVar.i()) {
                a aVar = new a(aaajVar);
                this.retransmitFlight = aVar;
                aaajVar.a(this.timer, aVar);
            }
            int iA = aaajVar.a();
            if (iA > 0) {
                this.context.a(iA);
            }
        } catch (aaay e2) {
            handshakeFailed(new Exception("handshake flight " + aaajVar.c() + " failed!", e2));
        } catch (IOException e3) {
            handshakeFailed(new Exception("handshake flight " + aaajVar.c() + " failed!", e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void handleTimeout(aaaj aaajVar) {
        Handshaker handshakerO;
        String str;
        boolean z;
        if (aaajVar.f() || (handshakerO = this.connection.o()) == null) {
            return;
        }
        if (handshakerO.isProbing() || !this.connection.p()) {
            Throwable th = null;
            th = null;
            boolean z2 = false;
            if (!this.connection.x() || !this.recordLayer.isRunning()) {
                str = " Stopped by shutdown!";
            } else {
                int iE = aaajVar.e();
                if (iE < this.maxRetransmissions && handshakerO.isExpired()) {
                    str = " Stopped by expired realtime!";
                    z = true;
                } else {
                    int i = this.maxRetransmissions;
                    if (iE >= i) {
                        z = true;
                        if (iE > i) {
                            this.LOGGER.debug("Flight for [{}] has reached timeout, discarding ...", this.peerToLog);
                            str = " Stopped by timeout!";
                        } else {
                            this.LOGGER.debug("Flight for [{}] has reached maximum no. [{}] of retransmissions, discarding ...", this.peerToLog, Integer.valueOf(i));
                            str = " Stopped by timeout after " + this.maxRetransmissions + " retransmissions!";
                        }
                    } else {
                        if (this.useEarlyStopRetransmission && aaajVar.j()) {
                            while (iE < this.maxRetransmissions) {
                                iE++;
                                aaajVar.h();
                                aaajVar.b(this.retransmissionTimeoutScale, this.maxRetransmissionTimeout);
                            }
                            aaajVar.h();
                            this.LOGGER.trace("schedule handshake timeout {}ms after flight {}", Integer.valueOf(aaajVar.b()), Integer.valueOf(aaajVar.c()));
                            Runnable runnable = this.retransmitFlight;
                            if (runnable != null) {
                                aaajVar.a(this.timer, runnable);
                                return;
                            }
                            return;
                        }
                        this.LOGGER.trace("Re-transmitting flight for [{}], [{}] retransmissions left", this.peerToLog, Integer.valueOf((this.maxRetransmissions - iE) - 1));
                        try {
                            aaajVar.h();
                            aaajVar.b(this.retransmissionTimeoutScale, this.maxRetransmissionTimeout);
                            int maxDatagramSize = this.recordLayer.getMaxDatagramSize(this.ipv6);
                            int iB = getSession().b();
                            int i2 = this.backOffRetransmission;
                            List<DatagramPacket> listE = aaajVar.e(maxDatagramSize, iB, this.useMultiHandshakeMessagesRecord, this.useMultiRecordMessages, i2 > 0 && iE + 1 > i2);
                            this.LOGGER.debug("Resending flight {} of {} message(s) to peer [{}] using {} datagram(s) of max. {} bytes. Retransmission {} of {}.", Integer.valueOf(aaajVar.c()), Integer.valueOf(aaajVar.d()), this.peerToLog, Integer.valueOf(listE.size()), Integer.valueOf(maxDatagramSize), Integer.valueOf(iE + 1), Integer.valueOf(this.maxRetransmissions));
                            this.recordLayer.sendFlight(listE);
                            Runnable runnable2 = this.retransmitFlight;
                            if (runnable2 != null) {
                                aaajVar.a(this.timer, runnable2);
                            }
                            handshakerO.handshakeFlightRetransmitted(aaajVar.c());
                            return;
                        } catch (aaay e2) {
                            aaay aaayVar = e2;
                            this.LOGGER.warn("Cannot retransmit flight to peer [{}]", this.peerToLog, aaayVar);
                            str = " " + aaayVar.getMessage();
                            th = aaayVar;
                        } catch (IOException e3) {
                            IOException iOException = e3;
                            str = " " + iOException.getMessage();
                            this.LOGGER.warn("Cannot retransmit flight to peer [{}]", this.peerToLog, iOException);
                            th = iOException;
                        }
                    }
                }
                z2 = z;
            }
            this.LOGGER.debug("Flight {} of {} message(s) to peer [{}] failed,{} Retransmission {} of {}.", Integer.valueOf(aaajVar.c()), Integer.valueOf(aaajVar.d()), this.peerToLog, str, Integer.valueOf(aaajVar.e()), Integer.valueOf(this.maxRetransmissions));
            Throwable aaayVar2 = th;
            if (hasPendingApiCall()) {
                aaayVar2 = new aaay("Internal callback timeout!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
            }
            if (aaayVar2 instanceof aaay) {
                this.recordLayer.processHandshakeException(this.connection, (aaay) aaayVar2);
                return;
            }
            if (z2) {
                if (aaajVar.g() && getSession().a().isPskBased()) {
                    str = str + " Wrong PSK identity or secret?";
                }
                handshakerO.handshakeFailed(new aaao("Handshake flight " + aaajVar.c() + " failed!" + str, aaajVar.c()));
                return;
            }
            handshakerO.handshakeFailed(new aaap("Handshake flight " + aaajVar.c() + " failed!" + str, aaayVar2));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f44556a;
        private final Runnable d;

        private b(Runnable runnable, boolean z) {
            this.d = runnable;
            this.f44556a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Handshaker.this.connection.h().execute(this.d);
            } catch (RejectedExecutionException e) {
                Handshaker.this.LOGGER.debug("Execution rejected while execute task of peer: {}", Handshaker.this.connection.m(), e);
                if (this.f44556a) {
                    this.d.run();
                }
            }
        }
    }

    class a extends b {
        private a(final aaaj aaajVar) {
            super(new Runnable() { // from class: org.eclipse.californium.scandium.dtls.Handshaker.a.3
                @Override // java.lang.Runnable
                public void run() {
                    handshaker.handleTimeout(aaajVar);
                }
            }, true);
        }
    }

    class c extends b {
        private c() {
            super(new Runnable() { // from class: org.eclipse.californium.scandium.dtls.Handshaker.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (handshaker.recordLayer.isRunning()) {
                        handshaker.handshakeCompleted();
                    }
                }
            }, false);
        }
    }

    public final void addSessionListener(SessionListener sessionListener) {
        if (sessionListener != null) {
            this.sessionListeners.add(sessionListener);
        }
    }

    public final void removeSessionListener(SessionListener sessionListener) {
        if (sessionListener != null) {
            this.sessionListeners.remove(sessionListener);
        }
    }

    protected final void handshakeStarted() throws aaay {
        this.LOGGER.debug("handshake started {}", this.connection);
        Iterator<SessionListener> it = this.sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().handshakeStarted(this);
        }
    }

    protected final void contextEstablished() throws aaay {
        if (this.contextEstablished) {
            return;
        }
        if (this.context.g().hasValidCipherSuite()) {
            this.LOGGER.debug("dtls context established {}", this.connection);
            amendPeerPrincipal();
            this.contextEstablished = true;
            Iterator<SessionListener> it = this.sessionListeners.iterator();
            while (it.hasNext()) {
                it.next().contextEstablished(this, this.context);
            }
            return;
        }
        handshakeFailed(new aaap("Failed establishing a incomplete session."));
    }

    public final void handshakeCompleted() {
        if (this.handshakeCompleted) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.timeoutLastFlight;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.handshakeCompleted = true;
        completePendingFlight();
        Iterator<SessionListener> it = this.sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().handshakeCompleted(this);
        }
        aadd.a(this);
        this.LOGGER.debug("handshake completed {}", this.connection);
    }

    public final void handshakeFailed(Throwable th) {
        if (this.cause == null) {
            this.cause = th;
        }
        if (this.handshakeFailed || this.cause != th) {
            return;
        }
        this.LOGGER.debug("handshake failed {}", this.connection, th);
        this.handshakeFailed = true;
        completePendingFlight();
        Iterator<SessionListener> it = this.sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().handshakeFailed(this, th);
        }
        aadd.a(this.context);
        aadd.a(this);
    }

    public final void handshakeAborted(Throwable th) {
        this.handshakeAborted = true;
        handshakeFailed(th);
    }

    public boolean hasContextEstablished() {
        return this.contextEstablished;
    }

    public boolean isExpired() {
        return (this.contextEstablished || this.pendingFlight.get() == null || ClockUtil.c() - this.nanosExpireTime <= 0) ? false : true;
    }

    public boolean isPskRequestPending() {
        return this.pskRequestPending;
    }

    public boolean isRemovingConnection() {
        return (this.handshakeAborted || this.connection.p()) ? false : true;
    }

    public Throwable getFailureCause() {
        return this.cause;
    }

    public void setFailureCause(Throwable th) {
        completePendingFlight();
        this.cause = th;
    }

    public void setGenerateClusterMacKeys(boolean z) {
        this.generateClusterMacKeys = z;
    }

    public final void handshakeFlightRetransmitted(int i) {
        Iterator<SessionListener> it = this.sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().handshakeFlightRetransmitted(this, i);
        }
        Iterator<zxx> it2 = this.deferredApplicationData.iterator();
        while (it2.hasNext()) {
            it2.next().a(i);
        }
    }

    public final boolean isChangeCipherSpecMessageExpected() {
        return this.changeCipherSuiteMessageExpected;
    }

    protected final void expectChangeCipherSpecMessage() {
        this.changeCipherSuiteMessageExpected = true;
    }

    protected void expectEcc() {
        this.eccExpected = true;
    }

    public void verifyCertificate(zzz zzzVar, boolean z) throws aaay {
        if (this.certificateVerifier == null) {
            this.LOGGER.debug("Certificate validation failed: no verifier available!");
            throw new aaay("Trust is not possible!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
        }
        this.LOGGER.info("Start certificate verification.");
        this.certificateVerificationPending = true;
        this.otherPeersPublicKey = zzzVar.a();
        aaac aaacVarVerifyCertificate = this.certificateVerifier.verifyCertificate(this.connection.c(), getServerNames(), getPeerAddress(), !isClient(), z, this.useTruncatedCertificatePathForVerification, zzzVar);
        if (aaacVarVerifyCertificate != null) {
            processCertificateVerificationResult(aaacVarVerifyCertificate);
        }
    }

    public boolean requestCertificateIdentity(List<X500Principal> list, aade aadeVar, List<CipherSuite.CertificateKeyAlgorithm> list2, List<SignatureAndHashAlgorithm> list3, List<XECDHECryptography.SupportedGroup> list4) throws aaay {
        aaab aaabVarRequestCertificateIdentity;
        this.certificateIdentityPending = true;
        if (this.certificateIdentityProvider == null) {
            aaabVarRequestCertificateIdentity = new aaab(this.connection.c());
        } else {
            this.LOGGER.info("Start certificate identity.");
            aaabVarRequestCertificateIdentity = this.certificateIdentityProvider.requestCertificateIdentity(this.connection.c(), isClient(), list, aadeVar, list2, list3, list4);
        }
        if (aaabVarRequestCertificateIdentity == null) {
            return true;
        }
        processCertificateIdentityResult(aaabVarRequestCertificateIdentity);
        return false;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.e(this.otherSecret);
        this.otherSecret = null;
        aadd.e(this.masterSecret);
        this.masterSecret = null;
        aadd.e(this.clientWriteKey);
        this.clientWriteKey = null;
        aadd.e(this.clientWriteMACKey);
        this.clientWriteMACKey = null;
        aadd.a((Destroyable) this.clientWriteIV);
        this.clientWriteIV = null;
        aadd.e(this.serverWriteKey);
        this.serverWriteKey = null;
        aadd.e(this.serverWriteMACKey);
        this.serverWriteMACKey = null;
        aadd.a((Destroyable) this.serverWriteIV);
        this.serverWriteIV = null;
        this.destroyed = true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.destroyed;
    }

    protected void ensureUndestroyed() {
        if (this.destroyed) {
            if (this.handshakeFailed) {
                throw new IllegalStateException("secrets destroyed after failure!", this.cause);
            }
            if (this.contextEstablished) {
                throw new IllegalStateException("secrets destroyed after success!");
            }
            throw new IllegalStateException("secrets destroyed ???");
        }
    }

    private void amendPeerPrincipal() {
        aaam session = getSession();
        Principal principalN = session.n();
        ApplicationLevelInfoSupplier applicationLevelInfoSupplier = this.applicationLevelInfoSupplier;
        if (applicationLevelInfoSupplier == null || !(principalN instanceof ExtensiblePrincipal)) {
            return;
        }
        ExtensiblePrincipal extensiblePrincipal = (ExtensiblePrincipal) principalN;
        zyj info = applicationLevelInfoSupplier.getInfo(principalN, this.customArgument);
        if (info != null) {
            session.d(extensiblePrincipal.amend(info));
        }
    }
}
