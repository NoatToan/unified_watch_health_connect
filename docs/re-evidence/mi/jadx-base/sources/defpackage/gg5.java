package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class gg5 extends pd {
    public gg5(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.pd, defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(24, u());
    }

    @Override // defpackage.pd, defpackage.re
    public int i() {
        int length = u().length;
        return yio.a(length) + 1 + length;
    }

    public final byte[] u() {
        byte[] bArr = this.f30276a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!q()) {
            byte[] bArr2 = this.f30276a;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(olo.e("0000Z"), 0, bArr3, this.f30276a.length - 1, 5);
            return bArr3;
        }
        if (!r()) {
            byte[] bArr4 = this.f30276a;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(olo.e("00Z"), 0, bArr5, this.f30276a.length - 1, 3);
            return bArr5;
        }
        if (!o()) {
            return this.f30276a;
        }
        int length = this.f30276a.length - 2;
        while (length > 0 && this.f30276a[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.f30276a;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i);
        bArr8[i] = 90;
        return bArr8;
    }
}
