package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.SecretKey;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CertificateRequest;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.ChangeCipherSpecMessage;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.ECDHServerKeyExchange;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.HelloExtension;
import org.eclipse.californium.scandium.dtls.MaxFragmentLengthExtension;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.SupportedPointFormatsExtension;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.PseudoRandomFunction;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aaaf extends Handshaker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final aaaz[] f21c = {new aaaz(HandshakeType.HELLO_VERIFY_REQUEST, true), new aaaz(HandshakeType.SERVER_HELLO)};
    protected static final aaaz[] d = {new aaaz(HandshakeType.CERTIFICATE), new aaaz(HandshakeType.SERVER_KEY_EXCHANGE), new aaaz(HandshakeType.CERTIFICATE_REQUEST, true), new aaaz(HandshakeType.SERVER_HELLO_DONE), new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};
    private static final aaaz[] l = {new aaaz(HandshakeType.SERVER_KEY_EXCHANGE, true), new aaaz(HandshakeType.SERVER_HELLO_DONE), new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f22a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected aaaj f23b;
    protected aaai e;
    protected final MaxFragmentLengthExtension.Length f;
    protected final List<SignatureAndHashAlgorithm> g;
    protected final List<XECDHECryptography.SupportedGroup> h;
    protected final List<CertificateType> i;
    protected final List<CertificateType> j;
    private aabl k;
    private CertificateRequest m;
    protected final boolean n;
    private final Logger o;
    private final List<CipherSuite> p;
    private boolean q;
    private boolean r;
    private ECDHServerKeyExchange s;
    private final DtlsConfig.DtlsSecureRenegotiation t;
    private final Integer v;
    private final boolean y;

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isClient() {
        return true;
    }

    public aaaf(String str, RecordLayer recordLayer, ScheduledExecutorService scheduledExecutorService, aaag aaagVar, zzy zzyVar, boolean z) {
        super(0L, 0, recordLayer, scheduledExecutorService, aaagVar, zzyVar);
        this.o = aaex.a(getClass());
        this.k = aabl.f90a;
        List<CipherSuite> listX = zzyVar.x();
        boolean zContains = listX.contains(CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV);
        DtlsConfig.DtlsSecureRenegotiation dtlsSecureRenegotiation = (DtlsConfig.DtlsSecureRenegotiation) zzyVar.c(DtlsConfig.as);
        if (zContains && dtlsSecureRenegotiation == DtlsConfig.DtlsSecureRenegotiation.NONE) {
            dtlsSecureRenegotiation = DtlsConfig.DtlsSecureRenegotiation.WANTED;
        } else if (!zContains && dtlsSecureRenegotiation != DtlsConfig.DtlsSecureRenegotiation.NONE) {
            ArrayList arrayList = new ArrayList(listX);
            arrayList.add(CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV);
            listX = arrayList;
        }
        this.t = dtlsSecureRenegotiation;
        this.p = listX;
        this.h = zzyVar.y();
        this.f = (MaxFragmentLengthExtension.Length) zzyVar.c(DtlsConfig.w);
        this.n = ((Boolean) zzyVar.c(DtlsConfig.az)).booleanValue();
        this.j = zzyVar.aa();
        this.i = zzyVar.l();
        this.g = zzyVar.w();
        this.v = (Integer) zzyVar.c(DtlsConfig.bf);
        this.y = ((Boolean) zzyVar.c(DtlsConfig.bp)).booleanValue();
        this.r = z;
        getSession().b(str);
    }

    /* JADX INFO: renamed from: aaaf$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f24c;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HandshakeType.values().length];
            e = iArr;
            try {
                iArr[HandshakeType.HELLO_VERIFY_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HandshakeType.SERVER_HELLO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HandshakeType.CERTIFICATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[HandshakeType.SERVER_KEY_EXCHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[HandshakeType.CERTIFICATE_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[HandshakeType.SERVER_HELLO_DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[HandshakeType.FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[CipherSuite.KeyExchangeAlgorithm.values().length];
            f24c = iArr2;
            try {
                iArr2[CipherSuite.KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24c[CipherSuite.KeyExchangeAlgorithm.PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24c[CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void doProcessMessage(HandshakeMessage handshakeMessage) throws aaay {
        switch (AnonymousClass3.e[handshakeMessage.getMessageType().ordinal()]) {
            case 1:
                e((aabe) handshakeMessage);
                return;
            case 2:
                a((aabx) handshakeMessage);
                return;
            case 3:
                d((zzz) handshakeMessage);
                return;
            case 4:
                int i = AnonymousClass3.f24c[getSession().i().ordinal()];
                if (i == 1) {
                    b((aaax) handshakeMessage);
                    return;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            this.s = (aaat) handshakeMessage;
                            return;
                        }
                        throw new aaay(String.format("Unsupported key exchange algorithm %s", getSession().i().name()), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
                    }
                    return;
                }
            case 5:
                d((CertificateRequest) handshakeMessage);
                return;
            case 6:
                d();
                return;
            case 7:
                d((aaaw) handshakeMessage);
                return;
            default:
                throw new aaay(String.format("Received unexpected handshake message [%s] from peer %s", handshakeMessage.getMessageType(), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
        }
    }

    private void d(aaaw aaawVar) throws aaay {
        verifyFinished(aaawVar, this.f22a);
        contextEstablished();
        handshakeCompleted();
    }

    protected void e(aabe aabeVar) {
        this.handshakeMessages.clear();
        if (CipherSuite.containsEccBasedCipherSuite(this.e.c())) {
            expectEcc();
        }
        this.e.b(aabeVar.e());
        this.flightNumber = 3;
        aaaj aaajVarCreateFlight = createFlight();
        wrapMessage(aaajVarCreateFlight, this.e);
        sendFlight(aaajVarCreateFlight);
        setExpectedStates(f21c);
    }

    protected void a(aabx aabxVar) throws aaay {
        aabl protocolVersion = aabxVar.getProtocolVersion();
        if (!protocolVersion.equals(aabl.f90a)) {
            throw new aaay("The client only supports DTLS v1.2, not " + protocolVersion + "!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.PROTOCOL_VERSION));
        }
        this.serverRandom = aabxVar.getRandom();
        aaam session = getSession();
        session.d(aabxVar.getSessionId());
        session.e(protocolVersion);
        CipherSuite cipherSuiteA = aabxVar.a();
        if (!this.p.contains(cipherSuiteA)) {
            throw new aaay("Server wants to use not supported cipher suite " + cipherSuiteA, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        session.d(cipherSuiteA);
        CompressionMethod compressionMethodC = aabxVar.c();
        if (compressionMethodC != CompressionMethod.NULL) {
            throw new aaay("Server wants to use not supported compression method " + compressionMethodC, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        session.c(aabxVar.c());
        d(aabxVar);
        if (supportsConnectionId()) {
            c(aabxVar.getConnectionIdExtension());
        }
        if (aabxVar.hasExtendedMasterSecretExtension()) {
            session.c(true);
        } else if (this.extendedMasterSecretMode == ExtendedMasterSecretMode.REQUIRED) {
            throw new aaay("Extended Master Secret required!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        session.e(aabxVar.getServerNameExtension() != null);
        setExpectedStates(cipherSuiteA.requiresServerCertificateMessage() ? d : l);
    }

    protected void c(aaan aaanVar) throws aaay {
        if (aaanVar != null) {
            aaae aaaeVarB = aaanVar.b();
            aaak dtlsContext = getDtlsContext();
            dtlsContext.e(aaaeVarB);
            dtlsContext.d(getReadConnectionId());
            dtlsContext.e(aaanVar.e());
        }
    }

    protected void d(aabx aabxVar) throws aaay {
        aabf extensions = aabxVar.getExtensions();
        boolean z = false;
        if (extensions != null && !extensions.d()) {
            aabf extensions2 = this.e.getExtensions();
            if (extensions2 == null || extensions2.d()) {
                throw new aaay("Server wants extensions, but client not!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_EXTENSION));
            }
            for (HelloExtension helloExtension : extensions.e()) {
                if (extensions2.d(helloExtension.getType()) == null) {
                    if (helloExtension.getType() != HelloExtension.ExtensionType.RENEGOTIATION_INFO || this.t == DtlsConfig.DtlsSecureRenegotiation.NONE) {
                        throw new aaay("Server wants " + helloExtension.getType() + ", but client didn't propose it!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_EXTENSION));
                    }
                    z = true;
                }
            }
        }
        SupportedPointFormatsExtension supportedPointFormatsExtension = aabxVar.getSupportedPointFormatsExtension();
        if (supportedPointFormatsExtension != null && !supportedPointFormatsExtension.c(SupportedPointFormatsExtension.ECPointFormat.UNCOMPRESSED)) {
            throw new aaay("Server wants to use only not supported EC point formats!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        aaam session = getSession();
        aabu recordSizeLimitExtension = aabxVar.getRecordSizeLimitExtension();
        if (recordSizeLimitExtension != null) {
            session.e(recordSizeLimitExtension.a());
        }
        MaxFragmentLengthExtension maxFragmentLengthExtension = aabxVar.getMaxFragmentLengthExtension();
        if (maxFragmentLengthExtension != null) {
            if (recordSizeLimitExtension != null) {
                throw new aaay("Server wants to use record size limit and max. fragment size", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
            }
            MaxFragmentLengthExtension.Length lengthD = maxFragmentLengthExtension.d();
            if (this.f == lengthD) {
                session.c(lengthD.length());
            } else {
                throw new aaay("Server wants to use other max. fragment size than proposed", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
            }
        }
        aacb serverCertificateTypeExtension = aabxVar.getServerCertificateTypeExtension();
        if (serverCertificateTypeExtension != null) {
            CertificateType certificateType = serverCertificateTypeExtension.getCertificateType();
            if (!b(certificateType, this.j)) {
                throw new aaay("Server wants to use not supported server certificate type " + certificateType, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
            }
            session.b(certificateType);
        }
        aaaa clientCertificateTypeExtension = aabxVar.getClientCertificateTypeExtension();
        if (clientCertificateTypeExtension != null) {
            CertificateType certificateType2 = clientCertificateTypeExtension.getCertificateType();
            if (!b(certificateType2, this.i)) {
                throw new aaay("Server wants to use not supported client certificate type " + certificateType2, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
            }
            session.c(certificateType2);
        }
        if (z) {
            session.d(true);
        } else if (this.t == DtlsConfig.DtlsSecureRenegotiation.NEEDED) {
            throw new aaay("Server doesn't support secure renegotiation!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
    }

    private void d(zzz zzzVar) throws aaay {
        if (zzzVar.e()) {
            this.o.debug("Certificate validation failed: empty server certificate!");
            throw new aaay("Empty server certificate!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
        }
        verifyCertificate(zzzVar, this.y);
    }

    private void b(aaax aaaxVar) throws aaay {
        aaaxVar.a(this.otherPeersPublicKey, this.clientRandom, this.serverRandom);
        this.s = aaaxVar;
        setOtherPeersSignatureVerified();
    }

    private void d(CertificateRequest certificateRequest) throws aaay {
        this.m = certificateRequest;
        requestCertificateIdentity(certificateRequest.d(), getServerNames(), this.m.c(), this.m.b(), null);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processCertificateIdentityAvailable() throws aaay {
        if (this.q) {
            a();
        }
    }

    private void d() throws aaay {
        this.q = true;
        if (this.m == null || this.certificateIdentityAvailable) {
            a();
        }
    }

    private void a() throws aaay {
        XECDHECryptography xECDHECryptography;
        SecretKey secretKeyB;
        byte[] bArrJ;
        this.flightNumber += 2;
        aaaj aaajVarCreateFlight = createFlight();
        this.f23b = aaajVarCreateFlight;
        b(aaajVarCreateFlight);
        aaam session = getSession();
        CipherSuite.KeyExchangeAlgorithm keyExchangeAlgorithmI = session.i();
        if (CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK == keyExchangeAlgorithmI || CipherSuite.KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN == keyExchangeAlgorithmI) {
            try {
                XECDHECryptography.SupportedGroup supportedGroup = this.s.getSupportedGroup();
                if (this.h.contains(supportedGroup)) {
                    xECDHECryptography = new XECDHECryptography(supportedGroup);
                    secretKeyB = xECDHECryptography.b(this.s.getEncodedPoint());
                    bArrJ = xECDHECryptography.j();
                    session.c(supportedGroup);
                } else {
                    throw new aaay("Cannot process handshake message, ec-group not offered! ", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
                }
            } catch (GeneralSecurityException e) {
                throw new aaay("Cannot process handshake message, caused by " + e.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER), e);
            }
        } else {
            xECDHECryptography = null;
            secretKeyB = null;
            bArrJ = null;
        }
        int i = AnonymousClass3.f24c[keyExchangeAlgorithmI.ordinal()];
        if (i == 1) {
            wrapMessage(this.f23b, new aaas(bArrJ));
            SecretKey secretKeyC = PseudoRandomFunction.c(session.a().getThreadLocalPseudoRandomFunctionMac(), secretKeyB, generateMasterSecretSeed(), session.q());
            applyMasterSecret(secretKeyC);
            aadd.e(secretKeyC);
            processMasterSecret();
        } else if (i == 2) {
            aabp aabpVarE = e();
            this.o.trace("Using PSK identity: {}", aabpVarE);
            wrapMessage(this.f23b, new aabi(aabpVarE));
            requestPskSecretResult(aabpVarE, null, generateMasterSecretSeed());
        } else if (i == 3) {
            aabp aabpVarE2 = e();
            this.o.trace("Using ECDHE PSK identity: {}", aabpVarE2);
            wrapMessage(this.f23b, new aaaq(aabpVarE2, bArrJ));
            requestPskSecretResult(aabpVarE2, secretKeyB, generateMasterSecretSeed());
        }
        aadd.a(xECDHECryptography);
        aadd.e(secretKeyB);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processMasterSecret() throws aaay {
        if (!isExpectedStates(d) || this.otherPeersCertificateVerified) {
            b();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processCertificateVerified() throws aaay {
        if (hasMasterSecret()) {
            b();
        }
    }

    protected void b() throws aaay {
        aaam session = getSession();
        if (session.a().isEccBased()) {
            expectEcc();
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithmT = session.t();
        if (signatureAndHashAlgorithmT != null) {
            wrapMessage(this.f23b, new aaad(signatureAndHashAlgorithmT, this.privateKey, this.handshakeMessages));
        }
        wrapMessage(this.f23b, new ChangeCipherSpecMessage());
        setCurrentWriteState();
        MessageDigest handshakeMessageDigest = getHandshakeMessageDigest();
        MessageDigest messageDigestCloneMessageDigest = cloneMessageDigest(handshakeMessageDigest);
        aaaw aaawVarCreateFinishedMessage = createFinishedMessage(handshakeMessageDigest.digest());
        wrapMessage(this.f23b, aaawVarCreateFinishedMessage);
        messageDigestCloneMessageDigest.update(aaawVarCreateFinishedMessage.toByteArray());
        this.f22a = messageDigestCloneMessageDigest.digest();
        sendFlight(this.f23b);
        expectChangeCipherSpecMessage();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    private void b(aaaj aaajVar) {
        SignatureAndHashAlgorithm signatureAndHashAlgorithmE;
        if (this.m != null) {
            List<SignatureAndHashAlgorithm> list = this.g;
            if (list.isEmpty()) {
                list = SignatureAndHashAlgorithm.f44563a;
            }
            CertificateType certificateTypeR = getSession().r();
            HandshakeMessage zzzVar = null;
            zzzVar = null;
            zzzVar = null;
            if (CertificateType.RAW_PUBLIC_KEY == certificateTypeR) {
                PublicKey publicKey = this.publicKey;
                if (publicKey != null) {
                    signatureAndHashAlgorithmE = this.m.a(publicKey, list);
                    if (signatureAndHashAlgorithmE != null) {
                        zzzVar = new zzz(publicKey);
                        if (this.o.isDebugEnabled()) {
                            this.o.debug("sending CERTIFICATE message with client RawPublicKey [{}] to server", zzp.e(publicKey.getEncoded()));
                        }
                    }
                } else {
                    signatureAndHashAlgorithmE = null;
                }
            } else if (CertificateType.X_509 == certificateTypeR) {
                if (this.certificateChain != null) {
                    signatureAndHashAlgorithmE = this.m.e(this.certificateChain, list);
                    if (signatureAndHashAlgorithmE != null) {
                        zzz zzzVar2 = new zzz(this.certificateChain, this.n ? this.m.d() : null);
                        signatureAndHashAlgorithmE = zzzVar2.e() ? null : signatureAndHashAlgorithmE;
                        zzzVar = zzzVar2;
                    }
                } else {
                    signatureAndHashAlgorithmE = null;
                }
            } else {
                throw new IllegalArgumentException("Certificate type " + certificateTypeR + " not supported!");
            }
            if (zzzVar == null && signatureAndHashAlgorithmE == null) {
                zzzVar = new zzz();
            }
            wrapMessage(aaajVar, zzzVar);
            getSession().a(signatureAndHashAlgorithmE);
        }
    }

    protected static boolean b(CertificateType certificateType, List<CertificateType> list) {
        if (list != null) {
            return list.contains(certificateType);
        }
        return certificateType == CertificateType.X_509;
    }

    public void c() throws aaay {
        handshakeStarted();
        aaai aaaiVar = new aaai(this.k, this.p, this.g, this.i, this.j, this.h);
        if (CipherSuite.containsEccBasedCipherSuite(aaaiVar.c())) {
            expectEcc();
        }
        this.clientRandom = aaaiVar.getRandom();
        aaaiVar.e(CompressionMethod.NULL);
        if (this.extendedMasterSecretMode != ExtendedMasterSecretMode.NONE) {
            aaaiVar.addExtension(aaau.f50a);
        }
        e(aaaiVar);
        b(aaaiVar);
        c(aaaiVar);
        a(aaaiVar);
        this.flightNumber = 1;
        this.e = aaaiVar;
        aaaj aaajVarCreateFlight = createFlight();
        wrapMessage(aaajVarCreateFlight, aaaiVar);
        sendFlight(aaajVarCreateFlight);
        setExpectedStates(f21c);
    }

    protected void b(aaai aaaiVar) {
        if (this.recordSizeLimit != null) {
            aaaiVar.addExtension(new aabu(this.recordSizeLimit.intValue()));
            this.o.debug("Indicating record size limit [{}] to server [{}]", this.recordSizeLimit, this.peerToLog);
        }
    }

    protected void c(aaai aaaiVar) {
        if (this.f != null) {
            aaaiVar.addExtension(new MaxFragmentLengthExtension(this.f));
            this.o.debug("Indicating max. fragment length [{}] to server [{}]", this.f, this.peerToLog);
        }
    }

    protected void e(aaai aaaiVar) {
        aaae aaaeVarC;
        HelloExtension.ExtensionType extensionTypeById;
        if (supportsConnectionId()) {
            if (this.connectionIdGenerator.useConnectionId()) {
                aaaeVarC = getConnection().c();
            } else {
                aaaeVarC = aaae.f20c;
            }
            Integer num = this.v;
            if (num != null) {
                extensionTypeById = HelloExtension.ExtensionType.getExtensionTypeById(num.intValue());
            } else {
                extensionTypeById = HelloExtension.ExtensionType.CONNECTION_ID;
            }
            aaaiVar.addExtension(aaan.c(aaaeVarC, extensionTypeById));
        }
    }

    protected void a(aaai aaaiVar) {
        aade serverNames = getServerNames();
        if (serverNames != null) {
            this.o.debug("adding SNI extension to CLIENT_HELLO message [{}]", getSession().j());
            aaaiVar.addExtension(aaby.c(serverNames));
        }
    }

    protected aabp e() throws aaay {
        aade serverNames = getServerNames();
        if (serverNames != null && !getSession().p()) {
            this.o.warn("client is configured to use SNI but server does not support it, PSK authentication is likely to fail");
        }
        aabp identity = this.advancedPskStore.getIdentity(getPeerAddress(), serverNames);
        if (identity != null) {
            return identity;
        }
        AlertMessage alertMessage = new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR);
        if (serverNames != null) {
            throw new aaay(String.format("No Identity found for peer [address: %s, virtual host: %s]", this.peerToLog, getSession().j()), alertMessage);
        }
        throw new aaay(String.format("No Identity found for peer [address: %s]", this.peerToLog), alertMessage);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isProbing() {
        return this.r;
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void resetProbing() {
        this.r = false;
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isRemovingConnection() {
        return !this.r && super.isRemovingConnection();
    }
}
