package defpackage;

import java.security.MessageDigest;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ChangeCipherSpecMessage;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aabw extends aaca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f105a = aaex.a((Class<?>) aabw.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aaaz[] f106b = {new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f107c;
    private boolean e;
    private aaai g;
    private final ResumptionVerifier j;

    public aabw(long j, int i, RecordLayer recordLayer, ScheduledExecutorService scheduledExecutorService, aaag aaagVar, zzy zzyVar) {
        super(j, i, recordLayer, scheduledExecutorService, aaagVar, zzyVar);
        ResumptionVerifier resumptionVerifierT = zzyVar.t();
        this.j = resumptionVerifierT;
        if (resumptionVerifierT == null) {
            throw new IllegalArgumentException("Resumption verifier missing!");
        }
    }

    @Override // defpackage.aaca, org.eclipse.californium.scandium.dtls.Handshaker
    public void doProcessMessage(HandshakeMessage handshakeMessage) throws aaay {
        if (this.e) {
            super.doProcessMessage(handshakeMessage);
            return;
        }
        int i = AnonymousClass1.f108b[handshakeMessage.getMessageType().ordinal()];
        if (i == 1) {
            handshakeStarted();
            e((aaai) handshakeMessage);
        } else {
            if (i == 2) {
                c((aaaw) handshakeMessage);
                return;
            }
            throw new aaay(String.format("Received unexpected handshake message [%s] from peer %s", handshakeMessage.getMessageType(), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
        }
    }

    /* JADX INFO: renamed from: aabw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f108b;

        static {
            int[] iArr = new int[HandshakeType.values().length];
            f108b = iArr;
            try {
                iArr[HandshakeType.CLIENT_HELLO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108b[HandshakeType.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void e(aaai aaaiVar) throws aaay {
        if (!aaaiVar.hasSessionId()) {
            throw new IllegalArgumentException("Client hello doesn't contain session id required for resumption!");
        }
        this.g = aaaiVar;
        aabs aabsVarVerifyResumptionRequest = this.j.verifyResumptionRequest(getConnection().c(), aaaiVar.b(), aaaiVar.getSessionId());
        if (aabsVarVerifyResumptionRequest != null) {
            f105a.debug("Process client hello synchronous");
            b(aabsVarVerifyResumptionRequest);
        } else {
            d();
        }
    }

    private void c(aaaw aaawVar) throws aaay {
        verifyFinished(aaawVar, this.f107c);
        contextEstablished();
        handshakeCompleted();
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean hasPendingApiCall() {
        return this.g != null || super.hasPendingApiCall();
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public void processAsyncHandshakeResult(aaba aabaVar) throws aaay {
        if (aabaVar instanceof aabs) {
            f105a.debug("Process client hello asynchronous");
            ensureUndestroyed();
            b((aabs) aabaVar);
        }
        super.processAsyncHandshakeResult(aabaVar);
    }

    private void b(aabs aabsVar) throws aaay {
        aaai aaaiVar = this.g;
        if (aaaiVar == null) {
            throw new IllegalStateException("resumption verification not pending!");
        }
        this.g = null;
        aaam aaamVarB = aabsVar.b();
        boolean zC = c(aaamVarB, aaaiVar, this.sniEnabled, this.extendedMasterSecretMode);
        this.e = !zC;
        if (!zC) {
            f105a.debug("DTLS session {} not available, switch to full-handshake with peer [{}]!", aaaiVar.getSessionId(), this.peerToLog);
            aadd.a(aaamVarB);
            d(aaaiVar);
        } else {
            getSession().c(aaamVarB);
            aadd.a(aaamVarB);
            setCustomArgument(aabsVar);
            c(aaaiVar);
        }
    }

    private void c(aaai aaaiVar) throws aaay {
        aaam session = getSession();
        CipherSuite cipherSuiteA = session.a();
        f105a.debug("Start resumption-handshake with peer [{}].", this.peerToLog);
        this.clientRandom = aaaiVar.getRandom();
        this.flightNumber += 2;
        aaaj aaajVarCreateFlight = createFlight();
        aabx aabxVar = new aabx(aaaiVar.getProtocolVersion(), session.l(), cipherSuiteA, session.e());
        c(aaaiVar, aabxVar);
        wrapMessage(aaajVarCreateFlight, aabxVar);
        this.serverRandom = aabxVar.getRandom();
        wrapMessage(aaajVarCreateFlight, new ChangeCipherSpecMessage());
        MessageDigest handshakeMessageDigest = getHandshakeMessageDigest();
        MessageDigest messageDigestCloneMessageDigest = cloneMessageDigest(handshakeMessageDigest);
        resumeMasterSecret();
        setCurrentWriteState();
        aaaw aaawVarCreateFinishedMessage = createFinishedMessage(handshakeMessageDigest.digest());
        wrapMessage(aaajVarCreateFlight, aaawVarCreateFinishedMessage);
        messageDigestCloneMessageDigest.update(aaawVarCreateFinishedMessage.toByteArray());
        this.f107c = messageDigestCloneMessageDigest.digest();
        sendFlight(aaajVarCreateFlight);
        setExpectedStates(f106b);
        expectChangeCipherSpecMessage();
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isFullHandshake() {
        return this.e;
    }

    public static boolean c(aaam aaamVar, aaai aaaiVar, boolean z, ExtendedMasterSecretMode extendedMasterSecretMode) {
        if (aaamVar == null) {
            f105a.debug("DTLS session {} not available, switch to full-handshake!", aaaiVar.getSessionId());
            return false;
        }
        CipherSuite cipherSuiteA = aaamVar.a();
        CompressionMethod compressionMethodE = aaamVar.e();
        if (!aaaiVar.c().contains(cipherSuiteA)) {
            f105a.debug("Cipher-suite {} changed by client hello, switch to full-handshake!", cipherSuiteA);
            return false;
        }
        if (!aaamVar.k().equals(aaaiVar.getProtocolVersion())) {
            f105a.debug("Protocol version {} changed by client hello {}, switch to full-handshake!", aaamVar.k(), aaaiVar.getProtocolVersion());
            return false;
        }
        if (!aaaiVar.d().contains(compressionMethodE)) {
            f105a.debug("Compression method {} changed by client hello, switch to full-handshake!", aaamVar.e());
            return false;
        }
        if (extendedMasterSecretMode.is(ExtendedMasterSecretMode.ENABLED) && !aaaiVar.hasExtendedMasterSecretExtension()) {
            f105a.debug("Missing extended master secret extension in client hello, switch to full-handshake!");
            return false;
        }
        if (extendedMasterSecretMode == ExtendedMasterSecretMode.OPTIONAL && aaamVar.q() && !aaaiVar.hasExtendedMasterSecretExtension()) {
            f105a.debug("Disabled extended master secret extension in client hello, switch to full-handshake!");
            return false;
        }
        if (!z) {
            return true;
        }
        aade aadeVarM = aaamVar.m();
        aade aadeVarB = aaaiVar.b();
        if (Objects.equals(aadeVarM, aadeVarB)) {
            return true;
        }
        f105a.debug("SNI {} changed by client hello {}, switch to full-handshake!", aadeVarM, aadeVarB);
        return false;
    }
}
