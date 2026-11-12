package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import org.eclipse.californium.elements.config.CertificateAuthenticationMode;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CertificateRequest;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.CertificateTypeExtension;
import org.eclipse.californium.scandium.dtls.ChangeCipherSpecMessage;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.MaxFragmentLengthExtension;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.SupportedPointFormatsExtension;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuiteParameters;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuiteSelector;
import org.eclipse.californium.scandium.dtls.cipher.PseudoRandomFunction;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aaca extends Handshaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f116a;
    private final Logger f;
    private aaad g;
    private final CertificateAuthenticationMode h;
    private CipherSuiteParameters i;
    private final CipherSuiteSelector j;
    private aabp k;
    private XECDHECryptography l;
    private final DtlsConfig.DtlsSecureRenegotiation m;
    private final boolean n;
    private aaai o;
    private final List<CertificateType> p;
    private final List<CertificateType> q;
    private final List<CipherSuite> r;
    private final List<XECDHECryptography.SupportedGroup> s;
    private final List<CipherSuite.CertificateKeyAlgorithm> t;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final List<SignatureAndHashAlgorithm> y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final aaaz[] f115c = {new aaaz(HandshakeType.CLIENT_HELLO)};
    private static final aaaz[] e = {new aaaz(HandshakeType.CERTIFICATE), new aaaz(HandshakeType.CLIENT_KEY_EXCHANGE), new aaaz(HandshakeType.CERTIFICATE_VERIFY), new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aaaz[] f114b = {new aaaz(HandshakeType.CLIENT_KEY_EXCHANGE), new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};
    protected static final aaaz[] d = {new aaaz(HandshakeType.CLIENT_KEY_EXCHANGE), new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isClient() {
        return false;
    }

    public aaca(long j, int i, RecordLayer recordLayer, ScheduledExecutorService scheduledExecutorService, aaag aaagVar, zzy zzyVar) {
        super(j, i, recordLayer, scheduledExecutorService, aaagVar, zzyVar);
        Logger loggerA = aaex.a(getClass());
        this.f116a = loggerA;
        this.f = aaex.a(loggerA.getName() + ".negotiation");
        this.j = zzyVar.f();
        this.r = zzyVar.x();
        this.s = zzyVar.y();
        this.m = (DtlsConfig.DtlsSecureRenegotiation) zzyVar.c(DtlsConfig.as);
        this.h = (CertificateAuthenticationMode) zzyVar.c(DtlsConfig.j);
        this.x = ((Boolean) zzyVar.c(DtlsConfig.av)).booleanValue();
        boolean zBooleanValue = ((Boolean) zzyVar.c(DtlsConfig.be)).booleanValue();
        this.v = zBooleanValue;
        this.w = zBooleanValue && ((Boolean) zzyVar.c(DtlsConfig.bl)).booleanValue();
        this.p = zzyVar.aa();
        this.q = zzyVar.l();
        this.y = zzyVar.w();
        this.t = zzyVar.v();
        this.n = ((Boolean) zzyVar.c(DtlsConfig.aw)).booleanValue();
        setExpectedStates(f115c);
    }

    /* JADX INFO: renamed from: aaca$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f117a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f118c;

        static {
            int[] iArr = new int[HandshakeType.values().length];
            f117a = iArr;
            try {
                iArr[HandshakeType.CLIENT_HELLO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117a[HandshakeType.CERTIFICATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117a[HandshakeType.CLIENT_KEY_EXCHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117a[HandshakeType.CERTIFICATE_VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117a[HandshakeType.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[CipherSuite.KeyExchangeAlgorithm.values().length];
            f118c = iArr2;
            try {
                iArr2[CipherSuite.KeyExchangeAlgorithm.PSK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118c[CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f118c[CipherSuite.KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void doProcessMessage(HandshakeMessage handshakeMessage) throws aaay {
        int i = AnonymousClass4.f117a[handshakeMessage.getMessageType().ordinal()];
        if (i == 1) {
            handshakeStarted();
            d((aaai) handshakeMessage);
            return;
        }
        if (i == 2) {
            c((zzz) handshakeMessage);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    a((aaaw) handshakeMessage);
                    return;
                }
                throw new aaay(String.format("Received unexpected %s message from peer %s", handshakeMessage.getMessageType(), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
            }
            e((aaad) handshakeMessage);
            if (hasMasterSecret() && this.otherPeersCertificateVerified) {
                expectChangeCipherSpecMessage();
                return;
            }
            return;
        }
        int i2 = AnonymousClass4.f118c[getSession().i().ordinal()];
        if (i2 == 1) {
            e((aabi) handshakeMessage);
            return;
        }
        if (i2 == 2) {
            d((aaaq) handshakeMessage);
        } else {
            if (i2 != 3) {
                return;
            }
            SecretKey secretKeyD = d((aaas) handshakeMessage);
            applyMasterSecret(secretKeyD);
            aadd.e(secretKeyD);
            processMasterSecret();
        }
    }

    protected void d() {
        aaaj aaajVarCreateFlight = createFlight();
        aaajVarCreateFlight.o();
        sendFlight(aaajVarCreateFlight);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processMasterSecret() {
        if (isExpectedStates(d) || isExpectedStates(f114b) || (isExpectedStates(e) && this.otherPeersCertificateVerified && this.g != null)) {
            expectChangeCipherSpecMessage();
        }
    }

    private void c(zzz zzzVar) throws aaay {
        if (zzzVar.e()) {
            if (this.h == CertificateAuthenticationMode.NEEDED) {
                this.f116a.debug("Client authentication failed: missing certificate!");
                throw new aaay("Client Certificate required!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
            }
            setExpectedStates(f114b);
            return;
        }
        verifyCertificate(zzzVar, false);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processCertificateVerified() {
        if (!hasMasterSecret() || this.g == null) {
            return;
        }
        expectChangeCipherSpecMessage();
    }

    private void e(aaad aaadVar) throws aaay {
        this.g = aaadVar;
        this.handshakeMessages.remove(this.handshakeMessages.size() - 1);
        aaadVar.e(this.otherPeersPublicKey, this.handshakeMessages);
        this.handshakeMessages.add(aaadVar);
        if (setOtherPeersSignatureVerified() && hasMasterSecret()) {
            expectChangeCipherSpecMessage();
        }
    }

    private void a(aaaw aaawVar) throws aaay {
        if (this.h == CertificateAuthenticationMode.NEEDED && isExpectedStates(f114b)) {
            throw new aaay("Client did not send required authentication messages.", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
        }
        this.flightNumber += 2;
        aaaj aaajVarCreateFlight = createFlight();
        MessageDigest handshakeMessageDigest = getHandshakeMessageDigest();
        MessageDigest messageDigestCloneMessageDigest = cloneMessageDigest(handshakeMessageDigest);
        verifyFinished(aaawVar, handshakeMessageDigest.digest());
        wrapMessage(aaajVarCreateFlight, new ChangeCipherSpecMessage());
        setCurrentWriteState();
        messageDigestCloneMessageDigest.update(aaawVar.toByteArray());
        wrapMessage(aaajVarCreateFlight, createFinishedMessage(messageDigestCloneMessageDigest.digest()));
        sendLastFlight(aaajVarCreateFlight);
        contextEstablished();
    }

    protected void d(aaai aaaiVar) throws aaay {
        a(aaaiVar.getProtocolVersion());
        if (!aaaiVar.d().contains(CompressionMethod.NULL)) {
            throw new aaay("Client does not support NULL compression method", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        List<CipherSuite> listC = c(aaaiVar);
        if (listC.isEmpty()) {
            this.f116a.trace("Server cipher suites: {}", this.r);
            throw new aaay("Client does not propose a common cipher suite", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        if (this.v && !this.w && !aaaiVar.g()) {
            aacd aacdVarL = getSession().l();
            if (aacdVarL.b() || !aacdVarL.equals(aaaiVar.getSessionId())) {
                ArrayList arrayList = new ArrayList();
                for (CipherSuite cipherSuite : listC) {
                    if (cipherSuite.isPskBased()) {
                        arrayList.add(cipherSuite);
                    }
                }
                listC = arrayList;
            }
        }
        List<CertificateType> listB = b(aaaiVar.getServerCertificateTypeExtension());
        List<CertificateType> listC2 = c(aaaiVar.getClientCertificateTypeExtension());
        List<XECDHECryptography.SupportedGroup> listC3 = c(aaaiVar.a());
        List<SignatureAndHashAlgorithm> listD = d(aaaiVar.getSupportedSignatureAlgorithmsExtension());
        SupportedPointFormatsExtension.ECPointFormat eCPointFormatA = a(aaaiVar.getSupportedPointFormatsExtension());
        aaby serverNameExtension = aaaiVar.getServerNameExtension();
        if (serverNameExtension != null) {
            if (this.sniEnabled) {
                aaam session = getSession();
                session.c(serverNameExtension.e());
                session.e(true);
                this.f116a.debug("using server name indication received from peer [{}]", this.peerToLog);
            } else {
                this.f116a.debug("client [{}] included SNI in HELLO but SNI support is disabled", this.peerToLog);
            }
        }
        this.i = new CipherSuiteParameters(null, null, this.h, listC, listB, listC2, listC3, listD, eCPointFormatA);
        if (CipherSuite.containsCipherSuiteRequiringCertExchange(listC)) {
            this.o = aaaiVar;
            if (requestCertificateIdentity(null, getServerNames(), CipherSuite.getCertificateKeyAlgorithms(listC), listD, listC3)) {
                d();
                return;
            }
            return;
        }
        a(aaaiVar);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processCertificateIdentityAvailable() throws aaay {
        this.i = new CipherSuiteParameters(this.publicKey, this.certificateChain, this.i);
        aaai aaaiVar = this.o;
        this.o = null;
        a(aaaiVar);
    }

    protected void a(aaai aaaiVar) throws aaay {
        e(aaaiVar);
        this.flightNumber = aaaiVar.g() ? 4 : 2;
        aaaj aaajVarCreateFlight = createFlight();
        b(aaaiVar, aaajVarCreateFlight);
        b(aaajVarCreateFlight);
        d(aaajVarCreateFlight);
        setExpectedStates(e(aaajVarCreateFlight) ? e : d);
        wrapMessage(aaajVarCreateFlight, new aabz());
        sendFlight(aaajVarCreateFlight);
    }

    private void b(aaai aaaiVar, aaaj aaajVar) throws aaay {
        aabl aablVarA = a(aaaiVar.getProtocolVersion());
        this.clientRandom = aaaiVar.getRandom();
        aaam session = getSession();
        aacd aacdVar = ((!this.extendedMasterSecretMode.is(ExtendedMasterSecretMode.ENABLED) || aaaiVar.hasExtendedMasterSecretExtension()) && this.x) ? new aacd() : aacd.e();
        session.d(aacdVar);
        session.e(aablVarA);
        session.c(CompressionMethod.NULL);
        aabx aabxVar = new aabx(aablVarA, aacdVar, session.a(), session.e());
        c(aaaiVar, aabxVar);
        if (aabxVar.a().isEccBased()) {
            expectEcc();
        }
        wrapMessage(aaajVar, aabxVar);
        this.serverRandom = aabxVar.getRandom();
    }

    private void b(aaaj aaajVar) {
        zzz zzzVar;
        aaam session = getSession();
        if (session.a().requiresServerCertificateMessage()) {
            CertificateType certificateTypeR = session.r();
            if (CertificateType.RAW_PUBLIC_KEY == certificateTypeR) {
                zzzVar = new zzz(this.i.g());
            } else if (CertificateType.X_509 == certificateTypeR) {
                zzzVar = new zzz(this.i.a());
            } else {
                throw new IllegalArgumentException("Certificate type " + certificateTypeR + " not supported!");
            }
            wrapMessage(aaajVar, zzzVar);
        }
    }

    private void d(aaaj aaajVar) throws aaay {
        HandshakeMessage aaatVar;
        aaam session = getSession();
        CipherSuite.KeyExchangeAlgorithm keyExchangeAlgorithmI = session.i();
        if (CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK == keyExchangeAlgorithmI || CipherSuite.KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN == keyExchangeAlgorithmI) {
            try {
                XECDHECryptography.SupportedGroup supportedGroupM = this.i.m();
                this.l = new XECDHECryptography(supportedGroupM);
                session.c(supportedGroupM);
            } catch (GeneralSecurityException e2) {
                throw new aaay("Cannot process handshake message, caused by " + e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER), e2);
            }
        }
        int i = AnonymousClass4.f118c[keyExchangeAlgorithmI.ordinal()];
        if (i != 2) {
            aaatVar = i != 3 ? null : new aaax(session.t(), this.l, this.privateKey, this.clientRandom, this.serverRandom);
        } else {
            aaatVar = new aaat(aabp.e, this.l);
        }
        if (aaatVar != null) {
            wrapMessage(aaajVar, aaatVar);
        }
    }

    private boolean e(aaaj aaajVar) {
        aaam session = getSession();
        CertificateType certificateTypeS = session.s();
        if (!this.h.useCertificateRequest() || !session.a().requiresServerCertificateMessage() || certificateTypeS == null) {
            return false;
        }
        CertificateRequest certificateRequest = new CertificateRequest();
        List<SignatureAndHashAlgorithm> listC = this.y;
        List<CipherSuite.CertificateKeyAlgorithm> list = this.t;
        if (CertificateType.X_509 == certificateTypeS) {
            certificateRequest.d(listC);
            if (this.certificateVerifier != null) {
                certificateRequest.e(this.certificateVerifier.getAcceptedIssuers());
            }
        } else if (CertificateType.RAW_PUBLIC_KEY == certificateTypeS) {
            CipherSuite.CertificateKeyAlgorithm algorithm = CipherSuite.CertificateKeyAlgorithm.getAlgorithm(this.publicKey);
            if (list.get(0) != algorithm && list.contains(algorithm)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(algorithm);
                arrayList.add(0, algorithm);
                list = arrayList;
            }
            listC = SignatureAndHashAlgorithm.c(listC, list);
            certificateRequest.d(listC);
        }
        this.f116a.trace("Certificate Type: {}", certificateTypeS);
        this.f116a.trace("Signature and hash algorithms {}/{}", listC, this.y);
        this.f116a.trace("Certificate key algorithms {}/{}", list, this.t);
        for (CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm : list) {
            if (SignatureAndHashAlgorithm.d(listC, certificateKeyAlgorithm)) {
                certificateRequest.c(certificateKeyAlgorithm);
            }
        }
        wrapMessage(aaajVar, certificateRequest);
        return true;
    }

    private SecretKey d(aaas aaasVar) throws aaay {
        try {
            aaam session = getSession();
            SecretKey secretKeyB = this.l.b(aaasVar.d());
            SecretKey secretKeyC = PseudoRandomFunction.c(session.a().getThreadLocalPseudoRandomFunctionMac(), secretKeyB, generateMasterSecretSeed(), session.q());
            aadd.e(secretKeyB);
            return secretKeyC;
        } catch (GeneralSecurityException e2) {
            throw new aaay("Cannot process handshake message, caused by " + e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER), e2);
        }
    }

    private void e(aabi aabiVar) throws aaay {
        this.k = aabiVar.b();
        requestPskSecretResult(this.k, null, generateMasterSecretSeed());
    }

    private void d(aaaq aaaqVar) throws aaay {
        SecretKey secretKeyB = null;
        try {
            try {
                this.k = aaaqVar.c();
                secretKeyB = this.l.b(aaaqVar.d());
                requestPskSecretResult(this.k, secretKeyB, generateMasterSecretSeed());
                aadd.e(secretKeyB);
            } catch (GeneralSecurityException e2) {
                throw new aaay("Cannot process handshake message, caused by " + e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER), e2);
            }
        } catch (Throwable th) {
            aadd.e(secretKeyB);
            throw th;
        }
    }

    protected void c(aaai aaaiVar, aabx aabxVar) throws aaay {
        aaan connectionIdExtension;
        MaxFragmentLengthExtension maxFragmentLengthExtension;
        aacb serverCertificateTypeExtension;
        CertificateType certificateTypeS;
        aaaa clientCertificateTypeExtension;
        aaam session = getSession();
        if (aaaiVar.hasExtendedMasterSecretExtension()) {
            if (this.extendedMasterSecretMode != ExtendedMasterSecretMode.NONE) {
                session.c(true);
                aabxVar.addExtension(aaau.f50a);
            }
        } else if (this.extendedMasterSecretMode == ExtendedMasterSecretMode.REQUIRED) {
            throw new aaay("Extended Master Secret required!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        if (aaaiVar.h()) {
            if (this.m != DtlsConfig.DtlsSecureRenegotiation.NONE) {
                aabxVar.addExtension(aabt.f102c);
                session.d(true);
            }
        } else if (this.m == DtlsConfig.DtlsSecureRenegotiation.NEEDED) {
            throw new aaay("Secure renegotiation required!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        if (session.a().requiresServerCertificateMessage()) {
            if (this.h.useCertificateRequest() && (certificateTypeS = session.s()) != null && (clientCertificateTypeExtension = aaaiVar.getClientCertificateTypeExtension()) != null && clientCertificateTypeExtension.contains(certificateTypeS)) {
                aabxVar.addExtension(new aaaa(certificateTypeS));
            }
            CertificateType certificateTypeR = session.r();
            if (certificateTypeR != null && (serverCertificateTypeExtension = aaaiVar.getServerCertificateTypeExtension()) != null && serverCertificateTypeExtension.contains(certificateTypeR)) {
                aabxVar.addExtension(new aacb(certificateTypeR));
            }
        }
        if (session.a().isEccBased() && aaaiVar.getSupportedPointFormatsExtension() != null) {
            aabxVar.addExtension(SupportedPointFormatsExtension.f44566b);
        }
        aabu recordSizeLimitExtension = aaaiVar.getRecordSizeLimitExtension();
        if (recordSizeLimitExtension != null) {
            session.e(recordSizeLimitExtension.a());
            int iH = this.recordSizeLimit == null ? session.h() : this.recordSizeLimit.intValue();
            aabxVar.addExtension(new aabu(iH));
            this.f116a.debug("Received record size limit [{} bytes] from peer [{}]", Integer.valueOf(iH), this.peerToLog);
        }
        if (recordSizeLimitExtension == null && (maxFragmentLengthExtension = aaaiVar.getMaxFragmentLengthExtension()) != null) {
            session.c(maxFragmentLengthExtension.d().length());
            aabxVar.addExtension(maxFragmentLengthExtension);
            this.f116a.debug("Negotiated max. fragment length [{} bytes] with peer [{}]", Integer.valueOf(maxFragmentLengthExtension.d().length()), this.peerToLog);
        }
        if (aaaiVar.getServerNameExtension() != null && this.sniEnabled) {
            aabxVar.addExtension(aaby.c());
        }
        if (!supportsConnectionId() || (connectionIdExtension = aaaiVar.getConnectionIdExtension()) == null) {
            return;
        }
        boolean zE = connectionIdExtension.e();
        if (!zE || this.n) {
            aaae readConnectionId = getReadConnectionId();
            aabxVar.addExtension(aaan.c(readConnectionId, connectionIdExtension.getType()));
            aaak dtlsContext = getDtlsContext();
            dtlsContext.e(connectionIdExtension.b());
            dtlsContext.d(readConnectionId);
            dtlsContext.e(zE);
        }
    }

    private aabl a(aabl aablVar) throws aaay {
        if (aablVar.compareTo(aabl.f90a) >= 0) {
            return aabl.f90a;
        }
        throw new aaay("The server only supports DTLS v1.2, not " + aablVar + "!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.PROTOCOL_VERSION, aablVar.compareTo(aabl.f91b) < 0 ? aabl.f91b : aablVar));
    }

    private void e(aaai aaaiVar) throws aaay {
        this.f116a.trace("Negotiate on: {}", this.i);
        if (this.j.select(this.i)) {
            this.f116a.debug("Negotiated: {}", this.i);
            aaam session = getSession();
            CipherSuite cipherSuiteI = this.i.i();
            session.d(cipherSuiteI);
            if (cipherSuiteI.requiresServerCertificateMessage()) {
                session.a(this.i.o());
                CertificateType certificateTypeN = this.i.n();
                if (certificateTypeN == null) {
                    throw new aaay("No common server certificate type!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_CERTIFICATE));
                }
                session.c(certificateTypeN);
                CertificateType certificateTypeK = this.i.k();
                if (this.h == CertificateAuthenticationMode.NEEDED) {
                    if (certificateTypeK == null) {
                        throw new aaay("No common client certificate type!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_CERTIFICATE));
                    }
                    session.b(certificateTypeK);
                } else if (this.h == CertificateAuthenticationMode.WANTED && certificateTypeK != null) {
                    session.b(certificateTypeK);
                }
            }
            this.f116a.debug("Negotiated cipher suite [{}] with peer [{}]", cipherSuiteI.name(), this.peerToLog);
            return;
        }
        if (this.f.isDebugEnabled()) {
            this.f.debug("{}", aaaiVar);
            this.f.debug("{}", this.i.f());
            this.f.trace("Parameters: {}", this.i);
        }
        String strJ = this.i.j();
        if (strJ == null) {
            strJ = "Client proposed unsupported cipher suites or parameters only";
        }
        this.i = null;
        throw new aaay(strJ, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
    }

    private List<XECDHECryptography.SupportedGroup> c(aace aaceVar) {
        ArrayList arrayList = new ArrayList();
        if (aaceVar == null) {
            arrayList.addAll(this.s);
            return arrayList;
        }
        for (XECDHECryptography.SupportedGroup supportedGroup : aaceVar.d()) {
            if (this.s.contains(supportedGroup)) {
                arrayList.add(supportedGroup);
            }
        }
        return arrayList;
    }

    private SupportedPointFormatsExtension.ECPointFormat a(SupportedPointFormatsExtension supportedPointFormatsExtension) {
        if (supportedPointFormatsExtension == null) {
            return SupportedPointFormatsExtension.ECPointFormat.UNCOMPRESSED;
        }
        if (supportedPointFormatsExtension.c(SupportedPointFormatsExtension.ECPointFormat.UNCOMPRESSED)) {
            return SupportedPointFormatsExtension.ECPointFormat.UNCOMPRESSED;
        }
        return null;
    }

    private List<SignatureAndHashAlgorithm> d(aacf aacfVar) {
        if (aacfVar == null) {
            return new ArrayList(this.y);
        }
        return SignatureAndHashAlgorithm.a(aacfVar.d(), this.y);
    }

    private List<CipherSuite> c(aaai aaaiVar) {
        List<CipherSuite> listAsList = this.r;
        CipherSuite cipherSuiteA = getSession().a();
        if (cipherSuiteA.isValidForNegotiation()) {
            listAsList = Arrays.asList(cipherSuiteA);
        }
        return CipherSuite.preselectCipherSuites(listAsList, aaaiVar.c());
    }

    private List<CertificateType> c(aaaa aaaaVar) {
        List arrayList = this.p;
        Principal principalN = getSession().n();
        if (principalN != null) {
            arrayList = new ArrayList();
            if (principalN instanceof zyg) {
                arrayList.add(CertificateType.RAW_PUBLIC_KEY);
            } else if (principalN instanceof zyo) {
                arrayList.add(CertificateType.X_509);
            }
        }
        return a(aaaaVar, arrayList);
    }

    private List<CertificateType> b(aacb aacbVar) {
        return a(aacbVar, this.q);
    }

    private static List<CertificateType> a(CertificateTypeExtension certificateTypeExtension, List<CertificateType> list) {
        if (list != null) {
            if (certificateTypeExtension != null) {
                return certificateTypeExtension.getCommonCertificateTypes(list);
            }
            if (list.contains(CertificateType.X_509)) {
                return CertificateTypeExtension.DEFAULT_X509;
            }
        }
        return CertificateTypeExtension.EMPTY;
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker, javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.a(this.l);
        this.l = null;
    }
}
