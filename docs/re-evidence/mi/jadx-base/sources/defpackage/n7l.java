package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes11.dex */
public class n7l extends qio {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv2 f27624b;
    public final int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;

    public n7l(qv2 qv2Var) {
        super(qv2Var);
        this.f27624b = qv2Var;
        int blockSize = qv2Var.getBlockSize();
        this.c = blockSize;
        this.d = new byte[blockSize];
        this.e = new byte[blockSize];
        this.f = new byte[blockSize];
        this.g = 0;
    }

    @Override // defpackage.qv2
    public void a(boolean z, nw3 nw3Var) throws IllegalArgumentException {
        if (!(nw3Var instanceof ckh)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ckh ckhVar = (ckh) nw3Var;
        byte[] bArrA = xj1.a(ckhVar.a());
        this.d = bArrA;
        int i = this.c;
        if (i < bArrA.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.c + " bytes.");
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - bArrA.length <= i2) {
            if (ckhVar.b() != null) {
                this.f27624b.a(true, ckhVar.b());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.c - i2) + " bytes.");
        }
    }

    @Override // defpackage.qio
    public byte b(byte b2) throws IllegalStateException, DataLengthException {
        int i = this.g;
        if (i == 0) {
            this.f27624b.processBlock(this.e, 0, this.f, 0);
            byte[] bArr = this.f;
            int i2 = this.g;
            this.g = i2 + 1;
            return (byte) (b2 ^ bArr[i2]);
        }
        byte[] bArr2 = this.f;
        int i3 = i + 1;
        this.g = i3;
        byte b3 = (byte) (b2 ^ bArr2[i]);
        if (i3 == this.e.length) {
            this.g = 0;
            e(0);
            d();
        }
        return b3;
    }

    public final void d() {
        if (this.d.length >= this.c) {
            return;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i == bArr.length) {
                return;
            }
            if (this.e[i] != bArr[i]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i++;
        }
    }

    public final void e(int i) {
        byte b2;
        int length = this.e.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.e;
            b2 = (byte) (bArr[length] + 1);
            bArr[length] = b2;
        } while (b2 == 0);
    }

    @Override // defpackage.qv2
    public int getBlockSize() {
        return this.f27624b.getBlockSize();
    }

    @Override // defpackage.qv2
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        c(bArr, i, this.c, bArr2, i2);
        return this.c;
    }

    @Override // defpackage.qv2
    public void reset() {
        xj1.c(this.e, (byte) 0);
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        this.f27624b.reset();
        this.g = 0;
    }
}
