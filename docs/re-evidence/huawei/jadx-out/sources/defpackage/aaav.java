package defpackage;

import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;

/* JADX INFO: loaded from: classes20.dex */
public final class aaav extends HandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f52b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53c;
    private final HandshakeType e;

    public aaav(HandshakeType handshakeType, int i, int i2, int i3, byte[] bArr) {
        this.e = handshakeType;
        this.f53c = i;
        this.f52b = Arrays.copyOf(bArr, bArr.length);
        this.f51a = i3;
        setMessageSeq(i2);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return this.e;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f53c;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getFragmentOffset() {
        return this.f51a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getFragmentLength() {
        return this.f52b.length;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public String getImplementationTypePrefix() {
        return "Fragmented ";
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        String strD = zzp.d(i);
        sb.append(strD);
        sb.append("Fragment Offset: ");
        sb.append(getFragmentOffset());
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Fragment Length: ");
        sb.append(getFragmentLength());
        sb.append(" bytes");
        sb.append(zzp.c());
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        return this.f52b;
    }
}
