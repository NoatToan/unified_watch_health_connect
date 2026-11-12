package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class gi5 extends xc {
    public gi5(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        byte[] bArr = this.f38958a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) u();
        System.arraycopy(bArr, 0, bArr2, 1, length);
        oeVar.g(3, bArr2);
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f38958a.length + 1) + 1 + this.f38958a.length + 1;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }
}
