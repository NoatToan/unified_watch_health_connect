package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class j83 implements zye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22516b;
    public int c;
    public pv2 d;
    public int e;

    public j83(pv2 pv2Var, int i) {
        this(pv2Var, i, null);
    }

    @Override // defpackage.zye
    public void a(lw3 lw3Var) {
        reset();
        this.d.a(true, lw3Var);
    }

    @Override // defpackage.zye
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.d.getBlockSize();
        while (true) {
            int i2 = this.c;
            if (i2 >= blockSize) {
                this.d.processBlock(this.f22516b, 0, this.f22515a, 0);
                System.arraycopy(this.f22515a, 0, bArr, i, this.e);
                reset();
                return this.e;
            }
            this.f22516b[i2] = 0;
            this.c = i2 + 1;
        }
    }

    @Override // defpackage.zye
    public String getAlgorithmName() {
        return this.d.getAlgorithmName();
    }

    @Override // defpackage.zye
    public int getMacSize() {
        return this.e;
    }

    @Override // defpackage.zye
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f22516b;
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

    @Override // defpackage.zye
    public void update(byte b2) {
        int i = this.c;
        byte[] bArr = this.f22516b;
        if (i == bArr.length) {
            this.d.processBlock(bArr, 0, this.f22515a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.f22516b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b2;
    }

    public j83(pv2 pv2Var, int i, rv2 rv2Var) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.d = new h83(pv2Var);
        this.e = i / 8;
        this.f22515a = new byte[pv2Var.getBlockSize()];
        this.f22516b = new byte[pv2Var.getBlockSize()];
        this.c = 0;
    }

    @Override // defpackage.zye
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.d.getBlockSize();
        int i3 = this.c;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.f22516b, i3, i4);
            this.d.processBlock(this.f22516b, 0, this.f22515a, 0);
            this.c = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.d.processBlock(bArr, i, this.f22515a, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.f22516b, this.c, i2);
        this.c += i2;
    }
}
