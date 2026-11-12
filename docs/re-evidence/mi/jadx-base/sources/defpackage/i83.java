package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes11.dex */
public class i83 implements qv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f20877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f20878b;
    public byte[] c;
    public int d;
    public qv2 e;
    public boolean f;

    public i83(qv2 qv2Var) {
        this.e = qv2Var;
        int blockSize = qv2Var.getBlockSize();
        this.d = blockSize;
        this.f20877a = new byte[blockSize];
        this.f20878b = new byte[blockSize];
        this.c = new byte[blockSize];
    }

    @Override // defpackage.qv2
    public void a(boolean z, nw3 nw3Var) throws IllegalArgumentException {
        boolean z2 = this.f;
        this.f = z;
        if (!(nw3Var instanceof ckh)) {
            reset();
            if (nw3Var != null) {
                this.e.a(z, nw3Var);
                return;
            } else {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        ckh ckhVar = (ckh) nw3Var;
        byte[] bArrA = ckhVar.a();
        if (bArrA.length != this.d) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(bArrA, 0, this.f20877a, 0, bArrA.length);
        reset();
        if (ckhVar.b() != null) {
            this.e.a(z, ckhVar.b());
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
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
            bArr2[i5] = (byte) (bArr2[i5] ^ this.f20878b[i4]);
        }
        byte[] bArr3 = this.f20878b;
        this.f20878b = this.c;
        this.c = bArr3;
        return iProcessBlock;
    }

    public final int c(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        if (this.d + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < this.d; i3++) {
            byte[] bArr3 = this.f20878b;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        int iProcessBlock = this.e.processBlock(this.f20878b, 0, bArr2, i2);
        byte[] bArr4 = this.f20878b;
        System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    @Override // defpackage.qv2
    public int getBlockSize() {
        return this.e.getBlockSize();
    }

    @Override // defpackage.qv2
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.f ? c(bArr, i, bArr2, i2) : b(bArr, i, bArr2, i2);
    }

    @Override // defpackage.qv2
    public void reset() {
        byte[] bArr = this.f20877a;
        System.arraycopy(bArr, 0, this.f20878b, 0, bArr.length);
        xj1.c(this.c, (byte) 0);
        this.e.reset();
    }
}
