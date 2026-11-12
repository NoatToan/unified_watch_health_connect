package defpackage;

import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class m7l extends pio {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pv2 f25846b;
    public final int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;

    public m7l(pv2 pv2Var) {
        super(pv2Var);
        this.f25846b = pv2Var;
        int blockSize = pv2Var.getBlockSize();
        this.c = blockSize;
        this.d = new byte[blockSize];
        this.e = new byte[blockSize];
        this.f = new byte[blockSize];
        this.g = 0;
    }

    @Override // defpackage.pv2
    public void a(boolean z, lw3 lw3Var) throws IllegalArgumentException {
        if (!(lw3Var instanceof akh)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        akh akhVar = (akh) lw3Var;
        byte[] bArrE = vj1.e(akhVar.a());
        this.d = bArrE;
        int i = this.c;
        if (i < bArrE.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.c + " bytes.");
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - bArrE.length <= i2) {
            if (akhVar.b() != null) {
                this.f25846b.a(true, akhVar.b());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.c - i2) + " bytes.");
        }
    }

    @Override // defpackage.pio
    public byte b(byte b2) throws IllegalStateException, DataLengthException {
        int i = this.g;
        if (i == 0) {
            this.f25846b.processBlock(this.e, 0, this.f, 0);
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

    @Override // defpackage.pv2
    public String getAlgorithmName() {
        return this.f25846b.getAlgorithmName() + "/SIC";
    }

    @Override // defpackage.pv2
    public int getBlockSize() {
        return this.f25846b.getBlockSize();
    }

    @Override // defpackage.pv2
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        c(bArr, i, this.c, bArr2, i2);
        return this.c;
    }

    @Override // defpackage.pv2
    public void reset() {
        vj1.o(this.e, (byte) 0);
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        this.f25846b.reset();
        this.g = 0;
    }
}
