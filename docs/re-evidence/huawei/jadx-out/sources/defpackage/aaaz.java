package defpackage;

import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.DTLSMessage;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;

/* JADX INFO: loaded from: classes20.dex */
public class aaaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandshakeType f60b;
    private final ContentType d;

    public aaaz(ContentType contentType) {
        this(contentType, null, false);
    }

    public aaaz(HandshakeType handshakeType) {
        this(ContentType.HANDSHAKE, handshakeType, false);
    }

    public aaaz(HandshakeType handshakeType, boolean z) {
        this(ContentType.HANDSHAKE, handshakeType, z);
    }

    private aaaz(ContentType contentType, HandshakeType handshakeType, boolean z) {
        this.d = contentType;
        this.f60b = handshakeType;
        this.f59a = z;
    }

    public boolean a() {
        return this.f59a;
    }

    public boolean b(DTLSMessage dTLSMessage) {
        if (dTLSMessage.getContentType() != this.d) {
            return false;
        }
        return !(dTLSMessage instanceof HandshakeMessage) || ((HandshakeMessage) dTLSMessage).getMessageType() == this.f60b;
    }

    public String toString() {
        return b(this.d, this.f60b);
    }

    public static String d(DTLSMessage dTLSMessage) {
        if (dTLSMessage instanceof HandshakeMessage) {
            return b(dTLSMessage.getContentType(), ((HandshakeMessage) dTLSMessage).getMessageType());
        }
        return b(dTLSMessage.getContentType(), null);
    }

    private static String b(ContentType contentType, HandshakeType handshakeType) {
        if (handshakeType != null) {
            return contentType.name() + "/" + handshakeType.name();
        }
        return contentType.name();
    }
}
