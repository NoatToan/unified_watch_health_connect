package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class hi5 extends yc {
    public hi5(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        byte[] bArr = this.f40027a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) u();
        System.arraycopy(bArr, 0, bArr2, 1, length);
        keVar.g(3, bArr2);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f40027a.length + 1) + 1 + this.f40027a.length + 1;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }
}
