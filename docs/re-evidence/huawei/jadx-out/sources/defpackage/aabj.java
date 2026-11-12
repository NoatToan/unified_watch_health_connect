package defpackage;

import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;

/* JADX INFO: loaded from: classes20.dex */
public class aabj extends HandshakeMessage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandshakeMessage f88b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89c;
    private int e;

    protected aabj() {
    }

    public int e() {
        return this.f89c;
    }

    public void a(HandshakeMessage handshakeMessage) {
        this.f88b.setNextHandshakeMessage(handshakeMessage);
        this.f88b = handshakeMessage;
        this.e += handshakeMessage.size();
        this.f89c++;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        HandshakeMessage nextHandshakeMessage = getNextHandshakeMessage();
        if (nextHandshakeMessage == null) {
            return null;
        }
        return nextHandshakeMessage.getMessageType();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.e - 12;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        throw new RuntimeException("not supported!");
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public byte[] toByteArray() {
        zzl zzlVar = new zzl(1500);
        for (HandshakeMessage nextHandshakeMessage = getNextHandshakeMessage(); nextHandshakeMessage != null; nextHandshakeMessage = nextHandshakeMessage.getNextHandshakeMessage()) {
            nextHandshakeMessage.writeTo(zzlVar);
        }
        return zzlVar.d();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public String getImplementationTypePrefix() {
        return "Multi ";
    }
}
