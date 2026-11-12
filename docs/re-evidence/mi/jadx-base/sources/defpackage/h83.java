package defpackage;

import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class h83 implements pv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f19793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f19794b;
    public byte[] c;
    public int d;
    public pv2 e;
    public boolean f;

    public h83(pv2 pv2Var) {
        this.e = pv2Var;
        int blockSize = pv2Var.getBlockSize();
        this.d = blockSize;
        this.f19793a = new byte[blockSize];
        this.f19794b = new byte[blockSize];
        this.c = new byte[blockSize];
    }

    @Override // defpackage.pv2
    public void a(boolean z, lw3 lw3Var) throws IllegalArgumentException {
        pv2 pv2Var;
        boolean z2 = this.f;
        this.f = z;
        if (lw3Var instanceof akh) {
            akh akhVar = (akh) lw3Var;
            byte[] bArrA = akhVar.a();
            if (bArrA.length != this.d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(bArrA, 0, this.f19793a, 0, bArrA.length);
            reset();
            if (akhVar.b() == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            } else {
                pv2Var = this.e;
                lw3Var = akhVar.b();
            }
        } else {
            reset();
            if (lw3Var == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            pv2Var = this.e;
        }
        pv2Var.a(z, lw3Var);
    }

    public final int b(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.d;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i, this.c, 0, i3);
        int iProcessBlock = this.e.processBlock(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.d; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.f19794b[i4]);
        }
        byte[] bArr3 = this.f19794b;
        this.f19794b = this.c;
        this.c = bArr3;
        return iProcessBlock;
    }

    public final int c(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        if (this.d + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < this.d; i3++) {
            byte[] bArr3 = this.f19794b;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        int iProcessBlock = this.e.processBlock(this.f19794b, 0, bArr2, i2);
        byte[] bArr4 = this.f19794b;
        System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    @Override // defpackage.pv2
    public String getAlgorithmName() {
        return this.e.getAlgorithmName() + "/CBC";
    }

    @Override // defpackage.pv2
    public int getBlockSize() {
        return this.e.getBlockSize();
    }

    @Override // defpackage.pv2
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.f ? c(bArr, i, bArr2, i2) : b(bArr, i, bArr2, i2);
    }

    @Override // defpackage.pv2
    public void reset() {
        byte[] bArr = this.f19793a;
        System.arraycopy(bArr, 0, this.f19794b, 0, bArr.length);
        vj1.o(this.c, (byte) 0);
        this.e.reset();
    }
}
