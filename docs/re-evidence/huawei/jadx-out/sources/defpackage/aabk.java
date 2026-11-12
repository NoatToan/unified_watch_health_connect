package defpackage;

import org.eclipse.californium.scandium.dtls.NodeConnectionIdGenerator;

/* JADX INFO: loaded from: classes20.dex */
public class aabk implements NodeConnectionIdGenerator {
    private final int d;
    private final int e;

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public boolean useConnectionId() {
        return true;
    }

    public aabk(int i, int i2) {
        if (i2 < 2) {
            throw new IllegalArgumentException("cid length must be at least 2 bytes!");
        }
        this.e = i;
        this.d = i2;
    }

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public aaae createConnectionId() {
        byte[] bArr = new byte[this.d];
        aacj.e().nextBytes(bArr);
        bArr[0] = (byte) this.e;
        return new aaae(bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.ConnectionIdGenerator
    public aaae read(zzf zzfVar) {
        return new aaae(zzfVar.b(this.d));
    }

    @Override // org.eclipse.californium.scandium.dtls.NodeConnectionIdGenerator
    public int getNodeId() {
        return this.e;
    }

    @Override // org.eclipse.californium.scandium.dtls.NodeConnectionIdGenerator
    public int getNodeId(aaae aaaeVar) {
        return aaaeVar.d()[0] & 255;
    }
}
