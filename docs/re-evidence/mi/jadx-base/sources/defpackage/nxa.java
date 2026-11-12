package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nxa implements ck8, dpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f28538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28539b;
    public long c;

    public nxa() {
        this.f28538a = new byte[4];
        this.f28539b = 0;
    }

    @Override // defpackage.ck8
    public int d() {
        return 64;
    }

    public void e(nxa nxaVar) {
        byte[] bArr = nxaVar.f28538a;
        System.arraycopy(bArr, 0, this.f28538a, 0, bArr.length);
        this.f28539b = nxaVar.f28539b;
        this.c = nxaVar.c;
    }

    public void f() {
        long j = this.c << 3;
        byte b2 = -128;
        while (true) {
            update(b2);
            if (this.f28539b == 0) {
                h(j);
                g();
                return;
            }
            b2 = 0;
        }
    }

    public abstract void g();

    public abstract void h(long j);

    public abstract void i(byte[] bArr, int i);

    @Override // defpackage.aw6
    public void reset() {
        this.c = 0L;
        this.f28539b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f28538a;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.aw6
    public void update(byte b2) {
        byte[] bArr = this.f28538a;
        int i = this.f28539b;
        int i2 = i + 1;
        this.f28539b = i2;
        bArr[i] = b2;
        if (i2 == bArr.length) {
            i(bArr, 0);
            this.f28539b = 0;
        }
        this.c++;
    }

    public nxa(nxa nxaVar) {
        this.f28538a = new byte[4];
        e(nxaVar);
    }

    @Override // defpackage.aw6
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.f28539b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f28538a;
                int i5 = this.f28539b;
                int i6 = i5 + 1;
                this.f28539b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    i(bArr2, 0);
                    this.f28539b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i8) {
            i(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.f28538a;
            int i9 = this.f28539b;
            this.f28539b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += (long) iMax;
    }
}
