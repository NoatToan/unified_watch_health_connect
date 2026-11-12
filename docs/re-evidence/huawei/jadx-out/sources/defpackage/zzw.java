package defpackage;

import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.DTLSMessage;

/* JADX INFO: loaded from: classes20.dex */
public final class zzw implements DTLSMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54850a;

    public zzw(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must not be null!");
        }
        this.f54850a = bArr;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public ContentType getContentType() {
        return ContentType.APPLICATION_DATA;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(zzp.d(i));
        }
        sb.append("Application Data: ");
        sb.append(zzp.a(this.f54850a, (char) 0, 32));
        if (i > 0) {
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    public String toString() {
        return toString(0);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public int size() {
        return this.f54850a.length;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public byte[] toByteArray() {
        return this.f54850a;
    }

    public static DTLSMessage e(byte[] bArr) {
        return new zzw(bArr);
    }

    public byte[] c() {
        return this.f54850a;
    }
}
