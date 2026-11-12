package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class k83 implements yye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f23579b;
    public int c;
    public qv2 d;
    public int e;

    public k83(qv2 qv2Var, int i) {
        this(qv2Var, i, null);
    }

    @Override // defpackage.yye
    public void a(nw3 nw3Var) {
        b();
        this.d.a(true, nw3Var);
    }

    public void b() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f23579b;
            if (i >= bArr.length) {
                this.c = 0;
                this.d.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.yye
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.d.getBlockSize();
        while (true) {
            int i2 = this.c;
            if (i2 >= blockSize) {
                this.d.processBlock(this.f23579b, 0, this.f23578a, 0);
                System.arraycopy(this.f23578a, 0, bArr, i, this.e);
                b();
                return this.e;
            }
            this.f23579b[i2] = 0;
            this.c = i2 + 1;
        }
    }

    @Override // defpackage.yye
    public int getMacSize() {
        return this.e;
    }

    @Override // defpackage.yye
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.d.getBlockSize();
        int i3 = this.c;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.f23579b, i3, i4);
            this.d.processBlock(this.f23579b, 0, this.f23578a, 0);
            this.c = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.d.processBlock(bArr, i, this.f23578a, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.f23579b, this.c, i2);
        this.c += i2;
    }

    public k83(qv2 qv2Var, int i, sv2 sv2Var) {
        if (i % 8 == 0) {
            this.d = new i83(qv2Var);
            this.e = i / 8;
            this.f23578a = new byte[qv2Var.getBlockSize()];
            this.f23579b = new byte[qv2Var.getBlockSize()];
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // defpackage.yye
    public void update(byte b2) {
        int i = this.c;
        byte[] bArr = this.f23579b;
        if (i == bArr.length) {
            this.d.processBlock(bArr, 0, this.f23578a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.f23579b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b2;
    }
}
