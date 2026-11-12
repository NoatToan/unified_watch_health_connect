package defpackage;

import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;

/* JADX INFO: loaded from: classes20.dex */
public class aacg implements ConnectionIdGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122b;

    public aacg(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("cid length must not be less than 0 bytes!");
        }
        this.f122b = i;
    }

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public boolean useConnectionId() {
        return this.f122b > 0;
    }

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public aaae createConnectionId() {
        if (!useConnectionId()) {
            return null;
        }
        byte[] bArr = new byte[this.f122b];
        aacj.e().nextBytes(bArr);
        return new aaae(bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public aaae read(zzf zzfVar) {
        if (useConnectionId()) {
            return new aaae(zzfVar.b(this.f122b));
        }
        return null;
    }
}
