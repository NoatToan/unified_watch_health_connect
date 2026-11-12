package org.eclipse.californium.scandium.dtls;

import defpackage.aaaa;
import defpackage.aaan;
import defpackage.aabf;
import defpackage.aabl;
import defpackage.aabn;
import defpackage.aabu;
import defpackage.aaby;
import defpackage.aacb;
import defpackage.aacd;
import defpackage.aacf;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HelloHandshakeMessage extends HandshakeMessage {
    protected static final int RANDOM_BYTES = 32;
    protected static final int SESSION_ID_LENGTH_BITS = 8;
    protected static final int VERSION_BITS = 8;
    protected final aabf extensions = new aabf();
    protected final aabl protocolVersion;
    protected final aabn random;
    protected final aacd sessionId;

    public HelloHandshakeMessage(aabl aablVar, aacd aacdVar) {
        if (aablVar == null) {
            throw new NullPointerException("Negotiated protocol version must not be null");
        }
        if (aacdVar == null) {
            throw new NullPointerException("ServerHello must be associated with a session ID");
        }
        this.protocolVersion = aablVar;
        this.sessionId = aacdVar;
        this.random = new aabn();
    }

    public HelloHandshakeMessage(zzf zzfVar) {
        this.protocolVersion = aabl.a(zzfVar.a(8), zzfVar.a(8));
        this.random = new aabn(zzfVar.b(32));
        this.sessionId = new aacd(zzfVar.j(8));
    }

    protected void writeHeader(zzl zzlVar) {
        zzlVar.d(this.protocolVersion.c(), 8);
        zzlVar.d(this.protocolVersion.d(), 8);
        zzlVar.a(this.random.d());
        zzlVar.c(this.sessionId, 8);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        String strD = zzp.d(i + 1);
        sb.append(strD);
        sb.append("Version: ");
        sb.append(this.protocolVersion.c());
        sb.append(", ");
        sb.append(this.protocolVersion.d());
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Random:");
        sb.append(zzp.c());
        sb.append(this.random.e(i + 2));
        sb.append(strD);
        sb.append("Session ID Length: ");
        sb.append(this.sessionId.c());
        sb.append(" bytes");
        sb.append(zzp.c());
        if (this.sessionId.c() > 0) {
            sb.append(strD);
            sb.append("Session ID: ");
            sb.append(this.sessionId);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    public aabl getProtocolVersion() {
        return this.protocolVersion;
    }

    public aabn getRandom() {
        return this.random;
    }

    public aacd getSessionId() {
        return this.sessionId;
    }

    public boolean hasSessionId() {
        return !this.sessionId.b();
    }

    public void addExtension(HelloExtension helloExtension) {
        this.extensions.b(helloExtension);
    }

    public aabf getExtensions() {
        return this.extensions;
    }

    public SupportedPointFormatsExtension getSupportedPointFormatsExtension() {
        return (SupportedPointFormatsExtension) this.extensions.d(HelloExtension.ExtensionType.EC_POINT_FORMATS);
    }

    public aaaa getClientCertificateTypeExtension() {
        return (aaaa) this.extensions.d(HelloExtension.ExtensionType.CLIENT_CERT_TYPE);
    }

    public aacb getServerCertificateTypeExtension() {
        return (aacb) this.extensions.d(HelloExtension.ExtensionType.SERVER_CERT_TYPE);
    }

    public aacf getSupportedSignatureAlgorithmsExtension() {
        return (aacf) this.extensions.d(HelloExtension.ExtensionType.SIGNATURE_ALGORITHMS);
    }

    public MaxFragmentLengthExtension getMaxFragmentLengthExtension() {
        return (MaxFragmentLengthExtension) this.extensions.d(HelloExtension.ExtensionType.MAX_FRAGMENT_LENGTH);
    }

    public aabu getRecordSizeLimitExtension() {
        return (aabu) this.extensions.d(HelloExtension.ExtensionType.RECORD_SIZE_LIMIT);
    }

    public aaby getServerNameExtension() {
        return (aaby) this.extensions.d(HelloExtension.ExtensionType.SERVER_NAME);
    }

    public aaan getConnectionIdExtension() {
        return (aaan) this.extensions.d(HelloExtension.ExtensionType.CONNECTION_ID);
    }

    public boolean hasExtendedMasterSecretExtension() {
        return this.extensions.d(HelloExtension.ExtensionType.EXTENDED_MASTER_SECRET) != null;
    }

    public boolean hasRenegotiationInfoExtension() {
        return this.extensions.d(HelloExtension.ExtensionType.RENEGOTIATION_INFO) != null;
    }
}
