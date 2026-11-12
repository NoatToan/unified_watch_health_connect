package defpackage;

import java.security.MessageDigest;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ChangeCipherSpecMessage;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aabv extends aaaf {
    private volatile boolean k;
    private static final Logger o = aaex.a((Class<?>) aabv.class);
    private static final aaaz[] l = {new aaaz(ContentType.CHANGE_CIPHER_SPEC), new aaaz(HandshakeType.FINISHED)};

    public aabv(aaam aaamVar, RecordLayer recordLayer, ScheduledExecutorService scheduledExecutorService, aaag aaagVar, zzy zzyVar, boolean z) {
        super(null, recordLayer, scheduledExecutorService, aaagVar, zzyVar, z);
        this.k = false;
        aacd aacdVarL = aaamVar.l();
        if (aacdVarL == null || aacdVarL.b()) {
            throw new IllegalArgumentException("Session must contain the ID of the session to resume");
        }
        getSession().c(aaamVar);
    }

    @Override // defpackage.aaaf, org.eclipse.californium.scandium.dtls.Handshaker
    public void doProcessMessage(HandshakeMessage handshakeMessage) throws aaay {
        if (this.k) {
            super.doProcessMessage(handshakeMessage);
            return;
        }
        int i = AnonymousClass1.f104a[handshakeMessage.getMessageType().ordinal()];
        if (i == 1) {
            e((aabe) handshakeMessage);
        } else if (i == 2) {
            a((aabx) handshakeMessage);
        } else {
            if (i == 3) {
                b((aaaw) handshakeMessage);
                return;
            }
            throw new aaay(String.format("Received unexpected handshake message [%s] from peer %s", handshakeMessage.getMessageType(), this.peerToLog), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
        }
    }

    /* JADX INFO: renamed from: aabv$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104a;

        static {
            int[] iArr = new int[HandshakeType.values().length];
            f104a = iArr;
            try {
                iArr[HandshakeType.HELLO_VERIFY_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104a[HandshakeType.SERVER_HELLO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104a[HandshakeType.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // defpackage.aaaf
    protected void a(aabx aabxVar) throws aaay {
        aaam session = getSession();
        if (!session.l().equals(aabxVar.getSessionId())) {
            o.debug("Server [{}] refuses to resume session [{}], performing full handshake instead...", this.peerToLog, session.l());
            this.k = true;
            aadd.a(session);
            super.a(aabxVar);
            return;
        }
        if (!aabxVar.c().equals(session.e())) {
            throw new aaay("Server wants to change compression method in resumed session", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        if (!aabxVar.a().equals(session.a())) {
            throw new aaay("Server wants to change cipher suite in resumed session", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        if (session.q() && !aabxVar.hasExtendedMasterSecretExtension()) {
            throw new aaay("Server wants to change extended master secret in resumed session", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        if (!session.k().equals(aabxVar.getProtocolVersion())) {
            throw new aaay("Server wants to change protocol version in resumed session", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        d(aabxVar);
        this.serverRandom = aabxVar.getRandom();
        if (supportsConnectionId()) {
            c(aabxVar.getConnectionIdExtension());
        }
        setExpectedStates(l);
        expectChangeCipherSpecMessage();
        resumeMasterSecret();
    }

    private void b(aaaw aaawVar) throws aaay {
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

    @Override // defpackage.aaaf
    public void c() throws aaay {
        handshakeStarted();
        aaam session = getSession();
        aaai aaaiVar = new aaai(aabl.f90a, session, this.g, this.i, this.j, this.h);
        if (CipherSuite.containsEccBasedCipherSuite(aaaiVar.c())) {
            expectEcc();
        }
        this.clientRandom = aaaiVar.getRandom();
        if (session.q()) {
            aaaiVar.addExtension(aaau.f50a);
        }
        e(aaaiVar);
        b(aaaiVar);
        c(aaaiVar);
        a(aaaiVar);
        this.e = aaaiVar;
        this.flightNumber = 1;
        aaaj aaajVarCreateFlight = createFlight();
        wrapMessage(aaajVarCreateFlight, aaaiVar);
        sendFlight(aaajVarCreateFlight);
        setExpectedStates(f21c);
    }

    @Override // org.eclipse.californium.scandium.dtls.Handshaker
    public boolean isFullHandshake() {
        return this.k;
    }
}
