package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class j extends l {
    public int A;
    public int B;
    public int C;
    public byte[] y;
    public int z;

    public j(byte[] bArr) {
        super(bArr[1], bArr[2], bArr[0], bArr[3]);
        this.y = bArr;
        g();
    }

    @Override // defpackage.l, defpackage.i
    public byte[] a() {
        return this.y;
    }

    @Override // defpackage.l, defpackage.i
    public int b() {
        byte[] bArr = this.y;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public int c() {
        return this.z;
    }

    public int d() {
        return this.A;
    }

    public int e() {
        return this.B;
    }

    public int f() {
        return this.C;
    }

    public final void g() {
        byte[] bArr = this.y;
        if (bArr.length < 8) {
            return;
        }
        this.z = bArr[4] & 255;
        this.A = bArr[5] & 255;
        this.B = bArr[6] & 255;
        this.C = bArr[7] & 255;
    }
}
