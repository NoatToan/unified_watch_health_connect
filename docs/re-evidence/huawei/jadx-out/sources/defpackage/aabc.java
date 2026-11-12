package defpackage;

import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;

/* JADX INFO: loaded from: classes20.dex */
public class aabc extends HandshakeMessage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandshakeType f64b;

    protected aabc(HandshakeType handshakeType) {
        this.f64b = handshakeType;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return this.f64b;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return getRawMessage().length - 12;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        byte[] rawMessage = getRawMessage();
        return Arrays.copyOfRange(rawMessage, 12, rawMessage.length);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public String getImplementationTypePrefix() {
        return "Generic ";
    }

    public static aabc c(HandshakeType handshakeType) {
        return new aabc(handshakeType);
    }
}
